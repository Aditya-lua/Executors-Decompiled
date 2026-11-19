.class public final Lmo/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmo/t;",
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
            "Lmo/m;",
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
            "Lmo/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/u;->a:Lwt/i;

    iput-object p2, p0, Lmo/u;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lmo/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lmo/m;",
            ">;)",
            "Lmo/u;"
        }
    .end annotation

    new-instance v0, Lmo/u;

    invoke-direct {v0, p0, p1}, Lmo/u;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lmo/m;)Lmo/t;
    .locals 1

    new-instance v0, Lmo/t;

    invoke-direct {v0, p0, p1}, Lmo/t;-><init>(Landroid/content/Context;Lmo/m;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmo/t;
    .locals 2

    iget-object v0, p0, Lmo/u;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lmo/u;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmo/m;

    invoke-static {v0, v1}, Lmo/u;->c(Landroid/content/Context;Lmo/m;)Lmo/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmo/u;->b()Lmo/t;

    move-result-object v0

    return-object v0
.end method
