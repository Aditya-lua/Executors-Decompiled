package f4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f15294a;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f15295a;

        public a(r0 r0Var) {
            this.f15295a = r0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            q qVarK = this.f15295a.k();
            this.f15295a.m();
            c1.u((ViewGroup) qVarK.K.getParent(), c0.this.f15294a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public c0(k0 k0Var) {
        this.f15294a = k0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        r0 r0VarA;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15294a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e4.c.f13179a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(e4.c.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(e4.c.f13180c, -1);
        String string = typedArrayObtainStyledAttributes.getString(e4.c.f13181d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        q qVarM0 = resourceId != -1 ? this.f15294a.m0(resourceId) : null;
        if (qVarM0 == null && string != null) {
            qVarM0 = this.f15294a.n0(string);
        }
        if (qVarM0 == null && id2 != -1) {
            qVarM0 = this.f15294a.m0(id2);
        }
        if (qVarM0 == null) {
            qVarM0 = this.f15294a.y0().a(context.getClassLoader(), attributeValue);
            qVarM0.f15488p = true;
            qVarM0.f15498z = resourceId != 0 ? resourceId : id2;
            qVarM0.A = id2;
            qVarM0.B = string;
            qVarM0.f15489q = true;
            k0 k0Var = this.f15294a;
            qVarM0.f15494v = k0Var;
            qVarM0.f15495w = k0Var.A0();
            qVarM0.R0(this.f15294a.A0().getContext(), attributeSet, qVarM0.b);
            r0VarA = this.f15294a.l(qVarM0);
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Fragment " + qVarM0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (qVarM0.f15489q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            qVarM0.f15489q = true;
            k0 k0Var2 = this.f15294a;
            qVarM0.f15494v = k0Var2;
            qVarM0.f15495w = k0Var2.A0();
            qVarM0.R0(this.f15294a.A0().getContext(), attributeSet, qVarM0.b);
            r0VarA = this.f15294a.A(qVarM0);
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + qVarM0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        g4.c.g(qVarM0, viewGroup);
        qVarM0.J = viewGroup;
        r0VarA.m();
        r0VarA.j();
        View view2 = qVarM0.K;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (qVarM0.K.getTag() == null) {
            qVarM0.K.setTag(string);
        }
        qVarM0.K.addOnAttachStateChangeListener(new a(r0VarA));
        return qVarM0.K;
    }
}
