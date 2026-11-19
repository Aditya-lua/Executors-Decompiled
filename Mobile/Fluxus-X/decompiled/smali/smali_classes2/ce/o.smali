.class public final Lce/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/y0;


# instance fields
.field public final a:Lce/j;

.field public final b:Lde/y0;


# direct methods
.method public constructor <init>(Lce/j;Lde/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/o;->a:Lce/j;

    iput-object p2, p0, Lce/o;->b:Lde/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lce/o;->b:Lde/y0;

    invoke-interface {v0}, Lde/y0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/o0;

    invoke-static {v0}, Lde/x0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
