.class public Lnj/a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/purchase/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj/a0;
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

    iput-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lpj/b;)V
    .locals 7

    iget-object v0, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v0}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object v0

    iget-object v1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v1

    invoke-virtual {v1}, Lnj/a;->j()Lmj/n;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ValidationCheck: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnj/n;->a(Lmj/n;Ljava/lang/String;)V

    sget-object v0, Lnj/a0$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->v(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->w:Lnj/e$b;

    const-string v0, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->q(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->g:Lnj/e$b;

    const-string v0, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->s(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->f:Lnj/e$b;

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->s(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->e:Lnj/e$b;

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->u(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->d:Lnj/e$b;

    const-string v0, "PrePurchaseValidation retry"

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->r(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->c:Lnj/e$b;

    const-string v0, "PrePurchaseValidation error"

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_5
    if-nez p3, :cond_0

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->C(Lnj/a0;)Lnj/n;

    move-result-object p1

    iget-object p3, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p3}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object p3

    invoke-virtual {p3}, Lnj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lnj/n;->r(Z)V

    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    sget-object p3, Lnj/e$b;->c:Lnj/e$b;

    const-string v0, "validatePurchaseResponsePayload is null"

    invoke-static {p1, p2, p3, v0}, Lnj/a0;->G(Lnj/a0;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {p1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v0

    iget-object v1, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v1}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v1

    invoke-virtual {v1}, Lnj/a;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v2}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v2

    invoke-virtual {v2}, Lnj/a;->d()J

    move-result-wide v2

    iget-object v4, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v4}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v4

    invoke-virtual {v4}, Lnj/a;->g()Z

    move-result v4

    iget-object v5, p0, Lnj/a0$c;->a:Lnj/a0;

    invoke-static {v5}, Lnj/a0;->A(Lnj/a0;)Lnj/a;

    move-result-object v5

    invoke-virtual {v5}, Lnj/a;->h()Z

    move-result v5

    invoke-virtual {p3}, Lpj/b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lnj/a;->a(Ljava/lang/String;JZZLjava/lang/String;)Lnj/a;

    move-result-object v0

    invoke-static {p1, v0}, Lnj/a0;->E(Lnj/a0;Lnj/a;)V

    invoke-virtual {p3}, Lpj/b;->c()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3}, Lpj/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, v1, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeInvokeStore(Ljava/lang/String;JLjava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
