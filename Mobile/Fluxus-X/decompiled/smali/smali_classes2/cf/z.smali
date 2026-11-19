.class public final enum Lcf/z;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcf/z;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum b:Lcf/z;

.field public static final enum c:Lcf/z;

.field public static final enum d:Lcf/z;

.field public static final enum e:Lcf/z;

.field public static final enum f:Lcf/z;

.field public static final enum g:Lcf/z;

.field public static final h:Lcom/google/crypto/tink/shaded/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "Lcf/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic i:[Lcf/z;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcf/z;

    const-string v1, "UNKNOWN_CURVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcf/z;->b:Lcf/z;

    new-instance v1, Lcf/z;

    const-string v2, "NIST_P256"

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcf/z;->c:Lcf/z;

    new-instance v2, Lcf/z;

    const-string v3, "NIST_P384"

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcf/z;->d:Lcf/z;

    new-instance v3, Lcf/z;

    const-string v4, "NIST_P521"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcf/z;->e:Lcf/z;

    new-instance v4, Lcf/z;

    const-string v5, "CURVE25519"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcf/z;->f:Lcf/z;

    new-instance v5, Lcf/z;

    const-string v6, "UNRECOGNIZED"

    const/4 v8, -0x1

    invoke-direct {v5, v6, v7, v8}, Lcf/z;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcf/z;->g:Lcf/z;

    filled-new-array/range {v0 .. v5}, [Lcf/z;

    move-result-object v0

    sput-object v0, Lcf/z;->i:[Lcf/z;

    new-instance v0, Lcf/z$a;

    invoke-direct {v0}, Lcf/z$a;-><init>()V

    sput-object v0, Lcf/z;->h:Lcom/google/crypto/tink/shaded/protobuf/a0$d;

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

    iput p3, p0, Lcf/z;->a:I

    return-void
.end method

.method public static a(I)Lcf/z;
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
    sget-object p0, Lcf/z;->f:Lcf/z;

    return-object p0

    :cond_1
    sget-object p0, Lcf/z;->e:Lcf/z;

    return-object p0

    :cond_2
    sget-object p0, Lcf/z;->d:Lcf/z;

    return-object p0

    :cond_3
    sget-object p0, Lcf/z;->c:Lcf/z;

    return-object p0

    :cond_4
    sget-object p0, Lcf/z;->b:Lcf/z;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcf/z;
    .locals 1

    const-class v0, Lcf/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcf/z;

    return-object p0
.end method

.method public static values()[Lcf/z;
    .locals 1

    sget-object v0, Lcf/z;->i:[Lcf/z;

    invoke-virtual {v0}, [Lcf/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcf/z;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lcf/z;->g:Lcf/z;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcf/z;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
