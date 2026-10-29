.class public Landroidx/core/view/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/f0$b;,
        Landroidx/core/view/f0$d;,
        Landroidx/core/view/f0$c;
    }
.end annotation


# instance fields
.field public final a:Landroidx/core/view/f0$d;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/view/f0$b;

    invoke-direct {v0, p1}, Landroidx/core/view/f0$b;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroidx/core/view/f0;->a:Landroidx/core/view/f0$d;

    return-void

    :cond_0
    new-instance p1, Landroidx/core/view/f0$c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Landroidx/core/view/f0$c;-><init>(Landroidx/core/view/f0$a;)V

    iput-object p1, p0, Landroidx/core/view/f0;->a:Landroidx/core/view/f0$d;

    return-void
.end method

.method public static a(Landroid/view/View;)Landroidx/core/view/f0;
    .locals 1

    new-instance v0, Landroidx/core/view/f0;

    invoke-direct {v0, p0}, Landroidx/core/view/f0;-><init>(Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public b(IIIZ)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/f0;->a:Landroidx/core/view/f0$d;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/core/view/f0$d;->onScrollLimit(IIIZ)V

    return-void
.end method

.method public c(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/f0;->a:Landroidx/core/view/f0$d;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/core/view/f0$d;->onScrollProgress(IIII)V

    return-void
.end method
