.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->o(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$16;->b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-object p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$16;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$16;->b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$16;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->y(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V

    return-void
.end method
