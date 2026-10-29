package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9547c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f34506a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f34507b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f34508c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f34509d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f34510e;

    public C9547c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f34506a = view;
        this.f34507b = imageView;
        this.f34508c = imageView2;
        this.f34509d = imageView3;
        this.f34510e = textView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9547c m37678a(@NonNull View view) {
        int i10 = C7282t.f28075m;
        ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
        if (imageView != null) {
            i10 = C7282t.f28076n;
            ImageView imageView2 = (ImageView) C10785b.m41116a(view, i10);
            if (imageView2 != null) {
                i10 = C7282t.f28077o;
                ImageView imageView3 = (ImageView) C10785b.m41116a(view, i10);
                if (imageView3 != null) {
                    i10 = C7282t.f28078p;
                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                    if (textView != null) {
                        return new C9547c(view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C9547c m37679b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C7283u.f28091c, viewGroup);
        return m37678a(viewGroup);
    }

    @Override // p402r5.InterfaceC10784a
    @NonNull
    public View getRoot() {
        return this.f34506a;
    }
}
