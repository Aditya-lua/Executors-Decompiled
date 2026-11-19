.class public final Lsn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lyn/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lsn/n;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lyn/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsn/n;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/n;",
            "Lwt/i<",
            "Lyn/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/o;->a:Lsn/n;

    iput-object p2, p0, Lsn/o;->b:Lwt/i;

    return-void
.end method

.method public static a(Lsn/n;Ltt/a;)Lyn/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/n;",
            "Ltt/a<",
            "Lyn/b;",
            ">;)",
            "Lyn/a;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lsn/n;->a(Ltt/a;)Lyn/a;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyn/a;

    return-object p0
.end method

.method public static b(Lsn/n;Lwt/i;)Lsn/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/n;",
            "Lwt/i<",
            "Lyn/b;",
            ">;)",
            "Lsn/o;"
        }
    .end annotation

    new-instance v0, Lsn/o;

    invoke-direct {v0, p0, p1}, Lsn/o;-><init>(Lsn/n;Lwt/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lyn/a;
    .locals 2

    iget-object v0, p0, Lsn/o;->a:Lsn/n;

    iget-object v1, p0, Lsn/o;->b:Lwt/i;

    invoke-static {v1}, Lwt/c;->b(Lwt/i;)Ltt/a;

    move-result-object v1

    invoke-static {v0, v1}, Lsn/o;->a(Lsn/n;Ltt/a;)Lyn/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsn/o;->c()Lyn/a;

    move-result-object v0

    return-object v0
.end method
