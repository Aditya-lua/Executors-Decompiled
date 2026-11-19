.class public final Lxq/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ljr/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxq/c0;


# direct methods
.method public constructor <init>(Lxq/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq/f0;->a:Lxq/c0;

    return-void
.end method

.method public static a(Lxq/c0;)Lxq/f0;
    .locals 1

    new-instance v0, Lxq/f0;

    invoke-direct {v0, p0}, Lxq/f0;-><init>(Lxq/c0;)V

    return-object v0
.end method

.method public static c(Lxq/c0;)Ljr/a;
    .locals 0

    invoke-virtual {p0}, Lxq/c0;->c()Ljr/a;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljr/a;

    return-object p0
.end method


# virtual methods
.method public b()Ljr/a;
    .locals 1

    iget-object v0, p0, Lxq/f0;->a:Lxq/c0;

    invoke-static {v0}, Lxq/f0;->c(Lxq/c0;)Ljr/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxq/f0;->b()Ljr/a;

    move-result-object v0

    return-object v0
.end method
