.class public final Lmo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmo/p;",
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

    iput-object p1, p0, Lmo/q;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lmo/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lmo/q;"
        }
    .end annotation

    new-instance v0, Lmo/q;

    invoke-direct {v0, p0}, Lmo/q;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lmo/p;
    .locals 1

    new-instance v0, Lmo/p;

    invoke-direct {v0, p0}, Lmo/p;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmo/p;
    .locals 1

    iget-object v0, p0, Lmo/q;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lmo/q;->c(Landroid/content/Context;)Lmo/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmo/q;->b()Lmo/p;

    move-result-object v0

    return-object v0
.end method
