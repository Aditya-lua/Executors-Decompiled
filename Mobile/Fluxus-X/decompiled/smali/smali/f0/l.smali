.class public Lf0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/l$a;
    }
.end annotation


# instance fields
.field public final P:Ln0/n1;


# direct methods
.method public constructor <init>(Ln0/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/l;->P:Ln0/n1;

    return-void
.end method


# virtual methods
.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lf0/l;->P:Ln0/n1;

    return-object v0
.end method
