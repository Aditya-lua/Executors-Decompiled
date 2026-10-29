.class public abstract Lf1/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/b2$a;,
        Lf1/b2$d;,
        Lf1/b2$e;,
        Lf1/b2$b;,
        Lf1/b2$c;
    }
.end annotation


# instance fields
.field public final a:Lf1/u;

.field public final b:Lf1/f1;


# direct methods
.method public constructor <init>(Lf1/u;Lf1/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/u;

    iput-object p1, p0, Lf1/b2;->a:Lf1/u;

    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/f1;

    iput-object p1, p0, Lf1/b2;->b:Lf1/f1;

    return-void
.end method

.method public static a(Lf1/u;Lf1/f1;Lf1/v;)Lf1/b2$a;
    .locals 6

    new-instance v0, Lf1/b2$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lf1/b2$a;-><init>(Lf1/u;Lf1/f1;Lf1/v;ILjava/lang/Throwable;)V

    return-object v0
.end method

.method public static b(Lf1/u;Lf1/f1;Lf1/v;ILjava/lang/Throwable;)Lf1/b2$a;
    .locals 8

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "An error type is required."

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    new-instance v2, Lf1/b2$a;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lf1/b2$a;-><init>(Lf1/u;Lf1/f1;Lf1/v;ILjava/lang/Throwable;)V

    return-object v2
.end method

.method public static d(Lf1/u;Lf1/f1;)Lf1/b2$b;
    .locals 1

    new-instance v0, Lf1/b2$b;

    invoke-direct {v0, p0, p1}, Lf1/b2$b;-><init>(Lf1/u;Lf1/f1;)V

    return-object v0
.end method

.method public static e(Lf1/u;Lf1/f1;)Lf1/b2$c;
    .locals 1

    new-instance v0, Lf1/b2$c;

    invoke-direct {v0, p0, p1}, Lf1/b2$c;-><init>(Lf1/u;Lf1/f1;)V

    return-object v0
.end method

.method public static f(Lf1/u;Lf1/f1;)Lf1/b2$d;
    .locals 1

    new-instance v0, Lf1/b2$d;

    invoke-direct {v0, p0, p1}, Lf1/b2$d;-><init>(Lf1/u;Lf1/f1;)V

    return-object v0
.end method

.method public static g(Lf1/u;Lf1/f1;)Lf1/b2$e;
    .locals 1

    new-instance v0, Lf1/b2$e;

    invoke-direct {v0, p0, p1}, Lf1/b2$e;-><init>(Lf1/u;Lf1/f1;)V

    return-object v0
.end method


# virtual methods
.method public c()Lf1/u;
    .locals 1

    iget-object v0, p0, Lf1/b2;->a:Lf1/u;

    return-object v0
.end method
