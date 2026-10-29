.class public final enum Ly7/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly7/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ly7/e;

.field public static final enum b:Ly7/e;

.field public static final enum c:Ly7/e;

.field public static final synthetic d:[Ly7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/e;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly7/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly7/e;->a:Ly7/e;

    new-instance v1, Ly7/e;

    const-string v2, "VERY_LOW"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ly7/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly7/e;->b:Ly7/e;

    new-instance v2, Ly7/e;

    const-string v3, "HIGHEST"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ly7/e;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ly7/e;->c:Ly7/e;

    filled-new-array {v0, v1, v2}, [Ly7/e;

    move-result-object v0

    sput-object v0, Ly7/e;->d:[Ly7/e;

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

.method public static valueOf(Ljava/lang/String;)Ly7/e;
    .locals 1

    const-class v0, Ly7/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly7/e;

    return-object p0
.end method

.method public static values()[Ly7/e;
    .locals 1

    sget-object v0, Ly7/e;->d:[Ly7/e;

    invoke-virtual {v0}, [Ly7/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly7/e;

    return-object v0
.end method
