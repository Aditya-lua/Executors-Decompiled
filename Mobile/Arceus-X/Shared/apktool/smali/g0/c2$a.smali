.class public final Lg0/c2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lg0/c2;

.field public b:J


# direct methods
.method public constructor <init>(Lg0/c2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/c2$a;->a:Lg0/c2;

    invoke-interface {p1}, Lg0/c2;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lg0/c2$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lg0/c2;
    .locals 4

    iget-object v0, p0, Lg0/c2$a;->a:Lg0/c2;

    instance-of v1, v0, Ln0/n3;

    if-eqz v1, :cond_0

    check-cast v0, Ln0/n3;

    iget-wide v1, p0, Lg0/c2$a;->b:J

    invoke-interface {v0, v1, v2}, Ln0/n3;->b(J)Lg0/c2;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ln0/b4;

    iget-wide v1, p0, Lg0/c2$a;->b:J

    iget-object v3, p0, Lg0/c2$a;->a:Lg0/c2;

    invoke-direct {v0, v1, v2, v3}, Ln0/b4;-><init>(JLg0/c2;)V

    return-object v0
.end method
