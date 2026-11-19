.class public final Lrp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lrp/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lrp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnp/h;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Lwt/i<",
            "Lrp/a;",
            ">;",
            "Lwt/i<",
            "Lnp/h;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/j;->a:Lwt/i;

    iput-object p2, p0, Lrp/j;->b:Lwt/i;

    iput-object p3, p0, Lrp/j;->c:Lwt/i;

    iput-object p4, p0, Lrp/j;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lrp/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Lwt/i<",
            "Lrp/a;",
            ">;",
            "Lwt/i<",
            "Lnp/h;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;)",
            "Lrp/j;"
        }
    .end annotation

    new-instance v0, Lrp/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lrp/j;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lrp/a;Lnp/h;Lhn/w;)Lrp/i;
    .locals 1

    new-instance v0, Lrp/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lrp/i;-><init>(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lrp/a;Lnp/h;Lhn/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Lrp/i;
    .locals 4

    iget-object v0, p0, Lrp/j;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    iget-object v1, p0, Lrp/j;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrp/a;

    iget-object v2, p0, Lrp/j;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnp/h;

    iget-object v3, p0, Lrp/j;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn/w;

    invoke-static {v0, v1, v2, v3}, Lrp/j;->c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lrp/a;Lnp/h;Lhn/w;)Lrp/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrp/j;->b()Lrp/i;

    move-result-object v0

    return-object v0
.end method
