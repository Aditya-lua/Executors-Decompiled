.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->m(JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->d:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-wide p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->a:J

    iput-object p4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->d:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-wide v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->a:J

    iget-object v3, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->D(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
