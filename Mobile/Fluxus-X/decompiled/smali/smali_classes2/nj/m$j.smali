.class public Lnj/m$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/purchase/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnj/m;


# direct methods
.method public constructor <init>(Lnj/m;)V
    .locals 0

    iput-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lpj/b;)V
    .locals 3

    iget-object v0, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {v0}, Lnj/m;->B(Lnj/m;)Ldj/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ValidationCheck: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/g;->l(Ljava/lang/String;)V

    sget-object v0, Lnj/m$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->n0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->w:Lnj/e$b;

    const-string v0, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->j0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->g:Lnj/e$b;

    const-string v0, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->l0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->f:Lnj/e$b;

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->l0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->e:Lnj/e$b;

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->m0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->d:Lnj/e$b;

    const-string v0, "PrePurchaseValidation retry"

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1}, Lnj/m;->k0(Lnj/m;)V

    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    sget-object p3, Lnj/e$b;->c:Lnj/e$b;

    const-string v0, "PrePurchaseValidation error"

    invoke-static {p1, p2, p3, v0}, Lnj/m;->c0(Lnj/m;Ljava/lang/String;Lnj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Lnj/m$j;->a:Lnj/m;

    invoke-static {p1, p3}, Lnj/m;->N(Lnj/m;Lpj/b;)V

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
