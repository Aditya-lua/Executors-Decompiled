package p537x6;

import android.content.Context;
import hu.InterfaceC6567c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.InterfaceC1251c;
import p096e7.C4852d;
import p096e7.C4856f;
import p096e7.C4861h0;
import p096e7.C4868n;
import p239k6.Extras;
import p239k6.InterfaceC7474n;
import p287m6.InterfaceC8435i;
import p323o6.InterfaceC9702j;
import p430s6.InterfaceC11178d;
import p560xu.AbstractC12938l;
import p568y6.C13109h;
import p568y6.C13111j;
import p568y6.EnumC13104c;
import p568y6.EnumC13107f;
import p568y6.InterfaceC13110i;
import p568y6.Size;

/* JADX INFO: renamed from: x6.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bD\u0018\u00002\u00020\u0001:\u0004HE76Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b7\u00105J\u001d\u00109\u001a\u0002082\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010CR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R-\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bX\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bS\u0010bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bg\u0010fR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b^\u0010d\u001a\u0004\bP\u0010fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\be\u0010h\u001a\u0004\b`\u0010jR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bN\u0010h\u001a\u0004\bk\u0010jR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bR\u0010l\u001a\u0004\bm\u0010nR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bU\u0010o\u001a\u0004\bp\u0010qR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\br\u0010qR%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bk\u0010o\u001a\u0004\bs\u0010qR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bm\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\by\u0010{\u001a\u0004\bw\u0010|R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bu\u0010}\u001a\u0004\bc\u0010~R\u0018\u0010/\u001a\u00020.8\u0006¢\u0006\r\n\u0004\bK\u0010\u007f\u001a\u0005\bY\u0010\u0080\u0001R\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0081\u0001\u001a\u0005\bW\u0010\u0082\u0001¨\u0006\u0083\u0001"}, m31665d2 = {"Lx6/g;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "data", "Lb7/c;", "target", "Lx6/g$d;", "listener", "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "Lxu/l;", "fileSystem", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "fetcherFactory", "Lm6/i$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Ls6/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "Lk6/l;", "extras", "Lx6/g$c;", "defined", "Lx6/g$b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lb7/c;Lx6/g$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lxu/l;Lkotlin/Pair;Lm6/i$a;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Ls6/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;Lx6/g$c;Lx6/g$b;)V", "B", "()Lk6/n;", "a", "b", "Lx6/g$a;", "z", "(Landroid/content/Context;)Lx6/g$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "Lb7/c;", "y", "()Lb7/c;", "Lx6/g$d;", "p", "()Lx6/g$d;", "e", "Ljava/lang/String;", "q", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "g", "i", "h", "Lxu/l;", "n", "()Lxu/l;", "Lkotlin/Pair;", "m", "()Lkotlin/Pair;", "j", "Lm6/i$a;", "()Lm6/i$a;", "k", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "l", "Lx6/c;", "s", "()Lx6/c;", "t", "Ls6/d$b;", "u", "()Ls6/d$b;", "Lkotlin/jvm/functions/Function1;", "getPlaceholderFactory", "()Lkotlin/jvm/functions/Function1;", "getErrorFactory", "getFallbackFactory", "Ly6/i;", "x", "()Ly6/i;", "v", "Ly6/f;", "w", "()Ly6/f;", "Ly6/c;", "()Ly6/c;", "Lk6/l;", "()Lk6/l;", "Lx6/g$c;", "()Lx6/g$c;", "Lx6/g$b;", "()Lx6/g$b;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Object data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC1251c target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final d listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> memoryCacheKeyExtras;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC12938l fileSystem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final Pair<InterfaceC9702j.a<?>, InterfaceC6567c<?>> fetcherFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC8435i.a decoderFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext interceptorCoroutineContext;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext fetcherCoroutineContext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    public final CoroutineContext decoderCoroutineContext;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c memoryCachePolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c diskCachePolicy;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC12742c networkCachePolicy;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC11178d.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, InterfaceC7474n> placeholderFactory;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, InterfaceC7474n> errorFactory;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<ImageRequest, InterfaceC7474n> fallbackFactory;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @NotNull
    public final InterfaceC13110i sizeResolver;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC13107f scale;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC13104c precision;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @NotNull
    public final Extras extras;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @NotNull
    public final Defined defined;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @NotNull
    public final Defaults defaults;

    /* JADX INFO: renamed from: x6.g$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b$\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b(\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b2\u00101R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00105R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b.\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b6\u0010>¨\u0006?"}, m31665d2 = {"Lx6/g$c;", "", "Lxu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lx6/g;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "<init>", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lxu/l;", "f", "()Lxu/l;", "b", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "c", "e", "d", "Lx6/c;", "h", "()Lx6/c;", "i", "Lkotlin/jvm/functions/Function1;", "j", "()Lkotlin/jvm/functions/Function1;", "k", "Ly6/i;", "m", "()Ly6/i;", "l", "Ly6/f;", "()Ly6/f;", "Ly6/c;", "()Ly6/c;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Defined {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final AbstractC12938l fileSystem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final EnumC12742c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final EnumC12742c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final EnumC12742c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, InterfaceC7474n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, InterfaceC7474n> errorFactory;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final Function1<ImageRequest, InterfaceC7474n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final InterfaceC13110i sizeResolver;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final EnumC13107f scale;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final EnumC13104c precision;

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX WARN: Multi-variable type inference failed */
        public Defined(@Nullable AbstractC12938l abstractC12938l, @Nullable CoroutineContext coroutineContext, @Nullable CoroutineContext coroutineContext2, @Nullable CoroutineContext coroutineContext3, @Nullable EnumC12742c enumC12742c, @Nullable EnumC12742c enumC12742c2, @Nullable EnumC12742c enumC12742c3, @Nullable Function1<? super ImageRequest, ? extends InterfaceC7474n> function1, @Nullable Function1<? super ImageRequest, ? extends InterfaceC7474n> function2, @Nullable Function1<? super ImageRequest, ? extends InterfaceC7474n> function3, @Nullable InterfaceC13110i interfaceC13110i, @Nullable EnumC13107f enumC13107f, @Nullable EnumC13104c enumC13104c) {
            this.fileSystem = abstractC12938l;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = enumC12742c;
            this.diskCachePolicy = enumC12742c2;
            this.networkCachePolicy = enumC12742c3;
            this.placeholderFactory = function1;
            this.errorFactory = function2;
            this.fallbackFactory = function3;
            this.sizeResolver = interfaceC13110i;
            this.scale = enumC13107f;
            this.precision = enumC13104c;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC12742c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Function1<ImageRequest, InterfaceC7474n> m47562c() {
            return this.errorFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Function1<ImageRequest, InterfaceC7474n> m47563d() {
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
            return Intrinsics.m31980c(this.fileSystem, defined.fileSystem) && Intrinsics.m31980c(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && Intrinsics.m31980c(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && Intrinsics.m31980c(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && this.networkCachePolicy == defined.networkCachePolicy && Intrinsics.m31980c(this.placeholderFactory, defined.placeholderFactory) && Intrinsics.m31980c(this.errorFactory, defined.errorFactory) && Intrinsics.m31980c(this.fallbackFactory, defined.fallbackFactory) && Intrinsics.m31980c(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC12938l getFileSystem() {
            return this.fileSystem;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final EnumC12742c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public int hashCode() {
            AbstractC12938l abstractC12938l = this.fileSystem;
            int iHashCode = (abstractC12938l == null ? 0 : abstractC12938l.hashCode()) * 31;
            CoroutineContext coroutineContext = this.interceptorCoroutineContext;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.fetcherCoroutineContext;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.decoderCoroutineContext;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            EnumC12742c enumC12742c = this.memoryCachePolicy;
            int iHashCode5 = (iHashCode4 + (enumC12742c == null ? 0 : enumC12742c.hashCode())) * 31;
            EnumC12742c enumC12742c2 = this.diskCachePolicy;
            int iHashCode6 = (iHashCode5 + (enumC12742c2 == null ? 0 : enumC12742c2.hashCode())) * 31;
            EnumC12742c enumC12742c3 = this.networkCachePolicy;
            int iHashCode7 = (iHashCode6 + (enumC12742c3 == null ? 0 : enumC12742c3.hashCode())) * 31;
            Function1<ImageRequest, InterfaceC7474n> function1 = this.placeholderFactory;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1<ImageRequest, InterfaceC7474n> function2 = this.errorFactory;
            int iHashCode9 = (iHashCode8 + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function1<ImageRequest, InterfaceC7474n> function3 = this.fallbackFactory;
            int iHashCode10 = (iHashCode9 + (function3 == null ? 0 : function3.hashCode())) * 31;
            InterfaceC13110i interfaceC13110i = this.sizeResolver;
            int iHashCode11 = (iHashCode10 + (interfaceC13110i == null ? 0 : interfaceC13110i.hashCode())) * 31;
            EnumC13107f enumC13107f = this.scale;
            int iHashCode12 = (iHashCode11 + (enumC13107f == null ? 0 : enumC13107f.hashCode())) * 31;
            EnumC13104c enumC13104c = this.precision;
            return iHashCode12 + (enumC13104c != null ? enumC13104c.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC12742c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final Function1<ImageRequest, InterfaceC7474n> m47569j() {
            return this.placeholderFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final EnumC13104c getPrecision() {
            return this.precision;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final EnumC13107f getScale() {
            return this.scale;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final InterfaceC13110i getSizeResolver() {
            return this.sizeResolver;
        }

        @NotNull
        public String toString() {
            return "Defined(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ')';
        }
    }

    /* JADX INFO: renamed from: x6.g$d */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m31665d2 = {"Lx6/g$d;", "", "Lx6/g;", "request", "", "a", "(Lx6/g;)V", "d", "Lx6/e;", "result", "c", "(Lx6/g;Lx6/e;)V", "Lx6/t;", "b", "(Lx6/g;Lx6/t;)V", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface d {
        /* JADX INFO: renamed from: a */
        default void mo31032a(@NotNull ImageRequest request) {
        }

        /* JADX INFO: renamed from: b */
        default void mo31033b(@NotNull ImageRequest request, @NotNull SuccessResult result) {
        }

        /* JADX INFO: renamed from: c */
        default void mo31034c(@NotNull ImageRequest request, @NotNull ErrorResult result) {
        }

        /* JADX INFO: renamed from: d */
        default void mo31035d(@NotNull ImageRequest request) {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (r2v0 java.lang.Object)
      (r3v0 b7.c)
      (r4v0 x6.g$d)
      (r5v0 java.lang.String)
      (r6v0 java.util.Map)
      (r7v0 java.lang.String)
      (r8v0 xu.l)
      (r9v0 kotlin.Pair)
      (r10v0 m6.i$a)
      (r11v0 kotlin.coroutines.CoroutineContext)
      (r12v0 kotlin.coroutines.CoroutineContext)
      (r13v0 kotlin.coroutines.CoroutineContext)
      (r14v0 x6.c)
      (r15v0 x6.c)
      (r16v0 x6.c)
      (r17v0 s6.d$b)
      (r18v0 kotlin.jvm.functions.Function1)
      (r19v0 kotlin.jvm.functions.Function1)
      (r20v0 kotlin.jvm.functions.Function1)
      (r21v0 y6.i)
      (r22v0 y6.f)
      (r23v0 y6.c)
      (r24v0 k6.l)
      (r25v0 x6.g$c)
      (r26v0 x6.g$b)
     A[MD:(android.content.Context, java.lang.Object, b7.c, x6.g$d, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, xu.l, kotlin.Pair<? extends o6.j$a<?>, ? extends hu.c<?>>, m6.i$a, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, x6.c, x6.c, x6.c, s6.d$b, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, y6.i, y6.f, y6.c, k6.l, x6.g$c, x6.g$b):void (m)] (LINE:1) call: x6.g.<init>(android.content.Context, java.lang.Object, b7.c, x6.g$d, java.lang.String, java.util.Map, java.lang.String, xu.l, kotlin.Pair, m6.i$a, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, x6.c, x6.c, x6.c, s6.d$b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, y6.i, y6.f, y6.c, k6.l, x6.g$c, x6.g$b):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ImageRequest(Context context, Object obj, InterfaceC1251c interfaceC1251c, d dVar, String str, Map map, String str2, AbstractC12938l abstractC12938l, Pair pair, InterfaceC8435i.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, EnumC12742c enumC12742c, EnumC12742c enumC12742c2, EnumC12742c enumC12742c3, InterfaceC11178d.Key key, Function1 function1, Function1 function2, Function1 function3, InterfaceC13110i interfaceC13110i, EnumC13107f enumC13107f, EnumC13104c enumC13104c, Extras c7472l, Defined defined, Defaults defaults, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC1251c, dVar, str, map, str2, abstractC12938l, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, enumC12742c, enumC12742c2, enumC12742c3, key, function1, function2, function3, interfaceC13110i, enumC13107f, enumC13104c, c7472l, defined, defaults);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ a m47494A(ImageRequest imageRequest, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.m47521z(context);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final InterfaceC7474n m47495B() {
        InterfaceC7474n interfaceC7474nInvoke = this.placeholderFactory.invoke(this);
        return interfaceC7474nInvoke == null ? this.defaults.m47556m().invoke(this) : interfaceC7474nInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC7474n m47496a() {
        InterfaceC7474n interfaceC7474nInvoke = this.errorFactory.invoke(this);
        return interfaceC7474nInvoke == null ? this.defaults.m47548e().invoke(this) : interfaceC7474nInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final InterfaceC7474n m47497b() {
        InterfaceC7474n interfaceC7474nInvoke = this.fallbackFactory.invoke(this);
        return interfaceC7474nInvoke == null ? this.defaults.m47550g().invoke(this) : interfaceC7474nInvoke;
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
        return Intrinsics.m31980c(this.context, imageRequest.context) && Intrinsics.m31980c(this.data, imageRequest.data) && Intrinsics.m31980c(this.target, imageRequest.target) && Intrinsics.m31980c(this.listener, imageRequest.listener) && Intrinsics.m31980c(this.memoryCacheKey, imageRequest.memoryCacheKey) && Intrinsics.m31980c(this.memoryCacheKeyExtras, imageRequest.memoryCacheKeyExtras) && Intrinsics.m31980c(this.diskCacheKey, imageRequest.diskCacheKey) && Intrinsics.m31980c(this.fileSystem, imageRequest.fileSystem) && Intrinsics.m31980c(this.fetcherFactory, imageRequest.fetcherFactory) && Intrinsics.m31980c(this.decoderFactory, imageRequest.decoderFactory) && Intrinsics.m31980c(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && Intrinsics.m31980c(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && Intrinsics.m31980c(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && Intrinsics.m31980c(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && Intrinsics.m31980c(this.placeholderFactory, imageRequest.placeholderFactory) && Intrinsics.m31980c(this.errorFactory, imageRequest.errorFactory) && Intrinsics.m31980c(this.fallbackFactory, imageRequest.fallbackFactory) && Intrinsics.m31980c(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && Intrinsics.m31980c(this.extras, imageRequest.extras) && Intrinsics.m31980c(this.defined, imageRequest.defined) && Intrinsics.m31980c(this.defaults, imageRequest.defaults);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC8435i.a getDecoderFactory() {
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
        InterfaceC1251c interfaceC1251c = this.target;
        int iHashCode2 = (iHashCode + (interfaceC1251c == null ? 0 : interfaceC1251c.hashCode())) * 31;
        d dVar = this.listener;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.memoryCacheKeyExtras.hashCode()) * 31;
        String str2 = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fileSystem.hashCode()) * 31;
        Pair<InterfaceC9702j.a<?>, InterfaceC6567c<?>> pair = this.fetcherFactory;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC8435i.a aVar = this.decoderFactory;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31;
        InterfaceC11178d.Key key = this.placeholderMemoryCacheKey;
        return ((((((((((((((((((iHashCode7 + (key != null ? key.hashCode() : 0)) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode()) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC12742c getDiskCachePolicy() {
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
    /* JADX INFO: renamed from: m */
    public final Pair<InterfaceC9702j.a<?>, InterfaceC6567c<?>> m47508m() {
        return this.fetcherFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC12938l getFileSystem() {
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
    /* JADX INFO: renamed from: r */
    public final Map<String, String> m47513r() {
        return this.memoryCacheKeyExtras;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final EnumC12742c getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final EnumC12742c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=" + this.fetcherFactory + ", decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=" + this.placeholderMemoryCacheKey + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC11178d.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final EnumC13104c getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final EnumC13107f getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final InterfaceC13110i getSizeResolver() {
        return this.sizeResolver;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final InterfaceC1251c getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final a m47521z(@NotNull Context context) {
        return new a(this, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.Pair<? extends o6.j$a<?>, ? extends hu.c<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest(Context context, Object obj, InterfaceC1251c interfaceC1251c, d dVar, String str, Map<String, String> map, String str2, AbstractC12938l abstractC12938l, Pair<? extends InterfaceC9702j.a<?>, ? extends InterfaceC6567c<?>> pair, InterfaceC8435i.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, EnumC12742c enumC12742c, EnumC12742c enumC12742c2, EnumC12742c enumC12742c3, InterfaceC11178d.Key key, Function1<? super ImageRequest, ? extends InterfaceC7474n> function1, Function1<? super ImageRequest, ? extends InterfaceC7474n> function2, Function1<? super ImageRequest, ? extends InterfaceC7474n> function3, InterfaceC13110i interfaceC13110i, EnumC13107f enumC13107f, EnumC13104c enumC13104c, Extras c7472l, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = interfaceC1251c;
        this.listener = dVar;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = abstractC12938l;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar;
        this.interceptorCoroutineContext = coroutineContext;
        this.fetcherCoroutineContext = coroutineContext2;
        this.decoderCoroutineContext = coroutineContext3;
        this.memoryCachePolicy = enumC12742c;
        this.diskCachePolicy = enumC12742c2;
        this.networkCachePolicy = enumC12742c3;
        this.placeholderMemoryCacheKey = key;
        this.placeholderFactory = function1;
        this.errorFactory = function2;
        this.fallbackFactory = function3;
        this.sizeResolver = interfaceC13110i;
        this.scale = enumC13107f;
        this.precision = enumC13104c;
        this.extras = c7472l;
        this.defined = defined;
        this.defaults = defaults;
    }

    /* JADX INFO: renamed from: x6.g$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 @2\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÃ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b1\u00105R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b2\u0010;R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b7\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b6\u0010F¨\u0006G"}, m31665d2 = {"Lx6/g$b;", "", "Lxu/l;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lx6/g;", "Lk6/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ly6/i;", "sizeResolver", "Ly6/f;", "scale", "Ly6/c;", "precision", "Lk6/l;", "extras", "<init>", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;)V", "a", "(Lxu/l;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lx6/c;Lx6/c;Lx6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly6/i;Ly6/f;Ly6/c;Lk6/l;)Lx6/g$b;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lxu/l;", "i", "()Lxu/l;", "b", "Lkotlin/coroutines/CoroutineContext;", "j", "()Lkotlin/coroutines/CoroutineContext;", "c", "h", "d", "e", "Lx6/c;", "k", "()Lx6/c;", "f", "g", "l", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "Ly6/i;", "p", "()Ly6/i;", "Ly6/f;", "o", "()Ly6/f;", "Ly6/c;", "n", "()Ly6/c;", "Lk6/l;", "()Lk6/l;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Defaults {

        /* JADX INFO: renamed from: p */
        @NotNull
        public static final Defaults f45426p = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final AbstractC12938l fileSystem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC12742c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC12742c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC12742c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, InterfaceC7474n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, InterfaceC7474n> errorFactory;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final Function1<ImageRequest, InterfaceC7474n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC13110i sizeResolver;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC13107f scale;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC13104c precision;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @NotNull
        public final Extras extras;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n> */
        /* JADX WARN: Multi-variable type inference failed */
        public Defaults(@NotNull AbstractC12938l abstractC12938l, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2, @NotNull CoroutineContext coroutineContext3, @NotNull EnumC12742c enumC12742c, @NotNull EnumC12742c enumC12742c2, @NotNull EnumC12742c enumC12742c3, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> function1, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> function2, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> function3, @NotNull InterfaceC13110i interfaceC13110i, @NotNull EnumC13107f enumC13107f, @NotNull EnumC13104c enumC13104c, @NotNull Extras c7472l) {
            this.fileSystem = abstractC12938l;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = enumC12742c;
            this.diskCachePolicy = enumC12742c2;
            this.networkCachePolicy = enumC12742c3;
            this.placeholderFactory = function1;
            this.errorFactory = function2;
            this.fallbackFactory = function3;
            this.sizeResolver = interfaceC13110i;
            this.scale = enumC13107f;
            this.precision = enumC13104c;
            this.extras = c7472l;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Defaults m47545a(@NotNull AbstractC12938l fileSystem, @NotNull CoroutineContext interceptorCoroutineContext, @NotNull CoroutineContext fetcherCoroutineContext, @NotNull CoroutineContext decoderCoroutineContext, @NotNull EnumC12742c memoryCachePolicy, @NotNull EnumC12742c diskCachePolicy, @NotNull EnumC12742c networkCachePolicy, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> placeholderFactory, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> errorFactory, @NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> fallbackFactory, @NotNull InterfaceC13110i sizeResolver, @NotNull EnumC13107f scale, @NotNull EnumC13104c precision, @NotNull Extras extras) {
            return new Defaults(fileSystem, interceptorCoroutineContext, fetcherCoroutineContext, decoderCoroutineContext, memoryCachePolicy, diskCachePolicy, networkCachePolicy, placeholderFactory, errorFactory, fallbackFactory, sizeResolver, scale, precision, extras);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC12742c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Function1<ImageRequest, InterfaceC7474n> m47548e() {
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
            return Intrinsics.m31980c(this.fileSystem, defaults.fileSystem) && Intrinsics.m31980c(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && Intrinsics.m31980c(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && Intrinsics.m31980c(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && Intrinsics.m31980c(this.placeholderFactory, defaults.placeholderFactory) && Intrinsics.m31980c(this.errorFactory, defaults.errorFactory) && Intrinsics.m31980c(this.fallbackFactory, defaults.fallbackFactory) && Intrinsics.m31980c(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && Intrinsics.m31980c(this.extras, defaults.extras);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Extras getExtras() {
            return this.extras;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Function1<ImageRequest, InterfaceC7474n> m47550g() {
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
        public final AbstractC12938l getFileSystem() {
            return this.fileSystem;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final EnumC12742c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        @NotNull
        /* JADX INFO: renamed from: l, reason: from getter */
        public final EnumC12742c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final Function1<ImageRequest, InterfaceC7474n> m47556m() {
            return this.placeholderFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final EnumC13104c getPrecision() {
            return this.precision;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final EnumC13107f getScale() {
            return this.scale;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final InterfaceC13110i getSizeResolver() {
            return this.sizeResolver;
        }

        @NotNull
        public String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ')';
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a6: CONSTRUCTOR 
          (wrap xu.l:?: TERNARY null = ((wrap int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap xu.l:0x0006: INVOKE  STATIC call: e7.n.a():xu.l A[MD:():xu.l (m), WRAPPED] (LINE:16)) : (r14v0 xu.l))
          (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000e: SGET  A[WRAPPED] (LINE:17) kotlin.coroutines.e.a kotlin.coroutines.e) : (r15v0 kotlin.coroutines.CoroutineContext))
          (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0016: INVOKE  STATIC call: e7.f.a():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:18)) : (r16v0 kotlin.coroutines.CoroutineContext))
          (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x001d: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0021: INVOKE  STATIC call: e7.f.a():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:19)) : (r17v0 kotlin.coroutines.CoroutineContext))
          (wrap x6.c:?: TERNARY null = ((wrap int:0x0028: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x002c: SGET  A[WRAPPED] (LINE:20) x6.c.c x6.c) : (r18v0 x6.c))
          (wrap x6.c:?: TERNARY null = ((wrap int:0x0031: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0035: SGET  A[WRAPPED] (LINE:21) x6.c.c x6.c) : (r19v0 x6.c))
          (wrap x6.c:?: TERNARY null = ((wrap int:0x003a: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x003e: SGET  A[WRAPPED] (LINE:22) x6.c.c x6.c) : (r20v0 x6.c))
          (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0043: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0047: INVOKE  STATIC call: e7.h0.k():kotlin.jvm.functions.Function1 A[MD:():kotlin.jvm.functions.Function1<x6.g, k6.n> (m), WRAPPED] (LINE:23)) : (r21v0 kotlin.jvm.functions.Function1))
          (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x004e: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0052: INVOKE  STATIC call: e7.h0.k():kotlin.jvm.functions.Function1 A[MD:():kotlin.jvm.functions.Function1<x6.g, k6.n> (m), WRAPPED] (LINE:24)) : (r22v0 kotlin.jvm.functions.Function1))
          (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0059: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x005d: INVOKE  STATIC call: e7.h0.k():kotlin.jvm.functions.Function1 A[MD:():kotlin.jvm.functions.Function1<x6.g, k6.n> (m), WRAPPED] (LINE:25)) : (r23v0 kotlin.jvm.functions.Function1))
          (wrap y6.i:?: TERNARY null = ((wrap int:0x0064: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0068: SGET  A[WRAPPED] (LINE:26) y6.i.b y6.i) : (r24v0 y6.i))
          (wrap y6.f:?: TERNARY null = ((wrap int:0x006d: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0071: SGET  A[WRAPPED] (LINE:27) y6.f.b y6.f) : (r25v0 y6.f))
          (wrap y6.c:?: TERNARY null = ((wrap int:0x0076: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x007a: SGET  A[WRAPPED] (LINE:28) y6.c.a y6.c) : (r26v0 y6.c))
          (wrap k6.l:?: TERNARY null = ((wrap int:0x007f: ARITH (r28v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0085: SGET  A[WRAPPED] (LINE:29) k6.l.c k6.l) : (r27v0 k6.l))
         A[MD:(xu.l, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, x6.c, x6.c, x6.c, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, kotlin.jvm.functions.Function1<? super x6.g, ? extends k6.n>, y6.i, y6.f, y6.c, k6.l):void (m)] (LINE:30) call: x6.g.b.<init>(xu.l, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, x6.c, x6.c, x6.c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, y6.i, y6.f, y6.c, k6.l):void type: THIS */
        public /* synthetic */ Defaults(AbstractC12938l abstractC12938l, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, EnumC12742c enumC12742c, EnumC12742c enumC12742c2, EnumC12742c enumC12742c3, Function1 function1, Function1 function2, Function1 function3, InterfaceC13110i interfaceC13110i, EnumC13107f enumC13107f, EnumC13104c enumC13104c, Extras c7472l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C4868n.m23474a() : abstractC12938l, (i10 & 2) != 0 ? C7721e.f29393a : coroutineContext, (i10 & 4) != 0 ? C4856f.m23433a() : coroutineContext2, (i10 & 8) != 0 ? C4856f.m23433a() : coroutineContext3, (i10 & 16) != 0 ? EnumC12742c.ENABLED : enumC12742c, (i10 & 32) != 0 ? EnumC12742c.ENABLED : enumC12742c2, (i10 & 64) != 0 ? EnumC12742c.ENABLED : enumC12742c3, (i10 & 128) != 0 ? C4861h0.m23444k() : function1, (i10 & 256) != 0 ? C4861h0.m23444k() : function2, (i10 & 512) != 0 ? C4861h0.m23444k() : function3, (i10 & 1024) != 0 ? InterfaceC13110i.f46349b : interfaceC13110i, (i10 & 2048) != 0 ? EnumC13107f.FIT : enumC13107f, (i10 & 4096) != 0 ? EnumC13104c.EXACT : enumC13104c, (i10 & 8192) != 0 ? Extras.f28770c : c7472l);
        }
    }

    /* JADX INFO: renamed from: x6.g$a */
    @Metadata(m31664d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b7\u00105J\u0017\u0010:\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u00002\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001080<¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010GR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010PR\u0016\u0010S\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010HR\u0018\u0010U\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010WR,\u0010]\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030Z\u0012\b\u0012\u0006\u0012\u0002\b\u00030[\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010aR\u0018\u0010g\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010fR\u0018\u0010i\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010fR\u0018\u0010l\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010kR&\u0010n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010mR&\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010mR&\u0010p\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010mR\u0018\u0010s\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010HR \u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010{R\u0011\u0010\u007f\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\bR\u0010~¨\u0006\u0080\u0001"}, m31665d2 = {"Lx6/g$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lx6/g;", "request", "(Lx6/g;Landroid/content/Context;)V", "data", "c", "(Ljava/lang/Object;)Lx6/g$a;", "Lb7/c;", "target", "v", "(Lb7/c;)Lx6/g$a;", "", "key", "j", "(Ljava/lang/String;)Lx6/g$a;", "value", "k", "(Ljava/lang/String;Ljava/lang/String;)Lx6/g$a;", "f", "", "width", "height", "s", "(II)Lx6/g$a;", "Ly6/g;", "size", "t", "(Ly6/g;)Lx6/g$a;", "Ly6/i;", "resolver", "u", "(Ly6/i;)Lx6/g$a;", "Ly6/f;", "scale", "r", "(Ly6/f;)Lx6/g$a;", "Ly6/c;", "precision", "q", "(Ly6/c;)Lx6/g$a;", "Lm6/i$a;", "factory", "d", "(Lm6/i$a;)Lx6/g$a;", "Lx6/c;", "policy", "l", "(Lx6/c;)Lx6/g$a;", "g", "m", "Lk6/n;", "image", "n", "(Lk6/n;)Lx6/g$a;", "Lkotlin/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)Lx6/g$a;", "Lx6/g$b;", "defaults", "e", "(Lx6/g$b;)Lx6/g$a;", "b", "()Lx6/g;", "a", "Landroid/content/Context;", "Lx6/g$b;", "Ljava/lang/Object;", "Lb7/c;", "Lx6/g$d;", "Lx6/g$d;", "listener", "Ljava/lang/String;", "memoryCacheKey", "", "Z", "memoryCacheKeyExtrasAreMutable", "h", "lazyMemoryCacheKeyExtras", "i", "diskCacheKey", "Lxu/l;", "Lxu/l;", "fileSystem", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "Lkotlin/Pair;", "fetcherFactory", "Lm6/i$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "p", "Lx6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Ls6/d$b;", "Ls6/d$b;", "placeholderMemoryCacheKey", "Lkotlin/jvm/functions/Function1;", "placeholderFactory", "errorFactory", "fallbackFactory", "w", "Ly6/i;", "sizeResolver", "x", "Ly6/f;", "y", "Ly6/c;", "z", "lazyExtras", "", "()Ljava/util/Map;", "memoryCacheKeyExtras", "Lk6/l$a;", "()Lk6/l$a;", "extras", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Defaults defaults;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Object data;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public InterfaceC1251c target;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public d listener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public String memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean memoryCacheKeyExtrasAreMutable;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public Object lazyMemoryCacheKeyExtras;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public String diskCacheKey;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public AbstractC12938l fileSystem;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public Pair<? extends InterfaceC9702j.a<?>, ? extends InterfaceC6567c<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public InterfaceC8435i.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public EnumC12742c memoryCachePolicy;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public EnumC12742c diskCachePolicy;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public EnumC12742c networkCachePolicy;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public InterfaceC11178d.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends InterfaceC7474n> placeholderFactory;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends InterfaceC7474n> errorFactory;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public Function1<? super ImageRequest, ? extends InterfaceC7474n> fallbackFactory;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public InterfaceC13110i sizeResolver;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public EnumC13107f scale;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public EnumC13104c precision;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @NotNull
        public Object lazyExtras;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NotNull Context context) {
            this.context = context;
            this.defaults = Defaults.f45426p;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.lazyMemoryCacheKeyExtras = C7690k0.m31795j();
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
            this.placeholderFactory = C4861h0.m23444k();
            this.errorFactory = C4861h0.m23444k();
            this.fallbackFactory = C4861h0.m23444k();
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.f28770c;
        }

        /* JADX INFO: renamed from: p */
        public static final InterfaceC7474n m47523p(InterfaceC7474n interfaceC7474n, ImageRequest imageRequest) {
            return interfaceC7474n;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ImageRequest m47524b() {
            Map mapM23424d;
            Extras c7472lM31059a;
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = C12752m.f45468a;
            }
            Object obj2 = obj;
            InterfaceC1251c interfaceC1251c = this.target;
            d dVar = this.listener;
            String str = this.memoryCacheKey;
            Object obj3 = this.lazyMemoryCacheKeyExtras;
            if (Intrinsics.m31980c(obj3, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapM23424d = C4852d.m23424d(C7739h0.m32039d(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapM23424d = (Map) obj3;
            }
            Map map = mapM23424d;
            Intrinsics.m31981d(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.diskCacheKey;
            AbstractC12938l fileSystem = this.fileSystem;
            if (fileSystem == null) {
                fileSystem = this.defaults.getFileSystem();
            }
            AbstractC12938l abstractC12938l = fileSystem;
            Pair<? extends InterfaceC9702j.a<?>, ? extends InterfaceC6567c<?>> pair = this.fetcherFactory;
            InterfaceC8435i.a aVar = this.decoderFactory;
            EnumC12742c memoryCachePolicy = this.memoryCachePolicy;
            if (memoryCachePolicy == null) {
                memoryCachePolicy = this.defaults.getMemoryCachePolicy();
            }
            EnumC12742c enumC12742c = memoryCachePolicy;
            EnumC12742c diskCachePolicy = this.diskCachePolicy;
            if (diskCachePolicy == null) {
                diskCachePolicy = this.defaults.getDiskCachePolicy();
            }
            EnumC12742c enumC12742c2 = diskCachePolicy;
            EnumC12742c networkCachePolicy = this.networkCachePolicy;
            if (networkCachePolicy == null) {
                networkCachePolicy = this.defaults.getNetworkCachePolicy();
            }
            EnumC12742c enumC12742c3 = networkCachePolicy;
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
            InterfaceC11178d.Key key = this.placeholderMemoryCacheKey;
            Function1 function1M47556m = this.placeholderFactory;
            if (function1M47556m == null) {
                function1M47556m = this.defaults.m47556m();
            }
            Function1 function1 = function1M47556m;
            Function1 function1M47548e = this.errorFactory;
            if (function1M47548e == null) {
                function1M47548e = this.defaults.m47548e();
            }
            Function1 function2 = function1M47548e;
            Function1 function1M47550g = this.fallbackFactory;
            if (function1M47550g == null) {
                function1M47550g = this.defaults.m47550g();
            }
            Function1 function3 = function1M47550g;
            InterfaceC13110i sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = this.defaults.getSizeResolver();
            }
            InterfaceC13110i interfaceC13110i = sizeResolver;
            EnumC13107f scale = this.scale;
            if (scale == null) {
                scale = this.defaults.getScale();
            }
            EnumC13107f enumC13107f = scale;
            EnumC13104c precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            EnumC13104c enumC13104c = precision;
            Object obj4 = this.lazyExtras;
            if (obj4 instanceof Extras.a) {
                c7472lM31059a = ((Extras.a) obj4).m31059a();
            } else {
                if (!(obj4 instanceof Extras)) {
                    throw new AssertionError();
                }
                c7472lM31059a = (Extras) obj4;
            }
            return new ImageRequest(context, obj2, interfaceC1251c, dVar, str, map, str2, abstractC12938l, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, enumC12742c, enumC12742c2, enumC12742c3, key, function1, function2, function3, interfaceC13110i, enumC13107f, enumC13104c, c7472lM31059a, new Defined(this.fileSystem, this.interceptorCoroutineContext, this.fetcherCoroutineContext, this.decoderCoroutineContext, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy, this.placeholderFactory, this.errorFactory, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults, null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m47525c(@Nullable Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m47526d(@NotNull InterfaceC8435i.a factory) {
            this.decoderFactory = factory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m47527e(@NotNull Defaults defaults) {
            this.defaults = defaults;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m47528f(@Nullable String key) {
            this.diskCacheKey = key;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m47529g(@NotNull EnumC12742c policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Extras.a m47530h() {
            Object obj = this.lazyExtras;
            if (obj instanceof Extras.a) {
                return (Extras.a) obj;
            }
            if (!(obj instanceof Extras)) {
                throw new AssertionError();
            }
            Extras.a aVarM31058d = ((Extras) obj).m31058d();
            this.lazyExtras = aVarM31058d;
            return aVarM31058d;
        }

        /* JADX INFO: renamed from: i */
        public final Map<String, String> m47531i() {
            Object objM31809x = this.lazyMemoryCacheKeyExtras;
            if (!Intrinsics.m31980c(objM31809x, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                if (!(objM31809x instanceof Map)) {
                    throw new AssertionError();
                }
                objM31809x = C7690k0.m31809x((Map) objM31809x);
                this.lazyMemoryCacheKeyExtras = objM31809x;
                this.memoryCacheKeyExtrasAreMutable = true;
            }
            Intrinsics.m31981d(objM31809x, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            return C7739h0.m32039d(objM31809x);
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final a m47532j(@Nullable String key) {
            this.memoryCacheKey = key;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final a m47533k(@NotNull String key, @Nullable String value) {
            if (value != null) {
                m47531i().put(key, value);
                return this;
            }
            m47531i().remove(key);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final a m47534l(@NotNull EnumC12742c policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final a m47535m(@NotNull EnumC12742c policy) {
            this.networkCachePolicy = policy;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final a m47536n(@Nullable final InterfaceC7474n image) {
            return m47537o(new Function1() { // from class: x6.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageRequest.a.m47523p(image, (ImageRequest) obj);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final a m47537o(@NotNull Function1<? super ImageRequest, ? extends InterfaceC7474n> factory) {
            this.placeholderFactory = factory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final a m47538q(@NotNull EnumC13104c precision) {
            this.precision = precision;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final a m47539r(@NotNull EnumC13107f scale) {
            this.scale = scale;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final a m47540s(int width, int height) {
            return m47541t(C13109h.m48712a(width, height));
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final a m47541t(@NotNull Size size) {
            return m47542u(C13111j.m48714a(size));
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final a m47542u(@NotNull InterfaceC13110i resolver) {
            this.sizeResolver = resolver;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final a m47543v(@Nullable InterfaceC1251c target) {
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
            this.lazyMemoryCacheKeyExtras = imageRequest.m47513r();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.fileSystem = imageRequest.getDefined().getFileSystem();
            this.fetcherFactory = imageRequest.m47508m();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.interceptorCoroutineContext = imageRequest.getDefined().getInterceptorCoroutineContext();
            this.fetcherCoroutineContext = imageRequest.getDefined().getFetcherCoroutineContext();
            this.decoderCoroutineContext = imageRequest.getDefined().getDecoderCoroutineContext();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderFactory = imageRequest.getDefined().m47569j();
            this.errorFactory = imageRequest.getDefined().m47562c();
            this.fallbackFactory = imageRequest.getDefined().m47563d();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            this.precision = imageRequest.getDefined().getPrecision();
            this.lazyExtras = imageRequest.getExtras();
        }
    }
}
