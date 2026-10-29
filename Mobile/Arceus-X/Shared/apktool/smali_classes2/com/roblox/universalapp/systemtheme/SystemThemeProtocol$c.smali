.class public final enum Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0082\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011j\u0002\u0008\tj\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
        "",
        "",
        "value",
        "",
        "themeName",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "",
        "d",
        "()Z",
        "a",
        "I",
        "c",
        "()I",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "e",
        "f",
        "g",
        "h",
        "universalapp_googleProdRelease"
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
.field public static final c:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final enum e:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final enum f:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final enum g:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final enum h:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final synthetic i:[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

.field public static final synthetic j:Lqt/a;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    const-string v1, "LIGHT"

    const/4 v2, 0x1

    const-string v3, "light"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->e:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    const-string v1, "DARK"

    const/4 v2, 0x2

    const-string v4, "dark"

    invoke-direct {v0, v1, v2, v2, v4}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->f:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    const-string v1, "SYSTEM_LIGHT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->g:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    const-string v1, "SYSTEM_DARK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2, v4}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->h:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->a()[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->i:[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->j:Lqt/a;

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->a:I

    iput-object p4, p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
    .locals 5

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->e:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    sget-object v2, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->f:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    sget-object v3, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->g:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    sget-object v4, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->h:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
    .locals 1

    const-class v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    return-object p0
.end method

.method public static values()[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->i:[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->a:I

    return v0
.end method

.method public final d()Z
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->g:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->h:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
