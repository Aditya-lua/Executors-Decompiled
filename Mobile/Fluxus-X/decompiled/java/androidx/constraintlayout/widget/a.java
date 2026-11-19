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

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1378a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0030a f1379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1384h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public enum EnumC0030a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0030a enumC0030a, Object obj, boolean z10) {
        this.b = str;
        this.f1379c = enumC0030a;
        this.f1378a = z10;
        f(obj);
    }

    public static HashMap<String, a> a(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
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

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        EnumC0030a enumC0030a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g2.d.F4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0030a enumC0030a2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == g2.d.G4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == g2.d.Q4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == g2.d.H4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0030a2 = EnumC0030a.BOOLEAN_TYPE;
            } else {
                if (index == g2.d.J4) {
                    enumC0030a = EnumC0030a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == g2.d.I4) {
                    enumC0030a = EnumC0030a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == g2.d.N4) {
                    enumC0030a = EnumC0030a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == g2.d.K4) {
                    enumC0030a = EnumC0030a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g2.d.L4) {
                    enumC0030a = EnumC0030a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == g2.d.M4) {
                    enumC0030a = EnumC0030a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == g2.d.P4) {
                    enumC0030a = EnumC0030a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == g2.d.O4) {
                    enumC0030a = EnumC0030a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0030a2 = enumC0030a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0030a2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = aVar.f1378a ? str : "set" + str;
            try {
                int iOrdinal = aVar.f1379c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f1380d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f1381e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f1384h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1384h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f1382f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1383g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f1381e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f1380d));
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

    public String b() {
        return this.b;
    }

    public EnumC0030a c() {
        return this.f1379c;
    }

    public void f(Object obj) {
        switch (this.f1379c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f1380d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f1381e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f1384h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f1382f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f1383g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f1381e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f1378a = false;
        this.b = aVar.b;
        this.f1379c = aVar.f1379c;
        f(obj);
    }
}
