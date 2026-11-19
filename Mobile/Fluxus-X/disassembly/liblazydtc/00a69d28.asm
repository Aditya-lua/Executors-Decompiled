; EVP_PBE_find @ 00a69d28
00a69d28	sub sp,sp,#0x50
00a69d2c	stp x22,x21,[sp, #0x20]
00a69d30	stp x20,x19,[sp, #0x30]
00a69d34	stp x29,x30,[sp, #0x40]
00a69d38	add x29,sp,#0x40
00a69d3c	cbz w1,0x00a69dcc
00a69d40	adrp x22,0xd21000
00a69d44	mov w8,w0
00a69d48	ldr x0,[x22, #0xb40]
00a69d4c	mov x19,x4
00a69d50	mov x20,x3
00a69d54	mov x21,x2
00a69d58	stp w8,w1,[sp]
00a69d5c	cbz x0,0x00a69d7c
00a69d60	mov x1,sp
00a69d64	bl 0x00c34760
00a69d68	ldr x8,[x22, #0xb40]
00a69d6c	mov w1,w0
00a69d70	mov x0,x8
00a69d74	bl 0x00c32610
00a69d78	cbnz x0,0x00a69da0
00a69d7c	adrp x1,0xc5e000
00a69d80	adrp x4,0xa69000
00a69d84	add x1,x1,#0x550
00a69d88	add x4,x4,#0xe6c
00a69d8c	mov x0,sp
00a69d90	mov w2,#0x1d
00a69d94	mov w3,#0x20
00a69d98	bl 0x00c35830
00a69d9c	cbz x0,0x00a69dd0
00a69da0	cbz x21,0x00a69dac
00a69da4	ldr w8,[x0, #0x8]
00a69da8	str w8,[x21]
00a69dac	cbz x20,0x00a69db8
00a69db0	ldr w8,[x0, #0xc]
00a69db4	str w8,[x20]
00a69db8	cbz x19,0x00a69dc4
00a69dbc	ldr x8,[x0, #0x10]
00a69dc0	str x8,[x19]
00a69dc4	mov w0,#0x1
00a69dc8	b 0x00a69dd0
00a69dcc	mov w0,wzr
00a69dd0	ldp x29,x30,[sp, #0x40]
00a69dd4	ldp x20,x19,[sp, #0x30]
00a69dd8	ldp x22,x21,[sp, #0x20]
00a69ddc	add sp,sp,#0x50
00a69de0	ret
