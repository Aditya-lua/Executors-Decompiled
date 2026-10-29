.class public Lo5/y$a$a;
.super Lo5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/y$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw1/a;

.field public final synthetic b:Lo5/y$a;


# direct methods
.method public constructor <init>(Lo5/y$a;Lw1/a;)V
    .locals 0

    iput-object p1, p0, Lo5/y$a$a;->b:Lo5/y$a;

    iput-object p2, p0, Lo5/y$a$a;->a:Lw1/a;

    invoke-direct {p0}, Lo5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lo5/q;)V
    .locals 2
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/y$a$a;->a:Lw1/a;

    iget-object v1, p0, Lo5/y$a$a;->b:Lo5/y$a;

    iget-object v1, v1, Lo5/y$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    return-void
.end method
