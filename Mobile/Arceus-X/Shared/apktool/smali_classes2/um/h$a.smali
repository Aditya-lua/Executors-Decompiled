.class public Lum/h$a;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/h;->serializeNulls()Lum/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lum/h;

.field public final synthetic b:Lum/h;


# direct methods
.method public constructor <init>(Lum/h;Lum/h;)V
    .locals 0

    iput-object p1, p0, Lum/h$a;->b:Lum/h;

    iput-object p2, p0, Lum/h$a;->a:Lum/h;

    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/m;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lum/h$a;->a:Lum/h;

    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isLenient()Z
    .locals 1

    iget-object v0, p0, Lum/h$a;->a:Lum/h;

    invoke-virtual {v0}, Lum/h;->isLenient()Z

    move-result v0

    return v0
.end method

.method public toJson(Lum/t;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/t;",
            "TT;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lum/t;->j()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lum/t;->B(Z)V

    :try_start_0
    iget-object v1, p0, Lum/h$a;->a:Lum/h;

    invoke-virtual {v1, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lum/t;->B(Z)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Lum/t;->B(Z)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lum/h$a;->a:Lum/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".serializeNulls()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
