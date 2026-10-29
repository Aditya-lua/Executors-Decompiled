.class public final Landroidx/datastore/preferences/protobuf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/t$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroidx/datastore/preferences/protobuf/t$b<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final d:Landroidx/datastore/preferences/protobuf/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/t<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/j1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/j1<",
            "TT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/t;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/t;-><init>(Z)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/t;->d:Landroidx/datastore/preferences/protobuf/t;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j1;->r()Landroidx/datastore/preferences/protobuf/j1;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/preferences/protobuf/j1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/j1<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    .line 7
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->u()V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j1;->r()Landroidx/datastore/preferences/protobuf/j1;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/t;-><init>(Landroidx/datastore/preferences/protobuf/j1;)V

    .line 4
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->u()V

    return-void
.end method

.method public static A(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/s1$b;->l:Landroidx/datastore/preferences/protobuf/s1$b;

    if-ne p1, v0, :cond_0

    check-cast p3, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {p0, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->z0(ILandroidx/datastore/preferences/protobuf/r0;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/t;->m(Landroidx/datastore/preferences/protobuf/s1$b;Z)I

    move-result v0

    invoke-virtual {p0, p2, v0}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    invoke-static {p0, p1, p3}, Landroidx/datastore/preferences/protobuf/t;->B(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)V

    return-void
.end method

.method public static B(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/t$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    instance-of p1, p2, Landroidx/datastore/preferences/protobuf/z$a;

    if-eqz p1, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/z$a;

    invoke-interface {p2}, Landroidx/datastore/preferences/protobuf/z$a;->getNumber()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->s0(I)V

    return-void

    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->s0(I)V

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->S0(J)V

    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->Q0(I)V

    return-void

    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->O0(J)V

    return-void

    :pswitch_4
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->M0(I)V

    return-void

    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    return-void

    :pswitch_6
    instance-of p1, p2, Landroidx/datastore/preferences/protobuf/g;

    if-eqz p1, :cond_1

    check-cast p2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->o0(Landroidx/datastore/preferences/protobuf/g;)V

    return-void

    :cond_1
    check-cast p2, [B

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->l0([B)V

    return-void

    :pswitch_7
    instance-of p1, p2, Landroidx/datastore/preferences/protobuf/g;

    if-eqz p1, :cond_2

    check-cast p2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->o0(Landroidx/datastore/preferences/protobuf/g;)V

    return-void

    :cond_2
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->U0(Ljava/lang/String;)V

    return-void

    :pswitch_8
    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->I0(Landroidx/datastore/preferences/protobuf/r0;)V

    return-void

    :pswitch_9
    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/j;->B0(Landroidx/datastore/preferences/protobuf/r0;)V

    return-void

    :pswitch_a
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->k0(Z)V

    return-void

    :pswitch_b
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->u0(I)V

    return-void

    :pswitch_c
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->w0(J)V

    return-void

    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->E0(I)V

    return-void

    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->Z0(J)V

    return-void

    :pswitch_f
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->G0(J)V

    return-void

    :pswitch_10
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->y0(F)V

    return-void

    :pswitch_11
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->q0(D)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public static c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    check-cast p0, [B

    array-length v0, p0

    new-array v0, v0, [B

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static d(Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)I
    .locals 1

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p1

    sget-object v0, Landroidx/datastore/preferences/protobuf/s1$b;->l:Landroidx/datastore/preferences/protobuf/s1$b;

    if-ne p0, v0, :cond_0

    mul-int/lit8 p1, p1, 0x2

    :cond_0
    invoke-static {p0, p2}, Landroidx/datastore/preferences/protobuf/t;->e(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static e(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/t$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/z$a;

    if-eqz p0, :cond_0

    check-cast p1, Landroidx/datastore/preferences/protobuf/z$a;

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/z$a;->getNumber()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->l(I)I

    move-result p0

    return p0

    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->l(I)I

    move-result p0

    return p0

    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->R(J)I

    move-result p0

    return p0

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->P(I)I

    move-result p0

    return p0

    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    move-result p0

    return p0

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    move-result p0

    return p0

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result p0

    return p0

    :pswitch_6
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/g;

    if-eqz p0, :cond_1

    check-cast p1, Landroidx/datastore/preferences/protobuf/g;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->h(Landroidx/datastore/preferences/protobuf/g;)I

    move-result p0

    return p0

    :cond_1
    check-cast p1, [B

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->f([B)I

    move-result p0

    return p0

    :pswitch_7
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/g;

    if-eqz p0, :cond_2

    check-cast p1, Landroidx/datastore/preferences/protobuf/g;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->h(Landroidx/datastore/preferences/protobuf/g;)I

    move-result p0

    return p0

    :cond_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->T(Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_8
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz p0, :cond_3

    check-cast p1, Landroidx/datastore/preferences/protobuf/c0;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->B(Landroidx/datastore/preferences/protobuf/d0;)I

    move-result p0

    return p0

    :cond_3
    check-cast p1, Landroidx/datastore/preferences/protobuf/r0;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->G(Landroidx/datastore/preferences/protobuf/r0;)I

    move-result p0

    return p0

    :pswitch_9
    check-cast p1, Landroidx/datastore/preferences/protobuf/r0;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->t(Landroidx/datastore/preferences/protobuf/r0;)I

    move-result p0

    return p0

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->e(Z)I

    move-result p0

    return p0

    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->n(I)I

    move-result p0

    return p0

    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->p(J)I

    move-result p0

    return p0

    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    move-result p0

    return p0

    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result p0

    return p0

    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->y(J)I

    move-result p0

    return p0

    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->r(F)I

    move-result p0

    return p0

    :pswitch_11
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Landroidx/datastore/preferences/protobuf/j;->j(D)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public static f(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/t$b<",
            "*>;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/t$b;->g()Landroidx/datastore/preferences/protobuf/s1$b;

    move-result-object v0

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/t$b;->getNumber()I

    move-result v1

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/t$b;->m()Z

    move-result p0

    const/4 v3, 0x0

    if-eqz p0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    return v3

    :cond_0
    move p0, v3

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/datastore/preferences/protobuf/t;->e(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)I

    move-result v4

    add-int/2addr p0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->U(I)I

    move-result p1

    add-int/2addr p1, p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result p0

    add-int/2addr p1, p0

    return p1

    :cond_2
    move p0, v3

    :goto_1
    if-ge v3, v2, :cond_3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v1, v4}, Landroidx/datastore/preferences/protobuf/t;->d(Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)I

    move-result v4

    add-int/2addr p0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return p0

    :cond_4
    invoke-static {v0, v1, p1}, Landroidx/datastore/preferences/protobuf/t;->d(Landroidx/datastore/preferences/protobuf/s1$b;ILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static h()Landroidx/datastore/preferences/protobuf/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/datastore/preferences/protobuf/t$b<",
            "TT;>;>()",
            "Landroidx/datastore/preferences/protobuf/t<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/t;->d:Landroidx/datastore/preferences/protobuf/t;

    return-object v0
.end method

.method public static m(Landroidx/datastore/preferences/protobuf/s1$b;Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/s1$b;->b()I

    move-result p0

    return p0
.end method

.method public static q(Ljava/util/Map$Entry;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/datastore/preferences/protobuf/t$b<",
            "TT;>;>(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->k()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object v1

    sget-object v2, Landroidx/datastore/preferences/protobuf/s1$c;->j:Landroidx/datastore/preferences/protobuf/s1$c;

    if-ne v1, v2, :cond_2

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/t;->r(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/t;->r(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static r(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Landroidx/datastore/preferences/protobuf/s0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/datastore/preferences/protobuf/s0;

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/s0;->isInitialized()Z

    move-result p0

    return p0

    :cond_0
    instance-of p0, p0, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Landroidx/datastore/preferences/protobuf/t$a;->a:[I

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/s1$b;->a()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    return v1

    :pswitch_0
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/r0;

    if-nez p0, :cond_1

    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v0

    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    if-nez p0, :cond_3

    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/z$a;

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    return v0

    :pswitch_2
    instance-of p0, p1, Landroidx/datastore/preferences/protobuf/g;

    if-nez p0, :cond_5

    instance-of p0, p1, [B

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    return v1

    :cond_5
    :goto_2
    return v0

    :pswitch_3
    instance-of p0, p1, Ljava/lang/String;

    return p0

    :pswitch_4
    instance-of p0, p1, Ljava/lang/Boolean;

    return p0

    :pswitch_5
    instance-of p0, p1, Ljava/lang/Double;

    return p0

    :pswitch_6
    instance-of p0, p1, Ljava/lang/Float;

    return p0

    :pswitch_7
    instance-of p0, p1, Ljava/lang/Long;

    return p0

    :pswitch_8
    instance-of p0, p1, Ljava/lang/Integer;

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
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

.method public static x()Landroidx/datastore/preferences/protobuf/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/datastore/preferences/protobuf/t$b<",
            "TT;>;>()",
            "Landroidx/datastore/preferences/protobuf/t<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Landroidx/datastore/preferences/protobuf/t;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/t;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/t;->z(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/t;->i(Landroidx/datastore/preferences/protobuf/t$b;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1, p1, v0}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    check-cast v0, Ljava/util/List;

    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "addRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Landroidx/datastore/preferences/protobuf/t;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/t<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Landroidx/datastore/preferences/protobuf/t;->x()Landroidx/datastore/preferences/protobuf/t;

    move-result-object v0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v3, v2}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Landroidx/datastore/preferences/protobuf/t;->y(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/j1;->n()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroidx/datastore/preferences/protobuf/t;->y(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    iput-boolean v1, v0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->b()Landroidx/datastore/preferences/protobuf/t;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/datastore/preferences/protobuf/t;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Landroidx/datastore/preferences/protobuf/t;

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/j1;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/datastore/preferences/protobuf/c0$c;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/j1;->i()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/c0$c;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->i()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Landroidx/datastore/preferences/protobuf/t$b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/j1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/datastore/preferences/protobuf/c0;

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/c0;->f()Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public j()I
    .locals 4

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v3, v1}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/t;->k(Ljava/util/Map$Entry;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->n()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/t;->k(Ljava/util/Map$Entry;)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_1

    :cond_1
    return v2
.end method

.method public final k(Ljava/util/Map$Entry;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->k()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object v2

    sget-object v3, Landroidx/datastore/preferences/protobuf/s1$c;->j:Landroidx/datastore/preferences/protobuf/s1$c;

    if-ne v2, v3, :cond_1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->m()Z

    move-result v2

    if-nez v2, :cond_1

    instance-of v0, v1, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->getNumber()I

    move-result p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/c0;

    invoke-static {p1, v1}, Landroidx/datastore/preferences/protobuf/j;->z(ILandroidx/datastore/preferences/protobuf/d0;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->getNumber()I

    move-result p1

    check-cast v1, Landroidx/datastore/preferences/protobuf/r0;

    invoke-static {p1, v1}, Landroidx/datastore/preferences/protobuf/j;->D(ILandroidx/datastore/preferences/protobuf/r0;)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/t;->f(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public l()I
    .locals 5

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v3, v1}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Landroidx/datastore/preferences/protobuf/t;->f(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->n()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/datastore/preferences/protobuf/t;->f(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_1

    :cond_1
    return v2
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->b:Z

    return v0
.end method

.method public p()Z
    .locals 4

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v3, v2}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v3

    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/t;->q(Ljava/util/Map$Entry;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->n()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/t;->q(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public t()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyIterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/datastore/preferences/protobuf/c0$c;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/j1;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/c0$c;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 4

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v2, v1}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Landroidx/datastore/preferences/protobuf/x;

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/x;->J()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->q()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->b:Z

    return-void
.end method

.method public v(Landroidx/datastore/preferences/protobuf/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/t<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p1, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j1;->l()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p1, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v2, v1}, Landroidx/datastore/preferences/protobuf/j1;->k(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/t;->w(Ljava/util/Map$Entry;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/j1;->n()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/t;->w(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final w(Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/t$b;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroidx/datastore/preferences/protobuf/c0;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v2

    if-eqz v2, :cond_3

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/t;->i(Landroidx/datastore/preferences/protobuf/t$b;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/t;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields can not be repeated"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/t$b;->k()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object v2

    sget-object v3, Landroidx/datastore/preferences/protobuf/s1$c;->j:Landroidx/datastore/preferences/protobuf/s1$c;

    if-ne v2, v3, :cond_7

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/t;->i(Landroidx/datastore/preferences/protobuf/t$b;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/t;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    :cond_4
    return-void

    :cond_5
    if-eqz v1, :cond_6

    check-cast p1, Landroidx/datastore/preferences/protobuf/c0;

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/c0;->f()Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    :cond_6
    check-cast v2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-interface {v2}, Landroidx/datastore/preferences/protobuf/r0;->a()Landroidx/datastore/preferences/protobuf/r0$a;

    move-result-object v1

    check-cast p1, Landroidx/datastore/preferences/protobuf/r0;

    invoke-interface {v0, v1, p1}, Landroidx/datastore/preferences/protobuf/t$b;->p(Landroidx/datastore/preferences/protobuf/r0$a;Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/r0$a;->build()Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v1, v0, p1}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    if-nez v1, :cond_8

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/t;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields must be message-valued"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public y(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, p1, v2}, Landroidx/datastore/preferences/protobuf/t;->z(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/t;->z(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V

    :goto_1
    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/c0;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->c:Z

    :cond_3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/j1;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j1;->s(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final z(Landroidx/datastore/preferences/protobuf/t$b;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->g()Landroidx/datastore/preferences/protobuf/s1$b;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/datastore/preferences/protobuf/t;->s(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->getNumber()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/t$b;->g()Landroidx/datastore/preferences/protobuf/s1$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/s1$b;->a()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    filled-new-array {v1, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
