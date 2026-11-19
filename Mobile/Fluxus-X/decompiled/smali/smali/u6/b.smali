.class public interface abstract Lu6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/b$a;,
        Lu6/b$b;,
        Lu6/b$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u0000 \t2\u00020\u0001:\u0003\r\u000f\tJ(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ2\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"
    }
    d2 = {
        "Lu6/b;",
        "",
        "Lu6/q;",
        "cacheResponse",
        "Lu6/o;",
        "networkRequest",
        "Ly6/p;",
        "options",
        "Lu6/b$b;",
        "a",
        "(Lu6/q;Lu6/o;Ly6/p;Leu/b;)Ljava/lang/Object;",
        "networkResponse",
        "Lu6/b$c;",
        "b",
        "(Lu6/q;Lu6/o;Lu6/q;Ly6/p;Leu/b;)Ljava/lang/Object;",
        "c",
        "coil-network-core_release"
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
.field public static final a:Lu6/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lu6/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lu6/b$a;->a:Lu6/b$a;

    sput-object v0, Lu6/b;->a:Lu6/b$a;

    new-instance v0, Lv6/a;

    invoke-direct {v0}, Lv6/a;-><init>()V

    sput-object v0, Lu6/b;->b:Lu6/b;

    return-void
.end method


# virtual methods
.method public abstract a(Lu6/q;Lu6/o;Ly6/p;Leu/b;)Ljava/lang/Object;
    .param p1    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lu6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/q;",
            "Lu6/o;",
            "Ly6/p;",
            "Leu/b<",
            "-",
            "Lu6/b$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract b(Lu6/q;Lu6/o;Lu6/q;Ly6/p;Leu/b;)Ljava/lang/Object;
    .param p1    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lu6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/q;",
            "Lu6/o;",
            "Lu6/q;",
            "Ly6/p;",
            "Leu/b<",
            "-",
            "Lu6/b$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
