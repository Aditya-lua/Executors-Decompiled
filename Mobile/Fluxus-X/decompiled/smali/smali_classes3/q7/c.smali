.class public final enum Lq7/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq7/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lq7/c;

.field public static final enum c:Lq7/c;

.field public static final enum d:Lq7/c;

.field public static final synthetic e:[Lq7/c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq7/c;

    const/4 v1, 0x0

    const-string v2, ".json"

    const-string v3, "JSON"

    invoke-direct {v0, v3, v1, v2}, Lq7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq7/c;->b:Lq7/c;

    new-instance v0, Lq7/c;

    const/4 v1, 0x1

    const-string v2, ".zip"

    const-string v3, "ZIP"

    invoke-direct {v0, v3, v1, v2}, Lq7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq7/c;->c:Lq7/c;

    new-instance v0, Lq7/c;

    const/4 v1, 0x2

    const-string v2, ".gz"

    const-string v3, "GZIP"

    invoke-direct {v0, v3, v1, v2}, Lq7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq7/c;->d:Lq7/c;

    invoke-static {}, Lq7/c;->a()[Lq7/c;

    move-result-object v0

    sput-object v0, Lq7/c;->e:[Lq7/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq7/c;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()[Lq7/c;
    .locals 3

    sget-object v0, Lq7/c;->b:Lq7/c;

    sget-object v1, Lq7/c;->c:Lq7/c;

    sget-object v2, Lq7/c;->d:Lq7/c;

    filled-new-array {v0, v1, v2}, [Lq7/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq7/c;
    .locals 1

    const-class v0, Lq7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq7/c;

    return-object p0
.end method

.method public static values()[Lq7/c;
    .locals 1

    sget-object v0, Lq7/c;->e:[Lq7/c;

    invoke-virtual {v0}, [Lq7/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq7/c;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ".temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq7/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq7/c;->a:Ljava/lang/String;

    return-object v0
.end method
