.class public final Ln0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/a1$b;
    }
.end annotation


# instance fields
.field public final d:Lg0/c2;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/b4;

    new-instance v1, Ln0/a1$a;

    invoke-direct {v1, p0, p1, p2}, Ln0/a1$a;-><init>(Ln0/a1;J)V

    invoke-direct {v0, p1, p2, v1}, Ln0/b4;-><init>(JLg0/c2;)V

    iput-object v0, p0, Ln0/a1;->d:Lg0/c2;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ln0/a1;->d:Lg0/c2;

    invoke-interface {v0}, Lg0/c2;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(J)Lg0/c2;
    .locals 1

    new-instance v0, Ln0/a1;

    invoke-direct {v0, p1, p2}, Ln0/a1;-><init>(J)V

    return-object v0
.end method

.method public e(Lg0/c2$b;)Lg0/c2$c;
    .locals 1

    iget-object v0, p0, Ln0/a1;->d:Lg0/c2;

    invoke-interface {v0, p1}, Lg0/c2;->e(Lg0/c2$b;)Lg0/c2$c;

    move-result-object p1

    return-object p1
.end method
