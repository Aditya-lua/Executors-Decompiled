.class public Lj7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lj7/a;
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {p1}, Ls7/m;->f(Landroid/content/Context;)F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lj7/a;->b:Lj7/a;

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lj7/a;->a:Lj7/a;

    return-object p1
.end method
