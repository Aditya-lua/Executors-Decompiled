.class public Lad/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Led/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/a;->P(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lad/a;


# direct methods
.method public constructor <init>(Lad/a;)V
    .locals 0

    iput-object p1, p0, Lad/a$a;->a:Lad/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lad/a$a;->a:Lad/a;

    invoke-virtual {v0, p1}, Lad/a;->T(Landroid/graphics/Typeface;)V

    return-void
.end method
