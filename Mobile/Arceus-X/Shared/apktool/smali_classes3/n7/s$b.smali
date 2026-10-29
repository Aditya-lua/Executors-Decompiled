.class public final enum Ln7/s$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln7/s$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln7/s$b;

.field public static final enum b:Ln7/s$b;

.field public static final enum c:Ln7/s$b;

.field public static final synthetic d:[Ln7/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln7/s$b;

    const-string v1, "MITER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/s$b;->a:Ln7/s$b;

    new-instance v0, Ln7/s$b;

    const-string v1, "ROUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln7/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/s$b;->b:Ln7/s$b;

    new-instance v0, Ln7/s$b;

    const-string v1, "BEVEL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln7/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/s$b;->c:Ln7/s$b;

    invoke-static {}, Ln7/s$b;->a()[Ln7/s$b;

    move-result-object v0

    sput-object v0, Ln7/s$b;->d:[Ln7/s$b;

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

.method public static synthetic a()[Ln7/s$b;
    .locals 3

    sget-object v0, Ln7/s$b;->a:Ln7/s$b;

    sget-object v1, Ln7/s$b;->b:Ln7/s$b;

    sget-object v2, Ln7/s$b;->c:Ln7/s$b;

    filled-new-array {v0, v1, v2}, [Ln7/s$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln7/s$b;
    .locals 1

    const-class v0, Ln7/s$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/s$b;

    return-object p0
.end method

.method public static values()[Ln7/s$b;
    .locals 1

    sget-object v0, Ln7/s$b;->d:[Ln7/s$b;

    invoke-virtual {v0}, [Ln7/s$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/s$b;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/graphics/Paint$Join;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    return-object v0

    :cond_1
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    return-object v0

    :cond_2
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    return-object v0
.end method
