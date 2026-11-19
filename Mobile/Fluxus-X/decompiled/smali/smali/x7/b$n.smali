.class public Lx7/b$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx7/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lx7/b$n;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx7/b$q;Lx7/g$l0;)Z
    .locals 0

    iget-object p1, p2, Lx7/g$n0;->b:Lx7/g$j0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "root"

    return-object v0
.end method
