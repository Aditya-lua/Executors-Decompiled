.class public final synthetic Lfq/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/s1;->a:Lfq/k2;

    iput-object p2, p0, Lfq/s1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    iput-object p3, p0, Lfq/s1;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfq/s1;->a:Lfq/k2;

    iget-object v1, p0, Lfq/s1;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    iget-object v2, p0, Lfq/s1;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    invoke-static {v0, v1, v2, p1}, Lfq/k2;->C0(Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
