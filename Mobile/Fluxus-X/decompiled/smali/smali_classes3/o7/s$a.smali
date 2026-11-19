.class public final enum Lo7/s$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo7/s$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo7/s$a;

.field public static final enum b:Lo7/s$a;

.field public static final enum c:Lo7/s$a;

.field public static final synthetic d:[Lo7/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo7/s$a;

    const-string v1, "BUTT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo7/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/s$a;->a:Lo7/s$a;

    new-instance v0, Lo7/s$a;

    const-string v1, "ROUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo7/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/s$a;->b:Lo7/s$a;

    new-instance v0, Lo7/s$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo7/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/s$a;->c:Lo7/s$a;

    invoke-static {}, Lo7/s$a;->a()[Lo7/s$a;

    move-result-object v0

    sput-object v0, Lo7/s$a;->d:[Lo7/s$a;

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

.method public static synthetic a()[Lo7/s$a;
    .locals 3

    sget-object v0, Lo7/s$a;->a:Lo7/s$a;

    sget-object v1, Lo7/s$a;->b:Lo7/s$a;

    sget-object v2, Lo7/s$a;->c:Lo7/s$a;

    filled-new-array {v0, v1, v2}, [Lo7/s$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/s$a;
    .locals 1

    const-class v0, Lo7/s$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/s$a;

    return-object p0
.end method

.method public static values()[Lo7/s$a;
    .locals 1

    sget-object v0, Lo7/s$a;->d:[Lo7/s$a;

    invoke-virtual {v0}, [Lo7/s$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/s$a;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/graphics/Paint$Cap;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    return-object v0

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    return-object v0

    :cond_1
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    return-object v0
.end method
