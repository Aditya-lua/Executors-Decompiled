; FUN_00c29b58 @ 00c29b58
00c29b58	paciasp
00c29b5c	stp x29,x30,[sp, #-0x20]!
00c29b60	str x19,[sp, #0x10]
00c29b64	mov x29,sp
00c29b68	mov x19,x0
00c29b6c	nop
00c29b70	adr x0,0xd27e68
00c29b74	bl 0x00c31ca0
00c29b78	adrp x8,0xd27000
00c29b7c	ldr x14,[x8, #0xe90]
00c29b80	cbz x14,0x00c29b98
00c29b84	adrp x9,0xd28000
00c29b88	add x9,x9,#0xa0
00c29b8c	cmp x14,x9
00c29b90	b.ne 0x00c29bb0
00c29b94	b 0x00c29c14
00c29b98	mov w9,#0x80
00c29b9c	adrp x14,0xd27000
00c29ba0	add x14,x14,#0xeac
00c29ba4	movk w9,#0x7d, LSL #16
00c29ba8	str x14,[x8, #0xe90]
00c29bac	str w9,[x14]
00c29bb0	add x9,x19,#0x3
00c29bb4	mov x10,xzr
00c29bb8	nop
00c29bbc	adr x11,0xd27ea0
00c29bc0	lsr x12,x9,#0x2
00c29bc4	add x13,x12,#0x1
00c29bc8	add x19,x14,#0x4
00c29bcc	tst x19,#0xf
00c29bd0	b.ne 0x00c29c9c
00c29bd4	ldrh w15,[x14, #0x2]
00c29bd8	mov x9,x14
00c29bdc	sub w14,w15,w13
00c29be0	cmp x13,x15
00c29be4	and w14,w14,#0x3
00c29be8	csel x14,x14,xzr,cc
00c29bec	add x14,x14,x13
00c29bf0	cmp x14,x15
00c29bf4	b.cc 0x00c29c1c
00c29bf8	cmp x12,x15
00c29bfc	b.cc 0x00c29c5c
00c29c00	ldrh w10,[x9]
00c29c04	add x14,x11,x10, LSL #0x2
00c29c08	cmp x10,#0x80
00c29c0c	mov x10,x9
00c29c10	b.ne 0x00c29bc8
00c29c14	mov x19,xzr
00c29c18	b 0x00c29c7c
00c29c1c	sub w8,w15,w14
00c29c20	add x10,x9,w8, UXTH  #0x2
00c29c24	strh w8,[x9, #0x2]
00c29c28	add x19,x10,#0x4
00c29c2c	strh wzr,[x10]
00c29c30	tst x19,#0xf
00c29c34	strh w14,[x10, #0x2]
00c29c38	b.eq 0x00c29c7c
00c29c3c	adrp x0,0x29f000
00c29c40	add x0,x0,#0x357
00c29c44	adrp x1,0x2c2000
00c29c48	add x1,x1,#0xc68
00c29c4c	adrp x3,0x2ab000
00c29c50	add x3,x3,#0x32c
00c29c54	mov w2,#0xa7
00c29c58	bl 0x00c0de94
00c29c5c	ldrh w12,[x9]
00c29c60	cbz x10,0x00c29c70
00c29c64	strh w12,[x10]
00c29c68	strh wzr,[x9]
00c29c6c	b 0x00c29c7c
00c29c70	add x10,x11,x12, LSL #0x2
00c29c74	strh wzr,[x9]
00c29c78	str x10,[x8, #0xe90]
00c29c7c	nop
00c29c80	adr x0,0xd27e68
00c29c84	bl 0x00c31cb0
00c29c88	mov x0,x19
00c29c8c	ldr x19,[sp, #0x10]
00c29c90	ldp x29,x30,[sp], #0x20
00c29c94	autiasp
00c29c98	ret
00c29c9c	adrp x0,0x29f000
00c29ca0	add x0,x0,#0x357
00c29ca4	adrp x1,0x2c2000
00c29ca8	add x1,x1,#0xc68
00c29cac	adrp x3,0x2ab000
00c29cb0	add x3,x3,#0x32c
00c29cb4	mov w2,#0x92
00c29cb8	bl 0x00c0de94
