.class public final synthetic Lio/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic b:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/x;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lio/x;->b:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/x;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lio/x;->b:Lym/k$a;

    check-cast p1, Lpo/c$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lpo/c$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
