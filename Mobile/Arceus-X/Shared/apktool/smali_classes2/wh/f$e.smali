.class public Lwh/f$e;
.super Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic b:Lwh/f;


# direct methods
.method public constructor <init>(Lwh/f;Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 0

    iput-object p1, p0, Lwh/f$e;->b:Lwh/f;

    invoke-direct {p0, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;-><init>(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "APP_READY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/f$e;->b:Lwh/f;

    invoke-virtual {v0, p2}, Lwh/f;->q(Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
