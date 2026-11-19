.class public final Lhn/y$m;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhn/w;

.field public final b:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/w;)V
    .locals 1

    invoke-direct {p0}, Lhn/h;-><init>()V

    iput-object p1, p0, Lhn/y$m;->a:Lhn/w;

    const-class v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object v0

    iput-object v0, p0, Lhn/y$m;->b:Lhn/h;

    const-class v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object v0

    iput-object v0, p0, Lhn/y$m;->c:Lhn/h;

    const-class v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object v0

    iput-object v0, p0, Lhn/y$m;->d:Lhn/h;

    const-class v0, Ljava/lang/Double;

    invoke-virtual {p1, v0}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object v0

    iput-object v0, p0, Lhn/y$m;->e:Lhn/h;

    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lhn/w;->c(Ljava/lang/Class;)Lhn/h;

    move-result-object p1

    iput-object p1, p0, Lhn/y$m;->f:Lhn/h;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    return-object p1
.end method

.method public fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lhn/y$b;->a:[I

    invoke-virtual {p1}, Lhn/m;->w()Lhn/m$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a value but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhn/m;->w()Lhn/m$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhn/m;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p1}, Lhn/m;->p()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhn/y$m;->f:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhn/y$m;->e:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lhn/y$m;->d:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lhn/y$m;->c:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lhn/y$m;->b:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void

    :cond_0
    iget-object v1, p0, Lhn/y$m;->a:Lhn/w;

    invoke-virtual {p0, v0}, Lhn/y$m;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Ljn/c;->a:Ljava/util/Set;

    invoke-virtual {v1, v0, v2}, Lhn/w;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)Lhn/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JsonAdapter(Object)"

    return-object v0
.end method
