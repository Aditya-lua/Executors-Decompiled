.class public Lob/f4;
.super Lob/o8;
.source "SourceFile"

# interfaces
.implements Lob/q8;


# direct methods
.method public constructor <init>(Lob/l7;)V
    .locals 0

    invoke-direct {p0, p1}, Lob/o8;-><init>(Lob/l7;)V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 1

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->b()Lob/h7;

    move-result-object v0

    invoke-virtual {v0}, Lob/o8;->h()V

    return-void
.end method
