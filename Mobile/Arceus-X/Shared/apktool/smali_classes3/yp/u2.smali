.class public final synthetic Lyp/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/u2;->a:Lym/k$a;

    iput-object p2, p0, Lyp/u2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p3, p0, Lyp/u2;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyp/u2;->a:Lym/k$a;

    iget-object v1, p0, Lyp/u2;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v2, p0, Lyp/u2;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->T0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
