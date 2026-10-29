.class public Lum/y$a;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lum/m;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lum/m;->r()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lum/t;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    return-void
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lum/y$a;->a(Lum/m;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lum/y$a;->b(Lum/t;Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JsonAdapter(String)"

    return-object v0
.end method
