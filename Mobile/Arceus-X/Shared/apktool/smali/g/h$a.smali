.class public final Lg/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lg/h$a;",
        "",
        "<init>",
        "()V",
        "Lh/f$h;",
        "mediaType",
        "d",
        "(Lh/f$h;)Lg/h$a;",
        "",
        "maxItems",
        "c",
        "(I)Lg/h$a;",
        "",
        "isOrderedSelection",
        "e",
        "(Z)Lg/h$a;",
        "Lh/f$b;",
        "defaultTab",
        "b",
        "(Lh/f$b;)Lg/h$a;",
        "Lg/h;",
        "a",
        "()Lg/h;",
        "Lh/f$h;",
        "I",
        "Z",
        "Lh/f$b;",
        "isCustomAccentColorApplied",
        "",
        "f",
        "J",
        "accentColor",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lh/f$h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:Z

.field public d:Lh/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Z

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh/f$c;->a:Lh/f$c;

    iput-object v0, p0, Lg/h$a;->a:Lh/f$h;

    sget-object v0, Lh/e;->b:Lh/e$a;

    invoke-virtual {v0}, Lh/e$a;->a()I

    move-result v0

    iput v0, p0, Lg/h$a;->b:I

    sget-object v0, Lh/f$b$a;->a:Lh/f$b$a;

    iput-object v0, p0, Lg/h$a;->d:Lh/f$b;

    return-void
.end method


# virtual methods
.method public final a()Lg/h;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lg/h;

    invoke-direct {v0}, Lg/h;-><init>()V

    iget-object v1, p0, Lg/h$a;->a:Lh/f$h;

    invoke-virtual {v0, v1}, Lg/h;->m(Lh/f$h;)V

    iget v1, p0, Lg/h$a;->b:I

    invoke-virtual {v0, v1}, Lg/h;->k(I)V

    iget-boolean v1, p0, Lg/h$a;->c:Z

    invoke-virtual {v0, v1}, Lg/h;->n(Z)V

    iget-object v1, p0, Lg/h$a;->d:Lh/f$b;

    invoke-virtual {v0, v1}, Lg/h;->j(Lh/f$b;)V

    iget-boolean v1, p0, Lg/h$a;->e:Z

    invoke-virtual {v0, v1}, Lg/h;->i(Z)V

    iget-wide v1, p0, Lg/h$a;->f:J

    invoke-virtual {v0, v1, v2}, Lg/h;->h(J)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg/h;->l(Lh/f$e;)V

    return-object v0
.end method

.method public final b(Lh/f$b;)Lg/h$a;
    .locals 1
    .param p1    # Lh/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "defaultTab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/h$a;->d:Lh/f$b;

    return-object p0
.end method

.method public final c(I)Lg/h$a;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput p1, p0, Lg/h$a;->b:I

    return-object p0
.end method

.method public final d(Lh/f$h;)Lg/h$a;
    .locals 1
    .param p1    # Lh/f$h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "mediaType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/h$a;->a:Lh/f$h;

    return-object p0
.end method

.method public final e(Z)Lg/h$a;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-boolean p1, p0, Lg/h$a;->c:Z

    return-object p0
.end method
