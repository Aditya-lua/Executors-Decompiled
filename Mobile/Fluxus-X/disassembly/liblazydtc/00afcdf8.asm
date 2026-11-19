; FUN_00afcdf8 @ 00afcdf8
00afcdf8	stp x28,x27,[sp, #-0x60]!
00afcdfc	stp x20,x19,[sp, #0x40]
00afce00	mov x20,x0
00afce04	mov x0,x1
00afce08	stp x26,x25,[sp, #0x10]
00afce0c	stp x24,x23,[sp, #0x20]
00afce10	stp x22,x21,[sp, #0x30]
00afce14	stp x29,x30,[sp, #0x50]
00afce18	add x29,sp,#0x50
00afce1c	bl 0x00c39680
00afce20	cbz x0,0x00afcfdc
00afce24	ldr x8,[x20]
00afce28	mov x19,x0
00afce2c	mov w21,wzr
00afce30	cbnz x8,0x00afcfe8
00afce34	mov x0,x19
00afce38	bl 0x00c325e0
00afce3c	cmp w0,#0x1
00afce40	b.lt 0x00afcfd4
00afce44	adrp x22,0x2d4000
00afce48	adrp x26,0xc7f000
00afce4c	adrp x23,0x2d6000
00afce50	adrp x24,0x2cc000
00afce54	adrp x25,0x2d0000
00afce58	mov w21,wzr
00afce5c	add x22,x22,#0x4f8
00afce60	add x26,x26,#0x930
00afce64	add x23,x23,#0x3df
00afce68	add x24,x24,#0x173
00afce6c	add x25,x25,#0x1df
00afce70	mov x0,x19
00afce74	mov w1,w21
00afce78	bl 0x00c32610
00afce7c	ldr x28,[x20]
00afce80	ldr x27,[x0, #0x8]
00afce84	cbnz x28,0x00afce98
00afce88	bl 0x00c38040
00afce8c	mov x28,x0
00afce90	str x0,[x20]
00afce94	cbz x0,0x00afcfe4
00afce98	mov x0,x22
00afce9c	mov x1,x27
00afcea0	bl 0x00c301f0
00afcea4	cbz w0,0x00afcf48
00afcea8	mov x0,x23
00afceac	mov x1,x27
00afceb0	bl 0x00c301f0
00afceb4	cbz w0,0x00afcf54
00afceb8	mov x0,x24
00afcebc	mov x1,x27
00afcec0	bl 0x00c301f0
00afcec4	cbz w0,0x00afcf60
00afcec8	mov x0,x25
00afcecc	mov x1,x27
00afced0	bl 0x00c301f0
00afced4	cbz w0,0x00afcf6c
00afced8	adrp x0,0x2a2000
00afcedc	add x0,x0,#0xb0e
00afcee0	mov x1,x27
00afcee4	bl 0x00c301f0
00afcee8	cbz w0,0x00afcf78
00afceec	adrp x0,0x2a6000
00afcef0	add x0,x0,#0x68f
00afcef4	mov x1,x27
00afcef8	bl 0x00c301f0
00afcefc	cbz w0,0x00afcf84
00afcf00	adrp x0,0x2dc000
00afcf04	add x0,x0,#0x7ba
00afcf08	mov x1,x27
00afcf0c	bl 0x00c301f0
00afcf10	cbz w0,0x00afcf90
00afcf14	adrp x0,0x2d2000
00afcf18	add x0,x0,#0x406
00afcf1c	mov x1,x27
00afcf20	bl 0x00c301f0
00afcf24	cbz w0,0x00afcf9c
00afcf28	adrp x0,0x2d6000
00afcf2c	add x0,x0,#0x6a2
00afcf30	mov x1,x27
00afcf34	bl 0x00c301f0
00afcf38	cbnz w0,0x00afcfe4
00afcf3c	add x8,x26,#0xc0
00afcf40	add x27,x26,#0xc8
00afcf44	b 0x00afcfa4
00afcf48	add x27,x26,#0x8
00afcf4c	mov x8,x26
00afcf50	b 0x00afcfa4
00afcf54	add x8,x26,#0x18
00afcf58	add x27,x26,#0x20
00afcf5c	b 0x00afcfa4
00afcf60	add x8,x26,#0x30
00afcf64	add x27,x26,#0x38
00afcf68	b 0x00afcfa4
00afcf6c	add x8,x26,#0x48
00afcf70	add x27,x26,#0x50
00afcf74	b 0x00afcfa4
00afcf78	add x8,x26,#0x60
00afcf7c	add x27,x26,#0x68
00afcf80	b 0x00afcfa4
00afcf84	add x8,x26,#0x78
00afcf88	add x27,x26,#0x80
00afcf8c	b 0x00afcfa4
00afcf90	add x8,x26,#0x90
00afcf94	add x27,x26,#0x98
00afcf98	b 0x00afcfa4
00afcf9c	add x8,x26,#0xa8
00afcfa0	add x27,x26,#0xb0
00afcfa4	ldr w1,[x8]
00afcfa8	mov w2,#0x1
00afcfac	mov x0,x28
00afcfb0	bl 0x00c373d0
00afcfb4	cbz w0,0x00afcfe4
00afcfb8	ldr x8,[x27]
00afcfbc	cbz x8,0x00afcfe4
00afcfc0	mov x0,x19
00afcfc4	add w21,w21,#0x1
00afcfc8	bl 0x00c325e0
00afcfcc	cmp w21,w0
00afcfd0	b.lt 0x00afce70
00afcfd4	mov w21,#0x1
00afcfd8	b 0x00afcfe8
00afcfdc	mov w21,wzr
00afcfe0	b 0x00afcff8
00afcfe4	mov w21,wzr
00afcfe8	adrp x1,0xcb5000
00afcfec	ldr x1,[x1, #0x4b0]
00afcff0	mov x0,x19
00afcff4	bl 0x00c32600
00afcff8	mov w0,w21
00afcffc	ldp x29,x30,[sp, #0x50]
00afd000	ldp x20,x19,[sp, #0x40]
00afd004	ldp x22,x21,[sp, #0x30]
00afd008	ldp x24,x23,[sp, #0x20]
00afd00c	ldp x26,x25,[sp, #0x10]
00afd010	ldp x28,x27,[sp], #0x60
00afd014	ret
