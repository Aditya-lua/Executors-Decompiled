.class public final Ljo/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljo/n;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Luq/a;",
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
            "Luq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/p;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Ljo/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Luq/a;",
            ">;)",
            "Ljo/p;"
        }
    .end annotation

    new-instance v0, Ljo/p;

    invoke-direct {v0, p0}, Ljo/p;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Luq/a;)Ljo/n;
    .locals 1

    new-instance v0, Ljo/n;

    invoke-direct {v0, p0}, Ljo/n;-><init>(Luq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljo/n;
    .locals 1

    iget-object v0, p0, Ljo/p;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luq/a;

    invoke-static {v0}, Ljo/p;->c(Luq/a;)Ljo/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljo/p;->b()Ljo/n;

    move-result-object v0

    return-object v0
.end method
