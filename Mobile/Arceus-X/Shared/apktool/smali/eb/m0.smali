.class public abstract Leb/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Leb/m0;
    .locals 1

    sget-object v0, Leb/z;->a:Leb/z;

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)Leb/m0;
    .locals 1

    new-instance v0, Leb/o0;

    invoke-direct {v0, p0}, Leb/o0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b()Z
.end method
