.class public final Laf/k0;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/k0$b;,
        Laf/k0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/k0;",
        "Laf/k0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Laf/k0;

.field public static final KEY_INFO_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/k0;",
            ">;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0$i<",
            "Laf/k0$c;",
            ">;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/k0;

    invoke-direct {v0}, Laf/k0;-><init>()V

    sput-object v0, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    const-class v1, Laf/k0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/y;->A()Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Laf/k0;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    return-void
.end method

.method public static synthetic Z()Laf/k0;
    .locals 1

    sget-object v0, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    return-object v0
.end method

.method public static synthetic a0(Laf/k0;I)V
    .locals 0

    invoke-direct {p0, p1}, Laf/k0;->f0(I)V

    return-void
.end method

.method public static synthetic b0(Laf/k0;Laf/k0$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/k0;->c0(Laf/k0$c;)V

    return-void
.end method

.method public static e0()Laf/k0$b;
    .locals 1

    sget-object v0, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/k0$b;

    return-object v0
.end method

.method private f0(I)V
    .locals 0

    iput p1, p0, Laf/k0;->primaryKeyId_:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public final c0(Laf/k0$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Laf/k0;->d0()V

    iget-object v0, p0, Laf/k0;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d0()V
    .locals 2

    iget-object v0, p0, Laf/k0;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/a0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->M(Lcom/google/crypto/tink/shaded/protobuf/a0$i;)Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Laf/k0;->keyInfo_:Lcom/google/crypto/tink/shaded/protobuf/a0$i;

    :cond_0
    return-void
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
    .locals 0

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
    sget-object p1, Laf/k0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/k0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/k0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/k0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    return-object p1

    :pswitch_4
    const-string p1, "primaryKeyId_"

    const-string p2, "keyInfo_"

    const-class p3, Laf/k0$c;

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, Laf/k0;->DEFAULT_INSTANCE:Laf/k0;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/k0$b;

    invoke-direct {p1, p2}, Laf/k0$b;-><init>(Laf/k0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/k0;

    invoke-direct {p1}, Laf/k0;-><init>()V

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
