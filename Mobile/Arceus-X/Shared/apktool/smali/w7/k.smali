.class public Lw7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/k$i;,
        Lw7/k$f;,
        Lw7/k$j;,
        Lw7/k$b;,
        Lw7/k$e;,
        Lw7/k$d;,
        Lw7/k$c;,
        Lw7/k$g;,
        Lw7/k$h;
    }
.end annotation


# instance fields
.field public a:Lw7/g;

.field public b:Lw7/g$j0;

.field public c:Z

.field public d:I

.field public e:Z

.field public f:Lw7/k$h;

.field public g:Ljava/lang/StringBuilder;

.field public h:Z

.field public i:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw7/k;->a:Lw7/g;

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lw7/k;->c:Z

    iput-boolean v1, p0, Lw7/k;->e:Z

    iput-object v0, p0, Lw7/k;->f:Lw7/k$h;

    iput-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    iput-boolean v1, p0, Lw7/k;->h:Z

    iput-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static A0(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lw7/k$i;->A()V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static B0(Ljava/lang/String;)[Lw7/g$p;
    .locals 5

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lw7/k$i;->p()Lw7/g$p;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lw7/g$p;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lw7/g$p;->a()F

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result p0

    if-nez p0, :cond_5

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->p()Lw7/g$p;

    move-result-object p0

    if-nez p0, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p0}, Lw7/g$p;->i()Z

    move-result v4

    if-eqz v4, :cond_4

    return-object v1

    :cond_4
    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lw7/g$p;->a()F

    move-result p0

    add-float/2addr v2, p0

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    cmpl-float p0, v2, p0

    if-nez p0, :cond_6

    return-object v1

    :cond_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Lw7/g$p;

    invoke-interface {v3, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lw7/g$p;

    return-object p0
.end method

.method public static C0(Ljava/lang/String;)Lw7/g$e0$c;
    .locals 1

    const-string v0, "butt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lw7/g$e0$c;->a:Lw7/g$e0$c;

    return-object p0

    :cond_0
    const-string v0, "round"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lw7/g$e0$c;->b:Lw7/g$e0$c;

    return-object p0

    :cond_1
    const-string v0, "square"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lw7/g$e0$c;->c:Lw7/g$e0$c;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static D0(Ljava/lang/String;)Lw7/g$e0$d;
    .locals 1

    const-string v0, "miter"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lw7/g$e0$d;->a:Lw7/g$e0$d;

    return-object p0

    :cond_0
    const-string v0, "round"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lw7/g$e0$d;->b:Lw7/g$e0$d;

    return-object p0

    :cond_1
    const-string v0, "bevel"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lw7/g$e0$d;->c:Lw7/g$e0$d;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static E0(Lw7/g$l0;Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lw7/k$i;

    const-string v1, "/\\*.*?\\*/"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/16 p1, 0x3a

    invoke-virtual {v0, p1}, Lw7/k$i;->s(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0, p1}, Lw7/k$i;->f(C)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lw7/k$i;->A()V

    const/16 p1, 0x3b

    invoke-virtual {v0, p1}, Lw7/k$i;->u(C)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_1
    return-void

    :cond_2
    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, p1}, Lw7/k$i;->f(C)Z

    move-result p1

    if-eqz p1, :cond_0

    :cond_3
    iget-object p1, p0, Lw7/g$l0;->f:Lw7/g$e0;

    if-nez p1, :cond_4

    new-instance p1, Lw7/g$e0;

    invoke-direct {p1}, Lw7/g$e0;-><init>()V

    iput-object p1, p0, Lw7/g$l0;->f:Lw7/g$e0;

    :cond_4
    iget-object p1, p0, Lw7/g$l0;->f:Lw7/g$e0;

    invoke-static {p1, v1, v2}, Lw7/k;->S0(Lw7/g$e0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    goto :goto_0
.end method

.method public static F0(Ljava/lang/String;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2d

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_0
    new-instance v2, Ljava/util/Locale;

    const-string v3, ""

    invoke-direct {v2, v1, v3, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lw7/k$i;->A()V

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static G0(Ljava/lang/String;)Lw7/g$e0$f;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "start"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "end"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "middle"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lw7/g$e0$f;->a:Lw7/g$e0$f;

    return-object p0

    :pswitch_1
    sget-object p0, Lw7/g$e0$f;->c:Lw7/g$e0$f;

    return-object p0

    :pswitch_2
    sget-object p0, Lw7/g$e0$f;->b:Lw7/g$e0$f;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x4009266b -> :sswitch_2
        0x188db -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static H0(Ljava/lang/String;)Lw7/g$e0$g;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "overline"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "blink"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "none"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "underline"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "line-through"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lw7/g$e0$g;->c:Lw7/g$e0$g;

    return-object p0

    :pswitch_1
    sget-object p0, Lw7/g$e0$g;->e:Lw7/g$e0$g;

    return-object p0

    :pswitch_2
    sget-object p0, Lw7/g$e0$g;->a:Lw7/g$e0$g;

    return-object p0

    :pswitch_3
    sget-object p0, Lw7/g$e0$g;->b:Lw7/g$e0$g;

    return-object p0

    :pswitch_4
    sget-object p0, Lw7/g$e0$g;->d:Lw7/g$e0$g;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x45d81614 -> :sswitch_4
        -0x3d363934 -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x597af5c -> :sswitch_1
        0x1f9462c8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static I0(Ljava/lang/String;)Lw7/g$e0$h;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "ltr"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "rtl"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lw7/g$e0$h;->b:Lw7/g$e0$h;

    return-object p0

    :cond_1
    sget-object p0, Lw7/g$e0$h;->a:Lw7/g$e0$h;

    return-object p0
.end method

.method public static M0(Ljava/lang/String;)Lw7/g$e0$i;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "none"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "non-scaling-stroke"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lw7/g$e0$i;->b:Lw7/g$e0$i;

    return-object p0

    :cond_1
    sget-object p0, Lw7/g$e0$i;->a:Lw7/g$e0$i;

    return-object p0
.end method

.method public static N0(Ljava/lang/String;)Lw7/g$b;
    .locals 5

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result p0

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v1

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v2

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v3, 0x0

    cmpg-float v4, v2, v3

    if-ltz v4, :cond_1

    cmpg-float v3, v0, v3

    if-ltz v3, :cond_0

    new-instance v3, Lw7/g$b;

    invoke-direct {v3, p0, v1, v2, v0}, Lw7/g$b;-><init>(FFFF)V

    return-object v3

    :cond_0
    new-instance p0, Lw7/j;

    const-string v0, "Invalid viewBox. height cannot be negative"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lw7/j;

    const-string v0, "Invalid viewBox. width cannot be negative"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lw7/j;

    const-string v0, "Invalid viewBox definition - should have four numbers"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static S0(Lw7/g$e0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "inherit"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object v0, Lw7/k$a;->b:[I

    invoke-static {p1}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-string v1, "none"

    const-string v2, "SVGParser"

    const-string v3, "currentColor"

    const/16 v4, 0x7c

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-static {p2}, Lw7/k;->y0(Ljava/lang/String;)Lw7/g$e0$e;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->M:Lw7/g$e0$e;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x2000000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_1
    invoke-static {p2}, Lw7/k;->M0(Ljava/lang/String;)Lw7/g$e0$i;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->L:Lw7/g$e0$i;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x800000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_2
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->K:Ljava/lang/Float;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x400000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_3
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lw7/g$g;->a()Lw7/g$g;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->J:Lw7/g$o0;

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-static {p2}, Lw7/k;->b0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->J:Lw7/g$o0;
    :try_end_0
    .catch Lw7/j; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x200000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :pswitch_4
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->I:Ljava/lang/Float;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x100000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_5
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lw7/g$g;->a()Lw7/g$g;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->H:Lw7/g$o0;

    goto :goto_1

    :cond_3
    :try_start_1
    invoke-static {p2}, Lw7/k;->b0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->H:Lw7/g$o0;
    :try_end_1
    .catch Lw7/j; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x80000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :pswitch_6
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->G:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x40000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_7
    invoke-static {p2}, Lw7/k;->e0(Ljava/lang/String;)Lw7/g$e0$a;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->F:Lw7/g$e0$a;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x20000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_8
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->E:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x10000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_9
    invoke-static {p2}, Lw7/k;->a0(Ljava/lang/String;)Lw7/g$c;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->w:Lw7/g$c;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x100000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_a
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->D:Ljava/lang/Float;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x8000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_b
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lw7/g$g;->a()Lw7/g$g;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->C:Lw7/g$o0;

    goto :goto_2

    :cond_4
    :try_start_2
    invoke-static {p2}, Lw7/k;->b0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->C:Lw7/g$o0;
    :try_end_2
    .catch Lw7/j; {:try_start_2 .. :try_end_2} :catch_2

    :goto_2
    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x4000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|visible|hidden|collapse|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string p1, "visible"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->B:Ljava/lang/Boolean;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x2000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_d
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->A:Ljava/lang/Boolean;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x1000000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_e
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->z:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x800000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_f
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->y:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x400000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_10
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->x:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x200000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_11
    invoke-static {p2, p1}, Lw7/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->x:Ljava/lang/String;

    iput-object p1, p0, Lw7/g$e0;->y:Ljava/lang/String;

    iput-object p1, p0, Lw7/g$e0;->z:Ljava/lang/String;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0xe00000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_12
    invoke-static {p2}, Lw7/k;->s0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->v:Ljava/lang/Boolean;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x80000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_13
    invoke-static {p2}, Lw7/k;->G0(Ljava/lang/String;)Lw7/g$e0$f;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->u:Lw7/g$e0$f;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x40000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_14
    invoke-static {p2}, Lw7/k;->I0(Ljava/lang/String;)Lw7/g$e0$h;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->t:Lw7/g$e0$h;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide v0, 0x1000000000L

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_15
    invoke-static {p2}, Lw7/k;->H0(Ljava/lang/String;)Lw7/g$e0$g;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->s:Lw7/g$e0$g;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x20000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_16
    invoke-static {p2}, Lw7/k;->k0(Ljava/lang/String;)Lw7/g$e0$b;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->r:Lw7/g$e0$b;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x10000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_17
    invoke-static {p2}, Lw7/k;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->q:Ljava/lang/Integer;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/32 v0, 0x8000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_18
    invoke-static {p2}, Lw7/k;->j0(Ljava/lang/String;)Lw7/g$p;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->p:Lw7/g$p;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x4000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_19
    invoke-static {p2}, Lw7/k;->i0(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->o:Ljava/util/List;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_1a
    invoke-static {p0, p2}, Lw7/k;->h0(Lw7/g$e0;Ljava/lang/String;)V

    return-void

    :pswitch_1b
    :try_start_3
    invoke-static {p2}, Lw7/k;->b0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->n:Lw7/g$f;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J
    :try_end_3
    .catch Lw7/j; {:try_start_3 .. :try_end_3} :catch_3

    return-void

    :pswitch_1c
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->m:Ljava/lang/Float;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_1d
    :try_start_4
    invoke-static {p2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->l:Lw7/g$p;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J
    :try_end_4
    .catch Lw7/j; {:try_start_4 .. :try_end_4} :catch_3

    return-void

    :pswitch_1e
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-wide/16 v0, 0x200

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    iput-object p1, p0, Lw7/g$e0;->k:[Lw7/g$p;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :cond_7
    invoke-static {p2}, Lw7/k;->B0(Ljava/lang/String;)[Lw7/g$p;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->k:[Lw7/g$p;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_1f
    :try_start_5
    invoke-static {p2}, Lw7/k;->f0(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->j:Ljava/lang/Float;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J
    :try_end_5
    .catch Lw7/j; {:try_start_5 .. :try_end_5} :catch_3

    return-void

    :pswitch_20
    invoke-static {p2}, Lw7/k;->D0(Ljava/lang/String;)Lw7/g$e0$d;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->i:Lw7/g$e0$d;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_21
    invoke-static {p2}, Lw7/k;->C0(Ljava/lang/String;)Lw7/g$e0$c;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->h:Lw7/g$e0$c;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_22
    :try_start_6
    invoke-static {p2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->g:Lw7/g$p;

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J
    :try_end_6
    .catch Lw7/j; {:try_start_6 .. :try_end_6} :catch_3

    return-void

    :pswitch_23
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->f:Ljava/lang/Float;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_24
    invoke-static {p2}, Lw7/k;->t0(Ljava/lang/String;)Lw7/g$o0;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->e:Lw7/g$o0;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_25
    invoke-static {p2}, Lw7/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->d:Ljava/lang/Float;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_26
    invoke-static {p2}, Lw7/k;->e0(Ljava/lang/String;)Lw7/g$e0$a;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->c:Lw7/g$e0$a;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    return-void

    :pswitch_27
    invoke-static {p2}, Lw7/k;->t0(Ljava/lang/String;)Lw7/g$o0;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->b:Lw7/g$o0;

    if-eqz p1, :cond_8

    iget-wide p1, p0, Lw7/g$e0;->a:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lw7/g$e0;->a:J

    :catch_3
    :cond_8
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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

.method public static synthetic a(Lw7/k;)V
    .locals 0

    invoke-virtual {p0}, Lw7/k;->W0()V

    return-void
.end method

.method public static a0(Ljava/lang/String;)Lw7/g$c;
    .locals 6

    const-string v0, "auto"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "rect("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    new-instance v0, Lw7/k$i;

    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v0}, Lw7/k;->q0(Lw7/k$i;)Lw7/g$p;

    move-result-object p0

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-static {v0}, Lw7/k;->q0(Lw7/k$i;)Lw7/g$p;

    move-result-object v2

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-static {v0}, Lw7/k;->q0(Lw7/k$i;)Lw7/g$p;

    move-result-object v3

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-static {v0}, Lw7/k;->q0(Lw7/k$i;)Lw7/g$p;

    move-result-object v4

    invoke-virtual {v0}, Lw7/k$i;->A()V

    const/16 v5, 0x29

    invoke-virtual {v0, v5}, Lw7/k$i;->f(C)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Lw7/g$c;

    invoke-direct {v0, p0, v2, v3, v4}, Lw7/g$c;-><init>(Lw7/g$p;Lw7/g$p;Lw7/g$p;Lw7/g$p;)V

    return-object v0
.end method

.method public static synthetic b(Lw7/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lw7/k;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public static b0(Ljava/lang/String;)Lw7/g$f;
    .locals 11

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x23

    const/4 v2, 0x5

    const/high16 v3, -0x1000000

    const/4 v4, 0x4

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lw7/c;->b(Ljava/lang/String;II)Lw7/c;

    move-result-object v0

    const-string v1, "Bad hex colour value: "

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lw7/c;->a()I

    move-result v5

    if-eq v5, v4, :cond_3

    if-eq v5, v2, :cond_2

    const/4 v2, 0x7

    if-eq v5, v2, :cond_1

    const/16 v2, 0x9

    if-ne v5, v2, :cond_0

    new-instance p0, Lw7/g$f;

    invoke-virtual {v0}, Lw7/c;->d()I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    invoke-virtual {v0}, Lw7/c;->d()I

    move-result v0

    ushr-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_0
    new-instance v0, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Lw7/g$f;

    invoke-virtual {v0}, Lw7/c;->d()I

    move-result v0

    or-int/2addr v0, v3

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_2
    invoke-virtual {v0}, Lw7/c;->d()I

    move-result p0

    const v0, 0xf000

    and-int/2addr v0, p0

    and-int/lit16 v1, p0, 0xf00

    and-int/lit16 v2, p0, 0xf0

    and-int/lit8 p0, p0, 0xf

    new-instance v3, Lw7/g$f;

    shl-int/lit8 v5, p0, 0x1c

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v5

    shl-int/lit8 v5, v0, 0x8

    or-int/2addr p0, v5

    shl-int/2addr v0, v4

    or-int/2addr p0, v0

    shl-int/lit8 v0, v1, 0x4

    or-int/2addr p0, v0

    or-int/2addr p0, v1

    or-int/2addr p0, v2

    shr-int/lit8 v0, v2, 0x4

    or-int/2addr p0, v0

    invoke-direct {v3, p0}, Lw7/g$f;-><init>(I)V

    return-object v3

    :cond_3
    invoke-virtual {v0}, Lw7/c;->d()I

    move-result p0

    and-int/lit16 v0, p0, 0xf00

    and-int/lit16 v1, p0, 0xf0

    and-int/lit8 p0, p0, 0xf

    new-instance v2, Lw7/g$f;

    shl-int/lit8 v5, v0, 0xc

    or-int/2addr v3, v5

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x8

    or-int/2addr v0, v3

    shl-int/2addr v1, v4

    or-int/2addr v0, v1

    shl-int/lit8 v1, p0, 0x4

    or-int/2addr v0, v1

    or-int/2addr p0, v0

    invoke-direct {v2, p0}, Lw7/g$f;-><init>(I)V

    return-object v2

    :cond_4
    new-instance v0, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "rgba("

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/16 v5, 0x29

    const/high16 v6, 0x43800000    # 256.0f

    const/16 v7, 0x25

    if-nez v1, :cond_f

    const-string v8, "rgb("

    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v1, "hsla("

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v8, "hsl("

    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v0}, Lw7/k;->c0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p0

    return-object p0

    :cond_8
    :goto_0
    new-instance v0, Lw7/k$i;

    if-eqz v1, :cond_9

    goto :goto_1

    :cond_9
    move v2, v4

    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v2

    invoke-virtual {v0, v2}, Lw7/k$i;->d(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v0, v7}, Lw7/k$i;->f(C)Z

    :cond_a
    invoke-virtual {v0, v4}, Lw7/k$i;->d(F)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_b

    invoke-virtual {v0, v7}, Lw7/k$i;->f(C)Z

    :cond_b
    if-eqz v1, :cond_d

    invoke-virtual {v0, v8}, Lw7/k$i;->d(F)F

    move-result v1

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v0, v5}, Lw7/k$i;->f(C)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance p0, Lw7/g$f;

    mul-float/2addr v1, v6

    invoke-static {v1}, Lw7/k;->j(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-static {v2, v4, v8}, Lw7/k;->s(FFF)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_c
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad hsla() colour value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {v0, v5}, Lw7/k$i;->f(C)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance p0, Lw7/g$f;

    invoke-static {v2, v4, v8}, Lw7/k;->s(FFF)I

    move-result v0

    or-int/2addr v0, v3

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_e
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad hsl() colour value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_2
    new-instance v0, Lw7/k$i;

    if-eqz v1, :cond_10

    goto :goto_3

    :cond_10
    move v2, v4

    :goto_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    const/high16 v8, 0x42c80000    # 100.0f

    if-nez v4, :cond_11

    invoke-virtual {v0, v7}, Lw7/k$i;->f(C)Z

    move-result v4

    if-eqz v4, :cond_11

    mul-float/2addr v2, v6

    div-float/2addr v2, v8

    :cond_11
    invoke-virtual {v0, v2}, Lw7/k$i;->d(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_12

    invoke-virtual {v0, v7}, Lw7/k$i;->f(C)Z

    move-result v9

    if-eqz v9, :cond_12

    mul-float/2addr v4, v6

    div-float/2addr v4, v8

    :cond_12
    invoke-virtual {v0, v4}, Lw7/k$i;->d(F)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_13

    invoke-virtual {v0, v7}, Lw7/k$i;->f(C)Z

    move-result v7

    if-eqz v7, :cond_13

    mul-float/2addr v9, v6

    div-float/2addr v9, v8

    :cond_13
    if-eqz v1, :cond_15

    invoke-virtual {v0, v9}, Lw7/k$i;->d(F)F

    move-result v1

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_14

    invoke-virtual {v0, v5}, Lw7/k$i;->f(C)Z

    move-result v0

    if-eqz v0, :cond_14

    new-instance p0, Lw7/g$f;

    mul-float/2addr v1, v6

    invoke-static {v1}, Lw7/k;->j(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-static {v2}, Lw7/k;->j(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-static {v4}, Lw7/k;->j(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-static {v9}, Lw7/k;->j(F)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_14
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad rgba() colour value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {v0, v5}, Lw7/k$i;->f(C)Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance p0, Lw7/g$f;

    invoke-static {v2}, Lw7/k;->j(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v3

    invoke-static {v4}, Lw7/k;->j(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-static {v9}, Lw7/k;->j(F)I

    move-result v1

    or-int/2addr v0, v1

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_16
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad rgb() colour value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic c(Lw7/k;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw7/k;->c1(Ljava/lang/String;)V

    return-void
.end method

.method public static c0(Ljava/lang/String;)Lw7/g$f;
    .locals 3

    invoke-static {p0}, Lw7/k$c;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Lw7/g$f;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lw7/g$f;-><init>(I)V

    return-object p0

    :cond_0
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid colour keyword: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic d(Lw7/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lw7/k;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d0(Ljava/lang/String;)Lw7/g$o0;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "none"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "currentColor"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p0}, Lw7/k;->b0(Ljava/lang/String;)Lw7/g$f;

    move-result-object p0
    :try_end_0
    .catch Lw7/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {}, Lw7/g$g;->a()Lw7/g$g;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lw7/g$f;->c:Lw7/g$f;

    return-object p0
.end method

.method public static synthetic e(Lw7/k;)V
    .locals 0

    invoke-virtual {p0}, Lw7/k;->o()V

    return-void
.end method

.method public static e0(Ljava/lang/String;)Lw7/g$e0$a;
    .locals 1

    const-string v0, "nonzero"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lw7/g$e0$a;->a:Lw7/g$e0$a;

    return-object p0

    :cond_0
    const-string v0, "evenodd"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lw7/g$e0$a;->b:Lw7/g$e0$a;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic f(Lw7/k;Lw7/k$i;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0, p1}, Lw7/k;->x0(Lw7/k$i;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Ljava/lang/String;)F
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lw7/k;->g0(Ljava/lang/String;II)F

    move-result p0

    return p0

    :cond_0
    new-instance p0, Lw7/j;

    const-string v0, "Invalid float value (empty string)"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic g(Lw7/k;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw7/k;->r(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static g0(Ljava/lang/String;II)F
    .locals 1

    new-instance v0, Lw7/d;

    invoke-direct {v0}, Lw7/d;-><init>()V

    invoke-virtual {v0, p0, p1, p2}, Lw7/d;->b(Ljava/lang/String;II)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_0

    return p1

    :cond_0
    new-instance p1, Lw7/j;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid float value: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static h0(Lw7/g$e0;Ljava/lang/String;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "|caption|icon|menu|message-box|small-caption|status-bar|"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p1}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    move-object v1, p1

    move-object v2, v1

    :goto_0
    const/16 v3, 0x2f

    invoke-virtual {v0, v3}, Lw7/k$i;->s(C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lw7/k$i;->A()V

    if-nez v4, :cond_1

    :goto_1
    return-void

    :cond_1
    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "normal"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    invoke-static {v4}, Lw7/k$e;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    if-nez v1, :cond_5

    invoke-static {v4}, Lw7/k;->k0(Ljava/lang/String;)Lw7/g$e0$b;

    move-result-object v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    if-nez v2, :cond_6

    const-string v2, "small-caps"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, v4

    goto :goto_0

    :cond_6
    :goto_2
    invoke-static {v4}, Lw7/k;->j0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v2

    invoke-virtual {v0, v3}, Lw7/k$i;->f(C)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    :try_start_0
    invoke-static {v3}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;
    :try_end_0
    .catch Lw7/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    return-void

    :cond_7
    :goto_3
    invoke-virtual {v0}, Lw7/k$i;->A()V

    :cond_8
    invoke-virtual {v0}, Lw7/k$i;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw7/k;->i0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lw7/g$e0;->o:Ljava/util/List;

    iput-object v2, p0, Lw7/g$e0;->p:Lw7/g$p;

    if-nez p1, :cond_9

    const/16 p1, 0x190

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw7/g$e0;->q:Ljava/lang/Integer;

    if-nez v1, :cond_a

    sget-object v1, Lw7/g$e0$b;->a:Lw7/g$e0$b;

    :cond_a
    iput-object v1, p0, Lw7/g$e0;->r:Lw7/g$e0$b;

    iget-wide v0, p0, Lw7/g$e0;->a:J

    const-wide/32 v2, 0x1e000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lw7/g$e0;->a:J

    return-void
.end method

.method public static i0(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {v0}, Lw7/k$i;->q()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Lw7/k$i;->u(C)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    return-object p0

    :cond_2
    if-nez p0, :cond_3

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0
.end method

.method public static j(F)I
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/high16 v0, 0x437f0000    # 255.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    const/16 p0, 0xff

    return p0

    :cond_1
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static j0(Ljava/lang/String;)Lw7/g$p;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lw7/k$d;->a(Ljava/lang/String;)Lw7/g$p;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object p0
    :try_end_0
    .catch Lw7/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_0
    return-object v0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static k0(Ljava/lang/String;)Lw7/g$e0$b;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "normal"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "italic"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "oblique"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lw7/g$e0$b;->a:Lw7/g$e0$b;

    return-object p0

    :pswitch_1
    sget-object p0, Lw7/g$e0$b;->b:Lw7/g$e0$b;

    return-object p0

    :pswitch_2
    sget-object p0, Lw7/g$e0$b;->c:Lw7/g$e0$b;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x62ce05cf -> :sswitch_2
        -0x4642c5d0 -> :sswitch_1
        -0x3df94319 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static l0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lw7/k$e;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string p1, "none"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const-string p1, "url("

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x4

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Ljava/lang/String;)Lw7/g$p;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v1, Lw7/g$d1;->a:Lw7/g$d1;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x25

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lw7/g$d1;->i:Lw7/g$d1;

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-le v0, v3, :cond_1

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lw7/g$d1;->valueOf(Ljava/lang/String;)Lw7/g$d1;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid length unit specifier: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v2, 0x0

    :try_start_1
    invoke-static {p0, v2, v0}, Lw7/k;->g0(Ljava/lang/String;II)F

    move-result v0

    new-instance v2, Lw7/g$p;

    invoke-direct {v2, v0, v1}, Lw7/g$p;-><init>(FLw7/g$d1;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v0

    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid length value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :cond_2
    new-instance p0, Lw7/j;

    const-string v0, "Invalid length value (empty string)"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p0(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lw7/g$p;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lw7/k$i;

    invoke-direct {v1, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lw7/k$i;->A()V

    :goto_0
    invoke-virtual {v1}, Lw7/k$i;->h()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {v1}, Lw7/k$i;->n()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lw7/k$i;->v()Lw7/g$d1;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Lw7/g$d1;->a:Lw7/g$d1;

    :cond_0
    new-instance v3, Lw7/g$p;

    invoke-direct {v3, p0, v2}, Lw7/g$p;-><init>(FLw7/g$d1;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lw7/k$i;->z()Z

    goto :goto_0

    :cond_1
    new-instance p0, Lw7/j;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid length list value: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lw7/k$i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-object v0

    :cond_3
    new-instance p0, Lw7/j;

    const-string v0, "Invalid length list (empty string)"

    invoke-direct {p0, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static q0(Lw7/k$i;)Lw7/g$p;
    .locals 1

    const-string v0, "auto"

    invoke-virtual {p0, v0}, Lw7/k$i;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lw7/g$p;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw7/g$p;-><init>(F)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lw7/k$i;->p()Lw7/g$p;

    move-result-object p0

    return-object p0
.end method

.method public static r0(Ljava/lang/String;)Ljava/lang/Float;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lw7/k;->f0(Ljava/lang/String;)F

    move-result p0

    const/4 v0, 0x0

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    :goto_0
    move p0, v0

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0
    :try_end_0
    .catch Lw7/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static s(FFF)I
    .locals 3

    const/4 v0, 0x0

    cmpl-float v1, p0, v0

    const/high16 v2, 0x43b40000    # 360.0f

    rem-float/2addr p0, v2

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    add-float/2addr p0, v2

    :goto_0
    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr p0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    div-float/2addr p2, v1

    cmpg-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-gez v1, :cond_1

    move p1, v0

    goto :goto_1

    :cond_1
    cmpl-float v1, p1, v2

    if-lez v1, :cond_2

    move p1, v2

    :cond_2
    :goto_1
    cmpg-float v1, p2, v0

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    cmpl-float v0, p2, v2

    if-lez v0, :cond_4

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, p2

    :goto_2
    const/high16 p2, 0x3f000000    # 0.5f

    cmpg-float p2, v0, p2

    if-gtz p2, :cond_5

    add-float/2addr p1, v2

    mul-float/2addr p1, v0

    goto :goto_3

    :cond_5
    add-float p2, v0, p1

    mul-float/2addr p1, v0

    sub-float p1, p2, p1

    :goto_3
    const/high16 p2, 0x40000000    # 2.0f

    mul-float/2addr v0, p2

    sub-float/2addr v0, p1

    add-float v1, p0, p2

    invoke-static {v0, p1, v1}, Lw7/k;->t(FFF)F

    move-result v1

    invoke-static {v0, p1, p0}, Lw7/k;->t(FFF)F

    move-result v2

    sub-float/2addr p0, p2

    invoke-static {v0, p1, p0}, Lw7/k;->t(FFF)F

    move-result p0

    const/high16 p1, 0x43800000    # 256.0f

    mul-float/2addr v1, p1

    invoke-static {v1}, Lw7/k;->j(F)I

    move-result p2

    shl-int/lit8 p2, p2, 0x10

    mul-float/2addr v2, p1

    invoke-static {v2}, Lw7/k;->j(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p2, v0

    mul-float/2addr p0, p1

    invoke-static {p0}, Lw7/k;->j(F)I

    move-result p0

    or-int/2addr p0, p2

    return p0
.end method

.method public static s0(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "visible"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "auto"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "scroll"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "hidden"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :pswitch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x48916256 -> :sswitch_3
        -0x361a1933 -> :sswitch_2
        0x2dddaf -> :sswitch_1
        0x1bd1f072 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static t(FFF)F
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    const/high16 v1, 0x40c00000    # 6.0f

    if-gez v0, :cond_0

    add-float/2addr p2, v1

    :cond_0
    cmpl-float v0, p2, v1

    if-ltz v0, :cond_1

    sub-float/2addr p2, v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    sub-float/2addr p1, p0

    mul-float/2addr p1, p2

    :goto_0
    add-float/2addr p1, p0

    return p1

    :cond_2
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_3

    return p1

    :cond_3
    const/high16 v0, 0x40800000    # 4.0f

    cmpg-float v1, p2, v0

    if-gez v1, :cond_4

    sub-float/2addr p1, p0

    sub-float/2addr v0, p2

    mul-float/2addr p1, v0

    goto :goto_0

    :cond_4
    return p0
.end method

.method public static t0(Ljava/lang/String;)Lw7/g$o0;
    .locals 4

    const-string v0, "url("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, ")"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Lw7/k;->d0(Ljava/lang/String;)Lw7/g$o0;

    move-result-object v2

    :cond_0
    new-instance p0, Lw7/g$u;

    invoke-direct {p0, v1, v2}, Lw7/g$u;-><init>(Ljava/lang/String;Lw7/g$o0;)V

    return-object p0

    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lw7/g$u;

    invoke-direct {v0, p0, v2}, Lw7/g$u;-><init>(Ljava/lang/String;Lw7/g$o0;)V

    return-object v0

    :cond_2
    invoke-static {p0}, Lw7/k;->d0(Ljava/lang/String;)Lw7/g$o0;

    move-result-object p0

    return-object p0
.end method

.method public static u0(Ljava/lang/String;)Lw7/g$w;
    .locals 19

    new-instance v0, Lw7/k$i;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    new-instance v1, Lw7/g$w;

    invoke-direct {v1}, Lw7/g$w;-><init>()V

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-virtual {v0}, Lw7/k$i;->l()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x4d

    const/16 v9, 0x6d

    if-eq v2, v3, :cond_1

    if-eq v2, v9, :cond_1

    goto/16 :goto_7

    :cond_1
    move v11, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->A()V

    const/16 v6, 0x6c

    const/high16 v7, 0x40000000    # 2.0f

    const-string v8, " path segment"

    const-string v14, "Bad path coords for "

    const-string v15, "SVGParser"

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    invoke-virtual {v1}, Lw7/g$w;->close()V

    move v2, v12

    move v3, v2

    move v4, v13

    :goto_1
    move v5, v4

    :goto_2
    const/16 p0, 0x0

    goto/16 :goto_6

    :sswitch_1
    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_2
    const/16 v6, 0x76

    if-ne v11, v6, :cond_3

    add-float/2addr v5, v4

    :cond_3
    move v4, v5

    invoke-virtual {v1, v2, v4}, Lw7/g$w;->e(FF)V

    goto :goto_1

    :sswitch_2
    mul-float v6, v2, v7

    sub-float v3, v6, v3

    mul-float/2addr v7, v4

    sub-float v5, v7, v5

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v6

    invoke-virtual {v0, v6}, Lw7/k$i;->d(F)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v16

    if-eqz v16, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_4
    const/16 v8, 0x74

    if-ne v11, v8, :cond_5

    add-float/2addr v6, v2

    add-float/2addr v7, v4

    :cond_5
    move v2, v6

    move v4, v7

    invoke-virtual {v1, v3, v5, v2, v4}, Lw7/g$w;->a(FFFF)V

    goto :goto_2

    :sswitch_3
    mul-float v6, v2, v7

    sub-float/2addr v6, v3

    mul-float/2addr v7, v4

    sub-float v3, v7, v5

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v5

    invoke-virtual {v0, v5}, Lw7/k$i;->d(F)F

    move-result v7

    const/16 p0, 0x0

    invoke-virtual {v0, v7}, Lw7/k$i;->d(F)F

    move-result v10

    invoke-virtual {v0, v10}, Lw7/k$i;->d(F)F

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v17

    if-eqz v17, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_6
    const/16 v8, 0x73

    if-ne v11, v8, :cond_7

    add-float/2addr v10, v2

    add-float v16, v16, v4

    add-float/2addr v5, v2

    add-float/2addr v7, v4

    :cond_7
    move v4, v5

    move v2, v6

    move v5, v7

    move v6, v10

    move/from16 v7, v16

    invoke-virtual/range {v1 .. v7}, Lw7/g$w;->c(FFFFFF)V

    :goto_3
    move v3, v4

    move v2, v6

    move v4, v7

    goto/16 :goto_6

    :sswitch_4
    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v0, v3}, Lw7/k$i;->d(F)F

    move-result v5

    invoke-virtual {v0, v5}, Lw7/k$i;->d(F)F

    move-result v6

    invoke-virtual {v0, v6}, Lw7/k$i;->d(F)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-eqz v10, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_8
    const/16 v8, 0x71

    if-ne v11, v8, :cond_9

    add-float/2addr v6, v2

    add-float/2addr v7, v4

    add-float/2addr v3, v2

    add-float/2addr v5, v4

    :cond_9
    move v2, v6

    move v4, v7

    invoke-virtual {v1, v3, v5, v2, v4}, Lw7/g$w;->a(FFFF)V

    goto/16 :goto_6

    :sswitch_5
    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v0, v3}, Lw7/k$i;->d(F)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_a
    if-ne v11, v9, :cond_b

    invoke-virtual {v1}, Lw7/g$w;->i()Z

    move-result v7

    if-nez v7, :cond_b

    add-float/2addr v3, v2

    add-float/2addr v5, v4

    :cond_b
    move v2, v3

    move v4, v5

    invoke-virtual {v1, v2, v4}, Lw7/g$w;->b(FF)V

    if-ne v11, v9, :cond_c

    goto :goto_4

    :cond_c
    const/16 v6, 0x4c

    :goto_4
    move v3, v2

    move v12, v3

    move v5, v4

    move v13, v5

    move v11, v6

    goto/16 :goto_6

    :sswitch_6
    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v0, v3}, Lw7/k$i;->d(F)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_d
    if-ne v11, v6, :cond_e

    add-float/2addr v3, v2

    add-float/2addr v5, v4

    :cond_e
    move v2, v3

    move v4, v5

    invoke-virtual {v1, v2, v4}, Lw7/g$w;->e(FF)V

    move v3, v2

    :goto_5
    move v5, v4

    goto/16 :goto_6

    :sswitch_7
    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_f

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_f
    const/16 v6, 0x68

    if-ne v11, v6, :cond_10

    add-float/2addr v3, v2

    :cond_10
    move v2, v3

    invoke-virtual {v1, v2, v4}, Lw7/g$w;->e(FF)V

    move v3, v2

    goto/16 :goto_6

    :sswitch_8
    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v0, v3}, Lw7/k$i;->d(F)F

    move-result v5

    invoke-virtual {v0, v5}, Lw7/k$i;->d(F)F

    move-result v6

    invoke-virtual {v0, v6}, Lw7/k$i;->d(F)F

    move-result v7

    invoke-virtual {v0, v7}, Lw7/k$i;->d(F)F

    move-result v10

    invoke-virtual {v0, v10}, Lw7/k$i;->d(F)F

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v17

    if-eqz v17, :cond_11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_11
    const/16 v8, 0x63

    if-ne v11, v8, :cond_12

    add-float/2addr v10, v2

    add-float v16, v16, v4

    add-float/2addr v3, v2

    add-float/2addr v5, v4

    add-float/2addr v6, v2

    add-float/2addr v7, v4

    :cond_12
    move v2, v3

    move v3, v5

    move v4, v6

    move v5, v7

    move v6, v10

    move/from16 v7, v16

    invoke-virtual/range {v1 .. v7}, Lw7/g$w;->c(FFFFFF)V

    goto/16 :goto_3

    :sswitch_9
    move v10, v2

    const/16 p0, 0x0

    invoke-virtual {v0}, Lw7/k$i;->n()F

    move-result v2

    invoke-virtual {v0, v2}, Lw7/k$i;->d(F)F

    move-result v3

    move v5, v4

    invoke-virtual {v0, v3}, Lw7/k$i;->d(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v0, v6}, Lw7/k$i;->c(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v0, v6}, Lw7/k$i;->c(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v0, v7}, Lw7/k$i;->e(Ljava/lang/Boolean;)F

    move-result v9

    invoke-virtual {v0, v9}, Lw7/k$i;->d(F)F

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v18

    if-nez v18, :cond_17

    cmpg-float v18, v2, p0

    if-ltz v18, :cond_17

    cmpg-float v18, v3, p0

    if-gez v18, :cond_13

    goto :goto_8

    :cond_13
    const/16 v8, 0x61

    if-ne v11, v8, :cond_14

    add-float/2addr v9, v10

    add-float v17, v17, v5

    :cond_14
    move/from16 v8, v17

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move v7, v9

    invoke-virtual/range {v1 .. v8}, Lw7/g$w;->d(FFFZZFF)V

    move v2, v7

    move v3, v2

    move v4, v8

    goto/16 :goto_5

    :goto_6
    invoke-virtual {v0}, Lw7/k$i;->z()Z

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v6

    if-eqz v6, :cond_15

    :goto_7
    return-object v1

    :cond_15
    invoke-virtual {v0}, Lw7/k$i;->i()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v0}, Lw7/k$i;->l()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v11

    :cond_16
    const/16 v9, 0x6d

    goto/16 :goto_0

    :cond_17
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v2, v11

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_9
        0x43 -> :sswitch_8
        0x48 -> :sswitch_7
        0x4c -> :sswitch_6
        0x4d -> :sswitch_5
        0x51 -> :sswitch_4
        0x53 -> :sswitch_3
        0x54 -> :sswitch_2
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_9
        0x63 -> :sswitch_8
        0x68 -> :sswitch_7
        0x6c -> :sswitch_6
        0x6d -> :sswitch_5
        0x71 -> :sswitch_4
        0x73 -> :sswitch_3
        0x74 -> :sswitch_2
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static v0(Ljava/lang/String;)Lw7/e;
    .locals 3

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    const-string v2, "defer"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-static {v1}, Lw7/k$b;->a(Ljava/lang/String;)Lw7/e$a;

    move-result-object v1

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "meet"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "slice"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lw7/e$b;->b:Lw7/e$b;

    goto :goto_0

    :cond_1
    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid preserveAspectRatio definition: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p0, Lw7/e$b;->a:Lw7/e$b;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    new-instance v0, Lw7/e;

    invoke-direct {v0, v1, p0}, Lw7/e;-><init>(Lw7/e$a;Lw7/e$b;)V

    return-object v0
.end method

.method public static w0(Lw7/g$p0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lw7/k;->v0(Ljava/lang/String;)Lw7/e;

    move-result-object p1

    iput-object p1, p0, Lw7/g$p0;->o:Lw7/e;

    return-void
.end method

.method public static y0(Ljava/lang/String;)Lw7/g$e0$e;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "optimizeSpeed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "auto"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "optimizeQuality"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lw7/g$e0$e;->c:Lw7/g$e0$e;

    return-object p0

    :pswitch_1
    sget-object p0, Lw7/g$e0$e;->a:Lw7/g$e0$e;

    return-object p0

    :pswitch_2
    sget-object p0, Lw7/g$e0$e;->b:Lw7/g$e0$e;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x379c7c9e -> :sswitch_2
        0x2dddaf -> :sswitch_1
        0x159eff6a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static z0(Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw7/k$i;

    invoke-direct {v0, p0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http://www.w3.org/TR/SVG11/feature#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const-string v1, "UNSUPPORTED"

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v0}, Lw7/k$i;->A()V

    goto :goto_0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final A(Lw7/g$d;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$d;->q:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <circle> element. r cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$d;->p:Lw7/g$p;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$d;->o:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final B(Lw7/g$e;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x26

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "objectBoundingBox"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$e;->p:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    const-string v2, "userSpaceOnUse"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$e;->p:Ljava/lang/Boolean;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute clipPathUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method

.method public final C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lw7/k$a;->b:[I

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    invoke-static {v2}, Lw7/k;->i0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    if-eqz v2, :cond_0

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_0
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_1
    invoke-interface {p1, v3}, Lw7/g$g0;->d(Ljava/util/Set;)V

    goto :goto_2

    :pswitch_1
    invoke-static {v2}, Lw7/k;->A0(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Lw7/g$g0;->i(Ljava/util/Set;)V

    goto :goto_2

    :pswitch_2
    invoke-static {v2}, Lw7/k;->F0(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Lw7/g$g0;->h(Ljava/util/Set;)V

    goto :goto_2

    :pswitch_3
    invoke-interface {p1, v2}, Lw7/g$g0;->j(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_4
    invoke-static {v2}, Lw7/k;->z0(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {p1, v2}, Lw7/g$g0;->f(Ljava/util/Set;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_5

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "xml:id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "xml:space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v0, "default"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p1, Lw7/g$l0;->d:Ljava/lang/Boolean;

    return-void

    :cond_1
    const-string v0, "preserve"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p2, p1, Lw7/g$l0;->d:Ljava/lang/Boolean;

    return-void

    :cond_2
    new-instance p1, Lw7/j;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid value for \"xml:space\" attribute: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lw7/g$l0;->c:Ljava/lang/String;

    :cond_5
    return-void
.end method

.method public final E(Lw7/g$i;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$i;->p:Lw7/g$p;

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$i;->o:Lw7/g$p;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$i;->r:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <ellipse> element. ry cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$i;->q:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <ellipse> element. rx cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final F(Lw7/g$j;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_5

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    :try_start_0
    invoke-static {v1}, Lw7/g$k;->valueOf(Ljava/lang/String;)Lw7/g$k;

    move-result-object v2

    iput-object v2, p1, Lw7/g$j;->k:Lw7/g$k;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance p1, Lw7/j;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid spreadMethod attribute. \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" is not a valid value."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0, v1}, Lw7/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    iput-object v1, p1, Lw7/g$j;->j:Landroid/graphics/Matrix;

    goto :goto_1

    :pswitch_2
    const-string v2, "objectBoundingBox"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$j;->i:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    const-string v2, "userSpaceOnUse"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$j;->i:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute gradientUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    iput-object v1, p1, Lw7/g$j;->l:Ljava/lang/String;

    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x20
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G(Lw7/g$o;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_a

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_8

    const/4 v3, 0x2

    if-eq v2, v3, :cond_7

    const/4 v3, 0x3

    if-eq v2, v3, :cond_5

    const/4 v3, 0x4

    if-eq v2, v3, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    const/4 v3, 0x7

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v1}, Lw7/k;->w0(Lw7/g$p0;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_2
    iput-object v1, p1, Lw7/g$o;->p:Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$o;->t:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <use> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$o;->s:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <use> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$o;->r:Lw7/g$p;

    goto :goto_1

    :cond_8
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$o;->q:Lw7/g$p;

    :cond_9
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final H(Lw7/g$q;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q;->r:Lw7/g$p;

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q;->q:Lw7/g$p;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q;->p:Lw7/g$p;

    goto :goto_1

    :pswitch_3
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q;->o:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I(Lw7/g$m0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$m0;->p:Lw7/g$p;

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$m0;->o:Lw7/g$p;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$m0;->n:Lw7/g$p;

    goto :goto_1

    :pswitch_3
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$m0;->m:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Lw7/g$r;Lorg/xml/sax/Attributes;)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_5

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lw7/k$a;->b:[I

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const-string v3, "auto"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->v:Ljava/lang/Float;

    goto :goto_1

    :cond_0
    invoke-static {v2}, Lw7/k;->f0(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->v:Ljava/lang/Float;

    goto :goto_1

    :pswitch_1
    const-string v3, "strokeWidth"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iput-boolean v0, p1, Lw7/g$r;->q:Z

    goto :goto_1

    :cond_1
    const-string v3, "userSpaceOnUse"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, p1, Lw7/g$r;->q:Z

    goto :goto_1

    :cond_2
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute markerUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-static {v2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->u:Lw7/g$p;

    invoke-virtual {v2}, Lw7/g$p;->i()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <marker> element. markerHeight cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    invoke-static {v2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->t:Lw7/g$p;

    invoke-virtual {v2}, Lw7/g$p;->i()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <marker> element. markerWidth cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    invoke-static {v2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->s:Lw7/g$p;

    goto :goto_1

    :pswitch_5
    invoke-static {v2}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v2

    iput-object v2, p1, Lw7/g$r;->r:Lw7/g$p;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J0(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 19

    move-object/from16 v0, p1

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    new-instance v2, Lw7/k$i;

    invoke-direct {v2, v0}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lw7/k$i;->A()V

    :goto_0
    invoke-virtual {v2}, Lw7/k$i;->h()Z

    move-result v3

    if-nez v3, :cond_12

    invoke-virtual {v2}, Lw7/k$i;->o()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, -0x1

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "translate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    move v11, v5

    goto :goto_1

    :sswitch_1
    const-string v4, "skewY"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move v11, v6

    goto :goto_1

    :sswitch_2
    const-string v4, "skewX"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    move v11, v7

    goto :goto_1

    :sswitch_3
    const-string v4, "scale"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    move v11, v8

    goto :goto_1

    :sswitch_4
    const-string v4, "rotate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    move v11, v9

    goto :goto_1

    :sswitch_5
    const-string v4, "matrix"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    move v11, v10

    :goto_1
    const/4 v4, 0x0

    const/16 v12, 0x29

    const-string v13, "Invalid transform list: "

    packed-switch v11, :pswitch_data_0

    new-instance v0, Lw7/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid transform list fn: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->x()F

    move-result v5

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_2

    :cond_6
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_2

    :cond_7
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v5

    if-eqz v5, :cond_8

    float-to-double v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->tan(D)D

    move-result-wide v5

    double-to-float v3, v5

    invoke-virtual {v1, v4, v3}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_2

    :cond_8
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_2
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v5

    if-eqz v5, :cond_9

    float-to-double v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->tan(D)D

    move-result-wide v5

    double-to-float v3, v5

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_2

    :cond_9
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_3
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->x()F

    move-result v4

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v1, v3, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_2

    :cond_a
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_2

    :cond_b
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_4
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->x()F

    move-result v4

    invoke-virtual {v2}, Lw7/k$i;->x()F

    move-result v5

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_e

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    goto/16 :goto_2

    :cond_c
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_d

    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    goto/16 :goto_2

    :cond_d
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_5
    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v3

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v11

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v14

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v15

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v16

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v17

    invoke-virtual {v2}, Lw7/k$i;->A()V

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v18

    if-nez v18, :cond_10

    invoke-virtual {v2, v12}, Lw7/k$i;->f(C)Z

    move-result v12

    if-eqz v12, :cond_10

    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    const/16 v13, 0x9

    new-array v13, v13, [F

    aput v3, v13, v10

    aput v14, v13, v9

    aput v16, v13, v8

    aput v11, v13, v7

    aput v15, v13, v6

    aput v17, v13, v5

    const/4 v3, 0x6

    aput v4, v13, v3

    const/4 v3, 0x7

    aput v4, v13, v3

    const/high16 v3, 0x3f800000    # 1.0f

    const/16 v4, 0x8

    aput v3, v13, v4

    invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->setValues([F)V

    invoke-virtual {v1, v12}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :goto_2
    invoke-virtual {v2}, Lw7/k$i;->h()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_3

    :cond_f
    invoke-virtual {v2}, Lw7/k$i;->z()Z

    goto/16 :goto_0

    :cond_10
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bad transform function encountered in transform list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    :goto_3
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x4072683f -> :sswitch_5
        -0x372522a5 -> :sswitch_4
        0x683094a -> :sswitch_3
        0x686bc8e -> :sswitch_2
        0x686bc8f -> :sswitch_1
        0x3ec0f14e -> :sswitch_0
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

.method public final K(Lw7/g$s;Lorg/xml/sax/Attributes;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_c

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_b

    const/4 v3, 0x2

    if-eq v2, v3, :cond_a

    const/4 v3, 0x3

    if-eq v2, v3, :cond_8

    const/4 v3, 0x4

    if-eq v2, v3, :cond_6

    const/16 v3, 0x2b

    const-string v4, "userSpaceOnUse"

    const-string v5, "objectBoundingBox"

    if-eq v2, v3, :cond_3

    const/16 v3, 0x2c

    if-eq v2, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$s;->p:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$s;->p:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute maskContentUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$s;->o:Ljava/lang/Boolean;

    goto :goto_1

    :cond_4
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$s;->o:Ljava/lang/Boolean;

    goto :goto_1

    :cond_5
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute maskUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$s;->t:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <mask> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$s;->s:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <mask> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$s;->r:Lw7/g$p;

    goto :goto_1

    :cond_b
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$s;->q:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public final K0(Ljava/io/InputStream;)V
    .locals 3

    const-string v0, "SVGParser"

    const-string v1, "Falling back to SAX parser"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    const-string v1, "http://xml.org/sax/features/external-general-entities"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    const-string v1, "http://xml.org/sax/features/external-parameter-entities"

    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    new-instance v1, Lw7/k$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lw7/k$f;-><init>(Lw7/k;Lw7/k$a;)V

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    const-string v2, "http://xml.org/sax/properties/lexical-handler"

    invoke-interface {v0, v2, v1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Lorg/xml/sax/InputSource;

    invoke-direct {v1, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    new-instance v0, Lw7/j;

    const-string v1, "Stream error"

    invoke-direct {v0, v1, p1}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :goto_1
    new-instance v0, Lw7/j;

    const-string v1, "SVG parse error"

    invoke-direct {v0, v1, p1}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :goto_2
    new-instance v0, Lw7/j;

    const-string v1, "XML parser problem"

    invoke-direct {v0, v1, p1}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public final L(Lw7/g$v;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x8

    if-eq v2, v3, :cond_2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lw7/k;->f0(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p1, Lw7/g$v;->p:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <path> element. pathLength cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1}, Lw7/k;->u0(Ljava/lang/String;)Lw7/g$w;

    move-result-object v1

    iput-object v1, p1, Lw7/g$v;->o:Lw7/g$w;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final L0(Ljava/io/InputStream;Z)V
    .locals 8

    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    new-instance v1, Lw7/k$j;

    invoke-direct {v1, p0, v0}, Lw7/k$j;-><init>(Lw7/k;Lorg/xmlpull/v1/XmlPullParser;)V

    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-docdecl"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v4, 0x1

    invoke-interface {v0, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-eq v2, v4, :cond_a

    if-eqz v2, :cond_8

    const/16 v5, 0x8

    const-string v6, "SVGParser"

    if-eq v2, v5, :cond_7

    const/16 v5, 0xa

    if-eq v2, v5, :cond_6

    const/16 v5, 0x3a

    const/4 v6, 0x2

    if-eq v2, v6, :cond_4

    const/4 v7, 0x3

    if-eq v2, v7, :cond_2

    const/4 v5, 0x4

    if-eq v2, v5, :cond_1

    const/4 v5, 0x5

    if-eq v2, v5, :cond_0

    goto/16 :goto_1

    :cond_0
    :try_start_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lw7/k;->c1(Ljava/lang/String;)V

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-array v2, v6, [I

    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getTextCharacters([I)[C

    move-result-object v5

    aget v6, v2, v3

    aget v2, v2, v4

    invoke-virtual {p0, v5, v6, v2}, Lw7/k;->e1([CII)V

    goto/16 :goto_1

    :cond_2
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v5, v6, v2}, Lw7/k;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_4
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v5, v6, v2, v1}, Lw7/k;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    goto :goto_1

    :cond_6
    if-eqz p2, :cond_9

    iget-object v2, p0, Lw7/k;->a:Lw7/g;

    invoke-virtual {v2}, Lw7/g;->m()Lw7/g$f0;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    const-string v5, "<!ENTITY "

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v2, :cond_9

    :try_start_2
    const-string p2, "Switching to SAX parser to process entities"

    invoke-static {v6, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    invoke-virtual {p0, p1}, Lw7/k;->K0(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_2
    :try_start_3
    const-string p1, "Detected internal entity definitions, but could not parse them."

    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PROC INSTR: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lw7/k$i;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v2}, Lw7/k;->x0(Lw7/k$i;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p0, v5, v2}, Lw7/k;->r(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Lw7/k;->W0()V

    :cond_9
    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    move-result v2

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p0}, Lw7/k;->o()V
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :goto_2
    new-instance p2, Lw7/j;

    const-string v0, "Stream error"

    invoke-direct {p2, v0, p1}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :goto_3
    new-instance p2, Lw7/j;

    const-string v0, "XML parser problem"

    invoke-direct {p2, v0, p1}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public final M(Lw7/g$y;Lorg/xml/sax/Attributes;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_d

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_b

    const/4 v3, 0x2

    if-eq v2, v3, :cond_a

    const/4 v3, 0x3

    if-eq v2, v3, :cond_8

    const/4 v3, 0x4

    if-eq v2, v3, :cond_6

    const/4 v3, 0x6

    if-eq v2, v3, :cond_4

    const-string v3, "userSpaceOnUse"

    const-string v4, "objectBoundingBox"

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, v1}, Lw7/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    iput-object v1, p1, Lw7/g$y;->s:Landroid/graphics/Matrix;

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$y;->r:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$y;->r:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_1
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute patternContentUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$y;->q:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p1, Lw7/g$y;->q:Ljava/lang/Boolean;

    goto :goto_1

    :cond_3
    new-instance p1, Lw7/j;

    const-string p2, "Invalid value for attribute patternUnits"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_5
    iput-object v1, p1, Lw7/g$y;->x:Ljava/lang/String;

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$y;->w:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <pattern> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$y;->v:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <pattern> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$y;->u:Lw7/g$p;

    goto :goto_1

    :cond_b
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$y;->t:Lw7/g$p;

    :cond_c
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_d
    return-void

    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final N(Lw7/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v2

    sget-object v3, Lw7/k$g;->V:Lw7/k$g;

    if-ne v2, v3, :cond_3

    new-instance v2, Lw7/k$i;

    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lw7/k$i;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lw7/k$i;->A()V

    :goto_1
    invoke-virtual {v2}, Lw7/k$i;->h()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    const-string v6, "Invalid <"

    if-nez v5, :cond_1

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-virtual {v2}, Lw7/k$i;->n()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v2}, Lw7/k$i;->z()Z

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance p1, Lw7/j;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "> points attribute. There should be an even number of coordinates."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lw7/j;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "> points attribute. Non-coordinate content found in list."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [F

    iput-object v2, p1, Lw7/g$z;->o:[F

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v4, v0

    move v5, v4

    :goto_2
    if-ge v5, v2, :cond_3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iget-object v7, p1, Lw7/g$z;->o:[F

    add-int/lit8 v8, v4, 0x1

    aput v6, v7, v4

    move v4, v8

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public final O(Lw7/g$q0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x23

    if-eq v2, v3, :cond_2

    const/16 v3, 0x24

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q0;->o:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <radialGradient> element. r cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q0;->n:Lw7/g$p;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q0;->m:Lw7/g$p;

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q0;->q:Lw7/g$p;

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$q0;->p:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final O0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<path>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$v;

    invoke-direct {v0}, Lw7/g$v;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->L(Lw7/g$v;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final P(Lw7/g$b0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_a

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_9

    const/4 v3, 0x2

    if-eq v2, v3, :cond_8

    const/4 v3, 0x3

    if-eq v2, v3, :cond_6

    const/4 v3, 0x4

    if-eq v2, v3, :cond_4

    const/16 v3, 0xa

    if-eq v2, v3, :cond_2

    const/16 v3, 0xb

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->t:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <rect> element. ry cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->s:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <rect> element. rx cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->r:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <rect> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->q:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <rect> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->p:Lw7/g$p;

    goto :goto_1

    :cond_9
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$b0;->o:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final P0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<pattern>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$y;

    invoke-direct {v0}, Lw7/g$y;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->M(Lw7/g$y;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Q(Lw7/g$f0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_7

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_6

    const/4 v3, 0x2

    if-eq v2, v3, :cond_5

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iput-object v1, p1, Lw7/g$f0;->u:Ljava/lang/String;

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$f0;->t:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <svg> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$f0;->s:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <svg> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$f0;->r:Lw7/g$p;

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$f0;->q:Lw7/g$p;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final Q0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<polygon>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$a0;

    invoke-direct {v0}, Lw7/g$a0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    const-string v1, "polygon"

    invoke-virtual {p0, v0, p1, v1}, Lw7/k;->N(Lw7/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final R(Lw7/g$d0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x25

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lw7/k;->n0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p1, Lw7/g$d0;->h:Ljava/lang/Float;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final R0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<polyline>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$z;

    invoke-direct {v0}, Lw7/g$z;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    const-string v1, "polyline"

    invoke-virtual {p0, v0, p1, v1}, Lw7/k;->N(Lw7/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_3

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_2

    iget-object v1, p1, Lw7/g$l0;->e:Lw7/g$e0;

    if-nez v1, :cond_1

    new-instance v1, Lw7/g$e0;

    invoke-direct {v1}, Lw7/g$e0;-><init>()V

    iput-object v1, p1, Lw7/g$l0;->e:Lw7/g$e0;

    :cond_1
    iget-object v1, p1, Lw7/g$l0;->e:Lw7/g$e0;

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lw7/k;->S0(Lw7/g$e0;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lw7/b;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lw7/g$l0;->g:Ljava/util/List;

    goto :goto_1

    :cond_3
    invoke-static {p1, v1}, Lw7/k;->E0(Lw7/g$l0;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final T(Lw7/g$u0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    iput-object v1, p1, Lw7/g$u0;->o:Ljava/lang/String;

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final T0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<radialGradient>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$q0;

    invoke-direct {v0}, Lw7/g$q0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->F(Lw7/g$j;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->O(Lw7/g$q0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final U(Lw7/g$z0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    const/16 v3, 0x27

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$z0;->p:Lw7/g$p;

    goto :goto_1

    :cond_1
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    iput-object v1, p1, Lw7/g$z0;->o:Ljava/lang/String;

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final U0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<rect>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$b0;

    invoke-direct {v0}, Lw7/g$b0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->P(Lw7/g$b0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V(Lw7/g$a1;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/16 v3, 0x13

    if-eq v2, v3, :cond_1

    const/16 v3, 0x14

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lw7/k;->p0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lw7/g$a1;->r:Ljava/util/List;

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lw7/k;->p0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lw7/g$a1;->q:Ljava/util/List;

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lw7/k;->p0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lw7/g$a1;->p:Ljava/util/List;

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lw7/k;->p0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Lw7/g$a1;->o:Ljava/util/List;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final V0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<solidColor>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$c0;

    invoke-direct {v0}, Lw7/g$c0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final W(Lw7/g$n;Lorg/xml/sax/Attributes;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v1

    sget-object v2, Lw7/k$g;->y0:Lw7/k$g;

    if-ne v1, v2, :cond_0

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lw7/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-interface {p1, v1}, Lw7/g$n;->k(Landroid/graphics/Matrix;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final W0()V
    .locals 1

    new-instance v0, Lw7/g;

    invoke-direct {v0}, Lw7/g;-><init>()V

    iput-object v0, p0, Lw7/k;->a:Lw7/g;

    return-void
.end method

.method public final X(Lw7/g$e1;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_9

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_7

    const/4 v3, 0x2

    if-eq v2, v3, :cond_6

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, ""

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "http://www.w3.org/1999/xlink"

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_1
    iput-object v1, p1, Lw7/g$e1;->p:Ljava/lang/String;

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$e1;->t:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <use> element. height cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$e1;->s:Lw7/g$p;

    invoke-virtual {v1}, Lw7/g$p;->i()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lw7/j;

    const-string p2, "Invalid <use> element. width cannot be negative"

    invoke-direct {p1, p2}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$e1;->r:Lw7/g$p;

    goto :goto_1

    :cond_7
    invoke-static {v1}, Lw7/k;->o0(Ljava/lang/String;)Lw7/g$p;

    move-result-object v1

    iput-object v1, p1, Lw7/g$e1;->q:Lw7/g$p;

    :cond_8
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public final X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    iget-boolean v0, p0, Lw7/k;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget p1, p0, Lw7/k;->d:I

    add-int/2addr p1, v1

    iput p1, p0, Lw7/k;->d:I

    return-void

    :cond_0
    const-string v0, "http://www.w3.org/2000/svg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, p3

    :goto_0
    invoke-static {p2}, Lw7/k$h;->a(Ljava/lang/String;)Lw7/k$h;

    move-result-object p1

    sget-object p2, Lw7/k$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    packed-switch p2, :pswitch_data_0

    iput-boolean v1, p0, Lw7/k;->c:Z

    iput v1, p0, Lw7/k;->d:I

    return-void

    :pswitch_0
    invoke-virtual {p0, p4}, Lw7/k;->V0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_1
    invoke-virtual {p0, p4}, Lw7/k;->Z0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_2
    invoke-virtual {p0, p4}, Lw7/k;->y(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_3
    invoke-virtual {p0, p4}, Lw7/k;->j1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_4
    invoke-virtual {p0, p4}, Lw7/k;->u(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_5
    invoke-virtual {p0, p4}, Lw7/k;->P0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_6
    invoke-virtual {p0, p4}, Lw7/k;->f1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_7
    invoke-virtual {p0, p4}, Lw7/k;->k(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_8
    iput-boolean v1, p0, Lw7/k;->e:Z

    iput-object p1, p0, Lw7/k;->f:Lw7/k$h;

    return-void

    :pswitch_9
    invoke-virtual {p0, p4}, Lw7/k;->Y0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_a
    invoke-virtual {p0, p4}, Lw7/k;->T0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_b
    invoke-virtual {p0, p4}, Lw7/k;->w(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_c
    invoke-virtual {p0, p4}, Lw7/k;->x(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_d
    invoke-virtual {p0, p4}, Lw7/k;->b1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_e
    invoke-virtual {p0, p4}, Lw7/k;->k1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_f
    invoke-virtual {p0, p4}, Lw7/k;->g1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_10
    invoke-virtual {p0, p4}, Lw7/k;->h1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_11
    invoke-virtual {p0, p4}, Lw7/k;->d1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_12
    invoke-virtual {p0, p4}, Lw7/k;->Q0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_13
    invoke-virtual {p0, p4}, Lw7/k;->R0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_14
    invoke-virtual {p0, p4}, Lw7/k;->v(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_15
    invoke-virtual {p0, p4}, Lw7/k;->n(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_16
    invoke-virtual {p0, p4}, Lw7/k;->i(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_17
    invoke-virtual {p0, p4}, Lw7/k;->U0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_18
    invoke-virtual {p0, p4}, Lw7/k;->O0(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_19
    invoke-virtual {p0, p4}, Lw7/k;->i1(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_1a
    invoke-virtual {p0, p4}, Lw7/k;->m(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_1b
    invoke-virtual {p0, p4}, Lw7/k;->q(Lorg/xml/sax/Attributes;)V

    return-void

    :pswitch_1c
    invoke-virtual {p0, p4}, Lw7/k;->a1(Lorg/xml/sax/Attributes;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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

.method public final Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7/k$a;->b:[I

    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x7

    if-eq v2, v3, :cond_1

    const/16 v3, 0x57

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Lw7/k;->N0(Ljava/lang/String;)Lw7/g$b;

    move-result-object v1

    iput-object v1, p1, Lw7/g$r0;->p:Lw7/g$b;

    goto :goto_1

    :cond_1
    invoke-static {p1, v1}, Lw7/k;->w0(Lw7/g$p0;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final Y0(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<stop>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_1

    instance-of v0, v0, Lw7/g$j;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$d0;

    invoke-direct {v0}, Lw7/g$d0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->R(Lw7/g$d0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lw7/b;

    sget-object v1, Lw7/b$f;->h:Lw7/b$f;

    sget-object v2, Lw7/b$u;->a:Lw7/b$u;

    invoke-direct {v0, v1, v2}, Lw7/b;-><init>(Lw7/b$f;Lw7/b$u;)V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    invoke-virtual {v0, p1}, Lw7/b;->d(Ljava/lang/String;)Lw7/b$r;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw7/g;->a(Lw7/b$r;)V

    return-void
.end method

.method public final Z0(Lorg/xml/sax/Attributes;)V
    .locals 7

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "<style>"

    invoke-virtual {p0, v2, v1}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    const-string v2, "all"

    move v3, v1

    :goto_0
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v4

    if-ge v0, v4, :cond_2

    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lw7/k$a;->b:[I

    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lw7/k$g;->a(Ljava/lang/String;)Lw7/k$g;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/16 v6, 0x58

    if-eq v5, v6, :cond_1

    const/16 v6, 0x59

    if-eq v5, v6, :cond_0

    goto :goto_1

    :cond_0
    move-object v2, v4

    goto :goto_1

    :cond_1
    const-string v3, "text/css"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    sget-object p1, Lw7/b$f;->h:Lw7/b$f;

    invoke-static {v2, p1}, Lw7/b;->b(Ljava/lang/String;Lw7/b$f;)Z

    move-result p1

    if-eqz p1, :cond_3

    iput-boolean v1, p0, Lw7/k;->h:Z

    return-void

    :cond_3
    iput-boolean v1, p0, Lw7/k;->c:Z

    iput v1, p0, Lw7/k;->d:I

    return-void

    :cond_4
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<svg>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lw7/g$f0;

    invoke-direct {v0}, Lw7/g$f0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Q(Lw7/g$f0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    if-nez p1, :cond_0

    iget-object p1, p0, Lw7/k;->a:Lw7/g;

    invoke-virtual {p1, v0}, Lw7/g;->u(Lw7/g$f0;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    :goto_0
    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void
.end method

.method public final b1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<symbol>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$t0;

    invoke-direct {v0}, Lw7/g$t0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c1(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lw7/k;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lw7/k;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    :cond_1
    iget-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    iget-boolean v0, p0, Lw7/k;->h:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    :cond_3
    iget-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_4
    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    instance-of v0, v0, Lw7/g$y0;

    if-eqz v0, :cond_5

    invoke-virtual {p0, p1}, Lw7/k;->h(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final d1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<text>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$w0;

    invoke-direct {v0}, Lw7/g$w0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->V(Lw7/g$a1;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e1([CII)V
    .locals 1

    iget-boolean v0, p0, Lw7/k;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lw7/k;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    :cond_1
    iget-object v0, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    iget-boolean v0, p0, Lw7/k;->h:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    :cond_3
    iget-object v0, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void

    :cond_4
    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    instance-of v0, v0, Lw7/g$y0;

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p0, v0}, Lw7/k;->h(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final f1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<textPath>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_1

    new-instance v0, Lw7/g$z0;

    invoke-direct {v0}, Lw7/g$z0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->U(Lw7/g$z0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    iget-object p1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    instance-of v1, p1, Lw7/g$b1;

    if-eqz v1, :cond_0

    check-cast p1, Lw7/g$b1;

    invoke-virtual {v0, p1}, Lw7/g$z0;->o(Lw7/g$b1;)V

    return-void

    :cond_0
    check-cast p1, Lw7/g$x0;

    invoke-interface {p1}, Lw7/g$x0;->e()Lw7/g$b1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw7/g$z0;->o(Lw7/g$b1;)V

    return-void

    :cond_1
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<tref>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_2

    instance-of v0, v0, Lw7/g$y0;

    if-eqz v0, :cond_1

    new-instance v0, Lw7/g$u0;

    invoke-direct {v0}, Lw7/g$u0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->T(Lw7/g$u0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iget-object p1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    instance-of v1, p1, Lw7/g$b1;

    if-eqz v1, :cond_0

    check-cast p1, Lw7/g$b1;

    invoke-virtual {v0, p1}, Lw7/g$u0;->o(Lw7/g$b1;)V

    return-void

    :cond_0
    check-cast p1, Lw7/g$x0;

    invoke-interface {p1}, Lw7/g$x0;->e()Lw7/g$b1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw7/g$u0;->o(Lw7/g$b1;)V

    return-void

    :cond_1
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    check-cast v0, Lw7/g$h0;

    iget-object v1, v0, Lw7/g$h0;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lw7/g$h0;->i:Ljava/util/List;

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/g$n0;

    :goto_0
    instance-of v1, v0, Lw7/g$c1;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Lw7/g$c1;

    iget-object v2, v0, Lw7/g$c1;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lw7/g$c1;->c:Ljava/lang/String;

    return-void

    :cond_1
    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    new-instance v1, Lw7/g$c1;

    invoke-direct {v1, p1}, Lw7/g$c1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void
.end method

.method public final h1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<tspan>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_2

    instance-of v0, v0, Lw7/g$y0;

    if-eqz v0, :cond_1

    new-instance v0, Lw7/g$v0;

    invoke-direct {v0}, Lw7/g$v0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->V(Lw7/g$a1;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    iget-object p1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    instance-of v1, p1, Lw7/g$b1;

    if-eqz v1, :cond_0

    check-cast p1, Lw7/g$b1;

    invoke-virtual {v0, p1}, Lw7/g$v0;->o(Lw7/g$b1;)V

    return-void

    :cond_0
    check-cast p1, Lw7/g$x0;

    invoke-interface {p1}, Lw7/g$x0;->e()Lw7/g$b1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw7/g$v0;->o(Lw7/g$b1;)V

    return-void

    :cond_1
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<circle>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$d;

    invoke-direct {v0}, Lw7/g$d;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->A(Lw7/g$d;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<use>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$e1;

    invoke-direct {v0}, Lw7/g$e1;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->X(Lw7/g$e1;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<view>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$f1;

    invoke-direct {v0}, Lw7/g$f1;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<clipPath>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$e;

    invoke-direct {v0}, Lw7/g$e;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->B(Lw7/g$e;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k1(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<switch>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$s0;

    invoke-direct {v0}, Lw7/g$s0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs l(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final m(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<defs>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$h;

    invoke-direct {v0}, Lw7/g$h;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<ellipse>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$i;

    invoke-direct {v0}, Lw7/g$i;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->E(Lw7/g$i;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n0(Ljava/lang/String;)Ljava/lang/Float;
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x25

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    :try_start_0
    invoke-static {p1, v4, v0}, Lw7/k;->g0(Ljava/lang/String;II)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    if-eqz v2, :cond_1

    div-float/2addr v0, v1

    :cond_1
    const/4 v2, 0x0

    cmpg-float v3, v0, v2

    if-gez v3, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    cmpl-float v2, v0, v1

    if-lez v2, :cond_3

    goto :goto_1

    :cond_3
    move v1, v0

    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Lw7/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid offset value in <stop>: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lw7/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :cond_4
    new-instance p1, Lw7/j;

    const-string v0, "Invalid offset value in <stop> (empty string)"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o()V
    .locals 0

    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lw7/k;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Lw7/k;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lw7/k;->d:I

    if-nez v0, :cond_0

    iput-boolean v2, p0, Lw7/k;->c:Z

    return-void

    :cond_0
    const-string v0, "http://www.w3.org/2000/svg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, p3

    :goto_0
    sget-object p1, Lw7/k$a;->a:[I

    invoke-static {p2}, Lw7/k$h;->a(Ljava/lang/String;)Lw7/k$h;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_6

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    const/4 p2, 0x4

    if-eq p1, p2, :cond_6

    const/4 p2, 0x5

    if-eq p1, p2, :cond_6

    const/16 p2, 0xd

    if-eq p1, p2, :cond_6

    const/16 p2, 0xe

    if-eq p1, p2, :cond_6

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iget-object p1, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    iput-boolean v2, p0, Lw7/k;->h:Z

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw7/k;->Z(Ljava/lang/String;)V

    iget-object p1, p0, Lw7/k;->i:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void

    :pswitch_1
    iput-boolean v2, p0, Lw7/k;->e:Z

    iget-object p1, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    iget-object p2, p0, Lw7/k;->f:Lw7/k$h;

    sget-object p3, Lw7/k$h;->A:Lw7/k$h;

    if-ne p2, p3, :cond_3

    iget-object p2, p0, Lw7/k;->a:Lw7/g;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw7/g;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    sget-object p3, Lw7/k$h;->f:Lw7/k$h;

    if-ne p2, p3, :cond_4

    iget-object p2, p0, Lw7/k;->a:Lw7/g;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lw7/g;->q(Ljava/lang/String;)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lw7/k;->g:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    :pswitch_2
    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    check-cast p1, Lw7/g$n0;

    iget-object p1, p1, Lw7/g$n0;->b:Lw7/g$j0;

    iput-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final q(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<g>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$m;

    invoke-direct {v0}, Lw7/g$m;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p2, "xml-stylesheet"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lw7/g;->k()Lw7/i;

    :cond_0
    return-void
.end method

.method public final u(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<image>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$o;

    invoke-direct {v0}, Lw7/g$o;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->G(Lw7/g$o;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<line>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$q;

    invoke-direct {v0}, Lw7/g$q;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->W(Lw7/g$n;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->H(Lw7/g$q;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<linearGradient>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$m0;

    invoke-direct {v0}, Lw7/g$m0;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->F(Lw7/g$j;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->I(Lw7/g$m0;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<marker>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$r;

    invoke-direct {v0}, Lw7/g$r;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->Y(Lw7/g$r0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->J(Lw7/g$r;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x0(Lw7/k$i;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/k$i;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lw7/k$i;->A()V

    const/16 v1, 0x3d

    invoke-virtual {p1, v1}, Lw7/k$i;->s(C)Ljava/lang/String;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Lw7/k$i;->f(C)Z

    invoke-virtual {p1}, Lw7/k$i;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lw7/k$i;->A()V

    invoke-virtual {p1, v1}, Lw7/k$i;->s(C)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final y(Lorg/xml/sax/Attributes;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "<mask>"

    invoke-virtual {p0, v1, v0}, Lw7/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/g$s;

    invoke-direct {v0}, Lw7/g$s;-><init>()V

    iget-object v1, p0, Lw7/k;->a:Lw7/g;

    iput-object v1, v0, Lw7/g$n0;->a:Lw7/g;

    iget-object v1, p0, Lw7/k;->b:Lw7/g$j0;

    iput-object v1, v0, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-virtual {p0, v0, p1}, Lw7/k;->D(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->S(Lw7/g$l0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->C(Lw7/g$g0;Lorg/xml/sax/Attributes;)V

    invoke-virtual {p0, v0, p1}, Lw7/k;->K(Lw7/g$s;Lorg/xml/sax/Attributes;)V

    iget-object p1, p0, Lw7/k;->b:Lw7/g$j0;

    invoke-interface {p1, v0}, Lw7/g$j0;->a(Lw7/g$n0;)V

    iput-object v0, p0, Lw7/k;->b:Lw7/g$j0;

    return-void

    :cond_0
    new-instance p1, Lw7/j;

    const-string v0, "Invalid document. Root element must be <svg>"

    invoke-direct {p1, v0}, Lw7/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z(Ljava/io/InputStream;Z)Lw7/g;
    .locals 4

    const-string v0, "Exception thrown closing input stream"

    const-string v1, "SVGParser"

    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v2

    :cond_0
    const/4 v2, 0x3

    :try_start_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    add-int/2addr v2, v3

    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    const v3, 0x8b1f

    if-ne v2, v3, :cond_1

    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v3, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v3, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v2

    :catch_0
    :cond_1
    const/16 v2, 0x1000

    :try_start_1
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    invoke-virtual {p0, p1, p2}, Lw7/k;->L0(Ljava/io/InputStream;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lw7/k;->a:Lw7/g;

    return-object p1

    :catchall_0
    move-exception p2

    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    throw p2
.end method
