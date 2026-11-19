.class public final Lsn/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsn/b1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/f1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ldv/b0<",
            "Lxn/d;",
            ">;>;"
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
            "Lsn/f1;",
            ">;",
            "Lwt/i<",
            "Ldv/b0<",
            "Lxn/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/c1;->a:Lwt/i;

    iput-object p2, p0, Lsn/c1;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lsn/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lsn/f1;",
            ">;",
            "Lwt/i<",
            "Ldv/b0<",
            "Lxn/d;",
            ">;>;)",
            "Lsn/c1;"
        }
    .end annotation

    new-instance v0, Lsn/c1;

    invoke-direct {v0, p0, p1}, Lsn/c1;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lsn/f1;Ldv/b0;)Lsn/b1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/f1;",
            "Ldv/b0<",
            "Lxn/d;",
            ">;)",
            "Lsn/b1;"
        }
    .end annotation

    new-instance v0, Lsn/b1;

    invoke-direct {v0, p0, p1}, Lsn/b1;-><init>(Lsn/f1;Ldv/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsn/b1;
    .locals 2

    iget-object v0, p0, Lsn/c1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/f1;

    iget-object v1, p0, Lsn/c1;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldv/b0;

    invoke-static {v0, v1}, Lsn/c1;->c(Lsn/f1;Ldv/b0;)Lsn/b1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/c1;->b()Lsn/b1;

    move-result-object v0

    return-object v0
.end method
