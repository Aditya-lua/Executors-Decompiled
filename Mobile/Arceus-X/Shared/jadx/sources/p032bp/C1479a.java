package p032bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p610zo.C13957e0;
import p610zo.C13959f0;

/* JADX INFO: renamed from: bp.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1479a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5746a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f5747b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PersonaMaterialButton f5748c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f5749d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f5750e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PersonaMaterialButton f5751f;

    public C1479a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f5746a = constraintLayout;
        this.f5747b = constraintLayout2;
        this.f5748c = personaMaterialButton;
        this.f5749d = textView;
        this.f5750e = textView2;
        this.f5751f = personaMaterialButton2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1479a m7589a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = C13957e0.f48739b;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
        if (personaMaterialButton != null) {
            i10 = C13957e0.f48744g;
            TextView textView = (TextView) C10785b.m41116a(view, i10);
            if (textView != null) {
                i10 = C13957e0.f48745h;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    i10 = C13957e0.f48749l;
                    PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                    if (personaMaterialButton2 != null) {
                        return new C1479a(constraintLayout, constraintLayout, personaMaterialButton, textView, textView2, personaMaterialButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C1479a m7590c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13959f0.f48764a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m7589a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5746a;
    }
}
