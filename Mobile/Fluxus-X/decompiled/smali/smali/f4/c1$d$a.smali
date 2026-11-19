.class public final enum Lf4/c1$d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/c1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf4/c1$d$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0080\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lf4/c1$d$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lf4/c1$d$a;

.field public static final enum b:Lf4/c1$d$a;

.field public static final enum c:Lf4/c1$d$a;

.field public static final synthetic d:[Lf4/c1$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf4/c1$d$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf4/c1$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c1$d$a;->a:Lf4/c1$d$a;

    new-instance v0, Lf4/c1$d$a;

    const-string v1, "ADDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf4/c1$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c1$d$a;->b:Lf4/c1$d$a;

    new-instance v0, Lf4/c1$d$a;

    const-string v1, "REMOVING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf4/c1$d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf4/c1$d$a;->c:Lf4/c1$d$a;

    invoke-static {}, Lf4/c1$d$a;->a()[Lf4/c1$d$a;

    move-result-object v0

    sput-object v0, Lf4/c1$d$a;->d:[Lf4/c1$d$a;

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

.method public static final synthetic a()[Lf4/c1$d$a;
    .locals 3

    sget-object v0, Lf4/c1$d$a;->a:Lf4/c1$d$a;

    sget-object v1, Lf4/c1$d$a;->b:Lf4/c1$d$a;

    sget-object v2, Lf4/c1$d$a;->c:Lf4/c1$d$a;

    filled-new-array {v0, v1, v2}, [Lf4/c1$d$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf4/c1$d$a;
    .locals 1

    const-class v0, Lf4/c1$d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf4/c1$d$a;

    return-object p0
.end method

.method public static values()[Lf4/c1$d$a;
    .locals 1

    sget-object v0, Lf4/c1$d$a;->d:[Lf4/c1$d$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf4/c1$d$a;

    return-object v0
.end method
