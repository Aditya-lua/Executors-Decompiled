.class public final Lnb/eb;
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

    iput-object p1, p0, Lnb/eb;->a:Lnb/jb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/eb;->a:Lnb/jb;

    invoke-virtual {v0}, Lnb/jb;->D()Lnb/bb;

    move-result-object v1

    iput-object v1, v0, Lnb/jb;->e:Lnb/bb;

    return-void
.end method
