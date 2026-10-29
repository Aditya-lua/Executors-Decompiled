package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7693m;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7352s;
import p477ut.C11958c;
import p477ut.C11966k;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1uSDK implements AFc1vSDK {

    @NotNull
    private final AFc1qSDK AFKeystoreWrapper;

    @NotNull
    private final Map<String, Integer> AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFc1kSDK f6894d;

    @NotNull
    private final AFd1zSDK registerClient;

    public AFc1uSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.registerClient = aFd1zSDK;
        this.f6894d = aFc1kSDK;
        this.AFKeystoreWrapper = new AFc1qSDK(C7699p.m31895n(new AFc1pSDK("ConversionsCache", C7697o.m31878d(AFd1bSDK.CONVERSION), 1), new AFc1pSDK("AttrCache", C7697o.m31878d(AFd1bSDK.ATTR), 1), new AFc1pSDK("OtherCache", C7699p.m31895n(AFd1bSDK.LAUNCH, AFd1bSDK.INAPP, AFd1bSDK.ADREVENUE, AFd1bSDK.ARS_VALIDATE, AFd1bSDK.PURCHASE_VALIDATE, AFd1bSDK.MANUAL_PURCHASE_VALIDATION), 40)));
        this.AFLogger = C7690k0.m31799n(C7352s.m30477a("ConversionsCache", 0), C7352s.m30477a("AttrCache", 0), C7352s.m30477a("OtherCache", 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void registerClient() {
        for (AFc1pSDK aFc1pSDK : this.AFKeystoreWrapper.f6890d) {
            String str = aFc1pSDK.f6889d;
            Context context = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.AFLogger;
                String str2 = aFc1pSDK.f6889d;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.AFLogger.put(aFc1pSDK.f6889d, 0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static AFc1sSDK unregisterClient(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1sSDK aFc1sSDK = new AFc1sSDK(cArr);
                aFc1sSDK.registerClient = file.getName();
                C11958c.m44629a(inputStreamReader, null);
                return aFc1sSDK;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(inputStreamReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.mo8697e(LogTag.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1sSDK> AFKeystoreWrapper() {
        int i10;
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFKeystoreWrapper.f6890d.iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1pSDK) it.next()).f6889d;
                Context context3 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                C7708u.m31920A(arrayList2, fileArrListFiles);
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                File file2 = (File) obj;
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1sSDK aFc1sSDKUnregisterClient = unregisterClient(file2);
                if (aFc1sSDKUnregisterClient != null) {
                    arrayList.add(aFc1sSDKUnregisterClient);
                }
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not get cached requests", e10, false, false, false, false, 120, null);
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found " + arrayList.size() + " Cached Requests", false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFLogger(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.registerClient.f6933d;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Deleting " + str + " from cache", false, 4, null);
        Iterator<T> it = this.AFKeystoreWrapper.f6890d.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1pSDK) it.next()).f6889d;
            Context context3 = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return registerClient(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    /* JADX INFO: renamed from: d */
    public final void mo8774d() {
        try {
            if (this.f6894d.AFLogger("AF_CACHE_VERSION", -1) == 3) {
                Context context = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.registerClient.f6933d;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.f6894d.mo8763d("AF_CACHE_VERSION", 3);
                Context context3 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.registerClient.f6933d;
                    Intrinsics.checkNotNull(context4);
                    C11966k.m44657o(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.registerClient.f6933d;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            registerClient();
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not init cache", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void unregisterClient() {
        try {
            Context context = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFKeystoreWrapper.f6890d.iterator();
            while (it.hasNext()) {
                String str = ((AFc1pSDK) it.next()).f6889d;
                Context context3 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.CACHE;
                        AFLoggerBase.i$default(aFLogger, logTag, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFLoggerBase.i$default(aFLogger, logTag, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context4);
            C11966k.m44657o(new File(context4.getFilesDir(), "AFRequestCache"));
            registerClient();
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not clearCache request", e10, false, false, false, false, 120, null);
        }
    }

    private final boolean registerClient(File file) {
        try {
            file.delete();
            registerClient();
            return true;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not delete " + file.getName() + " from cache", e10, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1pSDK registerClient(AFe1zSDK aFe1zSDK) {
        Object next;
        Iterator<T> it = this.AFKeystoreWrapper.f6890d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1pSDK) next).unregisterClient.contains(aFe1zSDK)) {
                return (AFc1pSDK) next;
            }
        }
        next = null;
        return (AFc1pSDK) next;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @Nullable
    public final String registerClient(@NotNull AFc1sSDK aFc1sSDK) {
        Exception exc;
        File file;
        String str;
        List listM31863f0;
        List<File> listH0;
        Intrinsics.checkNotNullParameter(aFc1sSDK, "");
        try {
            AFe1zSDK aFe1zSDK = aFc1sSDK.AFLogger;
            Intrinsics.checkNotNullExpressionValue(aFe1zSDK, "");
            Context context = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.CACHE;
            AFLoggerBase.i$default(aFLogger, logTag, "Caching request with URL: " + aFc1sSDK.unregisterClient, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1sSDK.AFKeystoreWrapper);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1sSDK.unregisterClient);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1sSDK.f6891d, 2));
                    outputStreamWriter.write(10);
                    AFe1zSDK aFe1zSDK2 = aFc1sSDK.AFLogger;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1zSDK2.unregisterClient());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1sSDK.f6892e;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1sSDK.f6892e;
                        Intrinsics.m31981d(map2, "");
                        String string = new JSONObject(map2).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    Unit unit = Unit.f29331a;
                    C11958c.m44629a(outputStreamWriter, null);
                    AFLoggerBase.i$default(aFLogger, logTag, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1zSDK aFe1zSDK3 = aFc1sSDK.AFLogger;
                    Intrinsics.checkNotNullExpressionValue(aFe1zSDK3, "");
                    AFc1pSDK aFc1pSDKRegisterClient = registerClient(aFe1zSDK3);
                    Integer numValueOf = aFc1pSDKRegisterClient != null ? Integer.valueOf(aFc1pSDKRegisterClient.AFKeystoreWrapper) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map3 = this.AFLogger;
                    AFc1pSDK aFc1pSDKRegisterClient2 = registerClient(aFe1zSDK3);
                    if (aFc1pSDKRegisterClient2 != null && (str = aFc1pSDKRegisterClient2.f6889d) != null) {
                        Integer num = map3.get(str);
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        if (iIntValue2 >= iIntValue) {
                            int i10 = (iIntValue2 + 1) - iIntValue;
                            AFLoggerBase.i$default(aFLogger, logTag, "Cache overflown for type " + aFe1zSDK3 + ", removing " + i10 + " item(s)", false, 4, null);
                            Context context2 = this.registerClient.f6933d;
                            Intrinsics.checkNotNull(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), unregisterClient(aFe1zSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] fileArrListFiles = file3.listFiles();
                            if (fileArrListFiles != null && (listM31863f0 = C7693m.m31863f0(fileArrListFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1uSDK.2
                                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t8, T t10) {
                                    return C8662a.m34743a(((File) t8).getName(), ((File) t10).getName());
                                }
                            })) != null && (listH0 = CollectionsKt.m31682H0(listM31863f0, i10)) != null) {
                                for (File file4 : listH0) {
                                    file4.delete();
                                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        registerClient();
                        return strValueOf;
                    }
                    throw new UnsupportedOperationException("Cache do not support this type of events");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                exc = e10;
                if (file != null) {
                    file.delete();
                }
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e11) {
            exc = e11;
            file = null;
        }
    }

    private final String unregisterClient(AFe1zSDK aFe1zSDK) {
        String str;
        AFc1pSDK aFc1pSDKRegisterClient = registerClient(aFe1zSDK);
        if (aFc1pSDKRegisterClient == null || (str = aFc1pSDKRegisterClient.f6889d) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }
}
