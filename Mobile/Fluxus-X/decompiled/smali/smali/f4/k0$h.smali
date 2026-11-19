.class public Lf4/k0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/o0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/k0;->p(Lf4/a0;Lf4/x;Lf4/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/q;

.field public final synthetic b:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;Lf4/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf4/k0$h;->b:Lf4/k0;

    iput-object p2, p0, Lf4/k0$h;->a:Lf4/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lf4/k0;Lf4/q;)V
    .locals 0
    .param p1    # Lf4/k0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lf4/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lf4/k0$h;->a:Lf4/q;

    invoke-virtual {p1, p2}, Lf4/q;->D0(Lf4/q;)V

    return-void
.end method
