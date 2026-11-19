.class public Lng/b0$c$a;
.super Lng/b0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng/b0$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lng/b0<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lng/b0$c;


# direct methods
.method public constructor <init>(Lng/b0$c;)V
    .locals 0

    iput-object p1, p0, Lng/b0$c$a;->e:Lng/b0$c;

    iget-object p1, p1, Lng/b0$c;->a:Lng/b0;

    invoke-direct {p0, p1}, Lng/b0$d;-><init>(Lng/b0;)V

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

    invoke-virtual {p0}, Lng/b0$d;->b()Lng/b0$e;

    move-result-object v0

    iget-object v0, v0, Lng/b0$e;->f:Ljava/lang/Object;

    return-object v0
.end method
