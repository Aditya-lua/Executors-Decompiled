.class public final Lsn/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsn/f1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lto/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/g1;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lsn/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lto/e;",
            ">;)",
            "Lsn/g1;"
        }
    .end annotation

    new-instance v0, Lsn/g1;

    invoke-direct {v0, p0}, Lsn/g1;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lto/e;)Lsn/f1;
    .locals 1

    new-instance v0, Lsn/f1;

    invoke-direct {v0, p0}, Lsn/f1;-><init>(Lto/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsn/f1;
    .locals 1

    iget-object v0, p0, Lsn/g1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/e;

    invoke-static {v0}, Lsn/g1;->c(Lto/e;)Lsn/f1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/g1;->b()Lsn/f1;

    move-result-object v0

    return-object v0
.end method
