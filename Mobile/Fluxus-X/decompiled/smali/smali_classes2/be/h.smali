.class public final Lbe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/m;


# instance fields
.field public final synthetic a:Lbe/i;


# direct methods
.method public constructor <init>(Lbe/i;)V
    .locals 0

    iput-object p1, p0, Lbe/h;->a:Lbe/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lbe/n;Ljava/io/File;Z)V
    .locals 0

    iget-object p1, p0, Lbe/h;->a:Lbe/i;

    iget-object p1, p1, Lbe/i;->b:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-nez p3, :cond_0

    iget-object p1, p0, Lbe/h;->a:Lbe/i;

    iget-object p1, p1, Lbe/i;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
