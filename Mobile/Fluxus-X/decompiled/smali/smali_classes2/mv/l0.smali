.class public interface abstract Lmv/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/l0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004\u00c0\u0006\u0003"
    }
    d2 = {
        "Lmv/l0;",
        "",
        "a",
        "b",
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
.field public static final a:Lmv/l0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lmv/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lmv/l0$b;->a:Lmv/l0$b;

    sput-object v0, Lmv/l0;->a:Lmv/l0$b;

    new-instance v0, Lmv/l0$a;

    invoke-direct {v0}, Lmv/l0$a;-><init>()V

    sput-object v0, Lmv/l0;->b:Lmv/l0;

    return-void
.end method
