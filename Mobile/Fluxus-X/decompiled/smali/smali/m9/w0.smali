.class public final Lm9/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/o;

.field public final b:Lm9/w;

.field public final c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lm9/o;Lm9/w;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Lm9/o;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lm9/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/w0;->a:Lm9/o;

    iput-object p2, p0, Lm9/w0;->b:Lm9/w;

    iput-object p3, p0, Lm9/w0;->c:Ljava/lang/Runnable;

    return-void
.end method
