.class public final enum Lsg/u$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsg/u$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lsg/u$b;

.field public static final enum b:Lsg/u$b;

.field public static final enum c:Lsg/u$b;

.field public static final enum d:Lsg/u$b;

.field public static final synthetic e:[Lsg/u$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsg/u$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsg/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsg/u$b;->a:Lsg/u$b;

    new-instance v0, Lsg/u$b;

    const-string v1, "ARM32"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsg/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsg/u$b;->b:Lsg/u$b;

    new-instance v0, Lsg/u$b;

    const-string v1, "ARM64"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsg/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsg/u$b;->c:Lsg/u$b;

    new-instance v0, Lsg/u$b;

    const-string v1, "X86_64"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lsg/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsg/u$b;->d:Lsg/u$b;

    invoke-static {}, Lsg/u$b;->a()[Lsg/u$b;

    move-result-object v0

    sput-object v0, Lsg/u$b;->e:[Lsg/u$b;

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

.method public static synthetic a()[Lsg/u$b;
    .locals 4

    sget-object v0, Lsg/u$b;->a:Lsg/u$b;

    sget-object v1, Lsg/u$b;->b:Lsg/u$b;

    sget-object v2, Lsg/u$b;->c:Lsg/u$b;

    sget-object v3, Lsg/u$b;->d:Lsg/u$b;

    filled-new-array {v0, v1, v2, v3}, [Lsg/u$b;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Lsg/u$b;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lsg/u$b;->a:Lsg/u$b;

    return-object p0

    :cond_0
    sget-object p0, Lsg/u$b;->d:Lsg/u$b;

    return-object p0

    :cond_1
    sget-object p0, Lsg/u$b;->c:Lsg/u$b;

    return-object p0

    :cond_2
    sget-object p0, Lsg/u$b;->b:Lsg/u$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lsg/u$b;
    .locals 1

    const-class v0, Lsg/u$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsg/u$b;

    return-object p0
.end method

.method public static values()[Lsg/u$b;
    .locals 1

    sget-object v0, Lsg/u$b;->e:[Lsg/u$b;

    invoke-virtual {v0}, [Lsg/u$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsg/u$b;

    return-object v0
.end method
