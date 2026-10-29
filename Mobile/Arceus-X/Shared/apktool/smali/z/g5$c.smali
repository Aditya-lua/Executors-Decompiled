.class public final enum Lz/g5$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz/g5$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lz/g5$c;

.field public static final enum b:Lz/g5$c;

.field public static final enum c:Lz/g5$c;

.field public static final synthetic d:[Lz/g5$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/g5$c;

    const-string v1, "WITHOUT_FEATURE_COMBO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/g5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g5$c;->a:Lz/g5$c;

    new-instance v0, Lz/g5$c;

    const-string v1, "WITH_FEATURE_COMBO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz/g5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g5$c;->b:Lz/g5$c;

    new-instance v0, Lz/g5$c;

    const-string v1, "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz/g5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g5$c;->c:Lz/g5$c;

    invoke-static {}, Lz/g5$c;->a()[Lz/g5$c;

    move-result-object v0

    sput-object v0, Lz/g5$c;->d:[Lz/g5$c;

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

.method public static synthetic a()[Lz/g5$c;
    .locals 3

    sget-object v0, Lz/g5$c;->a:Lz/g5$c;

    sget-object v1, Lz/g5$c;->b:Lz/g5$c;

    sget-object v2, Lz/g5$c;->c:Lz/g5$c;

    filled-new-array {v0, v1, v2}, [Lz/g5$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz/g5$c;
    .locals 1

    const-class v0, Lz/g5$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz/g5$c;

    return-object p0
.end method

.method public static values()[Lz/g5$c;
    .locals 1

    sget-object v0, Lz/g5$c;->d:[Lz/g5$c;

    invoke-virtual {v0}, [Lz/g5$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz/g5$c;

    return-object v0
.end method
