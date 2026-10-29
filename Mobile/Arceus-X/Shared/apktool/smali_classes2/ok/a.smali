.class public Lok/a;
.super Lok/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const-string p1, "Focused"

    goto :goto_0

    :cond_0
    const-string p1, "Unfocused"

    :goto_0
    const-string v0, "AppInput"

    const-string v1, ""

    invoke-direct {p0, v0, v1, p1}, Lok/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
