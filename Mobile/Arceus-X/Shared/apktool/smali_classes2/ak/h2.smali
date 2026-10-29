.class public final synthetic Lak/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:[B

.field public final synthetic b:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;


# direct methods
.method public synthetic constructor <init>([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/h2;->a:[B

    iput-object p2, p0, Lak/h2;->b:Lcom/roblox/client/startup/NativeHelper;

    iput-wide p3, p0, Lak/h2;->c:J

    iput-boolean p5, p0, Lak/h2;->d:Z

    iput-object p6, p0, Lak/h2;->e:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lak/h2;->a:[B

    iget-object v1, p0, Lak/h2;->b:Lcom/roblox/client/startup/NativeHelper;

    iget-wide v2, p0, Lak/h2;->c:J

    iget-boolean v4, p0, Lak/h2;->d:Z

    iget-object v5, p0, Lak/h2;->e:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/startup/NativeHelper;->r([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method
