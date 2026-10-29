package p601zd;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: zd.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C13786o {

    /* JADX INFO: renamed from: b */
    public static final Pattern f48379b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a */
    public final C13777f f48380a;

    public C13786o(C13777f c13777f) {
        this.f48380a = c13777f;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Set m50233a(C13786o c13786o, Set set, AbstractC13792u abstractC13792u, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        c13786o.m50238f(abstractC13792u, set, new C13782k(c13786o, hashSet, abstractC13792u, zipFile));
        return hashSet;
    }

    /* JADX INFO: renamed from: e */
    public static void m50235e(AbstractC13792u abstractC13792u, InterfaceC13783l interfaceC13783l) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(abstractC13792u.mo50203a());
            try {
                String strMo50204b = abstractC13792u.mo50204b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f48379b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strMo50204b, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new C13785n(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                        for (C13785n c13785n : (Set) map.get(str)) {
                            if (map2.containsKey(c13785n.f48377a)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", c13785n.f48377a, str));
                            } else {
                                map2.put(c13785n.f48377a, c13785n);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", c13785n.f48377a, str));
                            }
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                    }
                }
                interfaceC13783l.mo50232a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e10) {
                e = e10;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e11) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                    }
                }
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            zipFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Set m50236b(AbstractC13792u abstractC13792u) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m50235e(abstractC13792u, new C13780i(this, abstractC13792u, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Set m50237c() throws IllegalAccessException, IOException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<AbstractC13792u> setM50221j = this.f48380a.m50221j();
        for (String str : this.f48380a.m50219h()) {
            Iterator it = setM50221j.iterator();
            do {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f48380a.m50223n(str);
                    break;
                }
            } while (!((AbstractC13792u) it.next()).mo50204b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (AbstractC13792u abstractC13792u : setM50221j) {
            HashSet hashSet2 = new HashSet();
            m50235e(abstractC13792u, new C13781j(this, hashSet2, abstractC13792u));
            for (File file : this.f48380a.m50220i(abstractC13792u.mo50204b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), abstractC13792u.mo50204b(), abstractC13792u.mo50203a().getAbsolutePath()));
                    this.f48380a.m50224o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final void m50238f(AbstractC13792u abstractC13792u, Set set, InterfaceC13784m interfaceC13784m) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C13785n c13785n = (C13785n) it.next();
            File fileM50214c = this.f48380a.m50214c(abstractC13792u.mo50204b(), c13785n.f48377a);
            boolean z10 = false;
            if (fileM50214c.exists() && fileM50214c.length() == c13785n.f48378b.getSize() && C13777f.m50208p(fileM50214c)) {
                z10 = true;
            }
            interfaceC13784m.mo50231a(c13785n, fileM50214c, z10);
        }
    }
}
