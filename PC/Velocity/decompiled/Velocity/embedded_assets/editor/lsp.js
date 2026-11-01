// Thin LSP client for luau-lsp.
//
// Monaco has no LSP support of its own, so this maps its provider callbacks onto
// JSON-RPC requests and the server's diagnostics onto model markers. Deliberately
// hand-rolled rather than monaco-languageclient, which needs the ESM build plus the
// vscode-api shims and would mean replacing the vendored AMD Monaco.
//
// Transport is the host: C# owns the process and the Content-Length framing, and
// passes complete payloads through in both directions.

var Lsp = (function () {
    var nextId = 1;
    var pending = Object.create(null);   // request id -> { resolve, reject }
    var versions = Object.create(null);  // uri -> document version
    var initialized = false;
    var available = false;
    var semanticLegend = null;   // filled from the server's advertised capabilities
    var queue = [];                      // payloads held until initialize completes

    function post(payload) {
        if (window.chrome && window.chrome.webview) {
            window.chrome.webview.postMessage(JSON.stringify({ type: 'lsp', payload: payload }));
        }
    }

    function notify(method, params) {
        if (!available) return;
        var payload = { jsonrpc: '2.0', method: method, params: params };
        if (!initialized && method !== 'initialize') { queue.push(payload); return; }
        post(payload);
    }

    function request(method, params) {
        if (!available) return Promise.resolve(null);

        var id = nextId++;
        var payload = { jsonrpc: '2.0', id: id, method: method, params: params };

        return new Promise(function (resolve) {
            pending[id] = resolve;

            if (!initialized && method !== 'initialize') { queue.push(payload); return; }
            post(payload);

            // Never leave a Monaco provider hanging on a server that stopped answering.
            setTimeout(function () {
                if (pending[id]) { delete pending[id]; resolve(null); }
            }, 5000);
        });
    }

    // luau-lsp keys documents by URI; models are keyed by tab id, so map one to the other.
    function uriOf(model) {
        return model.uri.toString();
    }

    function flushQueue() {
        var held = queue;
        queue = [];
        held.forEach(post);
    }

    // ===== Incoming =====

    function handle(message) {
        if (message.id !== undefined && message.method === undefined) {
            var resolve = pending[message.id];
            if (!resolve) return;
            delete pending[message.id];
            resolve(message.error ? null : message.result);
            return;
        }

        if (message.method === 'textDocument/publishDiagnostics') {
            applyDiagnostics(message.params);
            return;
        }

        // Requests from the server. Refuse the ones we don't implement rather than
        // leaving it waiting — it blocks on registration replies.
        if (message.id !== undefined && message.method !== undefined) {
            post({
                jsonrpc: '2.0',
                id: message.id,
                result: message.method === 'client/registerCapability' ? null : null
            });
        }
    }

    var severityMap = {
        1: 8,   // Error   -> MarkerSeverity.Error
        2: 4,   // Warning -> MarkerSeverity.Warning
        3: 2,   // Info    -> MarkerSeverity.Info
        4: 1    // Hint    -> MarkerSeverity.Hint
    };

    function applyDiagnostics(params) {
        if (!params || !params.uri) return;

        var model = monaco.editor.getModels().filter(function (m) {
            return m.uri.toString() === params.uri;
        })[0];
        if (!model) return;

        var markers = (params.diagnostics || []).map(function (d) {
            return {
                severity: severityMap[d.severity] || 4,
                message: d.message,
                source: d.source || 'luau',
                startLineNumber: d.range.start.line + 1,
                startColumn: d.range.start.character + 1,
                endLineNumber: d.range.end.line + 1,
                endColumn: d.range.end.character + 1
            };
        });

        monaco.editor.setModelMarkers(model, 'luau-lsp', markers);
    }

    // ===== Conversions =====

    function position(pos) {
        return { line: pos.lineNumber - 1, character: pos.column - 1 };
    }

    function range(r) {
        if (!r) return undefined;
        return new monaco.Range(
            r.start.line + 1, r.start.character + 1,
            r.end.line + 1, r.end.character + 1);
    }

    function markdown(value) {
        if (!value) return undefined;
        if (typeof value === 'string') return { value: value };
        if (value.kind) return { value: value.value, isTrusted: false };
        return { value: String(value.value || '') };
    }

    // ===== Providers =====

    function registerProviders() {
        monaco.languages.registerCompletionItemProvider('lua', {
            triggerCharacters: ['.', ':', '"', "'", '/'],
            provideCompletionItems: function (model, pos) {
                return request('textDocument/completion', {
                    textDocument: { uri: uriOf(model) },
                    position: position(pos)
                }).then(function (result) {
                    if (!result) return { suggestions: [] };

                    var items = Array.isArray(result) ? result : (result.items || []);
                    var word = model.getWordUntilPosition(pos);
                    var fallback = new monaco.Range(
                        pos.lineNumber, word.startColumn, pos.lineNumber, word.endColumn);

                    return {
                        suggestions: items.map(function (item) {
                            var edit = item.textEdit;
                            return {
                                label: item.label,
                                kind: (item.kind || 1) - 1,   // LSP kinds are 1-based, Monaco's 0-based
                                detail: item.detail,
                                documentation: markdown(item.documentation),
                                insertText: (edit && edit.newText) || item.insertText || item.label,
                                insertTextRules: item.insertTextFormat === 2
                                    ? monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet
                                    : undefined,
                                range: (edit && range(edit.range)) || fallback,
                                sortText: item.sortText,
                                filterText: item.filterText,
                                commitCharacters: item.commitCharacters
                            };
                        }),
                        incomplete: !!result.isIncomplete
                    };
                });
            }
        });

        monaco.languages.registerHoverProvider('lua', {
            provideHover: function (model, pos) {
                return request('textDocument/hover', {
                    textDocument: { uri: uriOf(model) },
                    position: position(pos)
                }).then(function (result) {
                    if (!result || !result.contents) return null;

                    var contents = Array.isArray(result.contents) ? result.contents : [result.contents];
                    return {
                        range: range(result.range),
                        contents: contents.map(markdown).filter(Boolean)
                    };
                });
            }
        });

        monaco.languages.registerSignatureHelpProvider('lua', {
            signatureHelpTriggerCharacters: ['(', ','],
            signatureHelpRetriggerCharacters: [','],
            provideSignatureHelp: function (model, pos) {
                return request('textDocument/signatureHelp', {
                    textDocument: { uri: uriOf(model) },
                    position: position(pos)
                }).then(function (result) {
                    if (!result || !result.signatures || !result.signatures.length) return null;

                    return {
                        value: {
                            signatures: result.signatures.map(function (sig) {
                                return {
                                    label: sig.label,
                                    documentation: markdown(sig.documentation),
                                    parameters: (sig.parameters || []).map(function (p) {
                                        return {
                                            label: p.label,
                                            documentation: markdown(p.documentation)
                                        };
                                    })
                                };
                            }),
                            activeSignature: result.activeSignature || 0,
                            activeParameter: result.activeParameter || 0
                        },
                        dispose: function () { }
                    };
                });
            }
        });

        // Semantic tokens are what actually colour functions, properties, parameters and
        // types. Monaco's Lua grammar is a regex tokenizer: it can find keywords and
        // strings, but it cannot know that `getgenv` is a function or `Radius` a property.
        // The legend comes from the server so token indices are never hardcoded.
        if (semanticLegend) {
            monaco.languages.registerDocumentSemanticTokensProvider('lua', {
                getLegend: function () { return semanticLegend; },
                provideDocumentSemanticTokens: function (model) {
                    return request('textDocument/semanticTokens/full', {
                        textDocument: { uri: uriOf(model) }
                    }).then(function (result) {
                        if (!result || !result.data) return null;
                        return { data: new Uint32Array(result.data), resultId: result.resultId };
                    });
                },
                releaseDocumentSemanticTokens: function () { }
            });
        }

        monaco.languages.registerDefinitionProvider('lua', {
            provideDefinition: function (model, pos) {
                return request('textDocument/definition', {
                    textDocument: { uri: uriOf(model) },
                    position: position(pos)
                }).then(function (result) {
                    if (!result) return null;

                    var locations = Array.isArray(result) ? result : [result];
                    return locations.map(function (loc) {
                        var target = loc.uri || loc.targetUri;
                        var r = loc.range || loc.targetSelectionRange;
                        // Only jump within documents Monaco actually has open.
                        var model2 = monaco.editor.getModels().filter(function (m) {
                            return m.uri.toString() === target;
                        })[0];
                        if (!model2) return null;
                        return { uri: model2.uri, range: range(r) };
                    }).filter(Boolean);
                });
            }
        });
    }

    // ===== Document sync =====

    function didOpen(model) {
        var uri = uriOf(model);
        versions[uri] = 1;
        notify('textDocument/didOpen', {
            textDocument: {
                uri: uri,
                languageId: 'luau',
                version: 1,
                text: model.getValue()
            }
        });
    }

    function didChange(model) {
        var uri = uriOf(model);
        if (!versions[uri]) { didOpen(model); return; }

        versions[uri]++;
        // Full-document sync: simpler than incremental, and these files are small.
        notify('textDocument/didChange', {
            textDocument: { uri: uri, version: versions[uri] },
            contentChanges: [{ text: model.getValue() }]
        });
    }

    function didClose(model) {
        var uri = uriOf(model);
        if (!versions[uri]) return;
        delete versions[uri];
        notify('textDocument/didClose', { textDocument: { uri: uri } });
    }

    // ===== Lifecycle =====

    function start() {
        available = true;

        request('initialize', {
            processId: null,
            clientInfo: { name: 'Velocity', version: '1.0' },
            rootUri: null,
            workspaceFolders: null,
            capabilities: {
                textDocument: {
                    synchronization: { dynamicRegistration: false, didSave: false },
                    completion: {
                        dynamicRegistration: false,
                        completionItem: {
                            snippetSupport: true,
                            documentationFormat: ['markdown', 'plaintext'],
                            commitCharactersSupport: true
                        },
                        contextSupport: false
                    },
                    hover: {
                        dynamicRegistration: false,
                        contentFormat: ['markdown', 'plaintext']
                    },
                    signatureHelp: {
                        dynamicRegistration: false,
                        signatureInformation: {
                            documentationFormat: ['markdown', 'plaintext']
                        }
                    },
                    definition: { dynamicRegistration: false },
                    publishDiagnostics: { relatedInformation: false },
                    semanticTokens: {
                        dynamicRegistration: false,
                        requests: { full: true, range: false },
                        formats: ['relative'],
                        tokenTypes: [],
                        tokenModifiers: []
                    }
                },
                workspace: { configuration: false, workspaceFolders: false }
            }
        }).then(function (result) {
            if (!result) {
                available = false;
                return;
            }

            initialized = true;

            var semantic = result.capabilities && result.capabilities.semanticTokensProvider;
            if (semantic && semantic.legend && semantic.legend.tokenTypes) {
                semanticLegend = {
                    tokenTypes: semantic.legend.tokenTypes,
                    tokenModifiers: semantic.legend.tokenModifiers || []
                };
            }

            post({ jsonrpc: '2.0', method: 'initialized', params: {} });
            registerProviders();
            flushQueue();

            // Anything already open predates the handshake, so announce it now.
            monaco.editor.getModels().forEach(didOpen);
        });
    }

    function stop() {
        available = false;
        initialized = false;
        monaco.editor.getModels().forEach(function (model) {
            monaco.editor.setModelMarkers(model, 'luau-lsp', []);
        });
    }

    return {
        start: start,
        stop: stop,
        handle: handle,
        didOpen: didOpen,
        didChange: didChange,
        didClose: didClose,
        isAvailable: function () { return available && initialized; }
    };
})();
