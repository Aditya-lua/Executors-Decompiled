.class public final Ltd/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/z;


# instance fields
.field public final a:Lee/e0;

.field public final b:Lee/e0;

.field public final c:Lee/e0;


# direct methods
.method public constructor <init>(Lee/e0;Lee/e0;Lee/e0;Lee/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/o;->a:Lee/e0;

    iput-object p2, p0, Ltd/o;->b:Lee/e0;

    iput-object p3, p0, Ltd/o;->c:Lee/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ltd/o;->a:Lee/e0;

    invoke-interface {v0}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ltd/o;->b:Lee/e0;

    invoke-interface {v1}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lee/t0;

    iget-object v2, p0, Ltd/o;->c:Lee/e0;

    check-cast v2, Ltd/u;

    invoke-virtual {v2}, Ltd/u;->b()Ltd/t;

    move-result-object v2

    new-instance v3, Ltd/b1;

    invoke-direct {v3}, Ltd/b1;-><init>()V

    new-instance v4, Ltd/m;

    invoke-direct {v4, v0, v1, v2, v3}, Ltd/m;-><init>(Landroid/content/Context;Lee/t0;Ltd/t;Ltd/d1;)V

    return-object v4
.end method
