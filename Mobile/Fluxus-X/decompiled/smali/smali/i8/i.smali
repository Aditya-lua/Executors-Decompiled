.class public final Li8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lj8/x;",
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
            "Lk8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/f;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/i;->a:Lyt/a;

    iput-object p2, p0, Li8/i;->b:Lyt/a;

    iput-object p3, p0, Li8/i;->c:Lyt/a;

    iput-object p4, p0, Li8/i;->d:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Li8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/f;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;)",
            "Li8/i;"
        }
    .end annotation

    new-instance v0, Li8/i;

    invoke-direct {v0, p0, p1, p2, p3}, Li8/i;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lk8/d;Lj8/f;Lm8/a;)Lj8/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Li8/h;->a(Landroid/content/Context;Lk8/d;Lj8/f;Lm8/a;)Lj8/x;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Le8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj8/x;

    return-object p0
.end method


# virtual methods
.method public b()Lj8/x;
    .locals 4

    iget-object v0, p0, Li8/i;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Li8/i;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk8/d;

    iget-object v2, p0, Li8/i;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/f;

    iget-object v3, p0, Li8/i;->d:Lyt/a;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm8/a;

    invoke-static {v0, v1, v2, v3}, Li8/i;->c(Landroid/content/Context;Lk8/d;Lj8/f;Lm8/a;)Lj8/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/i;->b()Lj8/x;

    move-result-object v0

    return-object v0
.end method
