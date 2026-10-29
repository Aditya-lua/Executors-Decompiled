.class public final Lfm/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfm/f;",
        "",
        "Lj/b;",
        "activity",
        "<init>",
        "(Lj/b;)V",
        "",
        "nonce",
        "Lnu/h;",
        "Lfm/g;",
        "c",
        "(Ljava/lang/String;)Lnu/h;",
        "a",
        "Lj/b;",
        "e",
        "()Lj/b;",
        "Le3/o;",
        "b",
        "Ljt/h;",
        "f",
        "()Le3/o;",
        "credentialManager",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lj/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/b;)V
    .locals 1
    .param p1    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/f;->a:Lj/b;

    new-instance p1, Lfm/e;

    invoke-direct {p1, p0}, Lfm/e;-><init>(Lfm/f;)V

    invoke-static {p1}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p1

    iput-object p1, p0, Lfm/f;->b:Ljt/h;

    return-void
.end method

.method public static synthetic a(Lfm/f;)Le3/o;
    .locals 0

    invoke-static {p0}, Lfm/f;->d(Lfm/f;)Le3/o;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lfm/f;)Le3/o;
    .locals 0

    invoke-virtual {p0}, Lfm/f;->f()Le3/o;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lfm/f;)Le3/o;
    .locals 1

    sget-object v0, Le3/o;->a:Le3/o$a;

    iget-object p0, p0, Lfm/f;->a:Lj/b;

    invoke-virtual {v0, p0}, Le3/o$a;->a(Landroid/content/Context;)Le3/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lnu/h;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnu/h<",
            "Lfm/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "nonce"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfm/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lfm/f$a;-><init>(Lfm/f;Ljava/lang/String;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object p1

    return-object p1
.end method

.method public final e()Lj/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lfm/f;->a:Lj/b;

    return-object v0
.end method

.method public final f()Le3/o;
    .locals 1

    iget-object v0, p0, Lfm/f;->b:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/o;

    return-object v0
.end method
