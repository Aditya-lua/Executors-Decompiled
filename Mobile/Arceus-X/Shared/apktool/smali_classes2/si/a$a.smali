.class public Lsi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsi/a;->d(Ljava/util/Locale;Lqi/g;)V
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
.field public final synthetic a:Lqi/g;

.field public final synthetic b:Lsi/a;


# direct methods
.method public constructor <init>(Lsi/a;Lqi/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lsi/a$a;->b:Lsi/a;

    iput-object p2, p0, Lsi/a$a;->a:Lqi/g;

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

    iget-object p1, p0, Lsi/a$a;->b:Lsi/a;

    invoke-static {p2}, Lgk/y;->a(Ljv/x;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljv/x;->b()I

    move-result p2

    iget-object v1, p0, Lsi/a$a;->a:Lqi/g;

    invoke-virtual {p1, v0, p2, v1}, Lsi/a;->c(Ljava/lang/String;ILqi/g;)V

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

    iget-object p1, p0, Lsi/a$a;->b:Lsi/a;

    iget-object p2, p0, Lsi/a$a;->a:Lqi/g;

    invoke-virtual {p1, p2}, Lsi/a;->b(Lqi/g;)V

    return-void
.end method
