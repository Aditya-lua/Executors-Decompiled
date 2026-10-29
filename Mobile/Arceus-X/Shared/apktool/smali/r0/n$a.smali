.class public Lr0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/a<",
        "TI;TO;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lt/a;


# direct methods
.method public constructor <init>(Lt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lr0/n$a;->a:Lt/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lne/x<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/n$a;->a:Lt/a;

    invoke-interface {v0, p1}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1
.end method
