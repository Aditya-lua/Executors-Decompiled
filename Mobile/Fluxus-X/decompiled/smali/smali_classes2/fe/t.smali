.class public final Lfe/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/y0;


# instance fields
.field public final a:Lde/y0;

.field public final b:Lde/y0;

.field public final c:Lde/y0;

.field public final d:Lde/y0;


# direct methods
.method public constructor <init>(Lde/y0;Lde/y0;Lde/y0;Lde/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/t;->a:Lde/y0;

    iput-object p2, p0, Lfe/t;->b:Lde/y0;

    iput-object p3, p0, Lfe/t;->c:Lde/y0;

    iput-object p4, p0, Lfe/t;->d:Lde/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lfe/t;->a:Lde/y0;

    check-cast v0, Lce/k;

    invoke-virtual {v0}, Lce/k;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lfe/t;->b:Lde/y0;

    invoke-interface {v1}, Lde/y0;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    iget-object v2, p0, Lfe/t;->c:Lde/y0;

    invoke-interface {v2}, Lde/y0;->zza()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/v0;

    iget-object v3, p0, Lfe/t;->d:Lde/y0;

    invoke-static {v3}, Lde/v0;->a(Lde/y0;)Lde/u0;

    move-result-object v3

    new-instance v4, Lfe/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lfe/a;-><init>(Landroid/content/Context;Ljava/io/File;Lce/v0;Lde/u0;)V

    return-object v4
.end method
