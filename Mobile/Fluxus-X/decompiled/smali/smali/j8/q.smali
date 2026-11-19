.class public final synthetic Lj8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lj8/r;

.field public final synthetic b:Lc8/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lj8/r;Lc8/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/q;->a:Lj8/r;

    iput-object p2, p0, Lj8/q;->b:Lc8/o;

    iput-wide p3, p0, Lj8/q;->c:J

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lj8/q;->a:Lj8/r;

    iget-object v1, p0, Lj8/q;->b:Lc8/o;

    iget-wide v2, p0, Lj8/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lj8/r;->g(Lj8/r;Lc8/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
