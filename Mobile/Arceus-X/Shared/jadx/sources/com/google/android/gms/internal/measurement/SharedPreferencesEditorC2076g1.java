package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import ie.AbstractC6807y0;
import ie.C6797t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC2076g1 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public boolean f8195a;

    /* JADX INFO: renamed from: b */
    public final Set f8196b;

    /* JADX INFO: renamed from: c */
    public final Map f8197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SharedPreferencesC2095h1 f8198d;

    public /* synthetic */ SharedPreferencesEditorC2076g1(SharedPreferencesC2095h1 sharedPreferencesC2095h1, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC2095h1);
        this.f8198d = sharedPreferencesC2095h1;
        this.f8195a = false;
        this.f8196b = new HashSet();
        this.f8197c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m10017a(String str, Object obj) {
        if (obj != null) {
            this.f8197c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f8195a = true;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f8195a) {
            this.f8198d.m10156a().clear();
        }
        SharedPreferencesC2095h1 sharedPreferencesC2095h1 = this.f8198d;
        Set set = this.f8196b;
        sharedPreferencesC2095h1.m10156a().keySet().removeAll(set);
        Map map = this.f8197c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC2095h1.m10156a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC2095h1.m10157b()) {
            AbstractC6807y0 it = C6797t0.m29112d(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC2095h1, (String) it.next());
            }
        }
        return (!this.f8195a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        m10017a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        m10017a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        m10017a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        m10017a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        m10017a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        m10017a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f8196b.add(str);
        return this;
    }
}
