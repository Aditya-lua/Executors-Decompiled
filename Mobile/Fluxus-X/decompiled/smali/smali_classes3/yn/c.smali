.class public final Lyn/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lyn/b;",
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

    iput-object p1, p0, Lyn/c;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lyn/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lyn/c;"
        }
    .end annotation

    new-instance v0, Lyn/c;

    invoke-direct {v0, p0}, Lyn/c;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lyn/b;
    .locals 1

    new-instance v0, Lyn/b;

    invoke-direct {v0, p0}, Lyn/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lyn/b;
    .locals 1

    iget-object v0, p0, Lyn/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lyn/c;->c(Landroid/content/Context;)Lyn/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyn/c;->b()Lyn/b;

    move-result-object v0

    return-object v0
.end method
