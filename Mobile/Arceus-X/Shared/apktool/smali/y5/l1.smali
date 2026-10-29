.class public final synthetic Ly5/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/work/impl/WorkDatabase;

.field public final synthetic b:Lf6/j0;

.field public final synthetic c:Lf6/j0;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/l1;->a:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Ly5/l1;->b:Lf6/j0;

    iput-object p3, p0, Ly5/l1;->c:Lf6/j0;

    iput-object p4, p0, Ly5/l1;->d:Ljava/util/List;

    iput-object p5, p0, Ly5/l1;->e:Ljava/lang/String;

    iput-object p6, p0, Ly5/l1;->f:Ljava/util/Set;

    iput-boolean p7, p0, Ly5/l1;->g:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Ly5/l1;->a:Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, Ly5/l1;->b:Lf6/j0;

    iget-object v2, p0, Ly5/l1;->c:Lf6/j0;

    iget-object v3, p0, Ly5/l1;->d:Ljava/util/List;

    iget-object v4, p0, Ly5/l1;->e:Ljava/lang/String;

    iget-object v5, p0, Ly5/l1;->f:Ljava/util/Set;

    iget-boolean v6, p0, Ly5/l1;->g:Z

    invoke-static/range {v0 .. v6}, Ly5/m1;->b(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method
