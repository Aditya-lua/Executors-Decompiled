.class public final Lxq/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lxq/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lxq/c0;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lxq/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxq/c0;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxq/c0;",
            "Lwt/i<",
            "Lxq/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq/d0;->a:Lxq/c0;

    iput-object p2, p0, Lxq/d0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lxq/c0;Lwt/i;)Lxq/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxq/c0;",
            "Lwt/i<",
            "Lxq/x;",
            ">;)",
            "Lxq/d0;"
        }
    .end annotation

    new-instance v0, Lxq/d0;

    invoke-direct {v0, p0, p1}, Lxq/d0;-><init>(Lxq/c0;Lwt/i;)V

    return-object v0
.end method

.method public static b(Lxq/c0;Lxq/x;)Lxq/k;
    .locals 0

    invoke-virtual {p0, p1}, Lxq/c0;->a(Lxq/x;)Lxq/k;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxq/k;

    return-object p0
.end method


# virtual methods
.method public c()Lxq/k;
    .locals 2

    iget-object v0, p0, Lxq/d0;->a:Lxq/c0;

    iget-object v1, p0, Lxq/d0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxq/x;

    invoke-static {v0, v1}, Lxq/d0;->b(Lxq/c0;Lxq/x;)Lxq/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxq/d0;->c()Lxq/k;

    move-result-object v0

    return-object v0
.end method
