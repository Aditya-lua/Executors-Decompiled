.class public final Lae/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/y0;


# instance fields
.field public final a:Lbe/y0;

.field public final b:Lbe/y0;

.field public final c:Lbe/y0;

.field public final d:Lbe/y0;


# direct methods
.method public constructor <init>(Lbe/y0;Lbe/y0;Lbe/y0;Lbe/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/i;->a:Lbe/y0;

    iput-object p2, p0, Lae/i;->b:Lbe/y0;

    iput-object p3, p0, Lae/i;->c:Lbe/y0;

    iput-object p4, p0, Lae/i;->d:Lbe/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lae/i;->a:Lbe/y0;

    invoke-interface {v0}, Lbe/y0;->zza()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lae/i;->b:Lbe/y0;

    invoke-interface {v1}, Lbe/y0;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lae/a1;

    iget-object v2, p0, Lae/i;->c:Lbe/y0;

    invoke-interface {v2}, Lbe/y0;->zza()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lae/v0;

    iget-object v3, p0, Lae/i;->d:Lbe/y0;

    invoke-interface {v3}, Lbe/y0;->zza()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lae/c0;

    new-instance v4, Lae/h;

    check-cast v0, Lae/a0;

    invoke-direct {v4, v0, v1, v2, v3}, Lae/h;-><init>(Lae/a0;Lae/a1;Lae/v0;Lae/c0;)V

    return-object v4
.end method
