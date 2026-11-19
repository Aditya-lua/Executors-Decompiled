.class public final synthetic Lvo/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lip/l;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lvo/j0$j;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lip/l;Lvo/d2$a;Lvo/j0$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/s3;->a:Lln/k$a;

    iput-object p2, p0, Lvo/s3;->b:Lip/l;

    iput-object p3, p0, Lvo/s3;->c:Lvo/d2$a;

    iput-object p4, p0, Lvo/s3;->d:Lvo/j0$j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvo/s3;->a:Lln/k$a;

    iget-object v1, p0, Lvo/s3;->b:Lip/l;

    iget-object v2, p0, Lvo/s3;->c:Lvo/d2$a;

    iget-object v3, p0, Lvo/s3;->d:Lvo/j0$j;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;

    invoke-static {v0, v1, v2, v3, p1}, Lvo/x3;->c(Lln/k$a;Lip/l;Lvo/d2$a;Lvo/j0$j;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;)Lln/r;

    move-result-object p1

    return-object p1
.end method
