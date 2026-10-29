.class public Lzj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/regex/Pattern;

.field public final b:Lkm/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkm/a;

    invoke-direct {v0, p1}, Lkm/a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lzj/b;->b:Lkm/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lzj/b;->b:Lkm/a;

    invoke-virtual {v0, p1, p2, p3}, Lkm/a;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lzj/b;->a:Ljava/util/regex/Pattern;

    if-nez v0, :cond_0

    const-string v0, "(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lzj/b;->a:Ljava/util/regex/Pattern;

    :cond_0
    iget-object v0, p0, Lzj/b;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method
