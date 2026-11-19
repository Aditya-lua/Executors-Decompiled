package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8259a;

    public b(int i10) {
        this.f8259a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f8259a) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
