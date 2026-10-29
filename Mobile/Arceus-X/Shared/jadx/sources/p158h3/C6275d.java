package p158h3;

import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117f3.AbstractC5340n;
import p117f3.C5339m;
import p143g3.AbstractC5980e;
import p143g3.C5972a;
import p143g3.C5973a0;
import p143g3.C5974b;
import p143g3.C5975b0;
import p143g3.C5976c;
import p143g3.C5977c0;
import p143g3.C5978d;
import p143g3.C5979d0;
import p143g3.C5981f;
import p143g3.C5982g;
import p143g3.C5983h;
import p143g3.C5984i;
import p143g3.C5985j;
import p143g3.C5986k;
import p143g3.C5987l;
import p143g3.C5988m;
import p143g3.C5989n;
import p143g3.C5990o;
import p143g3.C5991p;
import p143g3.C5992q;
import p143g3.C5993r;
import p143g3.C5994s;
import p143g3.C5995t;
import p143g3.C5996u;
import p143g3.C5997v;
import p143g3.C5998w;
import p143g3.C5999x;
import p143g3.C6000y;
import p143g3.C6001z;
import p207j3.C7028c;

/* JADX INFO: renamed from: h3.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m31665d2 = {"Lh3/d;", "Lh3/e;", "Lg3/e;", "domError", "", "errorMessage", "<init>", "(Lg3/e;Ljava/lang/CharSequence;)V", "f", "Lg3/e;", "getDomError", "()Lg3/e;", "g", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6275d extends C6276e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5980e domError;

    /* JADX INFO: renamed from: h3.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lh3/d$a;", "", "<init>", "()V", "", Payload.TYPE, NotificationCompat.CATEGORY_MESSAGE, "Lf3/n;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lf3/n;", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: h3.d.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC5340n m27533a(@NotNull String type, @Nullable String msg) {
            Object objM27532b;
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                C6274c.Companion companion = C6274c.INSTANCE;
                C6275d c6275d = new C6275d(new C5975b0(), null, 2, 0 == true ? 1 : 0);
                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    objM27532b = companion.m27532b(new C5972a(), msg, c6275d);
                } else {
                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        objM27532b = companion.m27532b(new C5974b(), msg, c6275d);
                    } else {
                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            objM27532b = companion.m27532b(new C5976c(), msg, c6275d);
                        } else {
                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                                objM27532b = companion.m27532b(new C5978d(), msg, c6275d);
                            } else {
                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    objM27532b = companion.m27532b(new C5981f(), msg, c6275d);
                                } else {
                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        objM27532b = companion.m27532b(new C5982g(), msg, c6275d);
                                    } else {
                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            objM27532b = companion.m27532b(new C5983h(), msg, c6275d);
                                        } else {
                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                objM27532b = companion.m27532b(new C5984i(), msg, c6275d);
                                            } else {
                                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    objM27532b = companion.m27532b(new C5985j(), msg, c6275d);
                                                } else {
                                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        objM27532b = companion.m27532b(new C5986k(), msg, c6275d);
                                                    } else {
                                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            objM27532b = companion.m27532b(new C5987l(), msg, c6275d);
                                                        } else {
                                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                objM27532b = companion.m27532b(new C5988m(), msg, c6275d);
                                                            } else {
                                                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    objM27532b = companion.m27532b(new C5989n(), msg, c6275d);
                                                                } else {
                                                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        objM27532b = companion.m27532b(new C5990o(), msg, c6275d);
                                                                    } else {
                                                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            objM27532b = companion.m27532b(new C5991p(), msg, c6275d);
                                                                        } else {
                                                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                objM27532b = companion.m27532b(new C5992q(), msg, c6275d);
                                                                            } else {
                                                                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    objM27532b = companion.m27532b(new C5993r(), msg, c6275d);
                                                                                } else {
                                                                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        objM27532b = companion.m27532b(new C5994s(), msg, c6275d);
                                                                                    } else {
                                                                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            objM27532b = companion.m27532b(new C5995t(), msg, c6275d);
                                                                                        } else {
                                                                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                objM27532b = companion.m27532b(new C5996u(), msg, c6275d);
                                                                                            } else {
                                                                                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    objM27532b = companion.m27532b(new C5997v(), msg, c6275d);
                                                                                                } else {
                                                                                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        objM27532b = companion.m27532b(new C5998w(), msg, c6275d);
                                                                                                    } else {
                                                                                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            objM27532b = companion.m27532b(new C5999x(), msg, c6275d);
                                                                                                        } else {
                                                                                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                objM27532b = companion.m27532b(new C6000y(), msg, c6275d);
                                                                                                            } else {
                                                                                                                if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    objM27532b = companion.m27532b(new C6001z(), msg, c6275d);
                                                                                                                } else {
                                                                                                                    if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        objM27532b = companion.m27532b(new C5973a0(), msg, c6275d);
                                                                                                                    } else {
                                                                                                                        if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            objM27532b = companion.m27532b(new C5975b0(), msg, c6275d);
                                                                                                                        } else {
                                                                                                                            if (Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                objM27532b = companion.m27532b(new C5977c0(), msg, c6275d);
                                                                                                                            } else {
                                                                                                                                if (!Intrinsics.m31980c(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    throw new C7028c();
                                                                                                                                }
                                                                                                                                objM27532b = companion.m27532b(new C5979d0(), msg, c6275d);
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
                return (AbstractC5340n) objM27532b;
            } catch (C7028c unused) {
                return new C5339m(type, msg);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 g3.e)
      (wrap java.lang.CharSequence:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r2v0 java.lang.CharSequence))
     A[MD:(g3.e, java.lang.CharSequence):void (m)] (LINE:1) call: h3.d.<init>(g3.e, java.lang.CharSequence):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6275d(AbstractC5980e abstractC5980e, CharSequence charSequence, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5980e, (i10 & 2) != 0 ? null : charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6275d(@NotNull AbstractC5980e domError, @Nullable CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), charSequence);
        Intrinsics.checkNotNullParameter(domError, "domError");
        this.domError = domError;
    }
}
