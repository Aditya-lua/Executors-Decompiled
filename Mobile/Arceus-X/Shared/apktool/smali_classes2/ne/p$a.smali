.class public abstract Lne/p$a;
.super Lne/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/p<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lne/p;-><init>()V

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne/x;

    iput-object p1, p0, Lne/p$a;->a:Lne/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Ljava/util/concurrent/Future;
    .locals 1

    invoke-virtual {p0}, Lne/p$a;->d()Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lne/p$a;->a:Lne/x;

    return-object v0
.end method

.method public bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lne/p$a;->d()Lne/x;

    move-result-object v0

    return-object v0
.end method
