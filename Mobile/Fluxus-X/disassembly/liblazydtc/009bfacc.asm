; tls_provider_set_tls_params @ 009bfacc
009bfacc	sub sp,sp,#0xe0
009bfad0	stp x20,x19,[sp, #0xc0]
009bfad4	stp x29,x30,[sp, #0xd0]
009bfad8	add x29,sp,#0xd0
009bfadc	mov x19,x0
009bfae0	mov x0,x2
009bfae4	str x21,[sp, #0xb0]
009bfae8	mov x21,x3
009bfaec	mov x20,x1
009bfaf0	stur xzr,[x29, #-0x18]
009bfaf4	bl 0x00c35280
009bfaf8	tbnz w0,#0x15,0x009bfb18
009bfafc	ldr w8,[x19, #0xb2c]
009bfb00	cbnz w8,0x009bfb18
009bfb04	mov x0,x21
009bfb08	bl 0x00c34c20
009bfb0c	tbnz w0,#0x1f,0x009bfb18
009bfb10	sxtw x8,w0
009bfb14	stur x8,[x29, #-0x18]
009bfb18	adrp x0,0x2d5000
009bfb1c	add x0,x0,#0x92a
009bfb20	add x8,sp,#0x8
009bfb24	mov x1,x19
009bfb28	bl 0x00c36260
009bfb2c	ldr x8,[sp, #0x28]
009bfb30	ldur q0,[sp, #0x18]
009bfb34	ldur q1,[sp, #0x8]
009bfb38	adrp x0,0x2b9000
009bfb3c	str x8,[sp, #0x50]
009bfb40	add x0,x0,#0x9b4
009bfb44	add x8,sp,#0x8
009bfb48	sub x1,x29,#0x18
009bfb4c	stp q1,q0,[sp, #0x30]
009bfb50	bl 0x00c36270
009bfb54	ldr x8,[sp, #0x28]
009bfb58	ldur q0,[sp, #0x18]
009bfb5c	ldur q1,[sp, #0x8]
009bfb60	str x8,[sp, #0x78]
009bfb64	add x8,sp,#0x8
009bfb68	stur q0,[sp, #0x68]
009bfb6c	stur q1,[sp, #0x58]
009bfb70	bl 0x00c34c40
009bfb74	ldr x8,[sp, #0x28]
009bfb78	ldur q0,[sp, #0x18]
009bfb7c	ldur q1,[sp, #0x8]
009bfb80	add x1,sp,#0x30
009bfb84	mov x0,x20
009bfb88	str x8,[sp, #0xa0]
009bfb8c	stp q1,q0,[sp, #0x80]
009bfb90	bl 0x00c361c0
009bfb94	cbz w0,0x009bfba0
009bfb98	mov w0,#0x1
009bfb9c	b 0x009bfbd8
009bfba0	bl 0x00c342a0
009bfba4	adrp x0,0x2d7000
009bfba8	adrp x2,0x2a3000
009bfbac	add x0,x0,#0xa4c
009bfbb0	add x2,x2,#0xc8a
009bfbb4	mov w1,#0xa7
009bfbb8	bl 0x00c342b0
009bfbbc	mov w2,#0x103
009bfbc0	mov w1,#0x50
009bfbc4	movk w2,#0xc, LSL #16
009bfbc8	mov x0,x19
009bfbcc	mov x3,xzr
009bfbd0	bl 0x00c34410
009bfbd4	mov w0,wzr
009bfbd8	ldp x29,x30,[sp, #0xd0]
009bfbdc	ldp x20,x19,[sp, #0xc0]
009bfbe0	ldr x21,[sp, #0xb0]
009bfbe4	add sp,sp,#0xe0
009bfbe8	ret
