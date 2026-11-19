.class public final enum Lff/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lff/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lff/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lff/k$b;

.field public static final enum b:Lff/k$b;

.field public static final enum c:Lff/k$b;

.field public static final synthetic d:[Lff/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lff/k$b;

    const-string v1, "NIST_P256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lff/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/k$b;->a:Lff/k$b;

    new-instance v1, Lff/k$b;

    const-string v2, "NIST_P384"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lff/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lff/k$b;->b:Lff/k$b;

    new-instance v2, Lff/k$b;

    const-string v3, "NIST_P521"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lff/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lff/k$b;->c:Lff/k$b;

    filled-new-array {v0, v1, v2}, [Lff/k$b;

    move-result-object v0

    sput-object v0, Lff/k$b;->d:[Lff/k$b;

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

.method public static valueOf(Ljava/lang/String;)Lff/k$b;
    .locals 1

    const-class v0, Lff/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lff/k$b;

    return-object p0
.end method

.method public static values()[Lff/k$b;
    .locals 1

    sget-object v0, Lff/k$b;->d:[Lff/k$b;

    invoke-virtual {v0}, [Lff/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lff/k$b;

    return-object v0
.end method
