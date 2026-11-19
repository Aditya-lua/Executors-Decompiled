.class public final enum Lmv/k0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/k0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmv/k0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmv/k0;",
        "",
        "",
        "javaName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "c",
        "d",
        "e",
        "f",
        "g",
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
.field public static final b:Lmv/k0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum c:Lmv/k0;

.field public static final enum d:Lmv/k0;

.field public static final enum e:Lmv/k0;

.field public static final enum f:Lmv/k0;

.field public static final enum g:Lmv/k0;

.field public static final synthetic h:[Lmv/k0;

.field public static final synthetic i:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmv/k0;

    const/4 v1, 0x0

    const-string v2, "TLSv1.3"

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v3, v1, v2}, Lmv/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/k0;->c:Lmv/k0;

    new-instance v0, Lmv/k0;

    const/4 v1, 0x1

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    invoke-direct {v0, v3, v1, v2}, Lmv/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/k0;->d:Lmv/k0;

    new-instance v0, Lmv/k0;

    const/4 v1, 0x2

    const-string v2, "TLSv1.1"

    const-string v3, "TLS_1_1"

    invoke-direct {v0, v3, v1, v2}, Lmv/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/k0;->e:Lmv/k0;

    new-instance v0, Lmv/k0;

    const/4 v1, 0x3

    const-string v2, "TLSv1"

    const-string v3, "TLS_1_0"

    invoke-direct {v0, v3, v1, v2}, Lmv/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/k0;->f:Lmv/k0;

    new-instance v0, Lmv/k0;

    const/4 v1, 0x4

    const-string v2, "SSLv3"

    const-string v3, "SSL_3_0"

    invoke-direct {v0, v3, v1, v2}, Lmv/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmv/k0;->g:Lmv/k0;

    invoke-static {}, Lmv/k0;->a()[Lmv/k0;

    move-result-object v0

    sput-object v0, Lmv/k0;->h:[Lmv/k0;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lmv/k0;->i:Lhu/a;

    new-instance v0, Lmv/k0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmv/k0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmv/k0;->b:Lmv/k0$a;

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

    iput-object p3, p0, Lmv/k0;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lmv/k0;
    .locals 5

    sget-object v0, Lmv/k0;->c:Lmv/k0;

    sget-object v1, Lmv/k0;->d:Lmv/k0;

    sget-object v2, Lmv/k0;->e:Lmv/k0;

    sget-object v3, Lmv/k0;->f:Lmv/k0;

    sget-object v4, Lmv/k0;->g:Lmv/k0;

    filled-new-array {v0, v1, v2, v3, v4}, [Lmv/k0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmv/k0;
    .locals 1

    const-class v0, Lmv/k0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmv/k0;

    return-object p0
.end method

.method public static values()[Lmv/k0;
    .locals 1

    sget-object v0, Lmv/k0;->h:[Lmv/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmv/k0;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/k0;->a:Ljava/lang/String;

    return-object v0
.end method
