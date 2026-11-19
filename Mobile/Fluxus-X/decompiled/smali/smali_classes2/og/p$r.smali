.class public Log/p$r;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Ljava/util/Calendar;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltg/a;)Ljava/util/Calendar;
    .locals 11

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ltg/a;->c()V

    const/4 v0, 0x0

    move v2, v0

    move v3, v2

    move v4, v3

    move v5, v4

    move v6, v5

    move v7, v6

    :goto_0
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v1

    sget-object v8, Ltg/b;->d:Ltg/b;

    if-eq v1, v8, :cond_7

    invoke-virtual {p1}, Ltg/a;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ltg/a;->z()I

    move-result v8

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v9

    const/4 v10, -0x1

    sparse-switch v9, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v9, "hourOfDay"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x5

    goto :goto_1

    :sswitch_1
    const-string v9, "month"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x4

    goto :goto_1

    :sswitch_2
    const-string v9, "year"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v10, 0x3

    goto :goto_1

    :sswitch_3
    const-string v9, "second"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v10, 0x2

    goto :goto_1

    :sswitch_4
    const-string v9, "minute"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v10, 0x1

    goto :goto_1

    :sswitch_5
    const-string v9, "dayOfMonth"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    move v10, v0

    :goto_1
    packed-switch v10, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    move v5, v8

    goto :goto_0

    :pswitch_1
    move v3, v8

    goto :goto_0

    :pswitch_2
    move v2, v8

    goto :goto_0

    :pswitch_3
    move v7, v8

    goto :goto_0

    :pswitch_4
    move v6, v8

    goto :goto_0

    :pswitch_5
    move v4, v8

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Ltg/a;->h()V

    new-instance v1, Ljava/util/GregorianCalendar;

    invoke-direct/range {v1 .. v7}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4667c053 -> :sswitch_5
        -0x400459ec -> :sswitch_4
        -0x3604bb8c -> :sswitch_3
        0x38883d -> :sswitch_2
        0x6342280 -> :sswitch_1
        0x3ab9c2c1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ltg/c;Ljava/util/Calendar;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    const-string v0, "year"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    const-string v0, "month"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    const-string v0, "dayOfMonth"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    const-string v0, "hourOfDay"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/16 v0, 0xb

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    const-string v0, "minute"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    const-string v0, "second"

    invoke-virtual {p1, v0}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    const/16 v0, 0xd

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ltg/c;->O(J)Ltg/c;

    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/p$r;->a(Ltg/a;)Ljava/util/Calendar;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Calendar;

    invoke-virtual {p0, p1, p2}, Log/p$r;->b(Ltg/c;Ljava/util/Calendar;)V

    return-void
.end method
