package p001kotlin.jvm.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ou.a;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.reflect.KTypeProjection;
import xu.c;
import xu.e;
import xu.m;
import xu.n;
import zt.l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001c\u00103\u001a\u00020\u0015*\u0006\u0012\u0002\b\u0003008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlin/jvm/internal/j0;", "Lxu/m;", "Lxu/e;", "classifier", BuildConfig.FLAVOR, "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", BuildConfig.FLAVOR, "flags", "<init>", "(Lxu/e;Ljava/util/List;Lxu/m;I)V", BuildConfig.FLAVOR, "isMarkedNullable", "(Lxu/e;Ljava/util/List;Z)V", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "convertPrimitiveToWrapper", "g", "(Z)Ljava/lang/String;", "e", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "a", "Lxu/e;", "()Lxu/e;", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "c", "Lxu/m;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lxu/m;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "d", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "l", "()Z", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e classifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<KTypeProjection> arguments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final m platformTypeUpperBound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int flags;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21588a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21588a = iArr;
        }
    }

    public j0(@NotNull e classifier, @NotNull List<KTypeProjection> arguments, @Nullable m mVar, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = mVar;
        this.flags = i10;
    }

    public static final CharSequence i(j0 j0Var, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return j0Var.e(it);
    }

    @Override // xu.m
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public e getClassifier() {
        return this.classifier;
    }

    public final String e(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        m mVar = kTypeProjection.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String();
        j0 j0Var = mVar instanceof j0 ? (j0) mVar : null;
        if (j0Var == null || (strValueOf = j0Var.g(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String());
        }
        int i10 = b.f21588a[kTypeProjection.getVariance().ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new l();
        }
        return "out " + strValueOf;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) other;
        return Intrinsics.c(getClassifier(), j0Var.getClassifier()) && Intrinsics.c(j(), j0Var.j()) && Intrinsics.c(this.platformTypeUpperBound, j0Var.platformTypeUpperBound) && this.flags == j0Var.flags;
    }

    public final String g(boolean convertPrimitiveToWrapper) {
        String name;
        e classifier = getClassifier();
        c cVar = classifier instanceof c ? (c) classifier : null;
        Class<?> clsA = cVar != null ? a.a(cVar) : null;
        if (clsA == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = k(clsA);
        } else if (convertPrimitiveToWrapper && clsA.isPrimitive()) {
            e classifier2 = getClassifier();
            Intrinsics.d(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = a.b((c) classifier2).getName();
        } else {
            name = clsA.getName();
        }
        boolean zIsEmpty = j().isEmpty();
        String str = BuildConfig.FLAVOR;
        String strM0 = zIsEmpty ? BuildConfig.FLAVOR : CollectionsKt.m0(j(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.i0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j0.i(this.f21583a, (KTypeProjection) obj);
            }
        }, 24, null);
        if (l()) {
            str = "?";
        }
        String str2 = name + strM0 + str;
        m mVar = this.platformTypeUpperBound;
        if (!(mVar instanceof j0)) {
            return str2;
        }
        String strG = ((j0) mVar).g(true);
        if (Intrinsics.c(strG, str2)) {
            return str2;
        }
        if (Intrinsics.c(strG, str2 + '?')) {
            return str2 + '!';
        }
        return '(' + str2 + ".." + strG + ')';
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + j().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @NotNull
    public List<KTypeProjection> j() {
        return this.arguments;
    }

    public final String k(Class<?> cls) {
        if (Intrinsics.c(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.c(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.c(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.c(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.c(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.c(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.c(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean l() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return g(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(@NotNull e classifier, @NotNull List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
