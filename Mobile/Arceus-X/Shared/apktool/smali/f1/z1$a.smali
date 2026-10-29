.class public Lf1/z1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/z1;->i(Lg0/v2;Lm1/p1;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Lm1/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf1/z1;


# direct methods
.method public constructor <init>(Lf1/z1;)V
    .locals 0

    iput-object p1, p0, Lf1/z1$a;->a:Lf1/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm1/l;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "VideoEncoderSession"

    const-string v1, "VideoEncoder configuration failed."

    invoke-static {v0, v1, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lf1/z1$a;->a:Lf1/z1;

    invoke-virtual {p1}, Lf1/z1;->r()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm1/l;

    invoke-virtual {p0, p1}, Lf1/z1$a;->a(Lm1/l;)V

    return-void
.end method
