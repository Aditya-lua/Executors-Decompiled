.class public final Lnp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnp/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lup/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
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
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Lbq/b;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/j;->a:Lwt/i;

    iput-object p2, p0, Lnp/j;->b:Lwt/i;

    iput-object p3, p0, Lnp/j;->c:Lwt/i;

    iput-object p4, p0, Lnp/j;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lnp/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Lbq/b;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lnp/j;"
        }
    .end annotation

    new-instance v0, Lnp/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lnp/j;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lup/w;Lhn/w;Lbq/b;Lav/p0;)Lnp/i;
    .locals 1

    new-instance v0, Lnp/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lnp/i;-><init>(Lup/w;Lhn/w;Lbq/b;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnp/i;
    .locals 4

    iget-object v0, p0, Lnp/j;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lup/w;

    iget-object v1, p0, Lnp/j;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn/w;

    iget-object v2, p0, Lnp/j;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbq/b;

    iget-object v3, p0, Lnp/j;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lav/p0;

    invoke-static {v0, v1, v2, v3}, Lnp/j;->c(Lup/w;Lhn/w;Lbq/b;Lav/p0;)Lnp/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/j;->b()Lnp/i;

    move-result-object v0

    return-object v0
.end method
