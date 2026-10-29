.class public final Lx3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt3/a0<",
        "Lx3/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J \u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lx3/h;",
        "Lt3/a0;",
        "Lx3/f;",
        "<init>",
        "()V",
        "Ljava/io/InputStream;",
        "input",
        "readFrom",
        "(Ljava/io/InputStream;Lnt/b;)Ljava/lang/Object;",
        "t",
        "Ljava/io/OutputStream;",
        "output",
        "",
        "d",
        "(Lx3/f;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;",
        "",
        "value",
        "Lw3/h;",
        "c",
        "(Ljava/lang/Object;)Lw3/h;",
        "",
        "name",
        "Lx3/c;",
        "mutablePreferences",
        "a",
        "(Ljava/lang/String;Lw3/h;Lx3/c;)V",
        "b",
        "()Lx3/f;",
        "defaultValue",
        "datastore-preferences-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lx3/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/h;

    invoke-direct {v0}, Lx3/h;-><init>()V

    sput-object v0, Lx3/h;->a:Lx3/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lw3/h;Lx3/c;)V
    .locals 3

    invoke-virtual {p2}, Lw3/h;->m0()Lw3/h$b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lx3/h$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, Lt3/d;

    const-string p2, "Value not set."

    invoke-direct {p1, p2, v2, v1, v2}, Lt3/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_2
    invoke-static {p1}, Lx3/i;->b(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->e0()Landroidx/datastore/preferences/protobuf/g;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/g;->x()[B

    move-result-object p2

    const-string v0, "value.bytes.toByteArray()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_3
    invoke-static {p1}, Lx3/i;->h(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->l0()Lw3/g;

    move-result-object p2

    invoke-virtual {p2}, Lw3/g;->Z()Ljava/util/List;

    move-result-object p2

    const-string v0, "value.stringSet.stringsList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_4
    invoke-static {p1}, Lx3/i;->g(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->k0()Ljava/lang/String;

    move-result-object p2

    const-string v0, "value.string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_5
    invoke-static {p1}, Lx3/i;->f(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->j0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_6
    invoke-static {p1}, Lx3/i;->e(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->i0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_7
    invoke-static {p1}, Lx3/i;->c(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->g0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_8
    invoke-static {p1}, Lx3/i;->d(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->h0()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_9
    invoke-static {p1}, Lx3/i;->a(Ljava/lang/String;)Lx3/f$a;

    move-result-object p1

    invoke-virtual {p2}, Lw3/h;->d0()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lx3/c;->i(Lx3/f$a;Ljava/lang/Object;)V

    return-void

    :pswitch_a
    new-instance p1, Lt3/d;

    const-string p2, "Value case is null."

    invoke-direct {p1, p2, v2, v1, v2}, Lt3/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b()Lx3/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lx3/g;->a()Lx3/f;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)Lw3/h;
    .locals 3

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lw3/h$a;->E(Z)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setBoolean(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lw3/h$a;->K(F)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setFloat(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_1
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_2

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lw3/h$a;->J(D)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setDouble(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lw3/h$a;->N(I)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setInteger(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lw3/h$a;->O(J)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setLong(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lw3/h$a;->P(Ljava/lang/String;)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setString(value).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_5
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_6

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    invoke-static {}, Lw3/g;->a0()Lw3/g$a;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {v1, p1}, Lw3/g$a;->E(Ljava/lang/Iterable;)Lw3/g$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw3/h$a;->Q(Lw3/g$a;)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder()\n           \u2026                 .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_6
    instance-of v0, p1, [B

    if-eqz v0, :cond_7

    invoke-static {}, Lw3/h;->n0()Lw3/h$a;

    move-result-object v0

    check-cast p1, [B

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/g;->e([B)Landroidx/datastore/preferences/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw3/h$a;->G(Landroidx/datastore/preferences/protobuf/g;)Lw3/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    const-string v0, "newBuilder().setBytes(By\u2026.copyFrom(value)).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw3/h;

    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PreferencesSerializer does not support type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lx3/f;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lx3/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/f;",
            "Ljava/io/OutputStream;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p1}, Lx3/f;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {}, Lw3/f;->a0()Lw3/f$a;

    move-result-object p3

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx3/f$a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, Lx3/f$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Lx3/h;->c(Ljava/lang/Object;)Lw3/h;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, Lw3/f$a;->E(Ljava/lang/String;Lw3/h;)Lw3/f$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    check-cast p1, Lw3/f;

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/a;->p(Ljava/io/OutputStream;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic getDefaultValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx3/h;->b()Lx3/f;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lnt/b<",
            "-",
            "Lx3/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object p2, Lw3/d;->a:Lw3/d$a;

    invoke-virtual {p2, p1}, Lw3/d$a;->a(Ljava/io/InputStream;)Lw3/f;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lx3/f$b;

    invoke-static {p2}, Lx3/g;->b([Lx3/f$b;)Lx3/c;

    move-result-object p2

    invoke-virtual {p1}, Lw3/f;->X()Ljava/util/Map;

    move-result-object p1

    const-string v0, "preferencesProto.preferencesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/h;

    sget-object v2, Lx3/h;->a:Lx3/h;

    const-string v3, "name"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "value"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v0, p2}, Lx3/h;->a(Ljava/lang/String;Lw3/h;Lx3/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lx3/f;->d()Lx3/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx3/f;

    invoke-virtual {p0, p1, p2, p3}, Lx3/h;->d(Lx3/f;Ljava/io/OutputStream;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
