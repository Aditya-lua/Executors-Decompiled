.class public Lbg/i;
.super Lhf/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbg/i$a;
    }
.end annotation


# instance fields
.field public final a:Lbg/i$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbg/i$a;)V
    .locals 0
    .param p1    # Lbg/i$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lhf/j;-><init>()V

    .line 2
    iput-object p1, p0, Lbg/i;->a:Lbg/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbg/i$a;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lbg/i$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1}, Lhf/j;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lbg/i;->a:Lbg/i$a;

    return-void
.end method
