.class public final enum Lmv/e0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/e0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmv/e0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lmv/e0;",
        "",
        "",
        "protocol",
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
        "f",
        "g",
        "h",
        "i",
        "okhttp"
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
.field public static final b:Lmv/e0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lmv/e0;

.field public static final enum d:Lmv/e0;

.field public static final enum e:Lmv/e0;

.field public static final enum f:Lmv/e0;

.field public static final enum g:Lmv/e0;

.field public static final enum h:Lmv/e0;

.field public static final enum i:Lmv/e0;

.field public static final synthetic j:[Lmv/e0;

.field public static final synthetic k:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmv/e0;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->c:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    const-string v3, "HTTP_1_1"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->d:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x2

    const-string v2, "spdy/3.1"

    const-string v3, "SPDY_3"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->e:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x3

    const-string v2, "h2"

    const-string v3, "HTTP_2"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->f:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x4

    const-string v2, "h2_prior_knowledge"

    const-string v3, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->g:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x5

    const-string v2, "quic"

    const-string v3, "QUIC"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->h:Lmv/e0;

    new-instance v0, Lmv/e0;

    const/4 v1, 0x6

    const-string v2, "h3"

    const-string v3, "HTTP_3"

    invoke-direct {v0, v3, v1, v2}, Lmv/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/e0;->i:Lmv/e0;

    invoke-static {}, Lmv/e0;->a()[Lmv/e0;

    move-result-object v0

    sput-object v0, Lmv/e0;->j:[Lmv/e0;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lmv/e0;->k:Lhu/a;

    new-instance v0, Lmv/e0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmv/e0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmv/e0;->b:Lmv/e0$a;

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

    iput-object p3, p0, Lmv/e0;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lmv/e0;
    .locals 7

    sget-object v0, Lmv/e0;->c:Lmv/e0;

    sget-object v1, Lmv/e0;->d:Lmv/e0;

    sget-object v2, Lmv/e0;->e:Lmv/e0;

    sget-object v3, Lmv/e0;->f:Lmv/e0;

    sget-object v4, Lmv/e0;->g:Lmv/e0;

    sget-object v5, Lmv/e0;->h:Lmv/e0;

    sget-object v6, Lmv/e0;->i:Lmv/e0;

    filled-new-array/range {v0 .. v6}, [Lmv/e0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lmv/e0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lmv/e0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lmv/e0;
    .locals 1

    const-class v0, Lmv/e0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmv/e0;

    return-object p0
.end method

.method public static values()[Lmv/e0;
    .locals 1

    sget-object v0, Lmv/e0;->j:[Lmv/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmv/e0;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/e0;->a:Ljava/lang/String;

    return-object v0
.end method
