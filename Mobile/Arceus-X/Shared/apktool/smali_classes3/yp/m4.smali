.class public final synthetic Lyp/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/m4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyp/m4;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    check-cast p1, Lym/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
