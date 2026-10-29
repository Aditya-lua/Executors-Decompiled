package p103eh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import mk.C8569c;
import p151gk.C6109d;
import p151gk.C6121n;
import p151gk.C6124q;
import sg.C11353s0;
import th.C11659h;

/* JADX INFO: renamed from: eh.e */
/* JADX INFO: loaded from: classes2.dex */
public class C5117e {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, Pair<String, Float>> f19948a;

    /* JADX INFO: renamed from: eh.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static Hashtable<String, Typeface> f19949a = new Hashtable<>();

        /* JADX INFO: renamed from: a */
        public static Typeface m23883a(String str, Context context) {
            Typeface typeface = f19949a.get(str);
            if (typeface != null) {
                return typeface;
            }
            if (C11659h.m43403a().mo43618e1()) {
                C6109d.m27018a(str);
            }
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f19949a.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<Integer, Pair<String, Float>> m23877a(Context context) {
        try {
            HashMap map = new HashMap();
            if (C11659h.m43403a().mo43618e1()) {
                C6109d.m27018a("android/fonts/font-mappings.json");
            }
            JsonReader jsonReaderM31417r = C6121n.m27045b().m31417r(new BufferedReader(new InputStreamReader(context.getAssets().open("android/fonts/font-mappings.json"))));
            jsonReaderM31417r.beginArray();
            while (jsonReaderM31417r.hasNext()) {
                String strNextString = "";
                jsonReaderM31417r.beginObject();
                int iNextInt = -1;
                float fNextDouble = 0.793f;
                while (jsonReaderM31417r.hasNext()) {
                    String strNextName = jsonReaderM31417r.nextName();
                    if (strNextName.equals("enum")) {
                        iNextInt = jsonReaderM31417r.nextInt();
                    } else if (strNextName.equals("font")) {
                        strNextString = jsonReaderM31417r.nextString();
                    } else if (strNextName.equals("fromRbxFontRatio")) {
                        fNextDouble = (float) jsonReaderM31417r.nextDouble();
                    } else {
                        jsonReaderM31417r.skipValue();
                    }
                }
                map.put(Integer.valueOf(iNextInt), Pair.create(strNextString, Float.valueOf(fNextDouble)));
                jsonReaderM31417r.endObject();
            }
            jsonReaderM31417r.endArray();
            return map;
        } catch (IOException e10) {
            C6124q.m27061f("rbx.glview.text", "Unable to parse mapping json", e10);
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m23878b(int i10, Context context) {
        if (f19948a == null) {
            f19948a = m23877a(context);
        }
        if (f19948a.containsKey(Integer.valueOf(i10))) {
            return ((Float) f19948a.get(Integer.valueOf(i10)).second).floatValue();
        }
        return 0.793f;
    }

    /* JADX INFO: renamed from: c */
    public static void m23879c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11353s0.f40153z0);
        String string = typedArrayObtainStyledAttributes.getString(C11353s0.f40042A0);
        if (string == null) {
            string = "SourceSansPro-Light.ttf";
        }
        m23880d(textView, context, string);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static void m23880d(TextView textView, Context context, String str) {
        if (str != null) {
            Typeface typefaceM23883a = a.m23883a("fonts/" + str, context);
            if (typefaceM23883a != null) {
                textView.setTypeface(typefaceM23883a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m23881e(TextView textView, Context context, int i10) {
        if (f19948a == null) {
            f19948a = m23877a(context);
        }
        if (f19948a.containsKey(Integer.valueOf(i10))) {
            return m23882f(textView, (String) f19948a.get(Integer.valueOf(i10)).first, context);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m23882f(TextView textView, String str, Context context) {
        if (str == null || !C8569c.m34512p().m34514j()) {
            return false;
        }
        Typeface typefaceM23883a = a.m23883a("content/fonts/" + str, context);
        if (typefaceM23883a != null) {
            textView.setTypeface(typefaceM23883a);
            return true;
        }
        C6124q.m27060e("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        return false;
    }
}
