package q6;

import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import f7.d0;
import f7.h0;
import f7.i0;
import f7.u;
import gu.l;
import gu.m;
import java.util.concurrent.CancellationException;
import l6.j;
import l6.n;
import l6.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import p6.ImageFetchResult;
import p6.SourceFetchResult;
import p6.i;
import y6.ImageRequest;
import y6.Options;
import y6.SuccessResult;
import y6.k;
import y6.r;
import z6.Size;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u0002&\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 J@\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lq6/a;", "Lq6/d;", "Ll6/s;", "imageLoader", "Lf7/d0;", "systemCallbacks", "Ly6/r;", "requestService", "Lf7/u;", "logger", "<init>", "(Ll6/s;Lf7/d0;Ly6/r;Lf7/u;)V", "Lq6/d$a;", "chain", "Ly6/k;", "a", "(Lq6/d$a;Leu/b;)Ljava/lang/Object;", "Ly6/g;", "request", BuildConfig.FLAVOR, "mappedData", "Ly6/p;", "options", "Ll6/j;", "eventListener", "Lq6/a$b;", "h", "(Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;", "Ll6/h;", "components", "Lp6/i;", "i", "(Ll6/h;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;", "Lp6/o;", "fetchResult", "g", "(Lp6/o;Ll6/h;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;", "Ll6/s;", "b", "Lf7/d0;", "c", "Ly6/r;", "d", "Lf7/u;", "Lt6/e;", "e", "Lt6/e;", "memoryCacheService", "f", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements q6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r requestService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final u logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t6.e memoryCacheService;

    /* JADX INFO: renamed from: q6.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lq6/a$b;", BuildConfig.FLAVOR, "Ll6/n;", "image", BuildConfig.FLAVOR, "isSampled", "Ln6/f;", "dataSource", BuildConfig.FLAVOR, "diskCacheKey", "<init>", "(Ll6/n;ZLn6/f;Ljava/lang/String;)V", "a", "(Ll6/n;ZLn6/f;Ljava/lang/String;)Lq6/a$b;", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ll6/n;", "e", "()Ll6/n;", "b", "Z", "f", "()Z", "c", "Ln6/f;", "()Ln6/f;", "d", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n6.f dataSource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String diskCacheKey;

        public ExecuteResult(@NotNull n nVar, boolean z10, @NotNull n6.f fVar, @Nullable String str) {
            this.image = nVar;
            this.isSampled = z10;
            this.dataSource = fVar;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, n nVar, boolean z10, n6.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                nVar = executeResult.image;
            }
            if ((i10 & 2) != 0) {
                z10 = executeResult.isSampled;
            }
            if ((i10 & 4) != 0) {
                fVar = executeResult.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.a(nVar, z10, fVar, str);
        }

        @NotNull
        public final ExecuteResult a(@NotNull n image, boolean isSampled, @NotNull n6.f dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final n6.f getDataSource() {
            return this.dataSource;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) other;
            return Intrinsics.c(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && Intrinsics.c(this.diskCacheKey, executeResult.diskCacheKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public int hashCode() {
            int iHashCode = ((((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode()) * 31;
            String str = this.diskCacheKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "decode")
    public static final class c extends gu.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29876t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29877u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29878v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29879w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f29880x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f29881y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f29882z;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    public static final class d extends gu.d {
        public Object A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29883t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29884u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29885v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29886w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f29887x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f29888y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f29889z;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lq6/a$b;", "<anonymous>", "(Lav/p0;)Lq6/a$b;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, eu.b<? super ExecuteResult>, Object> {
        public final /* synthetic */ j A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f29890t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<i> f29892v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<l6.h> f29893w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f29894x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object f29895y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c0<Options> f29896z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<i> c0Var, c0<l6.h> c0Var2, ImageRequest imageRequest, Object obj, c0<Options> c0Var3, j jVar, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f29892v = c0Var;
            this.f29893w = c0Var2;
            this.f29894x = imageRequest;
            this.f29895y = obj;
            this.f29896z = c0Var3;
            this.A = jVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new e(this.f29892v, this.f29893w, this.f29894x, this.f29895y, this.f29896z, this.A, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super ExecuteResult> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f29890t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f29892v.f21575a;
            l6.h hVar = this.f29893w.f21575a;
            ImageRequest imageRequest = this.f29894x;
            Object obj2 = this.f29895y;
            Options options = this.f29896z.f21575a;
            j jVar = this.A;
            this.f29890t = 1;
            Object objG = aVar.g(sourceFetchResult, hVar, imageRequest, obj2, options, jVar, this);
            return objG == objE ? objE : objG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    public static final class f extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29897t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29898u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29899v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29900w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f29901x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f29902y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f29903z;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    public static final class g extends gu.d {
        public Object A;
        public Object B;
        public Object C;
        public /* synthetic */ Object D;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29904t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29905u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29906v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29907w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f29908x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f29909y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f29910z;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/t;", "<anonymous>", "(Lav/p0;)Ly6/t;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, eu.b<? super SuccessResult>, Object> {
        public final /* synthetic */ q6.d.a A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f29911t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f29913v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object f29914w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Options f29915x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ j f29916y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ t6.d.Key f29917z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ImageRequest imageRequest, Object obj, Options options, j jVar, t6.d.Key key, q6.d.a aVar, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f29913v = imageRequest;
            this.f29914w = obj;
            this.f29915x = options;
            this.f29916y = jVar;
            this.f29917z = key;
            this.A = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new h(this.f29913v, this.f29914w, this.f29915x, this.f29916y, this.f29917z, this.A, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super SuccessResult> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object objE = fu.c.e();
            int i10 = this.f29911t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f29913v;
                Object obj2 = this.f29914w;
                Options options = this.f29915x;
                j jVar = this.f29916y;
                this.f29911t = 1;
                objH = aVar.h(imageRequest, obj2, options, jVar, this);
                if (objH == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                objH = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) objH;
            a.this.systemCallbacks.a();
            boolean zH = a.this.memoryCacheService.h(this.f29917z, this.f29913v, executeResult);
            n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f29913v;
            n6.f dataSource = executeResult.getDataSource();
            t6.d.Key key = this.f29917z;
            if (!zH) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), h0.p(this.A));
        }
    }

    public a(@NotNull s sVar, @NotNull d0 d0Var, @NotNull r rVar, @Nullable u uVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = d0Var;
        this.requestService = rVar;
        this.logger = uVar;
        this.memoryCacheService = new t6.e(sVar, rVar, uVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // q6.d
    @Nullable
    public Object a(@NotNull q6.d.a aVar, @NotNull eu.b<? super k> bVar) throws Throwable {
        g gVar;
        q6.d.a aVar2 = aVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.F = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.D;
        Object objE = fu.c.e();
        int i11 = gVar2.F;
        if (i11 == 0) {
            o.b(obj);
            try {
                ImageRequest imageRequestA = aVar2.getRequest();
                Object data = imageRequestA.getData();
                Size sizeI = aVar2.getSize();
                j jVarM = h0.m(aVar2);
                Options optionsC = this.requestService.c(imageRequestA, sizeI);
                z6.f scale = optionsC.getScale();
                jVarM.l(imageRequestA, data);
                Object objJ = this.imageLoader.getComponents().j(data, optionsC);
                jVarM.k(imageRequestA, objJ);
                t6.d.Key keyF = this.memoryCacheService.f(imageRequestA, objJ, optionsC, jVarM);
                t6.d.Value valueA = keyF != null ? this.memoryCacheService.a(imageRequestA, keyF, sizeI, scale) : null;
                if (valueA != null) {
                    return this.memoryCacheService.g(aVar2, imageRequestA, keyF, valueA);
                }
                CoroutineContext fetcherCoroutineContext = imageRequestA.getFetcherCoroutineContext();
                h hVar = new h(imageRequestA, objJ, optionsC, jVarM, keyF, aVar2, null);
                gVar2.f29904t = aVar2;
                gVar2.f29905u = l.a(imageRequestA);
                gVar2.f29906v = l.a(data);
                gVar2.f29907w = l.a(sizeI);
                gVar2.f29908x = l.a(jVarM);
                gVar2.f29909y = l.a(optionsC);
                gVar2.f29910z = l.a(scale);
                gVar2.A = l.a(objJ);
                gVar2.B = l.a(keyF);
                gVar2.C = l.a(valueA);
                gVar2.F = 1;
                Object objG = av.i.g(fetcherCoroutineContext, hVar, gVar2);
                return objG == objE ? objE : objG;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q6.d.a aVar3 = (q6.d.a) gVar2.f29904t;
            try {
                o.b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return h0.c(aVar2.getRequest(), th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(p6.SourceFetchResult r7, l6.h r8, y6.ImageRequest r9, java.lang.Object r10, y6.Options r11, l6.j r12, eu.b<? super q6.a.ExecuteResult> r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.g(p6.o, l6.h, y6.g, java.lang.Object, y6.p, l6.j, eu.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x023f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0244  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0226, code lost:
    
        if (r0 == r9) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, l6.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, l6.h] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, y6.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ImageRequest imageRequest, Object obj, Options options, j jVar, eu.b<? super ExecuteResult> bVar) throws Throwable {
        d dVar;
        c0 c0Var;
        ImageRequest imageRequest2;
        Object obj2;
        j jVar2;
        c0 c0Var2;
        T t8;
        c0 c0Var3;
        c0 c0Var4;
        c0 c0Var5;
        Object obj3;
        a aVar;
        ImageRequest imageRequest3;
        c0 c0Var6;
        Object obj4;
        c0 c0Var7;
        j jVar3;
        Object obj5;
        ImageRequest imageRequest4;
        c0 c0Var8;
        ExecuteResult executeResult;
        SourceFetchResult sourceFetchResult;
        n6.s source;
        Object obj6;
        n6.s source2;
        Object obj7;
        Object obj8;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.D = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        d dVar2 = dVar;
        Object obj9 = dVar2.B;
        Object objE = fu.c.e();
        int i11 = dVar2.D;
        if (i11 == 0) {
            o.b(obj9);
            c0 c0Var9 = new c0();
            T t10 = options;
            c0Var9.f21575a = t10;
            c0 c0Var10 = new c0();
            c0Var10.f21575a = this.imageLoader.getComponents();
            c0 c0Var11 = new c0();
            try {
                c0Var9.f21575a = this.requestService.a((Options) c0Var9.f21575a);
                if (imageRequest.m() != null || imageRequest.getDecoderFactory() != null) {
                    c0Var10.f21575a = h0.e(h0.d(((l6.h) c0Var10.f21575a).k(), imageRequest.m()), imageRequest.getDecoderFactory()).p();
                }
                l6.h hVar = (l6.h) c0Var10.f21575a;
                Options options2 = (Options) c0Var9.f21575a;
                dVar2.f29883t = imageRequest;
                dVar2.f29884u = obj;
                dVar2.f29885v = l.a(t10);
                dVar2.f29886w = jVar;
                dVar2.f29887x = c0Var9;
                dVar2.f29888y = c0Var10;
                dVar2.f29889z = c0Var11;
                dVar2.A = c0Var11;
                dVar2.D = 1;
                Object objI = i(hVar, imageRequest, obj, options2, jVar, dVar2);
                if (objI != objE) {
                    imageRequest2 = imageRequest;
                    obj2 = obj;
                    jVar2 = jVar;
                    c0Var2 = c0Var9;
                    t8 = objI;
                    c0Var3 = c0Var10;
                    c0Var4 = c0Var11;
                    c0Var5 = c0Var4;
                    obj3 = t10;
                }
                return objE;
            } catch (Throwable th2) {
                th = th2;
                c0Var = c0Var11;
                T t11 = c0Var.f21575a;
                if (t11 instanceof SourceFetchResult) {
                }
                if (sourceFetchResult != null && (source = sourceFetchResult.getSource()) != null) {
                    h0.i(source);
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c0Var = (c0) dVar2.f29889z;
                c0Var6 = (c0) dVar2.f29888y;
                c0Var7 = (c0) dVar2.f29887x;
                jVar3 = (j) dVar2.f29886w;
                Object obj10 = (Options) dVar2.f29885v;
                Object obj11 = dVar2.f29884u;
                imageRequest3 = (ImageRequest) dVar2.f29883t;
                try {
                    o.b(obj9);
                    aVar = this;
                    obj4 = obj11;
                    dVar2 = dVar2;
                    obj7 = obj9;
                    obj5 = obj10;
                    jVar2 = jVar3;
                    obj6 = obj5;
                    obj2 = obj4;
                    c0Var8 = c0Var6;
                    c0Var2 = c0Var7;
                    imageRequest4 = imageRequest3;
                    executeResult = (ExecuteResult) obj7;
                    T t12 = c0Var.f21575a;
                    sourceFetchResult = t12 instanceof SourceFetchResult ? (SourceFetchResult) t12 : null;
                    if (sourceFetchResult != null && (source2 = sourceFetchResult.getSource()) != null) {
                        h0.i(source2);
                    }
                    Options options3 = (Options) c0Var2.f21575a;
                    c0 c0Var12 = c0Var2;
                    j jVar4 = jVar2;
                    u uVar = aVar.logger;
                    dVar2.f29883t = l.a(imageRequest4);
                    dVar2.f29884u = l.a(obj2);
                    dVar2.f29885v = l.a(obj6);
                    dVar2.f29886w = l.a(jVar4);
                    dVar2.f29887x = l.a(c0Var12);
                    dVar2.f29888y = l.a(c0Var8);
                    dVar2.f29889z = l.a(c0Var);
                    dVar2.A = l.a(executeResult);
                    dVar2.D = 3;
                    Object objA = b.a(executeResult, imageRequest4, options3, jVar4, uVar, dVar2);
                    obj8 = objA;
                } catch (Throwable th3) {
                    th = th3;
                    T t13 = c0Var.f21575a;
                    sourceFetchResult = t13 instanceof SourceFetchResult ? (SourceFetchResult) t13 : null;
                    if (sourceFetchResult != null) {
                        h0.i(source);
                    }
                    throw th;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj9);
                obj8 = obj9;
            }
            ExecuteResult executeResult2 = (ExecuteResult) obj8;
            i0.k(executeResult2.getImage());
            return executeResult2;
        }
        c0Var4 = (c0) dVar2.A;
        c0Var5 = (c0) dVar2.f29889z;
        c0 c0Var13 = (c0) dVar2.f29888y;
        c0 c0Var14 = (c0) dVar2.f29887x;
        j jVar5 = (j) dVar2.f29886w;
        Object obj12 = (Options) dVar2.f29885v;
        Object obj13 = dVar2.f29884u;
        ImageRequest imageRequest5 = (ImageRequest) dVar2.f29883t;
        try {
            o.b(obj9);
            c0Var3 = c0Var13;
            imageRequest2 = imageRequest5;
            jVar2 = jVar5;
            c0Var2 = c0Var14;
            obj2 = obj13;
            t8 = obj9;
            obj3 = obj12;
        } catch (Throwable th4) {
            th = th4;
            c0Var = c0Var5;
            T t14 = c0Var.f21575a;
            if (t14 instanceof SourceFetchResult) {
            }
            if (sourceFetchResult != null) {
                h0.i(source);
            }
            throw th;
        }
        Object obj14 = obj3;
        c0Var4.f21575a = t8;
        T t15 = c0Var5.f21575a;
        i iVar = (i) t15;
        if (iVar instanceof SourceFetchResult) {
            try {
                CoroutineContext decoderCoroutineContext = imageRequest2.getDecoderCoroutineContext();
                c0Var = c0Var5;
                c0 c0Var15 = c0Var3;
                try {
                    e eVar = new e(c0Var, c0Var15, imageRequest2, obj2, c0Var2, jVar2, null);
                    aVar = this;
                    ImageRequest imageRequest6 = imageRequest2;
                    dVar2.f29883t = imageRequest6;
                    dVar2.f29884u = l.a(obj2);
                    dVar2.f29885v = l.a(obj14);
                    dVar2.f29886w = jVar2;
                    dVar2.f29887x = c0Var2;
                    dVar2.f29888y = l.a(c0Var15);
                    dVar2.f29889z = c0Var;
                    dVar2.A = null;
                    dVar2.D = 2;
                    Object objG = av.i.g(decoderCoroutineContext, eVar, dVar2);
                    if (objG != objE) {
                        imageRequest3 = imageRequest6;
                        c0Var = c0Var;
                        c0Var6 = c0Var15;
                        obj4 = obj2;
                        c0Var7 = c0Var2;
                        jVar3 = jVar2;
                        obj5 = obj14;
                        obj7 = objG;
                        jVar2 = jVar3;
                        obj6 = obj5;
                        obj2 = obj4;
                        c0Var8 = c0Var6;
                        c0Var2 = c0Var7;
                        imageRequest4 = imageRequest3;
                        executeResult = (ExecuteResult) obj7;
                        T t16 = c0Var.f21575a;
                        if (t16 instanceof SourceFetchResult) {
                        }
                        if (sourceFetchResult != null) {
                            h0.i(source2);
                        }
                        Options options4 = (Options) c0Var2.f21575a;
                        c0 c0Var16 = c0Var2;
                        j jVar6 = jVar2;
                        u uVar2 = aVar.logger;
                        dVar2.f29883t = l.a(imageRequest4);
                        dVar2.f29884u = l.a(obj2);
                        dVar2.f29885v = l.a(obj6);
                        dVar2.f29886w = l.a(jVar6);
                        dVar2.f29887x = l.a(c0Var16);
                        dVar2.f29888y = l.a(c0Var8);
                        dVar2.f29889z = l.a(c0Var);
                        dVar2.A = l.a(executeResult);
                        dVar2.D = 3;
                        Object objA2 = b.a(executeResult, imageRequest4, options4, jVar6, uVar2, dVar2);
                        obj8 = objA2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    T t17 = c0Var.f21575a;
                    if (t17 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult != null) {
                        h0.i(source);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c0Var = c0Var5;
                T t18 = c0Var.f21575a;
                if (t18 instanceof SourceFetchResult) {
                }
                if (sourceFetchResult != null) {
                    h0.i(source);
                }
                throw th;
            }
        } else {
            ImageRequest imageRequest7 = imageRequest2;
            c0 c0Var17 = c0Var3;
            aVar = this;
            if (!(iVar instanceof ImageFetchResult)) {
                throw new zt.l();
            }
            imageRequest4 = imageRequest7;
            c0Var8 = c0Var17;
            c0 c0Var18 = c0Var5;
            executeResult = new ExecuteResult(((ImageFetchResult) t15).getImage(), ((ImageFetchResult) c0Var5.f21575a).getIsSampled(), ((ImageFetchResult) c0Var5.f21575a).getDataSource(), null);
            c0Var = c0Var18;
            obj6 = obj14;
            T t19 = c0Var.f21575a;
            if (t19 instanceof SourceFetchResult) {
            }
            if (sourceFetchResult != null) {
                h0.i(source2);
            }
            Options options5 = (Options) c0Var2.f21575a;
            c0 c0Var19 = c0Var2;
            j jVar7 = jVar2;
            u uVar3 = aVar.logger;
            dVar2.f29883t = l.a(imageRequest4);
            dVar2.f29884u = l.a(obj2);
            dVar2.f29885v = l.a(obj6);
            dVar2.f29886w = l.a(jVar7);
            dVar2.f29887x = l.a(c0Var19);
            dVar2.f29888y = l.a(c0Var8);
            dVar2.f29889z = l.a(c0Var);
            dVar2.A = l.a(executeResult);
            dVar2.D = 3;
            Object objA3 = b.a(executeResult, imageRequest4, options5, jVar7, uVar3, dVar2);
            obj8 = objA3;
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0090 -> B:20:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(l6.h r7, y6.ImageRequest r8, java.lang.Object r9, y6.Options r10, l6.j r11, eu.b<? super p6.i> r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.i(l6.h, y6.g, java.lang.Object, y6.p, l6.j, eu.b):java.lang.Object");
    }
}
