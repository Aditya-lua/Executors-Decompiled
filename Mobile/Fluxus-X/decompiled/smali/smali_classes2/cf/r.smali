.class public final Lcf/r;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/r$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lcf/r;",
        "Lcf/r$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcf/r;

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lcf/r;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private params_:Lcf/s;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcf/r;

    invoke-direct {v0}, Lcf/r;-><init>()V

    sput-object v0, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    const-class v1, Lcf/r;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->W(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method public static synthetic Z()Lcf/r;
    .locals 1

    sget-object v0, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    return-object v0
.end method

.method public static synthetic a0(Lcf/r;Lcf/s;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcf/r;->e0(Lcf/s;)V

    return-void
.end method

.method public static c0()Lcf/r$b;
    .locals 1

    sget-object v0, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->v()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lcf/r$b;

    return-object v0
.end method

.method public static d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/r;
    .locals 1

    sget-object v0, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Q(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/r;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public b0()Lcf/s;
    .locals 1

    iget-object v0, p0, Lcf/r;->params_:Lcf/s;

    if-nez v0, :cond_0

    invoke-static {}, Lcf/s;->e0()Lcf/s;

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

.method public final e0(Lcf/s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcf/r;->params_:Lcf/s;

    iget p1, p0, Lcf/r;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcf/r;->bitField0_:I

    return-void
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->C()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public final z(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lcf/r$a;->a:[I

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
    sget-object p1, Lcf/r;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lcf/r;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcf/r;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lcf/r;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    return-object p1

    :pswitch_4
    const-string p1, "bitField0_"

    const-string p2, "params_"

    const-string p3, "version_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0000\u0003\u000b"

    sget-object p3, Lcf/r;->DEFAULT_INSTANCE:Lcf/r;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->O(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcf/r$b;

    invoke-direct {p1, p2}, Lcf/r$b;-><init>(Lcf/r$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcf/r;

    invoke-direct {p1}, Lcf/r;-><init>()V

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
