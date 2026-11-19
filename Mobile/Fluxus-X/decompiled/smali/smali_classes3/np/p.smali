.class public final Lnp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lnp/n;


# direct methods
.method public constructor <init>(Lnp/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/p;->a:Lnp/n;

    return-void
.end method

.method public static a(Lnp/n;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0}, Lnp/n;->b()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    return-object p0
.end method

.method public static b(Lnp/n;)Lnp/p;
    .locals 1

    new-instance v0, Lnp/p;

    invoke-direct {v0, p0}, Lnp/p;-><init>(Lnp/n;)V

    return-object v0
.end method


# virtual methods
.method public c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnp/p;->a:Lnp/n;

    invoke-static {v0}, Lnp/p;->a(Lnp/n;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/p;->c()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
