.class public final Lm9/g1;
.super Lm9/u;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lm9/u$a;


# direct methods
.method public constructor <init>(Lm9/u$a;[Lk9/d;ZI)V
    .locals 0

    iput-object p1, p0, Lm9/g1;->d:Lm9/u$a;

    invoke-direct {p0, p2, p3, p4}, Lm9/u;-><init>([Lk9/d;ZI)V

    return-void
.end method


# virtual methods
.method public final d(Ll9/a$b;Ltb/k;)V
    .locals 1

    iget-object v0, p0, Lm9/g1;->d:Lm9/u$a;

    invoke-static {v0}, Lm9/u$a;->f(Lm9/u$a;)Lm9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lm9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
