package x6;

import android.content.Context;
import com.google.mlkit.vision.barcode.common.Barcode;
import e7.h0;
import java.util.Map;
import k6.Extras;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

/* JADX INFO: renamed from: x6.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bD\u0018\u00002\u00020\u0001:\u0004HE76Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b7\u00105J\u001d\u00109\u001a\u0002082\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010CR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R-\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bX\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bS\u0010bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bg\u0010fR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b^\u0010d\u001a\u0004\bP\u0010fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\be\u0010h\u001a\u0004\b`\u0010jR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bN\u0010h\u001a\u0004\bk\u0010jR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bR\u0010l\u001a\u0004\bm\u0010nR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bU\u0010o\u001a\u0004\bp\u0010qR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\br\u0010qR%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bk\u0010o\u001a\u0004\bs\u0010qR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bm\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\by\u0010{\u001a\u0004\bw\u0010|R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bu\u0010}\u001a\u0004\bc\u0010~R\u0018\u0010/\u001a\u00020.8\u0006¢\u0006\r\n\u0004\bK\u0010\u007f\u001a\u0005\bY\u0010\u0080\u0001R\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0081\u0001\u001a\u0005\bW\u0010\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lx6/g;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "data", "Lb7/c;", "target", "Lx6/g$d;", "listener", "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "Lxu/l;", "fileSystem", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "fetcherFactory", "Lm6/i$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Ls6/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "Lk6/l;", "extras", "Lx6/g$c;", "defined", "Lx6/g$b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lb7/c;Lx6/g$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lxu/l;Lkotlin/Pair;Lm6/i$a;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Ls6/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;Lx6/g$c;Lx6/g$b;)V", "B", "()Lk6/n;", "a", "b", "Lx6/g$a;", "z", "(Landroid/content/Context;)Lx6/g$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "Lb7/c;", "y", "()Lb7/c;", "Lx6/g$d;", "p", "()Lx6/g$d;", "e", "Ljava/lang/String;", "q", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "g", "i", "h", "Lxu/l;", "n", "()Lxu/l;", "Lkotlin/Pair;", "m", "()Lkotlin/Pair;", "j", "Lm6/i$a;", "()Lm6/i$a;", "k", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "l", "Lx6/c;", "s", "()Lx6/c;", "t", "Ls6/d$b;", "u", "()Ls6/d$b;", "Lkotlin/jvm/functions/Function1;", "getPlaceholderFactory", "()Lkotlin/jvm/functions/Function1;", "getErrorFactory", "getFallbackFactory", "Ly6/i;", "x", "()Ly6/i;", "v", "Ly6/f;", "w", "()Ly6/f;", "Ly6/c;", "()Ly6/c;", "Lk6/l;", "()Lk6/l;", "Lx6/g$c;", "()Lx6/g$c;", "Lx6/g$b;", "()Lx6/g$b;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Object data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final b7.c target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final d listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> memoryCacheKeyExtras;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final xu.l fileSystem;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Pair<o6.j.a<?>, hu.c<?>> fetcherFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final m6.i.a decoderFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext interceptorCoroutineContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext fetcherCoroutineContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext decoderCoroutineContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c memoryCachePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c diskCachePolicy;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c networkCachePolicy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final s6.d.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, k6.n> placeholderFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, k6.n> errorFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, k6.n> fallbackFactory;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final y6.i sizeResolver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final y6.f scale;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final y6.c precision;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Extras extras;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Defined defined;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Defaults defaults;

    /* JADX INFO: renamed from: x6.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b$\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b(\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b2\u00101R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00105R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b.\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b6\u0010>¨\u0006?"}, d2 = {"Lx6/g$c;", "", "Lxu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lx6/g;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "<init>", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lxu/l;", "f", "()Lxu/l;", "b", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "c", "e", "d", "Lx6/c;", "h", "()Lx6/c;", "i", "Lkotlin/jvm/functions/Function1;", "j", "()Lkotlin/jvm/functions/Function1;", "k", "Ly6/i;", "m", "()Ly6/i;", "l", "Ly6/f;", "()Ly6/f;", "Ly6/c;", "()Ly6/c;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Defined {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final xu.l fileSystem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, k6.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, k6.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, k6.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y6.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y6.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final y6.c precision;

        /* JADX WARN: Multi-variable type inference failed */
        public Defined(@Nullable xu.l lVar, @Nullable CoroutineContext coroutineContext, @Nullable CoroutineContext coroutineContext2, @Nullable CoroutineContext coroutineContext3, @Nullable c cVar, @Nullable c cVar2, @Nullable c cVar3, @Nullable Function1<? super ImageRequest, ? extends k6.n> function1, @Nullable Function1<? super ImageRequest, ? extends k6.n> function2, @Nullable Function1<? super ImageRequest, ? extends k6.n> function3, @Nullable y6.i iVar, @Nullable y6.f fVar, @Nullable y6.c cVar4) {
            this.fileSystem = lVar;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = function1;
            this.errorFactory = function2;
            this.fallbackFactory = function3;
            this.sizeResolver = iVar;
            this.scale = fVar;
            this.precision = cVar4;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        @Nullable
        public final Function1<ImageRequest, k6.n> c() {
            return this.errorFactory;
        }

        @Nullable
        public final Function1<ImageRequest, k6.n> d() {
            return this.fallbackFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final CoroutineContext getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) other;
            return Intrinsics.c(this.fileSystem, defined.fileSystem) && Intrinsics.c(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && Intrinsics.c(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && Intrinsics.c(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && this.networkCachePolicy == defined.networkCachePolicy && Intrinsics.c(this.placeholderFactory, defined.placeholderFactory) && Intrinsics.c(this.errorFactory, defined.errorFactory) && Intrinsics.c(this.fallbackFactory, defined.fallbackFactory) && Intrinsics.c(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final xu.l getFileSystem() {
            return this.fileSystem;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public int hashCode() {
            xu.l lVar = this.fileSystem;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            CoroutineContext coroutineContext = this.interceptorCoroutineContext;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.fetcherCoroutineContext;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.decoderCoroutineContext;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            c cVar = this.memoryCachePolicy;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c cVar2 = this.diskCachePolicy;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            c cVar3 = this.networkCachePolicy;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            Function1<ImageRequest, k6.n> function1 = this.placeholderFactory;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1<ImageRequest, k6.n> function2 = this.errorFactory;
            int iHashCode9 = (iHashCode8 + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function1<ImageRequest, k6.n> function3 = this.fallbackFactory;
            int iHashCode10 = (iHashCode9 + (function3 == null ? 0 : function3.hashCode())) * 31;
            y6.i iVar = this.sizeResolver;
            int iHashCode11 = (iHashCode10 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            y6.f fVar = this.scale;
            int iHashCode12 = (iHashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            y6.c cVar4 = this.precision;
            return iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        @Nullable
        public final Function1<ImageRequest, k6.n> j() {
            return this.placeholderFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final y6.c getPrecision() {
            return this.precision;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final y6.f getScale() {
            return this.scale;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final y6.i getSizeResolver() {
            return this.sizeResolver;
        }

        @NotNull
        public String toString() {
            return "Defined(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ')';
        }
    }

    /* JADX INFO: renamed from: x6.g$d */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lx6/g$d;", "", "Lx6/g;", "request", "", "a", "(Lx6/g;)V", "d", "Lx6/e;", "result", "c", "(Lx6/g;Lx6/e;)V", "Lx6/t;", "b", "(Lx6/g;Lx6/t;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        default void a(@NotNull ImageRequest request) {
        }

        default void b(@NotNull ImageRequest request, @NotNull SuccessResult result) {
        }

        default void c(@NotNull ImageRequest request, @NotNull ErrorResult result) {
        }

        default void d(@NotNull ImageRequest request) {
        }
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, b7.c cVar, d dVar, String str, Map map, String str2, xu.l lVar, Pair pair, m6.i.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar2, c cVar3, c cVar4, s6.d.Key key, Function1 function1, Function1 function2, Function1 function3, y6.i iVar, y6.f fVar, y6.c cVar5, Extras lVar2, Defined defined, Defaults defaults, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cVar, dVar, str, map, str2, lVar, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cVar2, cVar3, cVar4, key, function1, function2, function3, iVar, fVar, cVar5, lVar2, defined, defaults);
    }

    public static /* synthetic */ a A(ImageRequest imageRequest, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.z(context);
    }

    @Nullable
    public final k6.n B() {
        k6.n nVarInvoke = this.placeholderFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.m().invoke(this) : nVarInvoke;
    }

    @Nullable
    public final k6.n a() {
        k6.n nVarInvoke = this.errorFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.e().invoke(this) : nVarInvoke;
    }

    @Nullable
    public final k6.n b() {
        k6.n nVarInvoke = this.fallbackFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.g().invoke(this) : nVarInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CoroutineContext getDecoderCoroutineContext() {
        return this.decoderCoroutineContext;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) other;
        return Intrinsics.c(this.context, imageRequest.context) && Intrinsics.c(this.data, imageRequest.data) && Intrinsics.c(this.target, imageRequest.target) && Intrinsics.c(this.listener, imageRequest.listener) && Intrinsics.c(this.memoryCacheKey, imageRequest.memoryCacheKey) && Intrinsics.c(this.memoryCacheKeyExtras, imageRequest.memoryCacheKeyExtras) && Intrinsics.c(this.diskCacheKey, imageRequest.diskCacheKey) && Intrinsics.c(this.fileSystem, imageRequest.fileSystem) && Intrinsics.c(this.fetcherFactory, imageRequest.fetcherFactory) && Intrinsics.c(this.decoderFactory, imageRequest.decoderFactory) && Intrinsics.c(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && Intrinsics.c(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && Intrinsics.c(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && Intrinsics.c(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && Intrinsics.c(this.placeholderFactory, imageRequest.placeholderFactory) && Intrinsics.c(this.errorFactory, imageRequest.errorFactory) && Intrinsics.c(this.fallbackFactory, imageRequest.fallbackFactory) && Intrinsics.c(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && Intrinsics.c(this.extras, imageRequest.extras) && Intrinsics.c(this.defined, imageRequest.defined) && Intrinsics.c(this.defaults, imageRequest.defaults);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final m6.i.a getDecoderFactory() {
        return this.decoderFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Defaults getDefaults() {
        return this.defaults;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Defined getDefined() {
        return this.defined;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        b7.c cVar = this.target;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.listener;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.memoryCacheKeyExtras.hashCode()) * 31;
        String str2 = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fileSystem.hashCode()) * 31;
        Pair<o6.j.a<?>, hu.c<?>> pair = this.fetcherFactory;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        m6.i.a aVar = this.decoderFactory;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31;
        s6.d.Key key = this.placeholderMemoryCacheKey;
        return ((((((((((((((((((iHashCode7 + (key != null ? key.hashCode() : 0)) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode()) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final CoroutineContext getFetcherCoroutineContext() {
        return this.fetcherCoroutineContext;
    }

    @Nullable
    public final Pair<o6.j.a<?>, hu.c<?>> m() {
        return this.fetcherFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final xu.l getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoroutineContext getInterceptorCoroutineContext() {
        return this.interceptorCoroutineContext;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final d getListener() {
        return this.listener;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @NotNull
    public final Map<String, String> r() {
        return this.memoryCacheKeyExtras;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final c getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=" + this.fetcherFactory + ", decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=" + this.placeholderMemoryCacheKey + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final s6.d.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final y6.c getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final y6.f getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final y6.i getSizeResolver() {
        return this.sizeResolver;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final b7.c getTarget() {
        return this.target;
    }

    @NotNull
    public final a z(@NotNull Context context) {
        return new a(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest(Context context, Object obj, b7.c cVar, d dVar, String str, Map<String, String> map, String str2, xu.l lVar, Pair<? extends o6.j.a<?>, ? extends hu.c<?>> pair, m6.i.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar2, c cVar3, c cVar4, s6.d.Key key, Function1<? super ImageRequest, ? extends k6.n> function1, Function1<? super ImageRequest, ? extends k6.n> function2, Function1<? super ImageRequest, ? extends k6.n> function3, y6.i iVar, y6.f fVar, y6.c cVar5, Extras lVar2, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = cVar;
        this.listener = dVar;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = lVar;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar;
        this.interceptorCoroutineContext = coroutineContext;
        this.fetcherCoroutineContext = coroutineContext2;
        this.decoderCoroutineContext = coroutineContext3;
        this.memoryCachePolicy = cVar2;
        this.diskCachePolicy = cVar3;
        this.networkCachePolicy = cVar4;
        this.placeholderMemoryCacheKey = key;
        this.placeholderFactory = function1;
        this.errorFactory = function2;
        this.fallbackFactory = function3;
        this.sizeResolver = iVar;
        this.scale = fVar;
        this.precision = cVar5;
        this.extras = lVar2;
        this.defined = defined;
        this.defaults = defaults;
    }

    /* JADX INFO: renamed from: x6.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 @2\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÃ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b1\u00105R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b2\u0010;R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b7\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b6\u0010F¨\u0006G"}, d2 = {"Lx6/g$b;", "", "Lxu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lx6/g;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "Lk6/l;", "extras", "<init>", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;)V", "a", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;)Lx6/g$b;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lxu/l;", "i", "()Lxu/l;", "b", "Lkotlin/coroutines/CoroutineContext;", "j", "()Lkotlin/coroutines/CoroutineContext;", "c", "h", "d", "e", "Lx6/c;", "k", "()Lx6/c;", "f", "g", "l", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "Ly6/i;", "p", "()Ly6/i;", "Ly6/f;", "o", "()Ly6/f;", "Ly6/c;", "n", "()Ly6/c;", "Lk6/l;", "()Lk6/l;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Defaults {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final Defaults f35090p = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final xu.l fileSystem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, k6.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, k6.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, k6.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final y6.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final y6.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final y6.c precision;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Extras extras;

        /* JADX WARN: Multi-variable type inference failed */
        public Defaults(@NotNull xu.l lVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2, @NotNull CoroutineContext coroutineContext3, @NotNull c cVar, @NotNull c cVar2, @NotNull c cVar3, @NotNull Function1<? super ImageRequest, ? extends k6.n> function1, @NotNull Function1<? super ImageRequest, ? extends k6.n> function2, @NotNull Function1<? super ImageRequest, ? extends k6.n> function3, @NotNull y6.i iVar, @NotNull y6.f fVar, @NotNull y6.c cVar4, @NotNull Extras lVar2) {
            this.fileSystem = lVar;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = function1;
            this.errorFactory = function2;
            this.fallbackFactory = function3;
            this.sizeResolver = iVar;
            this.scale = fVar;
            this.precision = cVar4;
            this.extras = lVar2;
        }

        @NotNull
        public final Defaults a(@NotNull xu.l fileSystem, @NotNull CoroutineContext interceptorCoroutineContext, @NotNull CoroutineContext fetcherCoroutineContext, @NotNull CoroutineContext decoderCoroutineContext, @NotNull c memoryCachePolicy, @NotNull c diskCachePolicy, @NotNull c networkCachePolicy, @NotNull Function1<? super ImageRequest, ? extends k6.n> placeholderFactory, @NotNull Function1<? super ImageRequest, ? extends k6.n> errorFactory, @NotNull Function1<? super ImageRequest, ? extends k6.n> fallbackFactory, @NotNull y6.i sizeResolver, @NotNull y6.f scale, @NotNull y6.c precision, @NotNull Extras extras) {
            return new Defaults(fileSystem, interceptorCoroutineContext, fetcherCoroutineContext, decoderCoroutineContext, memoryCachePolicy, diskCachePolicy, networkCachePolicy, placeholderFactory, errorFactory, fallbackFactory, sizeResolver, scale, precision, extras);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        @NotNull
        public final Function1<ImageRequest, k6.n> e() {
            return this.errorFactory;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) other;
            return Intrinsics.c(this.fileSystem, defaults.fileSystem) && Intrinsics.c(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && Intrinsics.c(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && Intrinsics.c(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && Intrinsics.c(this.placeholderFactory, defaults.placeholderFactory) && Intrinsics.c(this.errorFactory, defaults.errorFactory) && Intrinsics.c(this.fallbackFactory, defaults.fallbackFactory) && Intrinsics.c(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && Intrinsics.c(this.extras, defaults.extras);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Extras getExtras() {
            return this.extras;
        }

        @NotNull
        public final Function1<ImageRequest, k6.n> g() {
            return this.fallbackFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final CoroutineContext getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.fileSystem.hashCode() * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final xu.l getFileSystem() {
            return this.fileSystem;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        @NotNull
        public final Function1<ImageRequest, k6.n> m() {
            return this.placeholderFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final y6.c getPrecision() {
            return this.precision;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final y6.f getScale() {
            return this.scale;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final y6.i getSizeResolver() {
            return this.sizeResolver;
        }

        @NotNull
        public String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ')';
        }

        public /* synthetic */ Defaults(xu.l lVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar, c cVar2, c cVar3, Function1 function1, Function1 function2, Function1 function3, y6.i iVar, y6.f fVar, y6.c cVar4, Extras lVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? e7.n.a() : lVar, (i10 & 2) != 0 ? kotlin.coroutines.e.f22525a : coroutineContext, (i10 & 4) != 0 ? e7.f.a() : coroutineContext2, (i10 & 8) != 0 ? e7.f.a() : coroutineContext3, (i10 & 16) != 0 ? c.ENABLED : cVar, (i10 & 32) != 0 ? c.ENABLED : cVar2, (i10 & 64) != 0 ? c.ENABLED : cVar3, (i10 & 128) != 0 ? h0.k() : function1, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? h0.k() : function2, (i10 & Barcode.FORMAT_UPC_A) != 0 ? h0.k() : function3, (i10 & Barcode.FORMAT_UPC_E) != 0 ? y6.i.b : iVar, (i10 & Barcode.FORMAT_PDF417) != 0 ? y6.f.FIT : fVar, (i10 & Barcode.FORMAT_AZTEC) != 0 ? y6.c.EXACT : cVar4, (i10 & 8192) != 0 ? Extras.f22205c : lVar2);
        }
    }

    /* JADX INFO: renamed from: x6.g$a */
    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b7\u00105J\u0017\u0010:\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u00002\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001080<¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010GR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010PR\u0016\u0010S\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010HR\u0018\u0010U\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010WR,\u0010]\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030Z\u0012\b\u0012\u0006\u0012\u0002\b\u00030[\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010aR\u0018\u0010g\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010fR\u0018\u0010i\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010fR\u0018\u0010l\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010kR&\u0010n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010mR&\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010mR&\u0010p\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010mR\u0018\u0010s\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010HR \u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010{R\u0011\u0010\u007f\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\bR\u0010~¨\u0006\u0080\u0001"}, d2 = {"Lx6/g$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lx6/g;", "request", "(Lx6/g;Landroid/content/Context;)V", "data", "c", "(Ljava/lang/Object;)Lx6/g$a;", "Lb7/c;", "target", "v", "(Lb7/c;)Lx6/g$a;", "", "key", "j", "(Ljava/lang/String;)Lx6/g$a;", "value", "k", "(Ljava/lang/String;Ljava/lang/String;)Lx6/g$a;", "f", "", "width", "height", "s", "(II)Lx6/g$a;", "Ly6/g;", "size", "t", "(Ly6/g;)Lx6/g$a;", "Ly6/i;", "resolver", "u", "(Ly6/i;)Lx6/g$a;", "Ly6/f;", "scale", "r", "(Ly6/f;)Lx6/g$a;", "Ly6/c;", "precision", "q", "(Ly6/c;)Lx6/g$a;", "Lm6/i$a;", "factory", "d", "(Lm6/i$a;)Lx6/g$a;", "Lx6/c;", "policy", "l", "(Lx6/c;)Lx6/g$a;", "g", "m", "Lk6/n;", "image", "n", "(Lk6/n;)Lx6/g$a;", "Lkotlin/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)Lx6/g$a;", "Lx6/g$b;", "defaults", "e", "(Lx6/g$b;)Lx6/g$a;", "b", "()Lx6/g;", "a", "Landroid/content/Context;", "Lx6/g$b;", "Ljava/lang/Object;", "Lb7/c;", "Lx6/g$d;", "Lx6/g$d;", "listener", "Ljava/lang/String;", "memoryCacheKey", "", "Z", "memoryCacheKeyExtrasAreMutable", "h", "lazyMemoryCacheKeyExtras", "i", "diskCacheKey", "Lxu/l;", "Lxu/l;", "fileSystem", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "Lkotlin/Pair;", "fetcherFactory", "Lm6/i$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "p", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Ls6/d$b;", "Ls6/d$b;", "placeholderMemoryCacheKey", "Lkotlin/jvm/functions/Function1;", "placeholderFactory", "errorFactory", "fallbackFactory", "w", "Ly6/i;", "sizeResolver", "x", "Ly6/f;", "y", "Ly6/c;", "z", "lazyExtras", "", "()Ljava/util/Map;", "memoryCacheKeyExtras", "Lk6/l$a;", "()Lk6/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b7.c target;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public d listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean memoryCacheKeyExtrasAreMutable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Object lazyMemoryCacheKeyExtras;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String diskCacheKey;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public xu.l fileSystem;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Pair<? extends o6.j.a<?>, ? extends hu.c<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public m6.i.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c memoryCachePolicy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c diskCachePolicy;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c networkCachePolicy;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public s6.d.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends k6.n> placeholderFactory;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends k6.n> errorFactory;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends k6.n> fallbackFactory;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public y6.i sizeResolver;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public y6.f scale;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public y6.c precision;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Object lazyExtras;

        public a(@NotNull Context context) {
            this.context = context;
            this.defaults = Defaults.f35090p;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.lazyMemoryCacheKeyExtras = k0.j();
            this.diskCacheKey = null;
            this.fileSystem = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.interceptorCoroutineContext = null;
            this.fetcherCoroutineContext = null;
            this.decoderCoroutineContext = null;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderFactory = h0.k();
            this.errorFactory = h0.k();
            this.fallbackFactory = h0.k();
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.f22205c;
        }

        public static final k6.n p(k6.n nVar, ImageRequest imageRequest) {
            return nVar;
        }

        @NotNull
        public final ImageRequest b() {
            Map mapD;
            Extras lVarA;
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = m.f35127a;
            }
            Object obj2 = obj;
            b7.c cVar = this.target;
            d dVar = this.listener;
            String str = this.memoryCacheKey;
            Object obj3 = this.lazyMemoryCacheKeyExtras;
            if (Intrinsics.c(obj3, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapD = e7.d.d(kotlin.jvm.internal.h0.d(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapD = (Map) obj3;
            }
            Map map = mapD;
            Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.diskCacheKey;
            xu.l fileSystem = this.fileSystem;
            if (fileSystem == null) {
                fileSystem = this.defaults.getFileSystem();
            }
            xu.l lVar = fileSystem;
            Pair<? extends o6.j.a<?>, ? extends hu.c<?>> pair = this.fetcherFactory;
            m6.i.a aVar = this.decoderFactory;
            c memoryCachePolicy = this.memoryCachePolicy;
            if (memoryCachePolicy == null) {
                memoryCachePolicy = this.defaults.getMemoryCachePolicy();
            }
            c cVar2 = memoryCachePolicy;
            c diskCachePolicy = this.diskCachePolicy;
            if (diskCachePolicy == null) {
                diskCachePolicy = this.defaults.getDiskCachePolicy();
            }
            c cVar3 = diskCachePolicy;
            c networkCachePolicy = this.networkCachePolicy;
            if (networkCachePolicy == null) {
                networkCachePolicy = this.defaults.getNetworkCachePolicy();
            }
            c cVar4 = networkCachePolicy;
            CoroutineContext interceptorCoroutineContext = this.interceptorCoroutineContext;
            if (interceptorCoroutineContext == null) {
                interceptorCoroutineContext = this.defaults.getInterceptorCoroutineContext();
            }
            CoroutineContext coroutineContext = interceptorCoroutineContext;
            CoroutineContext fetcherCoroutineContext = this.fetcherCoroutineContext;
            if (fetcherCoroutineContext == null) {
                fetcherCoroutineContext = this.defaults.getFetcherCoroutineContext();
            }
            CoroutineContext coroutineContext2 = fetcherCoroutineContext;
            CoroutineContext decoderCoroutineContext = this.decoderCoroutineContext;
            if (decoderCoroutineContext == null) {
                decoderCoroutineContext = this.defaults.getDecoderCoroutineContext();
            }
            CoroutineContext coroutineContext3 = decoderCoroutineContext;
            s6.d.Key key = this.placeholderMemoryCacheKey;
            Function1 function1M = this.placeholderFactory;
            if (function1M == null) {
                function1M = this.defaults.m();
            }
            Function1 function1 = function1M;
            Function1 function1E = this.errorFactory;
            if (function1E == null) {
                function1E = this.defaults.e();
            }
            Function1 function2 = function1E;
            Function1 function1G = this.fallbackFactory;
            if (function1G == null) {
                function1G = this.defaults.g();
            }
            Function1 function3 = function1G;
            y6.i sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = this.defaults.getSizeResolver();
            }
            y6.i iVar = sizeResolver;
            y6.f scale = this.scale;
            if (scale == null) {
                scale = this.defaults.getScale();
            }
            y6.f fVar = scale;
            y6.c precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            y6.c cVar5 = precision;
            Object obj4 = this.lazyExtras;
            if (obj4 instanceof Extras.a) {
                lVarA = ((Extras.a) obj4).a();
            } else {
                if (!(obj4 instanceof Extras)) {
                    throw new AssertionError();
                }
                lVarA = (Extras) obj4;
            }
            return new ImageRequest(context, obj2, cVar, dVar, str, map, str2, lVar, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cVar2, cVar3, cVar4, key, function1, function2, function3, iVar, fVar, cVar5, lVarA, new Defined(this.fileSystem, this.interceptorCoroutineContext, this.fetcherCoroutineContext, this.decoderCoroutineContext, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy, this.placeholderFactory, this.errorFactory, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults, null);
        }

        @NotNull
        public final a c(@Nullable Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        public final a d(@NotNull m6.i.a factory) {
            this.decoderFactory = factory;
            return this;
        }

        @NotNull
        public final a e(@NotNull Defaults defaults) {
            this.defaults = defaults;
            return this;
        }

        @NotNull
        public final a f(@Nullable String key) {
            this.diskCacheKey = key;
            return this;
        }

        @NotNull
        public final a g(@NotNull c policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        @NotNull
        public final Extras.a h() {
            Object obj = this.lazyExtras;
            if (obj instanceof Extras.a) {
                return (Extras.a) obj;
            }
            if (!(obj instanceof Extras)) {
                throw new AssertionError();
            }
            Extras.a aVarD = ((Extras) obj).d();
            this.lazyExtras = aVarD;
            return aVarD;
        }

        public final Map<String, String> i() {
            Object objX = this.lazyMemoryCacheKeyExtras;
            if (!Intrinsics.c(objX, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                if (!(objX instanceof Map)) {
                    throw new AssertionError();
                }
                objX = k0.x((Map) objX);
                this.lazyMemoryCacheKeyExtras = objX;
                this.memoryCacheKeyExtrasAreMutable = true;
            }
            Intrinsics.d(objX, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            return kotlin.jvm.internal.h0.d(objX);
        }

        @NotNull
        public final a j(@Nullable String key) {
            this.memoryCacheKey = key;
            return this;
        }

        @NotNull
        public final a k(@NotNull String key, @Nullable String value) {
            if (value != null) {
                i().put(key, value);
                return this;
            }
            i().remove(key);
            return this;
        }

        @NotNull
        public final a l(@NotNull c policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        @NotNull
        public final a m(@NotNull c policy) {
            this.networkCachePolicy = policy;
            return this;
        }

        @NotNull
        public final a n(@Nullable final k6.n image) {
            return o(new Function1() { // from class: x6.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageRequest.a.p(image, (ImageRequest) obj);
                }
            });
        }

        @NotNull
        public final a o(@NotNull Function1<? super ImageRequest, ? extends k6.n> factory) {
            this.placeholderFactory = factory;
            return this;
        }

        @NotNull
        public final a q(@NotNull y6.c precision) {
            this.precision = precision;
            return this;
        }

        @NotNull
        public final a r(@NotNull y6.f scale) {
            this.scale = scale;
            return this;
        }

        @NotNull
        public final a s(int width, int height) {
            return t(y6.h.a(width, height));
        }

        @NotNull
        public final a t(@NotNull Size size) {
            return u(y6.j.a(size));
        }

        @NotNull
        public final a u(@NotNull y6.i resolver) {
            this.sizeResolver = resolver;
            return this;
        }

        @NotNull
        public final a v(@Nullable b7.c target) {
            this.target = target;
            return this;
        }

        public a(@NotNull ImageRequest imageRequest, @NotNull Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.lazyMemoryCacheKeyExtras = imageRequest.r();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.fileSystem = imageRequest.getDefined().getFileSystem();
            this.fetcherFactory = imageRequest.m();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.interceptorCoroutineContext = imageRequest.getDefined().getInterceptorCoroutineContext();
            this.fetcherCoroutineContext = imageRequest.getDefined().getFetcherCoroutineContext();
            this.decoderCoroutineContext = imageRequest.getDefined().getDecoderCoroutineContext();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderFactory = imageRequest.getDefined().j();
            this.errorFactory = imageRequest.getDefined().c();
            this.fallbackFactory = imageRequest.getDefined().d();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            this.precision = imageRequest.getDefined().getPrecision();
            this.lazyExtras = imageRequest.getExtras();
        }
    }
}
