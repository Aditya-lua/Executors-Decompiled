.class public final Ltd/u0;
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

    iput-object p1, p0, Ltd/u0;->a:Lee/e0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltd/u0;->a:Lee/e0;

    invoke-interface {v0}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ltd/t0;

    check-cast v0, Ltd/n0;

    invoke-direct {v1, v0}, Ltd/t0;-><init>(Ltd/n0;)V

    return-object v1
.end method
