.class public final synthetic Lz5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/e;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Landroidx/work/a;

.field public final synthetic d:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/List;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/v;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lz5/v;->b:Ljava/util/List;

    iput-object p3, p0, Lz5/v;->c:Landroidx/work/a;

    iput-object p4, p0, Lz5/v;->d:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final a(Lg6/w;Z)V
    .locals 6

    iget-object v0, p0, Lz5/v;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lz5/v;->b:Ljava/util/List;

    iget-object v2, p0, Lz5/v;->c:Landroidx/work/a;

    iget-object v3, p0, Lz5/v;->d:Landroidx/work/impl/WorkDatabase;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lz5/x;->a(Ljava/util/concurrent/Executor;Ljava/util/List;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Lg6/w;Z)V

    return-void
.end method
