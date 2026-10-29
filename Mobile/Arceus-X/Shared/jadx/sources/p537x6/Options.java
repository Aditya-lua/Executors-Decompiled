package p537x6;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.Extras;
import p560xu.AbstractC12938l;
import p568y6.EnumC13104c;
import p568y6.EnumC13107f;
import p568y6.Size;

/* JADX INFO: renamed from: x6.p, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b,\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b0\u00108R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b2\u0010;¨\u0006<"}, m31665d2 = {"Lx6/p;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Ly6/g;", "size", "Ly6/f;", "scale", "Ly6/c;", "precision", "", "diskCacheKey", "Lxu/l;", "fileSystem", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lk6/l;", "extras", "<init>", "(Landroid/content/Context;Ly6/g;Ly6/f;Ly6/c;Ljava/lang/String;Lxu/l;Lx6/c;Lx6/c;Lx6/c;Lk6/l;)V", "a", "(Landroid/content/Context;Ly6/g;Ly6/f;Ly6/c;Ljava/lang/String;Lxu/l;Lx6/c;Lx6/c;Lx6/c;Lk6/l;)Lx6/p;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Ly6/g;", "k", "()Ly6/g;", "Ly6/f;", "j", "()Ly6/f;", "d", "Ly6/c;", "i", "()Ly6/c;", "e", "Ljava/lang/String;", "f", "Lxu/l;", "g", "()Lxu/l;", "Lx6/c;", "getMemoryCachePolicy", "()Lx6/c;", "h", "Lk6/l;", "()Lk6/l;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Options {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC13107f scale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC13104c precision;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC12938l fileSystem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c memoryCachePolicy;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c diskCachePolicy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c networkCachePolicy;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    public final Extras extras;

    public Options(@NotNull Context context, @NotNull Size size, @NotNull EnumC13107f enumC13107f, @NotNull EnumC13104c enumC13104c, @Nullable String str, @NotNull AbstractC12938l abstractC12938l, @NotNull EnumC12742c enumC12742c, @NotNull EnumC12742c enumC12742c2, @NotNull EnumC12742c enumC12742c3, @NotNull Extras c7472l) {
        this.context = context;
        this.size = size;
        this.scale = enumC13107f;
        this.precision = enumC13104c;
        this.diskCacheKey = str;
        this.fileSystem = abstractC12938l;
        this.memoryCachePolicy = enumC12742c;
        this.diskCachePolicy = enumC12742c2;
        this.networkCachePolicy = enumC12742c3;
        this.extras = c7472l;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Options m47607b(Options options, Context context, Size size, EnumC13107f enumC13107f, EnumC13104c enumC13104c, String str, AbstractC12938l abstractC12938l, EnumC12742c enumC12742c, EnumC12742c enumC12742c2, EnumC12742c enumC12742c3, Extras c7472l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = options.context;
        }
        if ((i10 & 2) != 0) {
            size = options.size;
        }
        if ((i10 & 4) != 0) {
            enumC13107f = options.scale;
        }
        if ((i10 & 8) != 0) {
            enumC13104c = options.precision;
        }
        if ((i10 & 16) != 0) {
            str = options.diskCacheKey;
        }
        if ((i10 & 32) != 0) {
            abstractC12938l = options.fileSystem;
        }
        if ((i10 & 64) != 0) {
            enumC12742c = options.memoryCachePolicy;
        }
        if ((i10 & 128) != 0) {
            enumC12742c2 = options.diskCachePolicy;
        }
        if ((i10 & 256) != 0) {
            enumC12742c3 = options.networkCachePolicy;
        }
        if ((i10 & 512) != 0) {
            c7472l = options.extras;
        }
        EnumC12742c enumC12742c4 = enumC12742c3;
        Extras c7472l2 = c7472l;
        EnumC12742c enumC12742c5 = enumC12742c;
        EnumC12742c enumC12742c6 = enumC12742c2;
        String str2 = str;
        AbstractC12938l abstractC12938l2 = abstractC12938l;
        return options.m47608a(context, size, enumC13107f, enumC13104c, str2, abstractC12938l2, enumC12742c5, enumC12742c6, enumC12742c4, c7472l2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Options m47608a(@NotNull Context context, @NotNull Size size, @NotNull EnumC13107f scale, @NotNull EnumC13104c precision, @Nullable String diskCacheKey, @NotNull AbstractC12938l fileSystem, @NotNull EnumC12742c memoryCachePolicy, @NotNull EnumC12742c diskCachePolicy, @NotNull EnumC12742c networkCachePolicy, @NotNull Extras extras) {
        return new Options(context, size, scale, precision, diskCacheKey, fileSystem, memoryCachePolicy, diskCachePolicy, networkCachePolicy, extras);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC12742c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options options = (Options) other;
        return Intrinsics.m31980c(this.context, options.context) && Intrinsics.m31980c(this.size, options.size) && this.scale == options.scale && this.precision == options.precision && Intrinsics.m31980c(this.diskCacheKey, options.diskCacheKey) && Intrinsics.m31980c(this.fileSystem, options.fileSystem) && this.memoryCachePolicy == options.memoryCachePolicy && this.diskCachePolicy == options.diskCachePolicy && this.networkCachePolicy == options.networkCachePolicy && Intrinsics.m31980c(this.extras, options.extras);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC12938l getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC12742c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public int hashCode() {
        int iHashCode = ((((((this.context.hashCode() * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31;
        String str = this.diskCacheKey;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileSystem.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.extras.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC13104c getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC13107f getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public String toString() {
        return "Options(context=" + this.context + ", size=" + this.size + ", scale=" + this.scale + ", precision=" + this.precision + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", extras=" + this.extras + ')';
    }
}
