package o3;

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
import e3.c;
import e3.l0;
import e3.m;
import f3.f;
import f3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lo3/a;", "", "a", "c", "b", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo3/a$a;", "", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint({"ObsoleteSdkInt"})
    public static final class C0464a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: o3.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014¨\u0006\u001c"}, d2 = {"Lo3/a$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "", "EXTRA_CREATE_CREDENTIAL_REQUEST", "Ljava/lang/String;", "EXTRA_BEGIN_GET_CREDENTIAL_REQUEST", "EXTRA_CREATE_CREDENTIAL_RESPONSE", "EXTRA_GET_CREDENTIAL_REQUEST", "EXTRA_GET_CREDENTIAL_RESPONSE", "EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE", "EXTRA_GET_CREDENTIAL_EXCEPTION", "EXTRA_CREATE_CREDENTIAL_EXCEPTION", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final f a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                f.Companion companion = f.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.a(bundleExtra);
            }

            @Nullable
            public final c b(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                c.Companion companion = c.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.b(bundleExtra);
            }

            @Nullable
            public final n c(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                n.Companion companion = n.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.a(bundleExtra);
            }

            @Nullable
            public final l0 d(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                l0.Companion companion = l0.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                if (bundleExtra == null) {
                    return null;
                }
                return companion.a(bundleExtra);
            }

            public Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo3/a$b;", "", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: o3.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo3/a$b$a;", "", "<init>", "()V", "", Payload.TYPE, "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Ljava/lang/String;Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final f a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialException createCredentialException = (CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                String type = createCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return j3.a.b(type, createCredentialException.getMessage());
            }

            @Nullable
            public final c b(@NotNull String type, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                c.Companion companion = c.INSTANCE;
                Bundle data = createCredentialResponse.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return companion.a(type, data);
            }

            @Nullable
            public final n c(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                String type = getCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return j3.a.c(type, getCredentialException.getMessage());
            }

            @Nullable
            public final l0 d(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                m.Companion companion = m.INSTANCE;
                Credential credential = getCredentialResponse.getCredential();
                Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
                return new l0(companion.a(credential));
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: o3.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lo3/a$c;", "", "<init>", "()V", "", Payload.TYPE, "Landroid/content/Intent;", "intent", "Le3/c;", "b", "(Ljava/lang/String;Landroid/content/Intent;)Le3/c;", "Le3/l0;", "d", "(Landroid/content/Intent;)Le3/l0;", "Lf3/n;", "c", "(Landroid/content/Intent;)Lf3/n;", "Lf3/f;", "a", "(Landroid/content/Intent;)Lf3/f;", "TAG", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final f a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.a(intent) : C0464a.INSTANCE.a(intent);
        }

        @Nullable
        public final c b(@NotNull String type, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.b(type, intent) : C0464a.INSTANCE.b(intent);
        }

        @Nullable
        public final n c(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.c(intent) : C0464a.INSTANCE.c(intent);
        }

        @Nullable
        public final l0 d(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? b.INSTANCE.d(intent) : C0464a.INSTANCE.d(intent);
        }

        public Companion() {
        }
    }
}
