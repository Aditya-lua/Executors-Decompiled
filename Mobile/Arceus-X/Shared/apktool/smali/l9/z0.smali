.class public final Ll9/z0;
.super Ll9/w;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ll9/p$a;


# direct methods
.method public constructor <init>(Ll9/p$a;Ll9/k$a;)V
    .locals 0

    iput-object p1, p0, Ll9/z0;->b:Ll9/p$a;

    invoke-direct {p0, p2}, Ll9/w;-><init>(Ll9/k$a;)V

    return-void
.end method


# virtual methods
.method public final b(Lk9/a$b;Lsb/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk9/a$b;",
            "Lsb/k<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll9/z0;->b:Ll9/p$a;

    invoke-static {v0}, Ll9/p$a;->i(Ll9/p$a;)Ll9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
