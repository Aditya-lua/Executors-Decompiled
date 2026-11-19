.class public final Ld8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Ld8/k;",
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
            "Ld8/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Ld8/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/l;->a:Lyt/a;

    iput-object p2, p0, Ld8/l;->b:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;)Ld8/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Ld8/i;",
            ">;)",
            "Ld8/l;"
        }
    .end annotation

    new-instance v0, Ld8/l;

    invoke-direct {v0, p0, p1}, Ld8/l;-><init>(Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Ld8/k;
    .locals 1

    new-instance v0, Ld8/k;

    check-cast p1, Ld8/i;

    invoke-direct {v0, p0, p1}, Ld8/k;-><init>(Landroid/content/Context;Ld8/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Ld8/k;
    .locals 2

    iget-object v0, p0, Ld8/l;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ld8/l;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ld8/l;->c(Landroid/content/Context;Ljava/lang/Object;)Ld8/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld8/l;->b()Ld8/k;

    move-result-object v0

    return-object v0
.end method
