package h3;

import com.appsflyer.sdk_base.referrer.Payload;
import g3.a0;
import g3.b0;
import g3.c0;
import g3.d0;
import g3.h;
import g3.i;
import g3.j;
import g3.k;
import g3.l;
import g3.m;
import g3.n;
import g3.o;
import g3.p;
import g3.q;
import g3.r;
import g3.s;
import g3.t;
import g3.u;
import g3.v;
import g3.w;
import g3.x;
import g3.y;
import g3.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lh3/a;", "Lh3/b;", "Lg3/e;", "domError", "", "errorMessage", "<init>", "(Lg3/e;Ljava/lang/CharSequence;)V", "f", "Lg3/e;", "b", "()Lg3/e;", "g", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g3.e domError;

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh3/a$a;", "", "<init>", "()V", "", Payload.TYPE, "msg", "Lf3/f;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lf3/f;", "TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final f3.f a(@NotNull String type, @Nullable String msg) {
            Object objB;
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                c.Companion companion = c.INSTANCE;
                a aVar = new a(new b0(), null, 2, 0 == true ? 1 : 0);
                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    objB = companion.b(new g3.a(), msg, aVar);
                } else {
                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        objB = companion.b(new g3.b(), msg, aVar);
                    } else {
                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            objB = companion.b(new g3.c(), msg, aVar);
                        } else {
                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                                objB = companion.b(new g3.d(), msg, aVar);
                            } else {
                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    objB = companion.b(new g3.f(), msg, aVar);
                                } else {
                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        objB = companion.b(new g3.g(), msg, aVar);
                                    } else {
                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            objB = companion.b(new h(), msg, aVar);
                                        } else {
                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                objB = companion.b(new i(), msg, aVar);
                                            } else {
                                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    objB = companion.b(new j(), msg, aVar);
                                                } else {
                                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        objB = companion.b(new k(), msg, aVar);
                                                    } else {
                                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            objB = companion.b(new l(), msg, aVar);
                                                        } else {
                                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                objB = companion.b(new m(), msg, aVar);
                                                            } else {
                                                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    objB = companion.b(new n(), msg, aVar);
                                                                } else {
                                                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        objB = companion.b(new o(), msg, aVar);
                                                                    } else {
                                                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            objB = companion.b(new p(), msg, aVar);
                                                                        } else {
                                                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                objB = companion.b(new q(), msg, aVar);
                                                                            } else {
                                                                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    objB = companion.b(new r(), msg, aVar);
                                                                                } else {
                                                                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        objB = companion.b(new s(), msg, aVar);
                                                                                    } else {
                                                                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            objB = companion.b(new t(), msg, aVar);
                                                                                        } else {
                                                                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                objB = companion.b(new u(), msg, aVar);
                                                                                            } else {
                                                                                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    objB = companion.b(new v(), msg, aVar);
                                                                                                } else {
                                                                                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        objB = companion.b(new w(), msg, aVar);
                                                                                                    } else {
                                                                                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            objB = companion.b(new x(), msg, aVar);
                                                                                                        } else {
                                                                                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                objB = companion.b(new y(), msg, aVar);
                                                                                                            } else {
                                                                                                                if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    objB = companion.b(new z(), msg, aVar);
                                                                                                                } else {
                                                                                                                    if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        objB = companion.b(new a0(), msg, aVar);
                                                                                                                    } else {
                                                                                                                        if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            objB = companion.b(new b0(), msg, aVar);
                                                                                                                        } else {
                                                                                                                            if (Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                objB = companion.b(new c0(), msg, aVar);
                                                                                                                            } else {
                                                                                                                                if (!Intrinsics.c(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    throw new j3.c();
                                                                                                                                }
                                                                                                                                objB = companion.b(new d0(), msg, aVar);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return (f3.f) objB;
            } catch (j3.c unused) {
                return new f3.e(type, msg);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ a(g3.e eVar, CharSequence charSequence, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? null : charSequence);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final g3.e getDomError() {
        return this.domError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull g3.e domError, @Nullable CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), charSequence);
        Intrinsics.checkNotNullParameter(domError, "domError");
        this.domError = domError;
    }
}
