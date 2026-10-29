.class public final Lnb/ce;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/y5;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lnb/pe;

.field public final synthetic c:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;Ljava/lang/String;Lnb/pe;)V
    .locals 0

    iput-object p2, p0, Lnb/ce;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/ce;->b:Lnb/pe;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ce;->c:Lnb/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    iget-object v5, p0, Lnb/ce;->b:Lnb/pe;

    iget-object v0, p0, Lnb/ce;->c:Lnb/me;

    iget-object v1, p0, Lnb/ce;->a:Ljava/lang/String;

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lnb/me;->v(Ljava/lang/String;ILjava/lang/Throwable;[BLnb/pe;)V

    return-void
.end method
