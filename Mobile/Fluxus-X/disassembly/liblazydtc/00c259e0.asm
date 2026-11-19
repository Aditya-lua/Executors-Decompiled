; FUN_00c259e0 @ 00c259e0
00c259e0	paciasp
00c259e4	stp x29,x30,[sp, #-0x30]!
00c259e8	stp x22,x21,[sp, #0x10]
00c259ec	stp x20,x19,[sp, #0x20]
00c259f0	mov x29,sp
00c259f4	ldr x22,[x0, #0x1330]
00c259f8	mov x19,x2
00c259fc	mov x20,x1
00c25a00	ldr x8,[x22, #0x8]
00c25a04	sub x9,x8,#0xfd0
00c25a08	cmn x9,#0xff1
00c25a0c	b.hi 0x00c25a30
00c25a10	mov x21,x0
00c25a14	mov w0,#0x1000
00c25a18	bl 0x00c308d0
00c25a1c	cbz x0,0x00c25a88
00c25a20	mov x8,xzr
00c25a24	stp x22,xzr,[x0]
00c25a28	mov x22,x0
00c25a2c	str x0,[x21, #0x1330]
00c25a30	add x9,x8,#0x20
00c25a34	add x0,x22,x8
00c25a38	adrp x8,0xcb3000
00c25a3c	add x8,x8,#0xcc8
00c25a40	str x9,[x22, #0x8]
00c25a44	mov w10,#0x20
00c25a48	str x8,[x0, #0x10]!
00c25a4c	ldurh w8,[x0, #0x9]
00c25a50	ldr x9,[x20]
00c25a54	strb w10,[x0, #0x8]
00c25a58	mov w10,#0x540
00c25a5c	and w8,w8,#0xf000
00c25a60	ldrb w11,[x19]
00c25a64	orr w8,w8,w10
00c25a68	str x9,[x0, #0x10]
00c25a6c	sturh w8,[x0, #0x9]
00c25a70	strb w11,[x0, #0x18]
00c25a74	ldp x20,x19,[sp, #0x20]
00c25a78	ldp x22,x21,[sp, #0x10]
00c25a7c	ldp x29,x30,[sp], #0x30
00c25a80	autiasp
00c25a84	ret
00c25a88	bl 0x00c2fff0
