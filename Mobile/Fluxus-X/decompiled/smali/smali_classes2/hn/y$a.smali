.class public Lhn/y$a;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhn/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhn/m;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lhn/m;->s()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lhn/t;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lhn/t;->Q(Ljava/lang/String;)Lhn/t;

    return-void
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lhn/y$a;->a(Lhn/m;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lhn/y$a;->b(Lhn/t;Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JsonAdapter(String)"

    return-object v0
.end method
