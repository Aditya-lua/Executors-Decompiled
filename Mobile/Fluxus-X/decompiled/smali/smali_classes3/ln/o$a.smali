.class public final Lln/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u0012\u0004\u0008\u000f\u0010\u0003\u00a8\u0006\u0011"
    }
    d2 = {
        "Lln/o$a;",
        "",
        "<init>",
        "()V",
        "",
        "delayMs",
        "",
        "key",
        "Lln/o;",
        "",
        "a",
        "(JLjava/lang/String;)Lln/o;",
        "Lxu/m;",
        "b",
        "Lxu/m;",
        "getTYPE_OF_NOTHING$annotations",
        "TYPE_OF_NOTHING",
        "wf1-workflow-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:Lln/o$a;

.field public static final b:Lxu/m;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lln/o$a;

    invoke-direct {v0}, Lln/o$a;-><init>()V

    sput-object v0, Lln/o$a;->a:Lln/o$a;

    const-class v0, Ljava/lang/Void;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lxu/m;

    move-result-object v0

    sput-object v0, Lln/o$a;->b:Lxu/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lln/o$a;JLjava/lang/String;ILjava/lang/Object;)Lln/o;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lln/o$a;->a(JLjava/lang/String;)Lln/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JLjava/lang/String;)Lln/o;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Lln/o<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lln/l;

    invoke-direct {v0, p1, p2, p3}, Lln/l;-><init>(JLjava/lang/String;)V

    return-object v0
.end method
