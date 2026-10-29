.class public final Lne/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final a:Lne/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/b<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lne/b;Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "TV;>;",
            "Lne/x<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne/b$g;->a:Lne/b;

    iput-object p2, p0, Lne/b$g;->b:Lne/x;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lne/b$g;->a:Lne/b;

    invoke-static {v0}, Lne/b;->e(Lne/b;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lne/b$g;->b:Lne/x;

    invoke-static {v0}, Lne/b;->g(Lne/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lne/b;->d()Lne/b$b;

    move-result-object v1

    iget-object v2, p0, Lne/b$g;->a:Lne/b;

    invoke-virtual {v1, v2, p0, v0}, Lne/b$b;->b(Lne/b;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lne/b$g;->a:Lne/b;

    invoke-static {v0}, Lne/b;->h(Lne/b;)V

    :cond_1
    :goto_0
    return-void
.end method
