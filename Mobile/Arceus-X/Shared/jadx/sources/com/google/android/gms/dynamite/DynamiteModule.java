package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p213j9.C7091d;
import p305n9.C8947k;
import p305n9.C8953m;
import p462u9.C11816g;
import p462u9.C11822m;
import p571y9.BinderC13134b;
import p571y9.InterfaceC13133a;
import p599z9.C13750a;
import p599z9.C13751b;
import p599z9.C13753d;
import p599z9.C13754e;
import p599z9.C13755f;
import p599z9.C13756g;
import p599z9.C13757h;
import p599z9.C13758i;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h */
    public static Boolean f7559h = null;

    /* JADX INFO: renamed from: i */
    public static String f7560i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f7561j = false;

    /* JADX INFO: renamed from: k */
    public static int f7562k = -1;

    /* JADX INFO: renamed from: l */
    public static Boolean f7563l;

    /* JADX INFO: renamed from: r */
    public static C13757h f7569r;

    /* JADX INFO: renamed from: s */
    public static C13758i f7570s;

    /* JADX INFO: renamed from: a */
    public final Context f7571a;

    /* JADX INFO: renamed from: m */
    public static final ThreadLocal f7564m = new ThreadLocal();

    /* JADX INFO: renamed from: n */
    public static final ThreadLocal f7565n = new C13755f();

    /* JADX INFO: renamed from: o */
    public static final InterfaceC1907b.a f7566o = new C1909b();

    /* JADX INFO: renamed from: b */
    @NonNull
    public static final InterfaceC1907b f7553b = new C1910c();

    /* JADX INFO: renamed from: c */
    @NonNull
    public static final InterfaceC1907b f7554c = new C1911d();

    /* JADX INFO: renamed from: d */
    @NonNull
    public static final InterfaceC1907b f7555d = new C1912e();

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final InterfaceC1907b f7556e = new C1913f();

    /* JADX INFO: renamed from: f */
    @NonNull
    public static final InterfaceC1907b f7557f = new C1914g();

    /* JADX INFO: renamed from: g */
    @NonNull
    public static final InterfaceC1907b f7558g = new C1915h();

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final InterfaceC1907b f7567p = new C1916i();

    /* JADX INFO: renamed from: q */
    @NonNull
    public static final InterfaceC1907b f7568q = new C1908a();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1906a extends Exception {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (c)] (LINE:1) call: java.lang.Exception.<init>(java.lang.String, java.lang.Throwable):void type: SUPER */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1906a(String str, Throwable th2, byte[] bArr) {
            super(str, th2);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c)] (LINE:2) call: java.lang.Exception.<init>(java.lang.String):void type: SUPER */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ C1906a(String str, byte[] bArr) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface InterfaceC1907b {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            int mo9246a(@NonNull Context context, @NonNull String str, boolean z10);

            /* JADX INFO: renamed from: b */
            int mo9247b(@NonNull Context context, @NonNull String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f7572a = 0;

            /* JADX INFO: renamed from: b */
            public int f7573b = 0;

            /* JADX INFO: renamed from: c */
            public int f7574c = 0;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        b mo9245a(@NonNull Context context, @NonNull String str, @NonNull a aVar);
    }

    public DynamiteModule(Context context) {
        C8953m.m36047l(context);
        this.f7571a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m9233a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C8947k.m36026b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m9234c(@NonNull Context context, @NonNull String str) {
        return m9236f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0272 A[Catch: all -> 0x0270, TRY_ENTER, TryCatch #0 {, blocks: (B:35:0x00f1, B:37:0x00f7, B:38:0x00f9, B:105:0x0272, B:106:0x027a), top: B:149:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f8 A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ce A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:5:0x0045, B:9:0x00bc, B:16:0x00c8, B:19:0x00ce, B:32:0x00ec, B:109:0x027d, B:110:0x0288, B:118:0x0298, B:120:0x02c0, B:122:0x02cf, B:132:0x02ef, B:133:0x02f7, B:113:0x028b, B:114:0x028c, B:115:0x0294, B:134:0x02f8, B:135:0x0319, B:136:0x031a, B:137:0x036c), top: B:151:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7 A[Catch: all -> 0x0270, TryCatch #0 {, blocks: (B:35:0x00f1, B:37:0x00f7, B:38:0x00f9, B:105:0x0272, B:106:0x027a), top: B:149:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0103 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0205 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x020d A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x021c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0227 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0237 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x024c A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0255 A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x025e A[Catch: all -> 0x0174, a -> 0x0179, RemoteException -> 0x017e, TryCatch #8 {RemoteException -> 0x017e, a -> 0x0179, all -> 0x0174, blocks: (B:34:0x00f0, B:40:0x00fc, B:42:0x0103, B:43:0x0136, B:47:0x013c, B:49:0x0144, B:51:0x0148, B:52:0x0153, B:59:0x0160, B:67:0x0196, B:69:0x019e, B:70:0x01a5, B:71:0x01ae, B:66:0x0183, B:74:0x01b1, B:75:0x01b2, B:76:0x01ba, B:77:0x01bb, B:78:0x01c3, B:81:0x01c6, B:82:0x01c7, B:84:0x01fe, B:86:0x0205, B:88:0x020d, B:94:0x0246, B:96:0x024c, B:97:0x0255, B:98:0x025d, B:89:0x021c, B:90:0x0224, B:92:0x0227, B:93:0x0237, B:99:0x025e, B:100:0x0266, B:101:0x0267, B:102:0x026f, B:108:0x027c), top: B:157:0x00f0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.dynamite.DynamiteModule$b] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @NonNull
    /* JADX INFO: renamed from: e */
    public static DynamiteModule m9235e(@NonNull Context context, @NonNull InterfaceC1907b interfaceC1907b, @NonNull String str) throws C1906a {
        ?? r8;
        int i10;
        DynamiteModule dynamiteModuleM9240j;
        Cursor cursor;
        int i11;
        Boolean bool;
        C13757h c13757hM9242l;
        int iM50165x2;
        InterfaceC13133a interfaceC13133aM50161t2;
        Object objM48742t2;
        C13756g c13756g;
        C13758i c13758i;
        C13756g c13756g2;
        boolean z10;
        InterfaceC13133a interfaceC13133aM50168t2;
        Cursor cursor2;
        String str2 = ":";
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext == null) {
            throw new C1906a("null application Context", null);
        }
        ThreadLocal threadLocal = f7564m;
        C13756g c13756g3 = (C13756g) threadLocal.get();
        C13756g c13756g4 = new C13756g(null);
        threadLocal.set(c13756g4);
        ThreadLocal threadLocal2 = f7565n;
        Long l10 = (Long) threadLocal2.get();
        long jLongValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            InterfaceC1907b.b bVarMo9245a = interfaceC1907b.mo9245a(context, str, f7566o);
            int i12 = bVarMo9245a.f7572a;
            int i13 = bVarMo9245a.f7573b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i12).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i13).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            Log.i("DynamiteModule", sb2.toString());
            int i14 = bVarMo9245a.f7574c;
            if (i14 != 0) {
                if (i14 != -1) {
                    if (i14 == 1 || bVarMo9245a.f7573b != 0) {
                        if (i14 == -1) {
                            DynamiteModule dynamiteModuleM9240j2 = m9240j(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l10);
                            }
                            cursor2 = c13756g4.f48325a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(c13756g3);
                            return dynamiteModuleM9240j2;
                        }
                        if (i14 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i14);
                            throw new C1906a(sb3.toString(), null);
                        }
                        try {
                            try {
                                i11 = bVarMo9245a.f7573b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (m9237g(context)) {
                                            throw new C1906a("Remote loading disabled", null);
                                        }
                                        bool = f7559h;
                                    }
                                    if (bool != null) {
                                        throw new C1906a("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i11);
                                        Log.i("DynamiteModule", sb4.toString());
                                        synchronized (DynamiteModule.class) {
                                            c13758i = f7570s;
                                        }
                                        if (c13758i != null) {
                                            throw new C1906a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        c13756g2 = (C13756g) threadLocal.get();
                                        if (c13756g2 != null || c13756g2.f48325a == null) {
                                            throw new C1906a("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = c13756g2.f48325a;
                                        BinderC13134b.m48743u2(null);
                                        synchronized (DynamiteModule.class) {
                                            z10 = f7562k >= 2;
                                        }
                                        if (z10) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            interfaceC13133aM50168t2 = c13758i.m50169u2(BinderC13134b.m48743u2(applicationContext2), str, i11, BinderC13134b.m48743u2(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            interfaceC13133aM50168t2 = c13758i.m50168t2(BinderC13134b.m48743u2(applicationContext2), str, i11, BinderC13134b.m48743u2(cursor3));
                                        }
                                        Context context2 = (Context) BinderC13134b.m48742t2(interfaceC13133aM50168t2);
                                        if (context2 == null) {
                                            throw new C1906a("Failed to get module context", bArr);
                                        }
                                        dynamiteModuleM9240j = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                                        sb5.append("Selected remote version of ");
                                        sb5.append(str);
                                        sb5.append(", version >= ");
                                        sb5.append(i11);
                                        Log.i("DynamiteModule", sb5.toString());
                                        c13757hM9242l = m9242l(context);
                                        if (c13757hM9242l != null) {
                                            throw new C1906a("Failed to create IDynamiteLoader.", null);
                                        }
                                        iM50165x2 = c13757hM9242l.m50165x2();
                                        if (iM50165x2 >= 3) {
                                            c13756g = (C13756g) threadLocal.get();
                                            if (c13756g != null) {
                                                throw new C1906a("No cached result cursor holder", null);
                                            }
                                            interfaceC13133aM50161t2 = c13757hM9242l.m50167z2(BinderC13134b.m48743u2(context), str, i11, BinderC13134b.m48743u2(c13756g.f48325a));
                                        } else if (iM50165x2 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            interfaceC13133aM50161t2 = c13757hM9242l.m50163v2(BinderC13134b.m48743u2(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            interfaceC13133aM50161t2 = c13757hM9242l.m50161t2(BinderC13134b.m48743u2(context), str, i11);
                                        }
                                        objM48742t2 = BinderC13134b.m48742t2(interfaceC13133aM50161t2);
                                        if (objM48742t2 != null) {
                                            throw new C1906a("Failed to load remote module.", null);
                                        }
                                        dynamiteModuleM9240j = new DynamiteModule((Context) objM48742t2);
                                    }
                                    if (jLongValue == 0) {
                                        f7565n.remove();
                                    } else {
                                        f7565n.set(l10);
                                    }
                                    cursor = c13756g4.f48325a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f7564m.set(c13756g3);
                                    return dynamiteModuleM9240j;
                                } catch (RemoteException e10) {
                                    throw new C1906a("Failed to load remote module.", e10, null);
                                } catch (C1906a e11) {
                                    throw e11;
                                } catch (Throwable th2) {
                                    C11816g.m44179a(context, th2);
                                    throw new C1906a("Failed to load remote module.", th2, null);
                                }
                            } catch (C1906a e12) {
                                e = e12;
                                r8 = str2;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i10 = bVarMo9245a.f7572a;
                                if (i10 != 0 || interfaceC1907b.mo9245a(r8, str, new C1917j(i10, 0)).f7574c != -1) {
                                    throw new C1906a("Remote load failed. No local fallback found.", e, null);
                                }
                                dynamiteModuleM9240j = m9240j(applicationContext, str);
                            }
                        } catch (C1906a e13) {
                            e = e13;
                            r8 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i10 = bVarMo9245a.f7572a;
                            if (i10 != 0) {
                            }
                            throw new C1906a("Remote load failed. No local fallback found.", e, null);
                        }
                    }
                } else if (bVarMo9245a.f7572a != 0) {
                    i14 = -1;
                    if (i14 == 1) {
                    }
                    if (i14 == -1) {
                        DynamiteModule dynamiteModuleM9240j3 = m9240j(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l10);
                        }
                        cursor2 = c13756g4.f48325a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(c13756g3);
                        return dynamiteModuleM9240j3;
                    }
                    if (i14 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i14).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i14);
                        throw new C1906a(sb8.toString(), null);
                    }
                    i11 = bVarMo9245a.f7573b;
                    synchronized (DynamiteModule.class) {
                        if (m9237g(context)) {
                            throw new C1906a("Remote loading disabled", null);
                        }
                        bool = f7559h;
                        if (bool != null) {
                            throw new C1906a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                            sb9.append("Selected remote version of ");
                            sb9.append(str);
                            sb9.append(", version >= ");
                            sb9.append(i11);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (DynamiteModule.class) {
                                c13758i = f7570s;
                                if (c13758i != null) {
                                    throw new C1906a("DynamiteLoaderV2 was not cached.", null);
                                }
                                c13756g2 = (C13756g) threadLocal.get();
                                if (c13756g2 != null) {
                                }
                                throw new C1906a("No result cursor", null);
                            }
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i11).length());
                        sb10.append("Selected remote version of ");
                        sb10.append(str);
                        sb10.append(", version >= ");
                        sb10.append(i11);
                        Log.i("DynamiteModule", sb10.toString());
                        c13757hM9242l = m9242l(context);
                        if (c13757hM9242l != null) {
                            throw new C1906a("Failed to create IDynamiteLoader.", null);
                        }
                        iM50165x2 = c13757hM9242l.m50165x2();
                        if (iM50165x2 >= 3) {
                            c13756g = (C13756g) threadLocal.get();
                            if (c13756g != null) {
                                throw new C1906a("No cached result cursor holder", null);
                            }
                            interfaceC13133aM50161t2 = c13757hM9242l.m50167z2(BinderC13134b.m48743u2(context), str, i11, BinderC13134b.m48743u2(c13756g.f48325a));
                        } else if (iM50165x2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            interfaceC13133aM50161t2 = c13757hM9242l.m50163v2(BinderC13134b.m48743u2(context), str, i11);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            interfaceC13133aM50161t2 = c13757hM9242l.m50161t2(BinderC13134b.m48743u2(context), str, i11);
                        }
                        objM48742t2 = BinderC13134b.m48742t2(interfaceC13133aM50161t2);
                        if (objM48742t2 != null) {
                            throw new C1906a("Failed to load remote module.", null);
                        }
                        dynamiteModuleM9240j = new DynamiteModule((Context) objM48742t2);
                        if (jLongValue == 0) {
                            f7565n.remove();
                        } else {
                            f7565n.set(l10);
                        }
                        cursor = c13756g4.f48325a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f7564m.set(c13756g3);
                        return dynamiteModuleM9240j;
                    }
                }
            }
            int i15 = bVarMo9245a.f7572a;
            int i16 = bVarMo9245a.f7573b;
            StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb11.append("No acceptable module ");
            sb11.append(str);
            sb11.append(" found. Local version is ");
            sb11.append(i15);
            sb11.append(" and remote version is ");
            sb11.append(i16);
            sb11.append(".");
            throw new C1906a(sb11.toString(), null);
        } catch (Throwable th3) {
            if (jLongValue == 0) {
                f7565n.remove();
            } else {
                f7565n.set(l10);
            }
            Cursor cursor4 = c13756g4.f48325a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f7564m.set(c13756g3);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018f A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:65:0x00e9, B:67:0x00ef, B:75:0x011d, B:103:0x0181, B:107:0x018f, B:125:0x01ec, B:126:0x01ef, B:120:0x01e3, B:73:0x00fa, B:128:0x01f1, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:63:0x00e6, B:22:0x004d, B:46:0x00a5, B:49:0x00a8, B:56:0x00c0, B:64:0x00e8, B:62:0x00c6), top: B:141:0x0006, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: all -> 0x003a, TryCatch #12 {all -> 0x003a, blocks: (B:10:0x002a, B:12:0x0036, B:53:0x00bd, B:17:0x003f, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:32:0x0061, B:34:0x0069, B:37:0x0070, B:44:0x009c, B:45:0x00a4, B:40:0x0077, B:42:0x007d, B:43:0x008e, B:48:0x00a7, B:51:0x00aa, B:52:0x00b4, B:18:0x0042), top: B:144:0x002a, inners: #2 }] */
    /* JADX INFO: renamed from: f */
    public static int m9236f(@NonNull Context context, @NonNull String str, boolean z10) {
        Throwable th2;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f7559h;
                Cursor cursor2 = null;
                int iM50162u2 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m9241k(classLoader);
                                    } catch (C1906a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m9237g(context)) {
                                        return 0;
                                    }
                                    if (f7561j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM9238h = m9238h(context, str, z10, true);
                                                String str2 = f7560i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM50160a = C13753d.m50160a();
                                                    if (classLoaderM50160a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            C13751b.m50159a();
                                                            String str3 = f7560i;
                                                            C8953m.m36047l(str3);
                                                            classLoaderM50160a = C13750a.m50158a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f7560i;
                                                            C8953m.m36047l(str4);
                                                            classLoaderM50160a = new C13754e(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m9241k(classLoaderM50160a);
                                                    declaredField.set(null, classLoaderM50160a);
                                                    f7559h = bool2;
                                                    return iM9238h;
                                                }
                                                return iM9238h;
                                            } catch (C1906a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f7559h = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String string = e10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m9238h(context, str, z10, false);
                    } catch (C1906a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                C13757h c13757hM9242l = m9242l(context);
                if (c13757hM9242l != null) {
                    try {
                        try {
                            int iM50165x2 = c13757hM9242l.m50165x2();
                            if (iM50165x2 >= 3) {
                                C13756g c13756g = (C13756g) f7564m.get();
                                if (c13756g == null || (cursor = c13756g.f48325a) == null) {
                                    Cursor cursor3 = (Cursor) BinderC13134b.m48742t2(c13757hM9242l.m50166y2(BinderC13134b.m48743u2(context), str, z10, ((Long) f7565n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !m9239i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iM50162u2 = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append("Failed to retrieve remote module version: ");
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th2;
                                            }
                                            cursor2.close();
                                            throw th2;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iM50162u2 = cursor.getInt(0);
                                }
                            } else if (iM50165x2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iM50162u2 = c13757hM9242l.m50164w2(BinderC13134b.m48743u2(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iM50162u2 = c13757hM9242l.m50162u2(BinderC13134b.m48743u2(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                }
                return iM50162u2;
            }
        } catch (Throwable th6) {
            C11816g.m44179a(context, th6);
            throw th6;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9237g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7563l)) {
            return true;
        }
        boolean z10 = false;
        if (f7563l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != C11822m.m44202i() ? 0 : 268435456);
            if (C7091d.m29876f().mo29855h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f7563l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7561j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Code duplicated, block: B:101:0x0163 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0186 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x015d, B:99:0x015f, B:101:0x0163, B:102:0x0185, B:103:0x0186), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:92:0x0147 */
    /* JADX INFO: renamed from: h */
    public static int m9238h(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f7565n.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z13 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr4[i11] = null;
                                        } else if (type == 1) {
                                            objArr4[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr4[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr4[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f7560i = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f7562k = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            f7561j = z12;
                                            z13 = z12;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                if (m9239i(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new C1906a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (!(exc instanceof C1906a)) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new C1906a(sb2.toString(), exc, objArr == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C1906a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th7) {
                th2 = th7;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (Exception e11) {
            exc = e11;
            if (!(exc instanceof C1906a)) {
                throw exc;
            }
            String message2 = exc.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 25);
            sb3.append("V2 version check failed: ");
            sb3.append(message2);
            throw new C1906a(sb3.toString(), exc, objArr == true ? 1 : 0);
        } catch (Throwable th8) {
            th2 = th8;
            if (cursor2 != null) {
                throw th2;
            }
            cursor2.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9239i(Cursor cursor) {
        C13756g c13756g = (C13756g) f7564m.get();
        if (c13756g == null || c13756g.f48325a != null) {
            return false;
        }
        c13756g.f48325a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static DynamiteModule m9240j(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* JADX INFO: renamed from: k */
    public static void m9241k(ClassLoader classLoader) throws C1906a {
        C13758i c13758i;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                c13758i = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c13758i = iInterfaceQueryLocalInterface instanceof C13758i ? (C13758i) iInterfaceQueryLocalInterface : new C13758i(iBinder);
            }
            f7570s = c13758i;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new C1906a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new C1906a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e12) {
            e = e12;
            throw new C1906a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new C1906a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new C1906a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    /* JADX INFO: renamed from: l */
    public static C13757h m9242l(Context context) {
        C13757h c13757h;
        synchronized (DynamiteModule.class) {
            C13757h c13757h2 = f7569r;
            if (c13757h2 != null) {
                return c13757h2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c13757h = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c13757h = iInterfaceQueryLocalInterface instanceof C13757h ? (C13757h) iInterfaceQueryLocalInterface : new C13757h(iBinder);
                }
                if (c13757h != null) {
                    f7569r = c13757h;
                    return c13757h;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Context m9243b() {
        return this.f7571a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public IBinder m9244d(@NonNull String str) throws C1906a {
        try {
            return (IBinder) this.f7571a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new C1906a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
