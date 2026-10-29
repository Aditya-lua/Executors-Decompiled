.class public final synthetic Lyp/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

.field public final synthetic b:Lkn/a;

.field public final synthetic c:Lym/k$a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/d1;->a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    iput-object p2, p0, Lyp/d1;->b:Lkn/a;

    iput-object p3, p0, Lyp/d1;->c:Lym/k$a;

    iput-object p4, p0, Lyp/d1;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p5, p0, Lyp/d1;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyp/d1;->a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    iget-object v1, p0, Lyp/d1;->b:Lkn/a;

    iget-object v2, p0, Lyp/d1;->c:Lym/k$a;

    iget-object v3, p0, Lyp/d1;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v4, p0, Lyp/d1;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->I0(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
