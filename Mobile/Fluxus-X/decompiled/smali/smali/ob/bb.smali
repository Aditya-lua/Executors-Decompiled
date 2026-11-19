.class public final Lob/bb;
.super Lob/ge;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 0

    invoke-direct {p0, p1}, Lob/ge;-><init>(Lob/ve;)V

    return-void
.end method

.method public static final m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
