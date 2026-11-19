.class public interface abstract Lj0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Lj0/a;",
        "",
        "Ln0/o3;",
        "sessionConfig",
        "",
        "b",
        "(Ln0/o3;)Z",
        "a",
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
.field public static final a:Lj0/a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lj0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj0/a$b;->a:Lj0/a$b;

    sput-object v0, Lj0/a;->a:Lj0/a$b;

    new-instance v0, Lj0/a$a;

    invoke-direct {v0}, Lj0/a$a;-><init>()V

    sput-object v0, Lj0/a;->b:Lj0/a;

    return-void
.end method

.method public static a(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;
    .locals 1
    .param p0    # Ln0/i4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/util/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg0/k0;
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

    sget-object v0, Lj0/a;->a:Lj0/a$b;

    invoke-virtual {v0, p0, p1, p2}, Lj0/a$b;->a(Ln0/i4;Landroid/util/Size;Lg0/k0;)Ln0/o3$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Ln0/o3;)Z
    .param p1    # Ln0/o3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
