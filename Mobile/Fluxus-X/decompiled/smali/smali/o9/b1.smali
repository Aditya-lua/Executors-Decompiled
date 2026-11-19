.class public final Lo9/b1;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:Lk9/b;


# direct methods
.method public constructor <init>(Lk9/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Lk9/b;->E3()Z

    move-result v0

    const-string v1, "ResolvableConnectionException can only be created with a connection result containing a resolution."

    invoke-static {v0, v1}, Lo9/s;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lo9/b1;->a:Lk9/b;

    return-void
.end method
