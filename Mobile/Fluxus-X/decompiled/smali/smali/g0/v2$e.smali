.class public Lg0/v2$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/v2;->s(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ly1/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public constructor <init>(Lg0/v2;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg0/v2$e;->b:Lg0/v2;

    iput-object p2, p0, Lg0/v2$e;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lg0/v2$e;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lg0/v2$e;->a(Ljava/lang/Void;)V

    return-void
.end method
