.class public final Lan/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroid/os/Parcelable;",
        "Lym/i;",
        "a",
        "(Landroid/os/Parcelable;)Lym/i;",
        "wf1-core-android"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/os/Parcelable;)Lym/i;
    .locals 2
    .param p0    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lym/i;->c:Lym/i$a;

    new-instance v1, Lan/q$a;

    invoke-direct {v1, p0}, Lan/q$a;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1}, Lym/i$a;->c(Lkotlin/jvm/functions/Function1;)Lym/i;

    move-result-object p0

    return-object p0
.end method
