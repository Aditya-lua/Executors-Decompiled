.class public final enum Ln0/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/z;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/z;

.field public static final enum b:Ln0/z;

.field public static final enum c:Ln0/z;

.field public static final enum d:Ln0/z;

.field public static final synthetic e:[Ln0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/z;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/z;->a:Ln0/z;

    new-instance v0, Ln0/z;

    const-string v1, "OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/z;->b:Ln0/z;

    new-instance v0, Ln0/z;

    const-string v1, "ON_MANUAL_AUTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/z;->c:Ln0/z;

    new-instance v0, Ln0/z;

    const-string v1, "ON_CONTINUOUS_AUTO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/z;->d:Ln0/z;

    invoke-static {}, Ln0/z;->a()[Ln0/z;

    move-result-object v0

    sput-object v0, Ln0/z;->e:[Ln0/z;

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

.method public static synthetic a()[Ln0/z;
    .locals 4

    sget-object v0, Ln0/z;->a:Ln0/z;

    sget-object v1, Ln0/z;->b:Ln0/z;

    sget-object v2, Ln0/z;->c:Ln0/z;

    sget-object v3, Ln0/z;->d:Ln0/z;

    filled-new-array {v0, v1, v2, v3}, [Ln0/z;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/z;
    .locals 1

    const-class v0, Ln0/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/z;

    return-object p0
.end method

.method public static values()[Ln0/z;
    .locals 1

    sget-object v0, Ln0/z;->e:[Ln0/z;

    invoke-virtual {v0}, [Ln0/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/z;

    return-object v0
.end method
