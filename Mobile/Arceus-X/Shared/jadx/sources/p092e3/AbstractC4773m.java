package p092e3;

import android.credentials.Credential;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p207j3.C7028c;

/* JADX INFO: renamed from: e3.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, m31665d2 = {"Le3/m;", "", "", Payload.TYPE, "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "c", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC4773m {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bundle data;

    /* JADX INFO: renamed from: e3.m$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Le3/m$a;", "", "<init>", "()V", "", Payload.TYPE, "Landroid/os/Bundle;", "data", "Le3/m;", "b", "(Ljava/lang/String;Landroid/os/Bundle;)Le3/m;", "Landroid/credentials/Credential;", "credential", "a", "(Landroid/credentials/Credential;)Le3/m;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.m.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC4773m m23202a(@NotNull Credential credential) {
            Intrinsics.checkNotNullParameter(credential, "credential");
            String type = credential.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Bundle data = credential.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return m23203b(type, data);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        /* JADX INFO: renamed from: b */
        public final AbstractC4773m m23203b(@NotNull String type, @NotNull Bundle data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                            return C4768j0.INSTANCE.m23187a(data);
                        }
                        break;
                    case -1072734346:
                        if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                            return C4792v0.INSTANCE.m23239a(data);
                        }
                        break;
                    case -543568185:
                        if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                            return C4784r0.INSTANCE.m23225a(data);
                        }
                        break;
                    case -95037569:
                        if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            return C4788t0.INSTANCE.m23235a(data);
                        }
                        break;
                }
                throw new C7028c();
            } catch (C7028c unused) {
                return new C4766i0(type, data);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public AbstractC4773m(@NotNull String type, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
