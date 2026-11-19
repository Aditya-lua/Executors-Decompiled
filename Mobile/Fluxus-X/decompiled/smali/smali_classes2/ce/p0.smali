.class public final Lce/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/y0;


# instance fields
.field public final a:Lde/y0;

.field public final b:Lde/y0;

.field public final c:Lde/y0;


# direct methods
.method public constructor <init>(Lde/y0;Lde/y0;Lde/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/p0;->a:Lde/y0;

    iput-object p2, p0, Lce/p0;->b:Lde/y0;

    iput-object p3, p0, Lce/p0;->c:Lde/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lce/p0;->a:Lde/y0;

    invoke-static {v0}, Lde/v0;->a(Lde/y0;)Lde/u0;

    move-result-object v0

    iget-object v1, p0, Lce/p0;->b:Lde/y0;

    invoke-static {v1}, Lde/v0;->a(Lde/y0;)Lde/u0;

    move-result-object v1

    iget-object v2, p0, Lce/p0;->c:Lde/y0;

    invoke-static {v2}, Lde/v0;->a(Lde/y0;)Lde/u0;

    move-result-object v2

    new-instance v3, Lce/o0;

    invoke-direct {v3, v0, v1, v2}, Lce/o0;-><init>(Lde/u0;Lde/u0;Lde/u0;)V

    return-object v3
.end method
