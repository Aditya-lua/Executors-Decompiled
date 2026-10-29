.class public interface abstract Lk6/j$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/j$c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00e6\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"
    }
    d2 = {
        "Lk6/j$c;",
        "",
        "Lx6/g;",
        "request",
        "Lk6/j;",
        "a",
        "(Lx6/g;)Lk6/j;",
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


# static fields
.field public static final a:Lk6/j$c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lk6/j$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk6/j$c$a;->a:Lk6/j$c$a;

    sput-object v0, Lk6/j$c;->a:Lk6/j$c$a;

    new-instance v0, Lk6/k;

    invoke-direct {v0}, Lk6/k;-><init>()V

    sput-object v0, Lk6/j$c;->b:Lk6/j$c;

    return-void
.end method

.method public static b(Lx6/g;)Lk6/j;
    .locals 0

    sget-object p0, Lk6/j;->b:Lk6/j;

    return-object p0
.end method

.method public static synthetic c(Lx6/g;)Lk6/j;
    .locals 0

    invoke-static {p0}, Lk6/j$c;->b(Lx6/g;)Lk6/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a(Lx6/g;)Lk6/j;
    .param p1    # Lx6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
