package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import io.C6907q2;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5679e;
import p132fn.C5717x;
import p132fn.InterfaceC5690j0;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p361po.C10301a;
import p391qq.C10700c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004:\u00015B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103¨\u00066"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f;", "Lym/o;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Lvr/h;", "Landroid/content/Context;", "context", "Lfn/x;", "governmentIdFeed", "Lqq/c;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Lfn/x;Lqq/c;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lfn/j0$b;", "parsedIdSide", "g", "(Lfn/j0$b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "h", "(Lfn/j0$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Landroid/content/Context;", "Lfn/x;", "d", "Lqq/c;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "f", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "autocaptureState", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class GovernmentIdAnalyzeWorker implements InterfaceC13222o<C7347n<? extends GovernmentId.GovernmentIdImage>>, InterfaceC12257h<C7347n<? extends GovernmentId.GovernmentIdImage>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final C5717x governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.EnumC3514b side;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String idClassKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public AutocaptureState autocaptureState;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/f;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        GovernmentIdAnalyzeWorker mo17543a(@NotNull IdConfig.EnumC3514b side, @NotNull String idClassKey);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14080a;

        static {
            int[] iArr = new int[InterfaceC5690j0.c.values().length];
            try {
                iArr[InterfaceC5690j0.c.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC5690j0.c.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14080a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC9575h<C7347n<? extends GovernmentId.GovernmentIdImage>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f14081a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GovernmentIdAnalyzeWorker f14082b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f14083a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ GovernmentIdAnalyzeWorker f14084b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", m39664f = "GovernmentIdAnalyzeWorker.kt", m39665l = {72}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14127a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public Object f14085A;

                /* JADX INFO: renamed from: B */
                public int f14086B;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f14087t;

                /* JADX INFO: renamed from: u */
                public int f14088u;

                /* JADX INFO: renamed from: v */
                public Object f14089v;

                /* JADX INFO: renamed from: x */
                public Object f14091x;

                /* JADX INFO: renamed from: y */
                public Object f14092y;

                /* JADX INFO: renamed from: z */
                public Object f14093z;

                public C14127a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f14087t = obj;
                    this.f14088u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC9577i interfaceC9577i, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.f14083a = interfaceC9577i;
                this.f14084b = governmentIdAnalyzeWorker;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x008d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                C14127a c14127a;
                C7347n c7347nM30459a;
                if (interfaceC9557b instanceof C14127a) {
                    c14127a = (C14127a) interfaceC9557b;
                    int i10 = c14127a.f14088u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14127a.f14088u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14127a = new C14127a(interfaceC9557b);
                    }
                } else {
                    c14127a = new C14127a(interfaceC9557b);
                }
                Object obj2 = c14127a.f14087t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14127a.f14088u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f14083a;
                    Object value = ((C7347n) obj).getValue();
                    Throwable thM30463e = C7347n.m30463e(value);
                    if (thM30463e == null) {
                        InterfaceC5690j0 interfaceC5690j0 = (InterfaceC5690j0) value;
                        if (interfaceC5690j0 instanceof InterfaceC5690j0.ParsedIdSide) {
                            InterfaceC5690j0.ParsedIdSide parsedIdSide = (InterfaceC5690j0.ParsedIdSide) interfaceC5690j0;
                            ImageIdMetadata metadata = parsedIdSide.getMetadata();
                            if (metadata != null) {
                                GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = this.f14084b;
                                governmentIdAnalyzeWorker.autocaptureState = C10301a.m39576b(governmentIdAnalyzeWorker.autocaptureState, metadata);
                                if (C10301a.m39575a(this.f14084b.autocaptureState)) {
                                    c7347nM30459a = C7347n.m30459a(this.f14084b.m17541g(parsedIdSide));
                                } else {
                                    c7347nM30459a = null;
                                }
                            } else {
                                c7347nM30459a = C7347n.m30459a(this.f14084b.m17541g(parsedIdSide));
                            }
                        } else {
                            c7347nM30459a = null;
                        }
                    } else {
                        c7347nM30459a = C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(thM30463e)));
                    }
                    if (c7347nM30459a != null) {
                        c14127a.f14089v = C10350l.m39676a(obj);
                        c14127a.f14091x = C10350l.m39676a(c14127a);
                        c14127a.f14092y = C10350l.m39676a(obj);
                        c14127a.f14093z = C10350l.m39676a(interfaceC9577i);
                        c14127a.f14085A = C10350l.m39676a(c7347nM30459a);
                        c14127a.f14086B = 0;
                        c14127a.f14088u = 1;
                        if (interfaceC9577i.emit(c7347nM30459a, c14127a) == objM38805e) {
                            return objM38805e;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj2);
                }
                return Unit.f29331a;
            }
        }

        public c(InterfaceC9575h interfaceC9575h, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.f14081a = interfaceC9575h;
            this.f14082b = governmentIdAnalyzeWorker;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super C7347n<? extends GovernmentId.GovernmentIdImage>> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f14081a.collect(new a(interfaceC9577i, this.f14082b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    public GovernmentIdAnalyzeWorker(@NotNull Context context, @NotNull C5717x governmentIdFeed, @NotNull C10700c sdkFilesManager, @NotNull IdConfig.EnumC3514b side, @NotNull String idClassKey) {
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

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
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
        return Intrinsics.m31980c(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.m31980c(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && Intrinsics.m31980c(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.m31980c(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    /* JADX INFO: renamed from: g */
    public final Object m17541g(InterfaceC5690j0.ParsedIdSide parsedIdSide) {
        GovernmentId.EnumC3486b enumC3486b;
        try {
            String absolutePath = C3549j.m17561a(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listM31878d = C7697o.m31878d(new Frame(absolutePath, null, 2, null));
            int i10 = b.f14080a[parsedIdSide.getSide().ordinal()];
            if (i10 == 1) {
                enumC3486b = GovernmentId.EnumC3486b.FRONT;
            } else {
                if (i10 != 2) {
                    throw new C7345l();
                }
                enumC3486b = GovernmentId.EnumC3486b.BACK;
            }
            String str = this.idClassKey;
            RawExtraction rawExtractionM29328a = null;
            GovernmentId.EnumC3485a enumC3485a = GovernmentId.EnumC3485a.f13531a;
            AbstractC5679e extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtractionM29328a = C6907q2.m29328a(extractedBarcode);
            }
            return C7347n.m30460b(new GovernmentId.GovernmentIdImage(listM31878d, enumC3486b, str, enumC3485a, rawExtractionM29328a, m17542h(parsedIdSide)));
        } catch (IOException e10) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(e10));
        }
    }

    /* JADX INFO: renamed from: h */
    public final GovernmentIdDetails m17542h(InterfaceC5690j0.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails governmentIdDetailsM17524m;
        AbstractC5679e extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (governmentIdDetailsM17524m = C3541d.m17524m(extractedBarcode)) != null) {
            return governmentIdDetailsM17524m;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return C3541d.m17523l(extractedTexts);
        }
        return null;
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<C7347n<GovernmentId.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
