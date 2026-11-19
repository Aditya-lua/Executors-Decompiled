.class public final Lm9/y0;
.super Lm9/o;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lm9/p$a;


# direct methods
.method public constructor <init>(Lm9/p$a;Lm9/k;[Lk9/d;ZI)V
    .locals 0

    iput-object p1, p0, Lm9/y0;->e:Lm9/p$a;

    invoke-direct {p0, p2, p3, p4, p5}, Lm9/o;-><init>(Lm9/k;[Lk9/d;ZI)V

    return-void
.end method


# virtual methods
.method public final d(Ll9/a$b;Ltb/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/a$b;",
            "Ltb/k<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lm9/y0;->e:Lm9/p$a;

    invoke-static {v0}, Lm9/p$a;->h(Lm9/p$a;)Lm9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lm9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
