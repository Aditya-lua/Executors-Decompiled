.class public final synthetic Li8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Lb8/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Li8/r;Lb8/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/q;->a:Li8/r;

    iput-object p2, p0, Li8/q;->b:Lb8/o;

    iput-wide p3, p0, Li8/q;->c:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Li8/q;->a:Li8/r;

    iget-object v1, p0, Li8/q;->b:Lb8/o;

    iget-wide v2, p0, Li8/q;->c:J

    invoke-static {v0, v1, v2, v3}, Li8/r;->g(Li8/r;Lb8/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
