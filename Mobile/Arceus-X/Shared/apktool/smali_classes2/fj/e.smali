.class public Lfj/e;
.super Lej/k;
.source "SourceFile"

# interfaces
.implements Lej/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/e$b;
    }
.end annotation


# instance fields
.field public final a:Lfj/e$b;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfj/e$b;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lfj/e;-><init>(Lfj/e$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lfj/e$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lej/k;-><init>()V

    .line 3
    iput-object p1, p0, Lfj/e;->a:Lfj/e$b;

    .line 4
    iput-object p2, p0, Lfj/e;->b:Ljava/lang/String;

    if-eqz p3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    const-string p3, ""

    :goto_0
    iput-object p3, p0, Lfj/e;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lfj/e;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfj/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 2

    sget v0, Lsg/q0;->W:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    sget-object v0, Lfj/e$a;->a:[I

    iget-object v1, p0, Lfj/e;->a:Lfj/e$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    sget v0, Lsg/q0;->p1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget v0, Lsg/q0;->n1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget v0, Lsg/q0;->p1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget v0, Lsg/q0;->x1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget v0, Lsg/q0;->w1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget v0, Lsg/q0;->m1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget v0, Lsg/q0;->p1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_6
    sget v0, Lsg/q0;->o1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_7
    sget v0, Lsg/q0;->s1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lfj/e;->a:Lfj/e$b;

    sget-object v1, Lfj/e$b;->a:Lfj/e$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lfj/e$b;->k:Lfj/e$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public f()Z
    .locals 4

    sget-object v0, Lfj/e$a;->a:[I

    iget-object v1, p0, Lfj/e;->a:Lfj/e$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    const/4 v3, 0x7

    if-eq v0, v3, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfj/e;->b:Ljava/lang/String;

    return-object v0
.end method
