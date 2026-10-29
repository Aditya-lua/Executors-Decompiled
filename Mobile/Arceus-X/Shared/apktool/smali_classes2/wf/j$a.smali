.class public final enum Lwf/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwf/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwf/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lwf/j$a;

.field public static final enum c:Lwf/j$a;

.field public static final enum d:Lwf/j$a;

.field public static final enum e:Lwf/j$a;

.field public static final synthetic f:[Lwf/j$a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwf/j$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lwf/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwf/j$a;->b:Lwf/j$a;

    new-instance v0, Lwf/j$a;

    const-string v1, "SDK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lwf/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwf/j$a;->c:Lwf/j$a;

    new-instance v0, Lwf/j$a;

    const-string v1, "GLOBAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lwf/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwf/j$a;->d:Lwf/j$a;

    new-instance v0, Lwf/j$a;

    const-string v1, "COMBINED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lwf/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwf/j$a;->e:Lwf/j$a;

    invoke-static {}, Lwf/j$a;->a()[Lwf/j$a;

    move-result-object v0

    sput-object v0, Lwf/j$a;->f:[Lwf/j$a;

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

    iput p3, p0, Lwf/j$a;->a:I

    return-void
.end method

.method public static synthetic a()[Lwf/j$a;
    .locals 4

    sget-object v0, Lwf/j$a;->b:Lwf/j$a;

    sget-object v1, Lwf/j$a;->c:Lwf/j$a;

    sget-object v2, Lwf/j$a;->d:Lwf/j$a;

    sget-object v3, Lwf/j$a;->e:Lwf/j$a;

    filled-new-array {v0, v1, v2, v3}, [Lwf/j$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwf/j$a;
    .locals 1

    const-class v0, Lwf/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwf/j$a;

    return-object p0
.end method

.method public static values()[Lwf/j$a;
    .locals 1

    sget-object v0, Lwf/j$a;->f:[Lwf/j$a;

    invoke-virtual {v0}, [Lwf/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwf/j$a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lwf/j$a;->a:I

    return v0
.end method
