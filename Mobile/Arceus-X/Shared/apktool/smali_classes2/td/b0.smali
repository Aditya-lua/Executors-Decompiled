.class public final Ltd/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/z;


# instance fields
.field public final a:Lee/e0;

.field public final b:Lee/e0;


# direct methods
.method public constructor <init>(Lee/e0;Lee/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/b0;->a:Lee/e0;

    iput-object p2, p0, Ltd/b0;->b:Lee/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltd/b0;->b:Lee/e0;

    iget-object v1, p0, Ltd/b0;->a:Lee/e0;

    invoke-interface {v1}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Ltd/z;

    check-cast v1, Ltd/n0;

    check-cast v0, Ltd/t0;

    invoke-direct {v2, v1, v0}, Ltd/z;-><init>(Ltd/n0;Ltd/t0;)V

    return-object v2
.end method
