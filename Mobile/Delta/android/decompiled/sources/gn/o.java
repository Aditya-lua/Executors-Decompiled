package gn;

import android.graphics.Rect;
import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.camera.ExtractedTexts;
import fn.z;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0018"}, d2 = {"Lgn/o;", "Lgn/e;", "<init>", "()V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lgn/n;", "b", "()Lgn/n;", "Lgn/n;", "textEntityExtractor", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "previousReadings", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final n textEntityExtractor = b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Integer> previousReadings = new HashMap<>();

    @pt.f(c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", f = "TextExtractionAnalyzer.kt", l = {26}, m = "analyze-0E7RQCE")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f18277t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f18278u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f18279v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f18281x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18279v = obj;
            this.f18281x |= Integer.MIN_VALUE;
            Object objA = o.this.a(null, null, this);
            return objA == ot.c.e() ? objA : jt.n.a(objA);
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
    @Override // gn.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull nt.b<? super jt.n<? extends a>> bVar) {
        b bVar2;
        jt.n nVar;
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
            int i10 = bVar2.f18281x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f18281x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objB = bVar2.f18279v;
        Object objE = ot.c.e();
        int i11 = bVar2.f18281x;
        Date dateOfBirth = null;
        if (i11 == 0) {
            jt.o.b(objB);
            n nVar2 = this.textEntityExtractor;
            if (nVar2 != null) {
                InputImage inputImageG = zVar.g();
                bVar2.f18277t = pt.l.a(zVar);
                bVar2.f18278u = pt.l.a(rect);
                bVar2.f18281x = 1;
                objB = nVar2.b(inputImageG, bVar2);
                if (objB == objE) {
                    return objE;
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                value = nVar.getValue();
                if (jt.n.g(value)) {
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
                map.put(string, pt.b.d(iIntValue2 + 1));
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
                    jt.n.Companion companion = jt.n.INSTANCE;
                    return jt.n.b(a.b.f18253a);
                }
                if (nVar != null) {
                    return nVar.getValue();
                }
                jt.n.Companion companion2 = jt.n.INSTANCE;
                return jt.n.b(a.b.f18253a);
            }
            n nVar3 = this.textEntityExtractor;
            if (nVar3 != null) {
                nVar3.close();
            }
            jt.n.Companion companion3 = jt.n.INSTANCE;
            Intrinsics.checkNotNull(dateOfBirth);
            Intrinsics.checkNotNull(expirationDate);
            return jt.n.b(new a.f(new ExtractedTexts(dateOfBirth, expirationDate)));
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jt.o.b(objB);
        nVar = (jt.n) objB;
        if (nVar != null) {
            value = nVar.getValue();
            if (jt.n.g(value)) {
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
            map3.put(string2, pt.b.d(iIntValue2 + 1));
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
            jt.n.Companion companion4 = jt.n.INSTANCE;
            return jt.n.b(a.b.f18253a);
        }
        if (nVar != null) {
            return nVar.getValue();
        }
        jt.n.Companion companion5 = jt.n.INSTANCE;
        return jt.n.b(a.b.f18253a);
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
