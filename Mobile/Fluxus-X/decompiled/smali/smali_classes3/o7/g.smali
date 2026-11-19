.class public final enum Lo7/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo7/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo7/g;

.field public static final enum b:Lo7/g;

.field public static final synthetic c:[Lo7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo7/g;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/g;->a:Lo7/g;

    new-instance v0, Lo7/g;

    const-string v1, "RADIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/g;->b:Lo7/g;

    invoke-static {}, Lo7/g;->a()[Lo7/g;

    move-result-object v0

    sput-object v0, Lo7/g;->c:[Lo7/g;

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

.method public static synthetic a()[Lo7/g;
    .locals 2

    sget-object v0, Lo7/g;->a:Lo7/g;

    sget-object v1, Lo7/g;->b:Lo7/g;

    filled-new-array {v0, v1}, [Lo7/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/g;
    .locals 1

    const-class v0, Lo7/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/g;

    return-object p0
.end method

.method public static values()[Lo7/g;
    .locals 1

    sget-object v0, Lo7/g;->c:[Lo7/g;

    invoke-virtual {v0}, [Lo7/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/g;

    return-object v0
.end method
