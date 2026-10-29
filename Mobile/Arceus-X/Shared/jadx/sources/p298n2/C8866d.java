package p298n2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: n2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8866d {

    /* JADX INFO: renamed from: a */
    public final Shader f32265a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f32266b;

    /* JADX INFO: renamed from: c */
    public int f32267c;

    public C8866d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f32265a = shader;
        this.f32266b = colorStateList;
        this.f32267c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C8866d m35618a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return m35621d(C8868f.m35652b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m35620c(C8865c.m35611b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    public static C8866d m35619b(int i10) {
        return new C8866d(null, null, i10);
    }

    /* JADX INFO: renamed from: c */
    public static C8866d m35620c(ColorStateList colorStateList) {
        return new C8866d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    public static C8866d m35621d(Shader shader) {
        return new C8866d(shader, null, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C8866d m35622g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m35618a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m35623e() {
        return this.f32267c;
    }

    /* JADX INFO: renamed from: f */
    public Shader m35624f() {
        return this.f32265a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m35625h() {
        return this.f32265a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m35626i() {
        ColorStateList colorStateList;
        return this.f32265a == null && (colorStateList = this.f32266b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public boolean m35627j(int[] iArr) {
        if (!m35626i()) {
            return false;
        }
        ColorStateList colorStateList = this.f32266b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f32267c) {
            return false;
        }
        this.f32267c = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m35628k(int i10) {
        this.f32267c = i10;
    }

    /* JADX INFO: renamed from: l */
    public boolean m35629l() {
        return m35625h() || this.f32267c != 0;
    }
}
