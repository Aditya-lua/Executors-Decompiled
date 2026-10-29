.class public final synthetic Li8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lb8/o;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Li8/r;Ljava/lang/Iterable;Lb8/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/m;->a:Li8/r;

    iput-object p2, p0, Li8/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Li8/m;->c:Lb8/o;

    iput-wide p4, p0, Li8/m;->d:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Li8/m;->a:Li8/r;

    iget-object v1, p0, Li8/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Li8/m;->c:Lb8/o;

    iget-wide v3, p0, Li8/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Li8/r;->b(Li8/r;Ljava/lang/Iterable;Lb8/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
