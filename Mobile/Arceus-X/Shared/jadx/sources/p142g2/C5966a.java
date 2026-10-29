package p142g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
public class C5966a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f22770a;

    /* JADX INFO: renamed from: b */
    public C0518c f22771b;

    /* JADX INFO: renamed from: c */
    public int f22772c = -1;

    /* JADX INFO: renamed from: d */
    public int f22773d = -1;

    /* JADX INFO: renamed from: e */
    public SparseArray<a> f22774e = new SparseArray<>();

    /* JADX INFO: renamed from: f */
    public SparseArray<C0518c> f22775f = new SparseArray<>();

    /* JADX INFO: renamed from: g2.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f22776a;

        /* JADX INFO: renamed from: b */
        public ArrayList<b> f22777b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public int f22778c;

        /* JADX INFO: renamed from: d */
        public C0518c f22779d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f22778c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C5969d.f22913P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f22921Q6) {
                    this.f22776a = typedArrayObtainStyledAttributes.getResourceId(index, this.f22776a);
                } else if (index == C5969d.f22929R6) {
                    this.f22778c = typedArrayObtainStyledAttributes.getResourceId(index, this.f22778c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f22778c);
                    context.getResources().getResourceName(this.f22778c);
                    if ("layout".equals(resourceTypeName)) {
                        C0518c c0518c = new C0518c();
                        this.f22779d = c0518c;
                        c0518c.m2508e(context, this.f22778c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public void m26772a(b bVar) {
            this.f22777b.add(bVar);
        }

        /* JADX INFO: renamed from: b */
        public int m26773b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f22777b.size(); i10++) {
                if (this.f22777b.get(i10).m26774a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: g2.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f22780a;

        /* JADX INFO: renamed from: b */
        public float f22781b;

        /* JADX INFO: renamed from: c */
        public float f22782c;

        /* JADX INFO: renamed from: d */
        public float f22783d;

        /* JADX INFO: renamed from: e */
        public int f22784e;

        /* JADX INFO: renamed from: f */
        public C0518c f22785f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f22780a = Float.NaN;
            this.f22781b = Float.NaN;
            this.f22782c = Float.NaN;
            this.f22783d = Float.NaN;
            this.f22784e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C5969d.f23074i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f23083j7) {
                    this.f22784e = typedArrayObtainStyledAttributes.getResourceId(index, this.f22784e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f22784e);
                    context.getResources().getResourceName(this.f22784e);
                    if ("layout".equals(resourceTypeName)) {
                        C0518c c0518c = new C0518c();
                        this.f22785f = c0518c;
                        c0518c.m2508e(context, this.f22784e);
                    }
                } else if (index == C5969d.f23092k7) {
                    this.f22783d = typedArrayObtainStyledAttributes.getDimension(index, this.f22783d);
                } else if (index == C5969d.f23101l7) {
                    this.f22781b = typedArrayObtainStyledAttributes.getDimension(index, this.f22781b);
                } else if (index == C5969d.f23110m7) {
                    this.f22782c = typedArrayObtainStyledAttributes.getDimension(index, this.f22782c);
                } else if (index == C5969d.f23119n7) {
                    this.f22780a = typedArrayObtainStyledAttributes.getDimension(index, this.f22780a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public boolean m26774a(float f10, float f11) {
            if (!Float.isNaN(this.f22780a) && f10 < this.f22780a) {
                return false;
            }
            if (!Float.isNaN(this.f22781b) && f11 < this.f22781b) {
                return false;
            }
            if (Float.isNaN(this.f22782c) || f10 <= this.f22782c) {
                return Float.isNaN(this.f22783d) || f11 <= this.f22783d;
            }
            return false;
        }
    }

    public C5966a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f22770a = constraintLayout;
        m26768a(context, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m26768a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m26769b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f22774e.put(aVar2.f22776a, aVar2);
                                aVar = aVar2;
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
                                if (aVar != null) {
                                    aVar.m26772a(bVar);
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

    /* JADX INFO: renamed from: b */
    public final void m26769b(Context context, XmlPullParser xmlPullParser) {
        C0518c c0518c = new C0518c();
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
                c0518c.m2524u(context, xmlPullParser);
                this.f22775f.put(identifier, c0518c);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m26770c(AbstractC5967b abstractC5967b) {
    }

    /* JADX INFO: renamed from: d */
    public void m26771d(int i10, float f10, float f11) {
        int iM26773b;
        int i11 = this.f22772c;
        if (i11 == i10) {
            a aVarValueAt = i10 == -1 ? this.f22774e.valueAt(0) : this.f22774e.get(i11);
            int i12 = this.f22773d;
            if ((i12 == -1 || !aVarValueAt.f22777b.get(i12).m26774a(f10, f11)) && this.f22773d != (iM26773b = aVarValueAt.m26773b(f10, f11))) {
                C0518c c0518c = iM26773b == -1 ? this.f22771b : aVarValueAt.f22777b.get(iM26773b).f22785f;
                if (iM26773b != -1) {
                    int i13 = aVarValueAt.f22777b.get(iM26773b).f22784e;
                }
                if (c0518c == null) {
                    return;
                }
                this.f22773d = iM26773b;
                c0518c.m2506c(this.f22770a);
                return;
            }
            return;
        }
        this.f22772c = i10;
        a aVar = this.f22774e.get(i10);
        int iM26773b2 = aVar.m26773b(f10, f11);
        C0518c c0518c2 = iM26773b2 == -1 ? aVar.f22779d : aVar.f22777b.get(iM26773b2).f22785f;
        if (iM26773b2 != -1) {
            int i14 = aVar.f22777b.get(iM26773b2).f22784e;
        }
        if (c0518c2 != null) {
            this.f22773d = iM26773b2;
            c0518c2.m2506c(this.f22770a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
