.class public final Lce/d0;
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

    iput-object p1, p0, Lce/d0;->a:Lde/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lce/d0;->a:Lde/y0;

    check-cast v0, Lce/k;

    invoke-virtual {v0}, Lce/k;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lce/c0;

    invoke-direct {v1, v0}, Lce/c0;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
