.class public final enum Lfb/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lfb/r;

.field public static final enum b:Lfb/r;

.field public static final enum c:Lfb/r;

.field public static final enum d:Lfb/r;

.field public static final synthetic e:[Lfb/r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lfb/r;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfb/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfb/r;->a:Lfb/r;

    new-instance v1, Lfb/r;

    const-string v2, "AUTHENTICATING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lfb/r;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfb/r;->b:Lfb/r;

    new-instance v2, Lfb/r;

    const-string v3, "AUTHENTICATED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lfb/r;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lfb/r;->c:Lfb/r;

    new-instance v3, Lfb/r;

    const-string v4, "AUTHENTICATION_FAILED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lfb/r;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfb/r;->d:Lfb/r;

    filled-new-array {v0, v1, v2, v3}, [Lfb/r;

    move-result-object v0

    sput-object v0, Lfb/r;->e:[Lfb/r;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lfb/r;
    .locals 1

    sget-object v0, Lfb/r;->e:[Lfb/r;

    invoke-virtual {v0}, [Lfb/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfb/r;

    return-object v0
.end method
