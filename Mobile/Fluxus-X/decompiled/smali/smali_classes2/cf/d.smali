.class public final Lcf/d;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lcf/d;",
        "Lcf/d$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcf/d;

.field public static final HMAC_KEY_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private aesCtrKey_:Lcf/f;

.field private bitField0_:I

.field private hmacKey_:Lcf/c0;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcf/d;

    invoke-direct {v0}, Lcf/d;-><init>()V

    sput-object v0, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    const-class v1, Lcf/d;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method public static synthetic Z()Lcf/d;
    .locals 1

    sget-object v0, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    return-object v0
.end method

.method public static synthetic a0(Lcf/d;Lcf/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/d;->i0(Lcf/f;)V

    return-void
.end method

.method public static synthetic b0(Lcf/d;Lcf/c0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/d;->j0(Lcf/c0;)V

    return-void
.end method

.method public static f0()Lcf/d$b;
    .locals 1

    sget-object v0, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lcf/d$b;

    return-object v0
.end method

.method public static g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/d;
    .locals 1

    sget-object v0, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/d;

    return-object p0
.end method

.method public static h0()Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->i()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public c0()Lcf/f;
    .locals 1

    iget-object v0, p0, Lcf/d;->aesCtrKey_:Lcf/f;

    if-nez v0, :cond_0

    invoke-static {}, Lcf/f;->c0()Lcf/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d0()Lcf/c0;
    .locals 1

    iget-object v0, p0, Lcf/d;->hmacKey_:Lcf/c0;

    if-nez v0, :cond_0

    invoke-static {}, Lcf/c0;->c0()Lcf/c0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->M()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public e0()I
    .locals 1

    iget v0, p0, Lcf/d;->version_:I

    return v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->C()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public final i0(Lcf/f;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/d;->aesCtrKey_:Lcf/f;

    iget p1, p0, Lcf/d;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcf/d;->bitField0_:I

    return-void
.end method

.method public final j0(Lcf/c0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/d;->hmacKey_:Lcf/c0;

    iget p1, p0, Lcf/d;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcf/d;->bitField0_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcf/d$a;->a:[I

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
    sget-object p1, Lcf/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lcf/d;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcf/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lcf/d;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "version_"

    const-string p3, "aesCtrKey_"

    const-string v0, "hmacKey_"

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\u1009\u0001"

    sget-object p3, Lcf/d;->DEFAULT_INSTANCE:Lcf/d;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcf/d$b;

    invoke-direct {p1, p2}, Lcf/d$b;-><init>(Lcf/d$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcf/d;

    invoke-direct {p1}, Lcf/d;-><init>()V

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
