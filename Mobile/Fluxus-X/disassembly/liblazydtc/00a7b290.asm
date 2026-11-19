; EVP_SIGNATURE_free @ 00a7b290
00a7b290	stp x20,x19,[sp, #-0x20]!
00a7b294	stp x29,x30,[sp, #0x10]
00a7b298	add x29,sp,#0x10
00a7b29c	cbz x0,0x00a7b2cc
00a7b2a0	mov x19,x0
00a7b2a4	add x9,x0,#0x20
00a7b2a8	ldxr w8,[x9]
00a7b2ac	subs w10,w8,#0x1
00a7b2b0	stxr w11,w10,[x9]
00a7b2b4	cbnz w11,0x00a7b2a8
00a7b2b8	b.ne 0x00a7b2c4
00a7b2bc	dmb ISHLD
00a7b2c0	b 0x00a7b2d8
00a7b2c4	cmp w8,#0x1
00a7b2c8	b.le 0x00a7b2d8
00a7b2cc	ldp x29,x30,[sp, #0x10]
00a7b2d0	ldp x20,x19,[sp], #0x20
00a7b2d4	ret
00a7b2d8	ldr x0,[x19, #0x8]
00a7b2dc	adrp x20,0x2d1000
00a7b2e0	add x20,x20,#0xaf6
00a7b2e4	mov w2,#0x121
00a7b2e8	mov x1,x20
00a7b2ec	bl 0x00c32310
00a7b2f0	ldr x0,[x19, #0x18]
00a7b2f4	bl 0x00c3b690
00a7b2f8	ldr x0,[x19, #0x28]
00a7b2fc	bl 0x00c34d40
00a7b300	ldp x29,x30,[sp, #0x10]
00a7b304	mov w2,#0x124
00a7b308	mov x0,x19
00a7b30c	mov x1,x20
00a7b310	ldp x20,x19,[sp], #0x20
00a7b314	b 0x00c32310
