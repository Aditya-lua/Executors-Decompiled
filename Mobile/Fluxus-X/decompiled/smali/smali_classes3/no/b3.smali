.class public final Lno/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lno/y2$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lg/d<",
            "Lg/j;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Lg/d<",
            "Lg/j;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/b3;->a:Lwt/i;

    iput-object p2, p0, Lno/b3;->b:Lwt/i;

    iput-object p3, p0, Lno/b3;->c:Lwt/i;

    iput-object p4, p0, Lno/b3;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lno/b3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Lg/d<",
            "Lg/j;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lno/b3;"
        }
    .end annotation

    new-instance v0, Lno/b3;

    invoke-direct {v0, p0, p1, p2, p3}, Lno/b3;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)Lno/y2$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lg/d<",
            "Lg/j;",
            ">;",
            "Landroid/content/Context;",
            "Ler/c;",
            ")",
            "Lno/y2$b;"
        }
    .end annotation

    new-instance v0, Lno/y2$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lno/y2$b;-><init>(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lno/y2$b;
    .locals 4

    iget-object v0, p0, Lno/b3;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/d;

    iget-object v1, p0, Lno/b3;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/d;

    iget-object v2, p0, Lno/b3;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lno/b3;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ler/c;

    invoke-static {v0, v1, v2, v3}, Lno/b3;->c(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)Lno/y2$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lno/b3;->b()Lno/y2$b;

    move-result-object v0

    return-object v0
.end method
