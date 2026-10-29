package p560xu;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.m0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006#"}, m31665d2 = {"Lxu/m0;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()Lxu/m0;", "f", "b", "segment", "c", "(Lxu/m0;)Lxu/m0;", "byteCount", "e", "(I)Lxu/m0;", "", "a", "sink", "g", "(Lxu/m0;I)V", "[B", "I", "Z", "Lxu/m0;", "next", "prev", "h", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12941m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int limit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean owner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C12941m0 next;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C12941m0 prev;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12941m0() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m48170a() {
        int i10;
        C12941m0 c12941m0 = this.prev;
        if (c12941m0 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(c12941m0);
        if (c12941m0.owner) {
            int i11 = this.limit - this.pos;
            C12941m0 c12941m1 = this.prev;
            Intrinsics.checkNotNull(c12941m1);
            int i12 = 8192 - c12941m1.limit;
            C12941m0 c12941m2 = this.prev;
            Intrinsics.checkNotNull(c12941m2);
            if (c12941m2.shared) {
                i10 = 0;
            } else {
                C12941m0 c12941m3 = this.prev;
                Intrinsics.checkNotNull(c12941m3);
                i10 = c12941m3.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            C12941m0 c12941m4 = this.prev;
            Intrinsics.checkNotNull(c12941m4);
            m48176g(c12941m4, i11);
            m48171b();
            C12943n0.m48178b(this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C12941m0 m48171b() {
        C12941m0 c12941m0 = this.next;
        if (c12941m0 == this) {
            c12941m0 = null;
        }
        C12941m0 c12941m1 = this.prev;
        Intrinsics.checkNotNull(c12941m1);
        c12941m1.next = this.next;
        C12941m0 c12941m2 = this.next;
        Intrinsics.checkNotNull(c12941m2);
        c12941m2.prev = this.prev;
        this.next = null;
        this.prev = null;
        return c12941m0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C12941m0 m48172c(@NotNull C12941m0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        C12941m0 c12941m0 = this.next;
        Intrinsics.checkNotNull(c12941m0);
        c12941m0.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C12941m0 m48173d() {
        this.shared = true;
        return new C12941m0(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C12941m0 m48174e(int byteCount) {
        C12941m0 c12941m0M48179c;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            c12941m0M48179c = m48173d();
        } else {
            c12941m0M48179c = C12943n0.m48179c();
            byte[] bArr = this.data;
            byte[] bArr2 = c12941m0M48179c.data;
            int i10 = this.pos;
            C7691l.m31815j(bArr, bArr2, 0, i10, i10 + byteCount, 2, null);
        }
        c12941m0M48179c.limit = c12941m0M48179c.pos + byteCount;
        this.pos += byteCount;
        C12941m0 c12941m0 = this.prev;
        Intrinsics.checkNotNull(c12941m0);
        c12941m0.m48172c(c12941m0M48179c);
        return c12941m0M48179c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C12941m0 m48175f() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new C12941m0(bArrCopyOf, this.pos, this.limit, false, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m48176g(@NotNull C12941m0 sink, int byteCount) {
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
            C7691l.m31815j(bArr, bArr, 0, i11, i10, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i12 = sink.limit;
        int i13 = this.pos;
        C7691l.m31811f(bArr2, bArr3, i12, i13, i13 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public C12941m0(@NotNull byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
