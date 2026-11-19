.class public final Lwo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lwo/o;",
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

    iput-object p1, p0, Lwo/q;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lwo/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lir/b;",
            ">;)",
            "Lwo/q;"
        }
    .end annotation

    new-instance v0, Lwo/q;

    invoke-direct {v0, p0}, Lwo/q;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lir/b;)Lwo/o;
    .locals 1

    new-instance v0, Lwo/o;

    invoke-direct {v0, p0}, Lwo/o;-><init>(Lir/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwo/o;
    .locals 1

    iget-object v0, p0, Lwo/q;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lir/b;

    invoke-static {v0}, Lwo/q;->c(Lir/b;)Lwo/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwo/q;->b()Lwo/o;

    move-result-object v0

    return-object v0
.end method
