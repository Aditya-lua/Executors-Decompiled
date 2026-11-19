.class public Lk9/h;
.super Lk9/n;
.source "SourceFile"


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Landroid/content/Intent;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p2, p3}, Lk9/n;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    iput p1, p0, Lk9/h;->b:I

    return-void
.end method
