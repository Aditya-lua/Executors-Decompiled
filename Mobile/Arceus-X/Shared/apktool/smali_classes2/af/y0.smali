.class public final Laf/y0;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/y0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/y0;",
        "Laf/y0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Laf/y0;

.field public static final E_FIELD_NUMBER:I = 0x4

.field public static final N_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/y0;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private e_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private n_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private params_:Laf/w0;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/y0;

    invoke-direct {v0}, Laf/y0;-><init>()V

    sput-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    const-class v1, Laf/y0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/y0;->n_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/y0;->e_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public static synthetic Z()Laf/y0;
    .locals 1

    sget-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    return-object v0
.end method

.method public static synthetic a0(Laf/y0;I)V
    .locals 0

    invoke-direct {p0, p1}, Laf/y0;->p0(I)V

    return-void
.end method

.method public static synthetic b0(Laf/y0;Laf/w0;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/y0;->o0(Laf/w0;)V

    return-void
.end method

.method public static synthetic c0(Laf/y0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/y0;->n0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic d0(Laf/y0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/y0;->m0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static e0()Laf/y0;
    .locals 1

    sget-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    return-object v0
.end method

.method public static j0()Laf/y0$b;
    .locals 1

    sget-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/y0$b;

    return-object v0
.end method

.method public static k0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/y0;
    .locals 1

    sget-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/y0;

    return-object p0
.end method

.method public static l0()Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/y0;",
            ">;"
        }
    .end annotation

    sget-object v0, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->h()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    return-object v0
.end method

.method private m0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/y0;->e_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method private n0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/y0;->n_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method private o0(Laf/w0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/y0;->params_:Laf/w0;

    iget p1, p0, Laf/y0;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Laf/y0;->bitField0_:I

    return-void
.end method

.method private p0(I)V
    .locals 0

    iput p1, p0, Laf/y0;->version_:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->N()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

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

    iget-object v0, p0, Laf/y0;->e_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public g0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/y0;->n_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public h0()Laf/w0;
    .locals 1

    iget-object v0, p0, Laf/y0;->params_:Laf/w0;

    if-nez v0, :cond_0

    invoke-static {}, Laf/w0;->d0()Laf/w0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Laf/y0;->version_:I

    return v0
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object p2, Laf/y0$a;->a:[I

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
    sget-object p1, Laf/y0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/y0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/y0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/y0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "version_"

    const-string p3, "params_"

    const-string v0, "n_"

    const-string v1, "e_"

    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n\u0004\n"

    sget-object p3, Laf/y0;->DEFAULT_INSTANCE:Laf/y0;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/y0$b;

    invoke-direct {p1, p2}, Laf/y0$b;-><init>(Laf/y0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/y0;

    invoke-direct {p1}, Laf/y0;-><init>()V

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
