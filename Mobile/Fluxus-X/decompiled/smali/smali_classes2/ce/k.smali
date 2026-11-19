.class public final Lce/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/y0;


# instance fields
.field public final a:Lce/j;


# direct methods
.method public constructor <init>(Lce/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/k;->a:Lce/j;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lce/k;->a:Lce/j;

    invoke-virtual {v0}, Lce/j;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lde/x0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lce/k;->a:Lce/j;

    invoke-virtual {v0}, Lce/j;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lde/x0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
