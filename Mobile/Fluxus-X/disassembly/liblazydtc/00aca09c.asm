; EVP_RAND_get_strength @ 00aca09c
00aca09c	sub sp,sp,#0xa0
00aca0a0	stp x20,x19,[sp, #0x80]
00aca0a4	stp x29,x30,[sp, #0x90]
00aca0a8	ldr x8,[x0]
00aca0ac	mov x19,x0
00aca0b0	add x29,sp,#0x90
00aca0b4	ldr x8,[x8, #0x78]
00aca0b8	cbz x8,0x00aca0c8
00aca0bc	ldr x0,[x19, #0x8]
00aca0c0	blr x8
00aca0c4	cbz w0,0x00aca134
00aca0c8	add x0,sp,#0x30
00aca0cc	mov w2,#0x50
00aca0d0	mov w1,wzr
00aca0d4	bl 0x00c301c0
00aca0d8	adrp x0,0x29e000
00aca0dc	add x0,x0,#0x95d
00aca0e0	mov x8,sp
00aca0e4	add x1,sp,#0x2c
00aca0e8	str wzr,[sp, #0x2c]
00aca0ec	bl 0x00c37340
00aca0f0	ldr x8,[sp, #0x20]
00aca0f4	ldp q1,q0,[sp]
00aca0f8	add x1,sp,#0x30
00aca0fc	str x8,[sp, #0x50]
00aca100	stp q1,q0,[sp, #0x30]
00aca104	ldp x8,x0,[x19]
00aca108	ldr x8,[x8, #0xa8]
00aca10c	blr x8
00aca110	ldr x8,[x19]
00aca114	ldr w9,[sp, #0x2c]
00aca118	cmp w0,#0x0
00aca11c	ldr x8,[x8, #0x80]
00aca120	csel w20,wzr,w9,eq
00aca124	cbz x8,0x00aca138
00aca128	ldr x0,[x19, #0x8]
00aca12c	blr x8
00aca130	b 0x00aca138
00aca134	mov w20,wzr
00aca138	mov w0,w20
00aca13c	ldp x29,x30,[sp, #0x90]
00aca140	ldp x20,x19,[sp, #0x80]
00aca144	add sp,sp,#0xa0
00aca148	ret
