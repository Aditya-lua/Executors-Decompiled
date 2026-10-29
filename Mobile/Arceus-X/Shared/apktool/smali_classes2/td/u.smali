.class public final Ltd/u;
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

    iput-object p1, p0, Ltd/u;->a:Lee/e0;

    iput-object p2, p0, Ltd/u;->b:Lee/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltd/u;->b()Ltd/t;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ltd/t;
    .locals 3

    new-instance v0, Ltd/t;

    iget-object v1, p0, Ltd/u;->a:Lee/e0;

    iget-object v2, p0, Ltd/u;->b:Lee/e0;

    invoke-direct {v0, v1, v2}, Ltd/t;-><init>(Lee/e0;Lee/e0;)V

    return-object v0
.end method
