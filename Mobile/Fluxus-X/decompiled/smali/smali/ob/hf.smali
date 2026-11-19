.class public final Lob/hf;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lob/hf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Z

.field public final B:J

.field public final C:I

.field public final D:Ljava/lang/String;

.field public final E:I

.field public final F:J

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:J

.field public final J:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:J

.field public final k:J

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Z

.field public final o:J

.field public final p:Ljava/lang/String;

.field public final q:J

.field public final r:I

.field public final s:Z

.field public final t:Z

.field public final u:Ljava/lang/Boolean;

.field public final v:J

.field public final w:Ljava/util/List;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/jf;

    invoke-direct {v0}, Lob/jf;-><init>()V

    sput-object v0, Lob/hf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    .line 2
    invoke-static {p1}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lob/hf;->f:Ljava/lang/String;

    const/4 p1, 0x1

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Lob/hf;->g:Ljava/lang/String;

    iput-object p3, p0, Lob/hf;->h:Ljava/lang/String;

    iput-wide p4, p0, Lob/hf;->o:J

    iput-object p6, p0, Lob/hf;->i:Ljava/lang/String;

    iput-wide p7, p0, Lob/hf;->j:J

    iput-wide p9, p0, Lob/hf;->k:J

    iput-object p11, p0, Lob/hf;->l:Ljava/lang/String;

    iput-boolean p12, p0, Lob/hf;->m:Z

    iput-boolean p13, p0, Lob/hf;->n:Z

    iput-object p14, p0, Lob/hf;->p:Ljava/lang/String;

    move-wide/from16 p1, p15

    iput-wide p1, p0, Lob/hf;->q:J

    move/from16 p1, p17

    iput p1, p0, Lob/hf;->r:I

    move/from16 p1, p18

    iput-boolean p1, p0, Lob/hf;->s:Z

    move/from16 p1, p19

    iput-boolean p1, p0, Lob/hf;->t:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Lob/hf;->u:Ljava/lang/Boolean;

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lob/hf;->v:J

    move-object/from16 p1, p23

    iput-object p1, p0, Lob/hf;->w:Ljava/util/List;

    move-object/from16 p1, p24

    iput-object p1, p0, Lob/hf;->x:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lob/hf;->y:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lob/hf;->z:Ljava/lang/String;

    move/from16 p1, p27

    iput-boolean p1, p0, Lob/hf;->A:Z

    move-wide/from16 p1, p28

    iput-wide p1, p0, Lob/hf;->B:J

    move/from16 p1, p30

    iput p1, p0, Lob/hf;->C:I

    move-object/from16 p1, p31

    iput-object p1, p0, Lob/hf;->D:Ljava/lang/String;

    move/from16 p1, p32

    iput p1, p0, Lob/hf;->E:I

    move-wide/from16 p1, p33

    iput-wide p1, p0, Lob/hf;->F:J

    move-object/from16 p1, p35

    iput-object p1, p0, Lob/hf;->G:Ljava/lang/String;

    move-object/from16 p1, p36

    iput-object p1, p0, Lob/hf;->H:Ljava/lang/String;

    move-wide/from16 p1, p37

    iput-wide p1, p0, Lob/hf;->I:J

    move/from16 p1, p39

    iput p1, p0, Lob/hf;->J:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-object p1, p0, Lob/hf;->f:Ljava/lang/String;

    iput-object p2, p0, Lob/hf;->g:Ljava/lang/String;

    iput-object p3, p0, Lob/hf;->h:Ljava/lang/String;

    iput-wide p12, p0, Lob/hf;->o:J

    iput-object p4, p0, Lob/hf;->i:Ljava/lang/String;

    iput-wide p5, p0, Lob/hf;->j:J

    iput-wide p7, p0, Lob/hf;->k:J

    iput-object p9, p0, Lob/hf;->l:Ljava/lang/String;

    iput-boolean p10, p0, Lob/hf;->m:Z

    iput-boolean p11, p0, Lob/hf;->n:Z

    iput-object p14, p0, Lob/hf;->p:Ljava/lang/String;

    move-wide p1, p15

    iput-wide p1, p0, Lob/hf;->q:J

    move/from16 p1, p17

    iput p1, p0, Lob/hf;->r:I

    move/from16 p1, p18

    iput-boolean p1, p0, Lob/hf;->s:Z

    move/from16 p1, p19

    iput-boolean p1, p0, Lob/hf;->t:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Lob/hf;->u:Ljava/lang/Boolean;

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lob/hf;->v:J

    move-object/from16 p1, p23

    iput-object p1, p0, Lob/hf;->w:Ljava/util/List;

    move-object/from16 p1, p24

    iput-object p1, p0, Lob/hf;->x:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lob/hf;->y:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lob/hf;->z:Ljava/lang/String;

    move/from16 p1, p27

    iput-boolean p1, p0, Lob/hf;->A:Z

    move-wide/from16 p1, p28

    iput-wide p1, p0, Lob/hf;->B:J

    move/from16 p1, p30

    iput p1, p0, Lob/hf;->C:I

    move-object/from16 p1, p31

    iput-object p1, p0, Lob/hf;->D:Ljava/lang/String;

    move/from16 p1, p32

    iput p1, p0, Lob/hf;->E:I

    move-wide/from16 p1, p33

    iput-wide p1, p0, Lob/hf;->F:J

    move-object/from16 p1, p35

    iput-object p1, p0, Lob/hf;->G:Ljava/lang/String;

    move-object/from16 p1, p36

    iput-object p1, p0, Lob/hf;->H:Ljava/lang/String;

    move-wide/from16 p1, p37

    iput-wide p1, p0, Lob/hf;->I:J

    move/from16 p1, p39

    iput p1, p0, Lob/hf;->J:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    iget-object p2, p0, Lob/hf;->f:Ljava/lang/String;

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget-object v1, p0, Lob/hf;->g:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x4

    iget-object v1, p0, Lob/hf;->h:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x5

    iget-object v1, p0, Lob/hf;->i:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x6

    iget-wide v3, p0, Lob/hf;->j:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/4 p2, 0x7

    iget-wide v3, p0, Lob/hf;->k:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x8

    iget-object v1, p0, Lob/hf;->l:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x9

    iget-boolean v1, p0, Lob/hf;->m:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    iget-boolean v1, p0, Lob/hf;->n:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    iget-wide v3, p0, Lob/hf;->o:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0xc

    iget-object v1, p0, Lob/hf;->p:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0xe

    iget-wide v3, p0, Lob/hf;->q:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0xf

    iget v1, p0, Lob/hf;->r:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0x10

    iget-boolean v1, p0, Lob/hf;->s:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x12

    iget-boolean v1, p0, Lob/hf;->t:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x15

    iget-object v1, p0, Lob/hf;->u:Ljava/lang/Boolean;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->e(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    const/16 p2, 0x16

    iget-wide v3, p0, Lob/hf;->v:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x17

    iget-object v1, p0, Lob/hf;->w:Ljava/util/List;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->x(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 p2, 0x19

    iget-object v1, p0, Lob/hf;->x:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x1a

    iget-object v1, p0, Lob/hf;->y:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x1b

    iget-object v1, p0, Lob/hf;->z:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x1c

    iget-boolean v1, p0, Lob/hf;->A:Z

    invoke-static {p1, p2, v1}, Lp9/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x1d

    iget-wide v3, p0, Lob/hf;->B:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x1e

    iget v1, p0, Lob/hf;->C:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0x1f

    iget-object v1, p0, Lob/hf;->D:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x20

    iget v1, p0, Lob/hf;->E:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/16 p2, 0x22

    iget-wide v3, p0, Lob/hf;->F:J

    invoke-static {p1, p2, v3, v4}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x23

    iget-object v1, p0, Lob/hf;->G:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x24

    iget-object v1, p0, Lob/hf;->H:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lp9/c;->v(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x25

    iget-wide v1, p0, Lob/hf;->I:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x26

    iget v1, p0, Lob/hf;->J:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
