.class public final Lmq/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ljava/util/Set<",
        "Lnn/b0<",
        "*>;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmq/p;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnq/p0;",
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
            "Lmq/p;",
            ">;",
            "Lwt/i<",
            "Lnq/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/o0;->a:Lwt/i;

    iput-object p2, p0, Lmq/o0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lmq/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lmq/p;",
            ">;",
            "Lwt/i<",
            "Lnq/p0;",
            ">;)",
            "Lmq/o0;"
        }
    .end annotation

    new-instance v0, Lmq/o0;

    invoke-direct {v0, p0, p1}, Lmq/o0;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lmq/p;Lnq/p0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/p;",
            "Lnq/p0;",
            ")",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lmq/n0;->a(Lmq/p;Lnq/p0;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lmq/o0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmq/p;

    iget-object v1, p0, Lmq/o0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnq/p0;

    invoke-static {v0, v1}, Lmq/o0;->c(Lmq/p;Lnq/p0;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmq/o0;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
