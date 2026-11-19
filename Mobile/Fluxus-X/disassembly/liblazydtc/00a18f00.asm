; bn_set_words @ 00a18f00
00a18f00	str x21,[sp, #-0x30]!
00a18f04	mov x21,x1
00a18f08	mov w1,w2
00a18f0c	stp x20,x19,[sp, #0x10]
00a18f10	stp x29,x30,[sp, #0x20]
00a18f14	add x29,sp,#0x20
00a18f18	mov w20,w2
00a18f1c	mov x19,x0
00a18f20	bl 0x00c38e80
00a18f24	cbz x0,0x00a18f4c
00a18f28	ldr x0,[x19]
00a18f2c	sbfiz x2,x20,#0x3,#0x20
00a18f30	mov x1,x21
00a18f34	bl 0x00c2ffd0
00a18f38	mov x0,x19
00a18f3c	str w20,[x19, #0x8]
00a18f40	bl 0x00c38e40
00a18f44	mov w0,#0x1
00a18f48	b 0x00a18f80
00a18f4c	bl 0x00c342a0
00a18f50	adrp x0,0x2af000
00a18f54	adrp x2,0x2cd000
00a18f58	add x0,x0,#0xdb8
00a18f5c	add x2,x2,#0x8fa
00a18f60	mov w1,#0xbf
00a18f64	bl 0x00c342b0
00a18f68	mov w1,#0x100
00a18f6c	orr w0,wzr,#0x3
00a18f70	movk w1,#0xc, LSL #16
00a18f74	mov x2,xzr
00a18f78	bl 0x00c342c0
00a18f7c	mov w0,wzr
00a18f80	ldp x29,x30,[sp, #0x20]
00a18f84	ldp x20,x19,[sp, #0x10]
00a18f88	ldr x21,[sp], #0x30
00a18f8c	ret
