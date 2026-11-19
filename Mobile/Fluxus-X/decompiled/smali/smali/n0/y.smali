.class public final enum Ln0/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/y;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/y;

.field public static final enum b:Ln0/y;

.field public static final enum c:Ln0/y;

.field public static final enum d:Ln0/y;

.field public static final enum e:Ln0/y;

.field public static final enum f:Ln0/y;

.field public static final synthetic g:[Ln0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/y;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->a:Ln0/y;

    new-instance v0, Ln0/y;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->b:Ln0/y;

    new-instance v0, Ln0/y;

    const-string v1, "SEARCHING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->c:Ln0/y;

    new-instance v0, Ln0/y;

    const-string v1, "FLASH_REQUIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->d:Ln0/y;

    new-instance v0, Ln0/y;

    const-string v1, "CONVERGED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->e:Ln0/y;

    new-instance v0, Ln0/y;

    const-string v1, "LOCKED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/y;->f:Ln0/y;

    invoke-static {}, Ln0/y;->a()[Ln0/y;

    move-result-object v0

    sput-object v0, Ln0/y;->g:[Ln0/y;

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

.method public static synthetic a()[Ln0/y;
    .locals 6

    sget-object v0, Ln0/y;->a:Ln0/y;

    sget-object v1, Ln0/y;->b:Ln0/y;

    sget-object v2, Ln0/y;->c:Ln0/y;

    sget-object v3, Ln0/y;->d:Ln0/y;

    sget-object v4, Ln0/y;->e:Ln0/y;

    sget-object v5, Ln0/y;->f:Ln0/y;

    filled-new-array/range {v0 .. v5}, [Ln0/y;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/y;
    .locals 1

    const-class v0, Ln0/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/y;

    return-object p0
.end method

.method public static values()[Ln0/y;
    .locals 1

    sget-object v0, Ln0/y;->g:[Ln0/y;

    invoke-virtual {v0}, [Ln0/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/y;

    return-object v0
.end method
