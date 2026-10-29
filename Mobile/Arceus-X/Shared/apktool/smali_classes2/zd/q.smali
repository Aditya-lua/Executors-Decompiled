.class public final Lzd/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/t0;


# instance fields
.field public final synthetic a:Lzd/a;


# direct methods
.method public constructor <init>(Lzd/a;)V
    .locals 0

    iput-object p1, p0, Lzd/q;->a:Lzd/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lzd/q;->a:Lzd/a;

    invoke-static {v0}, Lzd/a;->d(Lzd/a;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
