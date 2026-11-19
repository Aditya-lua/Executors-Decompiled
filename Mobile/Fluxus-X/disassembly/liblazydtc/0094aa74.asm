; FUN_0094aa74 @ 0094aa74
0094aa74	sub sp,sp,#0x50
0094aa78	stp x24,x23,[sp, #0x10]
0094aa7c	stp x22,x21,[sp, #0x20]
0094aa80	stp x20,x19,[sp, #0x30]
0094aa84	stp x29,x30,[sp, #0x40]
0094aa88	add x29,sp,#0x40
0094aa8c	mrs x23,tpidr_el0
0094aa90	ldr x8,[x23, #0x28]
0094aa94	mov x20,x1
0094aa98	mov x19,x0
0094aa9c	str x8,[sp, #0x8]
0094aaa0	ldr x8,[x0, #0x3e8]
0094aaa4	mov w0,wzr
0094aaa8	cbnz x8,0x0094ac44
0094aaac	bl 0x00941cb8
0094aab0	ldr x2,[x19, #0x210]
0094aab4	ldr x3,[x19, #0x218]
0094aab8	mov x21,x0
0094aabc	mov x22,x1
0094aac0	bl 0x00941d54
0094aac4	mov x24,#0xf7cf
0094aac8	movk x24,#0xe353, LSL #16
0094aacc	movk x24,#0x9ba5, LSL #32
0094aad0	movk x24,#0x20c4, LSL #48
0094aad4	ldr x8,[x20, #0x2f8]
0094aad8	smulh x9,x0,x24
0094aadc	asr x10,x9,#0x7
0094aae0	add x2,x10,x9, LSR #0x3f
0094aae4	cmp x2,x8
0094aae8	b.le 0x0094ab14
0094aaec	ldrb w8,[x20, #0xa85]
0094aaf0	tbz w8,#0x4,0x0094ac00
0094aaf4	ldr x8,[x20, #0x12a0]
0094aaf8	cbz x8,0x0094ab08
0094aafc	ldr w8,[x8, #0x8]
0094ab00	cmp w8,#0x1
0094ab04	b.lt 0x0094ac00
0094ab08	adrp x1,0x2d1000
0094ab0c	add x1,x1,#0xc9
0094ab10	b 0x0094ab68
0094ab14	ldr x2,[x19, #0x200]
0094ab18	ldr x3,[x19, #0x208]
0094ab1c	mov x0,x21
0094ab20	mov x1,x22
0094ab24	bl 0x00941d54
0094ab28	ldr x8,[x20, #0x300]
0094ab2c	cbz x8,0x0094ab7c
0094ab30	smulh x9,x0,x24
0094ab34	asr x10,x9,#0x7
0094ab38	add x2,x10,x9, LSR #0x3f
0094ab3c	cmp x2,x8
0094ab40	b.le 0x0094ab7c
0094ab44	ldrb w8,[x20, #0xa85]
0094ab48	tbz w8,#0x4,0x0094ac00
0094ab4c	ldr x8,[x20, #0x12a0]
0094ab50	cbz x8,0x0094ab60
0094ab54	ldr w8,[x8, #0x8]
0094ab58	cmp w8,#0x1
0094ab5c	b.lt 0x0094ac00
0094ab60	adrp x1,0x2b1000
0094ab64	add x1,x1,#0x76d
0094ab68	mov x0,x20
0094ab6c	bl 0x00904c98
0094ab70	ldrb w8,[x20, #0xa85]
0094ab74	tbnz w8,#0x4,0x0094ac08
0094ab78	b 0x0094ac30
0094ab7c	ldr x8,[x19, #0x3a8]
0094ab80	ldr x8,[x8, #0x78]
0094ab84	cbz x8,0x0094abc4
0094ab88	mov x0,x20
0094ab8c	mov x1,x19
0094ab90	bl 0x0092bb60
0094ab94	ldr x8,[x19, #0x3a8]
0094ab98	mov w2,#0x1
0094ab9c	mov x0,x20
0094aba0	mov x1,x19
0094aba4	ldr x8,[x8, #0x78]
0094aba8	blr x8
0094abac	mov w21,w0
0094abb0	mov x0,x20
0094abb4	bl 0x0092bab8
0094abb8	mov w0,wzr
0094abbc	tbnz w21,#0x0,0x0094ac00
0094abc0	b 0x0094ac44
0094abc4	mov x0,x20
0094abc8	mov x1,x19
0094abcc	strb wzr,[sp, #0x4]
0094abd0	bl 0x0092bb60
0094abd4	add x2,sp,#0x4
0094abd8	mov x0,x20
0094abdc	mov x1,x19
0094abe0	bl 0x00908258
0094abe4	ldrb w22,[sp, #0x4]
0094abe8	mov w21,w0
0094abec	mov x0,x20
0094abf0	bl 0x0092bab8
0094abf4	cbnz w22,0x0094ac00
0094abf8	mov w0,wzr
0094abfc	tbnz w21,#0x0,0x0094ac44
0094ac00	ldrb w8,[x20, #0xa85]
0094ac04	tbz w8,#0x4,0x0094ac30
0094ac08	ldr x8,[x20, #0x12a0]
0094ac0c	cbz x8,0x0094ac1c
0094ac10	ldr w8,[x8, #0x8]
0094ac14	cmp w8,#0x1
0094ac18	b.lt 0x0094ac30
0094ac1c	ldr x2,[x19, #0x28]
0094ac20	adrp x1,0x2cd000
0094ac24	add x1,x1,#0x48
0094ac28	mov x0,x20
0094ac2c	bl 0x00904c98
0094ac30	mov x0,x20
0094ac34	mov x1,x19
0094ac38	mov w2,wzr
0094ac3c	bl 0x0090fe90
0094ac40	mov w0,#0x1
0094ac44	ldr x8,[x23, #0x28]
0094ac48	ldr x9,[sp, #0x8]
0094ac4c	cmp x8,x9
0094ac50	b.ne 0x0094ac6c
0094ac54	ldp x29,x30,[sp, #0x40]
0094ac58	ldp x20,x19,[sp, #0x30]
0094ac5c	ldp x22,x21,[sp, #0x20]
0094ac60	ldp x24,x23,[sp, #0x10]
0094ac64	add sp,sp,#0x50
0094ac68	ret
0094ac6c	bl 0x00c2fec0
