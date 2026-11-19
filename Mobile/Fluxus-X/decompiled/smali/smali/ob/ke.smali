.class public final Lob/ke;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/d6;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    iput-object p2, p0, Lob/ke;->a:Ljava/lang/String;

    iput-object p3, p0, Lob/ke;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ke;->c:Lob/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7

    iget-object v0, p0, Lob/ke;->c:Lob/ve;

    iget-object v5, p0, Lob/ke;->a:Ljava/lang/String;

    iget-object v6, p0, Lob/ke;->b:Ljava/util/List;

    const/4 v1, 0x1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lob/ve;->A(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    return-void
.end method
