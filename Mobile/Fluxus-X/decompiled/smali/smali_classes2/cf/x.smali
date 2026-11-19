.class public final Lcf/x;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/x$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lcf/x;",
        "Lcf/x$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcf/x;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final PUBLIC_KEY_FIELD_NUMBER:I = 0x3

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private publicKey_:Lcf/y;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcf/x;

    invoke-direct {v0}, Lcf/x;-><init>()V

    sput-object v0, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    const-class v1, Lcf/x;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lcf/x;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method public static synthetic Z()Lcf/x;
    .locals 1

    sget-object v0, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    return-object v0
.end method

.method public static synthetic a0(Lcf/x;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcf/x;->i0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static synthetic b0(Lcf/x;Lcf/y;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/x;->j0(Lcf/y;)V

    return-void
.end method

.method public static f0()Lcf/x$b;
    .locals 1

    sget-object v0, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lcf/x$b;

    return-object v0
.end method

.method public static g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/x;
    .locals 1

    sget-object v0, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/x;

    return-object p0
.end method

.method public static h0()Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/x;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->i()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    return-object v0
.end method

.method private i0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/x;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public c0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lcf/x;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public d0()Lcf/y;
    .locals 1

    iget-object v0, p0, Lcf/x;->publicKey_:Lcf/y;

    if-nez v0, :cond_0

    invoke-static {}, Lcf/y;->b0()Lcf/y;

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

    iget v0, p0, Lcf/x;->version_:I

    return v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->C()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public final j0(Lcf/y;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/x;->publicKey_:Lcf/y;

    iget p1, p0, Lcf/x;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcf/x;->bitField0_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcf/x$a;->a:[I

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
    sget-object p1, Lcf/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lcf/x;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcf/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lcf/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "version_"

    const-string p3, "keyValue_"

    const-string v0, "publicKey_"

    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\u1009\u0000"

    sget-object p3, Lcf/x;->DEFAULT_INSTANCE:Lcf/x;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcf/x$b;

    invoke-direct {p1, p2}, Lcf/x$b;-><init>(Lcf/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcf/x;

    invoke-direct {p1}, Lcf/x;-><init>()V

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
