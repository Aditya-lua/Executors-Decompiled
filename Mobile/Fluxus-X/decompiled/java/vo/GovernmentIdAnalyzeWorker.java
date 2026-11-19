package vo;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import dp.AutocaptureState;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import sn.ExtractedTexts;
import sn.ImageIdMetadata;

/* JADX INFO: renamed from: vo.o, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u0001\u0013B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104¨\u00066"}, d2 = {"Lvo/o;", "Lln/o;", "Lzt/n;", "Lvo/n$b;", "Lls/j;", "Landroid/content/Context;", "context", "Lsn/h0;", "governmentIdFeed", "Ler/c;", "sdkFilesManager", "Lvo/d3$e;", "side", BuildConfig.FLAVOR, "idClassKey", "<init>", "(Landroid/content/Context;Lsn/h0;Ler/c;Lvo/d3$e;Ljava/lang/String;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Lsn/w0$b;", "parsedIdSide", "g", "(Lsn/w0$b;)Ljava/lang/Object;", "Lvo/r;", "h", "(Lsn/w0$b;)Lvo/r;", "b", "Landroid/content/Context;", "Lsn/h0;", "d", "Ler/c;", "e", "Lvo/d3$e;", "f", "Ljava/lang/String;", "Ldp/a;", "Ldp/a;", "autocaptureState", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GovernmentIdAnalyzeWorker implements ln.o<zt.n<? extends n.GovernmentIdImage>>, ls.j<zt.n<? extends n.GovernmentIdImage>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final sn.h0 governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.e side;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String idClassKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AutocaptureState autocaptureState;

    /* JADX INFO: renamed from: vo.o$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lvo/o$a;", BuildConfig.FLAVOR, "Lvo/d3$e;", "side", BuildConfig.FLAVOR, "idClassKey", "Lvo/o;", "a", "(Lvo/d3$e;Ljava/lang/String;)Lvo/o;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        GovernmentIdAnalyzeWorker a(@NotNull IdConfig.e side, @NotNull String idClassKey);
    }

    /* JADX INFO: renamed from: vo.o$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34912a;

        static {
            int[] iArr = new int[sn.w0.c.values().length];
            try {
                iArr[sn.w0.c.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sn.w0.c.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34912a = iArr;
        }
    }

    /* JADX INFO: renamed from: vo.o$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements dv.h<zt.n<? extends n.GovernmentIdImage>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f34913a;
        public final /* synthetic */ GovernmentIdAnalyzeWorker b;

        /* JADX INFO: renamed from: vo.o$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f34914a;
            public final /* synthetic */ GovernmentIdAnalyzeWorker b;

            /* JADX INFO: renamed from: vo.o$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "GovernmentIdAnalyzeWorker.kt", l = {72}, m = "emit")
            public static final class C0716a extends gu.d {
                public Object A;
                public int B;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f34915t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f34916u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f34917v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f34919x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f34920y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f34921z;

                public C0716a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f34915t = obj;
                    this.f34916u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.f34914a = iVar;
                this.b = governmentIdAnalyzeWorker;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x008d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            public final Object emit(Object obj, eu.b bVar) {
                C0716a c0716a;
                zt.n nVarA;
                if (bVar instanceof C0716a) {
                    c0716a = (C0716a) bVar;
                    int i10 = c0716a.f34916u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0716a.f34916u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0716a = new C0716a(bVar);
                    }
                } else {
                    c0716a = new C0716a(bVar);
                }
                Object obj2 = c0716a.f34915t;
                Object objE = fu.c.e();
                int i11 = c0716a.f34916u;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    dv.i iVar = this.f34914a;
                    Object value = ((zt.n) obj).getValue();
                    Throwable thE = zt.n.e(value);
                    if (thE == null) {
                        sn.w0 w0Var = (sn.w0) value;
                        if (w0Var instanceof sn.w0.ParsedIdSide) {
                            sn.w0.ParsedIdSide parsedIdSide = (sn.w0.ParsedIdSide) w0Var;
                            ImageIdMetadata metadata = parsedIdSide.getMetadata();
                            if (metadata != null) {
                                GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = this.b;
                                governmentIdAnalyzeWorker.autocaptureState = dp.b.b(governmentIdAnalyzeWorker.autocaptureState, metadata);
                                if (dp.b.a(this.b.autocaptureState)) {
                                    nVarA = zt.n.a(this.b.g(parsedIdSide));
                                } else {
                                    nVarA = null;
                                }
                            } else {
                                nVarA = zt.n.a(this.b.g(parsedIdSide));
                            }
                        } else {
                            nVarA = null;
                        }
                    } else {
                        nVarA = zt.n.a(zt.n.b(zt.o.a(thE)));
                    }
                    if (nVarA != null) {
                        c0716a.f34917v = gu.l.a(obj);
                        c0716a.f34919x = gu.l.a(c0716a);
                        c0716a.f34920y = gu.l.a(obj);
                        c0716a.f34921z = gu.l.a(iVar);
                        c0716a.A = gu.l.a(nVarA);
                        c0716a.B = 0;
                        c0716a.f34916u = 1;
                        if (iVar.emit(nVarA, c0716a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj2);
                }
                return Unit.f21506a;
            }
        }

        public c(dv.h hVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.f34913a = hVar;
            this.b = governmentIdAnalyzeWorker;
        }

        @Override // dv.h
        public Object collect(dv.i<? super zt.n<? extends n.GovernmentIdImage>> iVar, eu.b bVar) {
            Object objCollect = this.f34913a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    public GovernmentIdAnalyzeWorker(@NotNull Context context, @NotNull sn.h0 governmentIdFeed, @NotNull er.c sdkFilesManager, @NotNull IdConfig.e side, @NotNull String idClassKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.sdkFilesManager = sdkFilesManager;
        this.side = side;
        this.idClassKey = idClassKey;
        this.autocaptureState = new AutocaptureState(null, 1, null);
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) other;
        return Intrinsics.c(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.c(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && Intrinsics.c(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.c(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public final Object g(sn.w0.ParsedIdSide parsedIdSide) {
        n.d dVar;
        try {
            String absolutePath = x.a(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listD = p001kotlin.collections.o.d(new Frame(absolutePath, null, 2, null));
            int i10 = b.f34912a[parsedIdSide.getSide().ordinal()];
            if (i10 == 1) {
                dVar = n.d.FRONT;
            } else {
                if (i10 != 2) {
                    throw new zt.l();
                }
                dVar = n.d.BACK;
            }
            String str = this.idClassKey;
            RawExtraction rawExtractionA = null;
            n.a aVar = n.a.f34838a;
            sn.g extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtractionA = q3.a(extractedBarcode);
            }
            return zt.n.b(new n.GovernmentIdImage(listD, dVar, str, aVar, rawExtractionA, h(parsedIdSide)));
        } catch (IOException e10) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(e10));
        }
    }

    public final GovernmentIdDetails h(sn.w0.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails governmentIdDetailsL;
        sn.g extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (governmentIdDetailsL = h.l(extractedBarcode)) != null) {
            return governmentIdDetailsL;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return h.m(extractedTexts);
        }
        return null;
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<zt.n<n.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
