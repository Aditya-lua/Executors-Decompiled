.class public final Lcom/withpersona/sdk2/inquiry/document/network/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lpo/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lso/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lar/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lpo/c;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lar/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Lwt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lpo/c;",
            ">;",
            "Lwt/i<",
            "Lso/a;",
            ">;",
            "Lwt/i<",
            "Lar/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/h;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/h;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lpo/c;Lso/a;Lar/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$a;-><init>(Lpo/c;Lso/a;Lar/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpo/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lso/a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lar/a;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/network/h;->c(Lpo/c;Lso/a;Lar/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/h;->b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method
