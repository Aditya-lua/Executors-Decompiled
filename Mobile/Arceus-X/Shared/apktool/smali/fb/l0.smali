.class public final synthetic Lfb/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/l0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lsb/k;

    check-cast p1, Lga/c;

    iget-object v0, p0, Lfb/l0;->a:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lga/c;->h(Lsb/k;Ljava/lang/String;)V

    return-void
.end method
