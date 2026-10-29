.class public final enum Ls7/l$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls7/l$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ls7/l$b;

.field public static final enum b:Ls7/l$b;

.field public static final enum c:Ls7/l$b;

.field public static final enum d:Ls7/l$b;

.field public static final synthetic e:[Ls7/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls7/l$b;

    const-string v1, "DIRECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls7/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls7/l$b;->a:Ls7/l$b;

    new-instance v0, Ls7/l$b;

    const-string v1, "SAVE_LAYER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls7/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls7/l$b;->b:Ls7/l$b;

    new-instance v0, Ls7/l$b;

    const-string v1, "BITMAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ls7/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls7/l$b;->c:Ls7/l$b;

    new-instance v0, Ls7/l$b;

    const-string v1, "RENDER_NODE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ls7/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls7/l$b;->d:Ls7/l$b;

    invoke-static {}, Ls7/l$b;->a()[Ls7/l$b;

    move-result-object v0

    sput-object v0, Ls7/l$b;->e:[Ls7/l$b;

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

.method public static synthetic a()[Ls7/l$b;
    .locals 4

    sget-object v0, Ls7/l$b;->a:Ls7/l$b;

    sget-object v1, Ls7/l$b;->b:Ls7/l$b;

    sget-object v2, Ls7/l$b;->c:Ls7/l$b;

    sget-object v3, Ls7/l$b;->d:Ls7/l$b;

    filled-new-array {v0, v1, v2, v3}, [Ls7/l$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls7/l$b;
    .locals 1

    const-class v0, Ls7/l$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls7/l$b;

    return-object p0
.end method

.method public static values()[Ls7/l$b;
    .locals 1

    sget-object v0, Ls7/l$b;->e:[Ls7/l$b;

    invoke-virtual {v0}, [Ls7/l$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls7/l$b;

    return-object v0
.end method
