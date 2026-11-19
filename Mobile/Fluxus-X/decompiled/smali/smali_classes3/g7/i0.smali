.class public final enum Lg7/i0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg7/i0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lg7/i0;

.field public static final synthetic c:[Lg7/i0;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg7/i0;

    const/4 v1, 0x0

    const/16 v2, 0x13

    const-string v3, "MergePathsApi19"

    invoke-direct {v0, v3, v1, v2}, Lg7/i0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lg7/i0;->b:Lg7/i0;

    invoke-static {}, Lg7/i0;->a()[Lg7/i0;

    move-result-object v0

    sput-object v0, Lg7/i0;->c:[Lg7/i0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lg7/i0;->a:I

    return-void
.end method

.method public static synthetic a()[Lg7/i0;
    .locals 1

    sget-object v0, Lg7/i0;->b:Lg7/i0;

    filled-new-array {v0}, [Lg7/i0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/i0;
    .locals 1

    const-class v0, Lg7/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/i0;

    return-object p0
.end method

.method public static values()[Lg7/i0;
    .locals 1

    sget-object v0, Lg7/i0;->c:[Lg7/i0;

    invoke-virtual {v0}, [Lg7/i0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/i0;

    return-object v0
.end method
