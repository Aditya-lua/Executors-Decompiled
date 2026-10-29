.class public final Ld7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld7/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ld7/c$a;",
        "Ld7/d$a;",
        "<init>",
        "()V",
        "Ld7/e;",
        "target",
        "Lx6/k;",
        "result",
        "Ld7/d;",
        "a",
        "(Ld7/e;Lx6/k;)Ld7/d;",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld7/e;Lx6/k;)Ld7/d;
    .locals 1
    .param p1    # Ld7/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ld7/c;

    invoke-direct {v0, p1, p2}, Ld7/c;-><init>(Ld7/e;Lx6/k;)V

    return-object v0
.end method
