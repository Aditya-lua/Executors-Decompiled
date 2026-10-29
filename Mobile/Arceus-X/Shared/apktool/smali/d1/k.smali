.class public final Ld1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NullAnnotationGroup"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001 B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\n\u001a\u00020\t2\u0016\u0010\u0008\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Ld1/k;",
        "",
        "Ld1/g;",
        "lifecycleCameraProvider",
        "<init>",
        "(Ld1/g;)V",
        "",
        "Lg0/w2;",
        "useCases",
        "",
        "g",
        "([Lg0/w2;)V",
        "h",
        "()V",
        "Landroidx/lifecycle/s;",
        "lifecycleOwner",
        "Lg0/v;",
        "cameraSelector",
        "Lg0/x2;",
        "useCaseGroup",
        "Lg0/l;",
        "c",
        "(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;",
        "Lg0/t;",
        "d",
        "(Lg0/v;)Lg0/t;",
        "Landroid/content/Context;",
        "context",
        "Lne/x;",
        "Ljava/lang/Void;",
        "f",
        "(Landroid/content/Context;)Lne/x;",
        "a",
        "Ld1/g;",
        "b",
        "camera-lifecycle_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Ld1/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ld1/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ld1/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld1/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld1/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ld1/k;->b:Ld1/k$a;

    new-instance v0, Ld1/k;

    new-instance v1, Ld1/g;

    invoke-direct {v1}, Ld1/g;-><init>()V

    invoke-direct {v0, v1}, Ld1/k;-><init>(Ld1/g;)V

    sput-object v0, Ld1/k;->c:Ld1/k;

    return-void
.end method

.method public constructor <init>(Ld1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/k;->a:Ld1/g;

    return-void
.end method

.method public static final synthetic a()Ld1/k;
    .locals 1

    sget-object v0, Ld1/k;->c:Ld1/k;

    return-object v0
.end method

.method public static final synthetic b(Ld1/k;Landroid/content/Context;)Lne/x;
    .locals 0

    invoke-virtual {p0, p1}, Ld1/k;->f(Landroid/content/Context;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroid/content/Context;)Lne/x;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Ld1/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ld1/k;->b:Ld1/k$a;

    invoke-virtual {v0, p0}, Ld1/k$a;->c(Landroid/content/Context;)Lne/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg0/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lg0/x2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraSelector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "useCaseGroup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/k;->a:Ld1/g;

    invoke-virtual {v0, p1, p2, p3}, Ld1/g;->m(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;

    move-result-object p1

    return-object p1
.end method

.method public d(Lg0/v;)Lg0/t;
    .locals 1
    .param p1    # Lg0/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "cameraSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/k;->a:Ld1/g;

    invoke-virtual {v0, p1}, Ld1/g;->r(Lg0/v;)Lg0/t;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/content/Context;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/k;->a:Ld1/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ld1/g;->u(Landroid/content/Context;Lg0/g0;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public final varargs g([Lg0/w2;)V
    .locals 2
    .param p1    # [Lg0/w2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "useCases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/k;->a:Ld1/g;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lg0/w2;

    invoke-virtual {v0, p1}, Ld1/g;->D([Lg0/w2;)V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Ld1/k;->a:Ld1/g;

    invoke-virtual {v0}, Ld1/g;->E()V

    return-void
.end method
