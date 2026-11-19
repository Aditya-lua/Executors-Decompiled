.class public final Lnp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lnp/n;


# direct methods
.method public constructor <init>(Lnp/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/o;->a:Lnp/n;

    return-void
.end method

.method public static a(Lnp/n;)Landroid/app/Application;
    .locals 0

    invoke-virtual {p0}, Lnp/n;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    return-object p0
.end method

.method public static b(Lnp/n;)Lnp/o;
    .locals 1

    new-instance v0, Lnp/o;

    invoke-direct {v0, p0}, Lnp/o;-><init>(Lnp/n;)V

    return-object v0
.end method


# virtual methods
.method public c()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lnp/o;->a:Lnp/n;

    invoke-static {v0}, Lnp/o;->a(Lnp/n;)Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp/o;->c()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
