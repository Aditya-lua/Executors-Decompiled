.class public final synthetic Lio/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/e0;->a:Lym/k$a;

    iput-object p2, p0, Lio/e0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p3, p0, Lio/e0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p4, p0, Lio/e0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/e0;->a:Lym/k$a;

    iget-object v1, p0, Lio/e0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v2, p0, Lio/e0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v3, p0, Lio/e0;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->l(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
