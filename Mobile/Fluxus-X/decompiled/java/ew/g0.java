package ew;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lew/g0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "pos", "limit", BuildConfig.FLAVOR, "shared", "owner", "([BIIZZ)V", "d", "()Lew/g0;", "b", "segment", "c", "(Lew/g0;)Lew/g0;", "byteCount", "e", "(I)Lew/g0;", BuildConfig.FLAVOR, "a", "sink", "f", "(Lew/g0;I)V", "[B", "I", "Z", "Lew/g0;", "next", "g", "prev", "h", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean owner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0 next;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0 prev;

    public g0() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        int i10;
        g0 g0Var = this.prev;
        if (g0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(g0Var);
        if (g0Var.owner) {
            int i11 = this.limit - this.pos;
            g0 g0Var2 = this.prev;
            Intrinsics.checkNotNull(g0Var2);
            int i12 = 8192 - g0Var2.limit;
            g0 g0Var3 = this.prev;
            Intrinsics.checkNotNull(g0Var3);
            if (g0Var3.shared) {
                i10 = 0;
            } else {
                g0 g0Var4 = this.prev;
                Intrinsics.checkNotNull(g0Var4);
                i10 = g0Var4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            g0 g0Var5 = this.prev;
            Intrinsics.checkNotNull(g0Var5);
            f(g0Var5, i11);
            b();
            h0.b(this);
        }
    }

    @Nullable
    public final g0 b() {
        g0 g0Var = this.next;
        if (g0Var == this) {
            g0Var = null;
        }
        g0 g0Var2 = this.prev;
        Intrinsics.checkNotNull(g0Var2);
        g0Var2.next = this.next;
        g0 g0Var3 = this.next;
        Intrinsics.checkNotNull(g0Var3);
        g0Var3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return g0Var;
    }

    @NotNull
    public final g0 c(@NotNull g0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        g0 g0Var = this.next;
        Intrinsics.checkNotNull(g0Var);
        g0Var.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final g0 d() {
        this.shared = true;
        return new g0(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final g0 e(int byteCount) {
        g0 g0VarC;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            g0VarC = d();
        } else {
            g0VarC = h0.c();
            byte[] bArr = this.data;
            byte[] bArr2 = g0VarC.data;
            int i10 = this.pos;
            p001kotlin.collections.l.j(bArr, bArr2, 0, i10, i10 + byteCount, 2, null);
        }
        g0VarC.limit = g0VarC.pos + byteCount;
        this.pos += byteCount;
        g0 g0Var = this.prev;
        Intrinsics.checkNotNull(g0Var);
        g0Var.c(g0VarC);
        return g0VarC;
    }

    public final void f(@NotNull g0 sink, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.limit;
        if (i10 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.pos;
            if ((i10 + byteCount) - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            p001kotlin.collections.l.j(bArr, bArr, 0, i11, i10, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i12 = sink.limit;
        int i13 = this.pos;
        p001kotlin.collections.l.f(bArr2, bArr3, i12, i13, i13 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public g0(@NotNull byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
