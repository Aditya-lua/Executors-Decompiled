package ao;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class n extends ho.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f3111e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.k f3112a;
    public final Pattern b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ao.a f3114d;

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.b().a();
            if (hVar.d() < 4 && charSequenceA.charAt(iE) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || (!(gVar.a().f() instanceof eo.w) && !hVar.f().e())) {
                        Pattern pattern = n.f3111e[i10][0];
                        Pattern pattern2 = n.f3111e[i10][1];
                        if (pattern.matcher(charSequenceA.subSequence(iE, charSequenceA.length())).find()) {
                            return ho.f.d(new n(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return ho.f.c();
        }
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        if (this.f3113c) {
            return ho.c.d();
        }
        return (hVar.a() && this.b == null) ? ho.c.d() : ho.c.b(hVar.getIndex());
    }

    @Override // ho.a, ho.d
    public void c(fo.i iVar) {
        this.f3114d.a(iVar.a());
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(iVar.a()).find()) {
            return;
        }
        this.f3113c = true;
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3112a;
    }

    @Override // ho.a, ho.d
    public void h() {
        this.f3112a.p(this.f3114d.b());
        this.f3114d = null;
    }

    public n(Pattern pattern) {
        this.f3112a = new eo.k();
        this.f3113c = false;
        this.f3114d = new ao.a();
        this.b = pattern;
    }
}
