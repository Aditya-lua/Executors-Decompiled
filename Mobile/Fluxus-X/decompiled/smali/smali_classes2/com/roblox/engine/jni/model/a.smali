.class public Lcom/roblox/engine/jni/model/a;
.super Lcom/roblox/engine/jni/model/PlatformParams;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    invoke-virtual {p0, p1}, Lcom/roblox/engine/jni/model/a;->copy(Lcom/roblox/engine/jni/model/PlatformParams;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roblox/engine/jni/model/a;)V
    .locals 1

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/a;->a:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/a;->a:Z

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/a;->b:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/a;->b:Z

    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/a;->c:Z

    iput-boolean v0, p0, Lcom/roblox/engine/jni/model/a;->c:Z

    iget-boolean p1, p1, Lcom/roblox/engine/jni/model/a;->d:Z

    iput-boolean p1, p0, Lcom/roblox/engine/jni/model/a;->d:Z

    return-void
.end method

.method public copy(Lcom/roblox/engine/jni/model/PlatformParams;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/model/PlatformParams;->copy(Lcom/roblox/engine/jni/model/PlatformParams;)V

    instance-of v0, p1, Lcom/roblox/engine/jni/model/a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/roblox/engine/jni/model/a;

    invoke-virtual {p0, p1}, Lcom/roblox/engine/jni/model/a;->a(Lcom/roblox/engine/jni/model/a;)V

    :cond_0
    return-void
.end method
