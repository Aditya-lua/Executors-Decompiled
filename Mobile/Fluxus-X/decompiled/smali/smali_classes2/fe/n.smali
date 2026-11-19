.class public final synthetic Lfe/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfe/a;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lfe/a;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/n;->a:Lfe/a;

    iput-object p2, p0, Lfe/n;->b:Ljava/util/List;

    iput-object p3, p0, Lfe/n;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lfe/n;->a:Lfe/a;

    iget-object v1, p0, Lfe/n;->b:Ljava/util/List;

    iget-object v2, p0, Lfe/n;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lfe/a;->m(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
