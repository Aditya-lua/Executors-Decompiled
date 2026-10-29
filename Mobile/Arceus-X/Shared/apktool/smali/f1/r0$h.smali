.class public final enum Lf1/r0$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/r0$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf1/r0$h;

.field public static final enum b:Lf1/r0$h;

.field public static final enum c:Lf1/r0$h;

.field public static final enum d:Lf1/r0$h;

.field public static final enum e:Lf1/r0$h;

.field public static final enum f:Lf1/r0$h;

.field public static final synthetic g:[Lf1/r0$h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/r0$h;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->a:Lf1/r0$h;

    new-instance v0, Lf1/r0$h;

    const-string v1, "IDLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->b:Lf1/r0$h;

    new-instance v0, Lf1/r0$h;

    const-string v1, "DISABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->c:Lf1/r0$h;

    new-instance v0, Lf1/r0$h;

    const-string v1, "ENABLED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->d:Lf1/r0$h;

    new-instance v0, Lf1/r0$h;

    const-string v1, "ERROR_ENCODER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->e:Lf1/r0$h;

    new-instance v0, Lf1/r0$h;

    const-string v1, "ERROR_SOURCE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf1/r0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$h;->f:Lf1/r0$h;

    invoke-static {}, Lf1/r0$h;->a()[Lf1/r0$h;

    move-result-object v0

    sput-object v0, Lf1/r0$h;->g:[Lf1/r0$h;

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

.method public static synthetic a()[Lf1/r0$h;
    .locals 6

    sget-object v0, Lf1/r0$h;->a:Lf1/r0$h;

    sget-object v1, Lf1/r0$h;->b:Lf1/r0$h;

    sget-object v2, Lf1/r0$h;->c:Lf1/r0$h;

    sget-object v3, Lf1/r0$h;->d:Lf1/r0$h;

    sget-object v4, Lf1/r0$h;->e:Lf1/r0$h;

    sget-object v5, Lf1/r0$h;->f:Lf1/r0$h;

    filled-new-array/range {v0 .. v5}, [Lf1/r0$h;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/r0$h;
    .locals 1

    const-class v0, Lf1/r0$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/r0$h;

    return-object p0
.end method

.method public static values()[Lf1/r0$h;
    .locals 1

    sget-object v0, Lf1/r0$h;->g:[Lf1/r0$h;

    invoke-virtual {v0}, [Lf1/r0$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/r0$h;

    return-object v0
.end method
