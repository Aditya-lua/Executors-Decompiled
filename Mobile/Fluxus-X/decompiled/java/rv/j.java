package rv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0003\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrv/j;", "Lrv/t$b;", BuildConfig.FLAVOR, "e", "<init>", "(Ljava/lang/Throwable;)V", "Lrv/t$a;", "h", "()Lrv/t$a;", BuildConfig.FLAVOR, "g", "()Ljava/lang/Void;", "d", "i", "a", "Lrv/t$a;", "f", "result", BuildConfig.FLAVOR, "b", "Z", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t.ConnectResult result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isReady;

    public j(@NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.result = new t.ConnectResult(this, null, e10, 2, null);
    }

    @Override // rv.t.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    @Override // rv.t.b
    public /* bridge */ /* synthetic */ t.b b() {
        return (t.b) i();
    }

    @Override // rv.t.b
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ n getConnection() {
        return (n) g();
    }

    @Override // rv.t.b, sv.d.a
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // rv.t.b
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public t.ConnectResult getResult() {
        return this.result;
    }

    @NotNull
    public final t.ConnectResult f() {
        return this.result;
    }

    @NotNull
    public Void g() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // rv.t.b
    @NotNull
    public t.ConnectResult h() {
        return this.result;
    }

    @NotNull
    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }
}
