.class public final synthetic Lrp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/k;->a:Lym/k$a;

    iput-object p2, p0, Lrp/k;->b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrp/k;->a:Lym/k$a;

    iget-object v1, p0, Lrp/k;->b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;->n(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
