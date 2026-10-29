package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p226jq.C7283u;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9552h implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ImageView f34530a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f34531b;

    public C9552h(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f34530a = imageView;
        this.f34531b = imageView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9552h m37692a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new C9552h(imageView, imageView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9552h m37693c(@NonNull LayoutInflater layoutInflater) {
        return m37694d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C9552h m37694d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28096h, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37692a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f34530a;
    }
}
