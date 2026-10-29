.class public final synthetic Lyo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

.field public final synthetic c:Lxo/a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/fragment/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lxo/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/g;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    iput-object p2, p0, Lyo/g;->b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    iput-object p3, p0, Lyo/g;->c:Lxo/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lyo/g;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    iget-object v1, p0, Lyo/g;->b:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;

    iget-object v2, p0, Lyo/g;->c:Lxo/a;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/a$b;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/b;->h(Lcom/withpersona/sdk2/inquiry/integration/fragment/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lxo/a;Lcom/withpersona/sdk2/inquiry/integration/a$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
