.class public final synthetic Lz/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lz/h4;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/d4;->a:Lz/h4;

    iput-wide p2, p0, Lz/d4;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/d4;->a:Lz/h4;

    iget-wide v1, p0, Lz/d4;->b:J

    invoke-static {v0, v1, v2}, Lz/h4;->j(Lz/h4;J)V

    return-void
.end method
