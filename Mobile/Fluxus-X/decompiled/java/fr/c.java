package fr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import av.a2;
import av.g1;
import av.l0;
import com.github.luben.zstd.BuildConfig;
import gu.f;
import gu.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.collections.k0;
import p001kotlin.collections.p;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function0;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfr/c;", "Lfr/a;", "<init>", "()V", "Ljava/io/File;", "file", "Lzt/n;", BuildConfig.FLAVOR, "a", "(Ljava/io/File;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "exifData", "f", "(Ljava/io/File;Ljava/util/Map;)V", "d", "(Ljava/io/File;)Ljava/util/Map;", "Landroid/graphics/BitmapFactory$Options;", "options", BuildConfig.FLAVOR, "reqWidth", "reqHeight", "c", "(Landroid/graphics/BitmapFactory$Options;II)I", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements fr.a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.shared.image.RealImageHelper", f = "ImageHelper.kt", l = {21}, m = "resizeAndCompressImageInPlace-gIAlu-s")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f16570t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f16571u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f16573w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16571u = obj;
            this.f16573w |= Integer.MIN_VALUE;
            Object objA = c.this.a(null, this);
            return objA == fu.c.e() ? objA : n.a(objA);
        }
    }

    public static final n e(c cVar, File file) {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Map<String, String> mapD = cVar.d(file);
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = cVar.c(options, 2000, 2000);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmapDecodeFile != null) {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }
            lu.c.a(fileOutputStream, null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
            cVar.f(file, mapD);
            objB = n.b(Unit.f21506a);
        } catch (Throwable th4) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th4));
        }
        return n.a(objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fr.a
    @Nullable
    public Object a(@NotNull final File file, @NotNull eu.b<? super n<Unit>> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f16573w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f16573w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objB = aVar.f16571u;
        Object objE = fu.c.e();
        int i11 = aVar.f16573w;
        if (i11 == 0) {
            o.b(objB);
            l0 l0VarA = g1.a();
            Function0 function0 = new Function0() { // from class: fr.b
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.e(this.f16569a, file);
                }
            };
            aVar.f16570t = l.a(file);
            aVar.f16573w = 1;
            objB = a2.b(l0VarA, function0, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objB);
        }
        return ((n) objB).getValue();
    }

    public final int c(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        if (i10 > reqHeight || i11 > reqWidth) {
            return Math.min(su.b.d(i10 / reqHeight), su.b.d(i11 / reqWidth));
        }
        return 1;
    }

    public final Map<String, String> d(File file) {
        try {
            List listN = p.n("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                d4.a aVar = new d4.a(fileInputStream);
                List list = listN;
                LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(j0.f(q.u(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, aVar.k((String) obj));
                }
                lu.c.a(fileInputStream, null);
                return linkedHashMap;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            return k0.j();
        }
    }

    public final void f(File file, Map<String, String> exifData) throws Throwable {
        try {
            d4.a aVar = new d4.a(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    aVar.h0(str, str2);
                }
            }
            aVar.c0();
        } catch (IOException unused) {
        }
    }
}
