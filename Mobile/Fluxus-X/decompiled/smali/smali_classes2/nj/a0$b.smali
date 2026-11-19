.class public Lnj/a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnj/a0;->N()Lw7/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnj/a0;


# direct methods
.method public constructor <init>(Lnj/a0;)V
    .locals 0

    iput-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 2
    .param p1    # Lcom/android/billingclient/api/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/d;",
            "Ljava/util/List<",
            "Lw7/k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {v0}, Lnj/a0;->B(Lnj/a0;)Lnj/h0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 p2, 0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x7

    if-eq p1, p2, :cond_1

    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p2

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lnj/e$b;->s:Lnj/e$b;

    const-string v1, "onPurchasesUpdated failed"

    invoke-static {p1, p2, v0, v1}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "rbx.purchaseflow"

    const-string p2, "onPurchasesUpdated: ITEM_ALREADY_OWNED."

    invoke-static {p1, p2}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->F(Lnj/a0;)V

    return-void

    :cond_2
    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    const-string p2, "Android-Billing-Unavailable-Store-Blocked"

    invoke-virtual {p1, p2}, Lnj/n;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p2

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lnj/e$b;->s:Lnj/e$b;

    const-string v1, "onPurchasesUpdated: BILLING_UNAVAILABLE (Play Store blocked)"

    invoke-static {p1, p2, v0, v1}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p2

    invoke-virtual {p2}, Lnj/a;->c()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lnj/e$b;->j:Lnj/e$b;

    const-string v1, "User cancelled"

    invoke-static {p1, p2, v0, v1}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object p1, p0, Lnj/a0$b;->a:Lnj/a0;

    invoke-virtual {p1, p2}, Lnj/a0;->V(Ljava/util/List;)V

    return-void
.end method
