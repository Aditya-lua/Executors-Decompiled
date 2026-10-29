package p320o3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4753c;
import p092e3.AbstractC4773m;
import p092e3.C4772l0;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p207j3.C7026a;

/* JADX INFO: renamed from: o3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, m31665d2 = {"Lo3/a;", "", "a", "c", "b", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9632a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o3.a$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lo3/a$a;", "", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    @SuppressLint({"ObsoleteSdkInt"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: o3.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014¨\u0006\u001c"}, m31665d2 = {"Lo3/a$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "", "EXTRA_CREATE_CREDENTIAL_REQUEST", "Ljava/lang/String;", "EXTRA_BEGIN_GET_CREDENTIAL_REQUEST", "EXTRA_CREATE_CREDENTIAL_RESPONSE", "EXTRA_GET_CREDENTIAL_REQUEST", "EXTRA_GET_CREDENTIAL_RESPONSE", "EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE", "EXTRA_GET_CREDENTIAL_EXCEPTION", "EXTRA_CREATE_CREDENTIAL_EXCEPTION", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: o3.a.a.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final AbstractC5332f m38003a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                AbstractC5332f.Companion companion = AbstractC5332f.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.m24671a(bundleExtra);
            }

            @Nullable
            /* JADX INFO: renamed from: b */
            public final AbstractC4753c m38004b(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                AbstractC4753c.Companion companion = AbstractC4753c.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.m23148b(bundleExtra);
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final AbstractC5340n m38005c(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                AbstractC5340n.Companion companion = AbstractC5340n.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.m24673a(bundleExtra);
            }

            @Nullable
            /* JADX INFO: renamed from: d */
            public final C4772l0 m38006d(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                C4772l0.Companion companion = C4772l0.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.m23199a(bundleExtra);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: o3.a$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lo3/a$b;", "", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: o3.a$b$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lo3/a$b$a;", "", "<init>", "()V", "", Payload.TYPE, "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Ljava/lang/String;Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: o3.a.b.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final AbstractC5332f m38007a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialException createCredentialException = (CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                String type = createCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return C7026a.m29705b(type, createCredentialException.getMessage());
            }

            @Nullable
            /* JADX INFO: renamed from: b */
            public final AbstractC4753c m38008b(@NotNull String type, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                AbstractC4753c.Companion companion = AbstractC4753c.INSTANCE;
                Bundle data = createCredentialResponse.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return companion.m23147a(type, data);
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public final AbstractC5340n m38009c(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                String type = getCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return C7026a.m29706c(type, getCredentialException.getMessage());
            }

            @Nullable
            /* JADX INFO: renamed from: d */
            public final C4772l0 m38010d(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                AbstractC4773m.Companion companion = AbstractC4773m.INSTANCE;
                Credential credential = getCredentialResponse.getCredential();
                Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
                return new C4772l0(companion.m23202a(credential));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: o3.a$c, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lo3/a$c;", "", "<init>", "()V", "", Payload.TYPE, "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Ljava/lang/String;Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "TAG", "Ljava/lang/String;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: o3.a.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final AbstractC5332f m38011a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.m38007a(intent) : a.INSTANCE.m38003a(intent);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final AbstractC4753c m38012b(@NotNull String type, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.m38008b(type, intent) : a.INSTANCE.m38004b(intent);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final AbstractC5340n m38013c(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.m38009c(intent) : a.INSTANCE.m38005c(intent);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final C4772l0 m38014d(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.m38010d(intent) : a.INSTANCE.m38006d(intent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }
}
