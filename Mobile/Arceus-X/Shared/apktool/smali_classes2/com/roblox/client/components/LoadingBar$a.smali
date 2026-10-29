.class public Lcom/roblox/client/components/LoadingBar$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/LoadingBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Lcom/roblox/client/components/LoadingBar$b;

.field public final synthetic c:Lcom/roblox/client/components/LoadingBar;


# direct methods
.method public constructor <init>(Lcom/roblox/client/components/LoadingBar;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar$a;->c:Lcom/roblox/client/components/LoadingBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/client/components/LoadingBar;Leh/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/roblox/client/components/LoadingBar$a;-><init>(Lcom/roblox/client/components/LoadingBar;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/LoadingBar$a;->a:Landroid/widget/ImageView;

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/components/LoadingBar$a;->c:Lcom/roblox/client/components/LoadingBar;

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar$a;->b:Lcom/roblox/client/components/LoadingBar$b;

    invoke-static {p1, v0}, Lcom/roblox/client/components/LoadingBar;->b(Lcom/roblox/client/components/LoadingBar;Landroid/view/animation/Animation$AnimationListener;)Landroid/view/animation/AlphaAnimation;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/components/LoadingBar$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
