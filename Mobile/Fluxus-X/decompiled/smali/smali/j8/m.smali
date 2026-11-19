.class public final synthetic Lj8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lj8/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lc8/o;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lj8/r;Ljava/lang/Iterable;Lc8/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/m;->a:Lj8/r;

    iput-object p2, p0, Lj8/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lj8/m;->c:Lc8/o;

    iput-wide p4, p0, Lj8/m;->d:J

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lj8/m;->a:Lj8/r;

    iget-object v1, p0, Lj8/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lj8/m;->c:Lc8/o;

    iget-wide v3, p0, Lj8/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lj8/r;->b(Lj8/r;Ljava/lang/Iterable;Lc8/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
