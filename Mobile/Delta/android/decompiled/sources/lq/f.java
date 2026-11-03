package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import hq.t;
import hq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f23946a;

    @NonNull
    public final ProgressBar b;

    public f(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.f23946a = view;
        this.b = progressBar;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = t.f19682v;
        ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
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
        layoutInflater.inflate(u.f19691f, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f23946a;
    }
}
