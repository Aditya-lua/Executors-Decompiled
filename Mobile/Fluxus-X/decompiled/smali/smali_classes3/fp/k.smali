.class public final Lfp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfp/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lir/b;",
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
            "Lir/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/k;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lfp/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lir/b;",
            ">;)",
            "Lfp/k;"
        }
    .end annotation

    new-instance v0, Lfp/k;

    invoke-direct {v0, p0}, Lfp/k;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lir/b;)Lfp/i;
    .locals 1

    new-instance v0, Lfp/i;

    invoke-direct {v0, p0}, Lfp/i;-><init>(Lir/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfp/i;
    .locals 1

    iget-object v0, p0, Lfp/k;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lir/b;

    invoke-static {v0}, Lfp/k;->c(Lir/b;)Lfp/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfp/k;->b()Lfp/i;

    move-result-object v0

    return-object v0
.end method
