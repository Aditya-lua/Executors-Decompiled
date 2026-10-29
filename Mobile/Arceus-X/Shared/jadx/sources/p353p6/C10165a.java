package p353p6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4861h0;
import p096e7.C4863i0;
import p096e7.InterfaceC4853d0;
import p096e7.InterfaceC4875u;
import p229jt.C7345l;
import p229jt.C7348o;
import p239k6.AbstractC7469j;
import p239k6.C7465h;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p287m6.EnumC8432f;
import p287m6.InterfaceC8445s;
import p315nt.InterfaceC9557b;
import p323o6.ImageFetchResult;
import p323o6.InterfaceC9701i;
import p323o6.SourceFetchResult;
import p344ot.C10047c;
import p430s6.C11179e;
import p430s6.InterfaceC11178d;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p537x6.InterfaceC12757r;
import p537x6.Options;
import p537x6.SuccessResult;
import p568y6.EnumC13107f;
import p568y6.Size;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: p6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u0002&\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 J@\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m31665d2 = {"Lp6/a;", "Lp6/d;", "Lk6/s;", "imageLoader", "Le7/d0;", "systemCallbacks", "Lx6/r;", "requestService", "Le7/u;", "logger", "<init>", "(Lk6/s;Le7/d0;Lx6/r;Le7/u;)V", "Lp6/d$a;", "chain", "Lx6/k;", "a", "(Lp6/d$a;Lnt/b;)Ljava/lang/Object;", "Lx6/g;", "request", "", "mappedData", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Lp6/a$b;", "h", "(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lk6/h;", "components", "Lo6/i;", "i", "(Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lo6/o;", "fetchResult", "g", "(Lo6/o;Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;", "Lk6/s;", "b", "Le7/d0;", "c", "Lx6/r;", "d", "Le7/u;", "Ls6/e;", "e", "Ls6/e;", "memoryCacheService", "f", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10165a implements InterfaceC10168d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4853d0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12757r requestService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC4875u logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C11179e memoryCacheService;

    /* JADX INFO: renamed from: p6.a$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, m31665d2 = {"Lp6/a$b;", "", "Lk6/n;", "image", "", "isSampled", "Lm6/f;", "dataSource", "", "diskCacheKey", "<init>", "(Lk6/n;ZLm6/f;Ljava/lang/String;)V", "a", "(Lk6/n;ZLm6/f;Ljava/lang/String;)Lp6/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk6/n;", "e", "()Lk6/n;", "b", "Z", "f", "()Z", "c", "Lm6/f;", "()Lm6/f;", "d", "Ljava/lang/String;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ExecuteResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC7474n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC8432f dataSource;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String diskCacheKey;

        public ExecuteResult(@NotNull InterfaceC7474n interfaceC7474n, boolean z10, @NotNull EnumC8432f enumC8432f, @Nullable String str) {
            this.image = interfaceC7474n;
            this.isSampled = z10;
            this.dataSource = enumC8432f;
            this.diskCacheKey = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ExecuteResult m39167b(ExecuteResult executeResult, InterfaceC7474n interfaceC7474n, boolean z10, EnumC8432f enumC8432f, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC7474n = executeResult.image;
            }
            if ((i10 & 2) != 0) {
                z10 = executeResult.isSampled;
            }
            if ((i10 & 4) != 0) {
                enumC8432f = executeResult.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.m39168a(interfaceC7474n, z10, enumC8432f, str);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ExecuteResult m39168a(@NotNull InterfaceC7474n image, boolean isSampled, @NotNull EnumC8432f dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC8432f getDataSource() {
            return this.dataSource;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC7474n getImage() {
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
            return Intrinsics.m31980c(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && Intrinsics.m31980c(this.diskCacheKey, executeResult.diskCacheKey);
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

    /* JADX INFO: renamed from: p6.a$c */
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor", m39664f = "EngineInterceptor.kt", m39665l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m39666m = "decode")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f36644A;

        /* JADX INFO: renamed from: B */
        public int f36645B;

        /* JADX INFO: renamed from: C */
        public /* synthetic */ Object f36646C;

        /* JADX INFO: renamed from: E */
        public int f36648E;

        /* JADX INFO: renamed from: t */
        public Object f36649t;

        /* JADX INFO: renamed from: u */
        public Object f36650u;

        /* JADX INFO: renamed from: v */
        public Object f36651v;

        /* JADX INFO: renamed from: w */
        public Object f36652w;

        /* JADX INFO: renamed from: x */
        public Object f36653x;

        /* JADX INFO: renamed from: y */
        public Object f36654y;

        /* JADX INFO: renamed from: z */
        public Object f36655z;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36646C = obj;
            this.f36648E |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10165a.this.m39164g(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: p6.a$d */
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor", m39664f = "EngineInterceptor.kt", m39665l = {126, 130, 148}, m39666m = "execute")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f36656A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f36657B;

        /* JADX INFO: renamed from: D */
        public int f36659D;

        /* JADX INFO: renamed from: t */
        public Object f36660t;

        /* JADX INFO: renamed from: u */
        public Object f36661u;

        /* JADX INFO: renamed from: v */
        public Object f36662v;

        /* JADX INFO: renamed from: w */
        public Object f36663w;

        /* JADX INFO: renamed from: x */
        public Object f36664x;

        /* JADX INFO: renamed from: y */
        public Object f36665y;

        /* JADX INFO: renamed from: z */
        public Object f36666z;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36657B = obj;
            this.f36659D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10165a.this.m39165h(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: p6.a$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lp6/a$b;", "<anonymous>", "(Lku/p0;)Lp6/a$b;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m39664f = "EngineInterceptor.kt", m39665l = {131}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super ExecuteResult>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ AbstractC7469j f36667A;

        /* JADX INFO: renamed from: t */
        public int f36668t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7729c0<InterfaceC9701i> f36670v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C7729c0<C7465h> f36671w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ImageRequest f36672x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Object f36673y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ C7729c0<Options> f36674z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7729c0<InterfaceC9701i> c7729c0, C7729c0<C7465h> c7729c1, ImageRequest imageRequest, Object obj, C7729c0<Options> c7729c2, AbstractC7469j abstractC7469j, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36670v = c7729c0;
            this.f36671w = c7729c1;
            this.f36672x = imageRequest;
            this.f36673y = obj;
            this.f36674z = c7729c2;
            this.f36667A = abstractC7469j;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C10165a.this.new e(this.f36670v, this.f36671w, this.f36672x, this.f36673y, this.f36674z, this.f36667A, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36668t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C10165a c10165a = C10165a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f36670v.f29425a;
            C7465h c7465h = this.f36671w.f29425a;
            ImageRequest imageRequest = this.f36672x;
            Object obj2 = this.f36673y;
            Options options = this.f36674z.f29425a;
            AbstractC7469j abstractC7469j = this.f36667A;
            this.f36668t = 1;
            Object objM39164g = c10165a.m39164g(sourceFetchResult, c7465h, imageRequest, obj2, options, abstractC7469j, this);
            return objM39164g == objM38805e ? objM38805e : objM39164g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super ExecuteResult> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: p6.a$f */
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor", m39664f = "EngineInterceptor.kt", m39665l = {169}, m39666m = "fetch")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f36675A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f36676B;

        /* JADX INFO: renamed from: D */
        public int f36678D;

        /* JADX INFO: renamed from: t */
        public Object f36679t;

        /* JADX INFO: renamed from: u */
        public Object f36680u;

        /* JADX INFO: renamed from: v */
        public Object f36681v;

        /* JADX INFO: renamed from: w */
        public Object f36682w;

        /* JADX INFO: renamed from: x */
        public Object f36683x;

        /* JADX INFO: renamed from: y */
        public Object f36684y;

        /* JADX INFO: renamed from: z */
        public Object f36685z;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36676B = obj;
            this.f36678D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10165a.this.m39166i(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: p6.a$g */
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor", m39664f = "EngineInterceptor.kt", m39665l = {75}, m39666m = "intercept")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f36686A;

        /* JADX INFO: renamed from: B */
        public Object f36687B;

        /* JADX INFO: renamed from: C */
        public Object f36688C;

        /* JADX INFO: renamed from: D */
        public /* synthetic */ Object f36689D;

        /* JADX INFO: renamed from: F */
        public int f36691F;

        /* JADX INFO: renamed from: t */
        public Object f36692t;

        /* JADX INFO: renamed from: u */
        public Object f36693u;

        /* JADX INFO: renamed from: v */
        public Object f36694v;

        /* JADX INFO: renamed from: w */
        public Object f36695w;

        /* JADX INFO: renamed from: x */
        public Object f36696x;

        /* JADX INFO: renamed from: y */
        public Object f36697y;

        /* JADX INFO: renamed from: z */
        public Object f36698z;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36689D = obj;
            this.f36691F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10165a.this.mo39163a(null, this);
        }
    }

    /* JADX INFO: renamed from: p6.a$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/t;", "<anonymous>", "(Lku/p0;)Lx6/t;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptor$intercept$2", m39664f = "EngineInterceptor.kt", m39665l = {77}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super SuccessResult>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ InterfaceC10168d.a f36699A;

        /* JADX INFO: renamed from: t */
        public int f36700t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ImageRequest f36702v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Object f36703w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Options f36704x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ AbstractC7469j f36705y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC11178d.Key f36706z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ImageRequest imageRequest, Object obj, Options options, AbstractC7469j abstractC7469j, InterfaceC11178d.Key key, InterfaceC10168d.a aVar, InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36702v = imageRequest;
            this.f36703w = obj;
            this.f36704x = options;
            this.f36705y = abstractC7469j;
            this.f36706z = key;
            this.f36699A = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C10165a.this.new h(this.f36702v, this.f36703w, this.f36704x, this.f36705y, this.f36706z, this.f36699A, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39165h;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36700t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C10165a c10165a = C10165a.this;
                ImageRequest imageRequest = this.f36702v;
                Object obj2 = this.f36703w;
                Options options = this.f36704x;
                AbstractC7469j abstractC7469j = this.f36705y;
                this.f36700t = 1;
                objM39165h = c10165a.m39165h(imageRequest, obj2, options, abstractC7469j, this);
                if (objM39165h == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM39165h = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) objM39165h;
            C10165a.this.systemCallbacks.mo23404a();
            boolean zM42116h = C10165a.this.memoryCacheService.m42116h(this.f36706z, this.f36702v, executeResult);
            InterfaceC7474n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f36702v;
            EnumC8432f dataSource = executeResult.getDataSource();
            InterfaceC11178d.Key key = this.f36706z;
            if (!zM42116h) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), C4861h0.m23449p(this.f36699A));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super SuccessResult> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C10165a(@NotNull InterfaceC7479s interfaceC7479s, @NotNull InterfaceC4853d0 interfaceC4853d0, @NotNull InterfaceC12757r interfaceC12757r, @Nullable InterfaceC4875u interfaceC4875u) {
        this.imageLoader = interfaceC7479s;
        this.systemCallbacks = interfaceC4853d0;
        this.requestService = interfaceC12757r;
        this.logger = interfaceC4875u;
        this.memoryCacheService = new C11179e(interfaceC7479s, interfaceC12757r, interfaceC4875u);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p353p6.InterfaceC10168d
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo39163a(@NotNull InterfaceC10168d.a aVar, @NotNull InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) throws Throwable {
        g gVar;
        InterfaceC10168d.a aVar2 = aVar;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f36691F;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f36691F = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f36689D;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar2.f36691F;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            try {
                ImageRequest imageRequestMo39175a = aVar2.getRequest();
                Object data = imageRequestMo39175a.getData();
                Size sizeMo39176i = aVar2.getSize();
                AbstractC7469j abstractC7469jM23446m = C4861h0.m23446m(aVar2);
                Options optionsMo47471e = this.requestService.mo47471e(imageRequestMo39175a, sizeMo39176i);
                EnumC13107f scale = optionsMo47471e.getScale();
                abstractC7469jM23446m.m31043l(imageRequestMo39175a, data);
                Object objM30994j = this.imageLoader.getComponents().m30994j(data, optionsMo47471e);
                abstractC7469jM23446m.m31042k(imageRequestMo39175a, objM30994j);
                InterfaceC11178d.Key keyM42114f = this.memoryCacheService.m42114f(imageRequestMo39175a, objM30994j, optionsMo47471e, abstractC7469jM23446m);
                InterfaceC11178d.Value valueM42109a = keyM42114f != null ? this.memoryCacheService.m42109a(imageRequestMo39175a, keyM42114f, sizeMo39176i, scale) : null;
                if (valueM42109a != null) {
                    return this.memoryCacheService.m42115g(aVar2, imageRequestMo39175a, keyM42114f, valueM42109a);
                }
                CoroutineContext fetcherCoroutineContext = imageRequestMo39175a.getFetcherCoroutineContext();
                h hVar = new h(imageRequestMo39175a, objM30994j, optionsMo47471e, abstractC7469jM23446m, keyM42114f, aVar2, null);
                gVar2.f36692t = aVar2;
                gVar2.f36693u = C10350l.m39676a(imageRequestMo39175a);
                gVar2.f36694v = C10350l.m39676a(data);
                gVar2.f36695w = C10350l.m39676a(sizeMo39176i);
                gVar2.f36696x = C10350l.m39676a(abstractC7469jM23446m);
                gVar2.f36697y = C10350l.m39676a(optionsMo47471e);
                gVar2.f36698z = C10350l.m39676a(scale);
                gVar2.f36686A = C10350l.m39676a(objM30994j);
                gVar2.f36687B = C10350l.m39676a(keyM42114f);
                gVar2.f36688C = C10350l.m39676a(valueM42109a);
                gVar2.f36691F = 1;
                Object objM32684g = C7872i.m32684g(fetcherCoroutineContext, hVar, gVar2);
                return objM32684g == objM38805e ? objM38805e : objM32684g;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC10168d.a aVar3 = (InterfaceC10168d.a) gVar2.f36692t;
            try {
                C7348o.m30470b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return C4861h0.m23436c(aVar2.getRequest(), th);
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
    /* JADX INFO: renamed from: g */
    public final java.lang.Object m39164g(p323o6.SourceFetchResult r7, p239k6.C7465h r8, p537x6.ImageRequest r9, java.lang.Object r10, p537x6.Options r11, p239k6.AbstractC7469j r12, p315nt.InterfaceC9557b<? super p353p6.C10165a.ExecuteResult> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof p353p6.C10165a.c
            if (r0 == 0) goto L13
            r0 = r13
            p6.a$c r0 = (p353p6.C10165a.c) r0
            int r1 = r0.f36648E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36648E = r1
            goto L18
        L13:
            p6.a$c r0 = new p6.a$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f36646C
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f36648E
            r3 = 1
            if (r2 == 0) goto L5a
            if (r2 != r3) goto L52
            int r7 = r0.f36645B
            java.lang.Object r8 = r0.f36644A
            m6.i r8 = (p287m6.InterfaceC8435i) r8
            java.lang.Object r9 = r0.f36655z
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f36654y
            k6.j r9 = (p239k6.AbstractC7469j) r9
            java.lang.Object r10 = r0.f36653x
            x6.p r10 = (p537x6.Options) r10
            java.lang.Object r11 = r0.f36652w
            java.lang.Object r12 = r0.f36651v
            x6.g r12 = (p537x6.ImageRequest) r12
            java.lang.Object r2 = r0.f36650u
            k6.h r2 = (p239k6.C7465h) r2
            java.lang.Object r4 = r0.f36649t
            o6.o r4 = (p323o6.SourceFetchResult) r4
            p229jt.C7348o.m30470b(r13)
            r5 = r4
            r4 = r7
            r7 = r5
            r5 = r12
            r12 = r9
            r9 = r5
            r5 = r11
            r11 = r10
            r10 = r5
            goto L9c
        L52:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L5a:
            p229jt.C7348o.m30470b(r13)
            r13 = 0
        L5e:
            k6.s r2 = r6.imageLoader
            kotlin.Pair r13 = r8.m30996l(r7, r11, r2, r13)
            if (r13 == 0) goto Lcb
            java.lang.Object r2 = r13.m31673c()
            m6.i r2 = (p287m6.InterfaceC8435i) r2
            java.lang.Object r4 = r13.m31674d()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r12.m31037f(r9, r2, r11)
            r0.f36649t = r7
            r0.f36650u = r8
            r0.f36651v = r9
            r0.f36652w = r10
            r0.f36653x = r11
            r0.f36654y = r12
            java.lang.Object r13 = pt.C10350l.m39676a(r13)
            r0.f36655z = r13
            r0.f36644A = r2
            r0.f36645B = r4
            r0.f36648E = r3
            java.lang.Object r13 = r2.mo34183a(r0)
            if (r13 != r1) goto L99
            return r1
        L99:
            r5 = r2
            r2 = r8
            r8 = r5
        L9c:
            m6.g r13 = (p287m6.DecodeResult) r13
            r12.m31036e(r9, r8, r11, r13)
            if (r13 == 0) goto Lc8
            p6.a$b r8 = new p6.a$b
            k6.n r9 = r13.getImage()
            boolean r10 = r13.getIsSampled()
            m6.f r11 = r7.getDataSource()
            m6.s r7 = r7.getSource()
            boolean r12 = r7 instanceof p287m6.C8444r
            r13 = 0
            if (r12 == 0) goto Lbd
            m6.r r7 = (p287m6.C8444r) r7
            goto Lbe
        Lbd:
            r7 = r13
        Lbe:
            if (r7 == 0) goto Lc4
            java.lang.String r13 = r7.getDiskCacheKey()
        Lc4:
            r8.<init>(r9, r10, r11, r13)
            return r8
        Lc8:
            r8 = r2
            r13 = r4
            goto L5e
        Lcb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unable to create a decoder that supports: "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p353p6.C10165a.m39164g(o6.o, k6.h, x6.g, java.lang.Object, x6.p, k6.j, nt.b):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m39165h(ImageRequest imageRequest, Object obj, Options options, AbstractC7469j abstractC7469j, InterfaceC9557b<? super ExecuteResult> interfaceC9557b) throws Throwable {
        d dVar;
        C7729c0 c7729c0;
        ImageRequest imageRequest2;
        Object obj2;
        AbstractC7469j abstractC7469j2;
        C7729c0 c7729c1;
        T t8;
        C7729c0 c7729c2;
        C7729c0 c7729c3;
        C7729c0 c7729c4;
        Object obj3;
        C10165a c10165a;
        ImageRequest imageRequest3;
        C7729c0 c7729c5;
        Object obj4;
        C7729c0 c7729c6;
        AbstractC7469j abstractC7469j3;
        Object obj5;
        ImageRequest imageRequest4;
        C7729c0 c7729c7;
        ExecuteResult executeResult;
        SourceFetchResult sourceFetchResult;
        InterfaceC8445s source;
        Object obj6;
        InterfaceC8445s source2;
        Object obj7;
        Object obj8;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f36659D;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f36659D = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        d dVar2 = dVar;
        Object obj9 = dVar2.f36657B;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar2.f36659D;
        if (i11 == 0) {
            C7348o.m30470b(obj9);
            C7729c0 c7729c8 = new C7729c0();
            T t10 = options;
            c7729c8.f29425a = t10;
            C7729c0 c7729c9 = new C7729c0();
            c7729c9.f29425a = this.imageLoader.getComponents();
            C7729c0 c7729c10 = new C7729c0();
            try {
                c7729c8.f29425a = this.requestService.mo47470d((Options) c7729c8.f29425a);
                if (imageRequest.m47508m() != null || imageRequest.getDecoderFactory() != null) {
                    c7729c9.f29425a = C4861h0.m23438e(C4861h0.m23437d(((C7465h) c7729c9.f29425a).m30995k(), imageRequest.m47508m()), imageRequest.getDecoderFactory()).m31013p();
                }
                C7465h c7465h = (C7465h) c7729c9.f29425a;
                Options options2 = (Options) c7729c8.f29425a;
                dVar2.f36660t = imageRequest;
                dVar2.f36661u = obj;
                dVar2.f36662v = C10350l.m39676a(t10);
                dVar2.f36663w = abstractC7469j;
                dVar2.f36664x = c7729c8;
                dVar2.f36665y = c7729c9;
                dVar2.f36666z = c7729c10;
                dVar2.f36656A = c7729c10;
                dVar2.f36659D = 1;
                Object objM39166i = m39166i(c7465h, imageRequest, obj, options2, abstractC7469j, dVar2);
                if (objM39166i != objM38805e) {
                    imageRequest2 = imageRequest;
                    obj2 = obj;
                    abstractC7469j2 = abstractC7469j;
                    c7729c1 = c7729c8;
                    t8 = objM39166i;
                    c7729c2 = c7729c9;
                    c7729c3 = c7729c10;
                    c7729c4 = c7729c3;
                    obj3 = t10;
                }
                return objM38805e;
            } catch (Throwable th2) {
                th = th2;
                c7729c0 = c7729c10;
                T t11 = c7729c0.f29425a;
                if (t11 instanceof SourceFetchResult) {
                }
                if (sourceFetchResult != null && (source = sourceFetchResult.getSource()) != null) {
                    C4861h0.m23442i(source);
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c7729c0 = (C7729c0) dVar2.f36666z;
                c7729c5 = (C7729c0) dVar2.f36665y;
                c7729c6 = (C7729c0) dVar2.f36664x;
                abstractC7469j3 = (AbstractC7469j) dVar2.f36663w;
                Object obj10 = (Options) dVar2.f36662v;
                Object obj11 = dVar2.f36661u;
                imageRequest3 = (ImageRequest) dVar2.f36660t;
                try {
                    C7348o.m30470b(obj9);
                    c10165a = this;
                    obj4 = obj11;
                    dVar2 = dVar2;
                    obj7 = obj9;
                    obj5 = obj10;
                    abstractC7469j2 = abstractC7469j3;
                    obj6 = obj5;
                    obj2 = obj4;
                    c7729c7 = c7729c5;
                    c7729c1 = c7729c6;
                    imageRequest4 = imageRequest3;
                    executeResult = (ExecuteResult) obj7;
                    T t12 = c7729c0.f29425a;
                    sourceFetchResult = t12 instanceof SourceFetchResult ? (SourceFetchResult) t12 : null;
                    if (sourceFetchResult != null && (source2 = sourceFetchResult.getSource()) != null) {
                        C4861h0.m23442i(source2);
                    }
                    Options options3 = (Options) c7729c1.f29425a;
                    C7729c0 c7729c11 = c7729c1;
                    AbstractC7469j abstractC7469j4 = abstractC7469j2;
                    InterfaceC4875u interfaceC4875u = c10165a.logger;
                    dVar2.f36660t = C10350l.m39676a(imageRequest4);
                    dVar2.f36661u = C10350l.m39676a(obj2);
                    dVar2.f36662v = C10350l.m39676a(obj6);
                    dVar2.f36663w = C10350l.m39676a(abstractC7469j4);
                    dVar2.f36664x = C10350l.m39676a(c7729c11);
                    dVar2.f36665y = C10350l.m39676a(c7729c7);
                    dVar2.f36666z = C10350l.m39676a(c7729c0);
                    dVar2.f36656A = C10350l.m39676a(executeResult);
                    dVar2.f36659D = 3;
                    Object objM39173a = C10166b.m39173a(executeResult, imageRequest4, options3, abstractC7469j4, interfaceC4875u, dVar2);
                    obj8 = objM39173a;
                } catch (Throwable th3) {
                    th = th3;
                    T t13 = c7729c0.f29425a;
                    sourceFetchResult = t13 instanceof SourceFetchResult ? (SourceFetchResult) t13 : null;
                    if (sourceFetchResult != null) {
                        C4861h0.m23442i(source);
                    }
                    throw th;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj9);
                obj8 = obj9;
            }
            ExecuteResult executeResult2 = (ExecuteResult) obj8;
            C4863i0.m23465k(executeResult2.getImage());
            return executeResult2;
        }
        c7729c3 = (C7729c0) dVar2.f36656A;
        c7729c4 = (C7729c0) dVar2.f36666z;
        C7729c0 c7729c12 = (C7729c0) dVar2.f36665y;
        C7729c0 c7729c13 = (C7729c0) dVar2.f36664x;
        AbstractC7469j abstractC7469j5 = (AbstractC7469j) dVar2.f36663w;
        Object obj12 = (Options) dVar2.f36662v;
        Object obj13 = dVar2.f36661u;
        ImageRequest imageRequest5 = (ImageRequest) dVar2.f36660t;
        try {
            C7348o.m30470b(obj9);
            c7729c2 = c7729c12;
            imageRequest2 = imageRequest5;
            abstractC7469j2 = abstractC7469j5;
            c7729c1 = c7729c13;
            obj2 = obj13;
            t8 = obj9;
            obj3 = obj12;
        } catch (Throwable th4) {
            th = th4;
            c7729c0 = c7729c4;
            T t14 = c7729c0.f29425a;
            if (t14 instanceof SourceFetchResult) {
            }
            if (sourceFetchResult != null) {
                C4861h0.m23442i(source);
            }
            throw th;
        }
        Object obj14 = obj3;
        c7729c3.f29425a = t8;
        T t15 = c7729c4.f29425a;
        InterfaceC9701i interfaceC9701i = (InterfaceC9701i) t15;
        if (interfaceC9701i instanceof SourceFetchResult) {
            try {
                CoroutineContext decoderCoroutineContext = imageRequest2.getDecoderCoroutineContext();
                c7729c0 = c7729c4;
                C7729c0 c7729c14 = c7729c2;
                try {
                    e eVar = new e(c7729c0, c7729c14, imageRequest2, obj2, c7729c1, abstractC7469j2, null);
                    c10165a = this;
                    ImageRequest imageRequest6 = imageRequest2;
                    dVar2.f36660t = imageRequest6;
                    dVar2.f36661u = C10350l.m39676a(obj2);
                    dVar2.f36662v = C10350l.m39676a(obj14);
                    dVar2.f36663w = abstractC7469j2;
                    dVar2.f36664x = c7729c1;
                    dVar2.f36665y = C10350l.m39676a(c7729c14);
                    dVar2.f36666z = c7729c0;
                    dVar2.f36656A = null;
                    dVar2.f36659D = 2;
                    Object objM32684g = C7872i.m32684g(decoderCoroutineContext, eVar, dVar2);
                    if (objM32684g != objM38805e) {
                        imageRequest3 = imageRequest6;
                        c7729c0 = c7729c0;
                        c7729c5 = c7729c14;
                        obj4 = obj2;
                        c7729c6 = c7729c1;
                        abstractC7469j3 = abstractC7469j2;
                        obj5 = obj14;
                        obj7 = objM32684g;
                        abstractC7469j2 = abstractC7469j3;
                        obj6 = obj5;
                        obj2 = obj4;
                        c7729c7 = c7729c5;
                        c7729c1 = c7729c6;
                        imageRequest4 = imageRequest3;
                        executeResult = (ExecuteResult) obj7;
                        T t16 = c7729c0.f29425a;
                        if (t16 instanceof SourceFetchResult) {
                        }
                        if (sourceFetchResult != null) {
                            C4861h0.m23442i(source2);
                        }
                        Options options4 = (Options) c7729c1.f29425a;
                        C7729c0 c7729c15 = c7729c1;
                        AbstractC7469j abstractC7469j6 = abstractC7469j2;
                        InterfaceC4875u interfaceC4875u2 = c10165a.logger;
                        dVar2.f36660t = C10350l.m39676a(imageRequest4);
                        dVar2.f36661u = C10350l.m39676a(obj2);
                        dVar2.f36662v = C10350l.m39676a(obj6);
                        dVar2.f36663w = C10350l.m39676a(abstractC7469j6);
                        dVar2.f36664x = C10350l.m39676a(c7729c15);
                        dVar2.f36665y = C10350l.m39676a(c7729c7);
                        dVar2.f36666z = C10350l.m39676a(c7729c0);
                        dVar2.f36656A = C10350l.m39676a(executeResult);
                        dVar2.f36659D = 3;
                        Object objM39173a2 = C10166b.m39173a(executeResult, imageRequest4, options4, abstractC7469j6, interfaceC4875u2, dVar2);
                        obj8 = objM39173a2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    T t17 = c7729c0.f29425a;
                    if (t17 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult != null) {
                        C4861h0.m23442i(source);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c7729c0 = c7729c4;
                T t18 = c7729c0.f29425a;
                if (t18 instanceof SourceFetchResult) {
                }
                if (sourceFetchResult != null) {
                    C4861h0.m23442i(source);
                }
                throw th;
            }
        } else {
            ImageRequest imageRequest7 = imageRequest2;
            C7729c0 c7729c16 = c7729c2;
            c10165a = this;
            if (!(interfaceC9701i instanceof ImageFetchResult)) {
                throw new C7345l();
            }
            imageRequest4 = imageRequest7;
            c7729c7 = c7729c16;
            C7729c0 c7729c17 = c7729c4;
            executeResult = new ExecuteResult(((ImageFetchResult) t15).getImage(), ((ImageFetchResult) c7729c4.f29425a).getIsSampled(), ((ImageFetchResult) c7729c4.f29425a).getDataSource(), null);
            c7729c0 = c7729c17;
            obj6 = obj14;
            T t19 = c7729c0.f29425a;
            if (t19 instanceof SourceFetchResult) {
            }
            if (sourceFetchResult != null) {
                C4861h0.m23442i(source2);
            }
            Options options5 = (Options) c7729c1.f29425a;
            C7729c0 c7729c18 = c7729c1;
            AbstractC7469j abstractC7469j7 = abstractC7469j2;
            InterfaceC4875u interfaceC4875u3 = c10165a.logger;
            dVar2.f36660t = C10350l.m39676a(imageRequest4);
            dVar2.f36661u = C10350l.m39676a(obj2);
            dVar2.f36662v = C10350l.m39676a(obj6);
            dVar2.f36663w = C10350l.m39676a(abstractC7469j7);
            dVar2.f36664x = C10350l.m39676a(c7729c18);
            dVar2.f36665y = C10350l.m39676a(c7729c7);
            dVar2.f36666z = C10350l.m39676a(c7729c0);
            dVar2.f36656A = C10350l.m39676a(executeResult);
            dVar2.f36659D = 3;
            Object objM39173a3 = C10166b.m39173a(executeResult, imageRequest4, options5, abstractC7469j7, interfaceC4875u3, dVar2);
            obj8 = objM39173a3;
        }
        return objM38805e;
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
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m39166i(p239k6.C7465h r7, p537x6.ImageRequest r8, java.lang.Object r9, p537x6.Options r10, p239k6.AbstractC7469j r11, p315nt.InterfaceC9557b<? super p323o6.InterfaceC9701i> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof p353p6.C10165a.f
            if (r0 == 0) goto L13
            r0 = r12
            p6.a$f r0 = (p353p6.C10165a.f) r0
            int r1 = r0.f36678D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36678D = r1
            goto L18
        L13:
            p6.a$f r0 = new p6.a$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f36676B
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f36678D
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            int r7 = r0.f36675A
            java.lang.Object r8 = r0.f36685z
            o6.j r8 = (p323o6.InterfaceC9702j) r8
            java.lang.Object r9 = r0.f36684y
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f36683x
            k6.j r9 = (p239k6.AbstractC7469j) r9
            java.lang.Object r10 = r0.f36682w
            x6.p r10 = (p537x6.Options) r10
            java.lang.Object r11 = r0.f36681v
            java.lang.Object r2 = r0.f36680u
            x6.g r2 = (p537x6.ImageRequest) r2
            java.lang.Object r4 = r0.f36679t
            k6.h r4 = (p239k6.C7465h) r4
            p229jt.C7348o.m30470b(r12)
            r5 = r4
            r4 = r7
            r7 = r5
            r5 = r2
            r2 = r8
            r8 = r5
            r5 = r11
            r11 = r9
            r9 = r5
            goto L93
        L4e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L56:
            p229jt.C7348o.m30470b(r12)
            r12 = 0
        L5a:
            k6.s r2 = r6.imageLoader
            kotlin.Pair r12 = r7.m30997m(r9, r10, r2, r12)
            if (r12 == 0) goto Lb2
            java.lang.Object r2 = r12.m31673c()
            o6.j r2 = (p323o6.InterfaceC9702j) r2
            java.lang.Object r4 = r12.m31674d()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r11.m31039h(r8, r2, r10)
            r0.f36679t = r7
            r0.f36680u = r8
            r0.f36681v = r9
            r0.f36682w = r10
            r0.f36683x = r11
            java.lang.Object r12 = pt.C10350l.m39676a(r12)
            r0.f36684y = r12
            r0.f36685z = r2
            r0.f36675A = r4
            r0.f36678D = r3
            java.lang.Object r12 = r2.mo38310a(r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            o6.i r12 = (p323o6.InterfaceC9701i) r12
            r11.m31038g(r8, r2, r10, r12)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r12 = r4
            goto L5a
        L9d:
            r7 = move-exception
            boolean r8 = r12 instanceof p323o6.SourceFetchResult
            if (r8 == 0) goto La5
            o6.o r12 = (p323o6.SourceFetchResult) r12
            goto La6
        La5:
            r12 = 0
        La6:
            if (r12 == 0) goto Lb1
            m6.s r8 = r12.getSource()
            if (r8 == 0) goto Lb1
            p096e7.C4861h0.m23442i(r8)
        Lb1:
            throw r7
        Lb2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unable to create a fetcher that supports: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p353p6.C10165a.m39166i(k6.h, x6.g, java.lang.Object, x6.p, k6.j, nt.b):java.lang.Object");
    }
}
