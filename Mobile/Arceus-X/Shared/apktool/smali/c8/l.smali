.class public final Lc8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lc8/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lc8/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lht/a;Lht/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Landroid/content/Context;",
            ">;",
            "Lht/a<",
            "Lc8/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/l;->a:Lht/a;

    iput-object p2, p0, Lc8/l;->b:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;)Lc8/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Landroid/content/Context;",
            ">;",
            "Lht/a<",
            "Lc8/i;",
            ">;)",
            "Lc8/l;"
        }
    .end annotation

    new-instance v0, Lc8/l;

    invoke-direct {v0, p0, p1}, Lc8/l;-><init>(Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lc8/k;
    .locals 1

    new-instance v0, Lc8/k;

    check-cast p1, Lc8/i;

    invoke-direct {v0, p0, p1}, Lc8/k;-><init>(Landroid/content/Context;Lc8/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lc8/k;
    .locals 2

    iget-object v0, p0, Lc8/l;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lc8/l;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lc8/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lc8/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc8/l;->b()Lc8/k;

    move-result-object v0

    return-object v0
.end method
