package p312nn;

import java.util.regex.Pattern;
import p388qn.AbstractC10601a;
import p388qn.C10615k;
import p388qn.C10627w;
import p418rn.C10934i;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;

/* JADX INFO: renamed from: nn.n */
/* JADX INFO: loaded from: classes3.dex */
public class C9512n extends AbstractC11707a {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f34243e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a */
    public final C10615k f34244a;

    /* JADX INFO: renamed from: b */
    public final Pattern f34245b;

    /* JADX INFO: renamed from: c */
    public boolean f34246c;

    /* JADX INFO: renamed from: d */
    public C9497a f34247d;

    /* JADX INFO: renamed from: nn.n$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            int iMo37495e = interfaceC11714h.mo37495e();
            CharSequence charSequenceM41528a = interfaceC11714h.mo37492b().m41528a();
            if (interfaceC11714h.mo37494d() < 4 && charSequenceM41528a.charAt(iMo37495e) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(interfaceC11713g.mo37514a().mo37455d() instanceof C10627w) && !interfaceC11714h.mo37496f().mo37605c())) {
                        Pattern pattern = C9512n.f34243e[i10][0];
                        Pattern pattern2 = C9512n.f34243e[i10][1];
                        if (pattern.matcher(charSequenceM41528a.subSequence(iMo37495e, charSequenceM41528a.length())).find()) {
                            return AbstractC11712f.m43906d(new C9512n(pattern2)).mo37463b(interfaceC11714h.getIndex());
                        }
                    }
                }
            }
            return AbstractC11712f.m43905c();
        }
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        if (this.f34246c) {
            return C11709c.m43904d();
        }
        return (interfaceC11714h.mo37491a() && this.f34245b == null) ? C11709c.m43904d() : C11709c.m43902b(interfaceC11714h.getIndex());
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34244a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: g */
    public void mo37522g(C10934i c10934i) {
        this.f34247d.m37441a(c10934i.m41528a());
        Pattern pattern = this.f34245b;
        if (pattern == null || !pattern.matcher(c10934i.m41528a()).find()) {
            return;
        }
        this.f34246c = true;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: h */
    public void mo37523h() {
        this.f34244a.m40684p(this.f34247d.m37442b());
        this.f34247d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C9512n(Pattern pattern) {
        this.f34244a = new C10615k();
        this.f34246c = false;
        this.f34247d = new C9497a();
        this.f34245b = pattern;
    }
}
