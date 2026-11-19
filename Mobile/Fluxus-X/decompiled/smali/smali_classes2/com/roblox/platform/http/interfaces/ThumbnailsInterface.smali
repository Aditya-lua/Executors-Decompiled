.class public interface abstract Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ=\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a2\u0006\u0004\u0008\n\u0010\u000bJ8\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;",
        "",
        "",
        "userIds",
        "size",
        "format",
        "",
        "isCircular",
        "Lsw/d;",
        "Lql/b;",
        "getAvatarHeadshotCall",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lsw/d;",
        "getAvatarHeadshot",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;",
        "Companion",
        "a",
        "robloxplatform_googleProdRelease"
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
.field public static final Companion:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final FORMAT_PNG:Ljava/lang/String; = "Png"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final HEADSHOT_SIZE_150X150:Ljava/lang/String; = "150x150"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;->a:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;

    sput-object v0, Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;->Companion:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;

    return-void
.end method


# virtual methods
.method public abstract getAvatarHeadshot(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "userIds"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "size"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "format"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lvw/t;
            value = "isCircular"
        .end annotation
    .end param
    .param p5    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Leu/b<",
            "-",
            "Lql/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lvw/f;
        value = "v1/users/avatar-headshot"
    .end annotation
.end method

.method public abstract getAvatarHeadshotCall(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lsw/d;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "userIds"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "size"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "format"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lvw/t;
            value = "isCircular"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lsw/d<",
            "Lql/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/f;
        value = "v1/users/avatar-headshot"
    .end annotation
.end method
