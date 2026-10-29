.class public final Lnb/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:Lnb/y1;


# direct methods
.method public constructor <init>(Lnb/y1;Ljava/lang/String;J)V
    .locals 0

    iput-object p2, p0, Lnb/y;->a:Ljava/lang/String;

    iput-wide p3, p0, Lnb/y;->b:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/y;->c:Lnb/y1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/y;->c:Lnb/y1;

    iget-object v1, p0, Lnb/y;->a:Ljava/lang/String;

    iget-wide v2, p0, Lnb/y;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lnb/y1;->m(Ljava/lang/String;J)V

    return-void
.end method
