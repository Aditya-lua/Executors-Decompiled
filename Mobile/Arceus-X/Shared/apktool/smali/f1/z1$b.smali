.class public final enum Lf1/z1$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/z1$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf1/z1$b;

.field public static final enum b:Lf1/z1$b;

.field public static final enum c:Lf1/z1$b;

.field public static final enum d:Lf1/z1$b;

.field public static final enum e:Lf1/z1$b;

.field public static final synthetic f:[Lf1/z1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/z1$b;

    const-string v1, "NOT_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/z1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/z1$b;->a:Lf1/z1$b;

    new-instance v0, Lf1/z1$b;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf1/z1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/z1$b;->b:Lf1/z1$b;

    new-instance v0, Lf1/z1$b;

    const-string v1, "PENDING_RELEASE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf1/z1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/z1$b;->c:Lf1/z1$b;

    new-instance v0, Lf1/z1$b;

    const-string v1, "READY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf1/z1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/z1$b;->d:Lf1/z1$b;

    new-instance v0, Lf1/z1$b;

    const-string v1, "RELEASED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf1/z1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/z1$b;->e:Lf1/z1$b;

    invoke-static {}, Lf1/z1$b;->a()[Lf1/z1$b;

    move-result-object v0

    sput-object v0, Lf1/z1$b;->f:[Lf1/z1$b;

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

.method public static synthetic a()[Lf1/z1$b;
    .locals 5

    sget-object v0, Lf1/z1$b;->a:Lf1/z1$b;

    sget-object v1, Lf1/z1$b;->b:Lf1/z1$b;

    sget-object v2, Lf1/z1$b;->c:Lf1/z1$b;

    sget-object v3, Lf1/z1$b;->d:Lf1/z1$b;

    sget-object v4, Lf1/z1$b;->e:Lf1/z1$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lf1/z1$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/z1$b;
    .locals 1

    const-class v0, Lf1/z1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/z1$b;

    return-object p0
.end method

.method public static values()[Lf1/z1$b;
    .locals 1

    sget-object v0, Lf1/z1$b;->f:[Lf1/z1$b;

    invoke-virtual {v0}, [Lf1/z1$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/z1$b;

    return-object v0
.end method
