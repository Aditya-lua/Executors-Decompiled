.class public final enum Lc2/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc2/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc2/e$b;

.field public static final enum b:Lc2/e$b;

.field public static final enum c:Lc2/e$b;

.field public static final enum d:Lc2/e$b;

.field public static final synthetic e:[Lc2/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc2/e$b;

    const-string v1, "FIXED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc2/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc2/e$b;->a:Lc2/e$b;

    new-instance v0, Lc2/e$b;

    const-string v1, "WRAP_CONTENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc2/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc2/e$b;->b:Lc2/e$b;

    new-instance v0, Lc2/e$b;

    const-string v1, "MATCH_CONSTRAINT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc2/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc2/e$b;->c:Lc2/e$b;

    new-instance v0, Lc2/e$b;

    const-string v1, "MATCH_PARENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc2/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc2/e$b;->d:Lc2/e$b;

    invoke-static {}, Lc2/e$b;->a()[Lc2/e$b;

    move-result-object v0

    sput-object v0, Lc2/e$b;->e:[Lc2/e$b;

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

.method public static synthetic a()[Lc2/e$b;
    .locals 4

    sget-object v0, Lc2/e$b;->a:Lc2/e$b;

    sget-object v1, Lc2/e$b;->b:Lc2/e$b;

    sget-object v2, Lc2/e$b;->c:Lc2/e$b;

    sget-object v3, Lc2/e$b;->d:Lc2/e$b;

    filled-new-array {v0, v1, v2, v3}, [Lc2/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc2/e$b;
    .locals 1

    const-class v0, Lc2/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc2/e$b;

    return-object p0
.end method

.method public static values()[Lc2/e$b;
    .locals 1

    sget-object v0, Lc2/e$b;->e:[Lc2/e$b;

    invoke-virtual {v0}, [Lc2/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc2/e$b;

    return-object v0
.end method
