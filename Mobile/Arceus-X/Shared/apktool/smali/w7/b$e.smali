.class public final enum Lw7/b$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/b$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lw7/b$e;

.field public static final enum b:Lw7/b$e;

.field public static final enum c:Lw7/b$e;

.field public static final synthetic d:[Lw7/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lw7/b$e;

    const-string v1, "DESCENDANT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw7/b$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$e;->a:Lw7/b$e;

    new-instance v1, Lw7/b$e;

    const-string v2, "CHILD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lw7/b$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$e;->b:Lw7/b$e;

    new-instance v2, Lw7/b$e;

    const-string v3, "FOLLOWS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lw7/b$e;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lw7/b$e;->c:Lw7/b$e;

    filled-new-array {v0, v1, v2}, [Lw7/b$e;

    move-result-object v0

    sput-object v0, Lw7/b$e;->d:[Lw7/b$e;

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

.method public static valueOf(Ljava/lang/String;)Lw7/b$e;
    .locals 1

    const-class v0, Lw7/b$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/b$e;

    return-object p0
.end method

.method public static values()[Lw7/b$e;
    .locals 1

    sget-object v0, Lw7/b$e;->d:[Lw7/b$e;

    invoke-virtual {v0}, [Lw7/b$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/b$e;

    return-object v0
.end method
