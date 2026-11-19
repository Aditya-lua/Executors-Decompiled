.class public final Lcp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/h0;",
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
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/h0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp/b;->a:Lwt/i;

    iput-object p2, p0, Lcp/b;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lcp/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/h0;",
            ">;)",
            "Lcp/b;"
        }
    .end annotation

    new-instance v0, Lcp/b;

    invoke-direct {v0, p0, p1}, Lcp/b;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lsn/h0;Lvo/d3$e;)Lcp/a;
    .locals 1

    new-instance v0, Lcp/a;

    invoke-direct {v0, p0, p1, p2}, Lcp/a;-><init>(Landroid/content/Context;Lsn/h0;Lvo/d3$e;)V

    return-object v0
.end method


# virtual methods
.method public b(Lvo/d3$e;)Lcp/a;
    .locals 2

    iget-object v0, p0, Lcp/b;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcp/b;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/h0;

    invoke-static {v0, v1, p1}, Lcp/b;->c(Landroid/content/Context;Lsn/h0;Lvo/d3$e;)Lcp/a;

    move-result-object p1

    return-object p1
.end method
