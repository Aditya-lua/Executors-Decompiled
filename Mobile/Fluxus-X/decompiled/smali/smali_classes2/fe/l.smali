.class public final synthetic Lfe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe/r;


# instance fields
.field public final synthetic a:Lce/d;


# direct methods
.method public synthetic constructor <init>(Lce/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/l;->a:Lce/d;

    return-void
.end method


# virtual methods
.method public final a(Lce/e;)Lce/e;
    .locals 2

    iget-object v0, p0, Lfe/l;->a:Lce/d;

    new-instance v1, Lfe/o;

    invoke-direct {v1, p1, v0}, Lfe/o;-><init>(Lce/e;Lce/d;)V

    invoke-static {v1}, Lde/t0;->c(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/e;

    return-object p1
.end method
