.class public final enum Lob/sd;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lob/sd;

.field public static final enum b:Lob/sd;

.field public static final enum c:Lob/sd;

.field public static final enum d:Lob/sd;

.field public static final synthetic e:[Lob/sd;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lob/sd;

    const-string v1, "CONSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lob/sd;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lob/sd;->a:Lob/sd;

    new-instance v1, Lob/sd;

    const-string v2, "LEGITIMATE_INTEREST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lob/sd;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lob/sd;->b:Lob/sd;

    new-instance v2, Lob/sd;

    const-string v3, "FLEXIBLE_CONSENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lob/sd;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lob/sd;->c:Lob/sd;

    new-instance v3, Lob/sd;

    const-string v4, "FLEXIBLE_LEGITIMATE_INTEREST"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lob/sd;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lob/sd;->d:Lob/sd;

    filled-new-array {v0, v1, v2, v3}, [Lob/sd;

    move-result-object v0

    sput-object v0, Lob/sd;->e:[Lob/sd;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lob/sd;
    .locals 1

    sget-object v0, Lob/sd;->e:[Lob/sd;

    invoke-virtual {v0}, [Lob/sd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lob/sd;

    return-object v0
.end method
