.class public Laj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laj/a;->d(Ljava/util/Locale;Lyi/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/f<",
        "Lmv/i0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lyi/g;

.field public final synthetic b:Laj/a;


# direct methods
.method public constructor <init>(Laj/a;Lyi/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Laj/a$a;->b:Laj/a;

    iput-object p2, p0, Laj/a$a;->a:Lyi/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsw/d;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "Lmv/i0;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Laj/a$a;->b:Laj/a;

    iget-object p2, p0, Laj/a$a;->a:Lyi/g;

    invoke-virtual {p1, p2}, Laj/a;->b(Lyi/g;)V

    return-void
.end method

.method public b(Lsw/d;Lsw/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "Lmv/i0;",
            ">;",
            "Lsw/x<",
            "Lmv/i0;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Laj/a$a;->b:Laj/a;

    invoke-static {p2}, Lok/y;->a(Lsw/x;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lsw/x;->b()I

    move-result p2

    iget-object v1, p0, Laj/a$a;->a:Lyi/g;

    invoke-virtual {p1, v0, p2, v1}, Laj/a;->c(Ljava/lang/String;ILyi/g;)V

    return-void
.end method
