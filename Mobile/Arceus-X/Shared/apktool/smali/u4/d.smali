.class public final enum Lu4/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu4/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lu4/d;

.field public static final enum c:Lu4/d;

.field public static final enum d:Lu4/d;

.field public static final enum e:Lu4/d;

.field public static final enum f:Lu4/d;

.field public static final synthetic g:[Lu4/d;


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu4/d;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "DEX_FILES"

    invoke-direct {v0, v4, v1, v2, v3}, Lu4/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lu4/d;->b:Lu4/d;

    new-instance v0, Lu4/d;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "EXTRA_DESCRIPTORS"

    invoke-direct {v0, v4, v1, v2, v3}, Lu4/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lu4/d;->c:Lu4/d;

    new-instance v0, Lu4/d;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2

    const-string v4, "CLASSES"

    invoke-direct {v0, v4, v1, v2, v3}, Lu4/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lu4/d;->d:Lu4/d;

    new-instance v0, Lu4/d;

    const/4 v1, 0x3

    const-wide/16 v2, 0x3

    const-string v4, "METHODS"

    invoke-direct {v0, v4, v1, v2, v3}, Lu4/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lu4/d;->e:Lu4/d;

    new-instance v0, Lu4/d;

    const/4 v1, 0x4

    const-wide/16 v2, 0x4

    const-string v4, "AGGREGATION_COUNT"

    invoke-direct {v0, v4, v1, v2, v3}, Lu4/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lu4/d;->f:Lu4/d;

    invoke-static {}, Lu4/d;->a()[Lu4/d;

    move-result-object v0

    sput-object v0, Lu4/d;->g:[Lu4/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lu4/d;->a:J

    return-void
.end method

.method public static synthetic a()[Lu4/d;
    .locals 5

    sget-object v0, Lu4/d;->b:Lu4/d;

    sget-object v1, Lu4/d;->c:Lu4/d;

    sget-object v2, Lu4/d;->d:Lu4/d;

    sget-object v3, Lu4/d;->e:Lu4/d;

    sget-object v4, Lu4/d;->f:Lu4/d;

    filled-new-array {v0, v1, v2, v3, v4}, [Lu4/d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu4/d;
    .locals 1

    const-class v0, Lu4/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu4/d;

    return-object p0
.end method

.method public static values()[Lu4/d;
    .locals 1

    sget-object v0, Lu4/d;->g:[Lu4/d;

    invoke-virtual {v0}, [Lu4/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu4/d;

    return-object v0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lu4/d;->a:J

    return-wide v0
.end method
