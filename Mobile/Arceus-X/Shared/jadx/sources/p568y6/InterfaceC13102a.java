package p568y6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31665d2 = {"Ly6/a;", "", "a", "b", "Ly6/a$a;", "Ly6/a$b;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC13102a {

    /* JADX INFO: renamed from: y6.a$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m31665d2 = {"Ly6/a$a;", "Ly6/a;", "", "px", "b", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPx", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC13102a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int px;

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [y6.a.a.a(int):y6.a$a] */
        public /* synthetic */ a(int i10) {
            this.px = i10;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: y6.a.a.<init>(int):void type: CONSTRUCTOR */
        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a m48697a(int i10) {
            return new a(i10);
        }

        /* JADX INFO: renamed from: b */
        public static int m48698b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        /* JADX INFO: renamed from: c */
        public static boolean m48699c(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).getPx();
        }

        /* JADX INFO: renamed from: d */
        public static int m48700d(int i10) {
            return Integer.hashCode(i10);
        }

        /* JADX INFO: renamed from: e */
        public static String m48701e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object other) {
            return m48699c(this.px, other);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ int getPx() {
            return this.px;
        }

        public int hashCode() {
            return m48700d(this.px);
        }

        public String toString() {
            return m48701e(this.px);
        }
    }

    /* JADX INFO: renamed from: y6.a$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Ly6/a$b;", "Ly6/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class b implements InterfaceC13102a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f46332a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -2093724603;
        }

        @NotNull
        public String toString() {
            return "Undefined";
        }
    }
}
