.class public final Ljv/b;
.super Ljv/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljv/b$d;,
        Ljv/b$a;,
        Ljv/b$c;,
        Ljv/b$b;,
        Ljv/b$e;,
        Ljv/b$f;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljv/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    const-class p2, Lokhttp3/RequestBody;

    invoke-static {p1}, Ljv/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljv/b$b;->a:Ljv/b$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljv/y;",
            ")",
            "Ljv/h<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    const-class p3, Lokhttp3/ResponseBody;

    if-ne p1, p3, :cond_1

    const-class p1, Lmv/w;

    invoke-static {p2, p1}, Ljv/c0;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljv/b$c;->a:Ljv/b$c;

    return-object p1

    :cond_0
    sget-object p1, Ljv/b$a;->a:Ljv/b$a;

    return-object p1

    :cond_1
    const-class p2, Ljava/lang/Void;

    if-ne p1, p2, :cond_2

    sget-object p1, Ljv/b$f;->a:Ljv/b$f;

    return-object p1

    :cond_2
    invoke-static {p1}, Ljv/c0;->m(Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ljv/b$e;->a:Ljv/b$e;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
