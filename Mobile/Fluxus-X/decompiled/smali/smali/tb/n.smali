.class public final Ltb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/g;


# instance fields
.field public final synthetic a:Ltb/h;


# direct methods
.method public constructor <init>(Ltb/s;Ltb/h;)V
    .locals 0

    iput-object p2, p0, Ltb/n;->a:Ltb/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Ltb/n;->a:Ltb/h;

    invoke-interface {p1}, Ltb/h;->a()V

    return-void
.end method
