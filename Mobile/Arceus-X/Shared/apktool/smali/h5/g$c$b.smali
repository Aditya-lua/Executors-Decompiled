.class public final enum Lh5/g$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh5/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh5/g$c$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lh5/g$c$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "sqlite-framework"
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
.field public static final enum a:Lh5/g$c$b;

.field public static final enum b:Lh5/g$c$b;

.field public static final enum c:Lh5/g$c$b;

.field public static final enum d:Lh5/g$c$b;

.field public static final enum e:Lh5/g$c$b;

.field public static final synthetic f:[Lh5/g$c$b;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh5/g$c$b;

    const-string v1, "ON_CONFIGURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh5/g$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/g$c$b;->a:Lh5/g$c$b;

    new-instance v0, Lh5/g$c$b;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh5/g$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/g$c$b;->b:Lh5/g$c$b;

    new-instance v0, Lh5/g$c$b;

    const-string v1, "ON_UPGRADE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh5/g$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/g$c$b;->c:Lh5/g$c$b;

    new-instance v0, Lh5/g$c$b;

    const-string v1, "ON_DOWNGRADE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lh5/g$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/g$c$b;->d:Lh5/g$c$b;

    new-instance v0, Lh5/g$c$b;

    const-string v1, "ON_OPEN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lh5/g$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/g$c$b;->e:Lh5/g$c$b;

    invoke-static {}, Lh5/g$c$b;->a()[Lh5/g$c$b;

    move-result-object v0

    sput-object v0, Lh5/g$c$b;->f:[Lh5/g$c$b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lh5/g$c$b;->g:Lqt/a;

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

.method public static final synthetic a()[Lh5/g$c$b;
    .locals 5

    sget-object v0, Lh5/g$c$b;->a:Lh5/g$c$b;

    sget-object v1, Lh5/g$c$b;->b:Lh5/g$c$b;

    sget-object v2, Lh5/g$c$b;->c:Lh5/g$c$b;

    sget-object v3, Lh5/g$c$b;->d:Lh5/g$c$b;

    sget-object v4, Lh5/g$c$b;->e:Lh5/g$c$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lh5/g$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh5/g$c$b;
    .locals 1

    const-class v0, Lh5/g$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh5/g$c$b;

    return-object p0
.end method

.method public static values()[Lh5/g$c$b;
    .locals 1

    sget-object v0, Lh5/g$c$b;->f:[Lh5/g$c$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh5/g$c$b;

    return-object v0
.end method
