.class public final enum Lgb/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lgb/q;

.field public static final enum b:Lgb/q;

.field public static final enum c:Lgb/q;

.field public static final synthetic d:[Lgb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lgb/q;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgb/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgb/q;->a:Lgb/q;

    new-instance v1, Lgb/q;

    const-string v2, "AUTOMATIC_PENDING_EXPLICIT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lgb/q;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgb/q;->b:Lgb/q;

    new-instance v2, Lgb/q;

    const-string v3, "EXPLICIT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lgb/q;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgb/q;->c:Lgb/q;

    filled-new-array {v0, v1, v2}, [Lgb/q;

    move-result-object v0

    sput-object v0, Lgb/q;->d:[Lgb/q;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lgb/q;
    .locals 1

    sget-object v0, Lgb/q;->d:[Lgb/q;

    invoke-virtual {v0}, [Lgb/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/q;

    return-object v0
.end method
