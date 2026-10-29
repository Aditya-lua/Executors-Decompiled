.class public final synthetic Lde/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lde/a;

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lde/a;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/j;->a:Lde/a;

    iput-wide p2, p0, Lde/j;->b:J

    iput-object p4, p0, Lde/j;->c:Ljava/util/List;

    iput-object p5, p0, Lde/j;->d:Ljava/util/List;

    iput-object p6, p0, Lde/j;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lde/j;->a:Lde/a;

    iget-wide v1, p0, Lde/j;->b:J

    iget-object v3, p0, Lde/j;->c:Ljava/util/List;

    iget-object v4, p0, Lde/j;->d:Ljava/util/List;

    iget-object v5, p0, Lde/j;->e:Ljava/util/List;

    invoke-virtual/range {v0 .. v5}, Lde/a;->j(JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
