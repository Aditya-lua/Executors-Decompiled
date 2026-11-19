.class public final Ljs/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ljs/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljs/a;",
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
            "Ljs/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljs/c;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Ljs/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ljs/a;",
            ">;)",
            "Ljs/c;"
        }
    .end annotation

    new-instance v0, Ljs/c;

    invoke-direct {v0, p0}, Ljs/c;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljs/a;)Ljs/b$a;
    .locals 1

    new-instance v0, Ljs/b$a;

    invoke-direct {v0, p0}, Ljs/b$a;-><init>(Ljs/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljs/b$a;
    .locals 1

    iget-object v0, p0, Ljs/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs/a;

    invoke-static {v0}, Ljs/c;->c(Ljs/a;)Ljs/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljs/c;->b()Ljs/b$a;

    move-result-object v0

    return-object v0
.end method
