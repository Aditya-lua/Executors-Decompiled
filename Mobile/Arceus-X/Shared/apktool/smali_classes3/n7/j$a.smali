.class public final enum Ln7/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln7/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln7/j$a;

.field public static final enum b:Ln7/j$a;

.field public static final enum c:Ln7/j$a;

.field public static final enum d:Ln7/j$a;

.field public static final enum e:Ln7/j$a;

.field public static final synthetic f:[Ln7/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln7/j$a;

    const-string v1, "MERGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/j$a;->a:Ln7/j$a;

    new-instance v0, Ln7/j$a;

    const-string v1, "ADD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/j$a;->b:Ln7/j$a;

    new-instance v0, Ln7/j$a;

    const-string v1, "SUBTRACT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/j$a;->c:Ln7/j$a;

    new-instance v0, Ln7/j$a;

    const-string v1, "INTERSECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/j$a;->d:Ln7/j$a;

    new-instance v0, Ln7/j$a;

    const-string v1, "EXCLUDE_INTERSECTIONS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln7/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/j$a;->e:Ln7/j$a;

    invoke-static {}, Ln7/j$a;->a()[Ln7/j$a;

    move-result-object v0

    sput-object v0, Ln7/j$a;->f:[Ln7/j$a;

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

.method public static synthetic a()[Ln7/j$a;
    .locals 5

    sget-object v0, Ln7/j$a;->a:Ln7/j$a;

    sget-object v1, Ln7/j$a;->b:Ln7/j$a;

    sget-object v2, Ln7/j$a;->c:Ln7/j$a;

    sget-object v3, Ln7/j$a;->d:Ln7/j$a;

    sget-object v4, Ln7/j$a;->e:Ln7/j$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Ln7/j$a;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Ln7/j$a;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    sget-object p0, Ln7/j$a;->a:Ln7/j$a;

    return-object p0

    :cond_0
    sget-object p0, Ln7/j$a;->e:Ln7/j$a;

    return-object p0

    :cond_1
    sget-object p0, Ln7/j$a;->d:Ln7/j$a;

    return-object p0

    :cond_2
    sget-object p0, Ln7/j$a;->c:Ln7/j$a;

    return-object p0

    :cond_3
    sget-object p0, Ln7/j$a;->b:Ln7/j$a;

    return-object p0

    :cond_4
    sget-object p0, Ln7/j$a;->a:Ln7/j$a;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ln7/j$a;
    .locals 1

    const-class v0, Ln7/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/j$a;

    return-object p0
.end method

.method public static values()[Ln7/j$a;
    .locals 1

    sget-object v0, Ln7/j$a;->f:[Ln7/j$a;

    invoke-virtual {v0}, [Ln7/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/j$a;

    return-object v0
.end method
