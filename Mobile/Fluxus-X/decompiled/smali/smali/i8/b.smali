.class public final synthetic Li8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Li8/c;

.field public final synthetic b:Lc8/o;

.field public final synthetic c:Lc8/i;


# direct methods
.method public synthetic constructor <init>(Li8/c;Lc8/o;Lc8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/b;->a:Li8/c;

    iput-object p2, p0, Li8/b;->b:Lc8/o;

    iput-object p3, p0, Li8/b;->c:Lc8/i;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li8/b;->a:Li8/c;

    iget-object v1, p0, Li8/b;->b:Lc8/o;

    iget-object v2, p0, Li8/b;->c:Lc8/i;

    invoke-static {v0, v1, v2}, Li8/c;->b(Li8/c;Lc8/o;Lc8/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
