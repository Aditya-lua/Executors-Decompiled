.class public final Laf/t0;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/t0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/t0;",
        "Laf/t0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final CRT_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Laf/t0;

.field public static final DP_FIELD_NUMBER:I = 0x6

.field public static final DQ_FIELD_NUMBER:I = 0x7

.field public static final D_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/t0;",
            ">;"
        }
    .end annotation
.end field

.field public static final PUBLIC_KEY_FIELD_NUMBER:I = 0x2

.field public static final P_FIELD_NUMBER:I = 0x4

.field public static final Q_FIELD_NUMBER:I = 0x5

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private crt_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private d_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private dp_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private dq_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private p_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private publicKey_:Laf/u0;

.field private q_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/t0;

    invoke-direct {v0}, Laf/t0;-><init>()V

    sput-object v0, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    const-class v1, Laf/t0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->d_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->p_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->q_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->dp_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->dq_:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Laf/t0;->crt_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public static synthetic Z()Laf/t0;
    .locals 1

    sget-object v0, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    return-object v0
.end method

.method public static synthetic a0(Laf/t0;I)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->A0(I)V

    return-void
.end method

.method public static synthetic b0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->z0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic c0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->v0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic d0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->w0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic e0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->t0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic f0(Laf/t0;Laf/u0;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->y0(Laf/u0;)V

    return-void
.end method

.method public static synthetic g0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->u0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic h0(Laf/t0;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/t0;->x0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static q0()Laf/t0$b;
    .locals 1

    sget-object v0, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/t0$b;

    return-object v0
.end method

.method public static r0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/t0;
    .locals 1

    sget-object v0, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/t0;

    return-object p0
.end method

.method public static s0()Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/t0;",
            ">;"
        }
    .end annotation

    sget-object v0, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->h()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A0(I)V
    .locals 0

    iput p1, p0, Laf/t0;->version_:I

    return-void
.end method

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

.method public i0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->crt_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public j0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->d_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public k0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->dp_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public l0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->dq_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public m0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->p_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public n0()Laf/u0;
    .locals 1

    iget-object v0, p0, Laf/t0;->publicKey_:Laf/u0;

    if-nez v0, :cond_0

    invoke-static {}, Laf/u0;->d0()Laf/u0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public o0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Laf/t0;->q_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public p0()I
    .locals 1

    iget v0, p0, Laf/t0;->version_:I

    return v0
.end method

.method public final t0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->crt_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public final u0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->d_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public final v0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->dp_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public final w0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->dq_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public final x0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->p_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public final y0(Laf/u0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->publicKey_:Laf/u0;

    iget p1, p0, Laf/t0;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Laf/t0;->bitField0_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object p2, Laf/t0$a;->a:[I

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
    sget-object p1, Laf/t0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/t0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/t0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/t0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

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
    sget-object p1, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    return-object p1

    :pswitch_4
    const-string v0, "bitField0_"

    const-string v1, "version_"

    const-string v2, "publicKey_"

    const-string v3, "d_"

    const-string v4, "p_"

    const-string v5, "q_"

    const-string v6, "dp_"

    const-string v7, "dq_"

    const-string v8, "crt_"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\u0008\n"

    sget-object p3, Laf/t0;->DEFAULT_INSTANCE:Laf/t0;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/t0$b;

    invoke-direct {p1, p2}, Laf/t0$b;-><init>(Laf/t0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/t0;

    invoke-direct {p1}, Laf/t0;-><init>()V

    return-object p1

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

.method public final z0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/t0;->q_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method
