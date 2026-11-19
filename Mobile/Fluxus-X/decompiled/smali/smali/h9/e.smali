.class public final synthetic Lh9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public synthetic a:Lg9/e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lg9/e;)V
    .locals 0
    .param p1    # Lg9/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/e;->a:Lg9/e;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lh9/e;->a:Lg9/e;

    check-cast p1, Lh9/g;

    check-cast p2, Ltb/k;

    invoke-static {v0, p1, p2}, Lh9/f;->P(Lg9/e;Lh9/g;Ltb/k;)V

    return-void
.end method
