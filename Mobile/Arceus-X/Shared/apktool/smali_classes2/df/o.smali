.class public final enum Ldf/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldf/o;

.field public static final enum b:Ldf/o;

.field public static final enum c:Ldf/o;

.field public static final enum d:Ldf/o;

.field public static final enum e:Ldf/o;

.field public static final synthetic f:[Ldf/o;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ldf/o;

    const-string v1, "SHA1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldf/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/o;->a:Ldf/o;

    new-instance v1, Ldf/o;

    const-string v2, "SHA224"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ldf/o;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldf/o;->b:Ldf/o;

    new-instance v2, Ldf/o;

    const-string v3, "SHA256"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ldf/o;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldf/o;->c:Ldf/o;

    new-instance v3, Ldf/o;

    const-string v4, "SHA384"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ldf/o;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ldf/o;->d:Ldf/o;

    new-instance v4, Ldf/o;

    const-string v5, "SHA512"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ldf/o;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ldf/o;->e:Ldf/o;

    filled-new-array {v0, v1, v2, v3, v4}, [Ldf/o;

    move-result-object v0

    sput-object v0, Ldf/o;->f:[Ldf/o;

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

.method public static valueOf(Ljava/lang/String;)Ldf/o;
    .locals 1

    const-class v0, Ldf/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/o;

    return-object p0
.end method

.method public static values()[Ldf/o;
    .locals 1

    sget-object v0, Ldf/o;->f:[Ldf/o;

    invoke-virtual {v0}, [Ldf/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/o;

    return-object v0
.end method
