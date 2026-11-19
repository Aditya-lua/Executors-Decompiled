package g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17038a;
    public androidx.constraintlayout.widget.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17039c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17040d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<C0317a> f17041e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f17042f = new SparseArray<>();

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    public static class C0317a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17043a;
        public ArrayList<b> b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f17045d;

        public C0317a(Context context, XmlPullParser xmlPullParser) {
            this.f17044c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.Q6) {
                    this.f17043a = typedArrayObtainStyledAttributes.getResourceId(index, this.f17043a);
                } else if (index == d.R6) {
                    this.f17044c = typedArrayObtainStyledAttributes.getResourceId(index, this.f17044c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17044c);
                    context.getResources().getResourceName(this.f17044c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f17045d = cVar;
                        cVar.e(context, this.f17044c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                if (this.b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f17046a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f17048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f17050f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f17046a = Float.NaN;
            this.b = Float.NaN;
            this.f17047c = Float.NaN;
            this.f17048d = Float.NaN;
            this.f17049e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f17130i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f17139j7) {
                    this.f17049e = typedArrayObtainStyledAttributes.getResourceId(index, this.f17049e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17049e);
                    context.getResources().getResourceName(this.f17049e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f17050f = cVar;
                        cVar.e(context, this.f17049e);
                    }
                } else if (index == d.f17148k7) {
                    this.f17048d = typedArrayObtainStyledAttributes.getDimension(index, this.f17048d);
                } else if (index == d.f17157l7) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == d.f17166m7) {
                    this.f17047c = typedArrayObtainStyledAttributes.getDimension(index, this.f17047c);
                } else if (index == d.f17175n7) {
                    this.f17046a = typedArrayObtainStyledAttributes.getDimension(index, this.f17046a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f17046a) && f10 < this.f17046a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f11 < this.b) {
                return false;
            }
            if (Float.isNaN(this.f17047c) || f10 <= this.f17047c) {
                return Float.isNaN(this.f17048d) || f11 <= this.f17048d;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f17038a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            C0317a c0317a = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0317a c0317a2 = new C0317a(context, xml);
                                this.f17041e.put(c0317a2.f17043a, c0317a2);
                                c0317a = c0317a2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (c0317a != null) {
                                    c0317a.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.u(context, xmlPullParser);
                this.f17042f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(g2.b bVar) {
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f17039c;
        if (i11 == i10) {
            C0317a c0317aValueAt = i10 == -1 ? this.f17041e.valueAt(0) : this.f17041e.get(i11);
            int i12 = this.f17040d;
            if ((i12 == -1 || !c0317aValueAt.b.get(i12).a(f10, f11)) && this.f17040d != (iB = c0317aValueAt.b(f10, f11))) {
                androidx.constraintlayout.widget.c cVar = iB == -1 ? this.b : c0317aValueAt.b.get(iB).f17050f;
                if (iB != -1) {
                    int i13 = c0317aValueAt.b.get(iB).f17049e;
                }
                if (cVar == null) {
                    return;
                }
                this.f17040d = iB;
                cVar.c(this.f17038a);
                return;
            }
            return;
        }
        this.f17039c = i10;
        C0317a c0317a = this.f17041e.get(i10);
        int iB2 = c0317a.b(f10, f11);
        androidx.constraintlayout.widget.c cVar2 = iB2 == -1 ? c0317a.f17045d : c0317a.b.get(iB2).f17050f;
        if (iB2 != -1) {
            int i14 = c0317a.b.get(iB2).f17049e;
        }
        if (cVar2 != null) {
            this.f17040d = iB2;
            cVar2.c(this.f17038a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
