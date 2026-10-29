.class public final Lw1/a$b;
.super Lw1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw1/f<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lw1/a;


# direct methods
.method public constructor <init>(Lw1/a;)V
    .locals 0

    iput-object p1, p0, Lw1/a$b;->d:Lw1/a;

    invoke-virtual {p1}, Lw1/j;->size()I

    move-result p1

    invoke-direct {p0, p1}, Lw1/f;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, Lw1/a$b;->d:Lw1/a;

    invoke-virtual {v0, p1}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lw1/a$b;->d:Lw1/a;

    invoke-virtual {v0, p1}, Lw1/j;->i(I)Ljava/lang/Object;

    return-void
.end method
