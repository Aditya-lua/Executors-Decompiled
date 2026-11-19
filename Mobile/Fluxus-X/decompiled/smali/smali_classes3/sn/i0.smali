.class public final Lsn/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsn/h0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;>;"
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
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/i0;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lsn/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;>;)",
            "Lsn/i0;"
        }
    .end annotation

    new-instance v0, Lsn/i0;

    invoke-direct {v0, p0}, Lsn/i0;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Ldv/b0;)Lsn/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;)",
            "Lsn/h0;"
        }
    .end annotation

    new-instance v0, Lsn/h0;

    invoke-direct {v0, p0}, Lsn/h0;-><init>(Ldv/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsn/h0;
    .locals 1

    iget-object v0, p0, Lsn/i0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldv/b0;

    invoke-static {v0}, Lsn/i0;->c(Ldv/b0;)Lsn/h0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/i0;->b()Lsn/h0;

    move-result-object v0

    return-object v0
.end method
