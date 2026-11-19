.class public Lbo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lgo/d;Lgo/i;Ljava/lang/String;Ljava/lang/String;)Lgo/f;
    .locals 1

    invoke-interface {p0}, Lgo/d;->a()Leo/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lgo/d;->a()Leo/b0;

    move-result-object p0

    invoke-virtual {p0}, Leo/b0;->o()Ljava/lang/String;

    move-result-object p0

    const-string v0, "!"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Leo/m;

    invoke-direct {p0, p2, p3}, Leo/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object p1

    invoke-static {p0, p1}, Lgo/f;->b(Leo/s;Lgo/h;)Lgo/f;

    move-result-object p0

    invoke-interface {p0}, Lgo/f;->c()Lgo/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Leo/o;

    invoke-direct {p0, p2, p3}, Leo/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object p1

    invoke-static {p0, p1}, Lgo/f;->b(Leo/s;Lgo/h;)Lgo/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lgo/d;Lgo/i;Lfo/c;)Lgo/f;
    .locals 2

    invoke-interface {p1}, Lgo/d;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lgo/d;->e()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1}, Lgo/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lbo/g;->b(Lgo/d;Lgo/i;Ljava/lang/String;Ljava/lang/String;)Lgo/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lgo/d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lgo/d;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-class v1, Leo/p;

    invoke-interface {p3, v1, v0}, Lfo/c;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Leo/p;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Leo/p;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Leo/p;->r()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, v0, p3}, Lbo/g;->b(Lgo/d;Lgo/i;Ljava/lang/String;Ljava/lang/String;)Lgo/f;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lgo/f;->a()Lgo/f;

    move-result-object p1

    return-object p1
.end method
