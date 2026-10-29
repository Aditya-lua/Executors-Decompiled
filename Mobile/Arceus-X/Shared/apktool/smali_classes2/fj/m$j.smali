.class public Lfj/m$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/purchase/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfj/m;


# direct methods
.method public constructor <init>(Lfj/m;)V
    .locals 0

    iput-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lhj/b;)V
    .locals 3

    iget-object v0, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {v0}, Lfj/m;->B(Lfj/m;)Lvi/g;

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

    invoke-virtual {v0, v1}, Lvi/g;->l(Ljava/lang/String;)V

    sget-object v0, Lfj/m$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->n0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->w:Lfj/e$b;

    const-string v0, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->j0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->g:Lfj/e$b;

    const-string v0, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->l0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->f:Lfj/e$b;

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->l0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->e:Lfj/e$b;

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->m0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->d:Lfj/e$b;

    const-string v0, "PrePurchaseValidation retry"

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1}, Lfj/m;->k0(Lfj/m;)V

    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    sget-object p3, Lfj/e$b;->c:Lfj/e$b;

    const-string v0, "PrePurchaseValidation error"

    invoke-static {p1, p2, p3, v0}, Lfj/m;->c0(Lfj/m;Ljava/lang/String;Lfj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Lfj/m$j;->a:Lfj/m;

    invoke-static {p1, p3}, Lfj/m;->N(Lfj/m;Lhj/b;)V

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
