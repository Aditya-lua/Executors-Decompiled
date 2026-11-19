.class public final Lrp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnp/h;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lrp/c;


# direct methods
.method public constructor <init>(Lrp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/d;->a:Lrp/c;

    return-void
.end method

.method public static a(Lrp/c;)Lrp/d;
    .locals 1

    new-instance v0, Lrp/d;

    invoke-direct {v0, p0}, Lrp/d;-><init>(Lrp/c;)V

    return-object v0
.end method

.method public static b(Lrp/c;)Lnp/h;
    .locals 0

    invoke-virtual {p0}, Lrp/c;->a()Lnp/h;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnp/h;

    return-object p0
.end method


# virtual methods
.method public c()Lnp/h;
    .locals 1

    iget-object v0, p0, Lrp/d;->a:Lrp/c;

    invoke-static {v0}, Lrp/d;->b(Lrp/c;)Lnp/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrp/d;->c()Lnp/h;

    move-result-object v0

    return-object v0
.end method
