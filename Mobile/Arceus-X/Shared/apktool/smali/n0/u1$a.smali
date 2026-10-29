.class public final Ln0/u1$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ln0/u1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln0/u1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ln0/u1$a;->a:Ln0/u1;

    return-void
.end method


# virtual methods
.method public a()Ln0/u1;
    .locals 1

    iget-object v0, p0, Ln0/u1$a;->a:Ln0/u1;

    return-object v0
.end method
