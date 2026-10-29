.class public final enum Laf/v;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laf/v;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum b:Laf/v;

.field public static final enum c:Laf/v;

.field public static final enum d:Laf/v;

.field public static final enum e:Laf/v;

.field public static final f:Lcom/google/crypto/tink/shaded/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "Laf/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic g:[Laf/v;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Laf/v;

    const-string v1, "UNKNOWN_ENCODING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laf/v;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laf/v;->b:Laf/v;

    new-instance v1, Laf/v;

    const-string v2, "IEEE_P1363"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Laf/v;-><init>(Ljava/lang/String;II)V

    sput-object v1, Laf/v;->c:Laf/v;

    new-instance v2, Laf/v;

    const-string v3, "DER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Laf/v;-><init>(Ljava/lang/String;II)V

    sput-object v2, Laf/v;->d:Laf/v;

    new-instance v3, Laf/v;

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-string v6, "UNRECOGNIZED"

    invoke-direct {v3, v6, v4, v5}, Laf/v;-><init>(Ljava/lang/String;II)V

    sput-object v3, Laf/v;->e:Laf/v;

    filled-new-array {v0, v1, v2, v3}, [Laf/v;

    move-result-object v0

    sput-object v0, Laf/v;->g:[Laf/v;

    new-instance v0, Laf/v$a;

    invoke-direct {v0}, Laf/v$a;-><init>()V

    sput-object v0, Laf/v;->f:Lcom/google/crypto/tink/shaded/protobuf/a0$d;

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

    iput p3, p0, Laf/v;->a:I

    return-void
.end method

.method public static a(I)Laf/v;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Laf/v;->d:Laf/v;

    return-object p0

    :cond_1
    sget-object p0, Laf/v;->c:Laf/v;

    return-object p0

    :cond_2
    sget-object p0, Laf/v;->b:Laf/v;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Laf/v;
    .locals 1

    const-class v0, Laf/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/v;

    return-object p0
.end method

.method public static values()[Laf/v;
    .locals 1

    sget-object v0, Laf/v;->g:[Laf/v;

    invoke-virtual {v0}, [Laf/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laf/v;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Laf/v;->e:Laf/v;

    if-eq p0, v0, :cond_0

    iget v0, p0, Laf/v;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
