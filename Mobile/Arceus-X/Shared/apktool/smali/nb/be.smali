.class public final Lnb/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/y5;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    iput-object p2, p0, Lnb/be;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/be;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/be;->c:Lnb/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7

    iget-object v0, p0, Lnb/be;->c:Lnb/me;

    iget-object v5, p0, Lnb/be;->a:Ljava/lang/String;

    iget-object v6, p0, Lnb/be;->b:Ljava/util/List;

    const/4 v1, 0x1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lnb/me;->A(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;)V

    return-void
.end method
