.class public Lum/u$e$a;
.super Lum/u$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/u$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/u<",
        "TK;TV;>.f<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lum/u$e;


# direct methods
.method public constructor <init>(Lum/u$e;)V
    .locals 0

    iput-object p1, p0, Lum/u$e$a;->e:Lum/u$e;

    iget-object p1, p1, Lum/u$e;->a:Lum/u;

    invoke-direct {p0, p1}, Lum/u$f;-><init>(Lum/u;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lum/u$f;->b()Lum/u$g;

    move-result-object v0

    iget-object v0, v0, Lum/u$g;->f:Ljava/lang/Object;

    return-object v0
.end method
