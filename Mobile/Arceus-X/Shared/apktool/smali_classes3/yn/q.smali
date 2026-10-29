.class public final Lyn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lyn/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn/q;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lyn/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lyn/q;"
        }
    .end annotation

    new-instance v0, Lyn/q;

    invoke-direct {v0, p0}, Lyn/q;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lyn/p;
    .locals 1

    new-instance v0, Lyn/p;

    invoke-direct {v0, p0}, Lyn/p;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lyn/p;
    .locals 1

    iget-object v0, p0, Lyn/q;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lyn/q;->c(Landroid/content/Context;)Lyn/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyn/q;->b()Lyn/p;

    move-result-object v0

    return-object v0
.end method
