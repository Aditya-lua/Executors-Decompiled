.class public Lfj/a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/purchase/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfj/a0;


# direct methods
.method public constructor <init>(Lfj/a0;)V
    .locals 0

    iput-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lhj/b;)V
    .locals 7

    iget-object v0, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v0}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object v0

    iget-object v1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v1}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v1

    invoke-virtual {v1}, Lfj/a;->j()Lej/i;

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

    invoke-virtual {v0, v1, v2}, Lfj/n;->a(Lej/i;Ljava/lang/String;)V

    sget-object v0, Lfj/a0$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->v(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->w:Lfj/e$b;

    const-string v0, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->q(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->g:Lfj/e$b;

    const-string v0, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->s(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->f:Lfj/e$b;

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->s(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->e:Lfj/e$b;

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->u(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->d:Lfj/e$b;

    const-string v0, "PrePurchaseValidation retry"

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->r(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->c:Lfj/e$b;

    const-string v0, "PrePurchaseValidation error"

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_5
    if-nez p3, :cond_0

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->C(Lfj/a0;)Lfj/n;

    move-result-object p1

    iget-object p3, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p3}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object p3

    invoke-virtual {p3}, Lfj/a;->g()Z

    move-result p3

    invoke-virtual {p1, p3}, Lfj/n;->r(Z)V

    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    sget-object p3, Lfj/e$b;->c:Lfj/e$b;

    const-string v0, "validatePurchaseResponsePayload is null"

    invoke-static {p1, p2, p3, v0}, Lfj/a0;->G(Lfj/a0;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {p1}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v0

    iget-object v1, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v1}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v1

    invoke-virtual {v1}, Lfj/a;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v2}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v2

    invoke-virtual {v2}, Lfj/a;->d()J

    move-result-wide v2

    iget-object v4, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v4}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v4

    invoke-virtual {v4}, Lfj/a;->g()Z

    move-result v4

    iget-object v5, p0, Lfj/a0$c;->a:Lfj/a0;

    invoke-static {v5}, Lfj/a0;->A(Lfj/a0;)Lfj/a;

    move-result-object v5

    invoke-virtual {v5}, Lfj/a;->h()Z

    move-result v5

    invoke-virtual {p3}, Lhj/b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lfj/a;->a(Ljava/lang/String;JZZLjava/lang/String;)Lfj/a;

    move-result-object v0

    invoke-static {p1, v0}, Lfj/a0;->E(Lfj/a0;Lfj/a;)V

    invoke-virtual {p3}, Lhj/b;->c()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3}, Lhj/b;->a()Ljava/lang/String;

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
