.class public final enum Laf/z;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laf/z;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum b:Laf/z;

.field public static final enum c:Laf/z;

.field public static final enum d:Laf/z;

.field public static final enum e:Laf/z;

.field public static final enum f:Laf/z;

.field public static final enum g:Laf/z;

.field public static final h:Lcom/google/crypto/tink/shaded/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "Laf/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic i:[Laf/z;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Laf/z;

    const-string v1, "UNKNOWN_CURVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laf/z;->b:Laf/z;

    new-instance v1, Laf/z;

    const-string v2, "NIST_P256"

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v1, Laf/z;->c:Laf/z;

    new-instance v2, Laf/z;

    const-string v3, "NIST_P384"

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v2, Laf/z;->d:Laf/z;

    new-instance v3, Laf/z;

    const-string v4, "NIST_P521"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v3, Laf/z;->e:Laf/z;

    new-instance v4, Laf/z;

    const-string v5, "CURVE25519"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v4, Laf/z;->f:Laf/z;

    new-instance v5, Laf/z;

    const-string v6, "UNRECOGNIZED"

    const/4 v8, -0x1

    invoke-direct {v5, v6, v7, v8}, Laf/z;-><init>(Ljava/lang/String;II)V

    sput-object v5, Laf/z;->g:Laf/z;

    filled-new-array/range {v0 .. v5}, [Laf/z;

    move-result-object v0

    sput-object v0, Laf/z;->i:[Laf/z;

    new-instance v0, Laf/z$a;

    invoke-direct {v0}, Laf/z$a;-><init>()V

    sput-object v0, Laf/z;->h:Lcom/google/crypto/tink/shaded/protobuf/a0$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Laf/z;->a:I

    return-void
.end method

.method public static a(I)Laf/z;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Laf/z;->f:Laf/z;

    return-object p0

    :cond_1
    sget-object p0, Laf/z;->e:Laf/z;

    return-object p0

    :cond_2
    sget-object p0, Laf/z;->d:Laf/z;

    return-object p0

    :cond_3
    sget-object p0, Laf/z;->c:Laf/z;

    return-object p0

    :cond_4
    sget-object p0, Laf/z;->b:Laf/z;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Laf/z;
    .locals 1

    const-class v0, Laf/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/z;

    return-object p0
.end method

.method public static values()[Laf/z;
    .locals 1

    sget-object v0, Laf/z;->i:[Laf/z;

    invoke-virtual {v0}, [Laf/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laf/z;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Laf/z;->g:Laf/z;

    if-eq p0, v0, :cond_0

    iget v0, p0, Laf/z;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
