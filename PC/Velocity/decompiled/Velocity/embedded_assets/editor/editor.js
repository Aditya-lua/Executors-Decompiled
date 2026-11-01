// Monaco host. Owns one editor instance and one model per open tab; the C# side
// drives it through the functions on window.host and gets notified back via
// chrome.webview.postMessage.

// Monaco 0.56 resolves its own worker URLs through require.toUrl, so no
// MonacoEnvironment.getWorkerUrl override — defining one breaks it. The workers
// must be same-origin with this page, hence the single virtual host for both.
require.config({ paths: { vs: 'https://scripteditor.assets/monaco/vs' } });

var editor = null;
var models = Object.create(null);   // tabId -> { model, viewState }
var activeTabId = null;
var suppressChange = false;

function send(message) {
    if (window.chrome && window.chrome.webview) {
        window.chrome.webview.postMessage(JSON.stringify(message));
    }
}

require(['vs/editor/editor.main'], function () {

    monaco.editor.defineTheme('velocity', {
        base: 'vs-dark',
        inherit: true,
        // Lets the language server's semantic tokens drive colour. Without it only the
        // regex grammar applies, which can see keywords and strings but has no idea
        // which identifiers are functions, properties or parameters.
        semanticHighlighting: true,
        rules: [
            { token: '', foreground: 'C8C8D4', background: '141419' },
            { token: 'comment', foreground: '4A4A5C', fontStyle: 'italic' },
            { token: 'keyword', foreground: 'C4785C' },
            { token: 'string', foreground: '8AA872' },
            { token: 'number', foreground: 'C9A26D' },
            { token: 'type', foreground: '6E9CB8' },
            { token: 'function', foreground: 'B0A0D0' },
            { token: 'variable', foreground: 'C8C8D4' },
            { token: 'delimiter', foreground: '7A7A8C' },

            // Semantic token types, named as luau-lsp reports them.
            { token: 'method', foreground: 'B0A0D0' },
            { token: 'property', foreground: '8FB0C4' },
            { token: 'parameter', foreground: 'C0A78F' },
            { token: 'class', foreground: '6E9CB8' },
            { token: 'namespace', foreground: '7FA8A8' },
            { token: 'event', foreground: 'D09A6A' },
            { token: 'enum', foreground: '6E9CB8' },
            { token: 'enumMember', foreground: 'A8C4D4' },
            { token: 'variable.defaultLibrary', foreground: '9A93C4' },
            { token: 'function.defaultLibrary', foreground: 'B0A0D0' }
        ],
        colors: {
            'editor.background': '#141419',
            'editor.foreground': '#C8C8D4',
            'editorLineNumber.foreground': '#3C3C4D',
            'editorLineNumber.activeForeground': '#7A7A8C',
            'editorCursor.foreground': '#C8C8D4',
            'editor.lineHighlightBackground': '#17171F',
            'editor.selectionBackground': '#2A2A35',
            'editor.inactiveSelectionBackground': '#20202A',
            'editorIndentGuide.background1': '#20202A',
            'editorIndentGuide.activeBackground1': '#2A2A35',
            'editorWidget.background': '#171720',
            'editorWidget.border': '#2A2A35',
            'editorSuggestWidget.background': '#171720',
            'editorSuggestWidget.border': '#2A2A35',
            'editorSuggestWidget.selectedBackground': '#2A2A35',
            'editorGutter.background': '#141419',
            'scrollbarSlider.background': '#2A2A3560',
            'scrollbarSlider.hoverBackground': '#2A2A3590',
            'scrollbarSlider.activeBackground': '#3C3C4D',
            'minimap.background': '#141419',
            'editorOverviewRuler.border': '#00000000'
        }
    });

    editor = monaco.editor.create(document.getElementById('container'), {
        theme: 'velocity',
        model: null,
        automaticLayout: true,
        fontFamily: 'Cascadia Code, Consolas, monospace',
        fontSize: 13,
        lineHeight: 20,
        tabSize: 4,
        insertSpaces: true,
        renderWhitespace: 'selection',
        smoothScrolling: true,
        cursorBlinking: 'smooth',
        minimap: { enabled: true, renderCharacters: false, maxColumn: 80 },
        scrollBeyondLastLine: false,
        scrollbar: { verticalScrollbarSize: 10, horizontalScrollbarSize: 10, useShadows: false },
        padding: { top: 8 },
        bracketPairColorization: { enabled: true },
        guides: { indentation: true, bracketPairs: false },
        contextmenu: true,
        mouseWheelZoom: true,
        // Monaco suppresses suggestions inside strings by default, which hid the
        // literal arguments the language server offers — Drawing.new("…") is the
        // obvious one. Comments stay off; there is nothing useful to suggest there.
        quickSuggestions: { other: true, comments: false, strings: true },
        // Identifiers scraped from the open file are noise next to a real language
        // server, and they were crowding out its results inside string literals.
        wordBasedSuggestions: 'off',
        'semanticHighlighting.enabled': true
    });

    editor.onDidChangeModelContent(function () {
        // The server needs every edit, including ones the host made itself.
        var current = editor.getModel();
        if (current) Lsp.didChange(current);

        if (suppressChange || activeTabId === null) return;
        send({ type: 'contentChanged', tabId: activeTabId });
    });

    // Opening a quote should offer the string literals a function accepts, but Monaco
    // auto-closes the pair and that path doesn't count as a trigger character, so the
    // suggest widget never opens on its own. Ask for it directly. If the server has
    // nothing to offer for this string, Monaco simply shows no widget.
    editor.onDidType(function (text) {
        if (text !== '"' && text !== "'") return;

        // Only in argument position. Opening a quote anywhere else is an ordinary
        // string, where an explicit trigger just yields a "No suggestions." box.
        var pos = editor.getPosition();
        var model = editor.getModel();
        if (!pos || !model) return;

        var before = model.getValueInRange({
            startLineNumber: pos.lineNumber, startColumn: 1,
            endLineNumber: pos.lineNumber, endColumn: pos.column - 1
        }).replace(/\s+$/, '');

        if (!/[(,]$/.test(before)) return;

        // Wait for the edit to reach the server first. Asking immediately queries it
        // against a document that predates the quote, which returns nothing.
        setTimeout(function () {
            editor.trigger('velocity', 'editor.action.triggerSuggest', {});
        }, 150);
    });

    editor.onDidChangeCursorPosition(function (e) {
        send({
            type: 'cursorMoved',
            line: e.position.lineNumber,
            column: e.position.column
        });
    });

    // Ctrl+S is ours, not the browser's.
    editor.addCommand(monaco.KeyMod.CtrlCmd | monaco.KeyCode.KeyS, function () {
        send({ type: 'saveRequested', tabId: activeTabId });
    });

    // While the editor has focus it swallows keystrokes, so the app's shortcuts have to
    // be registered here as well and forwarded to the host.
    function forward(keybinding, name) {
        editor.addCommand(keybinding, function () {
            send({ type: 'command', name: name });
        });
    }

    forward(monaco.KeyMod.CtrlCmd | monaco.KeyCode.KeyO, 'openFile');
    forward(monaco.KeyMod.CtrlCmd | monaco.KeyCode.KeyN, 'newTab');
    forward(monaco.KeyMod.CtrlCmd | monaco.KeyCode.KeyW, 'closeTab');
    forward(monaco.KeyMod.CtrlCmd | monaco.KeyMod.Shift | monaco.KeyCode.KeyS, 'saveAs');
    forward(monaco.KeyMod.CtrlCmd | monaco.KeyCode.Tab, 'nextTab');

    // Monaco's KeyCode enum has no Backquote member in this build, so match on the DOM
    // event's physical key instead of a Monaco keybinding.
    editor.onKeyDown(function (e) {
        if (!e.ctrlKey || !e.browserEvent || e.browserEvent.code !== 'Backquote') return;

        e.preventDefault();
        e.stopPropagation();
        send({ type: 'command', name: 'toggleConsole' });
    });

    Ai.register();

    send({ type: 'ready' });
});

// Payloads from the language server arrive as host messages rather than through
// window.host, since they are relayed rather than invoked.
if (window.chrome && window.chrome.webview) {
    window.chrome.webview.addEventListener('message', function (event) {
        var message = event.data;
        if (typeof message === 'string') {
            try { message = JSON.parse(message); } catch (e) { return; }
        }
        if (message && message.type === 'lsp') Lsp.handle(message.payload);
        else if (message && message.type === 'inlineCompletion') Ai.resolve(message.id, message.items);
    });
}

// Inline suggestions. Monaco renders whatever the provider returns as grey ghost text;
// Tab accepts it.
//
// Requests are shaped as LSP textDocument/inlineCompletion — the same method GitHub's
// Copilot server implements — so this client is not tied to Velocity's own server. The
// host decides what answers; swapping the backend does not touch this file.
var Ai = (function () {
    var nextId = 1;
    var pending = Object.create(null);
    var enabled = false;
    var debounceMs = 500;

    function resolve(id, items) {
        var entry = pending[id];
        if (!entry) return;
        delete pending[id];
        entry(items || []);
    }

    function requestCompletion(model, position, prefix, suffix, token) {
        return new Promise(function (done) {
            var id = nextId++;
            pending[id] = done;

            // Monaco cancels as soon as the caret moves; stop waiting and let the host's
            // own supersession drop the request.
            if (token) {
                token.onCancellationRequested(function () {
                    if (pending[id]) { delete pending[id]; done([]); }
                });
            }

            // LSP inlineCompletion params, plus the document text. A server in another
            // process would track content through didOpen/didChange instead, but ours is
            // in-process and sending it directly avoids mirroring state for no gain.
            send({
                type: 'inlineCompletion',
                id: id,
                params: {
                    textDocument: { uri: model.uri.toString() },
                    position: { line: position.lineNumber - 1, character: position.column - 1 },
                    context: { triggerKind: 2 }   // Automatic
                },
                prefix: prefix,
                suffix: suffix
            });

            setTimeout(function () {
                if (pending[id]) { delete pending[id]; done([]); }
            }, 20000);
        });
    }

    function wait(ms, token) {
        return new Promise(function (done) {
            var timer = setTimeout(done, ms);
            if (token) token.onCancellationRequested(function () { clearTimeout(timer); done(); });
        });
    }

    function register() {
        monaco.languages.registerInlineCompletionsProvider('lua', {
            provideInlineCompletions: function (model, position, context, token) {
                if (!enabled) return { items: [] };

                // Suggesting mid-word fights the normal completion popup, which is the
                // better answer when the user is partway through an identifier.
                var line = model.getLineContent(position.lineNumber);
                var charBefore = line.charAt(position.column - 2);
                if (charBefore && /[A-Za-z0-9_]/.test(charBefore) && position.column > 1) {
                    var word = model.getWordUntilPosition(position);
                    if (word.word.length > 0 && word.word.length < 3) return { items: [] };
                }

                // Every request costs the user money, so wait for a real pause in typing.
                return wait(debounceMs, token).then(function () {
                    if (token.isCancellationRequested) return { items: [] };

                    var full = model.getValue();
                    var offset = model.getOffsetAt(position);

                    return requestCompletion(model, position,
                        full.slice(0, offset), full.slice(offset), token)
                        .then(function (items) {
                            if (!items.length || token.isCancellationRequested) return { items: [] };

                            // The item's range is the span its text replaces. Copilot
                            // returns the whole line with a range covering it, so ignoring
                            // this and inserting at the caret duplicates what was typed.
                            // Only fall back to an empty range at the caret when a provider
                            // sends none, meaning a pure insertion.
                            var caret = new monaco.Range(
                                position.lineNumber, position.column,
                                position.lineNumber, position.column);

                            return {
                                items: items
                                    .filter(function (item) { return item.insertText; })
                                    .map(function (item) {
                                        var r = item.range;
                                        return {
                                            insertText: item.insertText,
                                            range: r ? new monaco.Range(
                                                r.start.line + 1, r.start.character + 1,
                                                r.end.line + 1, r.end.character + 1) : caret
                                        };
                                    })
                            };
                        });
                });
            },
            freeInlineCompletions: function () { }
        });
    }

    return {
        resolve: resolve,
        register: register,
        configure: function (on, delay) {
            enabled = !!on;
            if (typeof delay === 'number') debounceMs = delay;
        }
    };
})();

window.host = {
    setLspAvailable: function (available) {
        if (available) Lsp.start(); else Lsp.stop();
    },

    setAiCompletion: function (enabled, debounceMs) {
        Ai.configure(enabled, debounceMs);
    },

    openTab: function (tabId, language, content) {
        if (models[tabId]) return;
        // A per-tab file URI, so the server can key documents by something stable.
        var uri = monaco.Uri.parse('file:///velocity/' + tabId + '.luau');
        var model = monaco.editor.createModel(content || '', language || 'lua', uri);
        models[tabId] = { model: model, viewState: null };
        Lsp.didOpen(model);
    },

    activateTab: function (tabId) {
        if (activeTabId !== null && models[activeTabId] && editor.getModel() === models[activeTabId].model) {
            models[activeTabId].viewState = editor.saveViewState();
        }

        var entry = models[tabId];
        if (!entry) {
            activeTabId = null;
            editor.setModel(null);
            document.getElementById('container').classList.add('idle');
            return;
        }

        activeTabId = tabId;
        document.getElementById('container').classList.remove('idle');
        editor.setModel(entry.model);
        if (entry.viewState) editor.restoreViewState(entry.viewState);
        editor.focus();

        // Switching models doesn't move the caret, so report its position for the status bar.
        var pos = editor.getPosition();
        if (pos) send({ type: 'cursorMoved', line: pos.lineNumber, column: pos.column });
    },

    closeTab: function (tabId) {
        var entry = models[tabId];
        if (!entry) return;
        if (activeTabId === tabId) {
            activeTabId = null;
            editor.setModel(null);
            document.getElementById('container').classList.add('idle');
        }
        Lsp.didClose(entry.model);
        entry.model.dispose();
        delete models[tabId];
    },

    setContent: function (tabId, content) {
        var entry = models[tabId];
        if (!entry) return;
        suppressChange = true;
        entry.model.setValue(content);
        suppressChange = false;
    },

    getContent: function (tabId) {
        var entry = models[tabId];
        return entry ? entry.model.getValue() : '';
    },

    setLanguage: function (tabId, language) {
        var entry = models[tabId];
        if (entry) monaco.editor.setModelLanguage(entry.model, language);
    },

    focusEditor: function () {
        if (editor) editor.focus();
    },

    applyOptions: function (options) {
        if (!editor || !options) return;

        editor.updateOptions({
            fontFamily: options.fontFamily,
            fontSize: options.fontSize,
            fontLigatures: options.fontLigatures,
            wordWrap: options.wordWrap ? 'on' : 'off',
            minimap: { enabled: options.showMinimap, renderCharacters: false, maxColumn: 80 },
            lineNumbers: options.showLineNumbers ? 'on' : 'off',
            renderWhitespace: options.showWhitespace ? 'all' : 'none',
            smoothScrolling: options.smoothScrolling,
            bracketPairColorization: { enabled: options.bracketColorization },
            autoClosingBrackets: options.autoClosingBrackets ? 'languageDefined' : 'never',
            autoClosingQuotes: options.autoClosingBrackets ? 'languageDefined' : 'never',
            tabSize: options.tabSize
        });

        // tabSize is a model option, so every open document needs it too.
        for (var id in models) {
            models[id].model.updateOptions({ tabSize: options.tabSize });
        }
    }
};
