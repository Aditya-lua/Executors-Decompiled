package sa;

import android.content.Context;
import androidx.annotation.NonNull;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p446ta.C11560e;

/* JADX INFO: renamed from: sa.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lsa/p;", "", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11235p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: sa.p$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lsa/p$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsa/o;", "a", "(Landroid/content/Context;)Lsa/o;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC11234o m42283a(@NonNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C11560e(context);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: sa.p.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
