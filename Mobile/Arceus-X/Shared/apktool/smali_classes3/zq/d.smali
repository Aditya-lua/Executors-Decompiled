.class public final enum Lzq/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzq/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0008\u001a\u0004\u0008\u000b\u0010\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lzq/d;",
        "",
        "",
        "key",
        "message",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "c",
        "d",
        "e",
        "f",
        "g",
        "sna_release"
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
.field public static final enum c:Lzq/d;

.field public static final enum d:Lzq/d;

.field public static final enum e:Lzq/d;

.field public static final enum f:Lzq/d;

.field public static final enum g:Lzq/d;

.field public static final synthetic h:[Lzq/d;

.field public static final synthetic i:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lzq/d;

    const-string v1, "integration_error"

    const-string v2, "Silent Network Authentication implementation is not available. Please ensure sna-impl module is included."

    const-string v3, "IntegrationError"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lzq/d;->c:Lzq/d;

    new-instance v0, Lzq/d;

    const-string v1, "invalid_check_url"

    const-string v2, "Silent Network Authentication check_url is missing or invalid."

    const-string v3, "InvalidCheckUrlError"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lzq/d;->d:Lzq/d;

    new-instance v5, Lzq/d;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v6, "ParsingError"

    const/4 v7, 0x2

    const-string v8, "parsing_error"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lzq/d;->e:Lzq/d;

    new-instance v6, Lzq/d;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v7, "UnknownError"

    const/4 v8, 0x3

    const-string v9, "unknown_error"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lzq/d;->f:Lzq/d;

    new-instance v7, Lzq/d;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const-string v8, "TimeoutError"

    const/4 v9, 0x4

    const-string v10, "timeout_error"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lzq/d;->g:Lzq/d;

    invoke-static {}, Lzq/d;->a()[Lzq/d;

    move-result-object v0

    sput-object v0, Lzq/d;->h:[Lzq/d;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lzq/d;->i:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lzq/d;->a:Ljava/lang/String;

    iput-object p4, p0, Lzq/d;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 2
    const-string p4, ""

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lzq/d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a()[Lzq/d;
    .locals 5

    sget-object v0, Lzq/d;->c:Lzq/d;

    sget-object v1, Lzq/d;->d:Lzq/d;

    sget-object v2, Lzq/d;->e:Lzq/d;

    sget-object v3, Lzq/d;->f:Lzq/d;

    sget-object v4, Lzq/d;->g:Lzq/d;

    filled-new-array {v0, v1, v2, v3, v4}, [Lzq/d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzq/d;
    .locals 1

    const-class v0, Lzq/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzq/d;

    return-object p0
.end method

.method public static values()[Lzq/d;
    .locals 1

    sget-object v0, Lzq/d;->h:[Lzq/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzq/d;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzq/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lzq/d;->b:Ljava/lang/String;

    return-object v0
.end method
