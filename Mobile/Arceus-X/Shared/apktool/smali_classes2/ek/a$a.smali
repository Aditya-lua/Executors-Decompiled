.class public Lek/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lek/a;->d(JLdk/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljv/f<",
        "Lokhttp3/ResponseBody;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ldk/a;

.field public final synthetic b:Lek/a;


# direct methods
.method public constructor <init>(Lek/a;Ldk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lek/a$a;->b:Lek/a;

    iput-object p2, p0, Lek/a$a;->a:Ldk/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljv/d;Ljv/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;",
            "Ljv/x<",
            "Lokhttp3/ResponseBody;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lek/a$a;->b:Lek/a;

    invoke-static {p2}, Lgk/y;->a(Ljv/x;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljv/x;->b()I

    move-result p2

    iget-object v1, p0, Lek/a$a;->a:Ldk/a;

    invoke-virtual {p1, v0, p2, v1}, Lek/a;->c(Ljava/lang/String;ILdk/a;)V

    return-void
.end method

.method public b(Ljv/d;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lek/a$a;->b:Lek/a;

    iget-object p2, p0, Lek/a$a;->a:Ldk/a;

    invoke-virtual {p1, p2}, Lek/a;->b(Ldk/a;)V

    return-void
.end method
