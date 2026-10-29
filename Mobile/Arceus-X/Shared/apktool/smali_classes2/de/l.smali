.class public final synthetic Lde/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/r;


# instance fields
.field public final synthetic a:Lae/d;


# direct methods
.method public synthetic constructor <init>(Lae/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/l;->a:Lae/d;

    return-void
.end method


# virtual methods
.method public final a(Lae/e;)Lae/e;
    .locals 2

    iget-object v0, p0, Lde/l;->a:Lae/d;

    new-instance v1, Lde/o;

    invoke-direct {v1, p1, v0}, Lde/o;-><init>(Lae/e;Lae/d;)V

    invoke-static {v1}, Lbe/t0;->c(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lae/e;

    return-object p1
.end method
