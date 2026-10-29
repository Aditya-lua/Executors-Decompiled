.class public final synthetic Lnb/f7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/sa;


# instance fields
.field public final synthetic a:Lnb/g7;


# direct methods
.method public synthetic constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/f7;->a:Lnb/g7;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    iget-object v0, p0, Lnb/f7;->a:Lnb/g7;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lnb/g7;->o(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
