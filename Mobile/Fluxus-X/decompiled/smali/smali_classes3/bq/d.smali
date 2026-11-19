.class public final Lbq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lbq/b;",
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


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq/d;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lbq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lbq/d;"
        }
    .end annotation

    new-instance v0, Lbq/d;

    invoke-direct {v0, p0}, Lbq/d;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lbq/b;
    .locals 1

    new-instance v0, Lbq/b;

    invoke-direct {v0, p0}, Lbq/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lbq/b;
    .locals 1

    iget-object v0, p0, Lbq/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lbq/d;->c(Landroid/content/Context;)Lbq/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbq/d;->b()Lbq/b;

    move-result-object v0

    return-object v0
.end method
