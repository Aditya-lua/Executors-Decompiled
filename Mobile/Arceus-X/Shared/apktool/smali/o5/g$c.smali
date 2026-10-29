.class public Lo5/g$c;
.super Lo5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/g;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/util/ArrayList;

.field public final synthetic g:Lo5/g;


# direct methods
.method public constructor <init>(Lo5/g;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lo5/g$c;->g:Lo5/g;

    iput-object p2, p0, Lo5/g$c;->a:Ljava/lang/Object;

    iput-object p3, p0, Lo5/g$c;->b:Ljava/util/ArrayList;

    iput-object p4, p0, Lo5/g$c;->c:Ljava/lang/Object;

    iput-object p5, p0, Lo5/g$c;->d:Ljava/util/ArrayList;

    iput-object p6, p0, Lo5/g$c;->e:Ljava/lang/Object;

    iput-object p7, p0, Lo5/g$c;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, Lo5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Lo5/q;)V
    .locals 3
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lo5/g$c;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lo5/g$c;->g:Lo5/g;

    iget-object v2, p0, Lo5/g$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lo5/g;->E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    iget-object p1, p0, Lo5/g$c;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lo5/g$c;->g:Lo5/g;

    iget-object v2, p0, Lo5/g$c;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lo5/g;->E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object p1, p0, Lo5/g$c;->e:Ljava/lang/Object;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lo5/g$c;->g:Lo5/g;

    iget-object v2, p0, Lo5/g$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lo5/g;->E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public k(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    return-void
.end method
