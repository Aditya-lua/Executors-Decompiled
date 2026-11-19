.class public Lp5/y$a$a;
.super Lp5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/y$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw1/a;

.field public final synthetic b:Lp5/y$a;


# direct methods
.method public constructor <init>(Lp5/y$a;Lw1/a;)V
    .locals 0

    iput-object p1, p0, Lp5/y$a$a;->b:Lp5/y$a;

    iput-object p2, p0, Lp5/y$a$a;->a:Lw1/a;

    invoke-direct {p0}, Lp5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lp5/q;)V
    .locals 2
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lp5/y$a$a;->a:Lw1/a;

    iget-object v1, p0, Lp5/y$a$a;->b:Lp5/y$a;

    iget-object v1, v1, Lp5/y$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lp5/q;->q0(Lp5/q$h;)Lp5/q;

    return-void
.end method
