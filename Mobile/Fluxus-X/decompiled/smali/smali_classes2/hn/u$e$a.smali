.class public Lhn/u$e$a;
.super Lhn/u$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/u$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/u<",
        "TK;TV;>.f<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lhn/u$e;


# direct methods
.method public constructor <init>(Lhn/u$e;)V
    .locals 0

    iput-object p1, p0, Lhn/u$e$a;->e:Lhn/u$e;

    iget-object p1, p1, Lhn/u$e;->a:Lhn/u;

    invoke-direct {p0, p1}, Lhn/u$f;-><init>(Lhn/u;)V

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

    invoke-virtual {p0}, Lhn/u$f;->b()Lhn/u$g;

    move-result-object v0

    iget-object v0, v0, Lhn/u$g;->f:Ljava/lang/Object;

    return-object v0
.end method
