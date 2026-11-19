.class public final Lj0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0001\u00a8\u0006\u000f"
    }
    d2 = {
        "Lj0/a$b;",
        "",
        "<init>",
        "()V",
        "Ln0/i4;",
        "Landroid/util/Size;",
        "resolution",
        "Lg0/k0;",
        "dynamicRange",
        "Ln0/o3$b;",
        "a",
        "(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;",
        "Lj0/a;",
        "NO_OP_FEATURE_COMBINATION_QUERY",
        "Lj0/a;",
        "camera-core_release"
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
.field public static final synthetic a:Lj0/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj0/a$b;

    invoke-direct {v0}, Lj0/a$b;-><init>()V

    sput-object v0, Lj0/a$b;->a:Lj0/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;
    .locals 2
    .param p1    # Ln0/i4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lg0/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Landroid/util/Size;",
            "Lg0/k0;",
            ")",
            "Ln0/o3$b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ln0/h2;->p()I

    move-result v0

    new-instance v1, Lj0/a$b$a;

    invoke-direct {v1, p2, v0}, Lj0/a$b$a;-><init>(Landroid/util/Size;I)V

    sget-object v0, Lj0/c;->c:Lj0/c$a;

    invoke-virtual {v0, p1}, Lj0/c$a;->c(Ln0/i4;)Lj0/c;

    move-result-object v0

    invoke-virtual {v0}, Lj0/c;->b()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Ln0/u1;->p(Ljava/lang/Class;)V

    :cond_0
    invoke-static {p1, p2}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object p1

    invoke-virtual {p1, v1, p3}, Ln0/o3$b;->m(Ln0/u1;Lg0/k0;)Ln0/o3$b;

    move-result-object p1

    const-string p2, "addSurface(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
