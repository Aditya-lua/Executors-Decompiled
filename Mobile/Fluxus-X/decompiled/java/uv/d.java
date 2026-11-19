package uv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Luv/d;", BuildConfig.FLAVOR, "Lew/h;", "name", "value", "<init>", "(Lew/h;Lew/h;)V", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;)V", "(Lew/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "()Lew/h;", "b", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Lew/h;", "c", "I", "hpackSize", "d", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ew.h f33972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ew.h f33973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ew.h f33974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final ew.h f33975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ew.h f33976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ew.h f33977j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.h name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ew.h value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int hpackSize;

    static {
        ew.h.Companion companion = ew.h.INSTANCE;
        f33972e = companion.d(":");
        f33973f = companion.d(":status");
        f33974g = companion.d(":method");
        f33975h = companion.d(":path");
        f33976i = companion.d(":scheme");
        f33977j = companion.d(":authority");
    }

    public d(@NotNull ew.h name, @NotNull ew.h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.I() + 32 + value.I();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ew.h getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ew.h getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return Intrinsics.c(this.name, dVar.name) && Intrinsics.c(this.value, dVar.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return this.name.P() + ": " + this.value.P();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ew.h.Companion companion = ew.h.INSTANCE;
        this(companion.d(name), companion.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull ew.h name, @NotNull String value) {
        this(name, ew.h.INSTANCE.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
