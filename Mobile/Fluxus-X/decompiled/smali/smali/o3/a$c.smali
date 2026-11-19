.class public final Lo3/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lo3/a$c;",
        "",
        "<init>",
        "()V",
        "",
        "type",
        "Landroid/content/Intent;",
        "intent",
        "Le3/c;",
        "b",
        "(Ljava/lang/String;Landroid/content/Intent;)Le3/c;",
        "Le3/l0;",
        "d",
        "(Landroid/content/Intent;)Le3/l0;",
        "Lf3/n;",
        "c",
        "(Landroid/content/Intent;)Lf3/n;",
        "Lf3/f;",
        "a",
        "(Landroid/content/Intent;)Lf3/f;",
        "TAG",
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
    invoke-direct {p0}, Lo3/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Lf3/f;
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, Lo3/a$b;->a:Lo3/a$b$a;

    invoke-virtual {v0, p1}, Lo3/a$b$a;->a(Landroid/content/Intent;)Lf3/f;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lo3/a$a;->a:Lo3/a$a$a;

    invoke-virtual {v0, p1}, Lo3/a$a$a;->a(Landroid/content/Intent;)Lf3/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Landroid/content/Intent;)Le3/c;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, Lo3/a$b;->a:Lo3/a$b$a;

    invoke-virtual {v0, p1, p2}, Lo3/a$b$a;->b(Ljava/lang/String;Landroid/content/Intent;)Le3/c;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lo3/a$a;->a:Lo3/a$a$a;

    invoke-virtual {p1, p2}, Lo3/a$a$a;->b(Landroid/content/Intent;)Le3/c;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroid/content/Intent;)Lf3/n;
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, Lo3/a$b;->a:Lo3/a$b$a;

    invoke-virtual {v0, p1}, Lo3/a$b$a;->c(Landroid/content/Intent;)Lf3/n;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lo3/a$a;->a:Lo3/a$a$a;

    invoke-virtual {v0, p1}, Lo3/a$a$a;->c(Landroid/content/Intent;)Lf3/n;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroid/content/Intent;)Le3/l0;
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, Lo3/a$b;->a:Lo3/a$b$a;

    invoke-virtual {v0, p1}, Lo3/a$b$a;->d(Landroid/content/Intent;)Le3/l0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lo3/a$a;->a:Lo3/a$a$a;

    invoke-virtual {v0, p1}, Lo3/a$a$a;->d(Landroid/content/Intent;)Le3/l0;

    move-result-object p1

    return-object p1
.end method
