.class public final Lm9/z0;
.super Lm9/w;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lm9/p$a;


# direct methods
.method public constructor <init>(Lm9/p$a;Lm9/k$a;)V
    .locals 0

    iput-object p1, p0, Lm9/z0;->b:Lm9/p$a;

    invoke-direct {p0, p2}, Lm9/w;-><init>(Lm9/k$a;)V

    return-void
.end method


# virtual methods
.method public final b(Ll9/a$b;Ltb/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/a$b;",
            "Ltb/k<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lm9/z0;->b:Lm9/p$a;

    invoke-static {v0}, Lm9/p$a;->i(Lm9/p$a;)Lm9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lm9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
