.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->q(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Z

.field public final synthetic c:[B

.field public final synthetic d:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field public final synthetic e:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->e:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-wide p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->a:J

    iput-boolean p4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->b:Z

    iput-object p5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->c:[B

    iput-object p6, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->d:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->e:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-wide v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->a:J

    iget-boolean v3, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->b:Z

    iget-object v4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->c:[B

    iget-object v5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->d:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->r(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method
