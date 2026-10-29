.class public final enum Ln7/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln7/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln7/g;

.field public static final enum b:Ln7/g;

.field public static final synthetic c:[Ln7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln7/g;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/g;->a:Ln7/g;

    new-instance v0, Ln7/g;

    const-string v1, "RADIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln7/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/g;->b:Ln7/g;

    invoke-static {}, Ln7/g;->a()[Ln7/g;

    move-result-object v0

    sput-object v0, Ln7/g;->c:[Ln7/g;

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

.method public static synthetic a()[Ln7/g;
    .locals 2

    sget-object v0, Ln7/g;->a:Ln7/g;

    sget-object v1, Ln7/g;->b:Ln7/g;

    filled-new-array {v0, v1}, [Ln7/g;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln7/g;
    .locals 1

    const-class v0, Ln7/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/g;

    return-object p0
.end method

.method public static values()[Ln7/g;
    .locals 1

    sget-object v0, Ln7/g;->c:[Ln7/g;

    invoke-virtual {v0}, [Ln7/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/g;

    return-object v0
.end method
