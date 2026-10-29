.class public Landroidx/emoji2/text/c$a$a;
.super Landroidx/emoji2/text/c$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/emoji2/text/c$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/emoji2/text/c$a;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/c$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/emoji2/text/c$a$a;->a:Landroidx/emoji2/text/c$a;

    invoke-direct {p0}, Landroidx/emoji2/text/c$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/c$a$a;->a:Landroidx/emoji2/text/c$a;

    iget-object v0, v0, Landroidx/emoji2/text/c$b;->a:Landroidx/emoji2/text/c;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/c;->n(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Landroidx/emoji2/text/f;)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/c$a$a;->a:Landroidx/emoji2/text/c$a;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/c$a;->d(Landroidx/emoji2/text/f;)V

    return-void
.end method
