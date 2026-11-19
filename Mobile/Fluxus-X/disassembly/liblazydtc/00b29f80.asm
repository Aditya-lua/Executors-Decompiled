; ossl_chacha20_initctx @ 00b29f80
00b29f80	str x19,[sp, #-0x20]!
00b29f84	mov x19,x0
00b29f88	mov w0,#0x100
00b29f8c	stp x29,x30,[sp, #0x10]
00b29f90	add x29,sp,#0x10
00b29f94	bl 0x00c414f0
00b29f98	ldp x29,x30,[sp, #0x10]
00b29f9c	mov w1,#0x100
00b29fa0	mov w2,#0x8
00b29fa4	mov w3,#0x80
00b29fa8	mov w5,#0x2
00b29fac	mov x6,x0
00b29fb0	mov x0,x19
00b29fb4	mov w4,wzr
00b29fb8	mov x7,xzr
00b29fbc	ldr x19,[sp], #0x20
00b29fc0	b 0x00c41280
