; ssl3_do_change_cipher_spec @ 009ab9d8
009ab9d8	stp x20,x19,[sp, #-0x20]!
009ab9dc	stp x29,x30,[sp, #0x10]
009ab9e0	ldr w8,[x0, #0x38]
009ab9e4	ldr x9,[x0, #0x318]
009ab9e8	mov w10,#0x21
009ab9ec	mov x19,x0
009ab9f0	cmp w8,#0x0
009ab9f4	mov w8,#0x11
009ab9f8	csel w20,w8,w10,eq
009ab9fc	add x29,sp,#0x10
009aba00	cbz x9,0x009aba28
009aba04	ldr x8,[x19, #0x8]
009aba08	mov x0,x19
009aba0c	mov w1,w20
009aba10	ldr x8,[x8, #0xc0]
009aba14	ldr x8,[x8, #0x20]
009aba18	blr x8
009aba1c	cmp w0,#0x0
009aba20	cset w0,ne
009aba24	b 0x009aba8c
009aba28	ldr x8,[x19, #0x918]
009aba2c	cbz x8,0x009aba5c
009aba30	ldr x9,[x8, #0x8]
009aba34	cbz x9,0x009aba5c
009aba38	ldr x9,[x19, #0x2e0]
009aba3c	mov x0,x19
009aba40	str x9,[x8, #0x2f8]
009aba44	ldr x8,[x19, #0x8]
009aba48	ldr x8,[x8, #0xc0]
009aba4c	ldr x8,[x8, #0x10]
009aba50	blr x8
009aba54	cbnz w0,0x009aba04
009aba58	b 0x009aba8c
009aba5c	bl 0x00c342a0
009aba60	adrp x0,0x2cd000
009aba64	adrp x2,0x2c9000
009aba68	add x0,x0,#0x50a
009aba6c	add x2,x2,#0x312
009aba70	orr w1,wzr,#0x18
009aba74	bl 0x00c342b0
009aba78	mov w0,#0x14
009aba7c	mov w1,#0x85
009aba80	mov x2,xzr
009aba84	bl 0x00c342c0
009aba88	mov w0,wzr
009aba8c	ldp x29,x30,[sp, #0x10]
009aba90	ldp x20,x19,[sp], #0x20
009aba94	ret
