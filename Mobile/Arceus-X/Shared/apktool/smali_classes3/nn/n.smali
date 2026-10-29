.class public Lnn/n;
.super Ltn/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/n$a;
    }
.end annotation


# static fields
.field public static final e:[[Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lqn/k;

.field public final b:Ljava/util/regex/Pattern;

.field public c:Z

.field public d:Lnn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x0

    filled-new-array {v0, v0}, [Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "^<(?:script|pre|style|textarea)(?:\\s|>|$)"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v4, "</(?:script|pre|style|textarea)>"

    invoke-static {v4, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v4, "^<!--"

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v5, "-->"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v5, "^<[?]"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v6, "\\?>"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v6, "^<![A-Z]"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    const-string v7, ">"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/util/regex/Pattern;

    move-result-object v6

    const-string v7, "^<!\\[CDATA\\["

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    const-string v8, "\\]\\]>"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    filled-new-array {v7, v8}, [Ljava/util/regex/Pattern;

    move-result-object v7

    const-string v8, "^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)"

    invoke-static {v8, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v8

    filled-new-array {v8, v0}, [Ljava/util/regex/Pattern;

    move-result-object v8

    const-string v9, "^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"\'=<>`\\x00-\\x20]+|\'[^\']*\'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$"

    invoke-static {v9, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    filled-new-array {v3, v0}, [Ljava/util/regex/Pattern;

    move-result-object v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v0

    filled-new-array/range {v1 .. v8}, [[Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lnn/n;->e:[[Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ltn/a;-><init>()V

    .line 3
    new-instance v0, Lqn/k;

    invoke-direct {v0}, Lqn/k;-><init>()V

    iput-object v0, p0, Lnn/n;->a:Lqn/k;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lnn/n;->c:Z

    .line 5
    new-instance v0, Lnn/a;

    invoke-direct {v0}, Lnn/a;-><init>()V

    iput-object v0, p0, Lnn/n;->d:Lnn/a;

    .line 6
    iput-object p1, p0, Lnn/n;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/regex/Pattern;Lnn/o;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnn/n;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public static bridge synthetic k()[[Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lnn/n;->e:[[Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public b(Ltn/h;)Ltn/c;
    .locals 1

    iget-boolean v0, p0, Lnn/n;->c:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ltn/h;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnn/n;->b:Ljava/util/regex/Pattern;

    if-nez v0, :cond_1

    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p1}, Ltn/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Ltn/c;->b(I)Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lqn/a;
    .locals 1

    iget-object v0, p0, Lnn/n;->a:Lqn/k;

    return-object v0
.end method

.method public g(Lrn/i;)V
    .locals 2

    iget-object v0, p0, Lnn/n;->d:Lnn/a;

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnn/a;->a(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnn/n;->b:Ljava/util/regex/Pattern;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnn/n;->c:Z

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lnn/n;->a:Lqn/k;

    iget-object v1, p0, Lnn/n;->d:Lnn/a;

    invoke-virtual {v1}, Lnn/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/k;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lnn/n;->d:Lnn/a;

    return-void
.end method
