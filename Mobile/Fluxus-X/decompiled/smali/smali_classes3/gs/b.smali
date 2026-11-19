.class public final Lgs/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lgs/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgs/c;",
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
            "Lgs/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgs/b;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lgs/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lgs/c;",
            ">;)",
            "Lgs/b;"
        }
    .end annotation

    new-instance v0, Lgs/b;

    invoke-direct {v0, p0}, Lgs/b;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lgs/c;)Lgs/a$a;
    .locals 1

    new-instance v0, Lgs/a$a;

    invoke-direct {v0, p0}, Lgs/a$a;-><init>(Lgs/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lgs/a$a;
    .locals 1

    iget-object v0, p0, Lgs/b;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgs/c;

    invoke-static {v0}, Lgs/b;->c(Lgs/c;)Lgs/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgs/b;->b()Lgs/a$a;

    move-result-object v0

    return-object v0
.end method
