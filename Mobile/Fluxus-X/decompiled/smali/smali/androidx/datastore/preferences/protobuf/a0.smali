.class public Landroidx/datastore/preferences/protobuf/a0;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/a0$a;
    }
.end annotation


# instance fields
.field public a:Landroidx/datastore/preferences/protobuf/r0;

.field public b:Z


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/a0;->a:Landroidx/datastore/preferences/protobuf/r0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/a0;->a:Landroidx/datastore/preferences/protobuf/r0;

    return-void
.end method

.method public static b()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e()Landroidx/datastore/preferences/protobuf/a0$a;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0$a;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static g()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static h()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static i()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static l()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static m()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/a0;->b:Z

    return v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/a0;->b:Z

    return-void
.end method

.method public k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;
    .locals 0

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/a0;->a:Landroidx/datastore/preferences/protobuf/r0;

    return-object p0
.end method
