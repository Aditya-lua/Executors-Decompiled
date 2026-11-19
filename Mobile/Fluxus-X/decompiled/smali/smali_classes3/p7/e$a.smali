.class public final enum Lp7/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp7/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lp7/e$a;

.field public static final enum b:Lp7/e$a;

.field public static final enum c:Lp7/e$a;

.field public static final enum d:Lp7/e$a;

.field public static final enum e:Lp7/e$a;

.field public static final enum f:Lp7/e$a;

.field public static final enum g:Lp7/e$a;

.field public static final synthetic h:[Lp7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp7/e$a;

    const-string v1, "PRE_COMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->a:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "SOLID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->b:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "IMAGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->c:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->d:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "SHAPE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->e:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "TEXT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->f:Lp7/e$a;

    new-instance v0, Lp7/e$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lp7/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp7/e$a;->g:Lp7/e$a;

    invoke-static {}, Lp7/e$a;->a()[Lp7/e$a;

    move-result-object v0

    sput-object v0, Lp7/e$a;->h:[Lp7/e$a;

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

.method public static synthetic a()[Lp7/e$a;
    .locals 7

    sget-object v0, Lp7/e$a;->a:Lp7/e$a;

    sget-object v1, Lp7/e$a;->b:Lp7/e$a;

    sget-object v2, Lp7/e$a;->c:Lp7/e$a;

    sget-object v3, Lp7/e$a;->d:Lp7/e$a;

    sget-object v4, Lp7/e$a;->e:Lp7/e$a;

    sget-object v5, Lp7/e$a;->f:Lp7/e$a;

    sget-object v6, Lp7/e$a;->g:Lp7/e$a;

    filled-new-array/range {v0 .. v6}, [Lp7/e$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lp7/e$a;
    .locals 1

    const-class v0, Lp7/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp7/e$a;

    return-object p0
.end method

.method public static values()[Lp7/e$a;
    .locals 1

    sget-object v0, Lp7/e$a;->h:[Lp7/e$a;

    invoke-virtual {v0}, [Lp7/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp7/e$a;

    return-object v0
.end method
