.class public final enum Lf7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf7/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf7/a;

.field public static final enum b:Lf7/a;

.field public static final enum c:Lf7/a;

.field public static final synthetic d:[Lf7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf7/a;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/a;->a:Lf7/a;

    new-instance v0, Lf7/a;

    const-string v1, "ENABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/a;->b:Lf7/a;

    new-instance v0, Lf7/a;

    const-string v1, "DISABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/a;->c:Lf7/a;

    invoke-static {}, Lf7/a;->a()[Lf7/a;

    move-result-object v0

    sput-object v0, Lf7/a;->d:[Lf7/a;

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

.method public static synthetic a()[Lf7/a;
    .locals 3

    sget-object v0, Lf7/a;->a:Lf7/a;

    sget-object v1, Lf7/a;->b:Lf7/a;

    sget-object v2, Lf7/a;->c:Lf7/a;

    filled-new-array {v0, v1, v2}, [Lf7/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf7/a;
    .locals 1

    const-class v0, Lf7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf7/a;

    return-object p0
.end method

.method public static values()[Lf7/a;
    .locals 1

    sget-object v0, Lf7/a;->d:[Lf7/a;

    invoke-virtual {v0}, [Lf7/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf7/a;

    return-object v0
.end method
