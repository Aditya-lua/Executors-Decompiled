.class public final Lpe/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/b;
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
.field public final a:Lpe/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/b<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/x<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpe/b;Lpe/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/b<",
            "TV;>;",
            "Lpe/x<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/b$g;->a:Lpe/b;

    iput-object p2, p0, Lpe/b$g;->b:Lpe/x;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lpe/b$g;->a:Lpe/b;

    invoke-static {v0}, Lpe/b;->e(Lpe/b;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpe/b$g;->b:Lpe/x;

    invoke-static {v0}, Lpe/b;->g(Lpe/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lpe/b;->d()Lpe/b$b;

    move-result-object v1

    iget-object v2, p0, Lpe/b$g;->a:Lpe/b;

    invoke-virtual {v1, v2, p0, v0}, Lpe/b$b;->b(Lpe/b;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpe/b$g;->a:Lpe/b;

    invoke-static {v0}, Lpe/b;->h(Lpe/b;)V

    :cond_1
    :goto_0
    return-void
.end method
