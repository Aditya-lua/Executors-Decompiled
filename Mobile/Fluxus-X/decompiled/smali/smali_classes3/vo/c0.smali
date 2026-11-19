.class public final Lvo/c0;
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
            "Lxo/z;",
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
            "Lxo/z;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/c0;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lvo/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lxo/z;",
            ">;)",
            "Lvo/c0;"
        }
    .end annotation

    new-instance v0, Lvo/c0;

    invoke-direct {v0, p0}, Lvo/c0;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lxo/z;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/z;",
            ")",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    invoke-static {p0}, Lvo/a0;->b(Lxo/z;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lnn/b0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lvo/c0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo/z;

    invoke-static {v0}, Lvo/c0;->c(Lxo/z;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvo/c0;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
