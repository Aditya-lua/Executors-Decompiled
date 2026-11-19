.class public final enum Lgb/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lgb/s;

.field public static final enum b:Lgb/s;

.field public static final enum c:Lgb/s;

.field public static final enum d:Lgb/s;

.field public static final synthetic e:[Lgb/s;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lgb/s;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgb/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgb/s;->a:Lgb/s;

    new-instance v1, Lgb/s;

    const-string v2, "AUTHENTICATING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lgb/s;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgb/s;->b:Lgb/s;

    new-instance v2, Lgb/s;

    const-string v3, "AUTHENTICATED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lgb/s;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgb/s;->c:Lgb/s;

    new-instance v3, Lgb/s;

    const-string v4, "AUTHENTICATION_FAILED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lgb/s;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lgb/s;->d:Lgb/s;

    filled-new-array {v0, v1, v2, v3}, [Lgb/s;

    move-result-object v0

    sput-object v0, Lgb/s;->e:[Lgb/s;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lgb/s;
    .locals 1

    sget-object v0, Lgb/s;->e:[Lgb/s;

    invoke-virtual {v0}, [Lgb/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/s;

    return-object v0
.end method
