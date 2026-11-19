; RAND_get_rand_method @ 00ac7d50
00ac7d50	stp x22,x21,[sp, #-0x30]!
00ac7d54	adrp x0,0xd22000
00ac7d58	adrp x1,0xac7000
00ac7d5c	add x0,x0,#0x210
00ac7d60	add x1,x1,#0xbc0
00ac7d64	stp x20,x19,[sp, #0x10]
00ac7d68	stp x29,x30,[sp, #0x20]
00ac7d6c	add x29,sp,#0x20
00ac7d70	bl 0x00c34d60
00ac7d74	mov x19,xzr
00ac7d78	cbz w0,0x00ac7df0
00ac7d7c	adrp x8,0xd22000
00ac7d80	ldr w8,[x8, #0x214]
00ac7d84	cbz w8,0x00ac7df0
00ac7d88	adrp x21,0xd22000
00ac7d8c	ldr x0,[x21, #0x208]
00ac7d90	bl 0x00c356a0
00ac7d94	cbz w0,0x00ac7dcc
00ac7d98	adrp x22,0xd22000
00ac7d9c	ldr x19,[x22, #0x1f0]
00ac7da0	cbnz x19,0x00ac7de8
00ac7da4	bl 0x00c3bda0
00ac7da8	mov x20,x0
00ac7dac	cbz x0,0x00ac7dd4
00ac7db0	mov x0,x20
00ac7db4	bl 0x00c3bd90
00ac7db8	cbz x0,0x00ac7dd4
00ac7dbc	adrp x8,0xd22000
00ac7dc0	mov x19,x0
00ac7dc4	str x20,[x8, #0x218]
00ac7dc8	b 0x00ac7de4
00ac7dcc	mov x19,xzr
00ac7dd0	b 0x00ac7df0
00ac7dd4	mov x0,x20
00ac7dd8	bl 0x00c32360
00ac7ddc	adrp x19,0xcb5000
00ac7de0	ldr x19,[x19, #0x770]
00ac7de4	str x19,[x22, #0x1f0]
00ac7de8	ldr x0,[x21, #0x208]
00ac7dec	bl 0x00c35690
00ac7df0	mov x0,x19
00ac7df4	ldp x29,x30,[sp, #0x20]
00ac7df8	ldp x20,x19,[sp, #0x10]
00ac7dfc	ldp x22,x21,[sp], #0x30
00ac7e00	ret
