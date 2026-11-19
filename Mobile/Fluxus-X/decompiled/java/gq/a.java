package gq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import fq.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f17891a;

    public a(@NonNull View view) {
        this.f17891a = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view != null) {
            return new a(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(a2.f16378a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    public View getRoot() {
        return this.f17891a;
    }
}
