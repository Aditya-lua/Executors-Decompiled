.class public Lcom/roblox/client/game/ExperienceSession$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/ExperienceSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lnk/b;
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0}, Lcom/roblox/client/game/ExperienceSession;->x(Lcom/roblox/client/game/ExperienceSession;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v2}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v3}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v3

    check-cast v3, Lcom/roblox/client/a;

    invoke-virtual {v3}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v3

    invoke-virtual {v3}, Lmi/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lnk/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lnk/b;

    move-result-object v0

    return-object v0
.end method
