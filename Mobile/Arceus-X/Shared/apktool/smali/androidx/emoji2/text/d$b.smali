.class public Landroidx/emoji2/text/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/emoji2/text/d$c<",
        "Lz3/k;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lz3/k;

.field public final b:Landroidx/emoji2/text/c$j;


# direct methods
.method public constructor <init>(Lz3/k;Landroidx/emoji2/text/c$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/d$b;->a:Lz3/k;

    iput-object p2, p0, Landroidx/emoji2/text/d$b;->b:Landroidx/emoji2/text/c$j;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;IILz3/i;)Z
    .locals 3
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p4}, Lz3/i;->k()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lz3/k;

    if-nez v0, :cond_2

    new-instance v0, Lz3/k;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Lz3/k;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lz3/k;

    :cond_2
    iget-object p1, p0, Landroidx/emoji2/text/d$b;->b:Landroidx/emoji2/text/c$j;

    invoke-interface {p1, p4}, Landroidx/emoji2/text/c$j;->a(Lz3/i;)Lz3/e;

    move-result-object p1

    iget-object p4, p0, Landroidx/emoji2/text/d$b;->a:Lz3/k;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Lz3/k;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/d$b;->c()Lz3/k;

    move-result-object v0

    return-object v0
.end method

.method public c()Lz3/k;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lz3/k;

    return-object v0
.end method
