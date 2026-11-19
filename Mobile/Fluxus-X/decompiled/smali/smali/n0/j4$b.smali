.class public final enum Ln0/j4$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/j4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/j4$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/j4$b;

.field public static final enum b:Ln0/j4$b;

.field public static final enum c:Ln0/j4$b;

.field public static final enum d:Ln0/j4$b;

.field public static final enum e:Ln0/j4$b;

.field public static final enum f:Ln0/j4$b;

.field public static final synthetic g:[Ln0/j4$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/j4$b;

    const-string v1, "IMAGE_CAPTURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->a:Ln0/j4$b;

    new-instance v0, Ln0/j4$b;

    const-string v1, "PREVIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->b:Ln0/j4$b;

    new-instance v0, Ln0/j4$b;

    const-string v1, "IMAGE_ANALYSIS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->c:Ln0/j4$b;

    new-instance v0, Ln0/j4$b;

    const-string v1, "VIDEO_CAPTURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->d:Ln0/j4$b;

    new-instance v0, Ln0/j4$b;

    const-string v1, "STREAM_SHARING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->e:Ln0/j4$b;

    new-instance v0, Ln0/j4$b;

    const-string v1, "METERING_REPEATING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/j4$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/j4$b;->f:Ln0/j4$b;

    invoke-static {}, Ln0/j4$b;->a()[Ln0/j4$b;

    move-result-object v0

    sput-object v0, Ln0/j4$b;->g:[Ln0/j4$b;

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

.method public static synthetic a()[Ln0/j4$b;
    .locals 6

    sget-object v0, Ln0/j4$b;->a:Ln0/j4$b;

    sget-object v1, Ln0/j4$b;->b:Ln0/j4$b;

    sget-object v2, Ln0/j4$b;->c:Ln0/j4$b;

    sget-object v3, Ln0/j4$b;->d:Ln0/j4$b;

    sget-object v4, Ln0/j4$b;->e:Ln0/j4$b;

    sget-object v5, Ln0/j4$b;->f:Ln0/j4$b;

    filled-new-array/range {v0 .. v5}, [Ln0/j4$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/j4$b;
    .locals 1

    const-class v0, Ln0/j4$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/j4$b;

    return-object p0
.end method

.method public static values()[Ln0/j4$b;
    .locals 1

    sget-object v0, Ln0/j4$b;->g:[Ln0/j4$b;

    invoke-virtual {v0}, [Ln0/j4$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/j4$b;

    return-object v0
.end method
