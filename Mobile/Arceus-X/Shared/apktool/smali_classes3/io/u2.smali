.class public final synthetic Lio/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

.field public final synthetic e:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/u2;->a:Lym/k$a;

    iput-object p2, p0, Lio/u2;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p3, p0, Lio/u2;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iput-object p4, p0, Lio/u2;->d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    iput-object p5, p0, Lio/u2;->e:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/u2;->a:Lym/k$a;

    iget-object v1, p0, Lio/u2;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v2, p0, Lio/u2;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    iget-object v3, p0, Lio/u2;->d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    iget-object v4, p0, Lio/u2;->e:Luo/l;

    move-object v5, p1

    check-cast v5, Lym/r$c;

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->a(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Luo/l;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
