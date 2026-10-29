.class public Lcom/android/billingclient/api/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/c$b;,
        Lcom/android/billingclient/api/c$c;,
        Lcom/android/billingclient/api/c$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/android/billingclient/api/c$c;

.field public e:Lcom/google/android/gms/internal/play_billing/n0;

.field public f:Ljava/util/ArrayList;

.field public g:Z


# direct methods
.method public synthetic constructor <init>(Lv7/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/android/billingclient/api/c$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/android/billingclient/api/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/c$a;-><init>(Lv7/g1;)V

    return-object v0
.end method

.method public static bridge synthetic n(Lcom/android/billingclient/api/c;Lv7/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static bridge synthetic o(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->a:Z

    return-void
.end method

.method public static bridge synthetic p(Lcom/android/billingclient/api/c;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/c;->g:Z

    return-void
.end method

.method public static bridge synthetic q(Lcom/android/billingclient/api/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic r(Lcom/android/billingclient/api/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c;->c:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic s(Lcom/android/billingclient/api/c;Lcom/google/android/gms/internal/play_billing/n0;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    return-void
.end method

.method public static bridge synthetic t(Lcom/android/billingclient/api/c;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic u(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/c$c;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    return-void
.end method


# virtual methods
.method public a()Lv7/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$c;->b()I

    move-result v0

    return v0
.end method

.method public e()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final f()Lcom/android/billingclient/api/d;
    .locals 11

    iget-object v0, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/c$b;

    const/4 v2, 0x1

    :goto_0
    iget-object v3, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    const-string v4, "play_pass_subs"

    const/4 v5, 0x5

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v3}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v6

    invoke-virtual {v6}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v3}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v0, "All products should have same ProductType."

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    iget-object v7, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    :goto_1
    if-ge v1, v8, :cond_7

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->a()Lcom/android/billingclient/api/c$b$b;

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->f()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->d()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_3

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ProductId can not be duplicated. Invalid product id: %s."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-virtual {v9}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "All products must have the same package name."

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->a()Lcom/android/billingclient/api/c$b$b;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "OldProductId must not be one of the products to be purchased. Invalid old product id: %s."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->c()Lcom/android/billingclient/api/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$b;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    if-eqz v1, :cond_c

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/e$b;

    invoke-virtual {v2}, Lcom/android/billingclient/api/e$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_b
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lcom/android/billingclient/api/e$b;->e()Lcom/android/billingclient/api/i;

    move-result-object v0

    if-eqz v0, :cond_c

    const-string v0, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."

    invoke-static {v5, v0}, Lcom/android/billingclient/api/h;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0

    :cond_c
    sget-object v0, Lcom/android/billingclient/api/h;->i:Lcom/android/billingclient/api/d;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$c;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$c;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/util/ArrayList;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/android/billingclient/api/c;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    return-object v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->g:Z

    return v0
.end method

.method public final w()Z
    .locals 5

    iget-object v0, p0, Lcom/android/billingclient/api/c;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$c;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->d:Lcom/android/billingclient/api/c$c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c$c;->b()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->a:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/c;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/c;->e:Lcom/google/android/gms/internal/play_billing/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/billingclient/api/c$b;

    invoke-virtual {v4}, Lcom/android/billingclient/api/c$b;->a()Lcom/android/billingclient/api/c$b$b;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
