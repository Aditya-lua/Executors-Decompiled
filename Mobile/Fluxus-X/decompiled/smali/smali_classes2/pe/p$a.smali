.class public abstract Lpe/p$a;
.super Lpe/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/p;
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
        "Lpe/p<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpe/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/x<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lpe/p;-><init>()V

    invoke-static {p1}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpe/x;

    iput-object p1, p0, Lpe/p$a;->a:Lpe/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Ljava/util/concurrent/Future;
    .locals 1

    invoke-virtual {p0}, Lpe/p$a;->d()Lpe/x;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lpe/p$a;->a:Lpe/x;

    return-object v0
.end method

.method public bridge synthetic delegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpe/p$a;->d()Lpe/x;

    move-result-object v0

    return-object v0
.end method
