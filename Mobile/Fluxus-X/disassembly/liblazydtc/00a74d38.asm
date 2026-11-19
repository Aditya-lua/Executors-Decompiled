; EVP_PKEY_meth_find @ 00a74d38
00a74d38	sub sp,sp,#0x130
00a74d3c	stp x20,x19,[sp, #0x110]
00a74d40	adrp x20,0xd21000
00a74d44	ldr x8,[x20, #0xb48]
00a74d48	mov w19,w0
00a74d4c	str x28,[sp, #0x100]
00a74d50	stp x29,x30,[sp, #0x120]
00a74d54	add x29,sp,#0x120
00a74d58	cbz x8,0x00a74d88
00a74d5c	mov x1,sp
00a74d60	mov x0,x8
00a74d64	str w19,[sp]
00a74d68	bl 0x00c34760
00a74d6c	tbnz w0,#0x1f,0x00a74d88
00a74d70	mov w1,w0
00a74d74	ldr x0,[x20, #0xb48]
00a74d78	bl 0x00c32610
00a74d7c	stur x0,[x29, #-0x18]
00a74d80	cbnz x0,0x00a74dd0
00a74d84	b 0x00a74d8c
00a74d88	stur xzr,[x29, #-0x18]
00a74d8c	adrp x1,0xcc8000
00a74d90	adrp x4,0xa77000
00a74d94	mov x8,sp
00a74d98	add x1,x1,#0xed8
00a74d9c	add x4,x4,#0xe44
00a74da0	sub x0,x29,#0x18
00a74da4	mov w2,#0xa
00a74da8	mov w3,#0x8
00a74dac	str w19,[sp]
00a74db0	stur x8,[x29, #-0x18]
00a74db4	bl 0x00c35830
00a74db8	cbz x0,0x00a74dd0
00a74dbc	ldr x8,[x0]
00a74dc0	cbz x8,0x00a74dcc
00a74dc4	blr x8
00a74dc8	b 0x00a74dd0
00a74dcc	mov x0,xzr
00a74dd0	ldp x29,x30,[sp, #0x120]
00a74dd4	ldp x20,x19,[sp, #0x110]
00a74dd8	ldr x28,[sp, #0x100]
00a74ddc	add sp,sp,#0x130
00a74de0	ret
