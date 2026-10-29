.class public final enum Lnn/w$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnn/w$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lnn/w$b;

.field public static final enum b:Lnn/w$b;

.field public static final enum c:Lnn/w$b;

.field public static final enum d:Lnn/w$b;

.field public static final enum e:Lnn/w$b;

.field public static final enum f:Lnn/w$b;

.field public static final synthetic g:[Lnn/w$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnn/w$b;

    const-string v1, "START_DEFINITION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->a:Lnn/w$b;

    new-instance v0, Lnn/w$b;

    const-string v1, "LABEL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->b:Lnn/w$b;

    new-instance v0, Lnn/w$b;

    const-string v1, "DESTINATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->c:Lnn/w$b;

    new-instance v0, Lnn/w$b;

    const-string v1, "START_TITLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->d:Lnn/w$b;

    new-instance v0, Lnn/w$b;

    const-string v1, "TITLE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->e:Lnn/w$b;

    new-instance v0, Lnn/w$b;

    const-string v1, "PARAGRAPH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lnn/w$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnn/w$b;->f:Lnn/w$b;

    invoke-static {}, Lnn/w$b;->a()[Lnn/w$b;

    move-result-object v0

    sput-object v0, Lnn/w$b;->g:[Lnn/w$b;

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

.method public static synthetic a()[Lnn/w$b;
    .locals 6

    sget-object v0, Lnn/w$b;->a:Lnn/w$b;

    sget-object v1, Lnn/w$b;->b:Lnn/w$b;

    sget-object v2, Lnn/w$b;->c:Lnn/w$b;

    sget-object v3, Lnn/w$b;->d:Lnn/w$b;

    sget-object v4, Lnn/w$b;->e:Lnn/w$b;

    sget-object v5, Lnn/w$b;->f:Lnn/w$b;

    filled-new-array/range {v0 .. v5}, [Lnn/w$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnn/w$b;
    .locals 1

    const-class v0, Lnn/w$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnn/w$b;

    return-object p0
.end method

.method public static values()[Lnn/w$b;
    .locals 1

    sget-object v0, Lnn/w$b;->g:[Lnn/w$b;

    invoke-virtual {v0}, [Lnn/w$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnn/w$b;

    return-object v0
.end method
