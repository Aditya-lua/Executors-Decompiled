.class public final synthetic Lfb/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lfb/m0;->a:Z

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lsb/k;

    check-cast p1, Lga/c;

    iget-boolean v0, p0, Lfb/m0;->a:Z

    invoke-virtual {p1, p2, v0}, Lga/c;->g(Lsb/k;Z)V

    return-void
.end method
