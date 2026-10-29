.class public Lf1/p1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/p1;->d1(Ln0/o3$b;Z)V
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
.field public final synthetic a:Lne/x;

.field public final synthetic b:Z

.field public final synthetic c:Lf1/p1;


# direct methods
.method public constructor <init>(Lf1/p1;Lne/x;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf1/p1$c;->c:Lf1/p1;

    iput-object p2, p0, Lf1/p1$c;->a:Lne/x;

    iput-boolean p3, p0, Lf1/p1$c;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lf1/p1$c;->a:Lne/x;

    iget-object v0, p0, Lf1/p1$c;->c:Lf1/p1;

    iget-object v1, v0, Lf1/p1;->w:Lne/x;

    if-ne p1, v1, :cond_1

    iget-object p1, v0, Lf1/p1;->y:Lf1/a2$a;

    sget-object v1, Lf1/a2$a;->c:Lf1/a2$a;

    if-eq p1, v1, :cond_1

    iget-boolean p1, p0, Lf1/p1$c;->b:Z

    if-eqz p1, :cond_0

    sget-object p1, Lf1/a2$a;->a:Lf1/a2$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lf1/a2$a;->b:Lf1/a2$a;

    :goto_0
    invoke-virtual {v0, p1}, Lf1/p1;->b1(Lf1/a2$a;)V

    :cond_1
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const-string v0, "VideoCapture"

    const-string v1, "Surface update completed with unexpected exception"

    invoke-static {v0, v1, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lf1/p1$c;->a(Ljava/lang/Void;)V

    return-void
.end method
