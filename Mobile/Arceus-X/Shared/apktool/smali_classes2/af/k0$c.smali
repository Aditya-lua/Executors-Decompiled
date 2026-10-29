.class public final Laf/k0$c;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/k0$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/k0$c;",
        "Laf/k0$c$a;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Laf/k0$c;

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/k0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I

.field private typeUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/k0$c;

    invoke-direct {v0}, Laf/k0$c;-><init>()V

    sput-object v0, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    const-class v1, Laf/k0$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Laf/k0$c;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public static synthetic Z()Laf/k0$c;
    .locals 1

    sget-object v0, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    return-object v0
.end method

.method public static synthetic a0(Laf/k0$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/k0$c;->i0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b0(Laf/k0$c;Laf/p0;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/k0$c;->g0(Laf/p0;)V

    return-void
.end method

.method public static synthetic c0(Laf/k0$c;Laf/g0;)V
    .locals 0

    invoke-direct {p0, p1}, Laf/k0$c;->h0(Laf/g0;)V

    return-void
.end method

.method public static synthetic d0(Laf/k0$c;I)V
    .locals 0

    invoke-direct {p0, p1}, Laf/k0$c;->f0(I)V

    return-void
.end method

.method public static e0()Laf/k0$c$a;
    .locals 1

    sget-object v0, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/k0$c$a;

    return-object v0
.end method

.method private f0(I)V
    .locals 0

    iput p1, p0, Laf/k0$c;->keyId_:I

    return-void
.end method

.method private g0(Laf/p0;)V
    .locals 0

    invoke-virtual {p1}, Laf/p0;->getNumber()I

    move-result p1

    iput p1, p0, Laf/k0$c;->outputPrefixType_:I

    return-void
.end method

.method private h0(Laf/g0;)V
    .locals 0

    invoke-virtual {p1}, Laf/g0;->getNumber()I

    move-result p1

    iput p1, p0, Laf/k0$c;->status_:I

    return-void
.end method

.method private i0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Laf/k0$c;->typeUrl_:Ljava/lang/String;

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

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Laf/k0$a;->a:[I

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
    sget-object p1, Laf/k0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/k0$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/k0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/k0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    return-object p1

    :pswitch_4
    const-string p1, "typeUrl_"

    const-string p2, "status_"

    const-string p3, "keyId_"

    const-string v0, "outputPrefixType_"

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, Laf/k0$c;->DEFAULT_INSTANCE:Laf/k0$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/k0$c$a;

    invoke-direct {p1, p2}, Laf/k0$c$a;-><init>(Laf/k0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/k0$c;

    invoke-direct {p1}, Laf/k0$c;-><init>()V

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
