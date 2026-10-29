.class public final Ly5/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly5/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ly5/z$a;",
        "",
        "<init>",
        "()V",
        "",
        "synchronized",
        "Ly5/z;",
        "b",
        "(Z)Ly5/z;",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:Ly5/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly5/z$a;

    invoke-direct {v0}, Ly5/z$a;-><init>()V

    sput-object v0, Ly5/z$a;->a:Ly5/z$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Ly5/z$a;ZILjava/lang/Object;)Ly5/z;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Ly5/z$a;->b(Z)Ly5/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ly5/z;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Ly5/z$a;->c(Ly5/z$a;ZILjava/lang/Object;)Ly5/z;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)Ly5/z;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ly5/a0;

    invoke-direct {v0}, Ly5/a0;-><init>()V

    if-eqz p1, :cond_0

    new-instance p1, Ly5/b0;

    invoke-direct {p1, v0}, Ly5/b0;-><init>(Ly5/z;)V

    return-object p1

    :cond_0
    return-object v0
.end method
