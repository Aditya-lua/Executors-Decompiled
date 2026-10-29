package p509w7;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.appsflyer.C1759R;
import com.google.mlkit.common.MlKitException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p336ws.RealWebSocket;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: w7.k */
/* JADX INFO: loaded from: classes.dex */
public class C12323k {

    /* JADX INFO: renamed from: d */
    public int f44029d;

    /* JADX INFO: renamed from: a */
    public C12319g f44026a = null;

    /* JADX INFO: renamed from: b */
    public C12319g.j0 f44027b = null;

    /* JADX INFO: renamed from: c */
    public boolean f44028c = false;

    /* JADX INFO: renamed from: e */
    public boolean f44030e = false;

    /* JADX INFO: renamed from: f */
    public h f44031f = null;

    /* JADX INFO: renamed from: g */
    public StringBuilder f44032g = null;

    /* JADX INFO: renamed from: h */
    public boolean f44033h = false;

    /* JADX INFO: renamed from: i */
    public StringBuilder f44034i = null;

    /* JADX INFO: renamed from: w7.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44035a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f44036b;

        static {
            int[] iArr = new int[g.values().length];
            f44036b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44036b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44036b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44036b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44036b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44036b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44036b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44036b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44036b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44036b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44036b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44036b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44036b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44036b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44036b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44036b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44036b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44036b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44036b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44036b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44036b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f44036b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f44036b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f44036b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f44036b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f44036b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f44036b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f44036b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f44036b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f44036b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f44036b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f44036b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f44036b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f44036b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f44036b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f44036b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f44036b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f44036b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f44036b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f44036b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f44036b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f44036b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f44036b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f44036b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f44036b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f44036b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f44036b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f44036b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f44036b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f44036b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f44036b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f44036b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f44036b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f44036b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f44036b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f44036b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f44036b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f44036b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f44036b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f44036b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f44036b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f44036b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f44036b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f44036b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f44036b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f44036b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f44036b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f44036b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f44036b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f44036b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f44036b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f44036b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f44036b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f44036b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f44036b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f44036b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f44036b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f44036b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f44036b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f44036b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f44036b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f44036b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f44036b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f44036b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f44036b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f44036b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f44036b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f44036b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f44036b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f44035a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f44035a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f44035a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f44035a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f44035a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f44035a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f44035a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f44035a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f44035a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f44035a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f44035a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f44035a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f44035a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f44035a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f44035a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f44035a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f44035a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f44035a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f44035a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f44035a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f44035a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f44035a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f44035a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f44035a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f44035a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f44035a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f44035a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f44035a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f44035a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f44035a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f44035a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: renamed from: w7.k$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Map<String, C12317e.a> f44037a;

        static {
            HashMap map = new HashMap(10);
            f44037a = map;
            map.put("none", C12317e.a.none);
            map.put("xMinYMin", C12317e.a.xMinYMin);
            map.put("xMidYMin", C12317e.a.xMidYMin);
            map.put("xMaxYMin", C12317e.a.xMaxYMin);
            map.put("xMinYMid", C12317e.a.xMinYMid);
            map.put("xMidYMid", C12317e.a.xMidYMid);
            map.put("xMaxYMid", C12317e.a.xMaxYMid);
            map.put("xMinYMax", C12317e.a.xMinYMax);
            map.put("xMidYMax", C12317e.a.xMidYMax);
            map.put("xMaxYMax", C12317e.a.xMaxYMax);
        }

        /* JADX INFO: renamed from: a */
        public static C12317e.a m46129a(String str) {
            return f44037a.get(str);
        }
    }

    /* JADX INFO: renamed from: w7.k$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Integer> f44038a;

        static {
            HashMap map = new HashMap(47);
            f44038a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        /* JADX INFO: renamed from: a */
        public static Integer m46130a(String str) {
            return f44038a.get(str);
        }
    }

    /* JADX INFO: renamed from: w7.k$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final Map<String, C12319g.p> f44039a;

        static {
            HashMap map = new HashMap(9);
            f44039a = map;
            C12319g.d1 d1Var = C12319g.d1.pt;
            map.put("xx-small", new C12319g.p(0.694f, d1Var));
            map.put("x-small", new C12319g.p(0.833f, d1Var));
            map.put("small", new C12319g.p(10.0f, d1Var));
            map.put("medium", new C12319g.p(12.0f, d1Var));
            map.put("large", new C12319g.p(14.4f, d1Var));
            map.put("x-large", new C12319g.p(17.3f, d1Var));
            map.put("xx-large", new C12319g.p(20.7f, d1Var));
            C12319g.d1 d1Var2 = C12319g.d1.percent;
            map.put("smaller", new C12319g.p(83.33f, d1Var2));
            map.put("larger", new C12319g.p(120.0f, d1Var2));
        }

        /* JADX INFO: renamed from: a */
        public static C12319g.p m46131a(String str) {
            return f44039a.get(str);
        }
    }

    /* JADX INFO: renamed from: w7.k$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Integer> f44040a;

        static {
            HashMap map = new HashMap(13);
            f44040a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", Integer.valueOf(MlKitException.CODE_SCANNER_UNAVAILABLE));
            map.put("300", Integer.valueOf(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE));
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        /* JADX INFO: renamed from: a */
        public static Integer m46132a(String str) {
            return f44040a.get(str);
        }
    }

    /* JADX INFO: renamed from: w7.k$f */
    public class f extends DefaultHandler2 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            C12323k.this.m46102c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            C12323k.this.m46118o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            C12323k.this.m46119p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            C12323k.this.m46121r(str, C12323k.this.m46126x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            C12323k.this.m46093W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws C12322j {
            C12323k.this.m46095X0(str, str2, str3, attributes);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 w7.k) A[MD:(w7.k):void (m)] (LINE:2) call: w7.k.f.<init>(w7.k):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ f(C12323k c12323k, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.k$g */
    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: O0 */
        public static final Map<String, g> f44071O0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f44071O0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f44071O0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static g m46133a(String str) {
            g gVar = f44071O0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: renamed from: w7.k$h */
    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: G */
        public static final Map<String, h> f44142G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f44142G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f44142G.put(hVar.name(), hVar);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static h m46134a(String str) {
            h hVar = f44142G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: renamed from: w7.k$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public String f44170a;

        /* JADX INFO: renamed from: c */
        public int f44172c;

        /* JADX INFO: renamed from: b */
        public int f44171b = 0;

        /* JADX INFO: renamed from: d */
        public C12316d f44173d = new C12316d();

        public i(String str) {
            this.f44172c = 0;
            String strTrim = str.trim();
            this.f44170a = strTrim;
            this.f44172c = strTrim.length();
        }

        /* JADX INFO: renamed from: A */
        public void m46135A() {
            while (true) {
                int i10 = this.f44171b;
                if (i10 >= this.f44172c || !m46146k(this.f44170a.charAt(i10))) {
                    return;
                } else {
                    this.f44171b++;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public int m46136a() {
            int i10 = this.f44171b;
            int i11 = this.f44172c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f44171b = i12;
            if (i12 < i11) {
                return this.f44170a.charAt(i12);
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public String m46137b() {
            int i10 = this.f44171b;
            while (!m46143h() && !m46146k(this.f44170a.charAt(this.f44171b))) {
                this.f44171b++;
            }
            String strSubstring = this.f44170a.substring(i10, this.f44171b);
            this.f44171b = i10;
            return strSubstring;
        }

        /* JADX INFO: renamed from: c */
        public Boolean m46138c(Object obj) {
            if (obj == null) {
                return null;
            }
            m46161z();
            return m46148m();
        }

        /* JADX INFO: renamed from: d */
        public float m46139d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            m46161z();
            return m46149n();
        }

        /* JADX INFO: renamed from: e */
        public float m46140e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            m46161z();
            return m46149n();
        }

        /* JADX INFO: renamed from: f */
        public boolean m46141f(char c10) {
            int i10 = this.f44171b;
            boolean z10 = i10 < this.f44172c && this.f44170a.charAt(i10) == c10;
            if (z10) {
                this.f44171b++;
            }
            return z10;
        }

        /* JADX INFO: renamed from: g */
        public boolean m46142g(String str) {
            int length = str.length();
            int i10 = this.f44171b;
            boolean z10 = i10 <= this.f44172c - length && this.f44170a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f44171b += length;
            }
            return z10;
        }

        /* JADX INFO: renamed from: h */
        public boolean m46143h() {
            return this.f44171b == this.f44172c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m46144i() {
            int i10 = this.f44171b;
            if (i10 == this.f44172c) {
                return false;
            }
            char cCharAt = this.f44170a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        /* JADX INFO: renamed from: j */
        public boolean m46145j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        /* JADX INFO: renamed from: k */
        public boolean m46146k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        /* JADX INFO: renamed from: l */
        public Integer m46147l() {
            int i10 = this.f44171b;
            if (i10 == this.f44172c) {
                return null;
            }
            String str = this.f44170a;
            this.f44171b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        /* JADX INFO: renamed from: m */
        public Boolean m46148m() {
            int i10 = this.f44171b;
            if (i10 == this.f44172c) {
                return null;
            }
            char cCharAt = this.f44170a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f44171b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        /* JADX INFO: renamed from: n */
        public float m46149n() {
            float fM45829b = this.f44173d.m45829b(this.f44170a, this.f44171b, this.f44172c);
            if (!Float.isNaN(fM45829b)) {
                this.f44171b = this.f44173d.m45828a();
            }
            return fM45829b;
        }

        /* JADX INFO: renamed from: o */
        public String m46150o() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            int iCharAt = this.f44170a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = m46136a();
            }
            int i11 = this.f44171b;
            while (m46146k(iCharAt)) {
                iCharAt = m46136a();
            }
            if (iCharAt == 40) {
                this.f44171b++;
                return this.f44170a.substring(i10, i11);
            }
            this.f44171b = i10;
            return null;
        }

        /* JADX INFO: renamed from: p */
        public C12319g.p m46151p() {
            float fM46149n = m46149n();
            if (Float.isNaN(fM46149n)) {
                return null;
            }
            C12319g.d1 d1VarM46157v = m46157v();
            return d1VarM46157v == null ? new C12319g.p(fM46149n, C12319g.d1.px) : new C12319g.p(fM46149n, d1VarM46157v);
        }

        /* JADX INFO: renamed from: q */
        public String m46152q() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            char cCharAt = this.f44170a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iM46136a = m46136a();
            while (iM46136a != -1 && iM46136a != cCharAt) {
                iM46136a = m46136a();
            }
            if (iM46136a == -1) {
                this.f44171b = i10;
                return null;
            }
            int i11 = this.f44171b;
            this.f44171b = i11 + 1;
            return this.f44170a.substring(i10 + 1, i11);
        }

        /* JADX INFO: renamed from: r */
        public String m46153r() {
            return m46155t(' ', false);
        }

        /* JADX INFO: renamed from: s */
        public String m46154s(char c10) {
            return m46155t(c10, false);
        }

        /* JADX INFO: renamed from: t */
        public String m46155t(char c10, boolean z10) {
            if (m46143h()) {
                return null;
            }
            char cCharAt = this.f44170a.charAt(this.f44171b);
            if ((!z10 && m46146k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f44171b;
            int iM46136a = m46136a();
            while (iM46136a != -1 && iM46136a != c10 && (z10 || !m46146k(iM46136a))) {
                iM46136a = m46136a();
            }
            return this.f44170a.substring(i10, this.f44171b);
        }

        /* JADX INFO: renamed from: u */
        public String m46156u(char c10) {
            return m46155t(c10, true);
        }

        /* JADX INFO: renamed from: v */
        public C12319g.d1 m46157v() {
            if (m46143h()) {
                return null;
            }
            if (this.f44170a.charAt(this.f44171b) == '%') {
                this.f44171b++;
                return C12319g.d1.percent;
            }
            int i10 = this.f44171b;
            if (i10 > this.f44172c - 2) {
                return null;
            }
            try {
                C12319g.d1 d1VarValueOf = C12319g.d1.valueOf(this.f44170a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f44171b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: w */
        public String m46158w() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            char cCharAt = this.f44170a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f44171b = i10;
                return null;
            }
            int iM46136a = m46136a();
            while (true) {
                if ((iM46136a < 65 || iM46136a > 90) && (iM46136a < 97 || iM46136a > 122)) {
                    break;
                }
                iM46136a = m46136a();
            }
            return this.f44170a.substring(i10, this.f44171b);
        }

        /* JADX INFO: renamed from: x */
        public float m46159x() {
            m46161z();
            float fM45829b = this.f44173d.m45829b(this.f44170a, this.f44171b, this.f44172c);
            if (!Float.isNaN(fM45829b)) {
                this.f44171b = this.f44173d.m45828a();
            }
            return fM45829b;
        }

        /* JADX INFO: renamed from: y */
        public String m46160y() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            this.f44171b = this.f44172c;
            return this.f44170a.substring(i10);
        }

        /* JADX INFO: renamed from: z */
        public boolean m46161z() {
            m46135A();
            int i10 = this.f44171b;
            if (i10 == this.f44172c || this.f44170a.charAt(i10) != ',') {
                return false;
            }
            this.f44171b++;
            m46135A();
            return true;
        }
    }

    /* JADX INFO: renamed from: w7.k$j */
    public class j implements Attributes {

        /* JADX INFO: renamed from: a */
        public XmlPullParser f44174a;

        public j(XmlPullParser xmlPullParser) {
            this.f44174a = xmlPullParser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f44174a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f44174a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f44174a.getAttributeName(i10);
            if (this.f44174a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f44174a.getAttributePrefix(i10) + ':' + attributeName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f44174a.getAttributeNamespace(i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f44174a.getAttributeValue(i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static Set<String> m46014A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.m46143h()) {
            hashSet.add(iVar.m46153r());
            iVar.m46135A();
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: B0 */
    public static C12319g.p[] m46015B0(String str) {
        C12319g.p pVarM46151p;
        i iVar = new i(str);
        iVar.m46135A();
        if (iVar.m46143h() || (pVarM46151p = iVar.m46151p()) == null || pVarM46151p.m45890i()) {
            return null;
        }
        float fM45884a = pVarM46151p.m45884a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVarM46151p);
        while (!iVar.m46143h()) {
            iVar.m46161z();
            C12319g.p pVarM46151p2 = iVar.m46151p();
            if (pVarM46151p2 == null || pVarM46151p2.m45890i()) {
                return null;
            }
            arrayList.add(pVarM46151p2);
            fM45884a += pVarM46151p2.m45884a();
        }
        if (fM45884a == 0.0f) {
            return null;
        }
        return (C12319g.p[]) arrayList.toArray(new C12319g.p[arrayList.size()]);
    }

    /* JADX INFO: renamed from: C0 */
    public static C12319g.e0.c m46016C0(String str) {
        if ("butt".equals(str)) {
            return C12319g.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return C12319g.e0.c.Round;
        }
        if ("square".equals(str)) {
            return C12319g.e0.c.Square;
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static C12319g.e0.d m46017D0(String str) {
        if ("miter".equals(str)) {
            return C12319g.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return C12319g.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return C12319g.e0.d.Bevel;
        }
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m46018E0(C12319g.l0 l0Var, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM46154s = iVar.m46154s(':');
            iVar.m46135A();
            if (!iVar.m46141f(':')) {
                return;
            }
            iVar.m46135A();
            String strM46156u = iVar.m46156u(';');
            if (strM46156u == null) {
                return;
            }
            iVar.m46135A();
            if (iVar.m46143h() || iVar.m46141f(';')) {
                if (l0Var.f43906f == null) {
                    l0Var.f43906f = new C12319g.e0();
                }
                m46025S0(l0Var.f43906f, strM46154s, strM46156u);
                iVar.m46135A();
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static Set<String> m46019F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.m46143h()) {
            String strM46153r = iVar.m46153r();
            int iIndexOf = strM46153r.indexOf(45);
            if (iIndexOf != -1) {
                strM46153r = strM46153r.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strM46153r, "", "").getLanguage());
            iVar.m46135A();
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: G0 */
    public static C12319g.e0.f m46020G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return C12319g.e0.f.Middle;
            case "end":
                return C12319g.e0.f.End;
            case "start":
                return C12319g.e0.f.Start;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static C12319g.e0.g m46021H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return C12319g.e0.g.LineThrough;
            case "underline":
                return C12319g.e0.g.Underline;
            case "none":
                return C12319g.e0.g.None;
            case "blink":
                return C12319g.e0.g.Blink;
            case "overline":
                return C12319g.e0.g.Overline;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static C12319g.e0.h m46022I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return C12319g.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return C12319g.e0.h.RTL;
        }
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public static C12319g.e0.i m46023M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C12319g.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return C12319g.e0.i.NonScalingStroke;
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static C12319g.b m46024N0(String str) throws C12322j {
        i iVar = new i(str);
        iVar.m46135A();
        float fM46149n = iVar.m46149n();
        iVar.m46161z();
        float fM46149n2 = iVar.m46149n();
        iVar.m46161z();
        float fM46149n3 = iVar.m46149n();
        iVar.m46161z();
        float fM46149n4 = iVar.m46149n();
        if (Float.isNaN(fM46149n) || Float.isNaN(fM46149n2) || Float.isNaN(fM46149n3) || Float.isNaN(fM46149n4)) {
            throw new C12322j("Invalid viewBox definition - should have four numbers");
        }
        if (fM46149n3 < 0.0f) {
            throw new C12322j("Invalid viewBox. width cannot be negative");
        }
        if (fM46149n4 >= 0.0f) {
            return new C12319g.b(fM46149n, fM46149n2, fM46149n3, fM46149n4);
        }
        throw new C12322j("Invalid viewBox. height cannot be negative");
    }

    /* JADX INFO: renamed from: S0 */
    public static void m46025S0(C12319g.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f44036b[g.m46133a(str).ordinal()]) {
                case 47:
                    C12319g.o0 o0VarM46054t0 = m46054t0(str2);
                    e0Var.f43803b = o0VarM46054t0;
                    if (o0VarM46054t0 != null) {
                        e0Var.f43802a |= 1;
                    }
                    break;
                case 48:
                    C12319g.e0.a aVarM46035e0 = m46035e0(str2);
                    e0Var.f43804c = aVarM46035e0;
                    if (aVarM46035e0 != null) {
                        e0Var.f43802a |= 2;
                    }
                    break;
                case 49:
                    Float fM46050r0 = m46050r0(str2);
                    e0Var.f43805d = fM46050r0;
                    if (fM46050r0 != null) {
                        e0Var.f43802a |= 4;
                    }
                    break;
                case 50:
                    C12319g.o0 o0VarM46054t1 = m46054t0(str2);
                    e0Var.f43806e = o0VarM46054t1;
                    if (o0VarM46054t1 != null) {
                        e0Var.f43802a |= 8;
                    }
                    break;
                case 51:
                    Float fM46050r1 = m46050r0(str2);
                    e0Var.f43807f = fM46050r1;
                    if (fM46050r1 != null) {
                        e0Var.f43802a |= 16;
                    }
                    break;
                case 52:
                    e0Var.f43808g = m46047o0(str2);
                    e0Var.f43802a |= 32;
                    break;
                case 53:
                    C12319g.e0.c cVarM46016C0 = m46016C0(str2);
                    e0Var.f43809h = cVarM46016C0;
                    if (cVarM46016C0 != null) {
                        e0Var.f43802a |= 64;
                    }
                    break;
                case 54:
                    C12319g.e0.d dVarM46017D0 = m46017D0(str2);
                    e0Var.f43810i = dVarM46017D0;
                    if (dVarM46017D0 != null) {
                        e0Var.f43802a |= 128;
                    }
                    break;
                case 55:
                    e0Var.f43811j = Float.valueOf(m46037f0(str2));
                    e0Var.f43802a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        C12319g.p[] pVarArrM46015B0 = m46015B0(str2);
                        e0Var.f43812k = pVarArrM46015B0;
                        if (pVarArrM46015B0 != null) {
                            e0Var.f43802a |= 512;
                        }
                    } else {
                        e0Var.f43812k = null;
                        e0Var.f43802a |= 512;
                    }
                    break;
                case 57:
                    e0Var.f43813l = m46047o0(str2);
                    e0Var.f43802a |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    break;
                case 58:
                    e0Var.f43814m = m46050r0(str2);
                    e0Var.f43802a |= 2048;
                    break;
                case 59:
                    e0Var.f43815n = m46029b0(str2);
                    e0Var.f43802a |= 4096;
                    break;
                case 60:
                    m46040h0(e0Var, str2);
                    break;
                case 61:
                    List<String> listM46041i0 = m46041i0(str2);
                    e0Var.f43816o = listM46041i0;
                    if (listM46041i0 != null) {
                        e0Var.f43802a |= 8192;
                    }
                    break;
                case 62:
                    C12319g.p pVarM46043j0 = m46043j0(str2);
                    e0Var.f43817p = pVarM46043j0;
                    if (pVarM46043j0 != null) {
                        e0Var.f43802a |= Http2Stream.EMIT_BUFFER_SIZE;
                    }
                    break;
                case 63:
                    Integer numM46045l0 = m46045l0(str2);
                    e0Var.f43818q = numM46045l0;
                    if (numM46045l0 != null) {
                        e0Var.f43802a |= 32768;
                    }
                    break;
                case 64:
                    C12319g.e0.b bVarM46044k0 = m46044k0(str2);
                    e0Var.f43819r = bVarM46044k0;
                    if (bVarM46044k0 != null) {
                        e0Var.f43802a |= 65536;
                    }
                    break;
                case 65:
                    C12319g.e0.g gVarM46021H0 = m46021H0(str2);
                    e0Var.f43820s = gVarM46021H0;
                    if (gVarM46021H0 != null) {
                        e0Var.f43802a |= 131072;
                    }
                    break;
                case 66:
                    C12319g.e0.h hVarM46022I0 = m46022I0(str2);
                    e0Var.f43821t = hVarM46022I0;
                    if (hVarM46022I0 != null) {
                        e0Var.f43802a |= 68719476736L;
                    }
                    break;
                case 67:
                    C12319g.e0.f fVarM46020G0 = m46020G0(str2);
                    e0Var.f43822u = fVarM46020G0;
                    if (fVarM46020G0 != null) {
                        e0Var.f43802a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolM46052s0 = m46052s0(str2);
                    e0Var.f43823v = boolM46052s0;
                    if (boolM46052s0 != null) {
                        e0Var.f43802a |= 524288;
                    }
                    break;
                case 69:
                    String strM46046m0 = m46046m0(str2, str);
                    e0Var.f43825x = strM46046m0;
                    e0Var.f43826y = strM46046m0;
                    e0Var.f43827z = strM46046m0;
                    e0Var.f43802a |= 14680064;
                    break;
                case 70:
                    e0Var.f43825x = m46046m0(str2, str);
                    e0Var.f43802a |= 2097152;
                    break;
                case 71:
                    e0Var.f43826y = m46046m0(str2, str);
                    e0Var.f43802a |= 4194304;
                    break;
                case 72:
                    e0Var.f43827z = m46046m0(str2, str);
                    e0Var.f43802a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(C1759R.styleable.AppCompatTheme_windowMinWidthMajor) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e0Var.f43789A = Boolean.valueOf(!str2.equals("none"));
                            e0Var.f43802a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(C1759R.styleable.AppCompatTheme_windowMinWidthMajor) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e0Var.f43790B = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f43802a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.f43791C = C12319g.g.m45872a();
                    } else {
                        try {
                            e0Var.f43791C = m46029b0(str2);
                        } catch (C12322j e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    e0Var.f43802a |= 67108864;
                    break;
                case 76:
                    e0Var.f43792D = m46050r0(str2);
                    e0Var.f43802a |= 134217728;
                    break;
                case 77:
                    C12319g.c cVarM46027a0 = m46027a0(str2);
                    e0Var.f43824w = cVarM46027a0;
                    if (cVarM46027a0 != null) {
                        e0Var.f43802a |= 1048576;
                    }
                    break;
                case 78:
                    e0Var.f43793E = m46046m0(str2, str);
                    e0Var.f43802a |= 268435456;
                    break;
                case 79:
                    e0Var.f43794F = m46035e0(str2);
                    e0Var.f43802a |= 536870912;
                    break;
                case 80:
                    e0Var.f43795G = m46046m0(str2, str);
                    e0Var.f43802a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.f43796H = C12319g.g.m45872a();
                    } else {
                        try {
                            e0Var.f43796H = m46029b0(str2);
                        } catch (C12322j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f43802a |= 2147483648L;
                    break;
                case 82:
                    e0Var.f43797I = m46050r0(str2);
                    e0Var.f43802a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.f43798J = C12319g.g.m45872a();
                    } else {
                        try {
                            e0Var.f43798J = m46029b0(str2);
                        } catch (C12322j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f43802a |= 8589934592L;
                    break;
                case 84:
                    e0Var.f43799K = m46050r0(str2);
                    e0Var.f43802a |= 17179869184L;
                    break;
                case 85:
                    C12319g.e0.i iVarM46023M0 = m46023M0(str2);
                    e0Var.f43800L = iVarM46023M0;
                    if (iVarM46023M0 != null) {
                        e0Var.f43802a |= 34359738368L;
                    }
                    break;
                case 86:
                    C12319g.e0.e eVarM46058y0 = m46058y0(str2);
                    e0Var.f43801M = eVarM46058y0;
                    if (eVarM46058y0 != null) {
                        e0Var.f43802a |= 137438953472L;
                    }
                    break;
            }
        } catch (C12322j unused) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static C12319g.c m46027a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.m46135A();
        C12319g.p pVarM46049q0 = m46049q0(iVar);
        iVar.m46161z();
        C12319g.p pVarM46049q1 = m46049q0(iVar);
        iVar.m46161z();
        C12319g.p pVarM46049q2 = m46049q0(iVar);
        iVar.m46161z();
        C12319g.p pVarM46049q3 = m46049q0(iVar);
        iVar.m46135A();
        if (iVar.m46141f(')') || iVar.m46143h()) {
            return new C12319g.c(pVarM46049q0, pVarM46049q1, pVarM46049q2, pVarM46049q3);
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static C12319g.f m46029b0(String str) throws C12322j {
        if (str.charAt(0) == '#') {
            C12315c c12315cM45824b = C12315c.m45824b(str, 1, str.length());
            if (c12315cM45824b == null) {
                throw new C12322j("Bad hex colour value: " + str);
            }
            int iM45826a = c12315cM45824b.m45826a();
            if (iM45826a == 4) {
                int iM45827d = c12315cM45824b.m45827d();
                int i10 = iM45827d & 3840;
                int i11 = iM45827d & 240;
                int i12 = iM45827d & 15;
                return new C12319g.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iM45826a == 5) {
                int iM45827d2 = c12315cM45824b.m45827d();
                int i13 = 61440 & iM45827d2;
                int i14 = iM45827d2 & 3840;
                int i15 = iM45827d2 & 240;
                int i16 = iM45827d2 & 15;
                return new C12319g.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iM45826a == 7) {
                return new C12319g.f(c12315cM45824b.m45827d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iM45826a == 9) {
                return new C12319g.f((c12315cM45824b.m45827d() >>> 8) | (c12315cM45824b.m45827d() << 24));
            }
            throw new C12322j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return m46031c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.m46135A();
            float fM46149n = iVar.m46149n();
            float fM46139d = iVar.m46139d(fM46149n);
            if (!Float.isNaN(fM46139d)) {
                iVar.m46141f('%');
            }
            float fM46139d2 = iVar.m46139d(fM46139d);
            if (!Float.isNaN(fM46139d2)) {
                iVar.m46141f('%');
            }
            if (!zStartsWith2) {
                iVar.m46135A();
                if (!Float.isNaN(fM46139d2) && iVar.m46141f(')')) {
                    return new C12319g.f(m46051s(fM46149n, fM46139d, fM46139d2) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new C12322j("Bad hsl() colour value: " + str);
            }
            float fM46139d3 = iVar.m46139d(fM46139d2);
            iVar.m46135A();
            if (!Float.isNaN(fM46139d3) && iVar.m46141f(')')) {
                return new C12319g.f((m46042j(fM46139d3 * 256.0f) << 24) | m46051s(fM46149n, fM46139d, fM46139d2));
            }
            throw new C12322j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.m46135A();
        float fM46149n2 = iVar2.m46149n();
        if (!Float.isNaN(fM46149n2) && iVar2.m46141f('%')) {
            fM46149n2 = (fM46149n2 * 256.0f) / 100.0f;
        }
        float fM46139d4 = iVar2.m46139d(fM46149n2);
        if (!Float.isNaN(fM46139d4) && iVar2.m46141f('%')) {
            fM46139d4 = (fM46139d4 * 256.0f) / 100.0f;
        }
        float fM46139d5 = iVar2.m46139d(fM46139d4);
        if (!Float.isNaN(fM46139d5) && iVar2.m46141f('%')) {
            fM46139d5 = (fM46139d5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.m46135A();
            if (!Float.isNaN(fM46139d5) && iVar2.m46141f(')')) {
                return new C12319g.f((m46042j(fM46149n2) << 16) | ViewCompat.MEASURED_STATE_MASK | (m46042j(fM46139d4) << 8) | m46042j(fM46139d5));
            }
            throw new C12322j("Bad rgb() colour value: " + str);
        }
        float fM46139d6 = iVar2.m46139d(fM46139d5);
        iVar2.m46135A();
        if (!Float.isNaN(fM46139d6) && iVar2.m46141f(')')) {
            return new C12319g.f((m46042j(fM46139d6 * 256.0f) << 24) | (m46042j(fM46149n2) << 16) | (m46042j(fM46139d4) << 8) | m46042j(fM46139d5));
        }
        throw new C12322j("Bad rgba() colour value: " + str);
    }

    /* JADX INFO: renamed from: c0 */
    public static C12319g.f m46031c0(String str) throws C12322j {
        Integer numM46130a = c.m46130a(str);
        if (numM46130a != null) {
            return new C12319g.f(numM46130a.intValue());
        }
        throw new C12322j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: renamed from: d0 */
    public static C12319g.o0 m46033d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C12319g.f.f43869c;
        }
        if (str.equals("currentColor")) {
            return C12319g.g.m45872a();
        }
        try {
            return m46029b0(str);
        } catch (C12322j unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static C12319g.e0.a m46035e0(String str) {
        if ("nonzero".equals(str)) {
            return C12319g.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C12319g.e0.a.EvenOdd;
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public static float m46037f0(String str) throws C12322j {
        int length = str.length();
        if (length != 0) {
            return m46039g0(str, 0, length);
        }
        throw new C12322j("Invalid float value (empty string)");
    }

    /* JADX INFO: renamed from: g0 */
    public static float m46039g0(String str, int i10, int i11) throws C12322j {
        float fM45829b = new C12316d().m45829b(str, i10, i11);
        if (!Float.isNaN(fM45829b)) {
            return fM45829b;
        }
        throw new C12322j("Invalid float value: " + str);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m46040h0(C12319g.e0 e0Var, String str) {
        String strM46154s;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numM46132a = null;
            C12319g.e0.b bVarM46044k0 = null;
            String str2 = null;
            while (true) {
                strM46154s = iVar.m46154s('/');
                iVar.m46135A();
                if (strM46154s != null) {
                    if (numM46132a != null && bVarM46044k0 != null) {
                        break;
                    }
                    if (!strM46154s.equals("normal") && (numM46132a != null || (numM46132a = e.m46132a(strM46154s)) == null)) {
                        if (bVarM46044k0 != null || (bVarM46044k0 = m46044k0(strM46154s)) == null) {
                            if (str2 != null || !strM46154s.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strM46154s;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C12319g.p pVarM46043j0 = m46043j0(strM46154s);
            if (iVar.m46141f('/')) {
                iVar.m46135A();
                String strM46153r = iVar.m46153r();
                if (strM46153r != null) {
                    try {
                        m46047o0(strM46153r);
                    } catch (C12322j unused) {
                        return;
                    }
                }
                iVar.m46135A();
            }
            e0Var.f43816o = m46041i0(iVar.m46160y());
            e0Var.f43817p = pVarM46043j0;
            e0Var.f43818q = Integer.valueOf(numM46132a == null ? 400 : numM46132a.intValue());
            if (bVarM46044k0 == null) {
                bVarM46044k0 = C12319g.e0.b.Normal;
            }
            e0Var.f43819r = bVarM46044k0;
            e0Var.f43802a |= 122880;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static List<String> m46041i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strM46152q = iVar.m46152q();
            if (strM46152q == null) {
                strM46152q = iVar.m46156u(',');
            }
            if (strM46152q == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM46152q);
            iVar.m46161z();
        } while (!iVar.m46143h());
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static int m46042j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    /* JADX INFO: renamed from: j0 */
    public static C12319g.p m46043j0(String str) {
        try {
            C12319g.p pVarM46131a = d.m46131a(str);
            return pVarM46131a == null ? m46047o0(str) : pVarM46131a;
        } catch (C12322j unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static C12319g.e0.b m46044k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return C12319g.e0.b.Oblique;
            case "italic":
                return C12319g.e0.b.Italic;
            case "normal":
                return C12319g.e0.b.Normal;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static Integer m46045l0(String str) {
        return e.m46132a(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static String m46046m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public static C12319g.p m46047o0(String str) throws C12322j {
        if (str.length() == 0) {
            throw new C12322j("Invalid length value (empty string)");
        }
        int length = str.length();
        C12319g.d1 d1VarValueOf = C12319g.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = C12319g.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = C12319g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C12322j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new C12319g.p(m46039g0(str, 0, length), d1VarValueOf);
        } catch (NumberFormatException e10) {
            throw new C12322j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static List<C12319g.p> m46048p0(String str) throws C12322j {
        if (str.length() == 0) {
            throw new C12322j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.m46135A();
        while (!iVar.m46143h()) {
            float fM46149n = iVar.m46149n();
            if (Float.isNaN(fM46149n)) {
                throw new C12322j("Invalid length list value: " + iVar.m46137b());
            }
            C12319g.d1 d1VarM46157v = iVar.m46157v();
            if (d1VarM46157v == null) {
                d1VarM46157v = C12319g.d1.px;
            }
            arrayList.add(new C12319g.p(fM46149n, d1VarM46157v));
            iVar.m46161z();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public static C12319g.p m46049q0(i iVar) {
        return iVar.m46142g("auto") ? new C12319g.p(0.0f) : iVar.m46151p();
    }

    /* JADX INFO: renamed from: r0 */
    public static Float m46050r0(String str) {
        try {
            float fM46037f0 = m46037f0(str);
            float f10 = 0.0f;
            if (fM46037f0 < 0.0f) {
                fM46037f0 = f10;
            } else {
                f10 = 1.0f;
                if (fM46037f0 > 1.0f) {
                    fM46037f0 = f10;
                }
            }
            return Float.valueOf(fM46037f0);
        } catch (C12322j unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m46051s(float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= 0.0f) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return m46042j(m46053t(f19, f18, f15 - 2.0f) * 256.0f) | (m46042j(m46053t(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (m46042j(m46053t(f19, f18, f15) * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m46052s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static float m46053t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    /* JADX INFO: renamed from: t0 */
    public static C12319g.o0 m46054t0(String str) {
        if (!str.startsWith("url(")) {
            return m46033d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new C12319g.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new C12319g.u(strTrim, strTrim2.length() > 0 ? m46033d0(strTrim2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    /* JADX INFO: renamed from: u0 */
    public static C12319g.w m46055u0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        C12319g.w wVar = new C12319g.w();
        if (!iVar.m46143h()) {
            int iIntValue = iVar.m46147l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float fM46149n = 0.0f;
                float f14 = 0.0f;
                float fM46139d = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    iVar.m46135A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fM46149n2 = iVar.m46149n();
                            float fM46139d2 = iVar.m46139d(fM46149n2);
                            float f18 = f14;
                            float fM46139d3 = iVar.m46139d(fM46139d2);
                            Boolean boolM46138c = iVar.m46138c(Float.valueOf(fM46139d3));
                            Boolean boolM46138c2 = iVar.m46138c(boolM46138c);
                            float fM46140e = iVar.m46140e(boolM46138c2);
                            float fM46139d4 = iVar.m46139d(fM46140e);
                            if (!Float.isNaN(fM46139d4) && fM46149n2 >= 0.0f && fM46139d2 >= 0.0f) {
                                if (iIntValue2 == 97) {
                                    fM46140e += f17;
                                    fM46139d4 += f18;
                                }
                                float f19 = fM46139d4;
                                boolean zBooleanValue = boolM46138c.booleanValue();
                                boolean zBooleanValue2 = boolM46138c2.booleanValue();
                                float f20 = fM46140e;
                                wVar.mo45897d(fM46149n2, fM46139d2, fM46139d3, zBooleanValue, zBooleanValue2, f20, f19);
                                f13 = f20;
                                fM46149n = f13;
                                f14 = f19;
                                fM46139d = f14;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fM46149n3 = iVar.m46149n();
                            float fM46139d5 = iVar.m46139d(fM46149n3);
                            float fM46139d6 = iVar.m46139d(fM46139d5);
                            float fM46139d7 = iVar.m46139d(fM46139d6);
                            float fM46139d8 = iVar.m46139d(fM46139d7);
                            float fM46139d9 = iVar.m46139d(fM46139d8);
                            if (!Float.isNaN(fM46139d9)) {
                                if (iIntValue2 == 99) {
                                    fM46139d8 += f13;
                                    fM46139d9 += f14;
                                    fM46149n3 += f13;
                                    fM46139d5 += f14;
                                    fM46139d6 += f13;
                                    fM46139d7 += f14;
                                }
                                float f21 = fM46149n3;
                                float f22 = fM46139d5;
                                f10 = fM46139d6;
                                fM46139d = fM46139d7;
                                f11 = fM46139d8;
                                f12 = fM46139d9;
                                wVar.mo45896c(f21, f22, f10, fM46139d, f11, f12);
                                fM46149n = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fM46149n4 = iVar.m46149n();
                            if (!Float.isNaN(fM46149n4)) {
                                if (iIntValue2 == 104) {
                                    fM46149n4 += f13;
                                }
                                f13 = fM46149n4;
                                wVar.mo45898e(f13, f14);
                                fM46149n = f13;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fM46149n5 = iVar.m46149n();
                            float fM46139d10 = iVar.m46139d(fM46149n5);
                            if (!Float.isNaN(fM46139d10)) {
                                if (iIntValue2 == 108) {
                                    fM46149n5 += f13;
                                    fM46139d10 += f14;
                                }
                                f13 = fM46149n5;
                                f14 = fM46139d10;
                                wVar.mo45898e(f13, f14);
                                fM46149n = f13;
                                fM46139d = f14;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fM46149n6 = iVar.m46149n();
                            float fM46139d11 = iVar.m46139d(fM46149n6);
                            if (!Float.isNaN(fM46139d11)) {
                                if (iIntValue2 == i10 && !wVar.m45902i()) {
                                    fM46149n6 += f13;
                                    fM46139d11 += f14;
                                }
                                f13 = fM46149n6;
                                f14 = fM46139d11;
                                wVar.mo45895b(f13, f14);
                                fM46149n = f13;
                                f15 = fM46149n;
                                fM46139d = f14;
                                f16 = fM46139d;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fM46149n = iVar.m46149n();
                            fM46139d = iVar.m46139d(fM46149n);
                            float fM46139d12 = iVar.m46139d(fM46139d);
                            float fM46139d13 = iVar.m46139d(fM46139d12);
                            if (!Float.isNaN(fM46139d13)) {
                                if (iIntValue2 == 113) {
                                    fM46139d12 += f13;
                                    fM46139d13 += f14;
                                    fM46149n += f13;
                                    fM46139d += f14;
                                }
                                f13 = fM46139d12;
                                f14 = fM46139d13;
                                wVar.mo45894a(fM46149n, fM46139d, f13, f14);
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fM46149n;
                            float f24 = (2.0f * f14) - fM46139d;
                            float fM46149n7 = iVar.m46149n();
                            float fM46139d14 = iVar.m46139d(fM46149n7);
                            float fM46139d15 = iVar.m46139d(fM46139d14);
                            float fM46139d16 = iVar.m46139d(fM46139d15);
                            if (!Float.isNaN(fM46139d16)) {
                                if (iIntValue2 == 115) {
                                    fM46139d15 += f13;
                                    fM46139d16 += f14;
                                    fM46149n7 += f13;
                                    fM46139d14 += f14;
                                }
                                f10 = fM46149n7;
                                fM46139d = fM46139d14;
                                f11 = fM46139d15;
                                f12 = fM46139d16;
                                wVar.mo45896c(f23, f24, f10, fM46139d, f11, f12);
                                fM46149n = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fM46149n = (f13 * 2.0f) - fM46149n;
                            fM46139d = (2.0f * f14) - fM46139d;
                            float fM46149n8 = iVar.m46149n();
                            float fM46139d17 = iVar.m46139d(fM46149n8);
                            if (!Float.isNaN(fM46139d17)) {
                                if (iIntValue2 == 116) {
                                    fM46149n8 += f13;
                                    fM46139d17 += f14;
                                }
                                f13 = fM46149n8;
                                f14 = fM46139d17;
                                wVar.mo45894a(fM46149n, fM46139d, f13, f14);
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fM46149n9 = iVar.m46149n();
                            if (!Float.isNaN(fM46149n9)) {
                                if (iIntValue2 == 118) {
                                    fM46149n9 += f14;
                                }
                                f14 = fM46149n9;
                                wVar.mo45898e(f13, f14);
                                fM46139d = f14;
                                iVar.m46161z();
                                if (iVar.m46143h()) {
                                    if (iVar.m46144i()) {
                                        iIntValue2 = iVar.m46147l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 90:
                        case 122:
                            wVar.close();
                            f13 = f15;
                            fM46149n = f13;
                            f14 = f16;
                            fM46139d = f14;
                            iVar.m46161z();
                            if (iVar.m46143h()) {
                                if (iVar.m46144i()) {
                                    iIntValue2 = iVar.m46147l().intValue();
                                }
                                i10 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return wVar;
                }
            }
        }
        return wVar;
    }

    /* JADX INFO: renamed from: v0 */
    public static C12317e m46056v0(String str) throws C12322j {
        C12317e.b bVar;
        i iVar = new i(str);
        iVar.m46135A();
        String strM46153r = iVar.m46153r();
        if ("defer".equals(strM46153r)) {
            iVar.m46135A();
            strM46153r = iVar.m46153r();
        }
        C12317e.a aVarM46129a = b.m46129a(strM46153r);
        iVar.m46135A();
        if (iVar.m46143h()) {
            bVar = null;
        } else {
            String strM46153r2 = iVar.m46153r();
            strM46153r2.getClass();
            if (strM46153r2.equals("meet")) {
                bVar = C12317e.b.meet;
            } else {
                if (!strM46153r2.equals("slice")) {
                    throw new C12322j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = C12317e.b.slice;
            }
        }
        return new C12317e(aVarM46129a, bVar);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m46057w0(C12319g.p0 p0Var, String str) {
        p0Var.f43923o = m46056v0(str);
    }

    /* JADX INFO: renamed from: y0 */
    public static C12319g.e0.e m46058y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return C12319g.e0.e.optimizeQuality;
            case "auto":
                return C12319g.e0.e.auto;
            case "optimizeSpeed":
                return C12319g.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static Set<String> m46059z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.m46143h()) {
            String strM46153r = iVar.m46153r();
            if (strM46153r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strM46153r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.m46135A();
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: A */
    public final void m46060A(C12319g.d dVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f43774o = m46047o0(strTrim);
                    break;
                case 13:
                    dVar.f43775p = m46047o0(strTrim);
                    break;
                case 14:
                    C12319g.p pVarM46047o0 = m46047o0(strTrim);
                    dVar.f43776q = pVarM46047o0;
                    if (pVarM46047o0.m45890i()) {
                        throw new C12322j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m46061B(C12319g.e eVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f43788p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new C12322j("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f43788p = Boolean.TRUE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m46062C(C12319g.g0 g0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g0Var.mo45876f(m46059z0(strTrim));
                    break;
                case 22:
                    g0Var.mo45880j(strTrim);
                    break;
                case 23:
                    g0Var.mo45878h(m46019F0(strTrim));
                    break;
                case 24:
                    g0Var.mo45879i(m46014A0(strTrim));
                    break;
                case 25:
                    List<String> listM46041i0 = m46041i0(strTrim);
                    g0Var.mo45875d(listM46041i0 != null ? new HashSet(listM46041i0) : new HashSet(0));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m46063D(C12319g.l0 l0Var, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f43903c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f43904d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l0Var.f43904d = Boolean.TRUE;
                        return;
                    }
                    throw new C12322j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m46064E(C12319g.i iVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    C12319g.p pVarM46047o0 = m46047o0(strTrim);
                    iVar.f43885q = pVarM46047o0;
                    if (pVarM46047o0.m45890i()) {
                        throw new C12322j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    C12319g.p pVarM46047o1 = m46047o0(strTrim);
                    iVar.f43886r = pVarM46047o1;
                    if (pVarM46047o1.m45890i()) {
                        throw new C12322j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f43883o = m46047o0(strTrim);
                    break;
                case 13:
                    iVar.f43884p = m46047o0(strTrim);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m46065F(C12319g.j jVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new C12322j("Invalid value for attribute gradientUnits");
                            }
                            jVar.f43893i = Boolean.TRUE;
                        } else {
                            jVar.f43893i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f43894j = m46070J0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f43895k = C12319g.k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C12322j("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                jVar.f43896l = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m46066G(C12319g.o oVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                oVar.f43916q = m46047o0(strTrim);
            } else if (i11 == 2) {
                oVar.f43917r = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                oVar.f43918s = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                oVar.f43919t = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    m46057w0(oVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                oVar.f43915p = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m46067H(C12319g.q qVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    qVar.f43924o = m46047o0(strTrim);
                    break;
                case 16:
                    qVar.f43925p = m46047o0(strTrim);
                    break;
                case 17:
                    qVar.f43926q = m46047o0(strTrim);
                    break;
                case 18:
                    qVar.f43927r = m46047o0(strTrim);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m46068I(C12319g.m0 m0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m0Var.f43909m = m46047o0(strTrim);
                    break;
                case 16:
                    m0Var.f43910n = m46047o0(strTrim);
                    break;
                case 17:
                    m0Var.f43911o = m46047o0(strTrim);
                    break;
                case 18:
                    m0Var.f43912p = m46047o0(strTrim);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m46069J(C12319g.r rVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    rVar.f43934r = m46047o0(strTrim);
                    break;
                case 27:
                    rVar.f43935s = m46047o0(strTrim);
                    break;
                case 28:
                    C12319g.p pVarM46047o0 = m46047o0(strTrim);
                    rVar.f43936t = pVarM46047o0;
                    if (pVarM46047o0.m45890i()) {
                        throw new C12322j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    C12319g.p pVarM46047o1 = m46047o0(strTrim);
                    rVar.f43937u = pVarM46047o1;
                    if (pVarM46047o1.m45890i()) {
                        throw new C12322j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new C12322j("Invalid value for attribute markerUnits");
                        }
                        rVar.f43933q = true;
                    } else {
                        rVar.f43933q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        rVar.f43938v = Float.valueOf(Float.NaN);
                    } else {
                        rVar.f43938v = Float.valueOf(m46037f0(strTrim));
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final Matrix m46070J0(String str) throws C12322j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.m46135A();
        while (!iVar.m46143h()) {
            String strM46150o = iVar.m46150o();
            if (strM46150o == null) {
                throw new C12322j("Bad transform function encountered in transform list: " + str);
            }
            switch (strM46150o) {
                case "matrix":
                    iVar.m46135A();
                    float fM46149n = iVar.m46149n();
                    iVar.m46161z();
                    float fM46149n2 = iVar.m46149n();
                    iVar.m46161z();
                    float fM46149n3 = iVar.m46149n();
                    iVar.m46161z();
                    float fM46149n4 = iVar.m46149n();
                    iVar.m46161z();
                    float fM46149n5 = iVar.m46149n();
                    iVar.m46161z();
                    float fM46149n6 = iVar.m46149n();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n6) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM46149n, fM46149n3, fM46149n5, fM46149n2, fM46149n4, fM46149n6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.m46135A();
                    float fM46149n7 = iVar.m46149n();
                    float fM46159x = iVar.m46159x();
                    float fM46159x2 = iVar.m46159x();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n7) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fM46159x)) {
                        matrix.preRotate(fM46149n7);
                    } else {
                        if (Float.isNaN(fM46159x2)) {
                            throw new C12322j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fM46149n7, fM46159x, fM46159x2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.m46135A();
                    float fM46149n8 = iVar.m46149n();
                    float fM46159x3 = iVar.m46159x();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n8) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fM46159x3)) {
                        matrix.preScale(fM46149n8, fM46159x3);
                    } else {
                        matrix.preScale(fM46149n8, fM46149n8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.m46135A();
                    float fM46149n9 = iVar.m46149n();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n9) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM46149n9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.m46135A();
                    float fM46149n10 = iVar.m46149n();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n10) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM46149n10)));
                    break;
                    break;
                case "translate":
                    iVar.m46135A();
                    float fM46149n11 = iVar.m46149n();
                    float fM46159x4 = iVar.m46159x();
                    iVar.m46135A();
                    if (Float.isNaN(fM46149n11) || !iVar.m46141f(')')) {
                        throw new C12322j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fM46159x4)) {
                        matrix.preTranslate(fM46149n11, fM46159x4);
                    } else {
                        matrix.preTranslate(fM46149n11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C12322j("Invalid transform list fn: " + strM46150o + ")");
            }
            if (iVar.m46143h()) {
                return matrix;
            }
            iVar.m46161z();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: K */
    public final void m46071K(C12319g.s sVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                sVar.f43942q = m46047o0(strTrim);
            } else if (i11 == 2) {
                sVar.f43943r = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                sVar.f43944s = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                sVar.f43945t = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    sVar.f43941p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new C12322j("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f43941p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                sVar.f43940o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C12322j("Invalid value for attribute maskUnits");
                }
                sVar.f43940o = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m46072K0(InputStream inputStream) throws C12322j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new C12322j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new C12322j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new C12322j("SVG parse error", e12);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m46073L(C12319g.v vVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                vVar.f43950o = m46055u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(m46037f0(strTrim));
                vVar.f43951p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new C12322j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m46074L0(InputStream inputStream, boolean z10) throws C12322j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        m46093W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        m46121r(iVar.m46153r(), m46126x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f44026a.m45852m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                m46072K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        m46095X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m46119p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m46104e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m46102c1(xmlPullParserNewPullParser.getText());
                    }
                }
                m46118o();
            } catch (IOException e10) {
                throw new C12322j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new C12322j("XML parser problem", e11);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m46075M(C12319g.y yVar, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                yVar.f43961t = m46047o0(strTrim);
            } else if (i11 == 2) {
                yVar.f43962u = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                yVar.f43963v = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                yVar.f43964w = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new C12322j("Invalid value for attribute patternUnits");
                            }
                            yVar.f43958q = Boolean.TRUE;
                        } else {
                            yVar.f43958q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new C12322j("Invalid value for attribute patternContentUnits");
                            }
                            yVar.f43959r = Boolean.TRUE;
                        } else {
                            yVar.f43959r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        yVar.f43960s = m46070J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                yVar.f43965x = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m46076N(C12319g.z zVar, Attributes attributes, String str) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.m46133a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.m46135A();
                while (!iVar.m46143h()) {
                    float fM46149n = iVar.m46149n();
                    if (Float.isNaN(fM46149n)) {
                        throw new C12322j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.m46161z();
                    float fM46149n2 = iVar.m46149n();
                    if (Float.isNaN(fM46149n2)) {
                        throw new C12322j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.m46161z();
                    arrayList.add(Float.valueOf(fM46149n));
                    arrayList.add(Float.valueOf(fM46149n2));
                }
                zVar.f43966o = new float[arrayList.size()];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    zVar.f43966o[i11] = ((Float) obj).floatValue();
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m46077O(C12319g.q0 q0Var, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q0Var.f43931p = m46047o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q0Var.f43928m = m46047o0(strTrim);
                        break;
                    case 13:
                        q0Var.f43929n = m46047o0(strTrim);
                        break;
                    case 14:
                        C12319g.p pVarM46047o0 = m46047o0(strTrim);
                        q0Var.f43930o = pVarM46047o0;
                        if (pVarM46047o0.m45890i()) {
                            throw new C12322j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q0Var.f43932q = m46047o0(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m46078O0(Attributes attributes) throws C12322j {
        m46114l("<path>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.v vVar = new C12319g.v();
        vVar.f43913a = this.f44026a;
        vVar.f43914b = this.f44027b;
        m46063D(vVar, attributes);
        m46085S(vVar, attributes);
        m46092W(vVar, attributes);
        m46062C(vVar, attributes);
        m46073L(vVar, attributes);
        this.f44027b.mo45868a(vVar);
    }

    /* JADX INFO: renamed from: P */
    public final void m46079P(C12319g.b0 b0Var, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b0Var.f43762o = m46047o0(strTrim);
            } else if (i11 == 2) {
                b0Var.f43763p = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                b0Var.f43764q = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                b0Var.f43765r = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                C12319g.p pVarM46047o2 = m46047o0(strTrim);
                b0Var.f43766s = pVarM46047o2;
                if (pVarM46047o2.m45890i()) {
                    throw new C12322j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                C12319g.p pVarM46047o3 = m46047o0(strTrim);
                b0Var.f43767t = pVarM46047o3;
                if (pVarM46047o3.m45890i()) {
                    throw new C12322j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m46080P0(Attributes attributes) throws C12322j {
        m46114l("<pattern>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.y yVar = new C12319g.y();
        yVar.f43913a = this.f44026a;
        yVar.f43914b = this.f44027b;
        m46063D(yVar, attributes);
        m46085S(yVar, attributes);
        m46062C(yVar, attributes);
        m46096Y(yVar, attributes);
        m46075M(yVar, attributes);
        this.f44027b.mo45868a(yVar);
        this.f44027b = yVar;
    }

    /* JADX INFO: renamed from: Q */
    public final void m46081Q(C12319g.f0 f0Var, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f0Var.f43871q = m46047o0(strTrim);
            } else if (i11 == 2) {
                f0Var.f43872r = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                f0Var.f43873s = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                f0Var.f43874t = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f0Var.f43875u = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m46082Q0(Attributes attributes) throws C12322j {
        m46114l("<polygon>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.z a0Var = new C12319g.a0();
        a0Var.f43913a = this.f44026a;
        a0Var.f43914b = this.f44027b;
        m46063D(a0Var, attributes);
        m46085S(a0Var, attributes);
        m46092W(a0Var, attributes);
        m46062C(a0Var, attributes);
        m46076N(a0Var, attributes, "polygon");
        this.f44027b.mo45868a(a0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m46083R(C12319g.d0 d0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d0Var.f43777h = m46117n0(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m46084R0(Attributes attributes) throws C12322j {
        m46114l("<polyline>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.z zVar = new C12319g.z();
        zVar.f43913a = this.f44026a;
        zVar.f43914b = this.f44027b;
        m46063D(zVar, attributes);
        m46085S(zVar, attributes);
        m46092W(zVar, attributes);
        m46062C(zVar, attributes);
        m46076N(zVar, attributes, "polyline");
        this.f44027b.mo45868a(zVar);
    }

    /* JADX INFO: renamed from: S */
    public final void m46085S(C12319g.l0 l0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    m46018E0(l0Var, strTrim);
                } else if (i11 != 46) {
                    if (l0Var.f43905e == null) {
                        l0Var.f43905e = new C12319g.e0();
                    }
                    m46025S0(l0Var.f43905e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l0Var.f43907g = C12314b.m45778f(strTrim);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m46086T(C12319g.u0 u0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u0Var.f43948o = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m46087T0(Attributes attributes) throws C12322j {
        m46114l("<radialGradient>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.q0 q0Var = new C12319g.q0();
        q0Var.f43913a = this.f44026a;
        q0Var.f43914b = this.f44027b;
        m46063D(q0Var, attributes);
        m46085S(q0Var, attributes);
        m46065F(q0Var, attributes);
        m46077O(q0Var, attributes);
        this.f44027b.mo45868a(q0Var);
        this.f44027b = q0Var;
    }

    /* JADX INFO: renamed from: U */
    public final void m46088U(C12319g.z0 z0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z0Var.f43968p = m46047o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z0Var.f43967o = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m46089U0(Attributes attributes) throws C12322j {
        m46114l("<rect>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.b0 b0Var = new C12319g.b0();
        b0Var.f43913a = this.f44026a;
        b0Var.f43914b = this.f44027b;
        m46063D(b0Var, attributes);
        m46085S(b0Var, attributes);
        m46092W(b0Var, attributes);
        m46062C(b0Var, attributes);
        m46079P(b0Var, attributes);
        this.f44027b.mo45868a(b0Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m46090V(C12319g.a1 a1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a1Var.f43754o = m46048p0(strTrim);
            } else if (i11 == 2) {
                a1Var.f43755p = m46048p0(strTrim);
            } else if (i11 == 19) {
                a1Var.f43756q = m46048p0(strTrim);
            } else if (i11 == 20) {
                a1Var.f43757r = m46048p0(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m46091V0(Attributes attributes) throws C12322j {
        m46114l("<solidColor>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.c0 c0Var = new C12319g.c0();
        c0Var.f43913a = this.f44026a;
        c0Var.f43914b = this.f44027b;
        m46063D(c0Var, attributes);
        m46085S(c0Var, attributes);
        this.f44027b.mo45868a(c0Var);
        this.f44027b = c0Var;
    }

    /* JADX INFO: renamed from: W */
    public final void m46092W(C12319g.n nVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.m46133a(attributes.getLocalName(i10)) == g.transform) {
                nVar.mo45883k(m46070J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m46093W0() {
        this.f44026a = new C12319g();
    }

    /* JADX INFO: renamed from: X */
    public final void m46094X(C12319g.e1 e1Var, Attributes attributes) throws C12322j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e1Var.f43864q = m46047o0(strTrim);
            } else if (i11 == 2) {
                e1Var.f43865r = m46047o0(strTrim);
            } else if (i11 == 3) {
                C12319g.p pVarM46047o0 = m46047o0(strTrim);
                e1Var.f43866s = pVarM46047o0;
                if (pVarM46047o0.m45890i()) {
                    throw new C12322j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                C12319g.p pVarM46047o1 = m46047o0(strTrim);
                e1Var.f43867t = pVarM46047o1;
                if (pVarM46047o1.m45890i()) {
                    throw new C12322j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e1Var.f43863p = strTrim;
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m46095X0(String str, String str2, String str3, Attributes attributes) throws C12322j {
        if (this.f44028c) {
            this.f44029d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarM46134a = h.m46134a(str2);
            switch (a.f44035a[hVarM46134a.ordinal()]) {
                case 1:
                    m46100a1(attributes);
                    break;
                case 2:
                case 3:
                    m46120q(attributes);
                    break;
                case 4:
                    m46115m(attributes);
                    break;
                case 5:
                    m46110i1(attributes);
                    break;
                case 6:
                    m46078O0(attributes);
                    break;
                case 7:
                    m46089U0(attributes);
                    break;
                case 8:
                    m46109i(attributes);
                    break;
                case 9:
                    m46116n(attributes);
                    break;
                case 10:
                    m46123v(attributes);
                    break;
                case 11:
                    m46084R0(attributes);
                    break;
                case 12:
                    m46082Q0(attributes);
                    break;
                case 13:
                    m46103d1(attributes);
                    break;
                case 14:
                    m46108h1(attributes);
                    break;
                case 15:
                    m46106g1(attributes);
                    break;
                case 16:
                    m46113k1(attributes);
                    break;
                case 17:
                    m46101b1(attributes);
                    break;
                case 18:
                    m46125x(attributes);
                    break;
                case 19:
                    m46124w(attributes);
                    break;
                case 20:
                    m46087T0(attributes);
                    break;
                case 21:
                    m46097Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f44030e = true;
                    this.f44031f = hVarM46134a;
                    break;
                case 24:
                    m46112k(attributes);
                    break;
                case 25:
                    m46105f1(attributes);
                    break;
                case 26:
                    m46080P0(attributes);
                    break;
                case 27:
                    m46122u(attributes);
                    break;
                case 28:
                    m46111j1(attributes);
                    break;
                case 29:
                    m46127y(attributes);
                    break;
                case 30:
                    m46099Z0(attributes);
                    break;
                case 31:
                    m46091V0(attributes);
                    break;
                default:
                    this.f44028c = true;
                    this.f44029d = 1;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m46096Y(C12319g.r0 r0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                m46057w0(r0Var, strTrim);
            } else if (i11 == 87) {
                r0Var.f43939p = m46024N0(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m46097Y0(Attributes attributes) throws C12322j {
        m46114l("<stop>", new Object[0]);
        C12319g.j0 j0Var = this.f44027b;
        if (j0Var == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof C12319g.j)) {
            throw new C12322j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        C12319g.d0 d0Var = new C12319g.d0();
        d0Var.f43913a = this.f44026a;
        d0Var.f43914b = this.f44027b;
        m46063D(d0Var, attributes);
        m46085S(d0Var, attributes);
        m46083R(d0Var, attributes);
        this.f44027b.mo45868a(d0Var);
        this.f44027b = d0Var;
    }

    /* JADX INFO: renamed from: Z */
    public final void m46098Z(String str) {
        this.f44026a.m45842a(new C12314b(C12314b.f.screen, C12314b.u.Document).m45785d(str));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m46099Z0(Attributes attributes) throws C12322j {
        m46114l("<style>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f44036b[g.m46133a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && C12314b.m45776b(str, C12314b.f.screen)) {
            this.f44033h = true;
        } else {
            this.f44028c = true;
            this.f44029d = 1;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m46100a1(Attributes attributes) throws C12322j {
        m46114l("<svg>", new Object[0]);
        C12319g.f0 f0Var = new C12319g.f0();
        f0Var.f43913a = this.f44026a;
        f0Var.f43914b = this.f44027b;
        m46063D(f0Var, attributes);
        m46085S(f0Var, attributes);
        m46062C(f0Var, attributes);
        m46096Y(f0Var, attributes);
        m46081Q(f0Var, attributes);
        C12319g.j0 j0Var = this.f44027b;
        if (j0Var == null) {
            this.f44026a.m45860u(f0Var);
        } else {
            j0Var.mo45868a(f0Var);
        }
        this.f44027b = f0Var;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m46101b1(Attributes attributes) throws C12322j {
        m46114l("<symbol>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.r0 t0Var = new C12319g.t0();
        t0Var.f43913a = this.f44026a;
        t0Var.f43914b = this.f44027b;
        m46063D(t0Var, attributes);
        m46085S(t0Var, attributes);
        m46062C(t0Var, attributes);
        m46096Y(t0Var, attributes);
        this.f44027b.mo45868a(t0Var);
        this.f44027b = t0Var;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m46102c1(String str) {
        if (this.f44028c) {
            return;
        }
        if (this.f44030e) {
            if (this.f44032g == null) {
                this.f44032g = new StringBuilder(str.length());
            }
            this.f44032g.append(str);
        } else if (this.f44033h) {
            if (this.f44034i == null) {
                this.f44034i = new StringBuilder(str.length());
            }
            this.f44034i.append(str);
        } else if (this.f44027b instanceof C12319g.y0) {
            m46107h(str);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m46103d1(Attributes attributes) throws C12322j {
        m46114l("<text>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.w0 w0Var = new C12319g.w0();
        w0Var.f43913a = this.f44026a;
        w0Var.f43914b = this.f44027b;
        m46063D(w0Var, attributes);
        m46085S(w0Var, attributes);
        m46092W(w0Var, attributes);
        m46062C(w0Var, attributes);
        m46090V(w0Var, attributes);
        this.f44027b.mo45868a(w0Var);
        this.f44027b = w0Var;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m46104e1(char[] cArr, int i10, int i11) {
        if (this.f44028c) {
            return;
        }
        if (this.f44030e) {
            if (this.f44032g == null) {
                this.f44032g = new StringBuilder(i11);
            }
            this.f44032g.append(cArr, i10, i11);
        } else if (this.f44033h) {
            if (this.f44034i == null) {
                this.f44034i = new StringBuilder(i11);
            }
            this.f44034i.append(cArr, i10, i11);
        } else if (this.f44027b instanceof C12319g.y0) {
            m46107h(new String(cArr, i10, i11));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m46105f1(Attributes attributes) throws C12322j {
        m46114l("<textPath>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.z0 z0Var = new C12319g.z0();
        z0Var.f43913a = this.f44026a;
        z0Var.f43914b = this.f44027b;
        m46063D(z0Var, attributes);
        m46085S(z0Var, attributes);
        m46062C(z0Var, attributes);
        m46088U(z0Var, attributes);
        this.f44027b.mo45868a(z0Var);
        this.f44027b = z0Var;
        C12319g.j0 j0Var = z0Var.f43914b;
        if (j0Var instanceof C12319g.b1) {
            z0Var.m45903o((C12319g.b1) j0Var);
        } else {
            z0Var.m45903o(((C12319g.x0) j0Var).mo45869e());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m46106g1(Attributes attributes) throws C12322j {
        m46114l("<tref>", new Object[0]);
        C12319g.j0 j0Var = this.f44027b;
        if (j0Var == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof C12319g.y0)) {
            throw new C12322j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        C12319g.u0 u0Var = new C12319g.u0();
        u0Var.f43913a = this.f44026a;
        u0Var.f43914b = this.f44027b;
        m46063D(u0Var, attributes);
        m46085S(u0Var, attributes);
        m46062C(u0Var, attributes);
        m46086T(u0Var, attributes);
        this.f44027b.mo45868a(u0Var);
        C12319g.j0 j0Var2 = u0Var.f43914b;
        if (j0Var2 instanceof C12319g.b1) {
            u0Var.m45892o((C12319g.b1) j0Var2);
        } else {
            u0Var.m45892o(((C12319g.x0) j0Var2).mo45869e());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46107h(String str) {
        C12319g.h0 h0Var = (C12319g.h0) this.f44027b;
        int size = h0Var.f43877i.size();
        C12319g.n0 n0Var = size == 0 ? null : h0Var.f43877i.get(size - 1);
        if (!(n0Var instanceof C12319g.c1)) {
            this.f44027b.mo45868a(new C12319g.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        C12319g.c1 c1Var = (C12319g.c1) n0Var;
        sb2.append(c1Var.f43772c);
        sb2.append(str);
        c1Var.f43772c = sb2.toString();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m46108h1(Attributes attributes) throws C12322j {
        m46114l("<tspan>", new Object[0]);
        C12319g.j0 j0Var = this.f44027b;
        if (j0Var == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof C12319g.y0)) {
            throw new C12322j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        C12319g.v0 v0Var = new C12319g.v0();
        v0Var.f43913a = this.f44026a;
        v0Var.f43914b = this.f44027b;
        m46063D(v0Var, attributes);
        m46085S(v0Var, attributes);
        m46062C(v0Var, attributes);
        m46090V(v0Var, attributes);
        this.f44027b.mo45868a(v0Var);
        this.f44027b = v0Var;
        C12319g.j0 j0Var2 = v0Var.f43914b;
        if (j0Var2 instanceof C12319g.b1) {
            v0Var.m45893o((C12319g.b1) j0Var2);
        } else {
            v0Var.m45893o(((C12319g.x0) j0Var2).mo45869e());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m46109i(Attributes attributes) throws C12322j {
        m46114l("<circle>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.d dVar = new C12319g.d();
        dVar.f43913a = this.f44026a;
        dVar.f43914b = this.f44027b;
        m46063D(dVar, attributes);
        m46085S(dVar, attributes);
        m46092W(dVar, attributes);
        m46062C(dVar, attributes);
        m46060A(dVar, attributes);
        this.f44027b.mo45868a(dVar);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m46110i1(Attributes attributes) throws C12322j {
        m46114l("<use>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.e1 e1Var = new C12319g.e1();
        e1Var.f43913a = this.f44026a;
        e1Var.f43914b = this.f44027b;
        m46063D(e1Var, attributes);
        m46085S(e1Var, attributes);
        m46092W(e1Var, attributes);
        m46062C(e1Var, attributes);
        m46094X(e1Var, attributes);
        this.f44027b.mo45868a(e1Var);
        this.f44027b = e1Var;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m46111j1(Attributes attributes) throws C12322j {
        m46114l("<view>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.r0 f1Var = new C12319g.f1();
        f1Var.f43913a = this.f44026a;
        f1Var.f43914b = this.f44027b;
        m46063D(f1Var, attributes);
        m46062C(f1Var, attributes);
        m46096Y(f1Var, attributes);
        this.f44027b.mo45868a(f1Var);
        this.f44027b = f1Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m46112k(Attributes attributes) throws C12322j {
        m46114l("<clipPath>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.e eVar = new C12319g.e();
        eVar.f43913a = this.f44026a;
        eVar.f43914b = this.f44027b;
        m46063D(eVar, attributes);
        m46085S(eVar, attributes);
        m46092W(eVar, attributes);
        m46062C(eVar, attributes);
        m46061B(eVar, attributes);
        this.f44027b.mo45868a(eVar);
        this.f44027b = eVar;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m46113k1(Attributes attributes) throws C12322j {
        m46114l("<switch>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.s0 s0Var = new C12319g.s0();
        s0Var.f43913a = this.f44026a;
        s0Var.f43914b = this.f44027b;
        m46063D(s0Var, attributes);
        m46085S(s0Var, attributes);
        m46092W(s0Var, attributes);
        m46062C(s0Var, attributes);
        this.f44027b.mo45868a(s0Var);
        this.f44027b = s0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m46114l(String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: m */
    public final void m46115m(Attributes attributes) throws C12322j {
        m46114l("<defs>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.h hVar = new C12319g.h();
        hVar.f43913a = this.f44026a;
        hVar.f43914b = this.f44027b;
        m46063D(hVar, attributes);
        m46085S(hVar, attributes);
        m46092W(hVar, attributes);
        this.f44027b.mo45868a(hVar);
        this.f44027b = hVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m46116n(Attributes attributes) throws C12322j {
        m46114l("<ellipse>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.i iVar = new C12319g.i();
        iVar.f43913a = this.f44026a;
        iVar.f43914b = this.f44027b;
        m46063D(iVar, attributes);
        m46085S(iVar, attributes);
        m46092W(iVar, attributes);
        m46062C(iVar, attributes);
        m46064E(iVar, attributes);
        this.f44027b.mo45868a(iVar);
    }

    /* JADX INFO: renamed from: n0 */
    public final Float m46117n0(String str) throws C12322j {
        if (str.length() == 0) {
            throw new C12322j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fM46039g0 = m46039g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fM46039g0 /= 100.0f;
            }
            if (fM46039g0 < 0.0f) {
                f10 = 0.0f;
            } else if (fM46039g0 <= 100.0f) {
                f10 = fM46039g0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new C12322j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m46118o() {
    }

    /* JADX INFO: renamed from: p */
    public final void m46119p(String str, String str2, String str3) {
        if (this.f44028c) {
            int i10 = this.f44029d - 1;
            this.f44029d = i10;
            if (i10 == 0) {
                this.f44028c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f44035a[h.m46134a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f44030e = false;
                        StringBuilder sb2 = this.f44032g;
                        if (sb2 != null) {
                            h hVar = this.f44031f;
                            if (hVar == h.title) {
                                this.f44026a.m45861v(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f44026a.m45856q(sb2.toString());
                            }
                            this.f44032g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f44034i;
                        if (sb3 != null) {
                            this.f44033h = false;
                            m46098Z(sb3.toString());
                            this.f44034i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f44027b = ((C12319g.n0) this.f44027b).f43914b;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m46120q(Attributes attributes) throws C12322j {
        m46114l("<g>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.m mVar = new C12319g.m();
        mVar.f43913a = this.f44026a;
        mVar.f43914b = this.f44027b;
        m46063D(mVar, attributes);
        m46085S(mVar, attributes);
        m46092W(mVar, attributes);
        m46062C(mVar, attributes);
        this.f44027b.mo45868a(mVar);
        this.f44027b = mVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m46121r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            C12319g.m45840k();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46122u(Attributes attributes) throws C12322j {
        m46114l("<image>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.o oVar = new C12319g.o();
        oVar.f43913a = this.f44026a;
        oVar.f43914b = this.f44027b;
        m46063D(oVar, attributes);
        m46085S(oVar, attributes);
        m46092W(oVar, attributes);
        m46062C(oVar, attributes);
        m46066G(oVar, attributes);
        this.f44027b.mo45868a(oVar);
        this.f44027b = oVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m46123v(Attributes attributes) throws C12322j {
        m46114l("<line>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.q qVar = new C12319g.q();
        qVar.f43913a = this.f44026a;
        qVar.f43914b = this.f44027b;
        m46063D(qVar, attributes);
        m46085S(qVar, attributes);
        m46092W(qVar, attributes);
        m46062C(qVar, attributes);
        m46067H(qVar, attributes);
        this.f44027b.mo45868a(qVar);
    }

    /* JADX INFO: renamed from: w */
    public final void m46124w(Attributes attributes) throws C12322j {
        m46114l("<linearGradient>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.m0 m0Var = new C12319g.m0();
        m0Var.f43913a = this.f44026a;
        m0Var.f43914b = this.f44027b;
        m46063D(m0Var, attributes);
        m46085S(m0Var, attributes);
        m46065F(m0Var, attributes);
        m46068I(m0Var, attributes);
        this.f44027b.mo45868a(m0Var);
        this.f44027b = m0Var;
    }

    /* JADX INFO: renamed from: x */
    public final void m46125x(Attributes attributes) throws C12322j {
        m46114l("<marker>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.r rVar = new C12319g.r();
        rVar.f43913a = this.f44026a;
        rVar.f43914b = this.f44027b;
        m46063D(rVar, attributes);
        m46085S(rVar, attributes);
        m46062C(rVar, attributes);
        m46096Y(rVar, attributes);
        m46069J(rVar, attributes);
        this.f44027b.mo45868a(rVar);
        this.f44027b = rVar;
    }

    /* JADX INFO: renamed from: x0 */
    public final Map<String, String> m46126x0(i iVar) {
        HashMap map = new HashMap();
        iVar.m46135A();
        String strM46154s = iVar.m46154s('=');
        while (strM46154s != null) {
            iVar.m46141f('=');
            map.put(strM46154s, iVar.m46152q());
            iVar.m46135A();
            strM46154s = iVar.m46154s('=');
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    public final void m46127y(Attributes attributes) throws C12322j {
        m46114l("<mask>", new Object[0]);
        if (this.f44027b == null) {
            throw new C12322j("Invalid document. Root element must be <svg>");
        }
        C12319g.s sVar = new C12319g.s();
        sVar.f43913a = this.f44026a;
        sVar.f43914b = this.f44027b;
        m46063D(sVar, attributes);
        m46085S(sVar, attributes);
        m46062C(sVar, attributes);
        m46071K(sVar, attributes);
        this.f44027b.mo45868a(sVar);
        this.f44027b = sVar;
    }

    /* JADX INFO: renamed from: z */
    public C12319g m46128z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m46074L0(inputStream, z10);
            return this.f44026a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
