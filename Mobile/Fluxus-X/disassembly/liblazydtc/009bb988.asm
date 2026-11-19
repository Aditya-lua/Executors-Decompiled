; SSL_use_PrivateKey_file @ 009bb988
009bb988	stp x22,x21,[sp, #-0x30]!
009bb98c	stp x20,x19,[sp, #0x10]
009bb990	stp x29,x30,[sp, #0x20]
009bb994	add x29,sp,#0x20
009bb998	mov w21,w2
009bb99c	mov x22,x1
009bb9a0	mov x20,x0
009bb9a4	bl 0x00c32270
009bb9a8	bl 0x00c32240
009bb9ac	mov x19,x0
009bb9b0	cbz x0,0x009bba30
009bb9b4	mov w1,#0x6c
009bb9b8	orr w2,wzr,#0x3
009bb9bc	mov x0,x19
009bb9c0	mov x3,x22
009bb9c4	bl 0x00c321a0
009bb9c8	cmp w0,#0x0
009bb9cc	b.le 0x009bba60
009bb9d0	cmp w21,#0x2
009bb9d4	b.eq 0x009bba8c
009bb9d8	cmp w21,#0x1
009bb9dc	b.ne 0x009bbae0
009bb9e0	ldr x8,[x20, #0x9a8]
009bb9e4	ldr x2,[x20, #0x1d18]
009bb9e8	ldr x3,[x20, #0x1d20]
009bb9ec	mov x0,x19
009bb9f0	ldr x4,[x8]
009bb9f4	ldr x5,[x8, #0x440]
009bb9f8	mov x1,xzr
009bb9fc	bl 0x00c35fa0
009bba00	mov w8,#0x2
009bba04	movk w8,#0x8, LSL #16
009bba08	mov x22,x0
009bba0c	add w21,w8,#0x7
009bba10	cbz x22,0x009bbab8
009bba14	ldr x0,[x20, #0x898]
009bba18	mov x1,x22
009bba1c	bl 0x009bb8c0
009bba20	mov w20,w0
009bba24	mov x0,x22
009bba28	bl 0x00c32450
009bba2c	b 0x009bbb10
009bba30	bl 0x00c342a0
009bba34	adrp x0,0x2db000
009bba38	adrp x2,0x2c1000
009bba3c	add x0,x0,#0xaec
009bba40	add x2,x2,#0x74e
009bba44	mov w1,#0x9e
009bba48	bl 0x00c342b0
009bba4c	mov w8,#0x2
009bba50	movk w8,#0x8, LSL #16
009bba54	add w1,w8,#0x5
009bba58	mov w0,#0x14
009bba5c	b 0x009bbb04
009bba60	bl 0x00c342a0
009bba64	adrp x0,0x2db000
009bba68	adrp x2,0x2c1000
009bba6c	add x0,x0,#0xaec
009bba70	add x2,x2,#0x74e
009bba74	mov w1,#0xa3
009bba78	bl 0x00c342b0
009bba7c	mov w1,#0x2
009bba80	mov w0,#0x14
009bba84	movk w1,#0x8, LSL #16
009bba88	b 0x009bbb04
009bba8c	ldr x8,[x20, #0x9a8]
009bba90	mov x0,x19
009bba94	mov x1,xzr
009bba98	ldr x2,[x8]
009bba9c	ldr x3,[x8, #0x440]
009bbaa0	bl 0x00c36000
009bbaa4	mov w8,#0x2
009bbaa8	movk w8,#0x8, LSL #16
009bbaac	mov x22,x0
009bbab0	add w21,w8,#0xb
009bbab4	cbnz x22,0x009bba14
009bbab8	bl 0x00c342a0
009bbabc	adrp x0,0x2db000
009bbac0	adrp x2,0x2c1000
009bbac4	add x0,x0,#0xaec
009bbac8	add x2,x2,#0x74e
009bbacc	mov w1,#0xb6
009bbad0	bl 0x00c342b0
009bbad4	mov w0,#0x14
009bbad8	mov w1,w21
009bbadc	b 0x009bbb04
009bbae0	bl 0x00c342a0
009bbae4	adrp x0,0x2db000
009bbae8	adrp x2,0x2c1000
009bbaec	add x0,x0,#0xaec
009bbaf0	add x2,x2,#0x74e
009bbaf4	mov w1,#0xb2
009bbaf8	bl 0x00c342b0
009bbafc	mov w0,#0x14
009bbb00	orr w1,wzr,#0x7c
009bbb04	mov x2,xzr
009bbb08	bl 0x00c342c0
009bbb0c	mov w20,wzr
009bbb10	mov x0,x19
009bbb14	bl 0x00c31a40
009bbb18	mov w0,w20
009bbb1c	ldp x29,x30,[sp, #0x20]
009bbb20	ldp x20,x19,[sp, #0x10]
009bbb24	ldp x22,x21,[sp], #0x30
009bbb28	ret
