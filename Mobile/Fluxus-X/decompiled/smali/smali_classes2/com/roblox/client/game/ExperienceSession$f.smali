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
.method public a()Lvk/b;
    .locals 9

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->K()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->K()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    invoke-virtual {v0}, Lcom/roblox/client/b;->G1()Lui/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v1}, Lcom/roblox/client/game/ExperienceSession;->z(Lcom/roblox/client/game/ExperienceSession;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    iget-object v1, p0, Lcom/roblox/client/game/ExperienceSession$f;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v1}, Lcom/roblox/client/game/ExperienceSession;->K()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-virtual {v0}, Lui/a;->d()Landroid/graphics/Rect;

    move-result-object v5

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->B5()Z

    move-result v6

    invoke-virtual {v0}, Lui/a;->f()Z

    move-result v7

    invoke-virtual {v0}, Lui/a;->b()I

    move-result v8

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Lvk/b;->c(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;ZZI)Lvk/b;

    move-result-object v0

    return-object v0
.end method
