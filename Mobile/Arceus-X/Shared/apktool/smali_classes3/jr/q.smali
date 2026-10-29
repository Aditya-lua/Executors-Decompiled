.class public final enum Ljr/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljr/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ljr/q;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "ui-step-renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Ljr/q;

.field public static final enum b:Ljr/q;

.field public static final enum c:Ljr/q;

.field public static final synthetic d:[Ljr/q;

.field public static final synthetic e:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljr/q;

    const-string v1, "BASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljr/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljr/q;->a:Ljr/q;

    new-instance v0, Ljr/q;

    const-string v1, "ACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljr/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljr/q;->b:Ljr/q;

    new-instance v0, Ljr/q;

    const-string v1, "DISABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljr/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljr/q;->c:Ljr/q;

    invoke-static {}, Ljr/q;->a()[Ljr/q;

    move-result-object v0

    sput-object v0, Ljr/q;->d:[Ljr/q;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ljr/q;->e:Lqt/a;

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

.method public static final synthetic a()[Ljr/q;
    .locals 3

    sget-object v0, Ljr/q;->a:Ljr/q;

    sget-object v1, Ljr/q;->b:Ljr/q;

    sget-object v2, Ljr/q;->c:Ljr/q;

    filled-new-array {v0, v1, v2}, [Ljr/q;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljr/q;
    .locals 1

    const-class v0, Ljr/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljr/q;

    return-object p0
.end method

.method public static values()[Ljr/q;
    .locals 1

    sget-object v0, Ljr/q;->d:[Ljr/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljr/q;

    return-object v0
.end method
