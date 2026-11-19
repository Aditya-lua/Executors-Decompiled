; FUN_00c13be4 @ 00c13be4
00c13be4	paciasp
00c13be8	stp x29,x30,[sp, #-0x30]!
00c13bec	str x21,[sp, #0x10]
00c13bf0	stp x20,x19,[sp, #0x20]
00c13bf4	mov x29,sp
00c13bf8	ldr x21,[x0, #0x1330]
00c13bfc	mov x19,x1
00c13c00	ldr x8,[x21, #0x8]
00c13c04	sub x9,x8,#0xfc0
00c13c08	cmn x9,#0xff1
00c13c0c	b.hi 0x00c13c30
00c13c10	mov x20,x0
00c13c14	mov w0,#0x1000
00c13c18	bl 0x00c308d0
00c13c1c	cbz x0,0x00c13c90
00c13c20	mov x8,xzr
00c13c24	stp x21,xzr,[x0]
00c13c28	mov x21,x0
00c13c2c	str x0,[x20, #0x1330]
00c13c30	add x9,x8,#0x30
00c13c34	add x0,x21,x8
00c13c38	adrp x8,0xcb1000
00c13c3c	add x8,x8,#0x3c0
00c13c40	str x9,[x21, #0x8]
00c13c44	mov w10,#0x540
00c13c48	str x8,[x0, #0x10]!
00c13c4c	ldurh w9,[x0, #0x9]
00c13c50	mov w8,#0x15
00c13c54	mov w11,#0x11
00c13c58	strb w8,[x0, #0x8]
00c13c5c	adrp x8,0x2da000
00c13c60	add x8,x8,#0xdec
00c13c64	and w9,w9,#0xf000
00c13c68	str x8,[x0, #0x10]
00c13c6c	orr w8,w9,w10
00c13c70	ldr x9,[x19]
00c13c74	sturh w8,[x0, #0x9]
00c13c78	stp x11,x9,[x0, #0x18]
00c13c7c	ldp x20,x19,[sp, #0x20]
00c13c80	ldr x21,[sp, #0x10]
00c13c84	ldp x29,x30,[sp], #0x30
00c13c88	autiasp
00c13c8c	ret
00c13c90	bl 0x00c2fff0
