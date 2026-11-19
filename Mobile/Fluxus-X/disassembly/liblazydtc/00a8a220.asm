; FUN_00a8a220 @ 00a8a220
00a8a220	sub sp,sp,#0x80
00a8a224	stp x24,x23,[sp, #0x40]
00a8a228	stp x22,x21,[sp, #0x50]
00a8a22c	stp x20,x19,[sp, #0x60]
00a8a230	mov x20,x3
00a8a234	mov x23,x2
00a8a238	mov x21,x1
00a8a23c	lsr x8,x3,#0x1e
00a8a240	mov x19,x0
00a8a244	stp x28,x27,[sp, #0x20]
00a8a248	stp x26,x25,[sp, #0x30]
00a8a24c	stp x29,x30,[sp, #0x70]
00a8a250	add x29,sp,#0x70
00a8a254	cbz x8,0x00a8a2f0
00a8a258	orr x27,xzr,#-0x40000000
00a8a25c	add x8,x20,x27
00a8a260	mov w22,#0x40000000
00a8a264	and x28,x8,#-0x40000000
00a8a268	str x8,[sp]
00a8a26c	add x8,x28,x22
00a8a270	str x8,[sp, #0x8]
00a8a274	add x8,x23,x8
00a8a278	str x8,[sp, #0x10]
00a8a27c	adrp x25,0xcb5000
00a8a280	ldr x25,[x25, #0x318]
00a8a284	add x24,x19,#0x28
00a8a288	mov x26,x21
00a8a28c	mov x0,x19
00a8a290	bl 0x00c3ceb0
00a8a294	str w0,[sp, #0x1c]
00a8a298	mov x0,x19
00a8a29c	bl 0x00c3cea0
00a8a2a0	mov x3,x0
00a8a2a4	mov w2,#0x40000000
00a8a2a8	add x5,sp,#0x1c
00a8a2ac	mov x0,x23
00a8a2b0	mov x1,x26
00a8a2b4	mov x4,x24
00a8a2b8	mov x6,x25
00a8a2bc	bl 0x00c3e450
00a8a2c0	ldr w1,[sp, #0x1c]
00a8a2c4	mov x0,x19
00a8a2c8	bl 0x00c3ced0
00a8a2cc	add x20,x20,x27
00a8a2d0	add x23,x23,x22
00a8a2d4	lsr x8,x20,#0x1e
00a8a2d8	add x26,x26,x22
00a8a2dc	cbnz x8,0x00a8a28c
00a8a2e0	ldr x8,[sp]
00a8a2e4	sub x20,x8,x28
00a8a2e8	ldp x8,x23,[sp, #0x8]
00a8a2ec	add x21,x21,x8
00a8a2f0	cbz x20,0x00a8a338
00a8a2f4	mov x0,x19
00a8a2f8	bl 0x00c3ceb0
00a8a2fc	str w0,[sp, #0x18]
00a8a300	mov x0,x19
00a8a304	bl 0x00c3cea0
00a8a308	adrp x6,0xcb5000
00a8a30c	ldr x6,[x6, #0x318]
00a8a310	mov x3,x0
00a8a314	add x4,x19,#0x28
00a8a318	add x5,sp,#0x18
00a8a31c	mov x0,x23
00a8a320	mov x1,x21
00a8a324	mov x2,x20
00a8a328	bl 0x00c3e450
00a8a32c	ldr w1,[sp, #0x18]
00a8a330	mov x0,x19
00a8a334	bl 0x00c3ced0
00a8a338	ldp x29,x30,[sp, #0x70]
00a8a33c	ldp x20,x19,[sp, #0x60]
00a8a340	ldp x22,x21,[sp, #0x50]
00a8a344	ldp x24,x23,[sp, #0x40]
00a8a348	ldp x26,x25,[sp, #0x30]
00a8a34c	ldp x28,x27,[sp, #0x20]
00a8a350	mov w0,#0x1
00a8a354	add sp,sp,#0x80
00a8a358	ret
