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
    public final ConstraintLayout f18180a;
    public androidx.constraintlayout.widget.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18181c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18182d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<C0320a> f18183e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f18184f = new SparseArray<>();

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    public static class C0320a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18185a;
        public ArrayList<b> b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f18187d;

        public C0320a(Context context, XmlPullParser xmlPullParser) {
            this.f18186c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.Q6) {
                    this.f18185a = typedArrayObtainStyledAttributes.getResourceId(index, this.f18185a);
                } else if (index == d.R6) {
                    this.f18186c = typedArrayObtainStyledAttributes.getResourceId(index, this.f18186c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18186c);
                    context.getResources().getResourceName(this.f18186c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f18187d = cVar;
                        cVar.e(context, this.f18186c);
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
        public float f18188a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f18189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f18190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f18192f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f18188a = Float.NaN;
            this.b = Float.NaN;
            this.f18189c = Float.NaN;
            this.f18190d = Float.NaN;
            this.f18191e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f18272i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f18281j7) {
                    this.f18191e = typedArrayObtainStyledAttributes.getResourceId(index, this.f18191e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18191e);
                    context.getResources().getResourceName(this.f18191e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f18192f = cVar;
                        cVar.e(context, this.f18191e);
                    }
                } else if (index == d.f18290k7) {
                    this.f18190d = typedArrayObtainStyledAttributes.getDimension(index, this.f18190d);
                } else if (index == d.f18299l7) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == d.f18308m7) {
                    this.f18189c = typedArrayObtainStyledAttributes.getDimension(index, this.f18189c);
                } else if (index == d.f18317n7) {
                    this.f18188a = typedArrayObtainStyledAttributes.getDimension(index, this.f18188a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f18188a) && f10 < this.f18188a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f11 < this.b) {
                return false;
            }
            if (Float.isNaN(this.f18189c) || f10 <= this.f18189c) {
                return Float.isNaN(this.f18190d) || f11 <= this.f18190d;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f18180a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            C0320a c0320a = null;
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
                                C0320a c0320a2 = new C0320a(context, xml);
                                this.f18183e.put(c0320a2.f18185a, c0320a2);
                                c0320a = c0320a2;
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
                                if (c0320a != null) {
                                    c0320a.a(bVar);
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
                this.f18184f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(g2.b bVar) {
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f18181c;
        if (i11 == i10) {
            C0320a c0320aValueAt = i10 == -1 ? this.f18183e.valueAt(0) : this.f18183e.get(i11);
            int i12 = this.f18182d;
            if ((i12 == -1 || !c0320aValueAt.b.get(i12).a(f10, f11)) && this.f18182d != (iB = c0320aValueAt.b(f10, f11))) {
                androidx.constraintlayout.widget.c cVar = iB == -1 ? this.b : c0320aValueAt.b.get(iB).f18192f;
                if (iB != -1) {
                    int i13 = c0320aValueAt.b.get(iB).f18191e;
                }
                if (cVar == null) {
                    return;
                }
                this.f18182d = iB;
                cVar.c(this.f18180a);
                return;
            }
            return;
        }
        this.f18181c = i10;
        C0320a c0320a = this.f18183e.get(i10);
        int iB2 = c0320a.b(f10, f11);
        androidx.constraintlayout.widget.c cVar2 = iB2 == -1 ? c0320a.f18187d : c0320a.b.get(iB2).f18192f;
        if (iB2 != -1) {
            int i14 = c0320a.b.get(iB2).f18191e;
        }
        if (cVar2 != null) {
            this.f18182d = iB2;
            cVar2.c(this.f18180a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
