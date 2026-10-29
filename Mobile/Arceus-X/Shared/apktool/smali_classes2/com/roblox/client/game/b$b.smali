.class public Lcom/roblox/client/game/b$b;
.super Leh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leh/b<",
        "Lcom/roblox/client/game/b$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lcom/roblox/client/game/b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-direct {p0, p2}, Leh/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/roblox/client/game/b$c;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b$b;->f(Lcom/roblox/client/game/b$c;)V

    return-void
.end method

.method public f(Lcom/roblox/client/game/b$c;)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/game/b$b;->e:Lcom/roblox/client/game/b;

    invoke-static {p1}, Lcom/roblox/client/game/b;->n(Lcom/roblox/client/game/b;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/game/b$b$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/game/b$b$a;-><init>(Lcom/roblox/client/game/b$b;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
