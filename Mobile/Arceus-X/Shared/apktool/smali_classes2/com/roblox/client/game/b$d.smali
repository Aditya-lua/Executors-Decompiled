.class public Lcom/roblox/client/game/b$d;
.super Leh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leh/b<",
        "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lcom/roblox/client/game/b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    invoke-direct {p0, p2}, Leh/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/b$d;->f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/b$d;->e:Lcom/roblox/client/game/b;

    invoke-static {v0}, Lcom/roblox/client/game/b;->n(Lcom/roblox/client/game/b;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/game/b$d$a;

    invoke-direct {v1, p0, p1}, Lcom/roblox/client/game/b$d$a;-><init>(Lcom/roblox/client/game/b$d;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
