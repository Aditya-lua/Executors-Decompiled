.class public final enum Lf2/j$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf2/j$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf2/j$d;

.field public static final enum b:Lf2/j$d;

.field public static final enum c:Lf2/j$d;

.field public static final enum d:Lf2/j$d;

.field public static final synthetic e:[Lf2/j$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/j$d;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/j$d;->a:Lf2/j$d;

    new-instance v0, Lf2/j$d;

    const-string v1, "SETUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf2/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/j$d;->b:Lf2/j$d;

    new-instance v0, Lf2/j$d;

    const-string v1, "MOVING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf2/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/j$d;->c:Lf2/j$d;

    new-instance v0, Lf2/j$d;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf2/j$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/j$d;->d:Lf2/j$d;

    invoke-static {}, Lf2/j$d;->a()[Lf2/j$d;

    move-result-object v0

    sput-object v0, Lf2/j$d;->e:[Lf2/j$d;

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

.method public static synthetic a()[Lf2/j$d;
    .locals 4

    sget-object v0, Lf2/j$d;->a:Lf2/j$d;

    sget-object v1, Lf2/j$d;->b:Lf2/j$d;

    sget-object v2, Lf2/j$d;->c:Lf2/j$d;

    sget-object v3, Lf2/j$d;->d:Lf2/j$d;

    filled-new-array {v0, v1, v2, v3}, [Lf2/j$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/j$d;
    .locals 1

    const-class v0, Lf2/j$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/j$d;

    return-object p0
.end method

.method public static values()[Lf2/j$d;
    .locals 1

    sget-object v0, Lf2/j$d;->e:[Lf2/j$d;

    invoke-virtual {v0}, [Lf2/j$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/j$d;

    return-object v0
.end method
