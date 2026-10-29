package p560xu;

import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Jw\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010 R'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m31665d2 = {"Lxu/k;", "", "", "isRegularFile", "isDirectory", "Lxu/h0;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lhu/c;", "extras", "<init>", "(ZZLxu/h0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "a", "(ZZLxu/h0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lxu/k;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "b", "f", "c", "Lxu/h0;", "e", "()Lxu/h0;", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getCreatedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12936k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isRegularFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final C12931h0 symlinkTarget;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Long size;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Long createdAtMillis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Long lastModifiedAtMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Long lastAccessedAtMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC6567c<?>, Object> extras;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12936k(boolean z10, boolean z11, @Nullable C12931h0 c12931h0, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull Map<InterfaceC6567c<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = c12931h0;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = C7690k0.m31807v(extras);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: xu.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12936k m48157b(C12936k c12936k, boolean z10, boolean z11, C12931h0 c12931h0, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c12936k.isRegularFile;
        }
        if ((i10 & 2) != 0) {
            z11 = c12936k.isDirectory;
        }
        if ((i10 & 4) != 0) {
            c12931h0 = c12936k.symlinkTarget;
        }
        if ((i10 & 8) != 0) {
            l10 = c12936k.size;
        }
        if ((i10 & 16) != 0) {
            l11 = c12936k.createdAtMillis;
        }
        if ((i10 & 32) != 0) {
            l12 = c12936k.lastModifiedAtMillis;
        }
        if ((i10 & 64) != 0) {
            l13 = c12936k.lastAccessedAtMillis;
        }
        if ((i10 & 128) != 0) {
            map = c12936k.extras;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c12936k.m48158a(z10, z11, c12931h0, l10, l15, l16, l14, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C12936k m48158a(boolean isRegularFile, boolean isDirectory, @Nullable C12931h0 symlinkTarget, @Nullable Long size, @Nullable Long createdAtMillis, @Nullable Long lastModifiedAtMillis, @Nullable Long lastAccessedAtMillis, @NotNull Map<InterfaceC6567c<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new C12936k(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C12931h0 getSymlinkTarget() {
        return this.symlinkTarget;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size.longValue());
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis.longValue());
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis.longValue());
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis.longValue());
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return CollectionsKt.m31715m0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
      (wrap xu.h0:?: TERNARY null = ((wrap int:0x000b: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null xu.h0) : (r4v0 xu.h0))
      (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0011: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
      (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0016: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
      (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x001b: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
      (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0020: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0025: ARITH (r10v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0029: INVOKE  STATIC call: kotlin.collections.k0.j():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:10)) : (r9v0 java.util.Map))
     A[MD:(boolean, boolean, xu.h0, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map<hu.c<?>, ? extends java.lang.Object>):void (m)] (LINE:11) call: xu.k.<init>(boolean, boolean, xu.h0, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map):void type: THIS */
    public /* synthetic */ C12936k(boolean z10, boolean z11, C12931h0 c12931h0, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : c12931h0, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? C7690k0.m31795j() : map);
    }
}
