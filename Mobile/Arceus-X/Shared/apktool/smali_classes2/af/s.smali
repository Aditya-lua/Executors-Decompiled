.class public final Laf/s;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/s$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Laf/s;",
        "Laf/s$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final CURVE_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Laf/s;

.field public static final ENCODING_FIELD_NUMBER:I = 0x3

.field public static final HASH_TYPE_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Laf/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private curve_:I

.field private encoding_:I

.field private hashType_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laf/s;

    invoke-direct {v0}, Laf/s;-><init>()V

    sput-object v0, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    const-class v1, Laf/s;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method public static synthetic Z()Laf/s;
    .locals 1

    sget-object v0, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    return-object v0
.end method

.method public static synthetic a0(Laf/s;Laf/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/s;->k0(Laf/b0;)V

    return-void
.end method

.method public static synthetic b0(Laf/s;Laf/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/s;->i0(Laf/z;)V

    return-void
.end method

.method public static synthetic c0(Laf/s;Laf/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Laf/s;->j0(Laf/v;)V

    return-void
.end method

.method public static e0()Laf/s;
    .locals 1

    sget-object v0, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    return-object v0
.end method

.method public static h0()Laf/s$b;
    .locals 1

    sget-object v0, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Laf/s$b;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public d0()Laf/z;
    .locals 1

    iget v0, p0, Laf/s;->curve_:I

    invoke-static {v0}, Laf/z;->a(I)Laf/z;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Laf/z;->g:Laf/z;

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

.method public f0()Laf/v;
    .locals 1

    iget v0, p0, Laf/s;->encoding_:I

    invoke-static {v0}, Laf/v;->a(I)Laf/v;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Laf/v;->e:Laf/v;

    :cond_0
    return-object v0
.end method

.method public g0()Laf/b0;
    .locals 1

    iget v0, p0, Laf/s;->hashType_:I

    invoke-static {v0}, Laf/b0;->a(I)Laf/b0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Laf/b0;->h:Laf/b0;

    :cond_0
    return-object v0
.end method

.method public final i0(Laf/z;)V
    .locals 0

    invoke-virtual {p1}, Laf/z;->getNumber()I

    move-result p1

    iput p1, p0, Laf/s;->curve_:I

    return-void
.end method

.method public final j0(Laf/v;)V
    .locals 0

    invoke-virtual {p1}, Laf/v;->getNumber()I

    move-result p1

    iput p1, p0, Laf/s;->encoding_:I

    return-void
.end method

.method public final k0(Laf/b0;)V
    .locals 0

    invoke-virtual {p1}, Laf/b0;->getNumber()I

    move-result p1

    iput p1, p0, Laf/s;->hashType_:I

    return-void
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Laf/s$a;->a:[I

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
    sget-object p1, Laf/s;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Laf/s;

    monitor-enter p2

    :try_start_0
    sget-object p1, Laf/s;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Laf/s;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    return-object p1

    :pswitch_4
    const-string p1, "hashType_"

    const-string p2, "curve_"

    const-string p3, "encoding_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u0003\u000c"

    sget-object p3, Laf/s;->DEFAULT_INSTANCE:Laf/s;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Laf/s$b;

    invoke-direct {p1, p2}, Laf/s$b;-><init>(Laf/s$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Laf/s;

    invoke-direct {p1}, Laf/s;-><init>()V

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
