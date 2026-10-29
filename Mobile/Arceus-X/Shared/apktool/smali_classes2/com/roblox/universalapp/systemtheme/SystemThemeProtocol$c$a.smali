.class public final Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
        "a",
        "(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->values()[Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c()I

    move-result v4

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    return-object p1

    :cond_2
    return-object v3
.end method
