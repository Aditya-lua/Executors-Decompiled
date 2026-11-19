.class public Lje/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/p$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/p;->g(Lje/d;)Lje/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lje/d;


# direct methods
.method public constructor <init>(Lje/d;)V
    .locals 0

    iput-object p1, p0, Lje/p$a;->a:Lje/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lje/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lje/p$a;->b(Lje/p;Ljava/lang/CharSequence;)Lje/p$d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lje/p;Ljava/lang/CharSequence;)Lje/p$d;
    .locals 1

    new-instance v0, Lje/p$a$a;

    invoke-direct {v0, p0, p1, p2}, Lje/p$a$a;-><init>(Lje/p$a;Lje/p;Ljava/lang/CharSequence;)V

    return-object v0
.end method
