package gn;

import android.graphics.Rect;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.vision.common.InputImage;
import com.withpersona.sdk2.camera.ExtractedTexts;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5719z;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: gn.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Lgn/o;", "Lgn/e;", "<init>", "()V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lgn/n;", "b", "()Lgn/n;", "Lgn/n;", "textEntityExtractor", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "previousReadings", "c", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6151o implements InterfaceC6141e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC6150n textEntityExtractor = m27144b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Integer> previousReadings = new HashMap<>();

    /* JADX INFO: renamed from: gn.o$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", m39664f = "TextExtractionAnalyzer.kt", m39665l = {26}, m39666m = "analyze-0E7RQCE")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f23506t;

        /* JADX INFO: renamed from: u */
        public Object f23507u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f23508v;

        /* JADX INFO: renamed from: x */
        public int f23510x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23508v = obj;
            this.f23510x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo27125a = C6151o.this.mo27125a(null, null, this);
            return objMo27125a == C10047c.m38805e() ? objMo27125a : C7347n.m30459a(objMo27125a);
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r3v1, r7v6 */
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
    @Override // gn.InterfaceC6141e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo27125a(@NotNull InterfaceC5719z interfaceC5719z, @Nullable Rect rect, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b) {
        b bVar;
        C7347n c7347n;
        AbstractC6137a abstractC6137a;
        boolean z10;
        Date expirationDate;
        boolean z11;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Object value;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f23510x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f23510x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM27143b = bVar.f23508v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f23510x;
        Date dateOfBirth = null;
        if (i11 == 0) {
            C7348o.m30470b(objM27143b);
            InterfaceC6150n interfaceC6150n = this.textEntityExtractor;
            if (interfaceC6150n != null) {
                InputImage inputImageMo25782g = interfaceC5719z.mo25782g();
                bVar.f23506t = C10350l.m39676a(interfaceC5719z);
                bVar.f23507u = C10350l.m39676a(rect);
                bVar.f23510x = 1;
                objM27143b = interfaceC6150n.m27143b(inputImageMo25782g, bVar);
                if (objM27143b == objM38805e) {
                    return objM38805e;
                }
            } else {
                c7347n = null;
            }
            if (c7347n != null) {
                value = c7347n.getValue();
                if (C7347n.m30465g(value)) {
                    value = null;
                }
                abstractC6137a = (AbstractC6137a) value;
            } else {
                abstractC6137a = null;
            }
            z10 = abstractC6137a instanceof AbstractC6137a.f;
            if (z10) {
                AbstractC6137a.f fVar = (AbstractC6137a.f) abstractC6137a;
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
                map.put(string, C10340b.m39661d(iIntValue2 + 1));
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
                    C7347n.Companion companion = C7347n.INSTANCE;
                    return C7347n.m30460b(AbstractC6137a.b.f23474a);
                }
                if (c7347n != null) {
                    return c7347n.getValue();
                }
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            InterfaceC6150n interfaceC6150n2 = this.textEntityExtractor;
            if (interfaceC6150n2 != null) {
                interfaceC6150n2.close();
            }
            C7347n.Companion companion3 = C7347n.INSTANCE;
            Intrinsics.checkNotNull(dateOfBirth);
            Intrinsics.checkNotNull(expirationDate);
            return C7347n.m30460b(new AbstractC6137a.f(new ExtractedTexts(dateOfBirth, expirationDate)));
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7348o.m30470b(objM27143b);
        c7347n = (C7347n) objM27143b;
        if (c7347n != null) {
            value = c7347n.getValue();
            if (C7347n.m30465g(value)) {
                value = null;
            }
            abstractC6137a = (AbstractC6137a) value;
        } else {
            abstractC6137a = null;
        }
        z10 = abstractC6137a instanceof AbstractC6137a.f;
        if (z10) {
            AbstractC6137a.f fVar2 = (AbstractC6137a.f) abstractC6137a;
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
            map3.put(string2, C10340b.m39661d(iIntValue2 + 1));
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
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(AbstractC6137a.b.f23474a);
        }
        if (c7347n != null) {
            return c7347n.getValue();
        }
        C7347n.Companion companion5 = C7347n.INSTANCE;
        return C7347n.m30460b(AbstractC6137a.b.f23474a);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6150n m27144b() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
            return (InterfaceC6150n) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
