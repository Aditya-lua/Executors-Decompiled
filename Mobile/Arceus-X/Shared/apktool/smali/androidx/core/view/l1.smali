.class public final Landroidx/core/view/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/l1$f;,
        Landroidx/core/view/l1$g;,
        Landroidx/core/view/l1$d;,
        Landroidx/core/view/l1$c;,
        Landroidx/core/view/l1$b;,
        Landroidx/core/view/l1$a;,
        Landroidx/core/view/l1$e;
    }
.end annotation


# instance fields
.field public final a:Landroidx/core/view/l1$g;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Landroidx/core/view/i0;

    invoke-direct {v0, p2}, Landroidx/core/view/i0;-><init>(Landroid/view/View;)V

    .line 7
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt p2, v1, :cond_0

    .line 8
    new-instance p2, Landroidx/core/view/l1$f;

    invoke-direct {p2, p1, p0, v0}, Landroidx/core/view/l1$f;-><init>(Landroid/view/Window;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    iput-object p2, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt p2, v1, :cond_1

    .line 9
    new-instance p2, Landroidx/core/view/l1$d;

    invoke-direct {p2, p1, p0, v0}, Landroidx/core/view/l1$d;-><init>(Landroid/view/Window;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    iput-object p2, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    return-void

    .line 10
    :cond_1
    new-instance p2, Landroidx/core/view/l1$c;

    invoke-direct {p2, p1, v0}, Landroidx/core/view/l1$c;-><init>(Landroid/view/Window;Landroidx/core/view/i0;)V

    iput-object p2, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/l1$f;

    new-instance v1, Landroidx/core/view/i0;

    invoke-direct {v1, p1}, Landroidx/core/view/i0;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, Landroidx/core/view/l1$f;-><init>(Landroid/view/WindowInsetsController;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    iput-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    return-void

    .line 4
    :cond_0
    new-instance v0, Landroidx/core/view/l1$d;

    new-instance v1, Landroidx/core/view/i0;

    invoke-direct {v1, p1}, Landroidx/core/view/i0;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, Landroidx/core/view/l1$d;-><init>(Landroid/view/WindowInsetsController;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    iput-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    return-void
.end method

.method public static g(Landroid/view/WindowInsetsController;)Landroidx/core/view/l1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Landroidx/core/view/l1;

    invoke-direct {v0, p0}, Landroidx/core/view/l1;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0, p1}, Landroidx/core/view/l1$g;->a(I)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0}, Landroidx/core/view/l1$g;->b()Z

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0, p1}, Landroidx/core/view/l1$g;->c(Z)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0, p1}, Landroidx/core/view/l1$g;->d(Z)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0, p1}, Landroidx/core/view/l1$g;->e(I)V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1;->a:Landroidx/core/view/l1$g;

    invoke-virtual {v0, p1}, Landroidx/core/view/l1$g;->f(I)V

    return-void
.end method
