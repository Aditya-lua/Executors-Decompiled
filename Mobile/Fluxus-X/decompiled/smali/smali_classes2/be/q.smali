.class public final Lbe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/t0;


# instance fields
.field public final synthetic a:Lbe/a;


# direct methods
.method public constructor <init>(Lbe/a;)V
    .locals 0

    iput-object p1, p0, Lbe/q;->a:Lbe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lbe/q;->a:Lbe/a;

    invoke-static {v0}, Lbe/a;->d(Lbe/a;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
