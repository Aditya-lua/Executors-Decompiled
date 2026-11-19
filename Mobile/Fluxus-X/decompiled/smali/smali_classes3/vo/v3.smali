.class public final synthetic Lvo/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/d2$a;

.field public final synthetic b:Lvo/j0$j;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;


# direct methods
.method public synthetic constructor <init>(Lvo/d2$a;Lvo/j0$j;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/v3;->a:Lvo/d2$a;

    iput-object p2, p0, Lvo/v3;->b:Lvo/j0$j;

    iput-object p3, p0, Lvo/v3;->c:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvo/v3;->a:Lvo/d2$a;

    iget-object v1, p0, Lvo/v3;->b:Lvo/j0$j;

    iget-object v2, p0, Lvo/v3;->c:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Lvo/x3;->f(Lvo/d2$a;Lvo/j0$j;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
