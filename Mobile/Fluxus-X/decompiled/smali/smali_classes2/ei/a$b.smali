.class public Lei/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/a;->L2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lei/a;


# direct methods
.method public constructor <init>(Lei/a;)V
    .locals 0

    iput-object p1, p0, Lei/a$b;->a:Lei/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    iget-object v0, p0, Lei/a$b;->a:Lei/a;

    invoke-virtual {v0}, Lf4/q;->p0()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-nez v0, :cond_0

    const-string v0, "onGlobalLayout() fragment not attached"

    invoke-static {v1, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lei/a$b;->a:Lei/a;

    invoke-static {v0}, Lei/a;->D2(Lei/a;)Lvk/a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lvk/a;->d(Z)V

    iget-object v0, p0, Lei/a$b;->a:Lei/a;

    invoke-virtual {v0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lei/a$b;->a:Lei/a;

    invoke-virtual {v0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    sget v2, Lbh/m0;->e:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v3, v4, :cond_3

    :cond_1
    const-string v3, "Resetting surface container\'s layout."

    invoke-static {v1, v3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_2
    const-string v0, "Surface view not found! Cannot reset its layout."

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method
