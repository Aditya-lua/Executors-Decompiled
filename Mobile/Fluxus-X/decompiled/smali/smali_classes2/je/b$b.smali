.class public final enum Lje/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lje/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lje/b$b;

.field public static final enum b:Lje/b$b;

.field public static final enum c:Lje/b$b;

.field public static final enum d:Lje/b$b;

.field public static final synthetic e:[Lje/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lje/b$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lje/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/b$b;->a:Lje/b$b;

    new-instance v0, Lje/b$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lje/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/b$b;->b:Lje/b$b;

    new-instance v0, Lje/b$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lje/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/b$b;->c:Lje/b$b;

    new-instance v0, Lje/b$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lje/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/b$b;->d:Lje/b$b;

    invoke-static {}, Lje/b$b;->a()[Lje/b$b;

    move-result-object v0

    sput-object v0, Lje/b$b;->e:[Lje/b$b;

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

.method public static synthetic a()[Lje/b$b;
    .locals 4

    sget-object v0, Lje/b$b;->a:Lje/b$b;

    sget-object v1, Lje/b$b;->b:Lje/b$b;

    sget-object v2, Lje/b$b;->c:Lje/b$b;

    sget-object v3, Lje/b$b;->d:Lje/b$b;

    filled-new-array {v0, v1, v2, v3}, [Lje/b$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lje/b$b;
    .locals 1

    const-class v0, Lje/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lje/b$b;

    return-object p0
.end method

.method public static values()[Lje/b$b;
    .locals 1

    sget-object v0, Lje/b$b;->e:[Lje/b$b;

    invoke-virtual {v0}, [Lje/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lje/b$b;

    return-object v0
.end method
