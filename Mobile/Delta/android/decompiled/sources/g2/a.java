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
    public final ConstraintLayout f17641a;
    public androidx.constraintlayout.widget.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17642c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17643d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<C0316a> f17644e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f17645f = new SparseArray<>();

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    public static class C0316a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17646a;
        public ArrayList<b> b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f17648d;

        public C0316a(Context context, XmlPullParser xmlPullParser) {
            this.f17647c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.Q6) {
                    this.f17646a = typedArrayObtainStyledAttributes.getResourceId(index, this.f17646a);
                } else if (index == d.R6) {
                    this.f17647c = typedArrayObtainStyledAttributes.getResourceId(index, this.f17647c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17647c);
                    context.getResources().getResourceName(this.f17647c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f17648d = cVar;
                        cVar.e(context, this.f17647c);
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
        public float f17649a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f17651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f17653f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f17649a = Float.NaN;
            this.b = Float.NaN;
            this.f17650c = Float.NaN;
            this.f17651d = Float.NaN;
            this.f17652e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f17733i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f17742j7) {
                    this.f17652e = typedArrayObtainStyledAttributes.getResourceId(index, this.f17652e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17652e);
                    context.getResources().getResourceName(this.f17652e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f17653f = cVar;
                        cVar.e(context, this.f17652e);
                    }
                } else if (index == d.f17751k7) {
                    this.f17651d = typedArrayObtainStyledAttributes.getDimension(index, this.f17651d);
                } else if (index == d.f17760l7) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == d.f17769m7) {
                    this.f17650c = typedArrayObtainStyledAttributes.getDimension(index, this.f17650c);
                } else if (index == d.f17778n7) {
                    this.f17649a = typedArrayObtainStyledAttributes.getDimension(index, this.f17649a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f17649a) && f10 < this.f17649a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f11 < this.b) {
                return false;
            }
            if (Float.isNaN(this.f17650c) || f10 <= this.f17650c) {
                return Float.isNaN(this.f17651d) || f11 <= this.f17651d;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f17641a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            C0316a c0316a = null;
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
                                C0316a c0316a2 = new C0316a(context, xml);
                                this.f17644e.put(c0316a2.f17646a, c0316a2);
                                c0316a = c0316a2;
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
                                if (c0316a != null) {
                                    c0316a.a(bVar);
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
                this.f17645f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(g2.b bVar) {
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f17642c;
        if (i11 == i10) {
            C0316a c0316aValueAt = i10 == -1 ? this.f17644e.valueAt(0) : this.f17644e.get(i11);
            int i12 = this.f17643d;
            if ((i12 == -1 || !c0316aValueAt.b.get(i12).a(f10, f11)) && this.f17643d != (iB = c0316aValueAt.b(f10, f11))) {
                androidx.constraintlayout.widget.c cVar = iB == -1 ? this.b : c0316aValueAt.b.get(iB).f17653f;
                if (iB != -1) {
                    int i13 = c0316aValueAt.b.get(iB).f17652e;
                }
                if (cVar == null) {
                    return;
                }
                this.f17643d = iB;
                cVar.c(this.f17641a);
                return;
            }
            return;
        }
        this.f17642c = i10;
        C0316a c0316a = this.f17644e.get(i10);
        int iB2 = c0316a.b(f10, f11);
        androidx.constraintlayout.widget.c cVar2 = iB2 == -1 ? c0316a.f17648d : c0316a.b.get(iB2).f17653f;
        if (iB2 != -1) {
            int i14 = c0316a.b.get(iB2).f17652e;
        }
        if (cVar2 != null) {
            this.f17643d = iB2;
            cVar2.c(this.f17641a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
