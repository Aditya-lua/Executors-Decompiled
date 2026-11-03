package t6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vu.b0;
import vu.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lt6/s;", "Lt6/r;", "Lvu/g;", Payload.SOURCE, "c", "(Lvu/g;)Lvu/g;", "Lvu/f;", "sink", "", "h", "(Lvu/g;Lvu/f;Llt/b;)Ljava/lang/Object;", "Lvu/l;", "fileSystem", "Lvu/h0;", "path", "j", "(Lvu/g;Lvu/l;Lvu/h0;Llt/b;)Ljava/lang/Object;", "b", "(Lvu/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvu/g;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final vu.g source;

    public /* synthetic */ s(vu.g gVar) {
        this.source = gVar;
    }

    public static final /* synthetic */ s a(vu.g gVar) {
        return new s(gVar);
    }

    public static void b(vu.g gVar) {
        gVar.close();
    }

    @NotNull
    public static vu.g c(@NotNull vu.g gVar) {
        return gVar;
    }

    public static boolean d(vu.g gVar, Object obj) {
        return (obj instanceof s) && Intrinsics.c(gVar, ((s) obj).getSource());
    }

    public static int e(vu.g gVar) {
        return gVar.hashCode();
    }

    public static String f(vu.g gVar) {
        return "SourceResponseBody(source=" + gVar + ')';
    }

    @Nullable
    public static Object h(vu.g gVar, @NotNull vu.f fVar, @NotNull lt.b<? super Unit> bVar) {
        gVar.a3(fVar);
        return Unit.f22938a;
    }

    @Nullable
    public static Object j(vu.g gVar, @NotNull vu.l lVar, @NotNull h0 h0Var, @NotNull lt.b<? super Unit> bVar) throws Throwable {
        vu.f fVarB = b0.b(lVar.sink(h0Var, false));
        try {
            nt.b.e(gVar.a3(fVarB));
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
                    gt.a.a(th, th4);
                }
            }
        }
        if (th == null) {
            return Unit.f22938a;
        }
        throw th;
    }

    @Override // t6.r
    @Nullable
    public Object C(@NotNull vu.f fVar, @NotNull lt.b<? super Unit> bVar) {
        return h(this.source, fVar, bVar);
    }

    @Override // t6.r
    @Nullable
    public Object F1(@NotNull vu.l lVar, @NotNull h0 h0Var, @NotNull lt.b<? super Unit> bVar) {
        return j(this.source, lVar, h0Var, bVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b(this.source);
    }

    public boolean equals(Object other) {
        return d(this.source, other);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ vu.g getSource() {
        return this.source;
    }

    public int hashCode() {
        return e(this.source);
    }

    public String toString() {
        return f(this.source);
    }
}
