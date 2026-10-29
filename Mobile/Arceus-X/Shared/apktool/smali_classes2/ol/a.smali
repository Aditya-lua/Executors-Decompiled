.class public final enum Lol/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lol/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lol/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lol/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Ljava/lang/String;",
        "b",
        "c",
        "d",
        "e",
        "theme"
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
.field public static final b:Lol/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lol/a;

.field public static final enum d:Lol/a;

.field public static final enum e:Lol/a;

.field public static final synthetic f:[Lol/a;

.field public static final synthetic g:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lol/a;

    const/4 v1, 0x0

    const-string v2, "Light"

    const-string v3, "LIGHT"

    invoke-direct {v0, v3, v1, v2}, Lol/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lol/a;->c:Lol/a;

    new-instance v0, Lol/a;

    const/4 v1, 0x1

    const-string v2, "Dark"

    const-string v3, "DARK"

    invoke-direct {v0, v3, v1, v2}, Lol/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lol/a;->d:Lol/a;

    new-instance v0, Lol/a;

    const/4 v1, 0x2

    const-string v2, "Classic"

    const-string v3, "CLASSIC"

    invoke-direct {v0, v3, v1, v2}, Lol/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lol/a;->e:Lol/a;

    invoke-static {}, Lol/a;->a()[Lol/a;

    move-result-object v0

    sput-object v0, Lol/a;->f:[Lol/a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lol/a;->g:Lqt/a;

    new-instance v0, Lol/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lol/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lol/a;->b:Lol/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lol/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lol/a;
    .locals 3

    sget-object v0, Lol/a;->c:Lol/a;

    sget-object v1, Lol/a;->d:Lol/a;

    sget-object v2, Lol/a;->e:Lol/a;

    filled-new-array {v0, v1, v2}, [Lol/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Lol/a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lol/a;->b:Lol/a$a;

    invoke-virtual {v0, p0}, Lol/a$a;->a(Ljava/lang/String;)Lol/a;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lol/a;
    .locals 1

    const-class v0, Lol/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lol/a;

    return-object p0
.end method

.method public static values()[Lol/a;
    .locals 1

    sget-object v0, Lol/a;->f:[Lol/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lol/a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lol/a;->a:Ljava/lang/String;

    return-object v0
.end method
