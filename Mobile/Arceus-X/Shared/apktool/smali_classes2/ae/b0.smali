.class public final Lae/b0;
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

    iput-object p1, p0, Lae/b0;->a:Lbe/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lae/b0;->a:Lbe/y0;

    check-cast v0, Lae/k;

    invoke-virtual {v0}, Lae/k;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lae/a0;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lae/a0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v1
.end method
