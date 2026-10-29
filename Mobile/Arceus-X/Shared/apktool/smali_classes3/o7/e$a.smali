.class public final enum Lo7/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo7/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo7/e$a;

.field public static final enum b:Lo7/e$a;

.field public static final enum c:Lo7/e$a;

.field public static final enum d:Lo7/e$a;

.field public static final enum e:Lo7/e$a;

.field public static final enum f:Lo7/e$a;

.field public static final enum g:Lo7/e$a;

.field public static final synthetic h:[Lo7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo7/e$a;

    const-string v1, "PRE_COMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->a:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "SOLID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->b:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "IMAGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->c:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->d:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "SHAPE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->e:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "TEXT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->f:Lo7/e$a;

    new-instance v0, Lo7/e$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo7/e$a;->g:Lo7/e$a;

    invoke-static {}, Lo7/e$a;->a()[Lo7/e$a;

    move-result-object v0

    sput-object v0, Lo7/e$a;->h:[Lo7/e$a;

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

.method public static synthetic a()[Lo7/e$a;
    .locals 7

    sget-object v0, Lo7/e$a;->a:Lo7/e$a;

    sget-object v1, Lo7/e$a;->b:Lo7/e$a;

    sget-object v2, Lo7/e$a;->c:Lo7/e$a;

    sget-object v3, Lo7/e$a;->d:Lo7/e$a;

    sget-object v4, Lo7/e$a;->e:Lo7/e$a;

    sget-object v5, Lo7/e$a;->f:Lo7/e$a;

    sget-object v6, Lo7/e$a;->g:Lo7/e$a;

    filled-new-array/range {v0 .. v6}, [Lo7/e$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/e$a;
    .locals 1

    const-class v0, Lo7/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/e$a;

    return-object p0
.end method

.method public static values()[Lo7/e$a;
    .locals 1

    sget-object v0, Lo7/e$a;->h:[Lo7/e$a;

    invoke-virtual {v0}, [Lo7/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/e$a;

    return-object v0
.end method
