package yd;

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

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35847a;

    public o(f fVar) {
        this.f35847a = fVar;
    }

    public static /* bridge */ /* synthetic */ Set a(o oVar, Set set, u uVar, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        oVar.f(uVar, set, new k(oVar, hashSet, uVar, zipFile));
        return hashSet;
    }

    public static void e(u uVar, l lVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(uVar.a());
            try {
                String strB = uVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new n(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                        for (n nVar : (Set) map.get(str)) {
                            if (map2.containsKey(nVar.f35846a)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", nVar.f35846a, str));
                            } else {
                                map2.put(nVar.f35846a, nVar);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", nVar.f35846a, str));
                            }
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                    }
                }
                lVar.a(zipFile, new HashSet(map2.values()));
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

    public final Set b(u uVar) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(uVar, new i(this, uVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final Set c() throws IllegalAccessException, IOException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<u> setJ = this.f35847a.j();
        for (String str : this.f35847a.h()) {
            Iterator it = setJ.iterator();
            do {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f35847a.n(str);
                    break;
                }
            } while (!((u) it.next()).b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (u uVar : setJ) {
            HashSet hashSet2 = new HashSet();
            e(uVar, new j(this, hashSet2, uVar));
            for (File file : this.f35847a.i(uVar.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), uVar.b(), uVar.a().getAbsolutePath()));
                    this.f35847a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void f(u uVar, Set set, m mVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            File fileC = this.f35847a.c(uVar.b(), nVar.f35846a);
            boolean z10 = false;
            if (fileC.exists() && fileC.length() == nVar.b.getSize() && f.p(fileC)) {
                z10 = true;
            }
            mVar.a(nVar, fileC, z10);
        }
    }
}
