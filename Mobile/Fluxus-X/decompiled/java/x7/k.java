package x7;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
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
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36534d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x7.g f36532a = null;
    public x7.g.j0 b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36533c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36535e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f36536f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f36537g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36538h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f36539i = null;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36540a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f36540a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f36540a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f36540a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f36540a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f36540a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f36540a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f36540a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f36540a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f36540a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f36540a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f36540a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f36540a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f36540a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f36540a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f36540a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f36540a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f36540a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f36540a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f36540a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f36540a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f36540a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f36540a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f36540a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f36540a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f36540a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f36540a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f36540a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f36540a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f36540a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f36540a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f36540a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, x7.e.a> f36541a;

        static {
            HashMap map = new HashMap(10);
            f36541a = map;
            map.put(PayloadNotificationChannel.SOUND_NONE, x7.e.a.none);
            map.put("xMinYMin", x7.e.a.xMinYMin);
            map.put("xMidYMin", x7.e.a.xMidYMin);
            map.put("xMaxYMin", x7.e.a.xMaxYMin);
            map.put("xMinYMid", x7.e.a.xMinYMid);
            map.put("xMidYMid", x7.e.a.xMidYMid);
            map.put("xMaxYMid", x7.e.a.xMaxYMid);
            map.put("xMinYMax", x7.e.a.xMinYMax);
            map.put("xMidYMax", x7.e.a.xMidYMax);
            map.put("xMaxYMax", x7.e.a.xMaxYMax);
        }

        public static x7.e.a a(String str) {
            return f36541a.get(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f36542a;

        static {
            HashMap map = new HashMap(47);
            f36542a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
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
            map.put("red", -65536);
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
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        public static Integer a(String str) {
            return f36542a.get(str);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, x7.g.p> f36543a;

        static {
            HashMap map = new HashMap(9);
            f36543a = map;
            x7.g.d1 d1Var = x7.g.d1.pt;
            map.put("xx-small", new x7.g.p(0.694f, d1Var));
            map.put("x-small", new x7.g.p(0.833f, d1Var));
            map.put("small", new x7.g.p(10.0f, d1Var));
            map.put("medium", new x7.g.p(12.0f, d1Var));
            map.put("large", new x7.g.p(14.4f, d1Var));
            map.put("x-large", new x7.g.p(17.3f, d1Var));
            map.put("xx-large", new x7.g.p(20.7f, d1Var));
            x7.g.d1 d1Var2 = x7.g.d1.percent;
            map.put("smaller", new x7.g.p(83.33f, d1Var2));
            map.put("larger", new x7.g.p(120.0f, d1Var2));
        }

        public static x7.g.p a(String str) {
            return f36543a.get(str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f36544a;

        static {
            HashMap map = new HashMap(13);
            f36544a = map;
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

        public static Integer a(String str) {
            return f36544a.get(str);
        }
    }

    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws x7.j {
            k.this.X0(str, str2, str3, attributes);
        }

        public /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

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

        public static final Map<String, g> O0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    O0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    O0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = O0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

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

        public static final Map<String, h> G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    G.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36622a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36623c;
        public int b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public x7.d f36624d = new x7.d();

        public i(String str) {
            this.f36623c = 0;
            String strTrim = str.trim();
            this.f36622a = strTrim;
            this.f36623c = strTrim.length();
        }

        public void A() {
            while (true) {
                int i10 = this.b;
                if (i10 >= this.f36623c || !k(this.f36622a.charAt(i10))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        public int a() {
            int i10 = this.b;
            int i11 = this.f36623c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.b = i12;
            if (i12 < i11) {
                return this.f36622a.charAt(i12);
            }
            return -1;
        }

        public String b() {
            int i10 = this.b;
            while (!h() && !k(this.f36622a.charAt(this.b))) {
                this.b++;
            }
            String strSubstring = this.f36622a.substring(i10, this.b);
            this.b = i10;
            return strSubstring;
        }

        public Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        public float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean f(char c10) {
            int i10 = this.b;
            boolean z10 = i10 < this.f36623c && this.f36622a.charAt(i10) == c10;
            if (z10) {
                this.b++;
            }
            return z10;
        }

        public boolean g(String str) {
            int length = str.length();
            int i10 = this.b;
            boolean z10 = i10 <= this.f36623c - length && this.f36622a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.b += length;
            }
            return z10;
        }

        public boolean h() {
            return this.b == this.f36623c;
        }

        public boolean i() {
            int i10 = this.b;
            if (i10 == this.f36623c) {
                return false;
            }
            char cCharAt = this.f36622a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        public boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        public boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        public Integer l() {
            int i10 = this.b;
            if (i10 == this.f36623c) {
                return null;
            }
            String str = this.f36622a;
            this.b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        public Boolean m() {
            int i10 = this.b;
            if (i10 == this.f36623c) {
                return null;
            }
            char cCharAt = this.f36622a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public float n() {
            float fB = this.f36624d.b(this.f36622a, this.b, this.f36623c);
            if (!Float.isNaN(fB)) {
                this.b = this.f36624d.a();
            }
            return fB;
        }

        public String o() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            int iCharAt = this.f36622a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.b++;
                return this.f36622a.substring(i10, i11);
            }
            this.b = i10;
            return null;
        }

        public x7.g.p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            x7.g.d1 d1VarV = v();
            return d1VarV == null ? new x7.g.p(fN, x7.g.d1.px) : new x7.g.p(fN, d1VarV);
        }

        public String q() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            char cCharAt = this.f36622a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.b = i10;
                return null;
            }
            int i11 = this.b;
            this.b = i11 + 1;
            return this.f36622a.substring(i10 + 1, i11);
        }

        public String r() {
            return t(' ', false);
        }

        public String s(char c10) {
            return t(c10, false);
        }

        public String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f36622a.charAt(this.b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f36622a.substring(i10, this.b);
        }

        public String u(char c10) {
            return t(c10, true);
        }

        public x7.g.d1 v() {
            if (h()) {
                return null;
            }
            if (this.f36622a.charAt(this.b) == '%') {
                this.b++;
                return x7.g.d1.percent;
            }
            int i10 = this.b;
            if (i10 > this.f36623c - 2) {
                return null;
            }
            try {
                x7.g.d1 d1VarValueOf = x7.g.d1.valueOf(this.f36622a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String w() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            char cCharAt = this.f36622a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f36622a.substring(i10, this.b);
        }

        public float x() {
            z();
            float fB = this.f36624d.b(this.f36622a, this.b, this.f36623c);
            if (!Float.isNaN(fB)) {
                this.b = this.f36624d.a();
            }
            return fB;
        }

        public String y() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            this.b = this.f36623c;
            return this.f36622a.substring(i10);
        }

        public boolean z() {
            A();
            int i10 = this.b;
            if (i10 == this.f36623c || this.f36622a.charAt(i10) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    public class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public XmlPullParser f36625a;

        public j(XmlPullParser xmlPullParser) {
            this.f36625a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f36625a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f36625a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f36625a.getAttributeName(i10);
            if (this.f36625a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f36625a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f36625a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f36625a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

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

    public static Set<String> A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    public static x7.g.p[] B0(String str) {
        x7.g.p pVarP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (pVarP = iVar.p()) == null || pVarP.k()) {
            return null;
        }
        float fA = pVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVarP);
        while (!iVar.h()) {
            iVar.z();
            x7.g.p pVarP2 = iVar.p();
            if (pVarP2 == null || pVarP2.k()) {
                return null;
            }
            arrayList.add(pVarP2);
            fA += pVarP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (x7.g.p[]) arrayList.toArray(new x7.g.p[arrayList.size()]);
    }

    public static x7.g.e0.c C0(String str) {
        if ("butt".equals(str)) {
            return x7.g.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return x7.g.e0.c.Round;
        }
        if ("square".equals(str)) {
            return x7.g.e0.c.Square;
        }
        return null;
    }

    public static x7.g.e0.d D0(String str) {
        if ("miter".equals(str)) {
            return x7.g.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return x7.g.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return x7.g.e0.d.Bevel;
        }
        return null;
    }

    public static void E0(x7.g.l0 l0Var, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", BuildConfig.FLAVOR));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l0Var.f36426f == null) {
                    l0Var.f36426f = new x7.g.e0();
                }
                S0(l0Var.f36426f, strS, strU);
                iVar.A();
            }
        }
    }

    public static Set<String> F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, BuildConfig.FLAVOR, BuildConfig.FLAVOR).getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    public static x7.g.e0.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return x7.g.e0.f.Middle;
            case "end":
                return x7.g.e0.f.End;
            case "start":
                return x7.g.e0.f.Start;
            default:
                return null;
        }
    }

    public static x7.g.e0.EnumC0750g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return x7.g.e0.EnumC0750g.LineThrough;
            case "underline":
                return x7.g.e0.EnumC0750g.Underline;
            case "none":
                return x7.g.e0.EnumC0750g.None;
            case "blink":
                return x7.g.e0.EnumC0750g.Blink;
            case "overline":
                return x7.g.e0.EnumC0750g.Overline;
            default:
                return null;
        }
    }

    public static x7.g.e0.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return x7.g.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return x7.g.e0.h.RTL;
        }
        return null;
    }

    public static x7.g.e0.i M0(String str) {
        str.getClass();
        if (str.equals(PayloadNotificationChannel.SOUND_NONE)) {
            return x7.g.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return x7.g.e0.i.NonScalingStroke;
        }
        return null;
    }

    public static x7.g.b N0(String str) throws x7.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new x7.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new x7.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new x7.g.b(fN, fN2, fN3, fN4);
        }
        throw new x7.j("Invalid viewBox. height cannot be negative");
    }

    public static void S0(x7.g.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[g.a(str).ordinal()]) {
                case 47:
                    x7.g.o0 o0VarT0 = t0(str2);
                    e0Var.b = o0VarT0;
                    if (o0VarT0 != null) {
                        e0Var.f36334a |= 1;
                    }
                    break;
                case 48:
                    x7.g.e0.a aVarE0 = e0(str2);
                    e0Var.f36335c = aVarE0;
                    if (aVarE0 != null) {
                        e0Var.f36334a |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e0Var.f36336d = fR0;
                    if (fR0 != null) {
                        e0Var.f36334a |= 4;
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    x7.g.o0 o0VarT1 = t0(str2);
                    e0Var.f36337e = o0VarT1;
                    if (o0VarT1 != null) {
                        e0Var.f36334a |= 8;
                    }
                    break;
                case 51:
                    Float fR1 = r0(str2);
                    e0Var.f36338f = fR1;
                    if (fR1 != null) {
                        e0Var.f36334a |= 16;
                    }
                    break;
                case 52:
                    e0Var.f36339g = o0(str2);
                    e0Var.f36334a |= 32;
                    break;
                case 53:
                    x7.g.e0.c cVarC0 = C0(str2);
                    e0Var.f36340h = cVarC0;
                    if (cVarC0 != null) {
                        e0Var.f36334a |= 64;
                    }
                    break;
                case 54:
                    x7.g.e0.d dVarD0 = D0(str2);
                    e0Var.f36341i = dVarD0;
                    if (dVarD0 != null) {
                        e0Var.f36334a |= 128;
                    }
                    break;
                case 55:
                    e0Var.f36342j = Float.valueOf(f0(str2));
                    e0Var.f36334a |= 256;
                    break;
                case 56:
                    if (!PayloadNotificationChannel.SOUND_NONE.equals(str2)) {
                        x7.g.p[] pVarArrB0 = B0(str2);
                        e0Var.f36343k = pVarArrB0;
                        if (pVarArrB0 != null) {
                            e0Var.f36334a |= 512;
                        }
                    } else {
                        e0Var.f36343k = null;
                        e0Var.f36334a |= 512;
                    }
                    break;
                case 57:
                    e0Var.f36344l = o0(str2);
                    e0Var.f36334a |= 1024;
                    break;
                case 58:
                    e0Var.f36345m = r0(str2);
                    e0Var.f36334a |= 2048;
                    break;
                case 59:
                    e0Var.f36346n = b0(str2);
                    e0Var.f36334a |= 4096;
                    break;
                case 60:
                    h0(e0Var, str2);
                    break;
                case 61:
                    List<String> listI0 = i0(str2);
                    e0Var.f36347o = listI0;
                    if (listI0 != null) {
                        e0Var.f36334a |= 8192;
                    }
                    break;
                case 62:
                    x7.g.p pVarJ0 = j0(str2);
                    e0Var.f36348p = pVarJ0;
                    if (pVarJ0 != null) {
                        e0Var.f36334a |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e0Var.f36349q = numL0;
                    if (numL0 != null) {
                        e0Var.f36334a |= 32768;
                    }
                    break;
                case Barcode.FORMAT_EAN_8 /* 64 */:
                    x7.g.e0.b bVarK0 = k0(str2);
                    e0Var.f36350r = bVarK0;
                    if (bVarK0 != null) {
                        e0Var.f36334a |= 65536;
                    }
                    break;
                case 65:
                    x7.g.e0.EnumC0750g enumC0750gH0 = H0(str2);
                    e0Var.f36351s = enumC0750gH0;
                    if (enumC0750gH0 != null) {
                        e0Var.f36334a |= 131072;
                    }
                    break;
                case 66:
                    x7.g.e0.h hVarI0 = I0(str2);
                    e0Var.f36352t = hVarI0;
                    if (hVarI0 != null) {
                        e0Var.f36334a |= 68719476736L;
                    }
                    break;
                case 67:
                    x7.g.e0.f fVarG0 = G0(str2);
                    e0Var.f36353u = fVarG0;
                    if (fVarG0 != null) {
                        e0Var.f36334a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e0Var.f36354v = boolS0;
                    if (boolS0 != null) {
                        e0Var.f36334a |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e0Var.f36356x = strM0;
                    e0Var.f36357y = strM0;
                    e0Var.f36358z = strM0;
                    e0Var.f36334a |= 14680064;
                    break;
                case 70:
                    e0Var.f36356x = m0(str2, str);
                    e0Var.f36334a |= 2097152;
                    break;
                case 71:
                    e0Var.f36357y = m0(str2, str);
                    e0Var.f36334a |= 4194304;
                    break;
                case 72:
                    e0Var.f36358z = m0(str2, str);
                    e0Var.f36334a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e0Var.A = Boolean.valueOf(!str2.equals(PayloadNotificationChannel.SOUND_NONE));
                            e0Var.f36334a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e0Var.B = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f36334a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.C = x7.g.C0751g.a();
                    } else {
                        try {
                            e0Var.C = b0(str2);
                        } catch (x7.j e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    e0Var.f36334a |= 67108864;
                    break;
                case 76:
                    e0Var.D = r0(str2);
                    e0Var.f36334a |= 134217728;
                    break;
                case 77:
                    x7.g.c cVarA0 = a0(str2);
                    e0Var.f36355w = cVarA0;
                    if (cVarA0 != null) {
                        e0Var.f36334a |= 1048576;
                    }
                    break;
                case 78:
                    e0Var.E = m0(str2, str);
                    e0Var.f36334a |= 268435456;
                    break;
                case 79:
                    e0Var.F = e0(str2);
                    e0Var.f36334a |= 536870912;
                    break;
                case 80:
                    e0Var.G = m0(str2, str);
                    e0Var.f36334a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.H = x7.g.C0751g.a();
                    } else {
                        try {
                            e0Var.H = b0(str2);
                        } catch (x7.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f36334a |= 2147483648L;
                    break;
                case 82:
                    e0Var.I = r0(str2);
                    e0Var.f36334a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.J = x7.g.C0751g.a();
                    } else {
                        try {
                            e0Var.J = b0(str2);
                        } catch (x7.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f36334a |= 8589934592L;
                    break;
                case 84:
                    e0Var.K = r0(str2);
                    e0Var.f36334a |= 17179869184L;
                    break;
                case 85:
                    x7.g.e0.i iVarM0 = M0(str2);
                    e0Var.L = iVarM0;
                    if (iVarM0 != null) {
                        e0Var.f36334a |= 34359738368L;
                    }
                    break;
                case 86:
                    x7.g.e0.e eVarY0 = y0(str2);
                    e0Var.M = eVarY0;
                    if (eVarY0 != null) {
                        e0Var.f36334a |= 137438953472L;
                    }
                    break;
            }
        } catch (x7.j unused) {
        }
    }

    public static x7.g.c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        x7.g.p pVarQ0 = q0(iVar);
        iVar.z();
        x7.g.p pVarQ1 = q0(iVar);
        iVar.z();
        x7.g.p pVarQ2 = q0(iVar);
        iVar.z();
        x7.g.p pVarQ3 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new x7.g.c(pVarQ0, pVarQ1, pVarQ2, pVarQ3);
        }
        return null;
    }

    public static x7.g.f b0(String str) throws x7.j {
        if (str.charAt(0) == '#') {
            x7.c cVarB = x7.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new x7.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new x7.g.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new x7.g.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new x7.g.f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new x7.g.f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new x7.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new x7.g.f(s(fN, fD, fD2) | (-16777216));
                }
                throw new x7.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new x7.g.f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new x7.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new x7.g.f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new x7.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new x7.g.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new x7.j("Bad rgba() colour value: " + str);
    }

    public static x7.g.f c0(String str) throws x7.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new x7.g.f(numA.intValue());
        }
        throw new x7.j("Invalid colour keyword: " + str);
    }

    public static x7.g.o0 d0(String str) {
        str.getClass();
        if (str.equals(PayloadNotificationChannel.SOUND_NONE)) {
            return x7.g.f.f36390c;
        }
        if (str.equals("currentColor")) {
            return x7.g.C0751g.a();
        }
        try {
            return b0(str);
        } catch (x7.j unused) {
            return null;
        }
    }

    public static x7.g.e0.a e0(String str) {
        if ("nonzero".equals(str)) {
            return x7.g.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return x7.g.e0.a.EvenOdd;
        }
        return null;
    }

    public static float f0(String str) throws x7.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new x7.j("Invalid float value (empty string)");
    }

    public static float g0(String str, int i10, int i11) throws x7.j {
        float fB = new x7.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new x7.j("Invalid float value: " + str);
    }

    public static void h0(x7.g.e0 e0Var, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            x7.g.e0.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            x7.g.p pVarJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (x7.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e0Var.f36347o = i0(iVar.y());
            e0Var.f36348p = pVarJ0;
            e0Var.f36349q = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = x7.g.e0.b.Normal;
            }
            e0Var.f36350r = bVarK0;
            e0Var.f36334a |= 122880;
        }
    }

    public static List<String> i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    public static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    public static x7.g.p j0(String str) {
        try {
            x7.g.p pVarA = d.a(str);
            return pVarA == null ? o0(str) : pVarA;
        } catch (x7.j unused) {
            return null;
        }
    }

    public static x7.g.e0.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return x7.g.e0.b.Oblique;
            case "italic":
                return x7.g.e0.b.Italic;
            case "normal":
                return x7.g.e0.b.Normal;
            default:
                return null;
        }
    }

    public static Integer l0(String str) {
        return e.a(str);
    }

    public static String m0(String str, String str2) {
        if (!str.equals(PayloadNotificationChannel.SOUND_NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static x7.g.p o0(String str) throws x7.j {
        if (str.length() == 0) {
            throw new x7.j("Invalid length value (empty string)");
        }
        int length = str.length();
        x7.g.d1 d1VarValueOf = x7.g.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = x7.g.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = x7.g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new x7.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new x7.g.p(g0(str, 0, length), d1VarValueOf);
        } catch (NumberFormatException e10) {
            throw new x7.j("Invalid length value: " + str, e10);
        }
    }

    public static List<x7.g.p> p0(String str) throws x7.j {
        if (str.length() == 0) {
            throw new x7.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new x7.j("Invalid length list value: " + iVar.b());
            }
            x7.g.d1 d1VarV = iVar.v();
            if (d1VarV == null) {
                d1VarV = x7.g.d1.px;
            }
            arrayList.add(new x7.g.p(fN, d1VarV));
            iVar.z();
        }
        return arrayList;
    }

    public static x7.g.p q0(i iVar) {
        return iVar.g("auto") ? new x7.g.p(0.0f) : iVar.p();
    }

    public static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (x7.j unused) {
            return null;
        }
    }

    public static int s(float f10, float f11, float f12) {
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
        return j(t(f19, f18, f15 - 2.0f) * 256.0f) | (j(t(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f15) * 256.0f) << 8);
    }

    public static Boolean s0(String str) {
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

    public static float t(float f10, float f11, float f12) {
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

    public static x7.g.o0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new x7.g.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new x7.g.u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    public static x7.g.w u0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        x7.g.w wVar = new x7.g.w();
        if (!iVar.h()) {
            int iIntValue = iVar.l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float fN = 0.0f;
                float f14 = 0.0f;
                float fD = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    iVar.A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fN2 = iVar.n();
                            float fD2 = iVar.d(fN2);
                            float f18 = f14;
                            float fD3 = iVar.d(fD2);
                            Boolean boolC = iVar.c(Float.valueOf(fD3));
                            Boolean boolC2 = iVar.c(boolC);
                            float fE = iVar.e(boolC2);
                            float fD4 = iVar.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= 0.0f && fD2 >= 0.0f) {
                                if (iIntValue2 == 97) {
                                    fE += f17;
                                    fD4 += f18;
                                }
                                float f19 = fD4;
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f20 = fE;
                                wVar.d(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f20, f19);
                                f13 = f20;
                                fN = f13;
                                f14 = f19;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = iVar.n();
                            float fD5 = iVar.d(fN3);
                            float fD6 = iVar.d(fD5);
                            float fD7 = iVar.d(fD6);
                            float fD8 = iVar.d(fD7);
                            float fD9 = iVar.d(fD8);
                            if (!Float.isNaN(fD9)) {
                                if (iIntValue2 == 99) {
                                    fD8 += f13;
                                    fD9 += f14;
                                    fN3 += f13;
                                    fD5 += f14;
                                    fD6 += f13;
                                    fD7 += f14;
                                }
                                float f21 = fN3;
                                float f22 = fD5;
                                f10 = fD6;
                                fD = fD7;
                                f11 = fD8;
                                f12 = fD9;
                                wVar.c(f21, f22, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = iVar.n();
                            if (!Float.isNaN(fN4)) {
                                if (iIntValue2 == 104) {
                                    fN4 += f13;
                                }
                                f13 = fN4;
                                wVar.e(f13, f14);
                                fN = f13;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = iVar.n();
                            float fD10 = iVar.d(fN5);
                            if (!Float.isNaN(fD10)) {
                                if (iIntValue2 == 108) {
                                    fN5 += f13;
                                    fD10 += f14;
                                }
                                f13 = fN5;
                                f14 = fD10;
                                wVar.e(f13, f14);
                                fN = f13;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = iVar.n();
                            float fD11 = iVar.d(fN6);
                            if (!Float.isNaN(fD11)) {
                                if (iIntValue2 == i10 && !wVar.i()) {
                                    fN6 += f13;
                                    fD11 += f14;
                                }
                                f13 = fN6;
                                f14 = fD11;
                                wVar.b(f13, f14);
                                fN = f13;
                                f15 = fN;
                                fD = f14;
                                f16 = fD;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fN = iVar.n();
                            fD = iVar.d(fN);
                            float fD12 = iVar.d(fD);
                            float fD13 = iVar.d(fD12);
                            if (!Float.isNaN(fD13)) {
                                if (iIntValue2 == 113) {
                                    fD12 += f13;
                                    fD13 += f14;
                                    fN += f13;
                                    fD += f14;
                                }
                                f13 = fD12;
                                f14 = fD13;
                                wVar.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fN;
                            float f24 = (2.0f * f14) - fD;
                            float fN7 = iVar.n();
                            float fD14 = iVar.d(fN7);
                            float fD15 = iVar.d(fD14);
                            float fD16 = iVar.d(fD15);
                            if (!Float.isNaN(fD16)) {
                                if (iIntValue2 == 115) {
                                    fD15 += f13;
                                    fD16 += f14;
                                    fN7 += f13;
                                    fD14 += f14;
                                }
                                f10 = fN7;
                                fD = fD14;
                                f11 = fD15;
                                f12 = fD16;
                                wVar.c(f23, f24, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f13 * 2.0f) - fN;
                            fD = (2.0f * f14) - fD;
                            float fN8 = iVar.n();
                            float fD17 = iVar.d(fN8);
                            if (!Float.isNaN(fD17)) {
                                if (iIntValue2 == 116) {
                                    fN8 += f13;
                                    fD17 += f14;
                                }
                                f13 = fN8;
                                f14 = fD17;
                                wVar.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = iVar.n();
                            if (!Float.isNaN(fN9)) {
                                if (iIntValue2 == 118) {
                                    fN9 += f14;
                                }
                                f14 = fN9;
                                wVar.e(f13, f14);
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
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
                            fN = f13;
                            f14 = f16;
                            fD = f14;
                            iVar.z();
                            if (iVar.h()) {
                                if (iVar.i()) {
                                    iIntValue2 = iVar.l().intValue();
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

    public static x7.e v0(String str) throws x7.j {
        x7.e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        x7.e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = x7.e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new x7.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = x7.e.b.slice;
            }
        }
        return new x7.e(aVarA, bVar);
    }

    public static void w0(x7.g.p0 p0Var, String str) {
        p0Var.f36441o = v0(str);
    }

    public static x7.g.e0.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return x7.g.e0.e.optimizeQuality;
            case "auto":
                return x7.g.e0.e.auto;
            case "optimizeSpeed":
                return x7.g.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    public static Set<String> z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    public final void A(x7.g.d dVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f36320o = o0(strTrim);
                    break;
                case 13:
                    dVar.f36321p = o0(strTrim);
                    break;
                case 14:
                    x7.g.p pVarO0 = o0(strTrim);
                    dVar.f36322q = pVarO0;
                    if (pVarO0.k()) {
                        throw new x7.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void B(x7.g.e eVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f36333p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new x7.j("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f36333p = Boolean.TRUE;
                }
            }
        }
    }

    public final void C(x7.g.g0 g0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g0Var.e(z0(strTrim));
                    break;
                case 22:
                    g0Var.j(strTrim);
                    break;
                case 23:
                    g0Var.g(F0(strTrim));
                    break;
                case 24:
                    g0Var.h(A0(strTrim));
                    break;
                case 25:
                    List<String> listI0 = i0(strTrim);
                    g0Var.c(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    public final void D(x7.g.l0 l0Var, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f36423c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f36424d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l0Var.f36424d = Boolean.TRUE;
                        return;
                    }
                    throw new x7.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void E(x7.g.i iVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    x7.g.p pVarO0 = o0(strTrim);
                    iVar.f36406q = pVarO0;
                    if (pVarO0.k()) {
                        throw new x7.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    x7.g.p pVarO1 = o0(strTrim);
                    iVar.f36407r = pVarO1;
                    if (pVarO1.k()) {
                        throw new x7.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f36404o = o0(strTrim);
                    break;
                case 13:
                    iVar.f36405p = o0(strTrim);
                    break;
            }
        }
    }

    public final void F(x7.g.j jVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case Barcode.FORMAT_EAN_13 /* 32 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new x7.j("Invalid value for attribute gradientUnits");
                            }
                            jVar.f36414i = Boolean.TRUE;
                        } else {
                            jVar.f36414i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f36415j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f36416k = x7.g.k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new x7.j("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                jVar.f36417l = strTrim;
            }
        }
    }

    public final void G(x7.g.o oVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                oVar.f36435q = o0(strTrim);
            } else if (i11 == 2) {
                oVar.f36436r = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                oVar.f36437s = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                oVar.f36438t = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(oVar, strTrim);
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                oVar.f36434p = strTrim;
            }
        }
    }

    public final void H(x7.g.q qVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    qVar.f36442o = o0(strTrim);
                    break;
                case 16:
                    qVar.f36443p = o0(strTrim);
                    break;
                case 17:
                    qVar.f36444q = o0(strTrim);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    qVar.f36445r = o0(strTrim);
                    break;
            }
        }
    }

    public final void I(x7.g.m0 m0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m0Var.f36429m = o0(strTrim);
                    break;
                case 16:
                    m0Var.f36430n = o0(strTrim);
                    break;
                case 17:
                    m0Var.f36431o = o0(strTrim);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    m0Var.f36432p = o0(strTrim);
                    break;
            }
        }
    }

    public final void J(x7.g.r rVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    rVar.f36452r = o0(strTrim);
                    break;
                case 27:
                    rVar.f36453s = o0(strTrim);
                    break;
                case 28:
                    x7.g.p pVarO0 = o0(strTrim);
                    rVar.f36454t = pVarO0;
                    if (pVarO0.k()) {
                        throw new x7.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    x7.g.p pVarO1 = o0(strTrim);
                    rVar.f36455u = pVarO1;
                    if (pVarO1.k()) {
                        throw new x7.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new x7.j("Invalid value for attribute markerUnits");
                        }
                        rVar.f36451q = true;
                    } else {
                        rVar.f36451q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        rVar.f36456v = Float.valueOf(Float.NaN);
                    } else {
                        rVar.f36456v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    public final Matrix J0(String str) throws x7.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new x7.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new x7.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new x7.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new x7.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    public final void K(x7.g.s sVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                sVar.f36460q = o0(strTrim);
            } else if (i11 == 2) {
                sVar.f36461r = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                sVar.f36462s = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                sVar.f36463t = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    sVar.f36459p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new x7.j("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f36459p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                sVar.f36458o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new x7.j("Invalid value for attribute maskUnits");
                }
                sVar.f36458o = Boolean.TRUE;
            }
        }
    }

    public final void K0(InputStream inputStream) throws x7.j {
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
            throw new x7.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new x7.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new x7.j("SVG parse error", e12);
        }
    }

    public final void L(x7.g.v vVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                vVar.f36467o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                vVar.f36468p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new x7.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void L0(InputStream inputStream, boolean z10) throws x7.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f36532a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
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
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e10) {
                throw new x7.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new x7.j("XML parser problem", e11);
        }
    }

    public final void M(x7.g.y yVar, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                yVar.f36477t = o0(strTrim);
            } else if (i11 == 2) {
                yVar.f36478u = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                yVar.f36479v = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                yVar.f36480w = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new x7.j("Invalid value for attribute patternUnits");
                            }
                            yVar.f36474q = Boolean.TRUE;
                        } else {
                            yVar.f36474q = Boolean.FALSE;
                        }
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new x7.j("Invalid value for attribute patternContentUnits");
                            }
                            yVar.f36475r = Boolean.TRUE;
                        } else {
                            yVar.f36475r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        yVar.f36476s = J0(strTrim);
                        break;
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                yVar.f36481x = strTrim;
            }
        }
    }

    public final void N(x7.g.z zVar, Attributes attributes, String str) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new x7.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new x7.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                zVar.f36482o = new float[arrayList.size()];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    zVar.f36482o[i11] = ((Float) obj).floatValue();
                    i11++;
                }
            }
        }
    }

    public final void O(x7.g.q0 q0Var, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q0Var.f36449p = o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q0Var.f36446m = o0(strTrim);
                        break;
                    case 13:
                        q0Var.f36447n = o0(strTrim);
                        break;
                    case 14:
                        x7.g.p pVarO0 = o0(strTrim);
                        q0Var.f36448o = pVarO0;
                        if (pVarO0.k()) {
                            throw new x7.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q0Var.f36450q = o0(strTrim);
            }
        }
    }

    public final void O0(Attributes attributes) throws x7.j {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.v vVar = new x7.g.v();
        vVar.f36433a = this.f36532a;
        vVar.b = this.b;
        D(vVar, attributes);
        S(vVar, attributes);
        W(vVar, attributes);
        C(vVar, attributes);
        L(vVar, attributes);
        this.b.i(vVar);
    }

    public final void P(x7.g.b0 b0Var, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b0Var.f36309o = o0(strTrim);
            } else if (i11 == 2) {
                b0Var.f36310p = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                b0Var.f36311q = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                b0Var.f36312r = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                x7.g.p pVarO2 = o0(strTrim);
                b0Var.f36313s = pVarO2;
                if (pVarO2.k()) {
                    throw new x7.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                x7.g.p pVarO3 = o0(strTrim);
                b0Var.f36314t = pVarO3;
                if (pVarO3.k()) {
                    throw new x7.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void P0(Attributes attributes) throws x7.j {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.y yVar = new x7.g.y();
        yVar.f36433a = this.f36532a;
        yVar.b = this.b;
        D(yVar, attributes);
        S(yVar, attributes);
        C(yVar, attributes);
        Y(yVar, attributes);
        M(yVar, attributes);
        this.b.i(yVar);
        this.b = yVar;
    }

    public final void Q(x7.g.f0 f0Var, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f0Var.f36392q = o0(strTrim);
            } else if (i11 == 2) {
                f0Var.f36393r = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                f0Var.f36394s = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                f0Var.f36395t = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f0Var.f36396u = strTrim;
            }
        }
    }

    public final void Q0(Attributes attributes) throws x7.j {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.z a0Var = new x7.g.a0();
        a0Var.f36433a = this.f36532a;
        a0Var.b = this.b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        N(a0Var, attributes, "polygon");
        this.b.i(a0Var);
    }

    public final void R(x7.g.d0 d0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d0Var.f36323h = n0(strTrim);
            }
        }
    }

    public final void R0(Attributes attributes) throws x7.j {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.z zVar = new x7.g.z();
        zVar.f36433a = this.f36532a;
        zVar.b = this.b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polyline");
        this.b.i(zVar);
    }

    public final void S(x7.g.l0 l0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l0Var, strTrim);
                } else if (i11 != 46) {
                    if (l0Var.f36425e == null) {
                        l0Var.f36425e = new x7.g.e0();
                    }
                    S0(l0Var.f36425e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l0Var.f36427g = x7.b.f(strTrim);
                }
            }
        }
    }

    public final void T(x7.g.u0 u0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 6 && (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u0Var.f36465o = strTrim;
            }
        }
    }

    public final void T0(Attributes attributes) throws x7.j {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.q0 q0Var = new x7.g.q0();
        q0Var.f36433a = this.f36532a;
        q0Var.b = this.b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        F(q0Var, attributes);
        O(q0Var, attributes);
        this.b.i(q0Var);
        this.b = q0Var;
    }

    public final void U(x7.g.z0 z0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z0Var.f36484p = o0(strTrim);
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z0Var.f36483o = strTrim;
            }
        }
    }

    public final void U0(Attributes attributes) throws x7.j {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.b0 b0Var = new x7.g.b0();
        b0Var.f36433a = this.f36532a;
        b0Var.b = this.b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        W(b0Var, attributes);
        C(b0Var, attributes);
        P(b0Var, attributes);
        this.b.i(b0Var);
    }

    public final void V(x7.g.a1 a1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a1Var.f36302o = p0(strTrim);
            } else if (i11 == 2) {
                a1Var.f36303p = p0(strTrim);
            } else if (i11 == 19) {
                a1Var.f36304q = p0(strTrim);
            } else if (i11 == 20) {
                a1Var.f36305r = p0(strTrim);
            }
        }
    }

    public final void V0(Attributes attributes) throws x7.j {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.c0 c0Var = new x7.g.c0();
        c0Var.f36433a = this.f36532a;
        c0Var.b = this.b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        this.b.i(c0Var);
        this.b = c0Var;
    }

    public final void W(x7.g.n nVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                nVar.k(J0(attributes.getValue(i10)));
            }
        }
    }

    public final void W0() {
        this.f36532a = new x7.g();
    }

    public final void X(x7.g.e1 e1Var, Attributes attributes) throws x7.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e1Var.f36386q = o0(strTrim);
            } else if (i11 == 2) {
                e1Var.f36387r = o0(strTrim);
            } else if (i11 == 3) {
                x7.g.p pVarO0 = o0(strTrim);
                e1Var.f36388s = pVarO0;
                if (pVarO0.k()) {
                    throw new x7.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                x7.g.p pVarO1 = o0(strTrim);
                e1Var.f36389t = pVarO1;
                if (pVarO1.k()) {
                    throw new x7.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e1Var.f36385p = strTrim;
            }
        }
    }

    public final void X0(String str, String str2, String str3, Attributes attributes) throws x7.j {
        if (this.f36533c) {
            this.f36534d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f36540a[hVarA.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f36535e = true;
                    this.f36536f = hVarA;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f36533c = true;
                    this.f36534d = 1;
                    break;
            }
        }
    }

    public final void Y(x7.g.r0 r0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r0Var, strTrim);
            } else if (i11 == 87) {
                r0Var.f36457p = N0(strTrim);
            }
        }
    }

    public final void Y0(Attributes attributes) throws x7.j {
        l("<stop>", new Object[0]);
        x7.g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof x7.g.j)) {
            throw new x7.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        x7.g.d0 d0Var = new x7.g.d0();
        d0Var.f36433a = this.f36532a;
        d0Var.b = this.b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        R(d0Var, attributes);
        this.b.i(d0Var);
        this.b = d0Var;
    }

    public final void Z(String str) {
        this.f36532a.a(new x7.b(x7.b.f.screen, x7.b.u.Document).d(str));
    }

    public final void Z0(Attributes attributes) throws x7.j {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && x7.b.b(str, x7.b.f.screen)) {
            this.f36538h = true;
        } else {
            this.f36533c = true;
            this.f36534d = 1;
        }
    }

    public final void a1(Attributes attributes) throws x7.j {
        l("<svg>", new Object[0]);
        x7.g.f0 f0Var = new x7.g.f0();
        f0Var.f36433a = this.f36532a;
        f0Var.b = this.b;
        D(f0Var, attributes);
        S(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        Q(f0Var, attributes);
        x7.g.j0 j0Var = this.b;
        if (j0Var == null) {
            this.f36532a.u(f0Var);
        } else {
            j0Var.i(f0Var);
        }
        this.b = f0Var;
    }

    public final void b1(Attributes attributes) throws x7.j {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.r0 t0Var = new x7.g.t0();
        t0Var.f36433a = this.f36532a;
        t0Var.b = this.b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        Y(t0Var, attributes);
        this.b.i(t0Var);
        this.b = t0Var;
    }

    public final void c1(String str) {
        if (this.f36533c) {
            return;
        }
        if (this.f36535e) {
            if (this.f36537g == null) {
                this.f36537g = new StringBuilder(str.length());
            }
            this.f36537g.append(str);
        } else if (this.f36538h) {
            if (this.f36539i == null) {
                this.f36539i = new StringBuilder(str.length());
            }
            this.f36539i.append(str);
        } else if (this.b instanceof x7.g.y0) {
            h(str);
        }
    }

    public final void d1(Attributes attributes) throws x7.j {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.w0 w0Var = new x7.g.w0();
        w0Var.f36433a = this.f36532a;
        w0Var.b = this.b;
        D(w0Var, attributes);
        S(w0Var, attributes);
        W(w0Var, attributes);
        C(w0Var, attributes);
        V(w0Var, attributes);
        this.b.i(w0Var);
        this.b = w0Var;
    }

    public final void e1(char[] cArr, int i10, int i11) {
        if (this.f36533c) {
            return;
        }
        if (this.f36535e) {
            if (this.f36537g == null) {
                this.f36537g = new StringBuilder(i11);
            }
            this.f36537g.append(cArr, i10, i11);
        } else if (this.f36538h) {
            if (this.f36539i == null) {
                this.f36539i = new StringBuilder(i11);
            }
            this.f36539i.append(cArr, i10, i11);
        } else if (this.b instanceof x7.g.y0) {
            h(new String(cArr, i10, i11));
        }
    }

    public final void f1(Attributes attributes) throws x7.j {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.z0 z0Var = new x7.g.z0();
        z0Var.f36433a = this.f36532a;
        z0Var.b = this.b;
        D(z0Var, attributes);
        S(z0Var, attributes);
        C(z0Var, attributes);
        U(z0Var, attributes);
        this.b.i(z0Var);
        this.b = z0Var;
        x7.g.j0 j0Var = z0Var.b;
        if (j0Var instanceof x7.g.b1) {
            z0Var.o((x7.g.b1) j0Var);
        } else {
            z0Var.o(((x7.g.x0) j0Var).d());
        }
    }

    public final void g1(Attributes attributes) throws x7.j {
        l("<tref>", new Object[0]);
        x7.g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof x7.g.y0)) {
            throw new x7.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        x7.g.u0 u0Var = new x7.g.u0();
        u0Var.f36433a = this.f36532a;
        u0Var.b = this.b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        C(u0Var, attributes);
        T(u0Var, attributes);
        this.b.i(u0Var);
        x7.g.j0 j0Var2 = u0Var.b;
        if (j0Var2 instanceof x7.g.b1) {
            u0Var.o((x7.g.b1) j0Var2);
        } else {
            u0Var.o(((x7.g.x0) j0Var2).d());
        }
    }

    public final void h(String str) {
        x7.g.h0 h0Var = (x7.g.h0) this.b;
        int size = h0Var.f36398i.size();
        x7.g.n0 n0Var = size == 0 ? null : h0Var.f36398i.get(size - 1);
        if (!(n0Var instanceof x7.g.c1)) {
            this.b.i(new x7.g.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        x7.g.c1 c1Var = (x7.g.c1) n0Var;
        sb2.append(c1Var.f36318c);
        sb2.append(str);
        c1Var.f36318c = sb2.toString();
    }

    public final void h1(Attributes attributes) throws x7.j {
        l("<tspan>", new Object[0]);
        x7.g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof x7.g.y0)) {
            throw new x7.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        x7.g.v0 v0Var = new x7.g.v0();
        v0Var.f36433a = this.f36532a;
        v0Var.b = this.b;
        D(v0Var, attributes);
        S(v0Var, attributes);
        C(v0Var, attributes);
        V(v0Var, attributes);
        this.b.i(v0Var);
        this.b = v0Var;
        x7.g.j0 j0Var2 = v0Var.b;
        if (j0Var2 instanceof x7.g.b1) {
            v0Var.o((x7.g.b1) j0Var2);
        } else {
            v0Var.o(((x7.g.x0) j0Var2).d());
        }
    }

    public final void i(Attributes attributes) throws x7.j {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.d dVar = new x7.g.d();
        dVar.f36433a = this.f36532a;
        dVar.b = this.b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.b.i(dVar);
    }

    public final void i1(Attributes attributes) throws x7.j {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.e1 e1Var = new x7.g.e1();
        e1Var.f36433a = this.f36532a;
        e1Var.b = this.b;
        D(e1Var, attributes);
        S(e1Var, attributes);
        W(e1Var, attributes);
        C(e1Var, attributes);
        X(e1Var, attributes);
        this.b.i(e1Var);
        this.b = e1Var;
    }

    public final void j1(Attributes attributes) throws x7.j {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.r0 f1Var = new x7.g.f1();
        f1Var.f36433a = this.f36532a;
        f1Var.b = this.b;
        D(f1Var, attributes);
        C(f1Var, attributes);
        Y(f1Var, attributes);
        this.b.i(f1Var);
        this.b = f1Var;
    }

    public final void k(Attributes attributes) throws x7.j {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.e eVar = new x7.g.e();
        eVar.f36433a = this.f36532a;
        eVar.b = this.b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.b.i(eVar);
        this.b = eVar;
    }

    public final void k1(Attributes attributes) throws x7.j {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.s0 s0Var = new x7.g.s0();
        s0Var.f36433a = this.f36532a;
        s0Var.b = this.b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        W(s0Var, attributes);
        C(s0Var, attributes);
        this.b.i(s0Var);
        this.b = s0Var;
    }

    public final void l(String str, Object... objArr) {
    }

    public final void m(Attributes attributes) throws x7.j {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.h hVar = new x7.g.h();
        hVar.f36433a = this.f36532a;
        hVar.b = this.b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.b.i(hVar);
        this.b = hVar;
    }

    public final void n(Attributes attributes) throws x7.j {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.i iVar = new x7.g.i();
        iVar.f36433a = this.f36532a;
        iVar.b = this.b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.b.i(iVar);
    }

    public final Float n0(String str) throws x7.j {
        if (str.length() == 0) {
            throw new x7.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new x7.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    public final void o() {
    }

    public final void p(String str, String str2, String str3) {
        if (this.f36533c) {
            int i10 = this.f36534d - 1;
            this.f36534d = i10;
            if (i10 == 0) {
                this.f36533c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f36540a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f36535e = false;
                        StringBuilder sb2 = this.f36537g;
                        if (sb2 != null) {
                            h hVar = this.f36536f;
                            if (hVar == h.title) {
                                this.f36532a.v(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f36532a.q(sb2.toString());
                            }
                            this.f36537g.setLength(0);
                        }
                        break;
                    case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                        StringBuilder sb3 = this.f36539i;
                        if (sb3 != null) {
                            this.f36538h = false;
                            Z(sb3.toString());
                            this.f36539i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.b = ((x7.g.n0) this.b).b;
        }
    }

    public final void q(Attributes attributes) throws x7.j {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.m mVar = new x7.g.m();
        mVar.f36433a = this.f36532a;
        mVar.b = this.b;
        D(mVar, attributes);
        S(mVar, attributes);
        W(mVar, attributes);
        C(mVar, attributes);
        this.b.i(mVar);
        this.b = mVar;
    }

    public final void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            x7.g.k();
        }
    }

    public final void u(Attributes attributes) throws x7.j {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.o oVar = new x7.g.o();
        oVar.f36433a = this.f36532a;
        oVar.b = this.b;
        D(oVar, attributes);
        S(oVar, attributes);
        W(oVar, attributes);
        C(oVar, attributes);
        G(oVar, attributes);
        this.b.i(oVar);
        this.b = oVar;
    }

    public final void v(Attributes attributes) throws x7.j {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.q qVar = new x7.g.q();
        qVar.f36433a = this.f36532a;
        qVar.b = this.b;
        D(qVar, attributes);
        S(qVar, attributes);
        W(qVar, attributes);
        C(qVar, attributes);
        H(qVar, attributes);
        this.b.i(qVar);
    }

    public final void w(Attributes attributes) throws x7.j {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.m0 m0Var = new x7.g.m0();
        m0Var.f36433a = this.f36532a;
        m0Var.b = this.b;
        D(m0Var, attributes);
        S(m0Var, attributes);
        F(m0Var, attributes);
        I(m0Var, attributes);
        this.b.i(m0Var);
        this.b = m0Var;
    }

    public final void x(Attributes attributes) throws x7.j {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.r rVar = new x7.g.r();
        rVar.f36433a = this.f36532a;
        rVar.b = this.b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        Y(rVar, attributes);
        J(rVar, attributes);
        this.b.i(rVar);
        this.b = rVar;
    }

    public final Map<String, String> x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    public final void y(Attributes attributes) throws x7.j {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new x7.j("Invalid document. Root element must be <svg>");
        }
        x7.g.s sVar = new x7.g.s();
        sVar.f36433a = this.f36532a;
        sVar.b = this.b;
        D(sVar, attributes);
        S(sVar, attributes);
        C(sVar, attributes);
        K(sVar, attributes);
        this.b.i(sVar);
        this.b = sVar;
    }

    public x7.g z(InputStream inputStream, boolean z10) {
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
            inputStream.mark(Barcode.FORMAT_AZTEC);
            L0(inputStream, z10);
            return this.f36532a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
