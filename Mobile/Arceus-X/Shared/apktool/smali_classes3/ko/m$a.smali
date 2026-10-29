.class public final enum Lko/m$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lko/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lko/m$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lko/m$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "government-id_release"
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
.field public static final enum a:Lko/m$a;

.field public static final enum b:Lko/m$a;

.field public static final enum c:Lko/m$a;

.field public static final enum d:Lko/m$a;

.field public static final enum e:Lko/m$a;

.field public static final synthetic f:[Lko/m$a;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lko/m$a;

    const-string v1, "INITIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lko/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lko/m$a;->a:Lko/m$a;

    new-instance v0, Lko/m$a;

    const-string v1, "ENTRY_ANIMATING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lko/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lko/m$a;->b:Lko/m$a;

    new-instance v0, Lko/m$a;

    const-string v1, "IDLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lko/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lko/m$a;->c:Lko/m$a;

    new-instance v0, Lko/m$a;

    const-string v1, "TRANSITION_COLLAPSING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lko/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lko/m$a;->d:Lko/m$a;

    new-instance v0, Lko/m$a;

    const-string v1, "TRANSITION_EXPANDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lko/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lko/m$a;->e:Lko/m$a;

    invoke-static {}, Lko/m$a;->a()[Lko/m$a;

    move-result-object v0

    sput-object v0, Lko/m$a;->f:[Lko/m$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lko/m$a;->g:Lqt/a;

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

.method public static final synthetic a()[Lko/m$a;
    .locals 5

    sget-object v0, Lko/m$a;->a:Lko/m$a;

    sget-object v1, Lko/m$a;->b:Lko/m$a;

    sget-object v2, Lko/m$a;->c:Lko/m$a;

    sget-object v3, Lko/m$a;->d:Lko/m$a;

    sget-object v4, Lko/m$a;->e:Lko/m$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lko/m$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lko/m$a;
    .locals 1

    const-class v0, Lko/m$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lko/m$a;

    return-object p0
.end method

.method public static values()[Lko/m$a;
    .locals 1

    sget-object v0, Lko/m$a;->f:[Lko/m$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lko/m$a;

    return-object v0
.end method
