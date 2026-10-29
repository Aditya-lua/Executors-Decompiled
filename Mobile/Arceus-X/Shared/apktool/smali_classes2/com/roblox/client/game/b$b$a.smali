.class public Lcom/roblox/client/game/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b$b;->f(Lcom/roblox/client/game/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/b$b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$b$a;->a:Lcom/roblox/client/game/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/game/b$b$a;->a:Lcom/roblox/client/game/b$b;

    iget-object v0, v0, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->l(Lcom/roblox/client/game/b;)I

    move-result v0

    iget-object v1, p0, Lcom/roblox/client/game/b$b$a;->a:Lcom/roblox/client/game/b$b;

    iget-object v1, v1, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-static {v1}, Lcom/roblox/client/game/b;->k(Lcom/roblox/client/game/b;)I

    move-result v1

    const-string v2, "rbx.glview.text"

    if-eq v0, v1, :cond_0

    const-string v0, "The Y shift wasn\'t animated in time, force set!"

    invoke-static {v2, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/b$b$a;->a:Lcom/roblox/client/game/b$b;

    iget-object v0, v0, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->l(Lcom/roblox/client/game/b;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roblox/client/game/b;->o(Lcom/roblox/client/game/b;I)V

    iget-object v0, p0, Lcom/roblox/client/game/b$b$a;->a:Lcom/roblox/client/game/b$b;

    iget-object v0, v0, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->l(Lcom/roblox/client/game/b;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/b;->x(I)V

    return-void

    :cond_0
    const-string v0, "Y Shift animated successfully!"

    invoke-static {v2, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
