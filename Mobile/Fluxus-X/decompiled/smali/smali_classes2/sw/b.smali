.class public final Lsw/b;
.super Lsw/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw/b$d;,
        Lsw/b$a;,
        Lsw/b$c;,
        Lsw/b$b;,
        Lsw/b$e;,
        Lsw/b$f;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsw/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lsw/y;)Lsw/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lsw/y;",
            ")",
            "Lsw/h<",
            "*",
            "Lmv/g0;",
            ">;"
        }
    .end annotation

    const-class p2, Lmv/g0;

    invoke-static {p1}, Lsw/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lsw/b$b;->a:Lsw/b$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lsw/y;)Lsw/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lsw/y;",
            ")",
            "Lsw/h<",
            "Lmv/i0;",
            "*>;"
        }
    .end annotation

    const-class p3, Lmv/i0;

    if-ne p1, p3, :cond_1

    const-class p1, Lvw/w;

    invoke-static {p2, p1}, Lsw/c0;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lsw/b$c;->a:Lsw/b$c;

    return-object p1

    :cond_0
    sget-object p1, Lsw/b$a;->a:Lsw/b$a;

    return-object p1

    :cond_1
    const-class p2, Ljava/lang/Void;

    if-ne p1, p2, :cond_2

    sget-object p1, Lsw/b$f;->a:Lsw/b$f;

    return-object p1

    :cond_2
    invoke-static {p1}, Lsw/c0;->m(Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lsw/b$e;->a:Lsw/b$e;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
