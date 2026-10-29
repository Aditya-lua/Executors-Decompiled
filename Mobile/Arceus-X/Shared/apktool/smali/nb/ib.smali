.class public final Lnb/ib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/jb;


# direct methods
.method public constructor <init>(Lnb/jb;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ib;->a:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/ib;->a:Lnb/jb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/jb;->E(Lnb/bb;)V

    return-void
.end method
