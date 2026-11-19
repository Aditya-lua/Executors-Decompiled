.class public final enum Lfm/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfm/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfm/p$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfm/p$b;

.field public static final enum b:Lfm/p$b;

.field public static final enum c:Lfm/p$b;

.field public static final synthetic d:[Lfm/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfm/p$b;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfm/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/p$b;->a:Lfm/p$b;

    new-instance v0, Lfm/p$b;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfm/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/p$b;->b:Lfm/p$b;

    new-instance v0, Lfm/p$b;

    const-string v1, "PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfm/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfm/p$b;->c:Lfm/p$b;

    invoke-static {}, Lfm/p$b;->a()[Lfm/p$b;

    move-result-object v0

    sput-object v0, Lfm/p$b;->d:[Lfm/p$b;

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

.method public static synthetic a()[Lfm/p$b;
    .locals 3

    sget-object v0, Lfm/p$b;->a:Lfm/p$b;

    sget-object v1, Lfm/p$b;->b:Lfm/p$b;

    sget-object v2, Lfm/p$b;->c:Lfm/p$b;

    filled-new-array {v0, v1, v2}, [Lfm/p$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfm/p$b;
    .locals 1

    const-class v0, Lfm/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfm/p$b;

    return-object p0
.end method

.method public static values()[Lfm/p$b;
    .locals 1

    sget-object v0, Lfm/p$b;->d:[Lfm/p$b;

    invoke-virtual {v0}, [Lfm/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfm/p$b;

    return-object v0
.end method
