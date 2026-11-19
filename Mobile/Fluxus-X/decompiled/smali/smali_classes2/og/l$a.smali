.class public Log/l$a;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log/l;->create(Llg/f;Lsg/a;)Llg/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Log/l;


# direct methods
.method public constructor <init>(Log/l;)V
    .locals 0

    iput-object p1, p0, Log/l$a;->a:Log/l;

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->n0()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AnonymousOrNonStaticLocalClassAdapter"

    return-object v0
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void
.end method
