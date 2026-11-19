; MDC2_Final @ 00aa71bc
00aa71bc	str x21,[sp, #-0x30]!
00aa71c0	stp x20,x19,[sp, #0x10]
00aa71c4	stp x29,x30,[sp, #0x20]
00aa71c8	ldr w8,[x1]
00aa71cc	ldr w9,[x1, #0x1c]
00aa71d0	mov x20,x1
00aa71d4	mov x19,x0
00aa71d8	add x29,sp,#0x20
00aa71dc	cbnz w8,0x00aa71e8
00aa71e0	cmp w9,#0x2
00aa71e4	b.ne 0x00aa7228
00aa71e8	cmp w9,#0x2
00aa71ec	b.ne 0x00aa7200
00aa71f0	add x9,x20,x8
00aa71f4	add w8,w8,#0x1
00aa71f8	mov w10,#0x80
00aa71fc	strb w10,[x9, #0x4]
00aa7200	add x21,x20,#0x4
00aa7204	mov w9,#0x8
00aa7208	add x0,x21,w8, UXTW 
00aa720c	sub w2,w9,w8
00aa7210	mov w1,wzr
00aa7214	bl 0x00c301c0
00aa7218	mov w2,#0x8
00aa721c	mov x0,x20
00aa7220	mov x1,x21
00aa7224	bl 0x00aa705c
00aa7228	ldur x8,[x20, #0xc]
00aa722c	mov w0,#0x1
00aa7230	str x8,[x19]
00aa7234	ldur x8,[x20, #0x14]
00aa7238	str x8,[x19, #0x8]
00aa723c	ldp x29,x30,[sp, #0x20]
00aa7240	ldp x20,x19,[sp, #0x10]
00aa7244	ldr x21,[sp], #0x30
00aa7248	ret
