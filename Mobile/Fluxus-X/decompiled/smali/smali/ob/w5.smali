.class public final synthetic Lob/w5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f;


# instance fields
.field public final synthetic a:Lob/x5;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lob/x5;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/w5;->a:Lob/x5;

    iput-wide p2, p0, Lob/w5;->b:J

    return-void
.end method


# virtual methods
.method public final synthetic onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lob/w5;->a:Lob/x5;

    iget-wide v1, p0, Lob/w5;->b:J

    invoke-virtual {v0, v1, v2, p1}, Lob/x5;->c(JLjava/lang/Exception;)V

    return-void
.end method
