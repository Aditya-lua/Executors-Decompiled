; FUN_00b8a264 @ 00b8a264
00b8a264	and w8,w1,#0xffffff00
00b8a268	cbz w0,0x00b8a2ac
00b8a26c	mov w9,#0x200
00b8a270	movk w9,#0x600, LSL #16
00b8a274	cmp w8,w9
00b8a278	b.eq 0x00b8a29c
00b8a27c	mov w9,#0x300
00b8a280	movk w9,#0x600, LSL #16
00b8a284	cmp w8,w9
00b8a288	b.eq 0x00b8a29c
00b8a28c	mov w9,#0x1300
00b8a290	movk w9,#0x600, LSL #16
00b8a294	cmp w8,w9
00b8a298	b.ne 0x00b8a310
00b8a29c	tst w1,#0xff
00b8a2a0	b.ne 0x00b8a308
00b8a2a4	mov w0,#0xffffff79
00b8a2a8	ret
00b8a2ac	mov w9,#0x8ff
00b8a2b0	movk w9,#0x600, LSL #16
00b8a2b4	cmp w8,w9
00b8a2b8	b.gt 0x00b8a2d4
00b8a2bc	mov w9,#0x200
00b8a2c0	movk w9,#0x600, LSL #16
00b8a2c4	cmp w8,w9
00b8a2c8	b.eq 0x00b8a308
00b8a2cc	mov w9,#0x300
00b8a2d0	b 0x00b8a2e8
00b8a2d4	mov w9,#0x900
00b8a2d8	movk w9,#0x600, LSL #16
00b8a2dc	cmp w8,w9
00b8a2e0	b.eq 0x00b8a308
00b8a2e4	mov w9,#0x1300
00b8a2e8	movk w9,#0x600, LSL #16
00b8a2ec	cmp w8,w9
00b8a2f0	b.eq 0x00b8a308
00b8a2f4	lsr w8,w1,#0x9
00b8a2f8	orr w8,w8,#0x1
00b8a2fc	orr w9,wzr,#0x30003
00b8a300	cmp w8,w9
00b8a304	b.ne 0x00b8a2a4
00b8a308	mov w0,wzr
00b8a30c	ret
00b8a310	mov w9,#0x400
00b8a314	movk w9,#0x600, LSL #16
00b8a318	and w10,w1,#0xfffffe00
00b8a31c	add w11,w9,#0x200
00b8a320	add w12,w9,#0x500
00b8a324	cmp w10,w11
00b8a328	cset w11,eq
00b8a32c	cmp w8,w12
00b8a330	cset w13,eq
00b8a334	orr w11,w11,w13
00b8a338	tbnz w11,#0x0,0x00b8a350
00b8a33c	add w13,w9,#0x400
00b8a340	cmp w1,w13
00b8a344	b.eq 0x00b8a350
00b8a348	cmp w10,w9
00b8a34c	b.ne 0x00b8a2a4
00b8a350	mov w13,#0x200
00b8a354	movk w13,#0x600, LSL #16
00b8a358	cmp w8,w13
00b8a35c	b.eq 0x00b8a29c
00b8a360	mov w13,#0x300
00b8a364	movk w13,#0x600, LSL #16
00b8a368	cmp w8,w13
00b8a36c	b.eq 0x00b8a29c
00b8a370	mov w13,#0x1300
00b8a374	movk w13,#0x600, LSL #16
00b8a378	cmp w8,w13
00b8a37c	b.eq 0x00b8a29c
00b8a380	cmp w8,w12
00b8a384	b.ne 0x00b8a3a8
00b8a388	cmp w10,w9
00b8a38c	cset w8,eq
00b8a390	tst w1,#0xff
00b8a394	mov w0,#0xffffff79
00b8a398	b.eq 0x00b8a2a8
00b8a39c	orr w8,w8,w11
00b8a3a0	cbnz w8,0x00b8a308
00b8a3a4	b 0x00b8a2a8
00b8a3a8	orr w12,w10,#0x200
00b8a3ac	orr w13,wzr,#0x6000600
00b8a3b0	cmp w12,w13
00b8a3b4	b.ne 0x00b8a308
00b8a3b8	mov w12,#0x200
00b8a3bc	movk w12,#0x600, LSL #16
00b8a3c0	cmp w8,w12
00b8a3c4	b.eq 0x00b8a29c
00b8a3c8	mov w12,#0x300
00b8a3cc	movk w12,#0x600, LSL #16
00b8a3d0	cmp w8,w12
00b8a3d4	b.eq 0x00b8a29c
00b8a3d8	mov w12,#0x1300
00b8a3dc	movk w12,#0x600, LSL #16
00b8a3e0	cmp w8,w12
00b8a3e4	b.eq 0x00b8a29c
00b8a3e8	b 0x00b8a388
