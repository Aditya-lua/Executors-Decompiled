.class public final synthetic Lyp/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic e:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/t4;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iput-object p2, p0, Lyp/t4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    iput-object p3, p0, Lyp/t4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p4, p0, Lyp/t4;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p5, p0, Lyp/t4;->e:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyp/t4;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iget-object v1, p0, Lyp/t4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    iget-object v2, p0, Lyp/t4;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v3, p0, Lyp/t4;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v4, p0, Lyp/t4;->e:Lym/k$a;

    move-object v5, p1

    check-cast v5, Lym/r$c;

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->O(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
