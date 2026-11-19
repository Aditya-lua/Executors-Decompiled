.class public Lhn/h$d;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/h;->indent(Ljava/lang/String;)Lhn/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lhn/h;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lhn/h;


# direct methods
.method public constructor <init>(Lhn/h;Lhn/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhn/h$d;->c:Lhn/h;

    iput-object p2, p0, Lhn/h$d;->a:Lhn/h;

    iput-object p3, p0, Lhn/h$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Lhn/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/m;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lhn/h$d;->a:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isLenient()Z
    .locals 1

    iget-object v0, p0, Lhn/h$d;->a:Lhn/h;

    invoke-virtual {v0}, Lhn/h;->isLenient()Z

    move-result v0

    return v0
.end method

.method public toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/t;",
            "TT;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lhn/t;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lhn/h$d;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lhn/t;->z(Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lhn/h$d;->a:Lhn/h;

    invoke-virtual {v1, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lhn/t;->z(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Lhn/t;->z(Ljava/lang/String;)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhn/h$d;->a:Lhn/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".indent(\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhn/h$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
