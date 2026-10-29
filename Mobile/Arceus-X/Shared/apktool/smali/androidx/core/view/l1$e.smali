.class public Landroidx/core/view/l1$e;
.super Landroidx/core/view/l1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroidx/core/view/l1;Landroidx/core/view/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/core/view/l1$d;-><init>(Landroid/view/Window;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;Landroidx/core/view/l1;Landroidx/core/view/i0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/core/view/l1$d;-><init>(Landroid/view/WindowInsetsController;Landroidx/core/view/l1;Landroidx/core/view/i0;)V

    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/l1$d;->b:Landroid/view/WindowInsetsController;

    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V

    return-void
.end method
