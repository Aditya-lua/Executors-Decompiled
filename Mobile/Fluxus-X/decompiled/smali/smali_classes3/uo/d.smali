.class public final Luo/d;
.super Ljava/lang/Object;
.source "SourceFile"


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

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Luo/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Luo/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/d;->a:Lwt/i;

    iput-object p2, p0, Luo/d;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Luo/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Luo/b;",
            ">;)",
            "Luo/d;"
        }
    .end annotation

    new-instance v0, Luo/d;

    invoke-direct {v0, p0, p1}, Luo/d;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lto/e;Luo/b;)Luo/c;
    .locals 1

    new-instance v0, Luo/c;

    invoke-direct {v0, p0, p1, p2}, Luo/c;-><init>(Ljava/lang/String;Lto/e;Luo/b;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Luo/c;
    .locals 2

    iget-object v0, p0, Luo/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/e;

    iget-object v1, p0, Luo/d;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luo/b;

    invoke-static {p1, v0, v1}, Luo/d;->c(Ljava/lang/String;Lto/e;Luo/b;)Luo/c;

    move-result-object p1

    return-object p1
.end method
