.class public Lfj/m$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/m;->q1(Lfj/m$r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfj/m$r;

.field public final synthetic b:Lfj/m;


# direct methods
.method public constructor <init>(Lfj/m;Lfj/m$r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/m$g;->b:Lfj/m;

    iput-object p2, p0, Lfj/m$g;->a:Lfj/m$r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 3
    .param p1    # Lcom/android/billingclient/api/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lv7/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lv7/n;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v0

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Returned INAPP ProductDetails. Count = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/e;

    iget-object v0, p0, Lfj/m$g;->b:Lfj/m;

    invoke-static {v0}, Lfj/m;->x(Lfj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq p2, v0, :cond_0

    iget-object v0, p0, Lfj/m$g;->b:Lfj/m;

    invoke-static {v0}, Lfj/m;->x(Lfj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lfj/m$g;->b:Lfj/m;

    invoke-static {v0}, Lfj/m;->x(Lfj/m;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "queryInAppProduct Success. Count = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lfj/m$g;->b:Lfj/m;

    invoke-static {p2}, Lfj/m;->x(Lfj/m;)Ljava/util/Hashtable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Hashtable;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/m$g;->b:Lfj/m;

    sget-object p2, Lfj/m$o;->c:Lfj/m$o;

    invoke-static {p1, p2}, Lfj/m;->H(Lfj/m;Lfj/m$o;)V

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed queryInAppProduct. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/m$g;->b:Lfj/m;

    sget-object p2, Lfj/m$o;->a:Lfj/m$o;

    invoke-static {p1, p2}, Lfj/m;->H(Lfj/m;Lfj/m$o;)V

    :goto_1
    iget-object p1, p0, Lfj/m$g;->a:Lfj/m$r;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lfj/m$r;->a()V

    :cond_3
    return-void
.end method
