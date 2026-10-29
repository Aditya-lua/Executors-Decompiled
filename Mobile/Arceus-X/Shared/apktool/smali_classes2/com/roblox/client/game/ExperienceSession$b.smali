.class public Lcom/roblox/client/game/ExperienceSession$b;
.super Lcom/roblox/engine/jni/EngineExitJavaCallback2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/ExperienceSession;->j0(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession$b;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p0}, Lcom/roblox/engine/jni/EngineExitJavaCallback2;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "... (onCreate) gameDidLeave callback invoked."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$b;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0}, Lcom/roblox/client/game/ExperienceSession;->z(Lcom/roblox/client/game/ExperienceSession;)V

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession$b;->a:Lcom/roblox/client/game/ExperienceSession;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/ExperienceSession;->T(Z)V

    return-void
.end method
