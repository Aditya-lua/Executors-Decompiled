.class public Lum/h$b;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/h;->lenient()Lum/h;
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

    iput-object p1, p0, Lum/h$b;->b:Lum/h;

    iput-object p2, p0, Lum/h$b;->a:Lum/h;

    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/m;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lum/m;->g()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lum/m;->L(Z)V

    :try_start_0
    iget-object v1, p0, Lum/h$b;->a:Lum/h;

    invoke-virtual {v1, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lum/m;->L(Z)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Lum/m;->L(Z)V

    throw v1
.end method

.method public isLenient()Z
    .locals 1

    const/4 v0, 0x1

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

    invoke-virtual {p1}, Lum/t;->l()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lum/t;->y(Z)V

    :try_start_0
    iget-object v1, p0, Lum/h$b;->a:Lum/h;

    invoke-virtual {v1, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lum/t;->y(Z)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Lum/t;->y(Z)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lum/h$b;->a:Lum/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".lenient()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
