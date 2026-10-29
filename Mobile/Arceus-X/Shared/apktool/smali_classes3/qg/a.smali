.class public final enum Lqg/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lqg/a;

.field public static final enum c:Lqg/a;

.field public static final enum d:Lqg/a;

.field public static final enum e:Lqg/a;

.field public static final f:[Lqg/a;

.field public static final synthetic g:[Lqg/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lqg/a;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqg/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqg/a;->b:Lqg/a;

    new-instance v1, Lqg/a;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lqg/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqg/a;->c:Lqg/a;

    new-instance v2, Lqg/a;

    const-string v3, "Q"

    const/4 v4, 0x2

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lqg/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lqg/a;->d:Lqg/a;

    new-instance v3, Lqg/a;

    const-string v6, "H"

    invoke-direct {v3, v6, v5, v4}, Lqg/a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqg/a;->e:Lqg/a;

    filled-new-array {v0, v1, v2, v3}, [Lqg/a;

    move-result-object v4

    sput-object v4, Lqg/a;->g:[Lqg/a;

    filled-new-array {v1, v0, v3, v2}, [Lqg/a;

    move-result-object v0

    sput-object v0, Lqg/a;->f:[Lqg/a;

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

    iput p3, p0, Lqg/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqg/a;
    .locals 1

    const-class v0, Lqg/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqg/a;

    return-object p0
.end method

.method public static values()[Lqg/a;
    .locals 1

    sget-object v0, Lqg/a;->g:[Lqg/a;

    invoke-virtual {v0}, [Lqg/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lqg/a;->a:I

    return v0
.end method
