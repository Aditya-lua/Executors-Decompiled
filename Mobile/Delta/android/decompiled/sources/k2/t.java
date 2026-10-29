package k2;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22140a;
    public final CharSequence b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f22141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f22144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f22145g;

    public static class a {
        public static RemoteInput a(t tVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(tVar.i()).setLabel(tVar.h()).setChoices(tVar.e()).setAllowFreeFormInput(tVar.c()).addExtras(tVar.g());
            Set<String> setD = tVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, tVar.f());
            }
            return builderAddExtras.build();
        }

        public static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static class b {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    public static class c {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22146a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f22148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f22149e;
        public final Set<String> b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f22147c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22150f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22151g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f22146a = str;
        }

        public t a() {
            return new t(this.f22146a, this.f22148d, this.f22149e, this.f22150f, this.f22151g, this.f22147c, this.b);
        }

        public d b(CharSequence charSequence) {
            this.f22148d = charSequence;
            return this;
        }
    }

    public t(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f22140a = str;
        this.b = charSequence;
        this.f22141c = charSequenceArr;
        this.f22142d = z10;
        this.f22143e = i10;
        this.f22144f = bundle;
        this.f22145g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(t tVar) {
        return a.a(tVar);
    }

    public static RemoteInput[] b(t[] tVarArr) {
        if (tVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            remoteInputArr[i10] = a(tVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f22142d;
    }

    public Set<String> d() {
        return this.f22145g;
    }

    public CharSequence[] e() {
        return this.f22141c;
    }

    public int f() {
        return this.f22143e;
    }

    public Bundle g() {
        return this.f22144f;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.f22140a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
