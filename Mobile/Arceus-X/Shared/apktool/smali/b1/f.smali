.class public final synthetic Lb1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/g$a;


# instance fields
.field public final synthetic a:Lb1/g;


# direct methods
.method public synthetic constructor <init>(Lb1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/f;->a:Lb1/g;

    return-void
.end method


# virtual methods
.method public final a(II)Lne/x;
    .locals 1

    iget-object v0, p0, Lb1/f;->a:Lb1/g;

    invoke-static {v0, p1, p2}, Lb1/g;->h0(Lb1/g;II)Lne/x;

    move-result-object p1

    return-object p1
.end method
