.class public Ln0/i4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/b1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/i4;->r()Lm0/b1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln0/i4;


# direct methods
.method public constructor <init>(Ln0/i4;)V
    .locals 0

    iput-object p1, p0, Ln0/i4$a;->a:Ln0/i4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm0/c0;)Lm0/b1;
    .locals 1

    new-instance v0, Lm0/f1;

    invoke-direct {v0, p1}, Lm0/f1;-><init>(Lm0/c0;)V

    return-object v0
.end method
