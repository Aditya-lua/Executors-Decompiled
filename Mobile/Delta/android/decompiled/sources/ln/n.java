package ln;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class n extends rn.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f23708e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.k f23709a;
    public final Pattern b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ln.a f23711d;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.b().a();
            if (hVar.d() < 4 && charSequenceA.charAt(iE) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().g() instanceof on.w) && !hVar.f().e())) {
                        Pattern pattern = n.f23708e[i10][0];
                        Pattern pattern2 = n.f23708e[i10][1];
                        if (pattern.matcher(charSequenceA.subSequence(iE, charSequenceA.length())).find()) {
                            return rn.f.d(new n(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return rn.f.c();
        }
    }

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        this.f23711d.a(iVar.a());
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(iVar.a()).find()) {
            return;
        }
        this.f23710c = true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23709a;
    }

    @Override // rn.a, rn.d
    public void h() {
        this.f23709a.p(this.f23711d.b());
        this.f23711d = null;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (this.f23710c) {
            return rn.c.d();
        }
        return (hVar.a() && this.b == null) ? rn.c.d() : rn.c.b(hVar.getIndex());
    }

    public n(Pattern pattern) {
        this.f23709a = new on.k();
        this.f23710c = false;
        this.f23711d = new ln.a();
        this.b = pattern;
    }
}
