.class public interface abstract Ls0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln0/l3;"
    }
.end annotation


# static fields
.field public static final M:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final N:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.target.name"

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ls0/q;->M:Ln0/n1$a;

    const-string v0, "camerax.core.target.class"

    const-class v1, Ljava/lang/Class;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ls0/q;->N:Ln0/n1$a;

    return-void
.end method


# virtual methods
.method public a0()Ljava/lang/String;
    .locals 1

    sget-object v0, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public u(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
