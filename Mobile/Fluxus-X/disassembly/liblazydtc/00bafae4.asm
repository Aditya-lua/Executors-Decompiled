; ZSTD_createDCtx_advanced @ 00bafae4
00bafae4	stp x29,x30,[sp, #-0x30]!
00bafae8	str x21,[sp, #0x10]
00bafaec	stp x20,x19,[sp, #0x20]
00bafaf0	mov x29,sp
00bafaf4	ldp x20,x21,[x0]
00bafaf8	cmp x20,#0x0
00bafafc	cset w8,eq
00bafb00	cmp x21,#0x0
00bafb04	cset w9,eq
00bafb08	eor w8,w8,w9
00bafb0c	tbz w8,#0x0,0x00bafb18
00bafb10	mov x0,xzr
00bafb14	b 0x00bafbbc
00bafb18	ldr x19,[x0, #0x10]
00bafb1c	cbz x20,0x00bafbcc
00bafb20	mov w1,#0x76e8
00bafb24	mov x0,x19
00bafb28	movk w1,#0x1, LSL #16
00bafb2c	blr x20
00bafb30	cbz x0,0x00bafbbc
00bafb34	fmov d0,xzr
00bafb38	mov w9,#0x75e8
00bafb3c	mov w8,#0x75e0
00bafb40	movi v2.2D,#0x0
00bafb44	add x8,x0,x8
00bafb48	mov w10,#0x761c
00bafb4c	add x10,x0,x10
00bafb50	str x20,[x0, #0x75b0]
00bafb54	mov v1.16B,v0.16B
00bafb58	str x21,[x0, #0x75b8]
00bafb5c	str x19,[x0, #0x75c0]
00bafb60	str xzr,[x0, #0x75d8]
00bafb64	mov v1.D[0x1],v0.D[0x0]
00bafb68	str xzr,[x0, #0x74d8]
00bafb6c	stur d2,[x8, #0x1c]
00bafb70	str xzr,[x0, #0x7648]
00bafb74	str q1,[x0,x9]
00bafb78	movi v1.2D,#0x0
00bafb7c	mov w9,#0x76d8
00bafb80	movk w9,#0x1, LSL #16
00bafb84	str q2,[x10]
00bafb88	str xzr,[x0, x9#0x0]
00bafb8c	mov w9,#0x1
00bafb90	str w9,[x8]
00bafb94	mov w9,#0x7608
00bafb98	mov v0.D[0x1],v1.D[0x0]
00bafb9c	str wzr,[x10, #0x10]
00bafba0	stur d2,[x8, #0x8c]
00bafba4	str d2,[x0, #0x7598]
00bafba8	str q0,[x0,x9]
00bafbac	mov w9,#0x1
00bafbb0	movk w9,#0x800, LSL #16
00bafbb4	str wzr,[x8, #0x38]
00bafbb8	str x9,[x0, #0x7638]
00bafbbc	ldp x20,x19,[sp, #0x20]
00bafbc0	ldr x21,[sp, #0x10]
00bafbc4	ldp x29,x30,[sp], #0x30
00bafbc8	ret
00bafbcc	mov w0,#0x76e8
00bafbd0	movk w0,#0x1, LSL #16
00bafbd4	bl 0x00c308d0
00bafbd8	cbnz x0,0x00bafb34
00bafbdc	b 0x00bafbbc
