.class public final Ll9/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll9/o;

.field public final b:Ll9/w;

.field public final c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll9/o;Ll9/w;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Ll9/o;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll9/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/w0;->a:Ll9/o;

    iput-object p2, p0, Ll9/w0;->b:Ll9/w;

    iput-object p3, p0, Ll9/w0;->c:Ljava/lang/Runnable;

    return-void
.end method
