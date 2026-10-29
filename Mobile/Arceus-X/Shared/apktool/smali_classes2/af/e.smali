.class public final Laf/e;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/e;",
        "Laf/e$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FORMAT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Laf/e;

.field public static final HMAC_KEY_FORMAT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private aesCtrKeyFormat_:Laf/g;

.field private bitField0_:I

.field private hmacKeyFormat_:Laf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/e;

    invoke-direct {v0}, Laf/e;-><init>()V

    sput-object v0, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    const-class v1, Laf/e;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method public static synthetic Z()Laf/e;
    .locals 1

    sget-object v0, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    return-object v0
.end method

.method public static synthetic a0(Laf/e;Laf/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/e;->g0(Laf/g;)V

    return-void
.end method

.method public static synthetic b0(Laf/e;Laf/d0;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/e;->h0(Laf/d0;)V

    return-void
.end method

.method public static e0()Laf/e$b;
    .locals 1

    sget-object v0, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/e$b;

    return-object v0
.end method

.method public static f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/e;
    .locals 1

    sget-object v0, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/e;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public c0()Laf/g;
    .locals 1

    iget-object v0, p0, Laf/e;->aesCtrKeyFormat_:Laf/g;

    if-nez v0, :cond_0

    invoke-static {}, Laf/g;->c0()Laf/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d0()Laf/d0;
    .locals 1

    iget-object v0, p0, Laf/e;->hmacKeyFormat_:Laf/d0;

    if-nez v0, :cond_0

    invoke-static {}, Laf/d0;->c0()Laf/d0;

    move-result-object v0

    :cond_0
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

.method public final g0(Laf/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/e;->aesCtrKeyFormat_:Laf/g;

    iget p1, p0, Laf/e;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Laf/e;->bitField0_:I

    return-void
.end method

.method public final h0(Laf/d0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/e;->hmacKeyFormat_:Laf/d0;

    iget p1, p0, Laf/e;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Laf/e;->bitField0_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Laf/e$a;->a:[I

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
    sget-object p1, Laf/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "aesCtrKeyFormat_"

    const-string p3, "hmacKeyFormat_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001"

    sget-object p3, Laf/e;->DEFAULT_INSTANCE:Laf/e;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/e$b;

    invoke-direct {p1, p2}, Laf/e$b;-><init>(Laf/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/e;

    invoke-direct {p1}, Laf/e;-><init>()V

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
