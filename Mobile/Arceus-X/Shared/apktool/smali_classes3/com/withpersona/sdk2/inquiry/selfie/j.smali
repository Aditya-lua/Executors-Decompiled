.class public interface abstract Lcom/withpersona/sdk2/inquiry/selfie/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008g\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/j;",
        "",
        "a",
        "selfie_release"
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
.field public static final a:Lcom/withpersona/sdk2/inquiry/selfie/j$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/j$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/j$a;

    sput-object v0, Lcom/withpersona/sdk2/inquiry/selfie/j;->a:Lcom/withpersona/sdk2/inquiry/selfie/j$a;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/selfie/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lzp/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            "Lzp/p0;",
            ")",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/j;->a:Lcom/withpersona/sdk2/inquiry/selfie/j$a;

    invoke-virtual {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/j$a;->a(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
