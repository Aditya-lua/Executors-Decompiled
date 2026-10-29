package p506w3;

import androidx.datastore.preferences.protobuf.C0823a0;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p440t3.C11480d;

/* JADX INFO: renamed from: w3.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lw3/d;", "", "a", "datastore-preferences-proto"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12300d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w3.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lw3/d$a;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Lw3/f;", "a", "(Ljava/io/InputStream;)Lw3/f;", "datastore-preferences-proto"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: w3.d.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C12302f m45693a(@NotNull InputStream input) throws C11480d {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                C12302f c12302fM45697b0 = C12302f.m45697b0(input);
                Intrinsics.checkNotNullExpressionValue(c12302fM45697b0, "{\n                Prefer…From(input)\n            }");
                return c12302fM45697b0;
            } catch (C0823a0 e10) {
                throw new C11480d("Unable to parse preferences proto.", e10);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }
}
