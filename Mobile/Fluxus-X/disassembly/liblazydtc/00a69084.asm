; EVP_MAC_free @ 00a69084
00a69084	stp x20,x19,[sp, #-0x20]!
00a69088	stp x29,x30,[sp, #0x10]
00a6908c	add x29,sp,#0x10
00a69090	cbz x0,0x00a690c0
00a69094	mov x19,x0
00a69098	add x9,x0,#0x20
00a6909c	ldxr w8,[x9]
00a690a0	subs w10,w8,#0x1
00a690a4	stxr w11,w10,[x9]
00a690a8	cbnz w11,0x00a6909c
00a690ac	b.ne 0x00a690b8
00a690b0	dmb ISHLD
00a690b4	b 0x00a690cc
00a690b8	cmp w8,#0x1
00a690bc	b.le 0x00a690cc
00a690c0	ldp x29,x30,[sp, #0x10]
00a690c4	ldp x20,x19,[sp], #0x20
00a690c8	ret
00a690cc	ldr x0,[x19, #0x10]
00a690d0	adrp x20,0x2b2000
00a690d4	add x20,x20,#0x239
00a690d8	mov w2,#0x27
00a690dc	mov x1,x20
00a690e0	bl 0x00c32310
00a690e4	ldr x0,[x19]
00a690e8	bl 0x00c3b690
00a690ec	ldr x0,[x19, #0x28]
00a690f0	bl 0x00c34d40
00a690f4	ldp x29,x30,[sp, #0x10]
00a690f8	mov w2,#0x2a
00a690fc	mov x0,x19
00a69100	mov x1,x20
00a69104	ldp x20,x19,[sp], #0x20
00a69108	b 0x00c32310
