.class public final Lnp/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lav/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lnp/n;


# direct methods
.method public constructor <init>(Lnp/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/r;->a:Lnp/n;

    return-void
.end method

.method public static a(Lnp/n;)Lnp/r;
    .locals 1

    new-instance v0, Lnp/r;

    invoke-direct {v0, p0}, Lnp/r;-><init>(Lnp/n;)V

    return-object v0
.end method

.method public static c(Lnp/n;)Lav/p0;
    .locals 0

    invoke-virtual {p0}, Lnp/n;->d()Lav/p0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lav/p0;

    return-object p0
.end method


# virtual methods
.method public b()Lav/p0;
    .locals 1

    iget-object v0, p0, Lnp/r;->a:Lnp/n;

    invoke-static {v0}, Lnp/r;->c(Lnp/n;)Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/r;->b()Lav/p0;

    move-result-object v0

    return-object v0
.end method
