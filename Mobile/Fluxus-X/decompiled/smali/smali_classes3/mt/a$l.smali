.class public Lmt/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmt/a;->t(Llt/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llt/m$c<",
        "Leo/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Llt/m;Leo/s;)V
    .locals 0
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Leo/h;

    invoke-virtual {p0, p1, p2}, Lmt/a$l;->b(Llt/m;Leo/h;)V

    return-void
.end method

.method public b(Llt/m;Leo/h;)V
    .locals 2
    .param p1    # Llt/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Leo/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Leo/h;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Leo/h;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lmt/a;->I(Llt/m;Ljava/lang/String;Ljava/lang/String;Leo/s;)V

    return-void
.end method
