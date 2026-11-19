.class public final synthetic Li8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li8/c;

.field public final synthetic b:Lc8/o;

.field public final synthetic c:Lz7/j;

.field public final synthetic d:Lc8/i;


# direct methods
.method public synthetic constructor <init>(Li8/c;Lc8/o;Lz7/j;Lc8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/a;->a:Li8/c;

    iput-object p2, p0, Li8/a;->b:Lc8/o;

    iput-object p3, p0, Li8/a;->c:Lz7/j;

    iput-object p4, p0, Li8/a;->d:Lc8/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Li8/a;->a:Li8/c;

    iget-object v1, p0, Li8/a;->b:Lc8/o;

    iget-object v2, p0, Li8/a;->c:Lz7/j;

    iget-object v3, p0, Li8/a;->d:Lc8/i;

    invoke-static {v0, v1, v2, v3}, Li8/c;->c(Li8/c;Lc8/o;Lz7/j;Lc8/i;)V

    return-void
.end method
