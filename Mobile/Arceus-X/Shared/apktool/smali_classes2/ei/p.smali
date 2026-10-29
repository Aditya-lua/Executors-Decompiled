.class public Lei/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljj/x;

    invoke-direct {v1}, Ljj/x;-><init>()V

    invoke-virtual {v1, p0, v0}, Ljj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v0

    invoke-interface {v0}, Lvk/d;->g()Lzk/j;

    move-result-object v0

    new-instance v1, Lal/a;

    invoke-direct {v1, p0, p1}, Lal/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lzk/j;->e(Lal/a;)Ljv/d;

    move-result-object p0

    new-instance p1, Lei/p$a;

    invoke-direct {p1}, Lei/p$a;-><init>()V

    invoke-interface {p0, p1}, Ljv/d;->B(Ljv/f;)V

    return-void
.end method
