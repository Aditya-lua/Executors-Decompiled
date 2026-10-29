.class public final synthetic Lio/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/t2;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    iput-object p2, p0, Lio/t2;->b:Lym/k$a;

    iput-object p3, p0, Lio/t2;->c:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/t2;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    iget-object v1, p0, Lio/t2;->b:Lym/k$a;

    iget-object v2, p0, Lio/t2;->c:Luo/l;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/p;->e(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;Lym/k$a;Luo/l;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
