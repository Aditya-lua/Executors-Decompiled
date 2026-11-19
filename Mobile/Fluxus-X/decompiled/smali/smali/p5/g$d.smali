.class public Lp5/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp5/q$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/g;->x(Lf4/q;Ljava/lang/Object;Lu2/e;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lp5/g;


# direct methods
.method public constructor <init>(Lp5/g;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lp5/g$d;->b:Lp5/g;

    iput-object p2, p0, Lp5/g$d;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/g$d;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public c(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public f(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public h(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public k(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method
