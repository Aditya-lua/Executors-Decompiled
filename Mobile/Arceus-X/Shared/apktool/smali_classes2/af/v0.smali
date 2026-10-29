.class public final Laf/v0;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/v0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/v0;",
        "Laf/v0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Laf/v0;

.field public static final MODULUS_SIZE_IN_BITS_FIELD_NUMBER:I = 0x2

.field public static final PARAMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/v0;",
            ">;"
        }
    .end annotation
.end field

.field public static final PUBLIC_EXPONENT_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private modulusSizeInBits_:I

.field private params_:Laf/w0;

.field private publicExponent_:Lcom/google/crypto/tink/shaded/protobuf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/v0;

    invoke-direct {v0}, Laf/v0;-><init>()V

    sput-object v0, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    const-class v1, Laf/v0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/v0;->publicExponent_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public static synthetic Z()Laf/v0;
    .locals 1

    sget-object v0, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    return-object v0
.end method

.method public static synthetic a0(Laf/v0;Laf/w0;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/v0;->j0(Laf/w0;)V

    return-void
.end method

.method public static synthetic b0(Laf/v0;I)V
    .locals 0

    invoke-direct {p0, p1}, Laf/v0;->i0(I)V

    return-void
.end method

.method public static synthetic c0(Laf/v0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/v0;->k0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static g0()Laf/v0$b;
    .locals 1

    sget-object v0, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/v0$b;

    return-object v0
.end method

.method public static h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/v0;
    .locals 1

    sget-object v0, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/v0;

    return-object p0
.end method

.method private i0(I)V
    .locals 0

    iput p1, p0, Laf/v0;->modulusSizeInBits_:I

    return-void
.end method

.method private k0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/v0;->publicExponent_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public d0()I
    .locals 1

    iget v0, p0, Laf/v0;->modulusSizeInBits_:I

    return v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->N()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public e0()Laf/w0;
    .locals 1

    iget-object v0, p0, Laf/v0;->params_:Laf/w0;

    if-nez v0, :cond_0

    invoke-static {}, Laf/w0;->d0()Laf/w0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->C()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public f0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/v0;->publicExponent_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public final j0(Laf/w0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/v0;->params_:Laf/w0;

    iget p1, p0, Laf/v0;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Laf/v0;->bitField0_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Laf/v0$a;->a:[I

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
    sget-object p1, Laf/v0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/v0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/v0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/v0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "params_"

    const-string p3, "modulusSizeInBits_"

    const-string v0, "publicExponent_"

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b\u0003\n"

    sget-object p3, Laf/v0;->DEFAULT_INSTANCE:Laf/v0;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/v0$b;

    invoke-direct {p1, p2}, Laf/v0$b;-><init>(Laf/v0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/v0;

    invoke-direct {p1}, Laf/v0;-><init>()V

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
