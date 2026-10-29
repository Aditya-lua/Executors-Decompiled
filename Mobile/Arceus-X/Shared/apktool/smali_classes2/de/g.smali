.class public final synthetic Lde/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lde/a;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lde/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/g;->a:Lde/a;

    iput-object p2, p0, Lde/g;->b:Ljava/util/List;

    iput-object p3, p0, Lde/g;->c:Ljava/util/List;

    iput-object p4, p0, Lde/g;->d:Ljava/util/List;

    iput-wide p5, p0, Lde/g;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lde/g;->a:Lde/a;

    iget-object v1, p0, Lde/g;->b:Ljava/util/List;

    iget-object v2, p0, Lde/g;->c:Ljava/util/List;

    iget-object v3, p0, Lde/g;->d:Ljava/util/List;

    iget-wide v4, p0, Lde/g;->e:J

    invoke-virtual/range {v0 .. v5}, Lde/a;->l(Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method
