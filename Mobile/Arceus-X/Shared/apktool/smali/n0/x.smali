.class public final enum Ln0/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/x;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/x;

.field public static final enum b:Ln0/x;

.field public static final enum c:Ln0/x;

.field public static final enum d:Ln0/x;

.field public static final enum e:Ln0/x;

.field public static final enum f:Ln0/x;

.field public static final enum g:Ln0/x;

.field public static final synthetic h:[Ln0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/x;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->a:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->b:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "ON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->c:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "ON_AUTO_FLASH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->d:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "ON_ALWAYS_FLASH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->e:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "ON_AUTO_FLASH_REDEYE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->f:Ln0/x;

    new-instance v0, Ln0/x;

    const-string v1, "ON_EXTERNAL_FLASH"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ln0/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/x;->g:Ln0/x;

    invoke-static {}, Ln0/x;->a()[Ln0/x;

    move-result-object v0

    sput-object v0, Ln0/x;->h:[Ln0/x;

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

.method public static synthetic a()[Ln0/x;
    .locals 7

    sget-object v0, Ln0/x;->a:Ln0/x;

    sget-object v1, Ln0/x;->b:Ln0/x;

    sget-object v2, Ln0/x;->c:Ln0/x;

    sget-object v3, Ln0/x;->d:Ln0/x;

    sget-object v4, Ln0/x;->e:Ln0/x;

    sget-object v5, Ln0/x;->f:Ln0/x;

    sget-object v6, Ln0/x;->g:Ln0/x;

    filled-new-array/range {v0 .. v6}, [Ln0/x;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/x;
    .locals 1

    const-class v0, Ln0/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/x;

    return-object p0
.end method

.method public static values()[Ln0/x;
    .locals 1

    sget-object v0, Ln0/x;->h:[Ln0/x;

    invoke-virtual {v0}, [Ln0/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/x;

    return-object v0
.end method
