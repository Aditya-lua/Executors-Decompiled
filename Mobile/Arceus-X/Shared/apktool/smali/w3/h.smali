.class public final Lw3/h;
.super Landroidx/datastore/preferences/protobuf/x;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/h$b;,
        Lw3/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/x<",
        "Lw3/h;",
        "Lw3/h$a;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final BOOLEAN_FIELD_NUMBER:I = 0x1

.field public static final BYTES_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lw3/h;

.field public static final DOUBLE_FIELD_NUMBER:I = 0x7

.field public static final FLOAT_FIELD_NUMBER:I = 0x2

.field public static final INTEGER_FIELD_NUMBER:I = 0x3

.field public static final LONG_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/z0<",
            "Lw3/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRING_FIELD_NUMBER:I = 0x5

.field public static final STRING_SET_FIELD_NUMBER:I = 0x6


# instance fields
.field private valueCase_:I

.field private value_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw3/h;

    invoke-direct {v0}, Lw3/h;-><init>()V

    sput-object v0, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    const-class v1, Lw3/h;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/x;->R(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lw3/h;->valueCase_:I

    return-void
.end method

.method public static synthetic U(Lw3/h;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw3/h;->t0(J)V

    return-void
.end method

.method public static synthetic V(Lw3/h;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->u0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic W(Lw3/h;Lw3/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->v0(Lw3/g;)V

    return-void
.end method

.method public static synthetic X(Lw3/h;D)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw3/h;->q0(D)V

    return-void
.end method

.method public static synthetic Y(Lw3/h;Landroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->p0(Landroidx/datastore/preferences/protobuf/g;)V

    return-void
.end method

.method public static synthetic Z()Lw3/h;
    .locals 1

    sget-object v0, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    return-object v0
.end method

.method public static synthetic a0(Lw3/h;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->o0(Z)V

    return-void
.end method

.method public static synthetic b0(Lw3/h;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->r0(F)V

    return-void
.end method

.method public static synthetic c0(Lw3/h;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->s0(I)V

    return-void
.end method

.method public static f0()Lw3/h;
    .locals 1

    sget-object v0, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    return-object v0
.end method

.method public static n0()Lw3/h$a;
    .locals 1

    sget-object v0, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->w()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lw3/h$a;

    return-object v0
.end method


# virtual methods
.method public final A(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lw3/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lw3/h;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lw3/h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lw3/h;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/x$b;

    sget-object p3, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/x$b;-><init>(Landroidx/datastore/preferences/protobuf/x;)V

    sput-object p1, Lw3/h;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    return-object p1

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_3
    sget-object p1, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    return-object p1

    :pswitch_4
    const-string p1, "value_"

    const-string p2, "valueCase_"

    const-class p3, Lw3/g;

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0001\u0008\u0001\u0000\u0001\u0008\u0008\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\u0008=\u0000"

    sget-object p3, Lw3/h;->DEFAULT_INSTANCE:Lw3/h;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/x;->N(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lw3/h$a;

    invoke-direct {p1, p2}, Lw3/h$a;-><init>(Lw3/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lw3/h;

    invoke-direct {p1}, Lw3/h;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d0()Z
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e0()Landroidx/datastore/preferences/protobuf/g;
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Landroidx/datastore/preferences/protobuf/g;

    return-object v0

    :cond_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/g;->b:Landroidx/datastore/preferences/protobuf/g;

    return-object v0
.end method

.method public g0()D
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public h0()F
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i0()I
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j0()J
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public l0()Lw3/g;
    .locals 2

    iget v0, p0, Lw3/h;->valueCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/h;->value_:Ljava/lang/Object;

    check-cast v0, Lw3/g;

    return-object v0

    :cond_0
    invoke-static {}, Lw3/g;->Y()Lw3/g;

    move-result-object v0

    return-object v0
.end method

.method public m0()Lw3/h$b;
    .locals 1

    iget v0, p0, Lw3/h;->valueCase_:I

    invoke-static {v0}, Lw3/h$b;->b(I)Lw3/h$b;

    move-result-object v0

    return-object v0
.end method

.method public final o0(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw3/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final p0(Landroidx/datastore/preferences/protobuf/g;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x8

    iput v0, p0, Lw3/h;->valueCase_:I

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final q0(D)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lw3/h;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final r0(F)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lw3/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final s0(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lw3/h;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final t0(J)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lw3/h;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final u0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Lw3/h;->valueCase_:I

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    return-void
.end method

.method public final v0(Lw3/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lw3/h;->value_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lw3/h;->valueCase_:I

    return-void
.end method
