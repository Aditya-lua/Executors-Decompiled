.class public final Lgp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgp/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/k<",
        "Lvo/y3$h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lgp/k;",
        "Lnn/k;",
        "Lvo/y3$h;",
        "Lap/h;",
        "binding",
        "<init>",
        "(Lap/h;)V",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "b",
        "(Lvo/y3$h;Lnn/z;)V",
        "Lap/h;",
        "c",
        "a",
        "government-id_release"
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
.field public static final c:Lgp/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lap/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgp/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgp/k;->c:Lgp/k$a;

    return-void
.end method

.method public constructor <init>(Lap/h;)V
    .locals 1
    .param p1    # Lap/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/k;->b:Lap/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;)V
    .locals 0

    check-cast p1, Lvo/y3$h;

    invoke-virtual {p0, p1, p2}, Lgp/k;->b(Lvo/y3$h;Lnn/z;)V

    return-void
.end method

.method public b(Lvo/y3$h;Lnn/z;)V
    .locals 1
    .param p1    # Lvo/y3$h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewEnvironment"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
