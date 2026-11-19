.class public final Lfq/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfq/u;",
        ">;"
    }
.end annotation


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
            "Lfq/j$a;",
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
            "Lfq/j$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/x;->a:Lwt/i;

    iput-object p2, p0, Lfq/x;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lfq/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lfq/j$a;",
            ">;)",
            "Lfq/x;"
        }
    .end annotation

    new-instance v0, Lfq/x;

    invoke-direct {v0, p0, p1}, Lfq/x;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lfq/j$a;)Lfq/u;
    .locals 1

    new-instance v0, Lfq/u;

    invoke-direct {v0, p0, p1}, Lfq/u;-><init>(Landroid/content/Context;Lfq/j$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfq/u;
    .locals 2

    iget-object v0, p0, Lfq/x;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lfq/x;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfq/j$a;

    invoke-static {v0, v1}, Lfq/x;->c(Landroid/content/Context;Lfq/j$a;)Lfq/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfq/x;->b()Lfq/u;

    move-result-object v0

    return-object v0
.end method
