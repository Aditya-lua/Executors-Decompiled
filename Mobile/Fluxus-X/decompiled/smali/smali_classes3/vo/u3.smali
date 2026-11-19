.class public final synthetic Lvo/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lvo/j0$j;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lvo/d2$a;Lvo/j0$j;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/u3;->a:Lln/k$a;

    iput-object p2, p0, Lvo/u3;->b:Lvo/d2$a;

    iput-object p3, p0, Lvo/u3;->c:Lvo/j0$j;

    iput-object p4, p0, Lvo/u3;->d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    iput-object p5, p0, Lvo/u3;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lvo/u3;->a:Lln/k$a;

    iget-object v1, p0, Lvo/u3;->b:Lvo/d2$a;

    iget-object v2, p0, Lvo/u3;->c:Lvo/j0$j;

    iget-object v3, p0, Lvo/u3;->d:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;

    iget-object v4, p0, Lvo/u3;->e:Lip/l;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lvo/x3;->a(Lln/k$a;Lvo/d2$a;Lvo/j0$j;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;Lip/l;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
