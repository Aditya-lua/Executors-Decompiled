.class public Lf4/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/q;->j(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/c1;

.field public final synthetic b:Lf4/q;


# direct methods
.method public constructor <init>(Lf4/q;Lf4/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf4/q$e;->b:Lf4/q;

    iput-object p2, p0, Lf4/q$e;->a:Lf4/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lf4/q$e;->a:Lf4/c1;

    invoke-virtual {v0}, Lf4/c1;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/q$e;->a:Lf4/c1;

    invoke-virtual {v0}, Lf4/c1;->n()V

    :cond_0
    return-void
.end method
