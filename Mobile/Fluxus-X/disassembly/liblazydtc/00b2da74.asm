; FUN_00b2da74 @ 00b2da74
00b2da74	stp x22,x21,[sp, #-0x30]!
00b2da78	stp x20,x19,[sp, #0x10]
00b2da7c	stp x29,x30,[sp, #0x20]
00b2da80	add x29,sp,#0x20
00b2da84	mov x22,x3
00b2da88	mov x19,x2
00b2da8c	mov x21,x1
00b2da90	mov x20,x0
00b2da94	bl 0x00c41000
00b2da98	mov w8,w0
00b2da9c	cmp x22,#0x40
00b2daa0	mov w0,wzr
00b2daa4	b.cc 0x00b2dac8
00b2daa8	cbz w8,0x00b2dac8
00b2daac	mov x0,x21
00b2dab0	mov x1,x20
00b2dab4	bl 0x00c3e5c0
00b2dab8	cbz w0,0x00b2dac8
00b2dabc	mov w8,#0x40
00b2dac0	mov w0,#0x1
00b2dac4	str x8,[x19]
00b2dac8	ldp x29,x30,[sp, #0x20]
00b2dacc	ldp x20,x19,[sp, #0x10]
00b2dad0	ldp x22,x21,[sp], #0x30
00b2dad4	ret
