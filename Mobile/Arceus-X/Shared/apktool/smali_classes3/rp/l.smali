.class public final synthetic Lrp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/l;->a:Lym/k$a;

    iput-object p2, p0, Lrp/l;->b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iput-object p3, p0, Lrp/l;->c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lrp/l;->a:Lym/k$a;

    iget-object v1, p0, Lrp/l;->b:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;

    iget-object v2, p0, Lrp/l;->c:Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;->l(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
