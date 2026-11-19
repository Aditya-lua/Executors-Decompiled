.class public Landroidx/emoji2/text/EmojiCompatInitializer$b;
.super Landroidx/emoji2/text/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/EmojiCompatInitializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/EmojiCompatInitializer$c;

    invoke-direct {v0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer$c;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/c$c;-><init>(Landroidx/emoji2/text/c$h;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/c$c;->b(I)Landroidx/emoji2/text/c$c;

    return-void
.end method
