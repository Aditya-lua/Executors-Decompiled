.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->p(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->b:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->a:I

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->H(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V

    return-void
.end method
