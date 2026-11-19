.class public final synthetic Ly0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly0/r;

.field public final synthetic b:Ln0/p0;

.field public final synthetic c:Ln0/p0;

.field public final synthetic d:Lx0/n0;

.field public final synthetic e:Lx0/n0;

.field public final synthetic f:Ljava/util/Map$Entry;


# direct methods
.method public synthetic constructor <init>(Ly0/r;Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/q;->a:Ly0/r;

    iput-object p2, p0, Ly0/q;->b:Ln0/p0;

    iput-object p3, p0, Ly0/q;->c:Ln0/p0;

    iput-object p4, p0, Ly0/q;->d:Lx0/n0;

    iput-object p5, p0, Ly0/q;->e:Lx0/n0;

    iput-object p6, p0, Ly0/q;->f:Ljava/util/Map$Entry;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ly0/q;->a:Ly0/r;

    iget-object v1, p0, Ly0/q;->b:Ln0/p0;

    iget-object v2, p0, Ly0/q;->c:Ln0/p0;

    iget-object v3, p0, Ly0/q;->d:Lx0/n0;

    iget-object v4, p0, Ly0/q;->e:Lx0/n0;

    iget-object v5, p0, Ly0/q;->f:Ljava/util/Map$Entry;

    invoke-static/range {v0 .. v5}, Ly0/r;->b(Ly0/r;Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method
