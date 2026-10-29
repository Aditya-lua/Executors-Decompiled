.class public Lei/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v0

    invoke-interface {v0}, Lvk/d;->g()Lzk/j;

    move-result-object v0

    new-instance v1, Lal/b;

    invoke-direct {v1, p0, p1, p2}, Lal/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lzk/j;->i(Lal/b;)Ljv/d;

    move-result-object p0

    new-instance p1, Lei/o$a;

    invoke-direct {p1}, Lei/o$a;-><init>()V

    invoke-interface {p0, p1}, Ljv/d;->B(Ljv/f;)V

    return-void
.end method
