.class public final Lcom/google/androidgamesdk/gametextinput/State;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field public composingRegionEnd:I

.field public composingRegionStart:I

.field public selectionEnd:I

.field public selectionStart:I

.field public text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/androidgamesdk/gametextinput/State;->text:Ljava/lang/String;

    iput p2, p0, Lcom/google/androidgamesdk/gametextinput/State;->selectionStart:I

    iput p3, p0, Lcom/google/androidgamesdk/gametextinput/State;->selectionEnd:I

    iput p4, p0, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionStart:I

    iput p5, p0, Lcom/google/androidgamesdk/gametextinput/State;->composingRegionEnd:I

    return-void
.end method
