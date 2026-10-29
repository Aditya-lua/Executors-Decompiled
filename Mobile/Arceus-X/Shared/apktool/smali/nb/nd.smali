.class public final enum Lnb/nd;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lnb/nd;

.field public static final enum b:Lnb/nd;

.field public static final enum c:Lnb/nd;

.field public static final enum d:Lnb/nd;

.field public static final synthetic e:[Lnb/nd;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lnb/nd;

    const-string v1, "CONSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnb/nd;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnb/nd;->a:Lnb/nd;

    new-instance v1, Lnb/nd;

    const-string v2, "LEGITIMATE_INTEREST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lnb/nd;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnb/nd;->b:Lnb/nd;

    new-instance v2, Lnb/nd;

    const-string v3, "FLEXIBLE_CONSENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lnb/nd;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lnb/nd;->c:Lnb/nd;

    new-instance v3, Lnb/nd;

    const-string v4, "FLEXIBLE_LEGITIMATE_INTEREST"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lnb/nd;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lnb/nd;->d:Lnb/nd;

    filled-new-array {v0, v1, v2, v3}, [Lnb/nd;

    move-result-object v0

    sput-object v0, Lnb/nd;->e:[Lnb/nd;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lnb/nd;
    .locals 1

    sget-object v0, Lnb/nd;->e:[Lnb/nd;

    invoke-virtual {v0}, [Lnb/nd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/nd;

    return-object v0
.end method
