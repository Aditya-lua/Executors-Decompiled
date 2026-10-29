package y2;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f35500a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35501c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f35502e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f35503f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f35504g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f35505h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f35506i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f35507j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f35508k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f35509l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f35510m = new a(Barcode.FORMAT_QR_CODE, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f35511n = new a(Barcode.FORMAT_UPC_A, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f35512o = new a(Barcode.FORMAT_UPC_E, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f35513p = new a(Barcode.FORMAT_PDF417, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f35514q = new a(Barcode.FORMAT_AZTEC, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f35515r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f35516s = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f35517t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f35518u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f35519v = new a(131072, (CharSequence) null, (Class<? extends s.a>) s.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f35520w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f35521x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f35522y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f35523z = new a(2097152, (CharSequence) null, (Class<? extends s.a>) s.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f35524a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<? extends s.a> f35525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f35526d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s sVar) {
            return new a(null, this.b, charSequence, sVar, this.f35525c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f35524a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f35524a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f35526d == null) {
                return false;
            }
            Class<? extends s.a> cls = this.f35525c;
            s.a aVar = null;
            if (cls != null) {
                try {
                    s.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVarNewInstance;
                        Class<? extends s.a> cls2 = this.f35525c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f35526d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f35524a;
            if (obj2 == null) {
                return aVar.f35524a == null;
            }
            return obj2.equals(aVar.f35524a);
        }

        public int hashCode() {
            Object obj = this.f35524a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strG = p.g(this.b);
            if (strG.equals("ACTION_UNKNOWN") && c() != null) {
                strG = c().toString();
            }
            sb2.append(strG);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, s sVar) {
            this(null, i10, charSequence, sVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends s.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, s sVar, Class<? extends s.a> cls) {
            this.b = i10;
            this.f35526d = sVar;
            if (obj == null) {
                this.f35524a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f35524a = obj;
            }
            this.f35525c = cls;
        }
    }

    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f35527a;

        public f(Object obj) {
            this.f35527a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f35528a;

        public g(Object obj) {
            this.f35528a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f35500a = accessibilityNodeInfo;
    }

    public static p O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    public static p Y() {
        return O0(AccessibilityNodeInfo.obtain());
    }

    public static p Z(View view) {
        return O0(AccessibilityNodeInfo.obtain(view));
    }

    public static p a0(p pVar) {
        return O0(AccessibilityNodeInfo.obtain(pVar.f35500a));
    }

    public static String g(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case Barcode.FORMAT_QR_CODE /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case Barcode.FORMAT_UPC_A /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case Barcode.FORMAT_UPC_E /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case Barcode.FORMAT_PDF417 /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case Barcode.FORMAT_AZTEC /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String v(int i10) {
        if (i10 == 0) {
            return "UNDEFINED";
        }
        if (i10 == 1) {
            return "COLLAPSED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f35500a) : this.f35500a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void A0(CharSequence charSequence) {
        this.f35500a.setPackageName(charSequence);
    }

    public CharSequence B() {
        if (!F()) {
            return this.f35500a.getText();
        }
        List<Integer> listE = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listE2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listE3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listE4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f35500a.getText(), 0, this.f35500a.getText().length()));
        for (int i10 = 0; i10 < listE.size(); i10++) {
            spannableString.setSpan(new y2.a(listE4.get(i10).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listE.get(i10).intValue(), listE2.get(i10).intValue(), listE3.get(i10).intValue());
        }
        return spannableString;
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35500a.setPaneTitle(charSequence);
        } else {
            this.f35500a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 28 ? this.f35500a.getTooltipText() : this.f35500a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void C0(View view) {
        this.b = -1;
        this.f35500a.setParent(view);
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f35500a) : this.f35500a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view, int i10) {
        this.b = i10;
        this.f35500a.setParent(view, i10);
    }

    public String E() {
        return this.f35500a.getViewIdResourceName();
    }

    public void E0(CharSequence charSequence) {
        this.f35500a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final boolean F() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void F0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35500a.setScreenReaderFocusable(z10);
        } else {
            f0(1, z10);
        }
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f35500a) : i(64);
    }

    public void G0(boolean z10) {
        this.f35500a.setScrollable(z10);
    }

    public boolean H() {
        return this.f35500a.isCheckable();
    }

    public void H0(boolean z10) {
        this.f35500a.setShowingHintText(z10);
    }

    @Deprecated
    public boolean I() {
        return this.f35500a.isChecked();
    }

    public void I0(View view, int i10) {
        this.f35501c = i10;
        this.f35500a.setSource(view, i10);
    }

    public boolean J() {
        return this.f35500a.isClickable();
    }

    public void J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f35500a, charSequence);
        } else {
            this.f35500a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean K() {
        return this.f35500a.isContextClickable();
    }

    public void K0(CharSequence charSequence) {
        this.f35500a.setText(charSequence);
    }

    public boolean L() {
        return this.f35500a.isEnabled();
    }

    public void L0(View view) {
        this.f35500a.setTraversalAfter(view);
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f35500a) : this.f35500a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void M0(boolean z10) {
        this.f35500a.setVisibleToUser(z10);
    }

    public boolean N() {
        return this.f35500a.isFocusable();
    }

    public AccessibilityNodeInfo N0() {
        return this.f35500a;
    }

    public boolean O() {
        return this.f35500a.isFocused();
    }

    public boolean P() {
        return i(67108864);
    }

    public boolean Q() {
        return this.f35500a.isImportantForAccessibility();
    }

    public boolean R() {
        return this.f35500a.isLongClickable();
    }

    public boolean S() {
        return this.f35500a.isPassword();
    }

    public boolean T() {
        return this.f35500a.isScrollable();
    }

    public boolean U() {
        return this.f35500a.isSelected();
    }

    public boolean V() {
        return this.f35500a.isShowingHintText();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f35500a) : i(8388608);
    }

    public boolean X() {
        return this.f35500a.isVisibleToUser();
    }

    public void a(int i10) {
        this.f35500a.addAction(i10);
    }

    public void b(a aVar) {
        this.f35500a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f35524a);
    }

    public boolean b0(int i10, Bundle bundle) {
        return this.f35500a.performAction(i10, bundle);
    }

    public void c(View view, int i10) {
        this.f35500a.addChild(view, i10);
    }

    @Deprecated
    public void c0() {
    }

    public void d(CharSequence charSequence, View view) {
    }

    public boolean d0(a aVar) {
        return this.f35500a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f35524a);
    }

    public final List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = this.f35500a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f35500a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void e0(boolean z10) {
        this.f35500a.setAccessibilityFocused(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f35500a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f35500a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f35500a)) {
            return false;
        }
        return this.f35501c == pVar.f35501c && this.b == pVar.b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f35500a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public final void f0(int i10, boolean z10) {
        Bundle bundleW = w();
        if (bundleW != null) {
            int i11 = bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleW.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public void g0(Rect rect) {
        this.f35500a.setBoundsInParent(rect);
    }

    @Deprecated
    public int h() {
        return this.f35500a.getActions();
    }

    public void h0(Rect rect) {
        this.f35500a.setBoundsInScreen(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f35500a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i10) {
        Bundle bundleW = w();
        return bundleW != null && (bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void i0(boolean z10) {
        this.f35500a.setCanOpenPopup(z10);
    }

    @Deprecated
    public void j(Rect rect) {
        this.f35500a.getBoundsInParent(rect);
    }

    public void j0(boolean z10) {
        this.f35500a.setCheckable(z10);
    }

    public void k(Rect rect) {
        this.f35500a.getBoundsInScreen(rect);
    }

    @Deprecated
    public void k0(boolean z10) {
        this.f35500a.setChecked(z10);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f35500a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f35500a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(CharSequence charSequence) {
        this.f35500a.setClassName(charSequence);
    }

    public int m() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f35500a) : this.f35500a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f35500a.isChecked() ? 1 : 0);
    }

    public void m0(boolean z10) {
        this.f35500a.setClickable(z10);
    }

    public final String n() {
        int iM = m();
        if (iM == 1) {
            return "TRUE";
        }
        return iM == 2 ? "PARTIAL" : "FALSE";
    }

    public void n0(Object obj) {
        this.f35500a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f35527a);
    }

    public int o() {
        return this.f35500a.getChildCount();
    }

    public void o0(Object obj) {
        this.f35500a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f35528a);
    }

    public CharSequence p() {
        return this.f35500a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        this.f35500a.setContentDescription(charSequence);
    }

    public void q0(boolean z10) {
        this.f35500a.setDismissable(z10);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f35500a) : this.f35500a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(boolean z10) {
        this.f35500a.setEnabled(z10);
    }

    public CharSequence s() {
        return this.f35500a.getContentDescription();
    }

    public void s0(CharSequence charSequence) {
        this.f35500a.setError(charSequence);
    }

    public CharSequence t() {
        return this.f35500a.getError();
    }

    public void t0(boolean z10) {
        this.f35500a.setFocusable(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb2.append("; boundsInParent: " + rect);
        k(rect);
        sb2.append("; boundsInScreen: " + rect);
        l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(y());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(B());
        sb2.append("; error: ");
        sb2.append(t());
        sb2.append("; maxTextLength: ");
        sb2.append(x());
        sb2.append("; stateDescription: ");
        sb2.append(z());
        sb2.append("; contentDescription: ");
        sb2.append(s());
        sb2.append("; supplementalDescription: ");
        sb2.append(A());
        sb2.append("; tooltipText: ");
        sb2.append(C());
        sb2.append("; viewIdResName: ");
        sb2.append(E());
        sb2.append("; uniqueId: ");
        sb2.append(D());
        sb2.append("; checkable: ");
        sb2.append(H());
        sb2.append("; checked: ");
        sb2.append(n());
        sb2.append("; fieldRequired: ");
        sb2.append(M());
        sb2.append("; focusable: ");
        sb2.append(N());
        sb2.append("; focused: ");
        sb2.append(O());
        sb2.append("; selected: ");
        sb2.append(U());
        sb2.append("; clickable: ");
        sb2.append(J());
        sb2.append("; longClickable: ");
        sb2.append(R());
        sb2.append("; contextClickable: ");
        sb2.append(K());
        sb2.append("; expandedState: ");
        sb2.append(v(u()));
        sb2.append("; enabled: ");
        sb2.append(L());
        sb2.append("; password: ");
        sb2.append(S());
        sb2.append("; scrollable: " + T());
        sb2.append("; containerTitle: ");
        sb2.append(r());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(P());
        sb2.append("; importantForAccessibility: ");
        sb2.append(Q());
        sb2.append("; visible: ");
        sb2.append(X());
        sb2.append("; isTextSelectable: ");
        sb2.append(W());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(G());
        sb2.append("; [");
        List<a> listF = f();
        for (int i10 = 0; i10 < listF.size(); i10++) {
            a aVar = listF.get(i10);
            String strG = g(aVar.b());
            if (strG.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strG = aVar.c().toString();
            }
            sb2.append(strG);
            if (i10 != listF.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f35500a) : this.f35500a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void u0(boolean z10) {
        this.f35500a.setFocused(z10);
    }

    public void v0(boolean z10) {
        f0(67108864, z10);
    }

    public Bundle w() {
        return this.f35500a.getExtras();
    }

    public void w0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35500a.setHeading(z10);
        } else {
            f0(2, z10);
        }
    }

    public int x() {
        return this.f35500a.getMaxTextLength();
    }

    public void x0(CharSequence charSequence) {
        this.f35500a.setHintText(charSequence);
    }

    public CharSequence y() {
        return this.f35500a.getPackageName();
    }

    public void y0(View view) {
        this.f35500a.setLabelFor(view);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f35500a) : this.f35500a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(int i10) {
        this.f35500a.setMaxTextLength(i10);
    }
}
