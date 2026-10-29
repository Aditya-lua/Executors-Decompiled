.class public final enum Ldf/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldf/k$b;

.field public static final enum b:Ldf/k$b;

.field public static final enum c:Ldf/k$b;

.field public static final synthetic d:[Ldf/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ldf/k$b;

    const-string v1, "NIST_P256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldf/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/k$b;->a:Ldf/k$b;

    new-instance v1, Ldf/k$b;

    const-string v2, "NIST_P384"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ldf/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldf/k$b;->b:Ldf/k$b;

    new-instance v2, Ldf/k$b;

    const-string v3, "NIST_P521"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ldf/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldf/k$b;->c:Ldf/k$b;

    filled-new-array {v0, v1, v2}, [Ldf/k$b;

    move-result-object v0

    sput-object v0, Ldf/k$b;->d:[Ldf/k$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldf/k$b;
    .locals 1

    const-class v0, Ldf/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/k$b;

    return-object p0
.end method

.method public static values()[Ldf/k$b;
    .locals 1

    sget-object v0, Ldf/k$b;->d:[Ldf/k$b;

    invoke-virtual {v0}, [Ldf/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/k$b;

    return-object v0
.end method
