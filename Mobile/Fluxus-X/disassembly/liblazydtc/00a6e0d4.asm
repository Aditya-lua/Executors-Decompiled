; EVP_PKEY_type_names_do_all @ 00a6e0d4
00a6e0d4	stp x20,x19,[sp, #-0x20]!
00a6e0d8	stp x29,x30,[sp, #0x10]
00a6e0dc	mov x8,x0
00a6e0e0	ldr w0,[x0]
00a6e0e4	ldr x8,[x8, #0x60]
00a6e0e8	mov x19,x2
00a6e0ec	mov x20,x1
00a6e0f0	add x29,sp,#0x10
00a6e0f4	cbz w0,0x00a6e110
00a6e0f8	cbnz x8,0x00a6e114
00a6e0fc	bl 0x00c324f0
00a6e100	mov x1,x19
00a6e104	blr x20
00a6e108	mov w0,#0x1
00a6e10c	b 0x00a6e130
00a6e110	cbz x8,0x00a6e12c
00a6e114	ldp x29,x30,[sp, #0x10]
00a6e118	mov x0,x8
00a6e11c	mov x1,x20
00a6e120	mov x2,x19
00a6e124	ldp x20,x19,[sp], #0x20
00a6e128	b 0x00c3b6e0
00a6e12c	mov w0,wzr
00a6e130	ldp x29,x30,[sp, #0x10]
00a6e134	ldp x20,x19,[sp], #0x20
00a6e138	ret
