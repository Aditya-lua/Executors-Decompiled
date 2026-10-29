.class public interface abstract Ln0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/l0$c;,
        Ln0/l0$d;
    }
.end annotation


# static fields
.field public static final a:Ln0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/l0$b;

    invoke-direct {v0}, Ln0/l0$b;-><init>()V

    sput-object v0, Ln0/l0;->a:Ln0/l0;

    return-void
.end method


# virtual methods
.method public abstract a(Ln0/o3$b;)V
.end method

.method public abstract b()V
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public abstract f(Ljava/util/List;II)Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;II)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end method

.method public h(Lg0/f1$j;)V
    .locals 0

    return-void
.end method

.method public abstract i(I)V
.end method

.method public abstract j()Ln0/n1;
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public abstract l(Ln0/n1;)V
.end method

.method public m(II)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lne/x<",
            "Lm0/m;",
            ">;"
        }
    .end annotation

    new-instance p1, Ln0/l0$a;

    invoke-direct {p1, p0}, Ln0/l0$a;-><init>(Ln0/l0;)V

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public abstract n()V
.end method
