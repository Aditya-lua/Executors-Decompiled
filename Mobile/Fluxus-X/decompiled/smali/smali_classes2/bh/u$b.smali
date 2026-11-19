.class public final enum Lbh/u$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbh/u$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lbh/u$b;

.field public static final enum b:Lbh/u$b;

.field public static final enum c:Lbh/u$b;

.field public static final enum d:Lbh/u$b;

.field public static final synthetic e:[Lbh/u$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbh/u$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbh/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbh/u$b;->a:Lbh/u$b;

    new-instance v0, Lbh/u$b;

    const-string v1, "ARM32"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbh/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbh/u$b;->b:Lbh/u$b;

    new-instance v0, Lbh/u$b;

    const-string v1, "ARM64"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbh/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbh/u$b;->c:Lbh/u$b;

    new-instance v0, Lbh/u$b;

    const-string v1, "X86_64"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbh/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbh/u$b;->d:Lbh/u$b;

    invoke-static {}, Lbh/u$b;->a()[Lbh/u$b;

    move-result-object v0

    sput-object v0, Lbh/u$b;->e:[Lbh/u$b;

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

.method public static synthetic a()[Lbh/u$b;
    .locals 4

    sget-object v0, Lbh/u$b;->a:Lbh/u$b;

    sget-object v1, Lbh/u$b;->b:Lbh/u$b;

    sget-object v2, Lbh/u$b;->c:Lbh/u$b;

    sget-object v3, Lbh/u$b;->d:Lbh/u$b;

    filled-new-array {v0, v1, v2, v3}, [Lbh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Lbh/u$b;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lbh/u$b;->a:Lbh/u$b;

    return-object p0

    :cond_0
    sget-object p0, Lbh/u$b;->d:Lbh/u$b;

    return-object p0

    :cond_1
    sget-object p0, Lbh/u$b;->c:Lbh/u$b;

    return-object p0

    :cond_2
    sget-object p0, Lbh/u$b;->b:Lbh/u$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lbh/u$b;
    .locals 1

    const-class v0, Lbh/u$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbh/u$b;

    return-object p0
.end method

.method public static values()[Lbh/u$b;
    .locals 1

    sget-object v0, Lbh/u$b;->e:[Lbh/u$b;

    invoke-virtual {v0}, [Lbh/u$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbh/u$b;

    return-object v0
.end method
