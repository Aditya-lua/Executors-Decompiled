; FUN_00c03e50 @ 00c03e50
00c03e50	paciasp
00c03e54	stp x29,x30,[sp, #-0x10]!
00c03e58	mov x29,sp
00c03e5c	adrp x8,0xd27000
00c03e60	add x8,x8,#0xb70
00c03e64	ldarb w8,[x8]
00c03e68	tbz w8,#0x0,0x00c03ef8
00c03e6c	adrp x8,0xd27000
00c03e70	ldrb w8,[x8, #0xb40]
00c03e74	tbnz w8,#0x0,0x00c03e8c
00c03e78	adrp x8,0xd27000
00c03e7c	add x8,x8,#0xb40
00c03e80	mov w9,#0x4
00c03e84	strb w9,[x8], #0x1
00c03e88	b 0x00c03ea0
00c03e8c	adrp x9,0xd27000
00c03e90	add x9,x9,#0xb48
00c03e94	mov w10,#0x2
00c03e98	ldr x8,[x9, #0x8]
00c03e9c	str x10,[x9]
00c03ea0	mov w9,#0x4d41
00c03ea4	strb wzr,[x8, #0x2]
00c03ea8	strh w9,[x8]
00c03eac	adrp x8,0xd27000
00c03eb0	ldrb w8,[x8, #0xb58]
00c03eb4	tbnz w8,#0x0,0x00c03ecc
00c03eb8	adrp x8,0xd27000
00c03ebc	add x8,x8,#0xb58
00c03ec0	mov w9,#0x4
00c03ec4	strb w9,[x8], #0x1
00c03ec8	b 0x00c03ee0
00c03ecc	adrp x9,0xd27000
00c03ed0	add x9,x9,#0xb60
00c03ed4	mov w10,#0x2
00c03ed8	ldr x8,[x9, #0x8]
00c03edc	str x10,[x9]
00c03ee0	mov w9,#0x4d50
00c03ee4	strh w9,[x8]
00c03ee8	strb wzr,[x8, #0x2]
00c03eec	ldp x29,x30,[sp], #0x10
00c03ef0	autiasp
00c03ef4	ret
00c03ef8	adrp x0,0xd27000
00c03efc	add x0,x0,#0xb70
00c03f00	bl 0x00c2fe90
00c03f04	cbz w0,0x00c03e6c
00c03f08	adrp x0,0xc0b000
00c03f0c	add x0,x0,#0x9e0
00c03f10	nop
00c03f14	adr x2,0xc48880
00c03f18	mov x1,xzr
00c03f1c	bl 0x00c2fe70
00c03f20	adrp x0,0xd27000
00c03f24	add x0,x0,#0xb70
00c03f28	bl 0x00c2fea0
00c03f2c	b 0x00c03e6c
