.class public final Lnp/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnp/m0;",
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
            "Lnr/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lup/w;",
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
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lnr/b$a;",
            ">;",
            "Lwt/i<",
            "Lup/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/n0;->a:Lwt/i;

    iput-object p2, p0, Lnp/n0;->b:Lwt/i;

    iput-object p3, p0, Lnp/n0;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lnp/n0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lnr/b$a;",
            ">;",
            "Lwt/i<",
            "Lup/w;",
            ">;)",
            "Lnp/n0;"
        }
    .end annotation

    new-instance v0, Lnp/n0;

    invoke-direct {v0, p0, p1, p2}, Lnp/n0;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lnr/b$a;Lup/w;)Lnp/m0;
    .locals 1

    new-instance v0, Lnp/m0;

    invoke-direct {v0, p0, p1, p2}, Lnp/m0;-><init>(Landroid/content/Context;Lnr/b$a;Lup/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnp/m0;
    .locals 3

    iget-object v0, p0, Lnp/n0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lnp/n0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnr/b$a;

    iget-object v2, p0, Lnp/n0;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lup/w;

    invoke-static {v0, v1, v2}, Lnp/n0;->c(Landroid/content/Context;Lnr/b$a;Lup/w;)Lnp/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/n0;->b()Lnp/m0;

    move-result-object v0

    return-object v0
.end method
