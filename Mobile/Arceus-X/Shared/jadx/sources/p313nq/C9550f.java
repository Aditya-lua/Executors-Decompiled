package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9550f implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f34526a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ProgressBar f34527b;

    public C9550f(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.f34526a = view;
        this.f34527b = progressBar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9550f m37686a(@NonNull View view) {
        int i10 = C7282t.f28084v;
        ProgressBar progressBar = (ProgressBar) C10785b.m41116a(view, i10);
        if (progressBar != null) {
            return new C9550f(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C9550f m37687b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C7283u.f28094f, viewGroup);
        return m37686a(viewGroup);
    }

    @Override // p402r5.InterfaceC10784a
    @NonNull
    public View getRoot() {
        return this.f34526a;
    }
}
