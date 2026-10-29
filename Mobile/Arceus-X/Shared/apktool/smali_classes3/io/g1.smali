.class public final synthetic Lio/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/g1;->a:Lym/k$a;

    iput-object p2, p0, Lio/g1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/g1;->a:Lym/k$a;

    iget-object v1, p0, Lio/g1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->G(Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
