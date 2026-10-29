.class public final Lc8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lc8/i;",
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
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lht/a;Lht/a;Lht/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Landroid/content/Context;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/j;->a:Lht/a;

    iput-object p2, p0, Lc8/j;->b:Lht/a;

    iput-object p3, p0, Lc8/j;->c:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;Lht/a;)Lc8/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Landroid/content/Context;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;)",
            "Lc8/j;"
        }
    .end annotation

    new-instance v0, Lc8/j;

    invoke-direct {v0, p0, p1, p2}, Lc8/j;-><init>(Lht/a;Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ll8/a;Ll8/a;)Lc8/i;
    .locals 1

    new-instance v0, Lc8/i;

    invoke-direct {v0, p0, p1, p2}, Lc8/i;-><init>(Landroid/content/Context;Ll8/a;Ll8/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lc8/i;
    .locals 3

    iget-object v0, p0, Lc8/j;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lc8/j;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/a;

    iget-object v2, p0, Lc8/j;->c:Lht/a;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll8/a;

    invoke-static {v0, v1, v2}, Lc8/j;->c(Landroid/content/Context;Ll8/a;Ll8/a;)Lc8/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc8/j;->b()Lc8/i;

    move-result-object v0

    return-object v0
.end method
