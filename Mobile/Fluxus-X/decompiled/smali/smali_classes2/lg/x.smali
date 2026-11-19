.class public final enum Llg/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/x;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/x;

.field public static final enum b:Llg/x;

.field public static final enum c:Llg/x;

.field public static final synthetic d:[Llg/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/x;

    const-string v1, "LENIENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/x;->a:Llg/x;

    new-instance v0, Llg/x;

    const-string v1, "LEGACY_STRICT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/x;->b:Llg/x;

    new-instance v0, Llg/x;

    const-string v1, "STRICT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/x;->c:Llg/x;

    invoke-static {}, Llg/x;->a()[Llg/x;

    move-result-object v0

    sput-object v0, Llg/x;->d:[Llg/x;

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

.method public static synthetic a()[Llg/x;
    .locals 3

    sget-object v0, Llg/x;->a:Llg/x;

    sget-object v1, Llg/x;->b:Llg/x;

    sget-object v2, Llg/x;->c:Llg/x;

    filled-new-array {v0, v1, v2}, [Llg/x;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llg/x;
    .locals 1

    const-class v0, Llg/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/x;

    return-object p0
.end method

.method public static values()[Llg/x;
    .locals 1

    sget-object v0, Llg/x;->d:[Llg/x;

    invoke-virtual {v0}, [Llg/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/x;

    return-object v0
.end method
