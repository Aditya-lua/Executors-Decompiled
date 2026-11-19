.class public Lha/b;
.super Lha/a;
.source "SourceFile"


# instance fields
.field public final a:Lm9/d;


# direct methods
.method public constructor <init>(Lm9/d;)V
    .locals 1

    invoke-direct {p0}, Lha/a;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/d;

    iput-object p1, p0, Lha/b;->a:Lm9/d;

    return-void
.end method


# virtual methods
.method public final s2(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lha/b;->a:Lm9/d;

    invoke-interface {v0, p1}, Lm9/d;->a(Ljava/lang/Object;)V

    return-void
.end method
