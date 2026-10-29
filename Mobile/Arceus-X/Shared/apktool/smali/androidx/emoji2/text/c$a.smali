.class public final Landroidx/emoji2/text/c$a;
.super Landroidx/emoji2/text/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public volatile b:Landroidx/emoji2/text/d;

.field public volatile c:Landroidx/emoji2/text/f;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/c;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/emoji2/text/c$b;-><init>(Landroidx/emoji2/text/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    new-instance v0, Landroidx/emoji2/text/c$a$a;

    invoke-direct {v0, p0}, Landroidx/emoji2/text/c$a$a;-><init>(Landroidx/emoji2/text/c$a;)V

    iget-object v1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    iget-object v1, v1, Landroidx/emoji2/text/c;->f:Landroidx/emoji2/text/c$h;

    invoke-interface {v1, v0}, Landroidx/emoji2/text/c$h;->a(Landroidx/emoji2/text/c$i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    invoke-virtual {v1, v0}, Landroidx/emoji2/text/c;->n(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;
    .locals 6
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/c$a;->b:Landroidx/emoji2/text/d;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/emoji2/text/d;->h(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/inputmethod/EditorInfo;)V
    .locals 3
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/emoji2/text/c$a;->c:Landroidx/emoji2/text/f;

    invoke-virtual {v1}, Landroidx/emoji2/text/f;->e()I

    move-result v1

    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    iget-boolean v0, v0, Landroidx/emoji2/text/c;->h:Z

    const-string v1, "android.support.text.emoji.emojiCompat_replaceAll"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public d(Landroidx/emoji2/text/f;)V
    .locals 9
    .param p1    # Landroidx/emoji2/text/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "metadataRepo cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/emoji2/text/c;->n(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/emoji2/text/c$a;->c:Landroidx/emoji2/text/f;

    new-instance v2, Landroidx/emoji2/text/d;

    iget-object v3, p0, Landroidx/emoji2/text/c$a;->c:Landroidx/emoji2/text/f;

    iget-object p1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    invoke-static {p1}, Landroidx/emoji2/text/c;->a(Landroidx/emoji2/text/c;)Landroidx/emoji2/text/c$j;

    move-result-object v4

    iget-object p1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    invoke-static {p1}, Landroidx/emoji2/text/c;->b(Landroidx/emoji2/text/c;)Landroidx/emoji2/text/c$e;

    move-result-object v5

    iget-object p1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    iget-boolean v6, p1, Landroidx/emoji2/text/c;->i:Z

    iget-object v7, p1, Landroidx/emoji2/text/c;->j:[I

    invoke-static {}, Lz3/d;->a()Ljava/util/Set;

    move-result-object v8

    invoke-direct/range {v2 .. v8}, Landroidx/emoji2/text/d;-><init>(Landroidx/emoji2/text/f;Landroidx/emoji2/text/c$j;Landroidx/emoji2/text/c$e;Z[ILjava/util/Set;)V

    iput-object v2, p0, Landroidx/emoji2/text/c$a;->b:Landroidx/emoji2/text/d;

    iget-object p1, p0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    invoke-virtual {p1}, Landroidx/emoji2/text/c;->o()V

    return-void
.end method
