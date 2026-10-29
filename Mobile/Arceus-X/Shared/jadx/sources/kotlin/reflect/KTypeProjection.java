package kotlin.reflect;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.EnumC6578n;
import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Lhu/n;", "variance", "Lhu/m;", Payload.TYPE, "<init>", "(Lhu/n;Lhu/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhu/n;", "b", "()Lhu/n;", "Lhu/m;", "()Lhu/m;", "c", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final KTypeProjection f29460d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final EnumC6578n variance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC6577m type;

    /* JADX INFO: renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lkotlin/reflect/KTypeProjection$a;", "", "<init>", "()V", "Lhu/m;", Payload.TYPE, "Lkotlin/reflect/KTypeProjection;", "a", "(Lhu/m;)Lkotlin/reflect/KTypeProjection;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kotlin.reflect.KTypeProjection.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final KTypeProjection m32095a(@NotNull InterfaceC6577m type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(EnumC6578n.INVARIANT, type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.KTypeProjection$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C7766b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29463a;

        static {
            int[] iArr = new int[EnumC6578n.values().length];
            try {
                iArr[EnumC6578n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6578n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6578n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29463a = iArr;
        }
    }

    public KTypeProjection(@Nullable EnumC6578n enumC6578n, @Nullable InterfaceC6577m interfaceC6577m) {
        String str;
        this.variance = enumC6578n;
        this.type = interfaceC6577m;
        if ((enumC6578n == null) == (interfaceC6577m == null)) {
            return;
        }
        if (enumC6578n == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC6578n + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC6577m getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC6578n getVariance() {
        return this.variance;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.variance == kTypeProjection.variance && Intrinsics.m31980c(this.type, kTypeProjection.type);
    }

    public int hashCode() {
        EnumC6578n enumC6578n = this.variance;
        int iHashCode = (enumC6578n == null ? 0 : enumC6578n.hashCode()) * 31;
        InterfaceC6577m interfaceC6577m = this.type;
        return iHashCode + (interfaceC6577m != null ? interfaceC6577m.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        EnumC6578n enumC6578n = this.variance;
        int i10 = enumC6578n == null ? -1 : C7766b.f29463a[enumC6578n.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.type);
        }
        if (i10 == 2) {
            return "in " + this.type;
        }
        if (i10 != 3) {
            throw new C7345l();
        }
        return "out " + this.type;
    }
}
