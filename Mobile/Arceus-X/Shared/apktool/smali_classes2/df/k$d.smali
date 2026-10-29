.class public final enum Ldf/k$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/k$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldf/k$d;

.field public static final enum b:Ldf/k$d;

.field public static final enum c:Ldf/k$d;

.field public static final synthetic d:[Ldf/k$d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ldf/k$d;

    const-string v1, "UNCOMPRESSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldf/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/k$d;->a:Ldf/k$d;

    new-instance v1, Ldf/k$d;

    const-string v2, "COMPRESSED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ldf/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldf/k$d;->b:Ldf/k$d;

    new-instance v2, Ldf/k$d;

    const-string v3, "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ldf/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldf/k$d;->c:Ldf/k$d;

    filled-new-array {v0, v1, v2}, [Ldf/k$d;

    move-result-object v0

    sput-object v0, Ldf/k$d;->d:[Ldf/k$d;

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

.method public static valueOf(Ljava/lang/String;)Ldf/k$d;
    .locals 1

    const-class v0, Ldf/k$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/k$d;

    return-object p0
.end method

.method public static values()[Ldf/k$d;
    .locals 1

    sget-object v0, Ldf/k$d;->d:[Ldf/k$d;

    invoke-virtual {v0}, [Ldf/k$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/k$d;

    return-object v0
.end method
