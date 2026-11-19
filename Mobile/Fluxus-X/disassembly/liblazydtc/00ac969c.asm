; EVP_RAND_free @ 00ac969c
00ac969c	stp x20,x19,[sp, #-0x20]!
00ac96a0	stp x29,x30,[sp, #0x10]
00ac96a4	add x29,sp,#0x10
00ac96a8	cbz x0,0x00ac96d8
00ac96ac	mov x19,x0
00ac96b0	add x9,x0,#0x20
00ac96b4	ldxr w8,[x9]
00ac96b8	subs w10,w8,#0x1
00ac96bc	stxr w11,w10,[x9]
00ac96c0	cbnz w11,0x00ac96b4
00ac96c4	b.ne 0x00ac96d0
00ac96c8	dmb ISHLD
00ac96cc	b 0x00ac96e4
00ac96d0	cmp w8,#0x1
00ac96d4	b.le 0x00ac96e4
00ac96d8	ldp x29,x30,[sp, #0x10]
00ac96dc	ldp x20,x19,[sp], #0x20
00ac96e0	ret
00ac96e4	ldr x0,[x19, #0x10]
00ac96e8	adrp x20,0x2ce000
00ac96ec	add x20,x20,#0x291
00ac96f0	mov w2,#0x48
00ac96f4	mov x1,x20
00ac96f8	bl 0x00c32310
00ac96fc	ldr x0,[x19]
00ac9700	bl 0x00c3b690
00ac9704	ldr x0,[x19, #0x28]
00ac9708	bl 0x00c34d40
00ac970c	ldp x29,x30,[sp, #0x10]
00ac9710	mov w2,#0x4b
00ac9714	mov x0,x19
00ac9718	mov x1,x20
00ac971c	ldp x20,x19,[sp], #0x20
00ac9720	b 0x00c32310
