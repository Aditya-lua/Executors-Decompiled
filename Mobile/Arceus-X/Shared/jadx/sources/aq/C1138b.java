package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1138b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f4683a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f4684b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Pi2CircleMaskView f4685c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ThemeableLottieAnimationView f4686d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4687e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f4688f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f4689g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Pi2ProgressArcView f4690h;

    public C1138b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f4683a = view;
        this.f4684b = view2;
        this.f4685c = pi2CircleMaskView;
        this.f4686d = themeableLottieAnimationView;
        this.f4687e = imageView;
        this.f4688f = view3;
        this.f4689g = view4;
        this.f4690h = pi2ProgressArcView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1138b m6465a(@NonNull View view) {
        View viewM41116a;
        View viewM41116a2;
        int i10 = C13388r.f46912d;
        View viewM41116a3 = C10785b.m41116a(view, i10);
        if (viewM41116a3 != null) {
            i10 = C13388r.f46924l;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) C10785b.m41116a(view, i10);
            if (pi2CircleMaskView != null) {
                i10 = C13388r.f46932t;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
                if (themeableLottieAnimationView != null) {
                    i10 = C13388r.f46933u;
                    ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                    if (imageView != null && (viewM41116a = C10785b.m41116a(view, (i10 = C13388r.f46937y))) != null && (viewM41116a2 = C10785b.m41116a(view, (i10 = C13388r.f46880A))) != null) {
                        i10 = C13388r.f46892M;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) C10785b.m41116a(view, i10);
                        if (pi2ProgressArcView != null) {
                            return new C1138b(view, viewM41116a3, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewM41116a, viewM41116a2, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C1138b m6466b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C13394s.f46951b, viewGroup);
        return m6465a(viewGroup);
    }

    @Override // p402r5.InterfaceC10784a
    @NonNull
    public View getRoot() {
        return this.f4683a;
    }
}
