; mbedtls_rsa_deduce_private_exponent @ 00baaa44
00baaa44	sub sp,sp,#0x70
00baaa48	str x23,[sp, #0x30]
00baaa4c	stp x22,x21,[sp, #0x40]
00baaa50	stp x20,x19,[sp, #0x50]
00baaa54	stp x29,x30,[sp, #0x60]
00baaa58	add x29,sp,#0x60
00baaa5c	mrs x23,tpidr_el0
00baaa60	ldr x8,[x23, #0x28]
00baaa64	mov x19,x3
00baaa68	mov x20,x2
00baaa6c	mov x21,x1
00baaa70	mov x22,x0
00baaa74	str x8,[sp, #0x28]
00baaa78	cbz x3,0x00baaa8c
00baaa7c	mov x0,x19
00baaa80	mov x1,xzr
00baaa84	bl 0x00c41b40
00baaa88	cbz w0,0x00baaabc
00baaa8c	orr w22,wzr,#0xfffffffc
00baaa90	ldr x8,[x23, #0x28]
00baaa94	ldr x9,[sp, #0x28]
00baaa98	cmp x8,x9
00baaa9c	b.ne 0x00baaba8
00baaaa0	mov w0,w22
00baaaa4	ldp x29,x30,[sp, #0x60]
00baaaa8	ldp x20,x19,[sp, #0x50]
00baaaac	ldp x22,x21,[sp, #0x40]
00baaab0	ldr x23,[sp, #0x30]
00baaab4	add sp,sp,#0x70
00baaab8	ret
00baaabc	mov w1,#0x1
00baaac0	mov x0,x22
00baaac4	bl 0x00c41b40
00baaac8	cmp w0,#0x1
00baaacc	b.lt 0x00baaa8c
00baaad0	mov w1,#0x1
00baaad4	mov x0,x21
00baaad8	bl 0x00c41b40
00baaadc	cmp w0,#0x1
00baaae0	b.lt 0x00baaa8c
00baaae4	mov x0,x20
00baaae8	mov x1,xzr
00baaaec	bl 0x00c41b40
00baaaf0	cbz w0,0x00baaa8c
00baaaf4	add x0,sp,#0x18
00baaaf8	bl 0x00c41c00
00baaafc	add x0,sp,#0x8
00baab00	bl 0x00c41c00
00baab04	add x0,sp,#0x18
00baab08	mov w2,#0x1
00baab0c	mov x1,x22
00baab10	bl 0x00c41d50
00baab14	mov w22,w0
00baab18	cbnz w0,0x00baab94
00baab1c	add x0,sp,#0x8
00baab20	mov w2,#0x1
00baab24	mov x1,x21
00baab28	bl 0x00c41d50
00baab2c	mov w22,w0
00baab30	cbnz w0,0x00baab94
00baab34	add x1,sp,#0x18
00baab38	add x2,sp,#0x8
00baab3c	mov x0,x19
00baab40	bl 0x00c41bc0
00baab44	mov w22,w0
00baab48	cbnz w0,0x00baab94
00baab4c	add x0,sp,#0x18
00baab50	add x1,sp,#0x18
00baab54	add x2,sp,#0x8
00baab58	bl 0x00c41c80
00baab5c	mov w22,w0
00baab60	cbnz w0,0x00baab94
00baab64	add x0,sp,#0x18
00baab68	add x2,sp,#0x18
00baab6c	mov x1,xzr
00baab70	mov x3,x19
00baab74	bl 0x00c41b70
00baab78	mov w22,w0
00baab7c	cbnz w0,0x00baab94
00baab80	add x2,sp,#0x18
00baab84	mov x0,x19
00baab88	mov x1,x20
00baab8c	bl 0x00c41c10
00baab90	mov w22,w0
00baab94	add x0,sp,#0x18
00baab98	bl 0x00c41bb0
00baab9c	add x0,sp,#0x8
00baaba0	bl 0x00c41bb0
00baaba4	b 0x00baaa90
00baaba8	bl 0x00c2fec0
