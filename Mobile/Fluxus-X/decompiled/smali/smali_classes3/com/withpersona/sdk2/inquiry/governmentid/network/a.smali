.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfr/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lwt/i<",
            "Lfr/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Lwt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/governmentid/network/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
            ">;",
            "Lwt/i<",
            "Lfr/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lfr/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lfr/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/a;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->c(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lfr/a;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/a;->b()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    move-result-object v0

    return-object v0
.end method
