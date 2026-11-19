.class public final Lmq/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/b1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
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
            "Lsn/b1;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/d0;->a:Lwt/i;

    iput-object p2, p0, Lmq/d0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lmq/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lsn/b1;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lmq/d0;"
        }
    .end annotation

    new-instance v0, Lmq/d0;

    invoke-direct {v0, p0, p1}, Lmq/d0;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ltt/a;Lrq/a;ZLmq/f0;Ler/c;)Lmq/c0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltt/a<",
            "Lsn/b1;",
            ">;",
            "Lrq/a;",
            "Z",
            "Lmq/f0;",
            "Ler/c;",
            ")",
            "Lmq/c0;"
        }
    .end annotation

    new-instance v0, Lmq/c0;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lmq/c0;-><init>(Ltt/a;Lrq/a;ZLmq/f0;Ler/c;)V

    return-object v0
.end method


# virtual methods
.method public b(Lrq/a;ZLmq/f0;)Lmq/c0;
    .locals 2

    iget-object v0, p0, Lmq/d0;->a:Lwt/i;

    invoke-static {v0}, Lwt/c;->b(Lwt/i;)Ltt/a;

    move-result-object v0

    iget-object v1, p0, Lmq/d0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ler/c;

    invoke-static {v0, p1, p2, p3, v1}, Lmq/d0;->c(Ltt/a;Lrq/a;ZLmq/f0;Ler/c;)Lmq/c0;

    move-result-object p1

    return-object p1
.end method
