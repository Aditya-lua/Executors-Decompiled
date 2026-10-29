package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lxu/h0;", "path", "Lxu/l;", "fileSystem", "<init>", "(Lxu/h0;Lxu/l;)V", "Lxu/r0;", "listSource", "()Lxu/r0;", "Lxu/h0;", "getPath", "()Lxu/h0;", "Lxu/l;", "getFileSystem", "()Lxu/l;", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    @NotNull
    public static final C12931h0 PUBLIC_SUFFIX_RESOURCE = C12931h0.Companion.m48135e(C12931h0.INSTANCE, "okhttp3/internal/publicsuffix/" + PublicSuffixDatabase.class.getSimpleName() + ".list", false, 1, null);

    @NotNull
    private final AbstractC12938l fileSystem;

    @NotNull
    private final C12931h0 path;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final AbstractC12938l getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public InterfaceC12951r0 listSource() {
        return this.fileSystem.source(getPath());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ResourcePublicSuffixList(@NotNull C12931h0 path, @NotNull AbstractC12938l fileSystem) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.path = path;
        this.fileSystem = fileSystem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getPath()Ljava/lang/Object; */
    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public C12931h0 getPath() {
        return this.path;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (wrap xu.h0:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap xu.h0:0x0004: SGET  A[WRAPPED] (LINE:5) okhttp3.internal.publicsuffix.ResourcePublicSuffixList.PUBLIC_SUFFIX_RESOURCE xu.h0) : (r1v0 xu.h0))
      (wrap xu.l:?: TERNARY null = ((wrap int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap xu.l:0x000a: SGET  A[WRAPPED] (LINE:6) xu.l.RESOURCES xu.l) : (r2v0 xu.l))
     A[MD:(xu.h0, xu.l):void (m)] (LINE:7) call: okhttp3.internal.publicsuffix.ResourcePublicSuffixList.<init>(xu.h0, xu.l):void type: THIS */
    public /* synthetic */ ResourcePublicSuffixList(C12931h0 c12931h0, AbstractC12938l abstractC12938l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : c12931h0, (i10 & 2) != 0 ? AbstractC12938l.RESOURCES : abstractC12938l);
    }
}
