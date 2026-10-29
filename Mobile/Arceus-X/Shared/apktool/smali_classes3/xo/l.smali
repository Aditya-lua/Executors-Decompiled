.class public final synthetic Lxo/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

.field public final synthetic c:Lxo/a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lxo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/l;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

    iput-object p2, p0, Lxo/l;->b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    iput-object p3, p0, Lxo/l;->c:Lxo/a;

    iput-object p4, p0, Lxo/l;->d:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lxo/l;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

    iget-object v1, p0, Lxo/l;->b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    iget-object v2, p0, Lxo/l;->c:Lxo/a;

    iget-object v3, p0, Lxo/l;->d:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/a$b;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;->l(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lxo/a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lcom/withpersona/sdk2/inquiry/integration/a$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
