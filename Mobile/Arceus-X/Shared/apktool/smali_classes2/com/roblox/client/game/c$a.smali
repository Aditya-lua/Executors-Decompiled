.class public Lcom/roblox/client/game/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/c;->k(Landroid/app/Activity;Lwh/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lwh/j0;

.field public final synthetic c:Lcom/roblox/client/game/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/c;Landroid/app/Activity;Lwh/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/game/c$a;->c:Lcom/roblox/client/game/c;

    iput-object p2, p0, Lcom/roblox/client/game/c$a;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/roblox/client/game/c$a;->b:Lwh/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/game/c$a;->a:Landroid/app/Activity;

    check-cast v0, Le4/q;

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/c$a;->a:Landroid/app/Activity;

    check-cast v1, Le4/q;

    invoke-virtual {v1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    const-class v2, Lrh/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v1

    const-string v2, "Gaming protocol is trying to send launch request when game is running."

    const-string v3, "GameManager"

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    invoke-virtual {v4}, Landroidx/fragment/app/h;->g()I

    goto :goto_0

    :cond_0
    invoke-static {v3, v2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v1, p0, Lcom/roblox/client/game/c$a;->c:Lcom/roblox/client/game/c;

    invoke-static {v1}, Lcom/roblox/client/game/c;->b(Lcom/roblox/client/game/c;)Lcom/roblox/client/game/ExperienceSession;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/game/c$a;->c:Lcom/roblox/client/game/c;

    iget-object v1, p0, Lcom/roblox/client/game/c$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roblox/client/game/c$a;->b:Lwh/j0;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/game/c;->d(Lcom/roblox/client/game/c;Landroid/content/Context;Lwh/j0;)Lcom/roblox/client/game/ExperienceSession;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/c$a;->c:Lcom/roblox/client/game/c;

    invoke-static {v1, v0}, Lcom/roblox/client/game/c;->c(Lcom/roblox/client/game/c;Lcom/roblox/client/game/ExperienceSession;)V

    iget-object v1, p0, Lcom/roblox/client/game/c$a;->a:Landroid/app/Activity;

    check-cast v1, Lcom/roblox/client/game/ExperienceSession$d;

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/ExperienceSession;->i0(Lcom/roblox/client/game/ExperienceSession$d;)V

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->l0()V

    return-void

    :cond_1
    invoke-static {v3, v2}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
