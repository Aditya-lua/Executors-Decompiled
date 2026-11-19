; FUN_0096ab00 @ 0096ab00
0096ab00	stp x20,x19,[sp, #-0x20]!
0096ab04	stp x29,x30,[sp, #0x10]
0096ab08	add x29,sp,#0x10
0096ab0c	ldr x9,[x0, #0x18]
0096ab10	mov x8,x2
0096ab14	mov x20,x0
0096ab18	mov x19,x1
0096ab1c	ldrb w10,[x9, #0x3a0]
0096ab20	tbz w10,#0x3,0x0096ab88
0096ab24	ldr x10,[x20]
0096ab28	mov w11,#0xa
0096ab2c	ldr w10,[x10, #0x8]
0096ab30	bics wzr,w11,w10
0096ab34	b.ne 0x0096ab88
0096ab38	add x9,x9,#0x571
0096ab3c	cbz x8,0x0096ab90
0096ab40	cbz x3,0x0096ab90
0096ab44	cmp x3,#0x8
0096ab48	b.ne 0x0096ab68
0096ab4c	ldr x10,[x8]
0096ab50	mov x11,#0x7468
0096ab54	movk x11,#0x7074, LSL #16
0096ab58	movk x11,#0x312f, LSL #32
0096ab5c	movk x11,#0x312e, LSL #48
0096ab60	cmp x10,x11
0096ab64	b.eq 0x0096abc8
0096ab68	adrp x1,0x2a9000
0096ab6c	add x1,x1,#0x91b
0096ab70	mov x0,x19
0096ab74	mov w2,w3
0096ab78	mov x3,x8
0096ab7c	strb wzr,[x9]
0096ab80	bl 0x00904b80
0096ab84	b 0x0096ac08
0096ab88	add x9,x9,#0x570
0096ab8c	cbnz x8,0x0096ab40
0096ab90	strb wzr,[x9]
0096ab94	cbz x19,0x0096ac08
0096ab98	ldrb w8,[x19, #0xa85]
0096ab9c	tbz w8,#0x4,0x0096ac08
0096aba0	ldr x8,[x19, #0x12a0]
0096aba4	cbz x8,0x0096abb4
0096aba8	ldr w8,[x8, #0x8]
0096abac	cmp w8,#0x1
0096abb0	b.lt 0x0096ac08
0096abb4	adrp x1,0x2cf000
0096abb8	add x1,x1,#0x368
0096abbc	mov x0,x19
0096abc0	bl 0x00904c98
0096abc4	b 0x0096ac08
0096abc8	mov w10,#0x2
0096abcc	strb w10,[x9]
0096abd0	cbz x19,0x0096ac08
0096abd4	ldrb w9,[x19, #0xa85]
0096abd8	tbz w9,#0x4,0x0096ac08
0096abdc	ldr x9,[x19, #0x12a0]
0096abe0	cbz x9,0x0096abf0
0096abe4	ldr w9,[x9, #0x8]
0096abe8	cmp w9,#0x1
0096abec	b.lt 0x0096ac08
0096abf0	adrp x1,0x2b7000
0096abf4	add x1,x1,#0x1d2
0096abf8	mov w2,#0x8
0096abfc	mov x0,x19
0096ac00	mov x3,x8
0096ac04	bl 0x00904c98
0096ac08	ldr x8,[x20]
0096ac0c	mov w9,#0xa
0096ac10	ldr w8,[x8, #0x8]
0096ac14	bics wzr,w9,w8
0096ac18	b.eq 0x0096ac28
0096ac1c	mov w1,#0xffffffff
0096ac20	mov x0,x19
0096ac24	bl 0x0092f0f0
0096ac28	ldp x29,x30,[sp, #0x10]
0096ac2c	mov w0,wzr
0096ac30	ldp x20,x19,[sp], #0x20
0096ac34	ret
