package u6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lu6/s;", "Lu6/r;", "Lew/g;", Payload.SOURCE, "c", "(Lew/g;)Lew/g;", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/g;Lew/f;Leu/b;)Ljava/lang/Object;", "Lew/k;", "fileSystem", "Lew/b0;", "path", "k", "(Lew/g;Lew/k;Lew/b0;Leu/b;)Ljava/lang/Object;", "b", "(Lew/g;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lew/g;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.g source;

    public /* synthetic */ s(ew.g gVar) {
        this.source = gVar;
    }

    public static final /* synthetic */ s a(ew.g gVar) {
        return new s(gVar);
    }

    public static void b(ew.g gVar) {
        gVar.close();
    }

    @NotNull
    public static ew.g c(@NotNull ew.g gVar) {
        return gVar;
    }

    public static boolean d(ew.g gVar, Object obj) {
        return (obj instanceof s) && Intrinsics.c(gVar, ((s) obj).getSource());
    }

    public static int e(ew.g gVar) {
        return gVar.hashCode();
    }

    public static String f(ew.g gVar) {
        return "SourceResponseBody(source=" + gVar + ')';
    }

    @Nullable
    public static Object h(ew.g gVar, @NotNull ew.f fVar, @NotNull eu.b<? super Unit> bVar) {
        gVar.a0(fVar);
        return Unit.f21506a;
    }

    @Nullable
    public static Object k(ew.g gVar, @NotNull ew.k kVar, @NotNull b0 b0Var, @NotNull eu.b<? super Unit> bVar) throws Throwable {
        ew.f fVarB = v.b(kVar.u(b0Var, false));
        try {
            gu.b.d(gVar.a0(fVarB));
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th4) {
                    zt.a.a(th, th4);
                }
            }
        }
        if (th == null) {
            return Unit.f21506a;
        }
        throw th;
    }

    @Override // u6.r
    @Nullable
    public Object D(@NotNull ew.f fVar, @NotNull eu.b<? super Unit> bVar) {
        return h(this.source, fVar, bVar);
    }

    @Override // u6.r
    @Nullable
    public Object P(@NotNull ew.k kVar, @NotNull b0 b0Var, @NotNull eu.b<? super Unit> bVar) {
        return k(this.source, kVar, b0Var, bVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b(this.source);
    }

    public boolean equals(Object other) {
        return d(this.source, other);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ ew.g getSource() {
        return this.source;
    }

    public int hashCode() {
        return e(this.source);
    }

    public String toString() {
        return f(this.source);
    }
}
