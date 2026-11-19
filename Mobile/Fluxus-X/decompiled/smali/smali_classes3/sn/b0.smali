.class public final Lsn/b0;
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
            "Lyn/a;",
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
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/b0;->a:Lwt/i;

    iput-object p2, p0, Lsn/b0;->b:Lwt/i;

    iput-object p3, p0, Lsn/b0;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lsn/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lyn/a;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lsn/b0;"
        }
    .end annotation

    new-instance v0, Lsn/b0;

    invoke-direct {v0, p0, p1, p2}, Lsn/b0;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lyn/a;Ler/c;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;
    .locals 8

    new-instance v0, Lsn/a0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lsn/a0;-><init>(Landroid/content/Context;Lyn/a;Ler/c;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;
    .locals 8

    iget-object v0, p0, Lsn/b0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lsn/b0;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lyn/a;

    iget-object v0, p0, Lsn/b0;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ler/c;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    invoke-static/range {v1 .. v7}, Lsn/b0;->c(Landroid/content/Context;Lyn/a;Ler/c;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/z;Z)Lsn/a0;

    move-result-object p1

    return-object p1
.end method
