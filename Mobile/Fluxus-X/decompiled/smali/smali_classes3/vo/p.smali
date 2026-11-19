.class public final Lvo/p;
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

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/h0;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/p;->a:Lwt/i;

    iput-object p2, p0, Lvo/p;->b:Lwt/i;

    iput-object p3, p0, Lvo/p;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lvo/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/h0;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lvo/p;"
        }
    .end annotation

    new-instance v0, Lvo/p;

    invoke-direct {v0, p0, p1, p2}, Lvo/p;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lsn/h0;Ler/c;Lvo/d3$e;Ljava/lang/String;)Lvo/o;
    .locals 6

    new-instance v0, Lvo/o;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lvo/o;-><init>(Landroid/content/Context;Lsn/h0;Ler/c;Lvo/d3$e;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Lvo/d3$e;Ljava/lang/String;)Lvo/o;
    .locals 3

    iget-object v0, p0, Lvo/p;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lvo/p;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/h0;

    iget-object v2, p0, Lvo/p;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ler/c;

    invoke-static {v0, v1, v2, p1, p2}, Lvo/p;->c(Landroid/content/Context;Lsn/h0;Ler/c;Lvo/d3$e;Ljava/lang/String;)Lvo/o;

    move-result-object p1

    return-object p1
.end method
