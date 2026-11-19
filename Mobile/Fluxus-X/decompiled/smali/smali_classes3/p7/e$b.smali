.class public final enum Lp7/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp7/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lp7/e$b;

.field public static final enum b:Lp7/e$b;

.field public static final enum c:Lp7/e$b;

.field public static final enum d:Lp7/e$b;

.field public static final enum e:Lp7/e$b;

.field public static final enum f:Lp7/e$b;

.field public static final synthetic g:[Lp7/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp7/e$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->a:Lp7/e$b;

    new-instance v0, Lp7/e$b;

    const-string v1, "ADD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->b:Lp7/e$b;

    new-instance v0, Lp7/e$b;

    const-string v1, "INVERT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->c:Lp7/e$b;

    new-instance v0, Lp7/e$b;

    const-string v1, "LUMA"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->d:Lp7/e$b;

    new-instance v0, Lp7/e$b;

    const-string v1, "LUMA_INVERTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->e:Lp7/e$b;

    new-instance v0, Lp7/e$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lp7/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$b;->f:Lp7/e$b;

    invoke-static {}, Lp7/e$b;->a()[Lp7/e$b;

    move-result-object v0

    sput-object v0, Lp7/e$b;->g:[Lp7/e$b;

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

.method public static synthetic a()[Lp7/e$b;
    .locals 6

    sget-object v0, Lp7/e$b;->a:Lp7/e$b;

    sget-object v1, Lp7/e$b;->b:Lp7/e$b;

    sget-object v2, Lp7/e$b;->c:Lp7/e$b;

    sget-object v3, Lp7/e$b;->d:Lp7/e$b;

    sget-object v4, Lp7/e$b;->e:Lp7/e$b;

    sget-object v5, Lp7/e$b;->f:Lp7/e$b;

    filled-new-array/range {v0 .. v5}, [Lp7/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lp7/e$b;
    .locals 1

    const-class v0, Lp7/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp7/e$b;

    return-object p0
.end method

.method public static values()[Lp7/e$b;
    .locals 1

    sget-object v0, Lp7/e$b;->g:[Lp7/e$b;

    invoke-virtual {v0}, [Lp7/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp7/e$b;

    return-object v0
.end method
