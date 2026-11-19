; UI_process @ 00aee940
00aee940	stp x22,x21,[sp, #-0x30]!
00aee944	stp x20,x19,[sp, #0x10]
00aee948	stp x29,x30,[sp, #0x20]
00aee94c	ldr x8,[x0]
00aee950	mov x19,x0
00aee954	add x29,sp,#0x20
00aee958	ldr x8,[x8, #0x8]
00aee95c	cbz x8,0x00aee970
00aee960	mov x0,x19
00aee964	blr x8
00aee968	cmp w0,#0x1
00aee96c	b.lt 0x00aeea70
00aee970	ldrb w8,[x19, #0x29]
00aee974	tbz w8,#0x0,0x00aee988
00aee978	adrp x0,0xaee000
00aee97c	add x0,x0,#0xb28
00aee980	mov x1,x19
00aee984	bl 0x00c3bee0
00aee988	ldr x0,[x19, #0x8]
00aee98c	bl 0x00c325e0
00aee990	ldr x8,[x19]
00aee994	cmp w0,#0x1
00aee998	b.lt 0x00aee9e8
00aee99c	adrp x20,0x2da000
00aee9a0	mov w21,wzr
00aee9a4	add x20,x20,#0x619
00aee9a8	ldr x22,[x8, #0x10]
00aee9ac	cbz x22,0x00aee9d0
00aee9b0	ldr x0,[x19, #0x8]
00aee9b4	mov w1,w21
00aee9b8	bl 0x00c32610
00aee9bc	mov x1,x0
00aee9c0	mov x0,x19
00aee9c4	blr x22
00aee9c8	cmp w0,#0x1
00aee9cc	b.lt 0x00aeeaa0
00aee9d0	ldr x0,[x19, #0x8]
00aee9d4	add w21,w21,#0x1
00aee9d8	bl 0x00c325e0
00aee9dc	ldr x8,[x19]
00aee9e0	cmp w21,w0
00aee9e4	b.lt 0x00aee9a8
00aee9e8	ldr x8,[x8, #0x18]
00aee9ec	cbz x8,0x00aeea04
00aee9f0	mov x0,x19
00aee9f4	blr x8
00aee9f8	cbz w0,0x00aeea98
00aee9fc	cmn w0,#0x1
00aeea00	b.eq 0x00aeea7c
00aeea04	ldr x0,[x19, #0x8]
00aeea08	bl 0x00c325e0
00aeea0c	cmp w0,#0x1
00aeea10	b.lt 0x00aeea64
00aeea14	adrp x20,0x2a6000
00aeea18	mov w21,wzr
00aeea1c	add x20,x20,#0x7d9
00aeea20	ldr x8,[x19]
00aeea24	ldr x22,[x8, #0x20]
00aeea28	cbz x22,0x00aeea7c
00aeea2c	ldr x0,[x19, #0x8]
00aeea30	mov w1,w21
00aeea34	bl 0x00c32610
00aeea38	mov x1,x0
00aeea3c	mov x0,x19
00aeea40	blr x22
00aeea44	cbz w0,0x00aeeaa0
00aeea48	cmn w0,#0x1
00aeea4c	b.eq 0x00aeea7c
00aeea50	ldr x0,[x19, #0x8]
00aeea54	add w21,w21,#0x1
00aeea58	bl 0x00c325e0
00aeea5c	cmp w21,w0
00aeea60	b.lt 0x00aeea20
00aeea64	mov w21,wzr
00aeea68	mov x20,xzr
00aeea6c	b 0x00aeeaa4
00aeea70	adrp x20,0x2c6000
00aeea74	add x20,x20,#0x2a4
00aeea78	b 0x00aeeaa0
00aeea7c	ldr w8,[x19, #0x28]
00aeea80	adrp x20,0x2dc000
00aeea84	add x20,x20,#0x9fa
00aeea88	orr w21,wzr,#0xfffffffe
00aeea8c	and w8,w8,#0xfffffffe
00aeea90	str w8,[x19, #0x28]
00aeea94	b 0x00aeeaa4
00aeea98	adrp x20,0x2a8000
00aeea9c	add x20,x20,#0x84e
00aeeaa0	mov w21,#0xffffffff
00aeeaa4	ldr x8,[x19]
00aeeaa8	ldr x8,[x8, #0x28]
00aeeaac	cbz x8,0x00aeeac0
00aeeab0	mov x0,x19
00aeeab4	blr x8
00aeeab8	cmp w0,#0x0
00aeeabc	b.le 0x00aeeacc
00aeeac0	cmn w21,#0x1
00aeeac4	b.ne 0x00aeeb14
00aeeac8	b 0x00aeeadc
00aeeacc	adrp x8,0x2a4000
00aeead0	add x8,x8,#0x930
00aeead4	cmp x20,#0x0
00aeead8	csel x20,x8,x20,eq
00aeeadc	bl 0x00c342a0
00aeeae0	adrp x0,0x2a0000
00aeeae4	adrp x2,0x2a0000
00aeeae8	add x0,x0,#0xc2f
00aeeaec	add x2,x2,#0xc42
00aeeaf0	mov w1,#0x224
00aeeaf4	bl 0x00c342b0
00aeeaf8	adrp x2,0x2ba000
00aeeafc	add x2,x2,#0x741
00aeeb00	mov w0,#0x28
00aeeb04	mov w1,#0x6b
00aeeb08	mov x3,x20
00aeeb0c	bl 0x00c342c0
00aeeb10	mov w21,#0xffffffff
00aeeb14	ldp x29,x30,[sp, #0x20]
00aeeb18	ldp x20,x19,[sp, #0x10]
00aeeb1c	mov w0,w21
00aeeb20	ldp x22,x21,[sp], #0x30
00aeeb24	ret
