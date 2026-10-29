.class public final synthetic Lde/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/u0;


# instance fields
.field public final synthetic a:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/s;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lde/s;->a:Ljava/io/File;

    invoke-static {v0}, Lde/d;->a(Ljava/io/File;)Lde/v;

    move-result-object v0

    return-object v0
.end method
