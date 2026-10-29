package p482v2;

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
import androidx.core.graphics.C0558k;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p298n2.C8867e;
import p301n5.C8884a;
import p504w1.C12285i;

/* JADX INFO: renamed from: v2.d */
/* JADX INFO: loaded from: classes.dex */
public class C12001d {

    /* JADX INFO: renamed from: a */
    public static final C12285i<c, ProviderInfo> f42488a = new C12285i<>(2);

    /* JADX INFO: renamed from: b */
    public static final Comparator<byte[]> f42489b = new Comparator() { // from class: v2.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C12001d.m44779a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: v2.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        static a m44786a(Context context, Uri uri) {
            return new b(context, uri);
        }

        /* JADX INFO: renamed from: b */
        Cursor mo44787b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: renamed from: v2.d$b */
    public static class b implements a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f42490a;

        public b(Context context, Uri uri) {
            this.f42490a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p482v2.C12001d.a
        /* JADX INFO: renamed from: b */
        public Cursor mo44787b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f42490a;
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

        @Override // p482v2.C12001d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f42490a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: renamed from: v2.d$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f42491a;

        /* JADX INFO: renamed from: b */
        public String f42492b;

        /* JADX INFO: renamed from: c */
        public List<List<byte[]>> f42493c;

        public c(String str, String str2, List<List<byte[]>> list) {
            this.f42491a = str;
            this.f42492b = str2;
            this.f42493c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f42491a, cVar.f42491a) && Objects.equals(this.f42492b, cVar.f42492b) && Objects.equals(this.f42493c, cVar.f42493c);
        }

        public int hashCode() {
            return Objects.hash(this.f42491a, this.f42492b, this.f42493c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m44779a(byte[] bArr, byte[] bArr2) {
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

    /* JADX INFO: renamed from: b */
    public static List<byte[]> m44780b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44781c(List<byte[]> list, List<byte[]> list2) {
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

    /* JADX INFO: renamed from: d */
    public static List<List<byte[]>> m44782d(C12002e c12002e, Resources resources) {
        return c12002e.m44789b() != null ? c12002e.m44789b() : C8867e.m35632c(resources, c12002e.m44790c());
    }

    /* JADX INFO: renamed from: e */
    public static C12004g.a m44783e(Context context, List<C12002e> list, CancellationSignal cancellationSignal) {
        String strM44795h;
        Typeface typefaceM2742h;
        C8884a.m35746c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                C12002e c12002e = list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM2742h = C0558k.m2742h((strM44795h = c12002e.m44795h()))) == null || C0558k.m2744j(typefaceM2742h) == null) {
                    ProviderInfo providerInfoM44784f = m44784f(context.getPackageManager(), c12002e, context.getResources());
                    if (providerInfoM44784f == null) {
                        return C12004g.a.m44811b(1, null);
                    }
                    arrayList.add(m44785g(context, c12002e, providerInfoM44784f.authority, cancellationSignal));
                } else {
                    arrayList.add(new C12004g.b[]{new C12004g.b(strM44795h, c12002e.m44796i())});
                }
            }
            return C12004g.a.m44810a(0, arrayList);
        } finally {
            C8884a.m35749f();
        }
    }

    /* JADX INFO: renamed from: f */
    public static ProviderInfo m44784f(PackageManager packageManager, C12002e c12002e, Resources resources) {
        C8884a.m35746c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listM44782d = m44782d(c12002e, resources);
            c cVar = new c(c12002e.m44792e(), c12002e.m44793f(), listM44782d);
            ProviderInfo providerInfoM45612d = f42488a.m45612d(cVar);
            if (providerInfoM45612d != null) {
                C8884a.m35749f();
                return providerInfoM45612d;
            }
            String strM44792e = c12002e.m44792e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM44792e, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strM44792e);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(c12002e.m44793f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strM44792e + ", but package was not " + c12002e.m44793f());
            }
            List<byte[]> listM44780b = m44780b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listM44780b, f42489b);
            for (int i10 = 0; i10 < listM44782d.size(); i10++) {
                ArrayList arrayList = new ArrayList(listM44782d.get(i10));
                Collections.sort(arrayList, f42489b);
                if (m44781c(listM44780b, arrayList)) {
                    f42488a.m45613e(cVar, providerInfoResolveContentProvider);
                    C8884a.m35749f();
                    return providerInfoResolveContentProvider;
                }
            }
            C8884a.m35749f();
            return null;
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [v2.d$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX INFO: renamed from: g */
    public static C12004g.b[] m44785g(Context context, C12002e c12002e, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z10;
        C8884a.m35746c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarM44786a = a.m44786a(context, uriBuild);
            Cursor cursorMo44787b = null;
            try {
                String[] strArr = {"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE};
                C8884a.m35746c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorMo44787b = aVarM44786a.mo44787b(uriBuild, strArr, "query = ?", new String[]{c12002e.m44794g()}, null, cancellationSignal);
                        C8884a.m35749f();
                        if (cursorMo44787b == null || cursorMo44787b.getCount() <= 0) {
                            aVar = aVarM44786a;
                        } else {
                            int columnIndex = cursorMo44787b.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorMo44787b.getColumnIndex("_id");
                            int columnIndex3 = cursorMo44787b.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                            int columnIndex4 = cursorMo44787b.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                            int columnIndex5 = cursorMo44787b.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                            int columnIndex6 = cursorMo44787b.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                            while (cursorMo44787b.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorMo44787b.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorMo44787b.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo44787b.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo44787b.getLong(columnIndex3));
                                int i12 = columnIndex5 != -1 ? cursorMo44787b.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursorMo44787b.getInt(columnIndex6) != 1) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                arrayList2.add(C12004g.b.m44816a(uriWithAppendedId, i11, i12, z10, i10));
                                aVarM44786a = aVarM44786a;
                            }
                            aVar = aVarM44786a;
                            arrayList = arrayList2;
                        }
                        if (cursorMo44787b != null) {
                            cursorMo44787b.close();
                        }
                        aVar.close();
                        return (C12004g.b[]) arrayList.toArray(new C12004g.b[0]);
                    } finally {
                        C8884a.m35749f();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursorMo44787b != null) {
                        cursorMo44787b.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = aVarM44786a;
            }
        } catch (Throwable th4) {
            C8884a.m35749f();
            throw th4;
        }
    }
}
