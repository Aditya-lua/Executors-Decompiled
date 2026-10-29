.class public final Ltd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/z;


# instance fields
.field public final a:Lee/e0;


# direct methods
.method public constructor <init>(Lee/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/f;->a:Lee/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltd/f;->a:Lee/e0;

    invoke-interface {v0}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ltd/e;

    check-cast v0, Ltd/m;

    invoke-direct {v1, v0}, Ltd/e;-><init>(Ltd/m;)V

    return-object v1
.end method
