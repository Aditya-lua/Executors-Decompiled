.class public Lum/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lum/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lum/w;",
            ")",
            "Lum/h<",
            "*>;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_1

    sget-object p1, Lum/y;->b:Lum/h;

    return-object p1

    :cond_1
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_2

    sget-object p1, Lum/y;->c:Lum/h;

    return-object p1

    :cond_2
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_3

    sget-object p1, Lum/y;->d:Lum/h;

    return-object p1

    :cond_3
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_4

    sget-object p1, Lum/y;->e:Lum/h;

    return-object p1

    :cond_4
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_5

    sget-object p1, Lum/y;->f:Lum/h;

    return-object p1

    :cond_5
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_6

    sget-object p1, Lum/y;->g:Lum/h;

    return-object p1

    :cond_6
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_7

    sget-object p1, Lum/y;->h:Lum/h;

    return-object p1

    :cond_7
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_8

    sget-object p1, Lum/y;->i:Lum/h;

    return-object p1

    :cond_8
    const-class p2, Ljava/lang/Boolean;

    if-ne p1, p2, :cond_9

    sget-object p1, Lum/y;->b:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_9
    const-class p2, Ljava/lang/Byte;

    if-ne p1, p2, :cond_a

    sget-object p1, Lum/y;->c:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_a
    const-class p2, Ljava/lang/Character;

    if-ne p1, p2, :cond_b

    sget-object p1, Lum/y;->d:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_b
    const-class p2, Ljava/lang/Double;

    if-ne p1, p2, :cond_c

    sget-object p1, Lum/y;->e:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_c
    const-class p2, Ljava/lang/Float;

    if-ne p1, p2, :cond_d

    sget-object p1, Lum/y;->f:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_d
    const-class p2, Ljava/lang/Integer;

    if-ne p1, p2, :cond_e

    sget-object p1, Lum/y;->g:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_e
    const-class p2, Ljava/lang/Long;

    if-ne p1, p2, :cond_f

    sget-object p1, Lum/y;->h:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_f
    const-class p2, Ljava/lang/Short;

    if-ne p1, p2, :cond_10

    sget-object p1, Lum/y;->i:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_10
    const-class p2, Ljava/lang/String;

    if-ne p1, p2, :cond_11

    sget-object p1, Lum/y;->j:Lum/h;

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_11
    const-class p2, Ljava/lang/Object;

    if-ne p1, p2, :cond_12

    new-instance p1, Lum/y$m;

    invoke-direct {p1, p3}, Lum/y$m;-><init>(Lum/w;)V

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_12
    invoke-static {p1}, Lum/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lwm/c;->d(Lum/w;Ljava/lang/reflect/Type;Ljava/lang/Class;)Lum/h;

    move-result-object p1

    if-eqz p1, :cond_13

    return-object p1

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_14

    new-instance p1, Lum/y$l;

    invoke-direct {p1, p2}, Lum/y$l;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p1}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1

    :cond_14
    return-object v0
.end method
