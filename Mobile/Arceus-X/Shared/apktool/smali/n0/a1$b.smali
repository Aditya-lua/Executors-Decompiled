.class public final Ln0/a1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final d:Lg0/c2;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/a1;

    invoke-direct {v0, p1, p2}, Ln0/a1;-><init>(J)V

    iput-object v0, p0, Ln0/a1$b;->d:Lg0/c2;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ln0/a1$b;->d:Lg0/c2;

    invoke-interface {v0}, Lg0/c2;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(J)Lg0/c2;
    .locals 1

    new-instance v0, Ln0/a1$b;

    invoke-direct {v0, p1, p2}, Ln0/a1$b;-><init>(J)V

    return-object v0
.end method

.method public e(Lg0/c2$b;)Lg0/c2$c;
    .locals 2

    iget-object v0, p0, Ln0/a1$b;->d:Lg0/c2;

    invoke-interface {v0, p1}, Lg0/c2;->e(Lg0/c2$b;)Lg0/c2$c;

    move-result-object v0

    invoke-virtual {v0}, Lg0/c2$c;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lg0/c2$b;->n()Ljava/lang/Throwable;

    move-result-object p1

    instance-of v0, p1, Ln0/j1$b;

    if-eqz v0, :cond_0

    const-string v0, "CameraX"

    const-string v1, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."

    invoke-static {v0, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p1, Ln0/j1$b;

    invoke-virtual {p1}, Ln0/j1$b;->a()I

    move-result p1

    if-lez p1, :cond_0

    sget-object p1, Lg0/c2$c;->g:Lg0/c2$c;

    return-object p1

    :cond_0
    sget-object p1, Lg0/c2$c;->d:Lg0/c2$c;

    return-object p1

    :cond_1
    sget-object p1, Lg0/c2$c;->e:Lg0/c2$c;

    return-object p1
.end method
