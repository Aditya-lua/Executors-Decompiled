package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC2095h1 implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final Map f8212a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Set f8213b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map m10156a() {
        return this.f8212a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set m10157b() {
        return this.f8213b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m10158c(String str, Object obj) {
        Object obj2 = this.f8212a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f8212a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC2076g1(this, null);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f8212a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((Boolean) m10158c(str, Boolean.valueOf(z10))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return ((Float) m10158c(str, Float.valueOf(f10))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return ((Integer) m10158c(str, Integer.valueOf(i10))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return ((Long) m10158c(str, Long.valueOf(j10))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) m10158c(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) m10158c(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8213b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8213b.remove(onSharedPreferenceChangeListener);
    }
}
