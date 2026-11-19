; ssl_verify_cert_chain @ 009acaa0
009acaa0	stp x22,x21,[sp, #-0x30]!
009acaa4	stp x20,x19,[sp, #0x10]
009acaa8	stp x29,x30,[sp, #0x20]
009acaac	add x29,sp,#0x20
009acab0	cbz x1,0x009acc04
009acab4	mov x20,x0
009acab8	mov x0,x1
009acabc	mov x21,x1
009acac0	bl 0x00c325e0
009acac4	cbz w0,0x009acc04
009acac8	ldr x8,[x20, #0x898]
009acacc	ldr x22,[x8, #0x1d0]
009acad0	ldr x8,[x20, #0x9a8]
009acad4	cbnz x22,0x009acadc
009acad8	ldr x22,[x8, #0x28]
009acadc	ldr x0,[x8]
009acae0	ldr x1,[x8, #0x440]
009acae4	bl 0x00c34fd0
009acae8	cbz x0,0x009acc0c
009acaec	mov x19,x0
009acaf0	mov x0,x21
009acaf4	mov w1,wzr
009acaf8	bl 0x00c32610
009acafc	mov x2,x0
009acb00	mov x0,x19
009acb04	mov x1,x22
009acb08	mov x3,x21
009acb0c	bl 0x00c34fc0
009acb10	cbz w0,0x009acc44
009acb14	mov x0,x19
009acb18	bl 0x00c34f90
009acb1c	mov x21,x0
009acb20	mov x0,x20
009acb24	bl 0x00c34f30
009acb28	mov w1,w0
009acb2c	mov x0,x21
009acb30	bl 0x00c35060
009acb34	ldr x8,[x20, #0x898]
009acb38	mov x0,x19
009acb3c	ldr w8,[x8, #0x1c]
009acb40	and x1,x8,#0x30000
009acb44	bl 0x00c35010
009acb48	adrp x0,0xd21000
009acb4c	adrp x1,0x9ab000
009acb50	add x0,x0,#0x8b0
009acb54	add x1,x1,#0xcb4
009acb58	bl 0x00c34d60
009acb5c	mov w1,#0xffffffff
009acb60	cbz w0,0x009acb78
009acb64	adrp x8,0xd21000
009acb68	ldr w8,[x8, #0x8b4]
009acb6c	cbz w8,0x009acb78
009acb70	adrp x8,0xcc8000
009acb74	ldr w1,[x8, #0x490]
009acb78	mov x0,x19
009acb7c	mov x2,x20
009acb80	bl 0x00c35000
009acb84	cbz w0,0x009acc74
009acb88	ldr x0,[x20, #0x4e8]
009acb8c	bl 0x00c325e0
009acb90	cmp w0,#0x1
009acb94	b.lt 0x009acba4
009acb98	add x1,x20,#0x4e0
009acb9c	mov x0,x19
009acba0	bl 0x00c34fe0
009acba4	ldr w8,[x20, #0x38]
009acba8	adrp x9,0x2ad000
009acbac	adrp x10,0x2d7000
009acbb0	add x9,x9,#0x6b3
009acbb4	add x10,x10,#0x88a
009acbb8	cmp w8,#0x0
009acbbc	csel x1,x10,x9,eq
009acbc0	mov x0,x19
009acbc4	bl 0x00c34ff0
009acbc8	ldr x1,[x20, #0x4d8]
009acbcc	mov x0,x21
009acbd0	bl 0x00c35050
009acbd4	ldr x1,[x20, #0x970]
009acbd8	cbz x1,0x009acbe4
009acbdc	mov x0,x19
009acbe0	bl 0x00c35020
009acbe4	ldr x9,[x20, #0x9a8]
009acbe8	ldr x8,[x9, #0xa8]
009acbec	cbz x8,0x009acc7c
009acbf0	ldr x1,[x9, #0xb0]
009acbf4	mov x0,x19
009acbf8	blr x8
009acbfc	mov w22,w0
009acc00	b 0x009acc88
009acc04	mov w22,wzr
009acc08	b 0x009acd14
009acc0c	bl 0x00c342a0
009acc10	adrp x0,0x2d5000
009acc14	adrp x2,0x2bb000
009acc18	add x0,x0,#0x6b3
009acc1c	add x2,x2,#0x70f
009acc20	mov w1,#0x190
009acc24	bl 0x00c342b0
009acc28	mov w1,#0x100
009acc2c	mov w0,#0x14
009acc30	movk w1,#0xc, LSL #16
009acc34	mov x2,xzr
009acc38	bl 0x00c342c0
009acc3c	mov w22,wzr
009acc40	b 0x009acd14
009acc44	bl 0x00c342a0
009acc48	adrp x0,0x2d5000
009acc4c	adrp x2,0x2bb000
009acc50	add x0,x0,#0x6b3
009acc54	add x2,x2,#0x70f
009acc58	mov w1,#0x196
009acc5c	bl 0x00c342b0
009acc60	mov w1,#0xb
009acc64	mov w0,#0x14
009acc68	movk w1,#0x8, LSL #16
009acc6c	mov x2,xzr
009acc70	bl 0x00c342c0
009acc74	mov w22,wzr
009acc78	b 0x009acd0c
009acc7c	mov x0,x19
009acc80	bl 0x00c350c0
009acc84	bic w22,w0,w0, ASR #0x1f
009acc88	mov x0,x19
009acc8c	bl 0x00c34fb0
009acc90	sxtw x9,w0
009acc94	ldr x8,[x20, #0x9b0]
009acc98	str x9,[x20, #0x9b8]
009acc9c	adrp x1,0xcb4000
009acca0	ldr x1,[x1, #0xd88]
009acca4	mov x0,x8
009acca8	bl 0x00c32600
009accac	mov x0,x19
009accb0	str xzr,[x20, #0x9b0]
009accb4	bl 0x00c34f80
009accb8	cbz x0,0x009acd00
009accbc	mov x0,x19
009accc0	bl 0x00c34fa0
009accc4	str x0,[x20, #0x9b0]
009accc8	cbnz x0,0x009acd00
009acccc	bl 0x00c342a0
009accd0	adrp x0,0x2d5000
009accd4	adrp x2,0x2bb000
009accd8	add x0,x0,#0x6b3
009accdc	add x2,x2,#0x70f
009acce0	mov w1,#0x1ca
009acce4	bl 0x00c342b0
009acce8	mov w1,#0x100
009accec	mov w0,#0x14
009accf0	movk w1,#0xc, LSL #16
009accf4	mov x2,xzr
009accf8	bl 0x00c342c0
009accfc	mov w22,wzr
009acd00	ldr x0,[x20, #0x4d8]
009acd04	mov x1,x21
009acd08	bl 0x00c35040
009acd0c	mov x0,x19
009acd10	bl 0x00c34f70
009acd14	ldp x29,x30,[sp, #0x20]
009acd18	ldp x20,x19,[sp, #0x10]
009acd1c	mov w0,w22
009acd20	ldp x22,x21,[sp], #0x30
009acd24	ret
