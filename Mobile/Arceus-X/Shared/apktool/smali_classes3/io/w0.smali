.class public final synthetic Lio/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/w0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lio/w0;->b:Lym/k$a;

    iput-object p3, p0, Lio/w0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/w0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lio/w0;->b:Lym/k$a;

    iget-object v2, p0, Lio/w0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->u(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
