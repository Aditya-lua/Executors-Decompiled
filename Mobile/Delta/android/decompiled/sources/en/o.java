package en;

import android.graphics.Rect;
import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.camera.ExtractedTexts;
import dn.z;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0018"}, d2 = {"Len/o;", "Len/e;", "<init>", "()V", "Ldn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lgt/n;", "Len/a;", "a", "(Ldn/z;Landroid/graphics/Rect;Llt/b;)Ljava/lang/Object;", "Len/n;", "b", "()Len/n;", "Len/n;", "textEntityExtractor", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "previousReadings", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final n textEntityExtractor = b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Integer> previousReadings = new HashMap<>();

    @nt.f(c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", f = "TextExtractionAnalyzer.kt", l = {26}, m = "analyze-0E7RQCE")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f16175t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f16176u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f16177v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f16179x;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16177v = obj;
            this.f16179x |= Integer.MIN_VALUE;
            Object objA = o.this.a(null, null, this);
            return objA == mt.c.e() ? objA : gt.n.a(objA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // en.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull lt.b<? super gt.n<? extends a>> bVar) {
        b bVar2;
        gt.n nVar;
        a aVar;
        boolean z10;
        Date expirationDate;
        boolean z11;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Object value;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f16179x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f16179x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objA = bVar2.f16177v;
        Object objE = mt.c.e();
        int i11 = bVar2.f16179x;
        Date dateOfBirth = null;
        if (i11 == 0) {
            gt.o.b(objA);
            n nVar2 = this.textEntityExtractor;
            if (nVar2 != null) {
                InputImage inputImageG = zVar.g();
                bVar2.f16175t = nt.l.a(zVar);
                bVar2.f16176u = nt.l.a(rect);
                bVar2.f16179x = 1;
                objA = nVar2.a(inputImageG, bVar2);
                if (objA == objE) {
                    return objE;
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                value = nVar.getValue();
                if (gt.n.g(value)) {
                    value = null;
                }
                aVar = (a) value;
            } else {
                aVar = null;
            }
            z10 = aVar instanceof a.f;
            if (z10) {
                a.f fVar = (a.f) aVar;
                dateOfBirth = fVar.getExtractedTexts().getDateOfBirth();
                expirationDate = fVar.getExtractedTexts().getExpirationDate();
            } else {
                expirationDate = null;
            }
            if (dateOfBirth != null && expirationDate != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dateOfBirth);
                sb2.append(expirationDate);
                String string = sb2.toString();
                HashMap<String, Integer> map = this.previousReadings;
                num2 = map.get(string);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                map.put(string, nt.b.d(iIntValue2 + 1));
            }
            if (dateOfBirth != null || expirationDate == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            HashMap<String, Integer> map2 = this.previousReadings;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(dateOfBirth);
            sb3.append(expirationDate);
            num = map2.get(sb3.toString());
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            boolean z12 = iIntValue >= 3;
            if (z11 || !z12) {
                if (z10) {
                    gt.n.Companion companion = gt.n.INSTANCE;
                    return gt.n.b(a.b.f16151a);
                }
                if (nVar != null) {
                    return nVar.getValue();
                }
                gt.n.Companion companion2 = gt.n.INSTANCE;
                return gt.n.b(a.b.f16151a);
            }
            n nVar3 = this.textEntityExtractor;
            if (nVar3 != null) {
                nVar3.close();
            }
            gt.n.Companion companion3 = gt.n.INSTANCE;
            Intrinsics.checkNotNull(dateOfBirth);
            Intrinsics.checkNotNull(expirationDate);
            return gt.n.b(new a.f(new ExtractedTexts(dateOfBirth, expirationDate)));
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gt.o.b(objA);
        nVar = (gt.n) objA;
        if (nVar != null) {
            value = nVar.getValue();
            if (gt.n.g(value)) {
                value = null;
            }
            aVar = (a) value;
        } else {
            aVar = null;
        }
        z10 = aVar instanceof a.f;
        if (z10) {
            a.f fVar2 = (a.f) aVar;
            dateOfBirth = fVar2.getExtractedTexts().getDateOfBirth();
            expirationDate = fVar2.getExtractedTexts().getExpirationDate();
        } else {
            expirationDate = null;
        }
        if (dateOfBirth != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(dateOfBirth);
            sb4.append(expirationDate);
            String string2 = sb4.toString();
            HashMap<String, Integer> map3 = this.previousReadings;
            num2 = map3.get(string2);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            map3.put(string2, nt.b.d(iIntValue2 + 1));
        }
        if (dateOfBirth != null) {
            z11 = false;
        } else {
            z11 = false;
        }
        HashMap<String, Integer> map4 = this.previousReadings;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(dateOfBirth);
        sb5.append(expirationDate);
        num = map4.get(sb5.toString());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue >= 3) {
        }
        if (z11) {
        }
        if (z10) {
            gt.n.Companion companion4 = gt.n.INSTANCE;
            return gt.n.b(a.b.f16151a);
        }
        if (nVar != null) {
            return nVar.getValue();
        }
        gt.n.Companion companion5 = gt.n.INSTANCE;
        return gt.n.b(a.b.f16151a);
    }

    public final n b() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
            return (n) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
