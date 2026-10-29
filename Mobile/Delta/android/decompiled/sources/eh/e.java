package eh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.google.gson.stream.JsonReader;
import gk.m;
import gk.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import sg.s0;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, Pair<String, Float>> f15525a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Hashtable<String, Typeface> f15526a = new Hashtable<>();

        public static Typeface a(String str, Context context) {
            Typeface typeface = f15526a.get(str);
            if (typeface != null) {
                return typeface;
            }
            if (th.h.a().Z0()) {
                gk.d.a(str);
            }
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f15526a.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<Integer, Pair<String, Float>> a(Context context) {
        try {
            HashMap map = new HashMap();
            if (th.h.a().Z0()) {
                gk.d.a("android/fonts/font-mappings.json");
            }
            JsonReader jsonReaderR = m.b().r(new BufferedReader(new InputStreamReader(context.getAssets().open("android/fonts/font-mappings.json"))));
            jsonReaderR.beginArray();
            while (jsonReaderR.hasNext()) {
                String strNextString = "";
                jsonReaderR.beginObject();
                int iNextInt = -1;
                float fNextDouble = 0.793f;
                while (jsonReaderR.hasNext()) {
                    String strNextName = jsonReaderR.nextName();
                    if (strNextName.equals("enum")) {
                        iNextInt = jsonReaderR.nextInt();
                    } else if (strNextName.equals("font")) {
                        strNextString = jsonReaderR.nextString();
                    } else if (strNextName.equals("fromRbxFontRatio")) {
                        fNextDouble = (float) jsonReaderR.nextDouble();
                    } else {
                        jsonReaderR.skipValue();
                    }
                }
                map.put(Integer.valueOf(iNextInt), Pair.create(strNextString, Float.valueOf(fNextDouble)));
                jsonReaderR.endObject();
            }
            jsonReaderR.endArray();
            return map;
        } catch (IOException e10) {
            p.f("rbx.glview.text", "Unable to parse mapping json", e10);
            return new HashMap();
        }
    }

    public static float b(int i10, Context context) {
        if (f15525a == null) {
            f15525a = a(context);
        }
        if (f15525a.containsKey(Integer.valueOf(i10))) {
            return ((Float) f15525a.get(Integer.valueOf(i10)).second).floatValue();
        }
        return 0.793f;
    }

    public static void c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.f31056z0);
        String string = typedArrayObtainStyledAttributes.getString(s0.A0);
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
        if (f15525a == null) {
            f15525a = a(context);
        }
        if (f15525a.containsKey(Integer.valueOf(i10))) {
            return f(textView, (String) f15525a.get(Integer.valueOf(i10)).first, context);
        }
        return false;
    }

    public static boolean f(TextView textView, String str, Context context) {
        if (str == null || !mk.c.p().j()) {
            return false;
        }
        Typeface typefaceA = a.a("content/fonts/" + str, context);
        if (typefaceA != null) {
            textView.setTypeface(typefaceA);
            return true;
        }
        p.e("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        return false;
    }
}
