package p6;

import com.google.mlkit.common.MlKitException;
import e7.d0;
import e7.h0;
import e7.u;
import java.util.concurrent.CancellationException;
import jt.o;
import k6.j;
import k6.n;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.p0;
import o6.SourceFetchResult;
import o6.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import pt.m;
import x6.ImageRequest;
import x6.Options;
import x6.SuccessResult;
import x6.k;
import x6.r;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u0002&\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 J@\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lp6/a;", "Lp6/d;", "Lk6/s;", "imageLoader", "Le7/d0;", "systemCallbacks", "Lx6/r;", "requestService", "Le7/u;", "logger", "<init>", "(Lk6/s;Le7/d0;Lx6/r;Le7/u;)V", "Lp6/d$a;", "chain", "Lx6/k;", "a", "(Lp6/d$a;Lnt/b;)Ljava/lang/Object;", "Lx6/g;", "request", "", "mappedData", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Lp6/a$b;", "h", "(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lk6/h;", "components", "Lo6/i;", "i", "(Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lo6/o;", "fetchResult", "g", "(Lo6/o;Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lk6/s;", "b", "Le7/d0;", "c", "Lx6/r;", "d", "Le7/u;", "Ls6/e;", "e", "Ls6/e;", "memoryCacheService", "f", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements p6.d {

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
    public final s6.e memoryCacheService;

    /* JADX INFO: renamed from: p6.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lp6/a$b;", "", "Lk6/n;", "image", "", "isSampled", "Lm6/f;", "dataSource", "", "diskCacheKey", "<init>", "(Lk6/n;ZLm6/f;Ljava/lang/String;)V", "a", "(Lk6/n;ZLm6/f;Ljava/lang/String;)Lp6/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk6/n;", "e", "()Lk6/n;", "b", "Z", "f", "()Z", "c", "Lm6/f;", "()Lm6/f;", "d", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final m6.f dataSource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String diskCacheKey;

        public ExecuteResult(@NotNull n nVar, boolean z10, @NotNull m6.f fVar, @Nullable String str) {
            this.image = nVar;
            this.isSampled = z10;
            this.dataSource = fVar;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, n nVar, boolean z10, m6.f fVar, String str, int i10, Object obj) {
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
        public final ExecuteResult a(@NotNull n image, boolean isSampled, @NotNull m6.f dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final m6.f getDataSource() {
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

    @pt.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "decode")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28316t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28317u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28318v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28319w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f28320x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f28321y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f28322z;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    @pt.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public Object A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28323t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28324u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28325v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28326w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f28327x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f28328y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f28329z;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lp6/a$b;", "<anonymous>", "(Lku/p0;)Lp6/a$b;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, nt.b<? super ExecuteResult>, Object> {
        public final /* synthetic */ j A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28330t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<i> f28332v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<k6.h> f28333w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f28334x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object f28335y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c0<Options> f28336z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0<i> c0Var, c0<k6.h> c0Var2, ImageRequest imageRequest, Object obj, c0<Options> c0Var3, j jVar, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f28332v = c0Var;
            this.f28333w = c0Var2;
            this.f28334x = imageRequest;
            this.f28335y = obj;
            this.f28336z = c0Var3;
            this.A = jVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new e(this.f28332v, this.f28333w, this.f28334x, this.f28335y, this.f28336z, this.A, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f28330t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f28332v.f22552a;
            k6.h hVar = this.f28333w.f22552a;
            ImageRequest imageRequest = this.f28334x;
            Object obj2 = this.f28335y;
            Options options = this.f28336z.f22552a;
            j jVar = this.A;
            this.f28330t = 1;
            Object objG = aVar.g(sourceFetchResult, hVar, imageRequest, obj2, options, jVar, this);
            return objG == objE ? objE : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super ExecuteResult> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28337t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28338u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28339v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28340w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f28341x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f28342y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f28343z;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    @pt.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {
        public Object A;
        public Object B;
        public Object C;
        public /* synthetic */ Object D;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f28344t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f28345u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f28346v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f28347w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f28348x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f28349y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f28350z;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/t;", "<anonymous>", "(Lku/p0;)Lx6/t;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, nt.b<? super SuccessResult>, Object> {
        public final /* synthetic */ p6.d.a A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28351t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f28353v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object f28354w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Options f28355x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ j f28356y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ s6.d.Key f28357z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ImageRequest imageRequest, Object obj, Options options, j jVar, s6.d.Key key, p6.d.a aVar, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f28353v = imageRequest;
            this.f28354w = obj;
            this.f28355x = options;
            this.f28356y = jVar;
            this.f28357z = key;
            this.A = aVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new h(this.f28353v, this.f28354w, this.f28355x, this.f28356y, this.f28357z, this.A, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object objE = ot.c.e();
            int i10 = this.f28351t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f28353v;
                Object obj2 = this.f28354w;
                Options options = this.f28355x;
                j jVar = this.f28356y;
                this.f28351t = 1;
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
            boolean zH = a.this.memoryCacheService.h(this.f28357z, this.f28353v, executeResult);
            n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f28353v;
            m6.f dataSource = executeResult.getDataSource();
            s6.d.Key key = this.f28357z;
            if (!zH) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), h0.p(this.A));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super SuccessResult> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public a(@NotNull s sVar, @NotNull d0 d0Var, @NotNull r rVar, @Nullable u uVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = d0Var;
        this.requestService = rVar;
        this.logger = uVar;
        this.memoryCacheService = new s6.e(sVar, rVar, uVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p6.d
    @Nullable
    public Object a(@NotNull p6.d.a aVar, @NotNull nt.b<? super k> bVar) throws Throwable {
        g gVar;
        p6.d.a aVar2 = aVar;
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
        Object objE = ot.c.e();
        int i11 = gVar2.F;
        if (i11 == 0) {
            o.b(obj);
            try {
                ImageRequest imageRequestA = aVar2.getRequest();
                Object data = imageRequestA.getData();
                Size sizeI = aVar2.getSize();
                j jVarM = h0.m(aVar2);
                Options optionsE = this.requestService.e(imageRequestA, sizeI);
                y6.f scale = optionsE.getScale();
                jVarM.l(imageRequestA, data);
                Object objJ = this.imageLoader.getComponents().j(data, optionsE);
                jVarM.k(imageRequestA, objJ);
                s6.d.Key keyF = this.memoryCacheService.f(imageRequestA, objJ, optionsE, jVarM);
                s6.d.Value valueA = keyF != null ? this.memoryCacheService.a(imageRequestA, keyF, sizeI, scale) : null;
                if (valueA != null) {
                    return this.memoryCacheService.g(aVar2, imageRequestA, keyF, valueA);
                }
                CoroutineContext fetcherCoroutineContext = imageRequestA.getFetcherCoroutineContext();
                h hVar = new h(imageRequestA, objJ, optionsE, jVarM, keyF, aVar2, null);
                gVar2.f28344t = aVar2;
                gVar2.f28345u = l.a(imageRequestA);
                gVar2.f28346v = l.a(data);
                gVar2.f28347w = l.a(sizeI);
                gVar2.f28348x = l.a(jVarM);
                gVar2.f28349y = l.a(optionsE);
                gVar2.f28350z = l.a(scale);
                gVar2.A = l.a(objJ);
                gVar2.B = l.a(keyF);
                gVar2.C = l.a(valueA);
                gVar2.F = 1;
                Object objG = ku.i.g(fetcherCoroutineContext, hVar, gVar2);
                return objG == objE ? objE : objG;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p6.d.a aVar3 = (p6.d.a) gVar2.f28344t;
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
    public final java.lang.Object g(o6.SourceFetchResult r7, k6.h r8, x6.ImageRequest r9, java.lang.Object r10, x6.Options r11, k6.j r12, nt.b<? super p6.a.ExecuteResult> r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.g(o6.o, k6.h, x6.g, java.lang.Object, x6.p, k6.j, nt.b):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r2v15, types: [T, k6.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, k6.h] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, x6.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(x6.ImageRequest r18, java.lang.Object r19, x6.Options r20, k6.j r21, nt.b<? super p6.a.ExecuteResult> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.h(x6.g, java.lang.Object, x6.p, k6.j, nt.b):java.lang.Object");
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
    public final java.lang.Object i(k6.h r7, x6.ImageRequest r8, java.lang.Object r9, x6.Options r10, k6.j r11, nt.b<? super o6.i> r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.i(k6.h, x6.g, java.lang.Object, x6.p, k6.j, nt.b):java.lang.Object");
    }
}
