package kotlin.jvm.internal;

import hu.EnumC6578n;
import hu.InterfaceC6567c;
import hu.InterfaceC6569e;
import hu.InterfaceC6577m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import yt.C13450a;

/* JADX INFO: renamed from: kotlin.jvm.internal.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001c\u00103\u001a\u00020\u0015*\u0006\u0012\u0002\b\u0003008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m31665d2 = {"Lkotlin/jvm/internal/j0;", "Lhu/m;", "Lhu/e;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lhu/e;Ljava/util/List;Lhu/m;I)V", "", "isMarkedNullable", "(Lhu/e;Ljava/util/List;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "convertPrimitiveToWrapper", "h", "(Z)Ljava/lang/String;", "e", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "a", "Lhu/e;", "()Lhu/e;", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "c", "Lhu/m;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lhu/m;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "d", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "l", "()Z", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7743j0 implements InterfaceC6577m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6569e classifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<KTypeProjection> arguments;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC6577m platformTypeUpperBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int flags;

    /* JADX INFO: renamed from: kotlin.jvm.internal.j0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29441a;

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
            f29441a = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7743j0(@NotNull InterfaceC6569e classifier, @NotNull List<KTypeProjection> arguments, @Nullable InterfaceC6577m interfaceC6577m, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = interfaceC6577m;
        this.flags = i10;
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m32053i(C7743j0 c7743j0, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c7743j0.m32054e(it);
    }

    @Override // hu.InterfaceC6577m
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC6569e getClassifier() {
        return this.classifier;
    }

    /* JADX INFO: renamed from: e */
    public final String m32054e(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        InterfaceC6577m interfaceC6577m = kTypeProjection.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String();
        C7743j0 c7743j0 = interfaceC6577m instanceof C7743j0 ? (C7743j0) interfaceC6577m : null;
        if (c7743j0 == null || (strValueOf = c7743j0.m32055h(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String());
        }
        int i10 = b.f29441a[kTypeProjection.getVariance().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new C7345l();
        }
        return "out " + strValueOf;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof C7743j0)) {
            return false;
        }
        C7743j0 c7743j0 = (C7743j0) other;
        return Intrinsics.m31980c(getClassifier(), c7743j0.getClassifier()) && Intrinsics.m31980c(m32056j(), c7743j0.m32056j()) && Intrinsics.m31980c(this.platformTypeUpperBound, c7743j0.platformTypeUpperBound) && this.flags == c7743j0.flags;
    }

    /* JADX INFO: renamed from: h */
    public final String m32055h(boolean convertPrimitiveToWrapper) {
        String name;
        InterfaceC6569e classifier = getClassifier();
        InterfaceC6567c interfaceC6567c = classifier instanceof InterfaceC6567c ? (InterfaceC6567c) classifier : null;
        Class<?> clsM49048a = interfaceC6567c != null ? C13450a.m49048a(interfaceC6567c) : null;
        if (clsM49048a == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsM49048a.isArray()) {
            name = m32057k(clsM49048a);
        } else if (convertPrimitiveToWrapper && clsM49048a.isPrimitive()) {
            InterfaceC6569e classifier2 = getClassifier();
            Intrinsics.m31981d(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C13450a.m49049b((InterfaceC6567c) classifier2).getName();
        } else {
            name = clsM49048a.getName();
        }
        String str = name + (m32056j().isEmpty() ? "" : CollectionsKt.m31715m0(m32056j(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7743j0.m32053i(this.f29435a, (KTypeProjection) obj);
            }
        }, 24, null)) + (m32058l() ? "?" : "");
        InterfaceC6577m interfaceC6577m = this.platformTypeUpperBound;
        if (!(interfaceC6577m instanceof C7743j0)) {
            return str;
        }
        String strM32055h = ((C7743j0) interfaceC6577m).m32055h(true);
        if (Intrinsics.m31980c(strM32055h, str)) {
            return str;
        }
        if (Intrinsics.m31980c(strM32055h, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strM32055h + ')';
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + m32056j().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public List<KTypeProjection> m32056j() {
        return this.arguments;
    }

    /* JADX INFO: renamed from: k */
    public final String m32057k(Class<?> cls) {
        if (Intrinsics.m31980c(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.m31980c(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.m31980c(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.m31980c(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.m31980c(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.m31980c(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.m31980c(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.m31980c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* JADX INFO: renamed from: l */
    public boolean m32058l() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return m32055h(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7743j0(@NotNull InterfaceC6569e classifier, @NotNull List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
