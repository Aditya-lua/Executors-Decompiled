.class public Lcom/roblox/client/components/LoadingBar;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/components/LoadingBar$b;,
        Lcom/roblox/client/components/LoadingBar$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/roblox/client/components/LoadingBar;->e()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/LoadingBar;->c(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/LoadingBar;->d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x320

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method public final d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;
    .locals 3

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x320

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lsg/n0;->q:I

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    sget v1, Lsg/m0;->t:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    sget v1, Lsg/m0;->u:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    sget v1, Lsg/m0;->v:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/roblox/client/components/LoadingBar;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    new-instance v3, Lcom/roblox/client/components/LoadingBar$b;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/roblox/client/components/LoadingBar$b;-><init>(Lcom/roblox/client/components/LoadingBar;Leh/c;)V

    new-instance v5, Lcom/roblox/client/components/LoadingBar$a;

    invoke-direct {v5, p0, v4}, Lcom/roblox/client/components/LoadingBar$a;-><init>(Lcom/roblox/client/components/LoadingBar;Leh/c;)V

    invoke-virtual {v5, v2}, Lcom/roblox/client/components/LoadingBar$a;->a(Landroid/widget/ImageView;)V

    iput-object v3, v5, Lcom/roblox/client/components/LoadingBar$a;->b:Lcom/roblox/client/components/LoadingBar$b;

    iput-object v5, v3, Lcom/roblox/client/components/LoadingBar$b;->b:Lcom/roblox/client/components/LoadingBar$a;

    invoke-virtual {v3, v2}, Lcom/roblox/client/components/LoadingBar$b;->a(Landroid/widget/ImageView;)V

    invoke-virtual {p0, v3}, Lcom/roblox/client/components/LoadingBar;->d(Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object v3

    mul-int/lit16 v4, v1, 0x190

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setStartOffset(J)V

    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/roblox/client/components/LoadingBar;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/roblox/client/components/LoadingBar;->b:Z

    invoke-virtual {p0}, Lcom/roblox/client/components/LoadingBar;->f()V

    :cond_0
    return-void
.end method
