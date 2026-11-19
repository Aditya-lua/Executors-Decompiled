; OSSL_DECODER_free @ 00a4e5c0
00a4e5c0	stp x20,x19,[sp, #-0x20]!
00a4e5c4	stp x29,x30,[sp, #0x10]
00a4e5c8	add x29,sp,#0x10
00a4e5cc	cbz x0,0x00a4e5fc
00a4e5d0	mov x19,x0
00a4e5d4	add x9,x0,#0x28
00a4e5d8	ldxr w8,[x9]
00a4e5dc	subs w10,w8,#0x1
00a4e5e0	stxr w11,w10,[x9]
00a4e5e4	cbnz w11,0x00a4e5d8
00a4e5e8	b.ne 0x00a4e5f4
00a4e5ec	dmb ISHLD
00a4e5f0	b 0x00a4e608
00a4e5f4	cmp w8,#0x1
00a4e5f8	b.le 0x00a4e608
00a4e5fc	ldp x29,x30,[sp, #0x10]
00a4e600	ldp x20,x19,[sp], #0x20
00a4e604	ret
00a4e608	ldr x0,[x19, #0x10]
00a4e60c	adrp x20,0x2db000
00a4e610	add x20,x20,#0xf32
00a4e614	mov w2,#0x3d
00a4e618	mov x1,x20
00a4e61c	bl 0x00c32310
00a4e620	ldr x0,[x19, #0x20]
00a4e624	bl 0x00c3b670
00a4e628	ldr x0,[x19]
00a4e62c	bl 0x00c3b690
00a4e630	ldr x0,[x19, #0x30]
00a4e634	bl 0x00c34d40
00a4e638	ldp x29,x30,[sp, #0x10]
00a4e63c	mov w2,#0x41
00a4e640	mov x0,x19
00a4e644	mov x1,x20
00a4e648	ldp x20,x19,[sp], #0x20
00a4e64c	b 0x00c32310
