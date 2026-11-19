.class public final Lbq/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/b;",
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
            "Lbq/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq/f;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lbq/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lbq/b;",
            ">;)",
            "Lbq/f;"
        }
    .end annotation

    new-instance v0, Lbq/f;

    invoke-direct {v0, p0}, Lbq/f;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lbq/b;Ljava/lang/String;)Lbq/e;
    .locals 1

    new-instance v0, Lbq/e;

    invoke-direct {v0, p0, p1}, Lbq/e;-><init>(Lbq/b;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lbq/e;
    .locals 1

    iget-object v0, p0, Lbq/f;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbq/b;

    invoke-static {v0, p1}, Lbq/f;->c(Lbq/b;Ljava/lang/String;)Lbq/e;

    move-result-object p1

    return-object p1
.end method
