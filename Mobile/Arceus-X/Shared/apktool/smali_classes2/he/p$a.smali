.class public Lhe/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/p$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe/p;->g(Lhe/d;)Lhe/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhe/d;


# direct methods
.method public constructor <init>(Lhe/d;)V
    .locals 0

    iput-object p1, p0, Lhe/p$a;->a:Lhe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lhe/p;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lhe/p$a;->b(Lhe/p;Ljava/lang/CharSequence;)Lhe/p$d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lhe/p;Ljava/lang/CharSequence;)Lhe/p$d;
    .locals 1

    new-instance v0, Lhe/p$a$a;

    invoke-direct {v0, p0, p1, p2}, Lhe/p$a$a;-><init>(Lhe/p$a;Lhe/p;Ljava/lang/CharSequence;)V

    return-object v0
.end method
