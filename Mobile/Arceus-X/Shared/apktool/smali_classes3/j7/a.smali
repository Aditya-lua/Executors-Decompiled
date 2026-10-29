.class public final enum Lj7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj7/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj7/a;

.field public static final enum b:Lj7/a;

.field public static final synthetic c:[Lj7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj7/a;

    const-string v1, "STANDARD_MOTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj7/a;->a:Lj7/a;

    new-instance v0, Lj7/a;

    const-string v1, "REDUCED_MOTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj7/a;->b:Lj7/a;

    invoke-static {}, Lj7/a;->a()[Lj7/a;

    move-result-object v0

    sput-object v0, Lj7/a;->c:[Lj7/a;

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

.method public static synthetic a()[Lj7/a;
    .locals 2

    sget-object v0, Lj7/a;->a:Lj7/a;

    sget-object v1, Lj7/a;->b:Lj7/a;

    filled-new-array {v0, v1}, [Lj7/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj7/a;
    .locals 1

    const-class v0, Lj7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj7/a;

    return-object p0
.end method

.method public static values()[Lj7/a;
    .locals 1

    sget-object v0, Lj7/a;->c:[Lj7/a;

    invoke-virtual {v0}, [Lj7/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj7/a;

    return-object v0
.end method
