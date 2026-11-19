.class public final Lh3/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh3/c$a;",
        "",
        "<init>",
        "()V",
        "T",
        "Lg3/e;",
        "domError",
        "",
        "msg",
        "t",
        "b",
        "(Lg3/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;",
        "SEPARATOR",
        "Ljava/lang/String;",
        "credentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh3/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lh3/c$a;Lg3/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lh3/c$a;->b(Lg3/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lg3/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lg3/e;",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    instance-of v0, p3, Lh3/a;

    if-eqz v0, :cond_0

    new-instance p3, Lh3/a;

    invoke-direct {p3, p1, p2}, Lh3/a;-><init>(Lg3/e;Ljava/lang/CharSequence;)V

    return-object p3

    :cond_0
    instance-of p3, p3, Lh3/d;

    if-eqz p3, :cond_1

    new-instance p3, Lh3/d;

    invoke-direct {p3, p1, p2}, Lh3/d;-><init>(Lg3/e;Ljava/lang/CharSequence;)V

    return-object p3

    :cond_1
    new-instance p1, Lj3/c;

    invoke-direct {p1}, Lj3/c;-><init>()V

    throw p1
.end method
