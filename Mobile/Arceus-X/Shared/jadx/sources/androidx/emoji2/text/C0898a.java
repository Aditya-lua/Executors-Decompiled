package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p482v2.C12002e;
import p533x2.C12637g;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0898a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final b f3169a;

        public a(b bVar) {
            this.f3169a = bVar == null ? m4255e() : bVar;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public static b m4255e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* JADX INFO: renamed from: a */
        public final C0900c.c m4256a(@NonNull Context context, C12002e c12002e) {
            if (c12002e == null) {
                return null;
            }
            return new C0902e(context, c12002e);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public final List<List<byte[]>> m4257b(@NonNull Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* JADX INFO: renamed from: c */
        public C0900c.c m4258c(@NonNull Context context) {
            return m4256a(context, m4262h(context));
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public final C12002e m4259d(@NonNull ProviderInfo providerInfo, @NonNull PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C12002e(str, str2, "emojicompat-emoji-font", m4257b(this.f3169a.mo4264b(packageManager, str2)));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m4260f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        public final ProviderInfo m4261g(@NonNull PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f3169a.mo4265c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo4263a = this.f3169a.mo4263a(it.next());
                if (m4260f(providerInfoMo4263a)) {
                    return providerInfoMo4263a;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C12002e m4262h(@NonNull Context context) {
            PackageManager packageManager = context.getPackageManager();
            C12637g.m47076h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM4261g = m4261g(packageManager);
            if (providerInfoM4261g == null) {
                return null;
            }
            try {
                return m4259d(providerInfoM4261g, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo4263a(@NonNull ResolveInfo resolveInfo) {
            throw null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public Signature[] mo4264b(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public List<ResolveInfo> mo4265c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$c */
    public static class c extends b {
        @Override // androidx.emoji2.text.C0898a.b
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo4263a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C0898a.b
        @NonNull
        /* JADX INFO: renamed from: c */
        public List<ResolveInfo> mo4265c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$d */
    public static class d extends c {
        @Override // androidx.emoji2.text.C0898a.b
        @NonNull
        /* JADX INFO: renamed from: b */
        public Signature[] mo4264b(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0902e m4254a(@NonNull Context context) {
        return (C0902e) new a(null).m4258c(context);
    }
}
