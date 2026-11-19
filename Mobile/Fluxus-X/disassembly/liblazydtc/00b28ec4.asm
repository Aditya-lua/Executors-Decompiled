; FUN_00b28ec4 @ 00b28ec4
00b28ec4	stp x20,x19,[sp, #-0x20]!
00b28ec8	stp x29,x30,[sp, #0x10]
00b28ecc	ldrb w9,[x0, #0x6c]
00b28ed0	mov x8,x1
00b28ed4	mov x19,x0
00b28ed8	add x20,x0,#0xc0
00b28edc	add x29,sp,#0x10
00b28ee0	tbnz w9,#0x1,0x00b28ef4
00b28ee4	ldr w9,[x19, #0x40]
00b28ee8	sub w9,w9,#0x1
00b28eec	cmp w9,#0x2
00b28ef0	b.cc 0x00b28f20
00b28ef4	lsl w1,w2,#0x3
00b28ef8	mov x0,x8
00b28efc	mov x2,x20
00b28f00	bl 0x00c373a0
00b28f04	tbnz w0,#0x1f,0x00b28f34
00b28f08	str x20,[x19, #0xb0]
00b28f0c	adrp x8,0xcb5000
00b28f10	ldr x8,[x8, #0x318]
00b28f14	mov w0,#0x1
00b28f18	str x8,[x19, #0x30]
00b28f1c	b 0x00b28f64
00b28f20	lsl w1,w2,#0x3
00b28f24	mov x0,x8
00b28f28	mov x2,x20
00b28f2c	bl 0x00c37390
00b28f30	tbz w0,#0x1f,0x00b28f08
00b28f34	bl 0x00c342a0
00b28f38	adrp x0,0x2ae000
00b28f3c	adrp x2,0x2d8000
00b28f40	add x0,x0,#0xa25
00b28f44	add x2,x2,#0xb8e
00b28f48	mov w1,#0x19
00b28f4c	bl 0x00c342b0
00b28f50	mov w0,#0x39
00b28f54	mov w1,#0x65
00b28f58	mov x2,xzr
00b28f5c	bl 0x00c342c0
00b28f60	mov w0,wzr
00b28f64	ldp x29,x30,[sp, #0x10]
00b28f68	ldp x20,x19,[sp], #0x20
00b28f6c	ret
