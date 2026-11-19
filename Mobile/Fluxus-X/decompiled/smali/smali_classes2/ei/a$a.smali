.class public Lei/a$a;
.super Lvk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/a;->L2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lei/a;


# direct methods
.method public constructor <init>(Lei/a;Landroid/content/Context;Lvk/a$a;)V
    .locals 0

    iput-object p1, p0, Lei/a$a;->d:Lei/a;

    invoke-direct {p0, p2, p3}, Lvk/a;-><init>(Landroid/content/Context;Lvk/a$a;)V

    return-void
.end method


# virtual methods
.method public b()Lvk/b;
    .locals 10

    iget-object v0, p0, Lei/a$a;->d:Lei/a;

    invoke-virtual {v0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/roblox/client/a;

    invoke-virtual {v1}, Lcom/roblox/client/b;->G1()Lui/a;

    move-result-object v1

    iget-object v2, p0, Lei/a$a;->d:Lei/a;

    invoke-static {v2}, Lei/a;->G2(Lei/a;)Landroid/view/SurfaceView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    iget-object v0, p0, Lei/a$a;->d:Lei/a;

    invoke-static {v0}, Lei/a;->B2(Lei/a;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v1}, Lui/a;->d()Landroid/graphics/Rect;

    move-result-object v6

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->B5()Z

    move-result v7

    invoke-virtual {v1}, Lui/a;->f()Z

    move-result v8

    invoke-virtual {v1}, Lui/a;->b()I

    move-result v9

    invoke-static/range {v3 .. v9}, Lvk/b;->c(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;ZZI)Lvk/b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
