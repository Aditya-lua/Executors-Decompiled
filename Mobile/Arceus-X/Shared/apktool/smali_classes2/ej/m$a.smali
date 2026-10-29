.class public Lej/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lej/m;->b(Ljava/lang/String;Lgi/a;Lej/m$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lej/m$c;

.field public final synthetic b:Lej/m;


# direct methods
.method public constructor <init>(Lej/m;Lej/m$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lej/m$a;->b:Lej/m;

    iput-object p2, p0, Lej/m$a;->a:Lej/m$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 3

    invoke-virtual {p1}, Lei/j;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Verify Purchase callback. response code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lei/j;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " responseBody = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.purchaseflow"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lei/j;->b()I

    move-result p1

    const/16 v1, 0xc8

    if-eq p1, v1, :cond_3

    const/16 v1, 0x1f4

    if-eq p1, v1, :cond_2

    const/16 v1, 0x190

    if-eq p1, v1, :cond_1

    const/16 v1, 0x191

    if-eq p1, v1, :cond_0

    const-string p1, "Unknown"

    invoke-static {v2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lej/m$b;->e:Lej/m$b;

    iget-object v1, p0, Lej/m$a;->b:Lej/m;

    invoke-static {v1}, Lej/m;->a(Lej/m;)Lvi/g;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g;->P()V

    goto :goto_0

    :cond_0
    const-string p1, "Unauthorized to make request."

    invoke-static {v2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lej/m$b;->c:Lej/m$b;

    iget-object v1, p0, Lej/m$a;->b:Lej/m;

    invoke-static {v1}, Lej/m;->a(Lej/m;)Lvi/g;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g;->N()V

    goto :goto_0

    :cond_1
    const-string p1, "Service was unable to validate receiptId."

    invoke-static {v2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lej/m$b;->b:Lej/m$b;

    iget-object v1, p0, Lej/m$a;->b:Lej/m;

    invoke-static {v1}, Lej/m;->a(Lej/m;)Lvi/g;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g;->M()V

    goto :goto_0

    :cond_2
    const-string p1, "Server error"

    invoke-static {v2, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lej/m$b;->e:Lej/m$b;

    iget-object v1, p0, Lej/m$a;->b:Lej/m;

    invoke-static {v1}, Lej/m;->a(Lej/m;)Lvi/g;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g;->O()V

    goto :goto_0

    :cond_3
    const-string p1, "Verification success"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lej/m$b;->a:Lej/m$b;

    iget-object v1, p0, Lej/m$a;->b:Lej/m;

    invoke-static {v1}, Lej/m;->a(Lej/m;)Lvi/g;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g;->L()V

    :goto_0
    invoke-static {v0}, Lhj/a;->a(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;

    move-result-object v0

    iget-object v1, p0, Lej/m$a;->a:Lej/m$c;

    if-eqz v1, :cond_4

    invoke-interface {v1, p1, v0}, Lej/m$c;->a(Lej/m$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    :cond_4
    return-void
.end method

.method public b(Lei/j;)V
    .locals 0

    return-void
.end method
