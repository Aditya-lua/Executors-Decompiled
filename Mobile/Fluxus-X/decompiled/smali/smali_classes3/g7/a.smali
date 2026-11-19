.class public final enum Lg7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg7/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg7/a;

.field public static final enum b:Lg7/a;

.field public static final enum c:Lg7/a;

.field public static final synthetic d:[Lg7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg7/a;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg7/a;->a:Lg7/a;

    new-instance v0, Lg7/a;

    const-string v1, "ENABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg7/a;->b:Lg7/a;

    new-instance v0, Lg7/a;

    const-string v1, "DISABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg7/a;->c:Lg7/a;

    invoke-static {}, Lg7/a;->a()[Lg7/a;

    move-result-object v0

    sput-object v0, Lg7/a;->d:[Lg7/a;

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

.method public static synthetic a()[Lg7/a;
    .locals 3

    sget-object v0, Lg7/a;->a:Lg7/a;

    sget-object v1, Lg7/a;->b:Lg7/a;

    sget-object v2, Lg7/a;->c:Lg7/a;

    filled-new-array {v0, v1, v2}, [Lg7/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/a;
    .locals 1

    const-class v0, Lg7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/a;

    return-object p0
.end method

.method public static values()[Lg7/a;
    .locals 1

    sget-object v0, Lg7/a;->d:[Lg7/a;

    invoke-virtual {v0}, [Lg7/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/a;

    return-object v0
.end method
