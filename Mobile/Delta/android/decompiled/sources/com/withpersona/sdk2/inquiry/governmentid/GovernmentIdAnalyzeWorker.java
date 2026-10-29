package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import fn.j0;
import fn.x;
import io.q2;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u00015B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103¨\u00066"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f;", "Lym/o;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lvr/h;", "Landroid/content/Context;", "context", "Lfn/x;", "governmentIdFeed", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Lfn/x;Lqq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lfn/j0$b;", "parsedIdSide", "g", "(Lfn/j0$b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "h", "(Lfn/j0$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Landroid/content/Context;", "Lfn/x;", "d", "Lqq/c;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "f", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "autocaptureState", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GovernmentIdAnalyzeWorker implements ym.o<jt.n<? extends GovernmentId.GovernmentIdImage>>, vr.h<jt.n<? extends GovernmentId.GovernmentIdImage>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final x governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.b side;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String idClassKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AutocaptureState autocaptureState;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/f;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        GovernmentIdAnalyzeWorker a(@NotNull IdConfig.b side, @NotNull String idClassKey);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10902a;

        static {
            int[] iArr = new int[j0.c.values().length];
            try {
                iArr[j0.c.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.c.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10902a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements nu.h<jt.n<? extends GovernmentId.GovernmentIdImage>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f10903a;
        public final /* synthetic */ GovernmentIdAnalyzeWorker b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.i f10904a;
            public final /* synthetic */ GovernmentIdAnalyzeWorker b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a$a, reason: collision with other inner class name */
            @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "GovernmentIdAnalyzeWorker.kt", l = {72}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0197a extends pt.d {
                public Object A;
                public int B;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10905t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f10906u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f10907v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f10909x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f10910y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f10911z;

                public C0197a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f10905t = obj;
                    this.f10906u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(nu.i iVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.f10904a = iVar;
                this.b = governmentIdAnalyzeWorker;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x008d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.i
            public final Object emit(Object obj, nt.b bVar) {
                C0197a c0197a;
                jt.n nVarA;
                if (bVar instanceof C0197a) {
                    c0197a = (C0197a) bVar;
                    int i10 = c0197a.f10906u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0197a.f10906u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0197a = new C0197a(bVar);
                    }
                } else {
                    c0197a = new C0197a(bVar);
                }
                Object obj2 = c0197a.f10905t;
                Object objE = ot.c.e();
                int i11 = c0197a.f10906u;
                if (i11 == 0) {
                    jt.o.b(obj2);
                    nu.i iVar = this.f10904a;
                    Object value = ((jt.n) obj).getValue();
                    Throwable thE = jt.n.e(value);
                    if (thE == null) {
                        j0 j0Var = (j0) value;
                        if (j0Var instanceof j0.ParsedIdSide) {
                            j0.ParsedIdSide parsedIdSide = (j0.ParsedIdSide) j0Var;
                            ImageIdMetadata metadata = parsedIdSide.getMetadata();
                            if (metadata != null) {
                                GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = this.b;
                                governmentIdAnalyzeWorker.autocaptureState = po.a.b(governmentIdAnalyzeWorker.autocaptureState, metadata);
                                if (po.a.a(this.b.autocaptureState)) {
                                    nVarA = jt.n.a(this.b.g(parsedIdSide));
                                } else {
                                    nVarA = null;
                                }
                            } else {
                                nVarA = jt.n.a(this.b.g(parsedIdSide));
                            }
                        } else {
                            nVarA = null;
                        }
                    } else {
                        nVarA = jt.n.a(jt.n.b(jt.o.a(thE)));
                    }
                    if (nVarA != null) {
                        c0197a.f10907v = pt.l.a(obj);
                        c0197a.f10909x = pt.l.a(c0197a);
                        c0197a.f10910y = pt.l.a(obj);
                        c0197a.f10911z = pt.l.a(iVar);
                        c0197a.A = pt.l.a(nVarA);
                        c0197a.B = 0;
                        c0197a.f10906u = 1;
                        if (iVar.emit(nVarA, c0197a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj2);
                }
                return Unit.f22483a;
            }
        }

        public c(nu.h hVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.f10903a = hVar;
            this.b = governmentIdAnalyzeWorker;
        }

        @Override // nu.h
        public Object collect(nu.i<? super jt.n<? extends GovernmentId.GovernmentIdImage>> iVar, nt.b bVar) {
            Object objCollect = this.f10903a.collect(new a(iVar, this.b), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    public GovernmentIdAnalyzeWorker(@NotNull Context context, @NotNull x governmentIdFeed, @NotNull qq.c sdkFilesManager, @NotNull IdConfig.b side, @NotNull String idClassKey) {
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

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull ym.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> otherWorker) {
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

    public final Object g(j0.ParsedIdSide parsedIdSide) {
        GovernmentId.b bVar;
        try {
            String absolutePath = j.a(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listD = kotlin.collections.o.d(new Frame(absolutePath, null, 2, null));
            int i10 = b.f10902a[parsedIdSide.getSide().ordinal()];
            if (i10 == 1) {
                bVar = GovernmentId.b.FRONT;
            } else {
                if (i10 != 2) {
                    throw new jt.l();
                }
                bVar = GovernmentId.b.BACK;
            }
            String str = this.idClassKey;
            RawExtraction rawExtractionA = null;
            GovernmentId.a aVar = GovernmentId.a.f10449a;
            fn.e extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtractionA = q2.a(extractedBarcode);
            }
            return jt.n.b(new GovernmentId.GovernmentIdImage(listD, bVar, str, aVar, rawExtractionA, h(parsedIdSide)));
        } catch (IOException e10) {
            jt.n.Companion companion = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(e10));
        }
    }

    public final GovernmentIdDetails h(j0.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails governmentIdDetailsM;
        fn.e extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (governmentIdDetailsM = d.m(extractedBarcode)) != null) {
            return governmentIdDetailsM;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return d.l(extractedTexts);
        }
        return null;
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<jt.n<GovernmentId.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
