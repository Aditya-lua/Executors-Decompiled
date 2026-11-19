.class public final synthetic Lz/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/u0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ln0/o3;

.field public final synthetic d:Ln0/i4;

.field public final synthetic e:Ln0/t3;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e0;->a:Lz/u0;

    iput-object p2, p0, Lz/e0;->b:Ljava/lang/String;

    iput-object p3, p0, Lz/e0;->c:Ln0/o3;

    iput-object p4, p0, Lz/e0;->d:Ln0/i4;

    iput-object p5, p0, Lz/e0;->e:Ln0/t3;

    iput-object p6, p0, Lz/e0;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lz/e0;->a:Lz/u0;

    iget-object v1, p0, Lz/e0;->b:Ljava/lang/String;

    iget-object v2, p0, Lz/e0;->c:Ln0/o3;

    iget-object v3, p0, Lz/e0;->d:Ln0/i4;

    iget-object v4, p0, Lz/e0;->e:Ln0/t3;

    iget-object v5, p0, Lz/e0;->f:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lz/u0;->E(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    return-void
.end method
