; EVP_KEYEXCH_free @ 00a6307c
00a6307c	stp x20,x19,[sp, #-0x20]!
00a63080	stp x29,x30,[sp, #0x10]
00a63084	add x29,sp,#0x10
00a63088	cbz x0,0x00a630b8
00a6308c	mov x19,x0
00a63090	add x9,x0,#0x20
00a63094	ldxr w8,[x9]
00a63098	subs w10,w8,#0x1
00a6309c	stxr w11,w10,[x9]
00a630a0	cbnz w11,0x00a63094
00a630a4	b.ne 0x00a630b0
00a630a8	dmb ISHLD
00a630ac	b 0x00a630c4
00a630b0	cmp w8,#0x1
00a630b4	b.le 0x00a630c4
00a630b8	ldp x29,x30,[sp, #0x10]
00a630bc	ldp x20,x19,[sp], #0x20
00a630c0	ret
00a630c4	ldr x0,[x19, #0x8]
00a630c8	adrp x20,0x2d7000
00a630cc	add x20,x20,#0xecb
00a630d0	mov w2,#0x9c
00a630d4	mov x1,x20
00a630d8	bl 0x00c32310
00a630dc	ldr x0,[x19, #0x18]
00a630e0	bl 0x00c3b690
00a630e4	ldr x0,[x19, #0x28]
00a630e8	bl 0x00c34d40
00a630ec	ldp x29,x30,[sp, #0x10]
00a630f0	mov w2,#0x9f
00a630f4	mov x0,x19
00a630f8	mov x1,x20
00a630fc	ldp x20,x19,[sp], #0x20
00a63100	b 0x00c32310
