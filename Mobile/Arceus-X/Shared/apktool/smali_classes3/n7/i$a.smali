.class public final enum Ln7/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln7/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln7/i$a;

.field public static final enum b:Ln7/i$a;

.field public static final enum c:Ln7/i$a;

.field public static final enum d:Ln7/i$a;

.field public static final synthetic e:[Ln7/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln7/i$a;

    const-string v1, "MASK_MODE_ADD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/i$a;->a:Ln7/i$a;

    new-instance v0, Ln7/i$a;

    const-string v1, "MASK_MODE_SUBTRACT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/i$a;->b:Ln7/i$a;

    new-instance v0, Ln7/i$a;

    const-string v1, "MASK_MODE_INTERSECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/i$a;->c:Ln7/i$a;

    new-instance v0, Ln7/i$a;

    const-string v1, "MASK_MODE_NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln7/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/i$a;->d:Ln7/i$a;

    invoke-static {}, Ln7/i$a;->a()[Ln7/i$a;

    move-result-object v0

    sput-object v0, Ln7/i$a;->e:[Ln7/i$a;

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

.method public static synthetic a()[Ln7/i$a;
    .locals 4

    sget-object v0, Ln7/i$a;->a:Ln7/i$a;

    sget-object v1, Ln7/i$a;->b:Ln7/i$a;

    sget-object v2, Ln7/i$a;->c:Ln7/i$a;

    sget-object v3, Ln7/i$a;->d:Ln7/i$a;

    filled-new-array {v0, v1, v2, v3}, [Ln7/i$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln7/i$a;
    .locals 1

    const-class v0, Ln7/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/i$a;

    return-object p0
.end method

.method public static values()[Ln7/i$a;
    .locals 1

    sget-object v0, Ln7/i$a;->e:[Ln7/i$a;

    invoke-virtual {v0}, [Ln7/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/i$a;

    return-object v0
.end method
