.class public final synthetic Lfe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/u0;


# instance fields
.field public final synthetic a:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/s;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfe/s;->a:Ljava/io/File;

    invoke-static {v0}, Lfe/d;->a(Ljava/io/File;)Lfe/v;

    move-result-object v0

    return-object v0
.end method
