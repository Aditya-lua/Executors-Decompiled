package p066d3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p505w2.C12293e;
import p533x2.C12637g;

/* JADX INFO: renamed from: d3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4431i {

    /* JADX INFO: renamed from: d3.i$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m22316a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* JADX INFO: renamed from: b */
        public static int m22317b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* JADX INFO: renamed from: c */
        public static void m22318c(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        /* JADX INFO: renamed from: d */
        public static void m22319d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* JADX INFO: renamed from: e */
        public static void m22320e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* JADX INFO: renamed from: f */
        public static void m22321f(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: renamed from: d3.i$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static DecimalFormatSymbols m22322a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: d3.i$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m22323a(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        /* JADX INFO: renamed from: b */
        public static int m22324b(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: c */
        public static int m22325c(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        /* JADX INFO: renamed from: d */
        public static void m22326d(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: d3.i$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static CharSequence m22327a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        /* JADX INFO: renamed from: b */
        public static String[] m22328b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* JADX INFO: renamed from: c */
        public static PrecomputedText.Params m22329c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* JADX INFO: renamed from: d */
        public static void m22330d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: renamed from: d3.i$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static void m22331a(TextView textView, int i10, float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    /* JADX INFO: renamed from: d3.i$f */
    public static class f implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f18425a;

        /* JADX INFO: renamed from: b */
        public final TextView f18426b;

        /* JADX INFO: renamed from: c */
        public Class<?> f18427c;

        /* JADX INFO: renamed from: d */
        public Method f18428d;

        /* JADX INFO: renamed from: e */
        public boolean f18429e;

        /* JADX INFO: renamed from: f */
        public boolean f18430f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f18425a = callback;
            this.f18426b = textView;
        }

        /* JADX INFO: renamed from: a */
        public final Intent m22332a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* JADX INFO: renamed from: b */
        public final Intent m22333b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m22332a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m22336e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: c */
        public final List<ResolveInfo> m22334c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m22332a(), 0)) {
                    if (m22337f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public ActionMode.Callback m22335d() {
            return this.f18425a;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m22336e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: f */
        public final boolean m22337f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: g */
        public final void m22338g(Menu menu) {
            Context context = this.f18426b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = this.f18430f;
            Class cls = Integer.TYPE;
            if (!z10) {
                this.f18430f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f18427c = cls2;
                    this.f18428d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f18429e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f18427c = null;
                    this.f18428d = null;
                    this.f18429e = false;
                }
            }
            try {
                Method declaredMethod = (this.f18429e && this.f18427c.isInstance(menu)) ? this.f18428d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listM22334c = m22334c(context, packageManager);
                for (int i10 = 0; i10 < listM22334c.size(); i10++) {
                    ResolveInfo resolveInfo = listM22334c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m22333b(resolveInfo, this.f18426b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f18425a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f18425a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f18425a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m22338g(menu);
            return this.f18425a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static int m22294a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.m22323a(textView);
        }
        if (textView instanceof InterfaceC4424b) {
            return ((InterfaceC4424b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static int m22295b(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.m22324b(textView);
        }
        if (textView instanceof InterfaceC4424b) {
            return ((InterfaceC4424b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static int m22296c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.m22325c(textView);
        }
        if (textView instanceof InterfaceC4424b) {
            return ((InterfaceC4424b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static Drawable[] m22297d(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: e */
    public static int m22298e(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: f */
    public static int m22299f(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: g */
    public static int m22300g(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* JADX INFO: renamed from: h */
    public static TextDirectionHeuristic m22301h(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.m22328b(b.m22322a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C12293e.a m22302i(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C12293e.a(d.m22329c(textView));
        }
        C12293e.a.C14276a c14276a = new C12293e.a.C14276a(new TextPaint(textView.getPaint()));
        c14276a.m45677b(a.m22316a(textView));
        c14276a.m45678c(a.m22317b(textView));
        c14276a.m45679d(m22301h(textView));
        return c14276a.m45676a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static void m22303j(TextView textView, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 27) {
            c.m22326d(textView, i10, i11, i12, i13);
        } else if (textView instanceof InterfaceC4424b) {
            ((InterfaceC4424b) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m22304k(TextView textView, ColorStateList colorStateList) {
        C12637g.m47075g(textView);
        a.m22319d(textView, colorStateList);
    }

    /* JADX INFO: renamed from: l */
    public static void m22305l(TextView textView, PorterDuff.Mode mode) {
        C12637g.m47075g(textView);
        a.m22320e(textView, mode);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static void m22306m(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: n */
    public static void m22307n(TextView textView, int i10) {
        C12637g.m47072d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            d.m22330d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m22308o(TextView textView, int i10) {
        C12637g.m47072d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m22309p(TextView textView, int i10) {
        C12637g.m47072d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m22310q(TextView textView, int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.m22331a(textView, i10, f10);
        } else {
            m22309p(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m22311r(TextView textView, C12293e c12293e) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(d.m22327a(c12293e.m45670b()));
        } else {
            if (!m22302i(textView).m45671a(c12293e.m45669a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(c12293e);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m22312s(TextView textView, int i10) {
        textView.setTextAppearance(i10);
    }

    /* JADX INFO: renamed from: t */
    public static void m22313t(TextView textView, C12293e.a aVar) {
        textView.setTextDirection(m22300g(aVar.m45674d()));
        textView.getPaint().set(aVar.m45675e());
        a.m22318c(textView, aVar.m45672b());
        a.m22321f(textView, aVar.m45673c());
    }

    /* JADX INFO: renamed from: u */
    public static ActionMode.Callback m22314u(ActionMode.Callback callback) {
        return callback instanceof f ? ((f) callback).m22335d() : callback;
    }

    /* JADX INFO: renamed from: v */
    public static ActionMode.Callback m22315v(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
