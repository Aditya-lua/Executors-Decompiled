.class public abstract synthetic Lcom/withpersona/sdk2/inquiry/tracking/model/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lum/w;Ljava/lang/Class;Ljava/lang/String;)Lum/h;
    .locals 1

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lum/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lum/h;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method
