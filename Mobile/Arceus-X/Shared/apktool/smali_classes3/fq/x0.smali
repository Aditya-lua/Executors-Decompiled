.class public final synthetic Lfq/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/x0;->a:Lfq/k2;

    iput-object p2, p0, Lfq/x0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    iput-object p3, p0, Lfq/x0;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/x0;->a:Lfq/k2;

    iget-object v1, p0, Lfq/x0;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    iget-object v2, p0, Lfq/x0;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-static {v0, v1, v2}, Lfq/k2;->M0(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
