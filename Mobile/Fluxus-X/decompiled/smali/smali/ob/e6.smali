.class public final Lob/e6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lob/d6;

.field public final b:I

.field public final c:Ljava/lang/Throwable;

.field public final d:[B

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lob/d6;ILjava/lang/Throwable;[BLjava/util/Map;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lob/e6;->a:Lob/d6;

    iput p3, p0, Lob/e6;->b:I

    iput-object p4, p0, Lob/e6;->c:Ljava/lang/Throwable;

    iput-object p5, p0, Lob/e6;->d:[B

    iput-object p1, p0, Lob/e6;->e:Ljava/lang/String;

    iput-object p6, p0, Lob/e6;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lob/e6;->a:Lob/d6;

    iget-object v1, p0, Lob/e6;->e:Ljava/lang/String;

    iget v2, p0, Lob/e6;->b:I

    iget-object v3, p0, Lob/e6;->c:Ljava/lang/Throwable;

    iget-object v4, p0, Lob/e6;->d:[B

    iget-object v5, p0, Lob/e6;->f:Ljava/util/Map;

    invoke-interface/range {v0 .. v5}, Lob/d6;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
