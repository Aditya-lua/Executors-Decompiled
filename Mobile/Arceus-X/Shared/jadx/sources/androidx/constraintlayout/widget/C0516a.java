package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p142g2.C5969d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public class C0516a {

    /* JADX INFO: renamed from: a */
    public boolean f2041a;

    /* JADX INFO: renamed from: b */
    public String f2042b;

    /* JADX INFO: renamed from: c */
    public a f2043c;

    /* JADX INFO: renamed from: d */
    public int f2044d;

    /* JADX INFO: renamed from: e */
    public float f2045e;

    /* JADX INFO: renamed from: f */
    public String f2046f;

    /* JADX INFO: renamed from: g */
    public boolean f2047g;

    /* JADX INFO: renamed from: h */
    public int f2048h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0516a(String str, a aVar, Object obj, boolean z10) {
        this.f2042b = str;
        this.f2043c = aVar;
        this.f2041a = z10;
        m2476f(obj);
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, C0516a> m2471a(HashMap<String, C0516a> map, View view) {
        HashMap<String, C0516a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0516a c0516a = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C0516a(c0516a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C0516a(c0516a, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: d */
    public static void m2472d(Context context, XmlPullParser xmlPullParser, HashMap<String, C0516a> map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C5969d.f22831F4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == C5969d.f22839G4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == C5969d.f22919Q4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == C5969d.f22847H4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == C5969d.f22863J4) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C5969d.f22855I4) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C5969d.f22895N4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C5969d.f22871K4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C5969d.f22879L4) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C5969d.f22887M4) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == C5969d.f22911P4) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C5969d.f22903O4) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new C0516a(string, aVar2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public static void m2473e(View view, HashMap<String, C0516a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0516a c0516a = map.get(str);
            String str2 = c0516a.f2041a ? str : "set" + str;
            try {
                int iOrdinal = c0516a.f2043c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0516a.f2044d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c0516a.f2045e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0516a.f2048h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0516a.f2048h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0516a.f2046f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0516a.f2047g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(c0516a.f2045e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(c0516a.f2044d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2474b() {
        return this.f2042b;
    }

    /* JADX INFO: renamed from: c */
    public a m2475c() {
        return this.f2043c;
    }

    /* JADX INFO: renamed from: f */
    public void m2476f(Object obj) {
        switch (this.f2043c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f2044d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f2045e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f2048h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f2046f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f2047g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f2045e = ((Float) obj).floatValue();
                break;
        }
    }

    public C0516a(C0516a c0516a, Object obj) {
        this.f2041a = false;
        this.f2042b = c0516a.f2042b;
        this.f2043c = c0516a.f2043c;
        m2476f(obj);
    }
}
