package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p171hg.C6398c;
import p171hg.C6400e;
import p171hg.C6403h;
import p292mf.C8492c;
import wf.C12407f;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m14378a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m14382e(installerPackageName) : "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m14379b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m14380c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m14381d(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: renamed from: e */
    public static String m14382e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8492c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6398c.m27978c());
        arrayList.add(C12407f.m46486g());
        arrayList.add(C6403h.m27986b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6403h.m27986b("fire-core", "22.0.1"));
        arrayList.add(C6403h.m27986b("device-name", m14382e(Build.PRODUCT)));
        arrayList.add(C6403h.m27986b("device-model", m14382e(Build.DEVICE)));
        arrayList.add(C6403h.m27986b("device-brand", m14382e(Build.BRAND)));
        arrayList.add(C6403h.m27987c("android-target-sdk", new C6403h.a() { // from class: ff.f
            @Override // p171hg.C6403h.a
            /* JADX INFO: renamed from: a */
            public final String mo25282a(Object obj) {
                return FirebaseCommonRegistrar.m14380c((Context) obj);
            }
        }));
        arrayList.add(C6403h.m27987c("android-min-sdk", new C6403h.a() { // from class: ff.g
            @Override // p171hg.C6403h.a
            /* JADX INFO: renamed from: a */
            public final String mo25282a(Object obj) {
                return FirebaseCommonRegistrar.m14379b((Context) obj);
            }
        }));
        arrayList.add(C6403h.m27987c("android-platform", new C6403h.a() { // from class: ff.h
            @Override // p171hg.C6403h.a
            /* JADX INFO: renamed from: a */
            public final String mo25282a(Object obj) {
                return FirebaseCommonRegistrar.m14381d((Context) obj);
            }
        }));
        arrayList.add(C6403h.m27987c("android-installer", new C6403h.a() { // from class: ff.i
            @Override // p171hg.C6403h.a
            /* JADX INFO: renamed from: a */
            public final String mo25282a(Object obj) {
                return FirebaseCommonRegistrar.m14378a((Context) obj);
            }
        }));
        String strM27983a = C6400e.m27983a();
        if (strM27983a != null) {
            arrayList.add(C6403h.m27986b("kotlin", strM27983a));
        }
        return arrayList;
    }
}
