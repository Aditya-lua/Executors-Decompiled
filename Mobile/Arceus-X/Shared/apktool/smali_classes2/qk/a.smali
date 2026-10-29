.class public Lqk/a;
.super Lcom/roblox/engine/jni/model/PlatformParams;
.source "SourceFile"


# instance fields
.field public isLuaChatEnabled:Z

.field public isLuaGamesPageEnabled:Z

.field public isLuaHomePageEnabled:Z

.field public isTablet:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lqk/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    return-void
.end method

.method public constructor <init>(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lqk/a;->a(Lcom/roblox/engine/jni/model/PlatformParams;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/model/PlatformParams;->a(Lcom/roblox/engine/jni/model/PlatformParams;)V

    instance-of v0, p1, Lqk/a;

    if-eqz v0, :cond_0

    check-cast p1, Lqk/a;

    invoke-virtual {p0, p1}, Lqk/a;->b(Lqk/a;)V

    :cond_0
    return-void
.end method

.method public final b(Lqk/a;)V
    .locals 1

    iget-boolean v0, p1, Lqk/a;->isLuaHomePageEnabled:Z

    iput-boolean v0, p0, Lqk/a;->isLuaHomePageEnabled:Z

    iget-boolean v0, p1, Lqk/a;->isLuaGamesPageEnabled:Z

    iput-boolean v0, p0, Lqk/a;->isLuaGamesPageEnabled:Z

    iget-boolean v0, p1, Lqk/a;->isLuaChatEnabled:Z

    iput-boolean v0, p0, Lqk/a;->isLuaChatEnabled:Z

    iget-boolean p1, p1, Lqk/a;->isTablet:Z

    iput-boolean p1, p0, Lqk/a;->isTablet:Z

    return-void
.end method
