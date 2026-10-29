package nn;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class n extends tn.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f26419e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.k f26420a;
    public final Pattern b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nn.a f26422d;

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.b().a();
            if (hVar.d() < 4 && charSequenceA.charAt(iE) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().d() instanceof qn.w) && !hVar.f().c())) {
                        Pattern pattern = n.f26419e[i10][0];
                        Pattern pattern2 = n.f26419e[i10][1];
                        if (pattern.matcher(charSequenceA.subSequence(iE, charSequenceA.length())).find()) {
                            return tn.f.d(new n(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return tn.f.c();
        }
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        if (this.f26421c) {
            return tn.c.d();
        }
        return (hVar.a() && this.b == null) ? tn.c.d() : tn.c.b(hVar.getIndex());
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26420a;
    }

    @Override // tn.a, tn.d
    public void g(rn.i iVar) {
        this.f26422d.a(iVar.a());
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(iVar.a()).find()) {
            return;
        }
        this.f26421c = true;
    }

    @Override // tn.a, tn.d
    public void h() {
        this.f26420a.p(this.f26422d.b());
        this.f26422d = null;
    }

    public n(Pattern pattern) {
        this.f26420a = new qn.k();
        this.f26421c = false;
        this.f26422d = new nn.a();
        this.b = pattern;
    }
}
