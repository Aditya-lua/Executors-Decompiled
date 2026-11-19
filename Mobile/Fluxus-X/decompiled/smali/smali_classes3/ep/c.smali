.class public final synthetic Lep/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lvo/j0$j;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lkotlin/jvm/functions/Function1;Lvo/d2$a;Lvo/j0$j;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/c;->a:Lls/g;

    iput-object p2, p0, Lep/c;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lep/c;->c:Lvo/d2$a;

    iput-object p4, p0, Lep/c;->d:Lvo/j0$j;

    iput-object p5, p0, Lep/c;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lep/c;->a:Lls/g;

    iget-object v1, p0, Lep/c;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lep/c;->c:Lvo/d2$a;

    iget-object v3, p0, Lep/c;->d:Lvo/j0$j;

    iget-object v4, p0, Lep/c;->e:Lip/l;

    move-object v5, p1

    check-cast v5, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    invoke-static/range {v0 .. v5}, Lep/e;->c(Lls/g;Lkotlin/jvm/functions/Function1;Lvo/d2$a;Lvo/j0$j;Lip/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
