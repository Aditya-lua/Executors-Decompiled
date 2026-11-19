.class public final synthetic Lob/ue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/d6;


# instance fields
.field public final synthetic a:Lob/ve;


# direct methods
.method public synthetic constructor <init>(Lob/ve;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ue;->a:Lob/ve;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    iget-object v0, p0, Lob/ue;->a:Lob/ve;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lob/ve;->C(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
