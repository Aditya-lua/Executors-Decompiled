.class public final synthetic Lnb/r5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lnb/s5;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lnb/s5;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/r5;->a:Lnb/s5;

    iput-wide p2, p0, Lnb/r5;->b:J

    return-void
.end method


# virtual methods
.method public final synthetic onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lnb/r5;->a:Lnb/s5;

    iget-wide v1, p0, Lnb/r5;->b:J

    invoke-virtual {v0, v1, v2, p1}, Lnb/s5;->c(JLjava/lang/Exception;)V

    return-void
.end method
