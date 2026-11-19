.class public final enum Lke/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lke/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lke/b$b;

.field public static final enum b:Lke/b$b;

.field public static final enum c:Lke/b$b;

.field public static final enum d:Lke/b$b;

.field public static final synthetic e:[Lke/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/b$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b$b;->a:Lke/b$b;

    new-instance v0, Lke/b$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lke/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b$b;->b:Lke/b$b;

    new-instance v0, Lke/b$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lke/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b$b;->c:Lke/b$b;

    new-instance v0, Lke/b$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lke/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b$b;->d:Lke/b$b;

    invoke-static {}, Lke/b$b;->a()[Lke/b$b;

    move-result-object v0

    sput-object v0, Lke/b$b;->e:[Lke/b$b;

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

.method public static synthetic a()[Lke/b$b;
    .locals 4

    sget-object v0, Lke/b$b;->a:Lke/b$b;

    sget-object v1, Lke/b$b;->b:Lke/b$b;

    sget-object v2, Lke/b$b;->c:Lke/b$b;

    sget-object v3, Lke/b$b;->d:Lke/b$b;

    filled-new-array {v0, v1, v2, v3}, [Lke/b$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lke/b$b;
    .locals 1

    const-class v0, Lke/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lke/b$b;

    return-object p0
.end method

.method public static values()[Lke/b$b;
    .locals 1

    sget-object v0, Lke/b$b;->e:[Lke/b$b;

    invoke-virtual {v0}, [Lke/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lke/b$b;

    return-object v0
.end method
