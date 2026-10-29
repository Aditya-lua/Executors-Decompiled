package v2;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.graphics.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import w1.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i<c, ProviderInfo> f32700a = new i<>(2);
    public static final Comparator<byte[]> b = new Comparator() { // from class: v2.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f32701a;

        public b(Context context, Uri uri) {
            this.f32701a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // v2.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f32701a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // v2.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f32701a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32702a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f32703c;

        public c(String str, String str2, List<List<byte[]>> list) {
            this.f32702a = str;
            this.b = str2;
            this.f32703c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f32702a, cVar.f32702a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.f32703c, cVar.f32703c);
        }

        public int hashCode() {
            return Objects.hash(this.f32702a, this.b, this.f32703c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : n2.e.c(resources, eVar.c());
    }

    public static g.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        n5.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = k.h((strH = eVar.h()))) == null || k.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                    if (providerInfoF == null) {
                        return g.a.b(1, null);
                    }
                    arrayList.add(g(context, eVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new g.b[]{new g.b(strH, eVar.i())});
                }
            }
            return g.a.a(0, arrayList);
        } finally {
            n5.a.f();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        n5.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfoD = f32700a.d(cVar);
            if (providerInfoD != null) {
                n5.a.f();
                return providerInfoD;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList(listD.get(i10));
                Collections.sort(arrayList, b);
                if (c(listB, arrayList)) {
                    f32700a.e(cVar, providerInfoResolveContentProvider);
                    n5.a.f();
                    return providerInfoResolveContentProvider;
                }
            }
            n5.a.f();
            return null;
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [v2.d$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    public static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z10;
        n5.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                n5.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        n5.a.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                int i12 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                arrayList2.add(g.b.a(uriWithAppendedId, i11, i12, z10, i10));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (g.b[]) arrayList.toArray(new g.b[0]);
                    } finally {
                        n5.a.f();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = aVarA;
            }
        } catch (Throwable th4) {
            n5.a.f();
            throw th4;
        }
    }
}
