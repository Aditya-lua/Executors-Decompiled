.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lrq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lft/i<",
            "Lrq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lft/i<",
            "Lrq/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lrq/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lrq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrq/a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lrq/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method
