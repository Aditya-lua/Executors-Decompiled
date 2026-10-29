.class public final enum Lx4/u$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx4/u$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\u0006j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lx4/u$d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Landroid/content/Context;",
        "context",
        "b",
        "(Landroid/content/Context;)Lx4/u$d;",
        "a",
        "c",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lx4/u$d;

.field public static final enum b:Lx4/u$d;

.field public static final enum c:Lx4/u$d;

.field public static final synthetic d:[Lx4/u$d;

.field public static final synthetic e:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx4/u$d;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx4/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx4/u$d;->a:Lx4/u$d;

    new-instance v0, Lx4/u$d;

    const-string v1, "TRUNCATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lx4/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx4/u$d;->b:Lx4/u$d;

    new-instance v0, Lx4/u$d;

    const-string v1, "WRITE_AHEAD_LOGGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lx4/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx4/u$d;->c:Lx4/u$d;

    invoke-static {}, Lx4/u$d;->a()[Lx4/u$d;

    move-result-object v0

    sput-object v0, Lx4/u$d;->d:[Lx4/u$d;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lx4/u$d;->e:Lqt/a;

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

.method public static final synthetic a()[Lx4/u$d;
    .locals 3

    sget-object v0, Lx4/u$d;->a:Lx4/u$d;

    sget-object v1, Lx4/u$d;->b:Lx4/u$d;

    sget-object v2, Lx4/u$d;->c:Lx4/u$d;

    filled-new-array {v0, v1, v2}, [Lx4/u$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx4/u$d;
    .locals 1

    const-class v0, Lx4/u$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx4/u$d;

    return-object p0
.end method

.method public static values()[Lx4/u$d;
    .locals 1

    sget-object v0, Lx4/u$d;->d:[Lx4/u$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx4/u$d;

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lx4/u$d;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx4/u$d;->a:Lx4/u$d;

    if-eq p0, v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/ActivityManager;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/ActivityManager;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lx4/u$d;->c:Lx4/u$d;

    return-object p1

    :cond_2
    sget-object p1, Lx4/u$d;->b:Lx4/u$d;

    return-object p1
.end method
