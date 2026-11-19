; OSSL_STORE_LOADER_free @ 00aeb064
00aeb064	str x19,[sp, #-0x20]!
00aeb068	mov x19,x0
00aeb06c	stp x29,x30,[sp, #0x10]
00aeb070	add x29,sp,#0x10
00aeb074	cbz x0,0x00aeb0c4
00aeb078	ldr x0,[x19, #0x60]
00aeb07c	cbz x0,0x00aeb0c4
00aeb080	add x9,x19,#0x80
00aeb084	ldxr w8,[x9]
00aeb088	subs w10,w8,#0x1
00aeb08c	stxr w11,w10,[x9]
00aeb090	cbnz w11,0x00aeb084
00aeb094	b.ne 0x00aeb0a4
00aeb098	dmb ISHLD
00aeb09c	ldr x0,[x19, #0x60]
00aeb0a0	b 0x00aeb0b8
00aeb0a4	cmp w8,#0x1
00aeb0a8	b.le 0x00aeb0b8
00aeb0ac	ldp x29,x30,[sp, #0x10]
00aeb0b0	ldr x19,[sp], #0x20
00aeb0b4	ret
00aeb0b8	bl 0x00c3b690
00aeb0bc	ldr x0,[x19, #0x88]
00aeb0c0	bl 0x00c34d40
00aeb0c4	ldp x29,x30,[sp, #0x10]
00aeb0c8	adrp x1,0x2d0000
00aeb0cc	add x1,x1,#0x406
00aeb0d0	mov w2,#0x26
00aeb0d4	mov x0,x19
00aeb0d8	ldr x19,[sp], #0x20
00aeb0dc	b 0x00c32310
