.class public final synthetic Lfe/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe/z;


# instance fields
.field public final synthetic a:Lfe/d;


# direct methods
.method public synthetic constructor <init>(Lfe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/x;->a:Lfe/d;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    iget-object v0, p0, Lfe/x;->a:Lfe/d;

    invoke-static {v0}, Lfe/d;->b(Lfe/d;)V

    return-void
.end method
