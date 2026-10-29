.class public final enum Lfb/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lfb/p;

.field public static final enum b:Lfb/p;

.field public static final enum c:Lfb/p;

.field public static final synthetic d:[Lfb/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lfb/p;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfb/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfb/p;->a:Lfb/p;

    new-instance v1, Lfb/p;

    const-string v2, "AUTOMATIC_PENDING_EXPLICIT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lfb/p;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfb/p;->b:Lfb/p;

    new-instance v2, Lfb/p;

    const-string v3, "EXPLICIT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lfb/p;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lfb/p;->c:Lfb/p;

    filled-new-array {v0, v1, v2}, [Lfb/p;

    move-result-object v0

    sput-object v0, Lfb/p;->d:[Lfb/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lfb/p;
    .locals 1

    sget-object v0, Lfb/p;->d:[Lfb/p;

    invoke-virtual {v0}, [Lfb/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfb/p;

    return-object v0
.end method
