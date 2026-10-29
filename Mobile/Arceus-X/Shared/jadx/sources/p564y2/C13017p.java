package p564y2;

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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y2.p */
/* JADX INFO: loaded from: classes.dex */
public class C13017p {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f46038a;

    /* JADX INFO: renamed from: b */
    public int f46039b = -1;

    /* JADX INFO: renamed from: c */
    public int f46040c = -1;

    /* JADX INFO: renamed from: y2.p$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final a f46041A;

        /* JADX INFO: renamed from: B */
        public static final a f46042B;

        /* JADX INFO: renamed from: C */
        public static final a f46043C;

        /* JADX INFO: renamed from: D */
        public static final a f46044D;

        /* JADX INFO: renamed from: E */
        public static final a f46045E;

        /* JADX INFO: renamed from: F */
        public static final a f46046F;

        /* JADX INFO: renamed from: G */
        public static final a f46047G;

        /* JADX INFO: renamed from: H */
        public static final a f46048H;

        /* JADX INFO: renamed from: I */
        public static final a f46049I;

        /* JADX INFO: renamed from: J */
        public static final a f46050J;

        /* JADX INFO: renamed from: K */
        public static final a f46051K;

        /* JADX INFO: renamed from: L */
        public static final a f46052L;

        /* JADX INFO: renamed from: M */
        public static final a f46053M;

        /* JADX INFO: renamed from: N */
        public static final a f46054N;

        /* JADX INFO: renamed from: O */
        public static final a f46055O;

        /* JADX INFO: renamed from: P */
        public static final a f46056P;

        /* JADX INFO: renamed from: Q */
        public static final a f46057Q;

        /* JADX INFO: renamed from: R */
        public static final a f46058R;

        /* JADX INFO: renamed from: S */
        public static final a f46059S;

        /* JADX INFO: renamed from: T */
        public static final a f46060T;

        /* JADX INFO: renamed from: U */
        public static final a f46061U;

        /* JADX INFO: renamed from: V */
        public static final a f46062V;

        /* JADX INFO: renamed from: e */
        public static final a f46063e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f46064f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f46065g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f46066h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f46067i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f46068j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f46069k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f46070l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f46071m = new a(256, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f46072n = new a(512, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f46073o = new a(1024, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f46074p = new a(2048, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f46075q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f46076r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f46077s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f46078t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f46079u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f46080v = new a(131072, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f46081w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f46082x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f46083y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f46084z = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC13020s.a>) InterfaceC13020s.h.class);

        /* JADX INFO: renamed from: a */
        public final Object f46085a;

        /* JADX INFO: renamed from: b */
        public final int f46086b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC13020s.a> f46087c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC13020s f46088d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f46041A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f46042B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC13020s.e.class);
            f46043C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f46044D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f46045E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f46046F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f46047G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f46048H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f46049I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f46050J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f46051K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f46052L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC13020s.f.class);
            f46053M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC13020s.d.class);
            f46054N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f46055O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f46056P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f46057Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f46058R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f46059S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f46060T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f46061U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f46062V = new a(i10 >= 34 ? d.m48443a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        /* JADX INFO: renamed from: a */
        public a m48435a(CharSequence charSequence, InterfaceC13020s interfaceC13020s) {
            return new a(null, this.f46086b, charSequence, interfaceC13020s, this.f46087c);
        }

        /* JADX INFO: renamed from: b */
        public int m48436b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46085a).getId();
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m48437c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46085a).getLabel();
        }

        /* JADX INFO: renamed from: d */
        public boolean m48438d(View view, Bundle bundle) {
            if (this.f46088d == null) {
                return false;
            }
            Class<? extends InterfaceC13020s.a> cls = this.f46087c;
            InterfaceC13020s.a aVar = null;
            if (cls != null) {
                try {
                    InterfaceC13020s.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.m48462a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVarNewInstance;
                        Class<? extends InterfaceC13020s.a> cls2 = this.f46087c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f46088d.mo6223a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f46085a;
            if (obj2 == null) {
                return aVar.f46085a == null;
            }
            return obj2.equals(aVar.f46085a);
        }

        public int hashCode() {
            Object obj = this.f46085a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strM48346g = C13017p.m48346g(this.f46086b);
            if (strM48346g.equals("ACTION_UNKNOWN") && m48437c() != null) {
                strM48346g = m48437c().toString();
            }
            sb2.append(strM48346g);
            return sb2.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10, CharSequence charSequence, InterfaceC13020s interfaceC13020s) {
            this(null, i10, charSequence, interfaceC13020s, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends InterfaceC13020s.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, InterfaceC13020s interfaceC13020s, Class<? extends InterfaceC13020s.a> cls) {
            this.f46086b = i10;
            this.f46088d = interfaceC13020s;
            if (obj == null) {
                this.f46085a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f46085a = obj;
            }
            this.f46087c = cls;
        }
    }

    /* JADX INFO: renamed from: y2.p$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static CharSequence m48439a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m48440b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: y2.p$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static String m48441a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m48442b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: y2.p$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m48443a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* JADX INFO: renamed from: b */
        public static void m48444b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m48445c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m48446d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: renamed from: y2.p$e */
    public static class e {
        /* JADX INFO: renamed from: b */
        public static int m48448b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        /* JADX INFO: renamed from: c */
        public static int m48449c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        /* JADX INFO: renamed from: d */
        public static CharSequence m48450d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m48451e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: renamed from: y2.p$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Object f46089a;

        public f(Object obj) {
            this.f46089a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m48452a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        /* JADX INFO: renamed from: b */
        public static f m48453b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: renamed from: y2.p$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f46090a;

        public g(Object obj) {
            this.f46090a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m48454a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        /* JADX INFO: renamed from: b */
        public static g m48455b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public C13017p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f46038a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: O0 */
    public static C13017p m48342O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C13017p(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: Y */
    public static C13017p m48343Y() {
        return m48342O0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: Z */
    public static C13017p m48344Z(View view) {
        return m48342O0(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: a0 */
    public static C13017p m48345a0(C13017p c13017p) {
        return m48342O0(AccessibilityNodeInfo.obtain(c13017p.f46038a));
    }

    /* JADX INFO: renamed from: g */
    public static String m48346g(int i10) {
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
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
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

    /* JADX INFO: renamed from: q */
    public static ClickableSpan[] m48347q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static String m48348v(int i10) {
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

    /* JADX INFO: renamed from: A */
    public CharSequence m48349A() {
        return Build.VERSION.SDK_INT >= 36 ? e.m48450d(this.f46038a) : this.f46038a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: A0 */
    public void m48350A0(CharSequence charSequence) {
        this.f46038a.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: B */
    public CharSequence m48351B() {
        if (!m48359F()) {
            return this.f46038a.getText();
        }
        List<Integer> listM48394e = m48394e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM48394e2 = m48394e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM48394e3 = m48394e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM48394e4 = m48394e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f46038a.getText(), 0, this.f46038a.getText().length()));
        for (int i10 = 0; i10 < listM48394e.size(); i10++) {
            spannableString.setSpan(new C13002a(listM48394e4.get(i10).intValue(), this, m48427w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM48394e.get(i10).intValue(), listM48394e2.get(i10).intValue(), listM48394e3.get(i10).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: B0 */
    public void m48352B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46038a.setPaneTitle(charSequence);
        } else {
            this.f46038a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: C */
    public CharSequence m48353C() {
        return Build.VERSION.SDK_INT >= 28 ? this.f46038a.getTooltipText() : this.f46038a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: C0 */
    public void m48354C0(View view) {
        this.f46039b = -1;
        this.f46038a.setParent(view);
    }

    /* JADX INFO: renamed from: D */
    public String m48355D() {
        return Build.VERSION.SDK_INT >= 33 ? c.m48441a(this.f46038a) : this.f46038a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: D0 */
    public void m48356D0(View view, int i10) {
        this.f46039b = i10;
        this.f46038a.setParent(view, i10);
    }

    /* JADX INFO: renamed from: E */
    public String m48357E() {
        return this.f46038a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: E0 */
    public void m48358E0(CharSequence charSequence) {
        this.f46038a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m48359F() {
        return !m48394e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: F0 */
    public void m48360F0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46038a.setScreenReaderFocusable(z10);
        } else {
            m48397f0(1, z10);
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m48361G() {
        return Build.VERSION.SDK_INT >= 34 ? d.m48446d(this.f46038a) : m48401i(64);
    }

    /* JADX INFO: renamed from: G0 */
    public void m48362G0(boolean z10) {
        this.f46038a.setScrollable(z10);
    }

    /* JADX INFO: renamed from: H */
    public boolean m48363H() {
        return this.f46038a.isCheckable();
    }

    /* JADX INFO: renamed from: H0 */
    public void m48364H0(boolean z10) {
        this.f46038a.setShowingHintText(z10);
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public boolean m48365I() {
        return this.f46038a.isChecked();
    }

    /* JADX INFO: renamed from: I0 */
    public void m48366I0(View view, int i10) {
        this.f46040c = i10;
        this.f46038a.setSource(view, i10);
    }

    /* JADX INFO: renamed from: J */
    public boolean m48367J() {
        return this.f46038a.isClickable();
    }

    /* JADX INFO: renamed from: J0 */
    public void m48368J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m48440b(this.f46038a, charSequence);
        } else {
            this.f46038a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m48369K() {
        return this.f46038a.isContextClickable();
    }

    /* JADX INFO: renamed from: K0 */
    public void m48370K0(CharSequence charSequence) {
        this.f46038a.setText(charSequence);
    }

    /* JADX INFO: renamed from: L */
    public boolean m48371L() {
        return this.f46038a.isEnabled();
    }

    /* JADX INFO: renamed from: L0 */
    public void m48372L0(View view) {
        this.f46038a.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: M */
    public boolean m48373M() {
        return Build.VERSION.SDK_INT >= 36 ? e.m48451e(this.f46038a) : this.f46038a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    /* JADX INFO: renamed from: M0 */
    public void m48374M0(boolean z10) {
        this.f46038a.setVisibleToUser(z10);
    }

    /* JADX INFO: renamed from: N */
    public boolean m48375N() {
        return this.f46038a.isFocusable();
    }

    /* JADX INFO: renamed from: N0 */
    public AccessibilityNodeInfo m48376N0() {
        return this.f46038a;
    }

    /* JADX INFO: renamed from: O */
    public boolean m48377O() {
        return this.f46038a.isFocused();
    }

    /* JADX INFO: renamed from: P */
    public boolean m48378P() {
        return m48401i(67108864);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m48379Q() {
        return this.f46038a.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: R */
    public boolean m48380R() {
        return this.f46038a.isLongClickable();
    }

    /* JADX INFO: renamed from: S */
    public boolean m48381S() {
        return this.f46038a.isPassword();
    }

    /* JADX INFO: renamed from: T */
    public boolean m48382T() {
        return this.f46038a.isScrollable();
    }

    /* JADX INFO: renamed from: U */
    public boolean m48383U() {
        return this.f46038a.isSelected();
    }

    /* JADX INFO: renamed from: V */
    public boolean m48384V() {
        return this.f46038a.isShowingHintText();
    }

    /* JADX INFO: renamed from: W */
    public boolean m48385W() {
        return Build.VERSION.SDK_INT >= 33 ? c.m48442b(this.f46038a) : m48401i(8388608);
    }

    /* JADX INFO: renamed from: X */
    public boolean m48386X() {
        return this.f46038a.isVisibleToUser();
    }

    /* JADX INFO: renamed from: a */
    public void m48387a(int i10) {
        this.f46038a.addAction(i10);
    }

    /* JADX INFO: renamed from: b */
    public void m48388b(a aVar) {
        this.f46038a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f46085a);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m48389b0(int i10, Bundle bundle) {
        return this.f46038a.performAction(i10, bundle);
    }

    /* JADX INFO: renamed from: c */
    public void m48390c(View view, int i10) {
        this.f46038a.addChild(view, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: c0 */
    public void m48391c0() {
    }

    /* JADX INFO: renamed from: d */
    public void m48392d(CharSequence charSequence, View view) {
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m48393d0(a aVar) {
        return this.f46038a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f46085a);
    }

    /* JADX INFO: renamed from: e */
    public final List<Integer> m48394e(String str) {
        ArrayList<Integer> integerArrayList = this.f46038a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f46038a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public void m48395e0(boolean z10) {
        this.f46038a.setAccessibilityFocused(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C13017p)) {
            return false;
        }
        C13017p c13017p = (C13017p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46038a;
        if (accessibilityNodeInfo == null) {
            if (c13017p.f46038a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c13017p.f46038a)) {
            return false;
        }
        return this.f46040c == c13017p.f46040c && this.f46039b == c13017p.f46039b;
    }

    /* JADX INFO: renamed from: f */
    public List<a> m48396f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f46038a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m48397f0(int i10, boolean z10) {
        Bundle bundleM48427w = m48427w();
        if (bundleM48427w != null) {
            int i11 = bundleM48427w.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleM48427w.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g0 */
    public void m48398g0(Rect rect) {
        this.f46038a.setBoundsInParent(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public int m48399h() {
        return this.f46038a.getActions();
    }

    /* JADX INFO: renamed from: h0 */
    public void m48400h0(Rect rect) {
        this.f46038a.setBoundsInScreen(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46038a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48401i(int i10) {
        Bundle bundleM48427w = m48427w();
        return bundleM48427w != null && (bundleM48427w.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    /* JADX INFO: renamed from: i0 */
    public void m48402i0(boolean z10) {
        this.f46038a.setCanOpenPopup(z10);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public void m48403j(Rect rect) {
        this.f46038a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: j0 */
    public void m48404j0(boolean z10) {
        this.f46038a.setCheckable(z10);
    }

    /* JADX INFO: renamed from: k */
    public void m48405k(Rect rect) {
        this.f46038a.getBoundsInScreen(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: k0 */
    public void m48406k0(boolean z10) {
        this.f46038a.setChecked(z10);
    }

    /* JADX INFO: renamed from: l */
    public void m48407l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m48444b(this.f46038a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f46038a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m48408l0(CharSequence charSequence) {
        this.f46038a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: m */
    public int m48409m() {
        return Build.VERSION.SDK_INT >= 36 ? e.m48448b(this.f46038a) : this.f46038a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f46038a.isChecked() ? 1 : 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m48410m0(boolean z10) {
        this.f46038a.setClickable(z10);
    }

    /* JADX INFO: renamed from: n */
    public final String m48411n() {
        int iM48409m = m48409m();
        if (iM48409m == 1) {
            return "TRUE";
        }
        return iM48409m == 2 ? "PARTIAL" : "FALSE";
    }

    /* JADX INFO: renamed from: n0 */
    public void m48412n0(Object obj) {
        this.f46038a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f46089a);
    }

    /* JADX INFO: renamed from: o */
    public int m48413o() {
        return this.f46038a.getChildCount();
    }

    /* JADX INFO: renamed from: o0 */
    public void m48414o0(Object obj) {
        this.f46038a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f46090a);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m48415p() {
        return this.f46038a.getClassName();
    }

    /* JADX INFO: renamed from: p0 */
    public void m48416p0(CharSequence charSequence) {
        this.f46038a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: q0 */
    public void m48417q0(boolean z10) {
        this.f46038a.setDismissable(z10);
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m48418r() {
        return Build.VERSION.SDK_INT >= 34 ? d.m48445c(this.f46038a) : this.f46038a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: r0 */
    public void m48419r0(boolean z10) {
        this.f46038a.setEnabled(z10);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m48420s() {
        return this.f46038a.getContentDescription();
    }

    /* JADX INFO: renamed from: s0 */
    public void m48421s0(CharSequence charSequence) {
        this.f46038a.setError(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public CharSequence m48422t() {
        return this.f46038a.getError();
    }

    /* JADX INFO: renamed from: t0 */
    public void m48423t0(boolean z10) {
        this.f46038a.setFocusable(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m48403j(rect);
        sb2.append("; boundsInParent: " + rect);
        m48405k(rect);
        sb2.append("; boundsInScreen: " + rect);
        m48407l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m48431y());
        sb2.append("; className: ");
        sb2.append(m48415p());
        sb2.append("; text: ");
        sb2.append(m48351B());
        sb2.append("; error: ");
        sb2.append(m48422t());
        sb2.append("; maxTextLength: ");
        sb2.append(m48429x());
        sb2.append("; stateDescription: ");
        sb2.append(m48433z());
        sb2.append("; contentDescription: ");
        sb2.append(m48420s());
        sb2.append("; supplementalDescription: ");
        sb2.append(m48349A());
        sb2.append("; tooltipText: ");
        sb2.append(m48353C());
        sb2.append("; viewIdResName: ");
        sb2.append(m48357E());
        sb2.append("; uniqueId: ");
        sb2.append(m48355D());
        sb2.append("; checkable: ");
        sb2.append(m48363H());
        sb2.append("; checked: ");
        sb2.append(m48411n());
        sb2.append("; fieldRequired: ");
        sb2.append(m48373M());
        sb2.append("; focusable: ");
        sb2.append(m48375N());
        sb2.append("; focused: ");
        sb2.append(m48377O());
        sb2.append("; selected: ");
        sb2.append(m48383U());
        sb2.append("; clickable: ");
        sb2.append(m48367J());
        sb2.append("; longClickable: ");
        sb2.append(m48380R());
        sb2.append("; contextClickable: ");
        sb2.append(m48369K());
        sb2.append("; expandedState: ");
        sb2.append(m48348v(m48424u()));
        sb2.append("; enabled: ");
        sb2.append(m48371L());
        sb2.append("; password: ");
        sb2.append(m48381S());
        sb2.append("; scrollable: " + m48382T());
        sb2.append("; containerTitle: ");
        sb2.append(m48418r());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(m48378P());
        sb2.append("; importantForAccessibility: ");
        sb2.append(m48379Q());
        sb2.append("; visible: ");
        sb2.append(m48386X());
        sb2.append("; isTextSelectable: ");
        sb2.append(m48385W());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(m48361G());
        sb2.append("; [");
        List<a> listM48396f = m48396f();
        for (int i10 = 0; i10 < listM48396f.size(); i10++) {
            a aVar = listM48396f.get(i10);
            String strM48346g = m48346g(aVar.m48436b());
            if (strM48346g.equals("ACTION_UNKNOWN") && aVar.m48437c() != null) {
                strM48346g = aVar.m48437c().toString();
            }
            sb2.append(strM48346g);
            if (i10 != listM48396f.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public int m48424u() {
        return Build.VERSION.SDK_INT >= 36 ? e.m48449c(this.f46038a) : this.f46038a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m48425u0(boolean z10) {
        this.f46038a.setFocused(z10);
    }

    /* JADX INFO: renamed from: v0 */
    public void m48426v0(boolean z10) {
        m48397f0(67108864, z10);
    }

    /* JADX INFO: renamed from: w */
    public Bundle m48427w() {
        return this.f46038a.getExtras();
    }

    /* JADX INFO: renamed from: w0 */
    public void m48428w0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46038a.setHeading(z10);
        } else {
            m48397f0(2, z10);
        }
    }

    /* JADX INFO: renamed from: x */
    public int m48429x() {
        return this.f46038a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: x0 */
    public void m48430x0(CharSequence charSequence) {
        this.f46038a.setHintText(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public CharSequence m48431y() {
        return this.f46038a.getPackageName();
    }

    /* JADX INFO: renamed from: y0 */
    public void m48432y0(View view) {
        this.f46038a.setLabelFor(view);
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m48433z() {
        return Build.VERSION.SDK_INT >= 30 ? b.m48439a(this.f46038a) : this.f46038a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: z0 */
    public void m48434z0(int i10) {
        this.f46038a.setMaxTextLength(i10);
    }
}
