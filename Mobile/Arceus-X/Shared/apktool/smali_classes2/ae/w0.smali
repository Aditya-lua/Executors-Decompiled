.class public final Lae/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/y0;


# instance fields
.field public final a:Lbe/y0;


# direct methods
.method public constructor <init>(Lbe/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/w0;->a:Lbe/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lae/w0;->a:Lbe/y0;

    check-cast v0, Lae/k;

    invoke-virtual {v0}, Lae/k;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lae/v0;

    invoke-direct {v1, v0}, Lae/v0;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
