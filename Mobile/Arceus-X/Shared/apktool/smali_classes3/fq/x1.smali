.class public final synthetic Lfq/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

.field public final synthetic b:Lkn/a;

.field public final synthetic c:Lfq/k2;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/x1;->a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    iput-object p2, p0, Lfq/x1;->b:Lkn/a;

    iput-object p3, p0, Lfq/x1;->c:Lfq/k2;

    iput-object p4, p0, Lfq/x1;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lfq/x1;->a:Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    iget-object v1, p0, Lfq/x1;->b:Lkn/a;

    iget-object v2, p0, Lfq/x1;->c:Lfq/k2;

    iget-object v3, p0, Lfq/x1;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lfq/k2;->n(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
