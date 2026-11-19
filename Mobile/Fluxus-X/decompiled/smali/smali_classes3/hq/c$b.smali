.class public final Lhq/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhq/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lhq/c$b;",
        "",
        "<init>",
        "()V",
        "Lf4/k0;",
        "fragmentManager",
        "",
        "viewId",
        "",
        "requestId",
        "Lfq/n1$c;",
        "props",
        "",
        "a",
        "(Lf4/k0;ILjava/lang/String;Lfq/n1$c;)V",
        "permissions_release"
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhq/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf4/k0;ILjava/lang/String;Lfq/n1$c;)V
    .locals 2
    .param p1    # Lf4/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lfq/n1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    new-instance v0, Lhq/c;

    invoke-direct {v0}, Lhq/c;-><init>()V

    new-instance v1, Lhq/c$c;

    invoke-direct {v1, p3, p4}, Lhq/c$c;-><init>(Ljava/lang/String;Lfq/n1$c;)V

    invoke-static {v0, v1}, Lyq/b;->a(Lyq/a;Landroid/os/Parcelable;)Lyq/a;

    move-result-object p3

    const-string p4, "Pi2PermissionRequestFragment"

    invoke-virtual {p1, p2, p3, p4}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p1}, Lf4/t0;->i()V

    return-void
.end method
