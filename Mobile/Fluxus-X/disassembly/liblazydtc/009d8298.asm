; tls_parse_ctos_ems @ 009d8298
009d8298	str x19,[sp, #-0x20]!
009d829c	stp x29,x30,[sp, #0x10]
009d82a0	ldr x8,[x1, #0x8]
009d82a4	mov x19,x0
009d82a8	add x29,sp,#0x10
009d82ac	cbz x8,0x009d82e8
009d82b0	bl 0x00c342a0
009d82b4	adrp x0,0x2d7000
009d82b8	adrp x2,0x2d1000
009d82bc	add x0,x0,#0xae0
009d82c0	add x2,x2,#0x6a9
009d82c4	mov w1,#0x39f
009d82c8	bl 0x00c342b0
009d82cc	mov w1,#0x32
009d82d0	mov w2,#0x6e
009d82d4	mov x0,x19
009d82d8	mov x3,xzr
009d82dc	bl 0x00c34410
009d82e0	mov w0,wzr
009d82e4	b 0x009d8300
009d82e8	ldrb w8,[x19, #0x9e8]
009d82ec	tbnz w8,#0x0,0x009d82fc
009d82f0	ldr x8,[x19, #0xa8]
009d82f4	orr x8,x8,#0x200
009d82f8	str x8,[x19, #0xa8]
009d82fc	mov w0,#0x1
009d8300	ldp x29,x30,[sp, #0x10]
009d8304	ldr x19,[sp], #0x20
009d8308	ret
