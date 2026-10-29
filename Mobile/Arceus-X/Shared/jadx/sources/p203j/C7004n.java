package p203j;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.view.C0625o0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p181i.C6598j;
import p316o.C9611d;
import p365q.C10359b0;
import p365q.C10364d;
import p365q.C10365d0;
import p365q.C10370f;
import p365q.C10373g;
import p365q.C10376h;
import p365q.C10385l;
import p365q.C10395q;
import p365q.C10397r;
import p365q.C10403u;
import p365q.C10405v;
import p365q.C10409x;
import p365q.C10410x0;
import p504w1.C12286j;

/* JADX INFO: renamed from: j.n */
/* JADX INFO: loaded from: classes.dex */
public class C7004n {

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f27391b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f27392c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f27393d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f27394e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f27395f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f27396g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C12286j<String, Constructor<? extends View>> f27397h = new C12286j<>();

    /* JADX INFO: renamed from: a */
    public final Object[] f27398a = new Object[2];

    /* JADX INFO: renamed from: j.n$a */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final View f27399a;

        /* JADX INFO: renamed from: b */
        public final String f27400b;

        /* JADX INFO: renamed from: c */
        public Method f27401c;

        /* JADX INFO: renamed from: d */
        public Context f27402d;

        public a(@NonNull View view, @NonNull String str) {
            this.f27399a = view;
            this.f27400b = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m29623a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f27400b, View.class)) != null) {
                        this.f27401c = method;
                        this.f27402d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f27399a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f27399a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f27400b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f27399a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.f27401c == null) {
                m29623a(this.f27399a.getContext());
            }
            try {
                this.f27401c.invoke(this.f27402d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static Context m29606u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25251J3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(C6598j.f25256K3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25261L3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C9611d) && ((C9611d) context).m37924c() == resourceId)) ? context : new C9611d(context, resourceId);
    }

    /* JADX INFO: renamed from: a */
    public final void m29607a(@NonNull Context context, @NonNull View view, @NonNull AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27393d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            C0625o0.m3042n0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f27394e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            C0625o0.m3046p0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f27395f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            C0625o0.m2983C0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m29608b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27392c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C10364d mo13261c(Context context, AttributeSet attributeSet) {
        return new C10364d(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C10370f mo13262d(Context context, AttributeSet attributeSet) {
        return new C10370f(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C10373g mo13263e(Context context, AttributeSet attributeSet) {
        return new C10373g(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C10376h m29609f(Context context, AttributeSet attributeSet) {
        return new C10376h(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public C10385l m29610g(Context context, AttributeSet attributeSet) {
        return new C10385l(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public AppCompatImageButton m29611h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C10395q m29612i(Context context, AttributeSet attributeSet) {
        return new C10395q(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public C10397r m29613j(Context context, AttributeSet attributeSet) {
        return new C10397r(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public C10403u mo13264k(Context context, AttributeSet attributeSet) {
        return new C10403u(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public C10405v m29614l(Context context, AttributeSet attributeSet) {
        return new C10405v(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public C10409x m29615m(Context context, AttributeSet attributeSet) {
        return new C10409x(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public AppCompatSpinner m29616n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public C10359b0 mo13265o(Context context, AttributeSet attributeSet) {
        return new C10359b0(context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public C10365d0 m29617p(Context context, AttributeSet attributeSet) {
        return new C10365d0(context, attributeSet);
    }

    /* JADX INFO: renamed from: q */
    public View m29618q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final View m29619r(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewM29614l;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = m29606u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = C10410x0.m40068b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewM29614l = m29614l(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "CheckedTextView":
                viewM29614l = m29609f(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM29614l = m29613j(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "TextView":
                viewM29614l = mo13265o(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "ImageButton":
                viewM29614l = m29611h(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "SeekBar":
                viewM29614l = m29615m(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "Spinner":
                viewM29614l = m29616n(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "RadioButton":
                viewM29614l = mo13264k(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "ToggleButton":
                viewM29614l = m29617p(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "ImageView":
                viewM29614l = m29612i(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "AutoCompleteTextView":
                viewM29614l = mo13261c(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "CheckBox":
                viewM29614l = mo13263e(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "EditText":
                viewM29614l = m29610g(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            case "Button":
                viewM29614l = mo13262d(context2, attributeSet);
                m29622v(viewM29614l, str);
                break;
            default:
                viewM29614l = m29618q(context2, str, attributeSet);
                break;
        }
        if (viewM29614l == null && context != context2) {
            viewM29614l = m29621t(context2, str, attributeSet);
        }
        if (viewM29614l != null) {
            m29608b(viewM29614l, attributeSet);
            m29607a(context2, viewM29614l, attributeSet);
        }
        return viewM29614l;
    }

    /* JADX INFO: renamed from: s */
    public final View m29620s(Context context, String str, String str2) {
        String str3;
        C12286j<String, Constructor<? extends View>> c12286j = f27397h;
        Constructor<? extends View> constructor = c12286j.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f27391b);
            c12286j.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f27398a);
    }

    /* JADX INFO: renamed from: t */
    public final View m29621t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f27398a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m29620s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f27396g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewM29620s = m29620s(context, str, strArr[i10]);
                if (viewM29620s != null) {
                    return viewM29620s;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f27398a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m29622v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
