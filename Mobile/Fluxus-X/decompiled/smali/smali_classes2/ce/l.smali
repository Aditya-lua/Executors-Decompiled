.class public final Lce/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/y0;


# instance fields
.field public final a:Lde/y0;


# direct methods
.method public constructor <init>(Lde/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/l;->a:Lde/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lce/l;->a:Lde/y0;

    invoke-interface {v0}, Lde/y0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lfe/d;->a(Ljava/io/File;)Lfe/v;

    move-result-object v0

    return-object v0
.end method
