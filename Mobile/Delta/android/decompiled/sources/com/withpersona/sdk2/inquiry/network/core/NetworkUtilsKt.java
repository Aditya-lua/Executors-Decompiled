package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import jv.x;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.j;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;

    @NotNull
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1, reason: invalid class name */
    @pt.f(c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt", f = "NetworkUtils.kt", l = {179}, m = "enqueueWithRetryWhen")
    public static final class AnonymousClass1<T> extends pt.d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(nt.b<? super AnonymousClass1> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
        }
    }

    @Nullable
    public static final <T> Object enqueueRetriableRequestWithRetry(@NotNull Function1<? super nt.b<? super x<T>>, ? extends Object> function1, @NotNull nt.b<? super NetworkCallResult<T>> bVar) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((InternalErrorInfo.NetworkErrorInfo) obj).isRecoverable());
            }
        }, bVar);
    }

    @Nullable
    public static final <T> Object enqueueVerificationRequestWithRetry(@NotNull Function1<? super nt.b<? super x<T>>, ? extends Object> function1, @NotNull nt.b<? super NetworkCallResult<T>> bVar) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NetworkUtilsKt.enqueueVerificationRequestWithRetry$lambda$3((InternalErrorInfo.NetworkErrorInfo) obj));
            }
        }, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueueVerificationRequestWithRetry$lambda$3(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        int code = networkErrorInfo.getCode();
        return (code == 0 || code == 409 || code == 413 || code == 422) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:21:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object enqueueWithRetryWhen(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super nt.b<? super jv.x<T>>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo, java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull nt.b<? super com.withpersona.sdk2.inquiry.network.core.NetworkCallResult<T>> r8) {
        /*
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = new com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r7
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            jt.o.b(r8)
            r5 = r0
            r0 = r7
            r7 = r2
            r2 = r5
            goto L69
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            jt.o.b(r8)
            r8 = 0
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r0
        L4c:
            r0 = r8
            r8 = r5
            r4 = 3
            if (r6 >= r4) goto L90
            r2.L$0 = r7
            r2.L$1 = r8
            java.lang.Object r0 = pt.l.a(r0)
            r2.L$2 = r0
            r2.I$0 = r6
            r2.label = r3
            java.lang.Object r0 = r7.invoke(r2)
            if (r0 != r1) goto L66
            return r1
        L66:
            r5 = r0
            r0 = r8
            r8 = r5
        L69:
            jv.x r8 = (jv.x) r8
            boolean r4 = r8.g()
            if (r4 == 0) goto L7b
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success
            java.lang.Object r7 = r8.a()
            r6.<init>(r7)
            return r6
        L7b:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r8 = toErrorInfo(r8)
            java.lang.Object r4 = r0.invoke(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L8d
            r0 = r8
            goto L90
        L8d:
            int r6 = r6 + r3
            r5 = r0
            goto L4c
        L90:
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure
            if (r0 == 0) goto L98
            r6.<init>(r0)
            return r6
        L98:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueWithRetryWhen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, nt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onFailure(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super InternalErrorInfo.NetworkErrorInfo, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            function1.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onSuccess(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super T, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            function1.invoke((Object) ((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x017a  */
    /* JADX WARN: Code duplicated, block: B:114:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    @NotNull
    public static final InternalErrorInfo.NetworkErrorInfo toErrorInfo(@NotNull x<?> xVar) {
        ErrorResponse errorResponse;
        List<ErrorResponse.Error> errors;
        List<ErrorResponse.Error> errors2;
        List<ErrorResponse.Error> errors3;
        List<ErrorResponse.Error> errors4;
        List<ErrorResponse.Error> errors5;
        List<ErrorResponse.Error> errors6;
        List<ErrorResponse.Error> errors7;
        List<ErrorResponse.Error> errors8;
        ErrorResponse.Error error;
        xu.g bodySource;
        String strH = xVar.h();
        ErrorResponse.Error rateLimitExceededError = null;
        String strH2 = (strH == null || StringsKt.p0(strH)) ? null : xVar.h();
        int iB = xVar.b();
        boolean z10 = false;
        if (iB == 429) {
            rateLimitExceededError = new ErrorResponse.Error.RateLimitExceededError("Quota exceeded", "");
        } else {
            HttpStatusCode httpStatusCode = HttpStatusCode.INSTANCE;
            IntRange client_errors = httpStatusCode.getCLIENT_ERRORS();
            int first = client_errors.getFirst();
            if (iB > client_errors.getLast() || first > iB) {
                IntRange server_errors = httpStatusCode.getSERVER_ERRORS();
                int first2 = server_errors.getFirst();
                if (iB > server_errors.getLast() || first2 > iB) {
                    z10 = true;
                }
            } else {
                try {
                    ResponseBody responseBodyE = xVar.e();
                    errorResponse = (responseBodyE == null || (bodySource = responseBodyE.getSource()) == null) ? null : (ErrorResponse) new w.b().c(ErrorResponse.Companion.getAdapter()).a(UiComponentError.Companion).d().c(ErrorResponse.class).fromJson(bodySource.getBufferField().clone());
                } catch (Exception e10) {
                    if (!(e10 instanceof j) && !(e10 instanceof IOException)) {
                        throw e10;
                    }
                }
                if (errorResponse != null && (errors8 = errorResponse.getErrors()) != null && (error = (ErrorResponse.Error) CollectionsKt.firstOrNull(errors8)) != null) {
                    String description = error.getDescription();
                    if (description == null) {
                        description = error.getTitle();
                    }
                    if (description != null) {
                        strH2 = description;
                    }
                }
                if (errorResponse != null && (errors7 = errorResponse.getErrors()) != null && !errors7.isEmpty()) {
                    Iterator<T> it = errors7.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ErrorResponse.Error) it.next()) instanceof ErrorResponse.Error.InactiveTemplateError) {
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (errorResponse == null) {
                                        if (errorResponse == null) {
                                            if (iB != 401) {
                                                z10 = true;
                                            }
                                        } else if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (errorResponse == null) {
                                        if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (errorResponse == null) {
                                    if (errorResponse == null) {
                                        if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (errorResponse == null) {
                                        if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (errorResponse == null) {
                                        if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (iB != 401) {
                                z10 = true;
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (errorResponse == null && (errors5 = errorResponse.getErrors()) != null && !errors5.isEmpty()) {
                    Iterator<T> it2 = errors5.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((ErrorResponse.Error) it2.next()) instanceof ErrorResponse.Error.InvalidConfigError) {
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (errorResponse == null) {
                                        if (iB != 401) {
                                            z10 = true;
                                        }
                                    } else if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (iB != 401) {
                                z10 = true;
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (errorResponse == null && (errors4 = errorResponse.getErrors()) != null && !errors4.isEmpty()) {
                    Iterator<T> it3 = errors4.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((ErrorResponse.Error) it3.next()) instanceof ErrorResponse.Error.UnauthenticatedError) {
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (errorResponse == null) {
                                    if (iB != 401) {
                                        z10 = true;
                                    }
                                } else if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (iB != 401) {
                                z10 = true;
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (errorResponse == null && (errors3 = errorResponse.getErrors()) != null && !errors3.isEmpty()) {
                    Iterator<T> it4 = errors3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((ErrorResponse.Error) it4.next()) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                            }
                        } else if (errorResponse == null) {
                            if (errorResponse == null) {
                                if (iB != 401) {
                                    z10 = true;
                                }
                            } else if (iB != 401) {
                                z10 = true;
                            }
                        } else if (errorResponse == null) {
                            if (iB != 401) {
                                z10 = true;
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (errorResponse == null && (errors2 = errorResponse.getErrors()) != null && !errors2.isEmpty()) {
                    Iterator<T> it5 = errors2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (((ErrorResponse.Error) it5.next()) instanceof ErrorResponse.Error.TransitionFromTerminalStateError) {
                            }
                        } else if (errorResponse == null) {
                            if (iB != 401) {
                                z10 = true;
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (errorResponse == null && (errors = errorResponse.getErrors()) != null && !errors.isEmpty()) {
                    Iterator<T> it6 = errors.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((ErrorResponse.Error) it6.next()) instanceof ErrorResponse.Error.FieldNotFoundError) {
                            }
                        } else if (iB != 401) {
                            z10 = true;
                        }
                    }
                } else if (iB != 401 && iB != 404 && iB != 409) {
                    z10 = true;
                }
                if (errorResponse != null && (errors6 = errorResponse.getErrors()) != null) {
                    rateLimitExceededError = (ErrorResponse.Error) CollectionsKt.firstOrNull(errors6);
                }
                if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                    ((ErrorResponse.Error.UnknownError) rateLimitExceededError).setErrorBody(xVar.e());
                }
            }
        }
        return new InternalErrorInfo.NetworkErrorInfo(xVar.b(), strH2, z10, rateLimitExceededError);
    }

    @NotNull
    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(@NotNull SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
