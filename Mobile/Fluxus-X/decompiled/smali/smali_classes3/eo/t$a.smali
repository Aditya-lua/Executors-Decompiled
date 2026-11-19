.class public Leo/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leo/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Leo/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Leo/s;

.field public final b:Leo/s;


# direct methods
.method public constructor <init>(Leo/s;Leo/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Leo/t$a;->a:Leo/s;

    .line 4
    iput-object p2, p0, Leo/t$a;->b:Leo/s;

    return-void
.end method

.method public synthetic constructor <init>(Leo/s;Leo/s;Leo/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Leo/t$a;-><init>(Leo/s;Leo/s;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Leo/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Leo/t$b;

    iget-object v1, p0, Leo/t$a;->a:Leo/s;

    iget-object v2, p0, Leo/t$a;->b:Leo/s;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Leo/t$b;-><init>(Leo/s;Leo/s;Leo/u;)V

    return-object v0
.end method
