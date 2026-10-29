.class public final enum Lcom/google/crypto/tink/shaded/protobuf/v$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/crypto/tink/shaded/protobuf/v$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/google/crypto/tink/shaded/protobuf/v$b;

.field public static final enum c:Lcom/google/crypto/tink/shaded/protobuf/v$b;

.field public static final enum d:Lcom/google/crypto/tink/shaded/protobuf/v$b;

.field public static final enum e:Lcom/google/crypto/tink/shaded/protobuf/v$b;

.field public static final synthetic f:[Lcom/google/crypto/tink/shaded/protobuf/v$b;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/crypto/tink/shaded/protobuf/v$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/v$b;->b:Lcom/google/crypto/tink/shaded/protobuf/v$b;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    const-string v3, "VECTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/crypto/tink/shaded/protobuf/v$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/google/crypto/tink/shaded/protobuf/v$b;->c:Lcom/google/crypto/tink/shaded/protobuf/v$b;

    new-instance v3, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    const-string v5, "PACKED_VECTOR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lcom/google/crypto/tink/shaded/protobuf/v$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lcom/google/crypto/tink/shaded/protobuf/v$b;->d:Lcom/google/crypto/tink/shaded/protobuf/v$b;

    new-instance v4, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    const-string v5, "MAP"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v2}, Lcom/google/crypto/tink/shaded/protobuf/v$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v4, Lcom/google/crypto/tink/shaded/protobuf/v$b;->e:Lcom/google/crypto/tink/shaded/protobuf/v$b;

    filled-new-array {v0, v1, v3, v4}, [Lcom/google/crypto/tink/shaded/protobuf/v$b;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/v$b;->f:[Lcom/google/crypto/tink/shaded/protobuf/v$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/google/crypto/tink/shaded/protobuf/v$b;->a:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/v$b;
    .locals 1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/v$b;

    return-object p0
.end method

.method public static values()[Lcom/google/crypto/tink/shaded/protobuf/v$b;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/v$b;->f:[Lcom/google/crypto/tink/shaded/protobuf/v$b;

    invoke-virtual {v0}, [Lcom/google/crypto/tink/shaded/protobuf/v$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/crypto/tink/shaded/protobuf/v$b;

    return-object v0
.end method
