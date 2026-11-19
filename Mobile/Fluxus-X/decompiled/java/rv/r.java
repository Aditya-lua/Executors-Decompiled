package rv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lrv/r;", "Lrv/t$b;", "Lrv/n;", "connection", "<init>", "(Lrv/n;)V", BuildConfig.FLAVOR, "f", "()Ljava/lang/Void;", "g", "c", "()Lrv/n;", "d", "j", "a", "Lrv/n;", "i", BuildConfig.FLAVOR, "b", "Z", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n connection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isReady;

    public r(@NotNull n connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        this.isReady = true;
    }

    @Override // rv.t.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    @Override // rv.t.b
    public /* bridge */ /* synthetic */ t.b b() {
        return (t.b) j();
    }

    @Override // rv.t.b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public n getConnection() {
        return this.connection;
    }

    @Override // rv.t.b, sv.d.a
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // rv.t.b
    public /* bridge */ /* synthetic */ t.ConnectResult e() {
        return (t.ConnectResult) g();
    }

    @NotNull
    public Void f() {
        throw new IllegalStateException("already connected");
    }

    @NotNull
    public Void g() {
        throw new IllegalStateException("already connected");
    }

    @Override // rv.t.b
    public /* bridge */ /* synthetic */ t.ConnectResult h() {
        return (t.ConnectResult) f();
    }

    @NotNull
    public final n i() {
        return this.connection;
    }

    @NotNull
    public Void j() {
        throw new IllegalStateException("unexpected retry");
    }
}
