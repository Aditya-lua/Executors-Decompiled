.class public final Ljv/s$n;
.super Ljv/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljv/h<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method public constructor <init>(Ljv/h;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/h<",
            "TT;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljv/s;-><init>()V

    iput-object p1, p0, Ljv/s$n;->a:Ljv/h;

    iput-boolean p2, p0, Ljv/s$n;->b:Z

    return-void
.end method


# virtual methods
.method public a(Ljv/v;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/v;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ljv/s$n;->a:Ljv/h;

    invoke-interface {v0, p2}, Ljv/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v0, 0x0

    iget-boolean v1, p0, Ljv/s$n;->b:Z

    invoke-virtual {p1, p2, v0, v1}, Ljv/v;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
