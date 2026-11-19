.class public final synthetic Lnv/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/s$d;


# instance fields
.field public final synthetic a:Lmv/s;


# direct methods
.method public synthetic constructor <init>(Lmv/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnv/o;->a:Lmv/s;

    return-void
.end method


# virtual methods
.method public final a(Lmv/e;)Lmv/s;
    .locals 1

    iget-object v0, p0, Lnv/o;->a:Lmv/s;

    invoke-static {v0, p1}, Lnv/q;->b(Lmv/s;Lmv/e;)Lmv/s;

    move-result-object p1

    return-object p1
.end method
