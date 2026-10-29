.class public final Lwp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lokhttp3/Interceptor;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwp/f;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lwp/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwp/f;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp/f;",
            "Lft/i<",
            "Lwp/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/g;->a:Lwp/f;

    iput-object p2, p0, Lwp/g;->b:Lft/i;

    return-void
.end method

.method public static a(Lwp/f;Lft/i;)Lwp/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp/f;",
            "Lft/i<",
            "Lwp/c;",
            ">;)",
            "Lwp/g;"
        }
    .end annotation

    new-instance v0, Lwp/g;

    invoke-direct {v0, p0, p1}, Lwp/g;-><init>(Lwp/f;Lft/i;)V

    return-object v0
.end method

.method public static c(Lwp/f;Lwp/c;)Lokhttp3/Interceptor;
    .locals 0

    invoke-virtual {p0, p1}, Lwp/f;->b(Lwp/c;)Lokhttp3/Interceptor;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/Interceptor;

    return-object p0
.end method


# virtual methods
.method public b()Lokhttp3/Interceptor;
    .locals 2

    iget-object v0, p0, Lwp/g;->a:Lwp/f;

    iget-object v1, p0, Lwp/g;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwp/c;

    invoke-static {v0, v1}, Lwp/g;->c(Lwp/f;Lwp/c;)Lokhttp3/Interceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwp/g;->b()Lokhttp3/Interceptor;

    move-result-object v0

    return-object v0
.end method
