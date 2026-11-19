.class public final Lnp/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnp/q0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
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
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/r0;->a:Lwt/i;

    iput-object p2, p0, Lnp/r0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lnp/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lnp/r0;"
        }
    .end annotation

    new-instance v0, Lnp/r0;

    invoke-direct {v0, p0, p1}, Lnp/r0;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lav/p0;)Lnp/q0;
    .locals 1

    new-instance v0, Lnp/q0;

    invoke-direct {v0, p0, p1}, Lnp/q0;-><init>(Landroid/content/Context;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnp/q0;
    .locals 2

    iget-object v0, p0, Lnp/r0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lnp/r0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lav/p0;

    invoke-static {v0, v1}, Lnp/r0;->c(Landroid/content/Context;Lav/p0;)Lnp/q0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/r0;->b()Lnp/q0;

    move-result-object v0

    return-object v0
.end method
