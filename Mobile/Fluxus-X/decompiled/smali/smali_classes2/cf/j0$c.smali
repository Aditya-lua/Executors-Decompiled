.class public final Lcf/j0$c;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcf/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/j0$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lcf/j0$c;",
        "Lcf/j0$c$a;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcf/j0$c;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/j0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private keyData_:Lcf/f0;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcf/j0$c;

    invoke-direct {v0}, Lcf/j0$c;-><init>()V

    sput-object v0, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    const-class v1, Lcf/j0$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method public static synthetic Z()Lcf/j0$c;
    .locals 1

    sget-object v0, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    return-object v0
.end method

.method public static synthetic a0(Lcf/j0$c;Lcf/f0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/j0$c;->k0(Lcf/f0;)V

    return-void
.end method

.method public static synthetic b0(Lcf/j0$c;Lcf/p0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcf/j0$c;->m0(Lcf/p0;)V

    return-void
.end method

.method public static synthetic c0(Lcf/j0$c;Lcf/g0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/j0$c;->n0(Lcf/g0;)V

    return-void
.end method

.method public static synthetic d0(Lcf/j0$c;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/j0$c;->l0(I)V

    return-void
.end method

.method public static j0()Lcf/j0$c$a;
    .locals 1

    sget-object v0, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lcf/j0$c$a;

    return-object v0
.end method

.method private m0(Lcf/p0;)V
    .locals 0

    invoke-virtual {p1}, Lcf/p0;->getNumber()I

    move-result p1

    iput p1, p0, Lcf/j0$c;->outputPrefixType_:I

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

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->M()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public e0()Lcf/f0;
    .locals 1

    iget-object v0, p0, Lcf/j0$c;->keyData_:Lcf/f0;

    if-nez v0, :cond_0

    invoke-static {}, Lcf/f0;->d0()Lcf/f0;

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

.method public f0()I
    .locals 1

    iget v0, p0, Lcf/j0$c;->keyId_:I

    return v0
.end method

.method public g0()Lcf/p0;
    .locals 1

    iget v0, p0, Lcf/j0$c;->outputPrefixType_:I

    invoke-static {v0}, Lcf/p0;->a(I)Lcf/p0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcf/p0;->g:Lcf/p0;

    :cond_0
    return-object v0
.end method

.method public h0()Lcf/g0;
    .locals 1

    iget v0, p0, Lcf/j0$c;->status_:I

    invoke-static {v0}, Lcf/g0;->a(I)Lcf/g0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcf/g0;->f:Lcf/g0;

    :cond_0
    return-object v0
.end method

.method public i0()Z
    .locals 2

    iget v0, p0, Lcf/j0$c;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k0(Lcf/f0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/j0$c;->keyData_:Lcf/f0;

    iget p1, p0, Lcf/j0$c;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcf/j0$c;->bitField0_:I

    return-void
.end method

.method public final l0(I)V
    .locals 0

    iput p1, p0, Lcf/j0$c;->keyId_:I

    return-void
.end method

.method public final n0(Lcf/g0;)V
    .locals 0

    invoke-virtual {p1}, Lcf/g0;->getNumber()I

    move-result p1

    iput p1, p0, Lcf/j0$c;->status_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object p2, Lcf/j0$a;->a:[I

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
    sget-object p1, Lcf/j0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lcf/j0$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcf/j0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lcf/j0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "keyData_"

    const-string p3, "status_"

    const-string v0, "keyId_"

    const-string v1, "outputPrefixType_"

    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, Lcf/j0$c;->DEFAULT_INSTANCE:Lcf/j0$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcf/j0$c$a;

    invoke-direct {p1, p2}, Lcf/j0$c$a;-><init>(Lcf/j0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcf/j0$c;

    invoke-direct {p1}, Lcf/j0$c;-><init>()V

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
