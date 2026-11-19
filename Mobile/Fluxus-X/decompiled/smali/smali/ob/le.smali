.class public final Lob/le;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/d6;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lob/ye;

.field public final synthetic c:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;Ljava/lang/String;Lob/ye;)V
    .locals 0

    iput-object p2, p0, Lob/le;->a:Ljava/lang/String;

    iput-object p3, p0, Lob/le;->b:Lob/ye;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/le;->c:Lob/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    iget-object v5, p0, Lob/le;->b:Lob/ye;

    iget-object v0, p0, Lob/le;->c:Lob/ve;

    iget-object v1, p0, Lob/le;->a:Ljava/lang/String;

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lob/ve;->v(Ljava/lang/String;ILjava/lang/Throwable;[BLob/ye;)V

    return-void
.end method
