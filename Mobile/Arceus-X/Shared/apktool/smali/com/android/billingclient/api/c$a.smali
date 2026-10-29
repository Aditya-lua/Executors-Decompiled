.class public Lcom/android/billingclient/api/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;

.field public d:Z

.field public e:Lcom/android/billingclient/api/c$c$a;


# direct methods
.method public synthetic constructor <init>(Lv7/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/android/billingclient/api/c$c;->a()Lcom/android/billingclient/api/c$c$a;

    move-result-object p1

    invoke-static {p1}, Lcom/android/billingclient/api/c$c$a;->b(Lcom/android/billingclient/api/c$c$a;)Lcom/android/billingclient/api/c$c$a;

    iput-object p1, p0, Lcom/android/billingclient/api/c$a;->e:Lcom/android/billingclient/api/c$c$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/c;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ljava/util/List;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/c$b;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ProductDetailsParams cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    new-instance v0, Lcom/android/billingclient/api/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/c;-><init>(Lv7/g1;)V

    iget-object v2, p0, Lcom/android/billingclient/api/c$a;->c:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v2}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->o(Lcom/android/billingclient/api/c;Z)V

    iget-object v2, p0, Lcom/android/billingclient/api/c$a;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->q(Lcom/android/billingclient/api/c;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/android/billingclient/api/c$a;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->r(Lcom/android/billingclient/api/c;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/android/billingclient/api/c$a;->e:Lcom/android/billingclient/api/c$c$a;

    invoke-virtual {v2}, Lcom/android/billingclient/api/c$c$a;->a()Lcom/android/billingclient/api/c$c;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->u(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/c$c;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->t(Lcom/android/billingclient/api/c;Ljava/util/ArrayList;)V

    iget-boolean v2, p0, Lcom/android/billingclient/api/c$a;->d:Z

    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->p(Lcom/android/billingclient/api/c;Z)V

    iget-object v2, p0, Lcom/android/billingclient/api/c$a;->c:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/n0;->i(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v2

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/n0;->k()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v2

    :goto_2
    invoke-static {v0, v2}, Lcom/android/billingclient/api/c;->s(Lcom/android/billingclient/api/c;Lcom/google/android/gms/internal/play_billing/n0;)V

    invoke-static {v0, v1}, Lcom/android/billingclient/api/c;->n(Lcom/android/billingclient/api/c;Lv7/g;)V

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Details of the products must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/c$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/c$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/c$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/util/List;)Lcom/android/billingclient/api/c$a;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/c$b;",
            ">;)",
            "Lcom/android/billingclient/api/c$a;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ljava/util/List;

    return-object p0
.end method
