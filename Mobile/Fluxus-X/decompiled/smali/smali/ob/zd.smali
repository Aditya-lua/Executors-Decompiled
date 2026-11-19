.class public Lob/zd;
.super Lob/o8;
.source "SourceFile"

# interfaces
.implements Lob/q8;


# instance fields
.field public final b:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 1

    invoke-virtual {p1}, Lob/ve;->g0()Lob/l7;

    move-result-object v0

    invoke-direct {p0, v0}, Lob/o8;-><init>(Lob/l7;)V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/zd;->b:Lob/ve;

    return-void
.end method
