.class public final Lnp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ll6/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lnp/n;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnp/n;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/n;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/q;->a:Lnp/n;

    iput-object p2, p0, Lnp/q;->b:Lwt/i;

    return-void
.end method

.method public static a(Lnp/n;Lwt/i;)Lnp/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/n;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lnp/q;"
        }
    .end annotation

    new-instance v0, Lnp/q;

    invoke-direct {v0, p0, p1}, Lnp/q;-><init>(Lnp/n;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lnp/n;Landroid/content/Context;)Ll6/s;
    .locals 0

    invoke-virtual {p0, p1}, Lnp/n;->c(Landroid/content/Context;)Ll6/s;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll6/s;

    return-object p0
.end method


# virtual methods
.method public b()Ll6/s;
    .locals 2

    iget-object v0, p0, Lnp/q;->a:Lnp/n;

    iget-object v1, p0, Lnp/q;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lnp/q;->c(Lnp/n;Landroid/content/Context;)Ll6/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/q;->b()Ll6/s;

    move-result-object v0

    return-object v0
.end method
