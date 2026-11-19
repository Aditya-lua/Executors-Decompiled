.class public final Lsn/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ldv/b0<",
        "Lzt/n<",
        "Lsn/w0;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lsn/n;


# direct methods
.method public constructor <init>(Lsn/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/p;->a:Lsn/n;

    return-void
.end method

.method public static a(Lsn/n;)Lsn/p;
    .locals 1

    new-instance v0, Lsn/p;

    invoke-direct {v0, p0}, Lsn/p;-><init>(Lsn/n;)V

    return-object v0
.end method

.method public static c(Lsn/n;)Ldv/b0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/n;",
            ")",
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lsn/n;->b()Ldv/b0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldv/b0;

    return-object p0
.end method


# virtual methods
.method public b()Ldv/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/b0<",
            "Lzt/n<",
            "Lsn/w0;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lsn/p;->a:Lsn/n;

    invoke-static {v0}, Lsn/p;->c(Lsn/n;)Ldv/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/p;->b()Ldv/b0;

    move-result-object v0

    return-object v0
.end method
