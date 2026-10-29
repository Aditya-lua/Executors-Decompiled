package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.ClickableConstraintLayout;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9530f implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ClickableConstraintLayout f34378a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f34379b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f34380c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f34381d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f34382e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ClickableConstraintLayout f34383f;

    public C9530f(@NonNull ClickableConstraintLayout clickableConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ClickableConstraintLayout clickableConstraintLayout2) {
        this.f34378a = clickableConstraintLayout;
        this.f34379b = imageView;
        this.f34380c = imageView2;
        this.f34381d = constraintLayout;
        this.f34382e = textView;
        this.f34383f = clickableConstraintLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9530f m37626a(@NonNull View view) {
        int i10 = C6895n2.f27087q;
        ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
        if (imageView != null) {
            i10 = C6895n2.f27039N;
            ImageView imageView2 = (ImageView) C10785b.m41116a(view, i10);
            if (imageView2 != null) {
                i10 = C6895n2.f27041O;
                ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout != null) {
                    i10 = C6895n2.f27056a0;
                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                    if (textView != null) {
                        ClickableConstraintLayout clickableConstraintLayout = (ClickableConstraintLayout) view;
                        return new C9530f(clickableConstraintLayout, imageView, imageView2, constraintLayout, textView, clickableConstraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9530f m37627c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27114f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37626a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClickableConstraintLayout getRoot() {
        return this.f34378a;
    }
}
