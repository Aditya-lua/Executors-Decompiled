.class public final Lae/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/y0;


# instance fields
.field public final a:Lae/j;

.field public final b:Lbe/y0;


# direct methods
.method public constructor <init>(Lae/j;Lbe/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/o;->a:Lae/j;

    iput-object p2, p0, Lae/o;->b:Lbe/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lae/o;->b:Lbe/y0;

    invoke-interface {v0}, Lbe/y0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/o0;

    invoke-static {v0}, Lbe/x0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
