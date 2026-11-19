.class public interface abstract Lmv/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008f\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008J%\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lmv/o;",
        "",
        "Lmv/z;",
        "url",
        "",
        "Lmv/n;",
        "cookies",
        "",
        "a",
        "(Lmv/z;Ljava/util/List;)V",
        "b",
        "(Lmv/z;)Ljava/util/List;",
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
.field public static final a:Lmv/o$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lmv/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lmv/o$a;->a:Lmv/o$a;

    sput-object v0, Lmv/o;->a:Lmv/o$a;

    new-instance v0, Lmv/o$a$a;

    invoke-direct {v0}, Lmv/o$a$a;-><init>()V

    sput-object v0, Lmv/o;->b:Lmv/o;

    return-void
.end method


# virtual methods
.method public abstract a(Lmv/z;Ljava/util/List;)V
    .param p1    # Lmv/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/z;",
            "Ljava/util/List<",
            "Lmv/n;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Lmv/z;)Ljava/util/List;
    .param p1    # Lmv/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/z;",
            ")",
            "Ljava/util/List<",
            "Lmv/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
