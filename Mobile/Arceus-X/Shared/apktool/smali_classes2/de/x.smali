.class public final synthetic Lde/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/z;


# instance fields
.field public final synthetic a:Lde/d;


# direct methods
.method public synthetic constructor <init>(Lde/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/x;->a:Lde/d;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    iget-object v0, p0, Lde/x;->a:Lde/d;

    invoke-static {v0}, Lde/d;->b(Lde/d;)V

    return-void
.end method
