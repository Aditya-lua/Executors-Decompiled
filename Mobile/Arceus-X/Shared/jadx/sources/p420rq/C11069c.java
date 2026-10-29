package p420rq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.inputmethod.EditorInfoCompat;
import cu.C4366b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c4.C1523a;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7835a2;
import p256ku.C7864g1;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: rq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lrq/c;", "Lrq/a;", "<init>", "()V", "Ljava/io/File;", "file", "Ljt/n;", "", "a", "(Ljava/io/File;Lnt/b;)Ljava/lang/Object;", "", "", "exifData", "f", "(Ljava/io/File;Ljava/util/Map;)V", "d", "(Ljava/io/File;)Ljava/util/Map;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "c", "(Landroid/graphics/BitmapFactory$Options;II)I", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11069c implements InterfaceC11067a {

    /* JADX INFO: renamed from: rq.c$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.image.RealImageHelper", m39664f = "ImageHelper.kt", m39665l = {21}, m39666m = "resizeAndCompressImageInPlace-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f39077t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f39078u;

        /* JADX INFO: renamed from: w */
        public int f39080w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39078u = obj;
            this.f39080w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo41740a = C11069c.this.mo41740a(null, this);
            return objMo41740a == C10047c.m38805e() ? objMo41740a : C7347n.m30459a(objMo41740a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C7347n m41742e(C11069c c11069c, File file) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Map<String, String> mapM41744d = c11069c.m41744d(file);
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = c11069c.m41743c(options, 2000, 2000);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmapDecodeFile != null) {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }
            C11958c.m44629a(fileOutputStream, null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
            c11069c.m41745f(file, mapM41744d);
            objM30460b = C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th4) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th4));
        }
        return C7347n.m30459a(objM30460b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p420rq.InterfaceC11067a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo41740a(@NotNull final File file, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f39080w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f39080w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM32562b = aVar.f39078u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f39080w;
        if (i11 == 0) {
            C7348o.m30470b(objM32562b);
            AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
            Function0 function0 = new Function0() { // from class: rq.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11069c.m41742e(this.f39075a, file);
                }
            };
            aVar.f39077t = C10350l.m39676a(file);
            aVar.f39080w = 1;
            objM32562b = C7835a2.m32562b(abstractC7888l0M32643a, function0, aVar);
            if (objM32562b == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32562b);
        }
        return ((C7347n) objM32562b).getValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m41743c(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        if (i10 > reqHeight || i11 > reqWidth) {
            return Math.min(C4366b.m22016d(i10 / reqHeight), C4366b.m22016d(i11 / reqWidth));
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m41744d(File file) {
        try {
            List listM31895n = C7699p.m31895n("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                C1523a c1523a = new C1523a(fileInputStream);
                List list = listM31895n;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, c1523a.m8001k((String) obj));
                }
                C11958c.m44629a(fileInputStream, null);
                return linkedHashMap;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            return C7690k0.m31795j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m41745f(File file, Map<String, String> exifData) throws Throwable {
        try {
            C1523a c1523a = new C1523a(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    c1523a.m7996h0(str, str2);
                }
            }
            c1523a.m7988c0();
        } catch (IOException unused) {
        }
    }
}
