.class public final Ld8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Ld8/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/j;->a:Lyt/a;

    iput-object p2, p0, Ld8/j;->b:Lyt/a;

    iput-object p3, p0, Ld8/j;->c:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;)Ld8/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;)",
            "Ld8/j;"
        }
    .end annotation

    new-instance v0, Ld8/j;

    invoke-direct {v0, p0, p1, p2}, Ld8/j;-><init>(Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lm8/a;Lm8/a;)Ld8/i;
    .locals 1

    new-instance v0, Ld8/i;

    invoke-direct {v0, p0, p1, p2}, Ld8/i;-><init>(Landroid/content/Context;Lm8/a;Lm8/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ld8/i;
    .locals 3

    iget-object v0, p0, Ld8/j;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ld8/j;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/a;

    iget-object v2, p0, Ld8/j;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm8/a;

    invoke-static {v0, v1, v2}, Ld8/j;->c(Landroid/content/Context;Lm8/a;Lm8/a;)Ld8/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld8/j;->b()Ld8/i;

    move-result-object v0

    return-object v0
.end method
