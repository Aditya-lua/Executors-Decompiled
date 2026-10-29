.class public final synthetic Lyp/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic c:Lym/k$a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/c4;->a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    iput-object p2, p0, Lyp/c4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p3, p0, Lyp/c4;->c:Lym/k$a;

    iput-object p4, p0, Lyp/c4;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    iput-object p5, p0, Lyp/c4;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyp/c4;->a:Lcom/withpersona/sdk2/inquiry/selfie/e$c;

    iget-object v1, p0, Lyp/c4;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v2, p0, Lyp/c4;->c:Lym/k$a;

    iget-object v3, p0, Lyp/c4;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    iget-object v4, p0, Lyp/c4;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    move-object v5, p1

    check-cast v5, Lym/r$c;

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
