; d2i_ECPKParameters @ 00a25a00
00a25a00	sub sp,sp,#0x40
00a25a04	stp x22,x21,[sp, #0x10]
00a25a08	stp x20,x19,[sp, #0x20]
00a25a0c	stp x29,x30,[sp, #0x30]
00a25a10	ldr x8,[x1]
00a25a14	adrp x3,0xc5a000
00a25a18	mov x19,x1
00a25a1c	mov x20,x0
00a25a20	add x3,x3,#0xde8
00a25a24	add x1,sp,#0x8
00a25a28	mov x0,xzr
00a25a2c	add x29,sp,#0x30
00a25a30	str x8,[sp, #0x8]
00a25a34	bl 0x00c36150
00a25a38	cbz x0,0x00a25a88
00a25a3c	mov x22,x0
00a25a40	bl 0x00a258d0
00a25a44	mov x21,x0
00a25a48	cbz x0,0x00a25a9c
00a25a4c	ldr w8,[x22]
00a25a50	cmp w8,#0x1
00a25a54	b.ne 0x00a25a5c
00a25a58	str w8,[x21, #0x28]
00a25a5c	cbz x20,0x00a25a6c
00a25a60	ldr x0,[x20]
00a25a64	bl 0x00c3a770
00a25a68	str x21,[x20]
00a25a6c	adrp x1,0xc5a000
00a25a70	add x1,x1,#0xde8
00a25a74	mov x0,x22
00a25a78	bl 0x00c36160
00a25a7c	ldr x8,[sp, #0x8]
00a25a80	str x8,[x19]
00a25a84	b 0x00a25aac
00a25a88	adrp x1,0xc5a000
00a25a8c	add x1,x1,#0xde8
00a25a90	bl 0x00c36160
00a25a94	mov x21,xzr
00a25a98	b 0x00a25aac
00a25a9c	adrp x1,0xc5a000
00a25aa0	add x1,x1,#0xde8
00a25aa4	mov x0,x22
00a25aa8	bl 0x00c36160
00a25aac	mov x0,x21
00a25ab0	ldp x29,x30,[sp, #0x30]
00a25ab4	ldp x20,x19,[sp, #0x20]
00a25ab8	ldp x22,x21,[sp, #0x10]
00a25abc	add sp,sp,#0x40
00a25ac0	ret
