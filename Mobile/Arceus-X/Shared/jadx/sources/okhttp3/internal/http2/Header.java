package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12930h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lokhttp3/internal/http2/Header;", "", "Lxu/h;", "name", "value", "<init>", "(Lxu/h;Lxu/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lxu/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lxu/h;", "component2", "copy", "(Lxu/h;Lxu/h;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxu/h;", "hpackSize", "I", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class Header {

    @NotNull
    public static final C12930h PSEUDO_PREFIX;

    @NotNull
    public static final C12930h RESPONSE_STATUS;

    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @NotNull
    public static final C12930h TARGET_AUTHORITY;

    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @NotNull
    public static final C12930h TARGET_METHOD;

    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";

    @NotNull
    public static final C12930h TARGET_PATH;

    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";

    @NotNull
    public static final C12930h TARGET_SCHEME;

    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;

    @NotNull
    public final C12930h name;

    @NotNull
    public final C12930h value;

    static {
        C12930h.Companion companion = C12930h.INSTANCE;
        PSEUDO_PREFIX = companion.m48117d(":");
        RESPONSE_STATUS = companion.m48117d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = companion.m48117d(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.m48117d(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.m48117d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.m48117d(TARGET_AUTHORITY_UTF8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Header(@NotNull C12930h name, @NotNull C12930h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.m48089I() + 32 + value.m48089I();
    }

    public static /* synthetic */ Header copy$default(Header header, C12930h c12930h, C12930h c12930h2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c12930h = header.name;
        }
        if ((i10 & 2) != 0) {
            c12930h2 = header.value;
        }
        return header.copy(c12930h, c12930h2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C12930h getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C12930h getValue() {
        return this.value;
    }

    @NotNull
    public final Header copy(@NotNull C12930h name, @NotNull C12930h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.m31980c(this.name, header.name) && Intrinsics.m31980c(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return this.name.m48095P() + ": " + this.value.m48095P();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C12930h.Companion companion = C12930h.INSTANCE;
        this(companion.m48117d(name), companion.m48117d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull C12930h name, @NotNull String value) {
        this(name, C12930h.INSTANCE.m48117d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
