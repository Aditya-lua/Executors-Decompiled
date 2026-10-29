.class public Lzf/i;
.super Lff/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzf/i$a;
    }
.end annotation


# instance fields
.field public final a:Lzf/i$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzf/i$a;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lzf/i$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1}, Lff/j;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lzf/i;->a:Lzf/i$a;

    return-void
.end method

.method public constructor <init>(Lzf/i$a;)V
    .locals 0
    .param p1    # Lzf/i$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lff/j;-><init>()V

    .line 2
    iput-object p1, p0, Lzf/i;->a:Lzf/i$a;

    return-void
.end method
