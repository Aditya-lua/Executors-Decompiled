package nh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import bh.s0;
import com.github.luben.zstd.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import ok.n;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, Pair<String, Float>> f25595a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Hashtable<String, Typeface> f25596a = new Hashtable<>();

        public static Typeface a(String str, Context context) {
            Typeface typeface = f25596a.get(str);
            if (typeface != null) {
                return typeface;
            }
            if (bi.h.a().h1()) {
                ok.d.a(str);
            }
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f25596a.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<Integer, Pair<String, Float>> a(Context context) {
        try {
            HashMap map = new HashMap();
            if (bi.h.a().h1()) {
                ok.d.a("android/fonts/font-mappings.json");
            }
            tg.a aVarP = n.b().p(new BufferedReader(new InputStreamReader(context.getAssets().open("android/fonts/font-mappings.json"))));
            aVarP.b();
            while (aVarP.p()) {
                String strN = BuildConfig.FLAVOR;
                aVarP.c();
                int iZ = -1;
                float fY = 0.793f;
                while (aVarP.p()) {
                    String strE = aVarP.E();
                    if (strE.equals("enum")) {
                        iZ = aVarP.z();
                    } else if (strE.equals("font")) {
                        strN = aVarP.N();
                    } else if (strE.equals("fromRbxFontRatio")) {
                        fY = (float) aVarP.y();
                    } else {
                        aVarP.n0();
                    }
                }
                map.put(Integer.valueOf(iZ), Pair.create(strN, Float.valueOf(fY)));
                aVarP.h();
            }
            aVarP.g();
            return map;
        } catch (IOException e10) {
            q.f("rbx.glview.text", "Unable to parse mapping json", e10);
            return new HashMap();
        }
    }

    public static float b(int i10, Context context) {
        if (f25595a == null) {
            f25595a = a(context);
        }
        if (f25595a.containsKey(Integer.valueOf(i10))) {
            return ((Float) f25595a.get(Integer.valueOf(i10)).second).floatValue();
        }
        return 0.793f;
    }

    public static void c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.f4360y0);
        String string = typedArrayObtainStyledAttributes.getString(s0.f4362z0);
        if (string == null) {
            string = "SourceSansPro-Light.ttf";
        }
        d(textView, context, string);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void d(TextView textView, Context context, String str) {
        if (str != null) {
            Typeface typefaceA = a.a("fonts/" + str, context);
            if (typefaceA != null) {
                textView.setTypeface(typefaceA);
            }
        }
    }

    public static boolean e(TextView textView, Context context, int i10) {
        if (f25595a == null) {
            f25595a = a(context);
        }
        if (f25595a.containsKey(Integer.valueOf(i10))) {
            return f(textView, (String) f25595a.get(Integer.valueOf(i10)).first, context);
        }
        return false;
    }

    public static boolean f(TextView textView, String str, Context context) {
        if (str == null || !uk.c.p().j()) {
            return false;
        }
        Typeface typefaceA = a.a("content/fonts/" + str, context);
        if (typefaceA != null) {
            textView.setTypeface(typefaceA);
            return true;
        }
        q.e("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        return false;
    }
}
