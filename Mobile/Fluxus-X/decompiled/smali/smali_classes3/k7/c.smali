.class public Lk7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lk7/a;
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lt7/m;->f(Landroid/content/Context;)F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lk7/a;->b:Lk7/a;

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lk7/a;->a:Lk7/a;

    return-object p1
.end method
