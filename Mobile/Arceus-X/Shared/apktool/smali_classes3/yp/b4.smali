.class public final synthetic Lyp/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

.field public final synthetic d:Lcom/withpersona/sdk2/camera/CameraProperties;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/b4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p2, p0, Lyp/b4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p3, p0, Lyp/b4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    iput-object p4, p0, Lyp/b4;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    iput-wide p5, p0, Lyp/b4;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lyp/b4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lyp/b4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lyp/b4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    iget-object v3, p0, Lyp/b4;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    iget-wide v4, p0, Lyp/b4;->e:J

    move-object v6, p1

    check-cast v6, Lym/r$c;

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->V(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;JLym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
