.class public Lmi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:I


# instance fields
.field public a:Landroid/view/ViewGroup;

.field public b:Landroid/view/View;

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Lwh/t0;

.field public f:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->displayCutout()I

    move-result v1

    or-int/2addr v0, v1

    sput v0, Lmi/c;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwh/t0;->b:Lwh/t0;

    iput-object v0, p0, Lmi/c;->e:Lwh/t0;

    return-void
.end method

.method public static synthetic a(Lmi/c;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmi/c;->k(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lmi/c;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lmi/c;->f:Landroid/graphics/Rect;

    return-void
.end method

.method public static bridge synthetic c(Lmi/c;)V
    .locals 0

    invoke-virtual {p0}, Lmi/c;->d()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    iget-object v0, p0, Lmi/c;->e:Lwh/t0;

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v0}, Lmi/c;->e(IIII)V

    return-void

    :cond_0
    iget-object v0, p0, Lmi/c;->f:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v1, v2, v3, v0}, Lmi/c;->e(IIII)V

    :cond_1
    return-void
.end method

.method public e(IIII)V
    .locals 5

    iget-object v0, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Insets: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", mode: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lmi/c;->e:Lwh/t0;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "AppInsetViewAdapter"

    invoke-static {v0, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    iget v0, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget v3, p2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    if-eq v3, p3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    iget v4, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    if-eq v4, p4, :cond_3

    move v1, v2

    :cond_3
    if-nez v0, :cond_4

    if-nez v3, :cond_4

    if-eqz v1, :cond_5

    :cond_4
    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p3, p2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iput p4, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    iget-object v2, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    invoke-virtual {v2, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    iget-object p2, p0, Lmi/c;->b:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v0, :cond_6

    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object p1, p0, Lmi/c;->b:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    iget-object p1, p0, Lmi/c;->c:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v3, :cond_7

    iput p3, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget-object p2, p0, Lmi/c;->c:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_7
    iget-object p1, p0, Lmi/c;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_8

    iput p4, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object p2, p0, Lmi/c;->d:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    :goto_2
    return-void
.end method

.method public f(Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;
    .locals 0

    sget-object p1, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    return-object p1
.end method

.method public g()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final h(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 2

    sget v0, Lsg/n0;->p:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    sget v0, Lsg/m0;->O:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    sget v0, Lsg/m0;->Q:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lmi/c;->b:Landroid/view/View;

    sget v0, Lsg/m0;->P:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lmi/c;->c:Landroid/view/View;

    sget v0, Lsg/m0;->N:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lmi/c;->d:Landroid/view/View;

    return-object p1
.end method

.method public i(Landroid/view/LayoutInflater;Landroidx/fragment/app/c;)Landroid/view/View;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "inflate: Fragment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppInsetViewAdapter"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lmi/c;->h(Landroid/view/LayoutInflater;)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/b;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lmi/c;->n(Landroidx/lifecycle/s;Lmi/a;)V

    return-object p1

    :cond_0
    instance-of v1, v0, Lcom/roblox/client/startup/MainGameActivity;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->k2()Lmi/a;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lmi/c;->n(Landroidx/lifecycle/s;Lmi/a;)V

    :cond_1
    return-object p1
.end method

.method public j(Landroid/view/LayoutInflater;Lcom/roblox/client/b;)Landroid/view/View;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "inflate: Activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppInsetViewAdapter"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lmi/c;->h(Landroid/view/LayoutInflater;)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lmi/c;->n(Landroidx/lifecycle/s;Lmi/a;)V

    :cond_0
    return-object p1
.end method

.method public final synthetic k(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 6

    sget p1, Lmi/c;->g:I

    invoke-virtual {p2, p1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroidx/core/graphics/Insets;->left:I

    iget v3, v0, Landroidx/core/graphics/Insets;->top:I

    iget v4, v0, Landroidx/core/graphics/Insets;->right:I

    iget v5, v0, Landroidx/core/graphics/Insets;->bottom:I

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Lmi/c;->f:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lmi/c;->d()V

    iget-object v1, p0, Lmi/c;->e:Lwh/t0;

    sget-object v2, Lwh/t0;->a:Lwh/t0;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lmi/c;->f(Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;

    move-result-object v0

    :goto_0
    new-instance v1, Landroidx/core/view/WindowInsetsCompat$Builder;

    invoke-direct {v1, p2}, Landroidx/core/view/WindowInsetsCompat$Builder;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    invoke-virtual {v1, p1, v0}, Landroidx/core/view/WindowInsetsCompat$Builder;->setInsets(ILandroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat$Builder;->build()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method

.method public l(I)V
    .locals 1

    iget-object v0, p0, Lmi/c;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lmi/b;

    invoke-direct {v1, p0}, Lmi/b;-><init>(Lmi/c;)V

    invoke-static {v0, v1}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    iget-object v0, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    return-void
.end method

.method public final n(Landroidx/lifecycle/s;Lmi/a;)V
    .locals 1
    .param p2    # Lmi/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->t5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lmi/c;->m()V

    return-void

    :cond_0
    invoke-virtual {p2}, Lmi/a;->b()Landroidx/lifecycle/d0;

    move-result-object p2

    new-instance v0, Lmi/c$a;

    invoke-direct {v0, p0}, Lmi/c$a;-><init>(Lmi/c;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    return-void
.end method

.method public o(Lwh/t0;)V
    .locals 0

    iput-object p1, p0, Lmi/c;->e:Lwh/t0;

    invoke-virtual {p0}, Lmi/c;->d()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->t5()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmi/c;->a:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroidx/core/view/o0;->j0(Landroid/view/View;)V

    :cond_0
    return-void
.end method
