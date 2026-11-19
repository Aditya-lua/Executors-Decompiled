package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import xq.t;
import xq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f4579a;

    @NonNull
    public final ProgressBar b;

    public f(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.f4579a = view;
        this.b = progressBar;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = t.f37041v;
        ProgressBar progressBar = (ProgressBar) s5.b.a(view, i10);
        if (progressBar != null) {
            return new f(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(u.f37050f, viewGroup);
        return a(viewGroup);
    }

    @Override // s5.a
    @NonNull
    public View getRoot() {
        return this.f4579a;
    }
}
