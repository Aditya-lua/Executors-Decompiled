.class public final Lae/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/y0;


# instance fields
.field public final a:Lbe/y0;

.field public final b:Lbe/y0;

.field public final c:Lbe/y0;


# direct methods
.method public constructor <init>(Lbe/y0;Lbe/y0;Lbe/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/p0;->a:Lbe/y0;

    iput-object p2, p0, Lae/p0;->b:Lbe/y0;

    iput-object p3, p0, Lae/p0;->c:Lbe/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lae/p0;->a:Lbe/y0;

    invoke-static {v0}, Lbe/v0;->a(Lbe/y0;)Lbe/u0;

    move-result-object v0

    iget-object v1, p0, Lae/p0;->b:Lbe/y0;

    invoke-static {v1}, Lbe/v0;->a(Lbe/y0;)Lbe/u0;

    move-result-object v1

    iget-object v2, p0, Lae/p0;->c:Lbe/y0;

    invoke-static {v2}, Lbe/v0;->a(Lbe/y0;)Lbe/u0;

    move-result-object v2

    new-instance v3, Lae/o0;

    invoke-direct {v3, v0, v1, v2}, Lae/o0;-><init>(Lbe/u0;Lbe/u0;Lbe/u0;)V

    return-object v3
.end method
