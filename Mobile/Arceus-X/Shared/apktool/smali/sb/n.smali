.class public final Lsb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lsb/h;


# direct methods
.method public constructor <init>(Lsb/s;Lsb/h;)V
    .locals 0

    iput-object p2, p0, Lsb/n;->a:Lsb/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lsb/n;->a:Lsb/h;

    invoke-interface {p1}, Lsb/h;->a()V

    return-void
.end method
