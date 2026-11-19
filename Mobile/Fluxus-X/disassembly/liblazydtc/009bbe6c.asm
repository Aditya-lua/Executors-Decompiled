; SSL_CTX_use_certificate_ASN1 @ 009bbe6c
009bbe6c	sub sp,sp,#0x30
009bbe70	stp x20,x19,[sp, #0x10]
009bbe74	stp x29,x30,[sp, #0x20]
009bbe78	mov x19,x0
009bbe7c	str x2,[sp, #0x8]
009bbe80	ldr x8,[x19, #0x440]
009bbe84	ldr x0,[x0]
009bbe88	mov w20,w1
009bbe8c	add x29,sp,#0x20
009bbe90	mov x1,x8
009bbe94	bl 0x00c350a0
009bbe98	str x0,[sp]
009bbe9c	cbz x0,0x009bbed4
009bbea0	sxtw x2,w20
009bbea4	mov x0,sp
009bbea8	add x1,sp,#0x8
009bbeac	bl 0x00c35ca0
009bbeb0	ldr x1,[sp]
009bbeb4	cbz x0,0x009bbf00
009bbeb8	mov x0,x19
009bbebc	bl 0x009bbbc8
009bbec0	ldr x8,[sp]
009bbec4	mov w19,w0
009bbec8	mov x0,x8
009bbecc	bl 0x00c31a90
009bbed0	b 0x009bbf3c
009bbed4	bl 0x00c342a0
009bbed8	adrp x0,0x2db000
009bbedc	adrp x2,0x2a9000
009bbee0	add x0,x0,#0xaec
009bbee4	add x2,x2,#0xe06
009bbee8	mov w1,#0x14a
009bbeec	bl 0x00c342b0
009bbef0	mov w1,#0x100
009bbef4	mov w0,#0x14
009bbef8	movk w1,#0xc, LSL #16
009bbefc	b 0x009bbf30
009bbf00	mov x0,x1
009bbf04	bl 0x00c31a90
009bbf08	bl 0x00c342a0
009bbf0c	adrp x0,0x2db000
009bbf10	adrp x2,0x2a9000
009bbf14	add x0,x0,#0xaec
009bbf18	add x2,x2,#0xe06
009bbf1c	mov w1,#0x150
009bbf20	bl 0x00c342b0
009bbf24	mov w1,#0xd
009bbf28	mov w0,#0x14
009bbf2c	movk w1,#0x8, LSL #16
009bbf30	mov x2,xzr
009bbf34	bl 0x00c342c0
009bbf38	mov w19,wzr
009bbf3c	mov w0,w19
009bbf40	ldp x29,x30,[sp, #0x20]
009bbf44	ldp x20,x19,[sp, #0x10]
009bbf48	add sp,sp,#0x30
009bbf4c	ret
