.class public final enum Lo7/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo7/u;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo7/u;

.field public static final enum b:Lo7/u;

.field public static final synthetic c:[Lo7/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo7/u;

    const-string v1, "PERCENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo7/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/u;->a:Lo7/u;

    new-instance v0, Lo7/u;

    const-string v1, "INDEX"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo7/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/u;->b:Lo7/u;

    invoke-static {}, Lo7/u;->a()[Lo7/u;

    move-result-object v0

    sput-object v0, Lo7/u;->c:[Lo7/u;

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

.method public static synthetic a()[Lo7/u;
    .locals 2

    sget-object v0, Lo7/u;->a:Lo7/u;

    sget-object v1, Lo7/u;->b:Lo7/u;

    filled-new-array {v0, v1}, [Lo7/u;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/u;
    .locals 1

    const-class v0, Lo7/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/u;

    return-object p0
.end method

.method public static values()[Lo7/u;
    .locals 1

    sget-object v0, Lo7/u;->c:[Lo7/u;

    invoke-virtual {v0}, [Lo7/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/u;

    return-object v0
.end method
