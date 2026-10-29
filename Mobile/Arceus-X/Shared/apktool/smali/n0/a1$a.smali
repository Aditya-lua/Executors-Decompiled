.class public Ln0/a1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/c2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/a1;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:J

.field public final synthetic e:Ln0/a1;


# direct methods
.method public constructor <init>(Ln0/a1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ln0/a1$a;->e:Ln0/a1;

    iput-wide p2, p0, Ln0/a1$a;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Ln0/a1$a;->d:J

    return-wide v0
.end method

.method public e(Lg0/c2$b;)Lg0/c2$c;
    .locals 1

    invoke-interface {p1}, Lg0/c2$b;->m()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Lg0/c2$c;->d:Lg0/c2$c;

    return-object p1

    :cond_0
    sget-object p1, Lg0/c2$c;->e:Lg0/c2$c;

    return-object p1
.end method
