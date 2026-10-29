.class public final enum Lv7/h2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lv7/h2;

.field public static final enum b:Lv7/h2;

.field public static final enum c:Lv7/h2;

.field public static final enum d:Lv7/h2;

.field public static final enum e:Lv7/h2;

.field public static final enum f:Lv7/h2;

.field public static final enum g:Lv7/h2;

.field public static final synthetic h:[Lv7/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lv7/h2;

    const-string v1, "CANCEL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv7/h2;->a:Lv7/h2;

    new-instance v1, Lv7/h2;

    const-string v2, "RESTORE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lv7/h2;->b:Lv7/h2;

    new-instance v2, Lv7/h2;

    const-string v3, "PAUSE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lv7/h2;->c:Lv7/h2;

    new-instance v3, Lv7/h2;

    const-string v4, "RESUME"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lv7/h2;->d:Lv7/h2;

    new-instance v4, Lv7/h2;

    const-string v5, "FIX_PAYMENT"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lv7/h2;->e:Lv7/h2;

    new-instance v5, Lv7/h2;

    const-string v6, "CONFIRM_PRICE_CHANGE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lv7/h2;->f:Lv7/h2;

    new-instance v6, Lv7/h2;

    const-string v7, "CONFIRM_PRICE_STEP_UP"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lv7/h2;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lv7/h2;->g:Lv7/h2;

    filled-new-array/range {v0 .. v6}, [Lv7/h2;

    move-result-object v0

    sput-object v0, Lv7/h2;->h:[Lv7/h2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lv7/h2;
    .locals 1

    sget-object v0, Lv7/h2;->h:[Lv7/h2;

    invoke-virtual {v0}, [Lv7/h2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv7/h2;

    return-object v0
.end method
