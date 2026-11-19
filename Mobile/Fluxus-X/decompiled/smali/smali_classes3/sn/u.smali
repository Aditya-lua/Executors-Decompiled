.class public final Lsn/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsn/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
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
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/u;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lsn/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lsn/u;"
        }
    .end annotation

    new-instance v0, Lsn/u;

    invoke-direct {v0, p0}, Lsn/u;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Ler/c;)Lsn/t;
    .locals 1

    new-instance v0, Lsn/t;

    invoke-direct {v0, p0}, Lsn/t;-><init>(Ler/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsn/t;
    .locals 1

    iget-object v0, p0, Lsn/u;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ler/c;

    invoke-static {v0}, Lsn/u;->c(Ler/c;)Lsn/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/u;->b()Lsn/t;

    move-result-object v0

    return-object v0
.end method
