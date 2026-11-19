.class public Lej/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbn/k$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Lej/a;
    .locals 1

    invoke-static {}, Lej/a$a;->a()Lej/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;ZZ)V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Context;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Landroid/content/Context;Z)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Landroid/content/Context;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
