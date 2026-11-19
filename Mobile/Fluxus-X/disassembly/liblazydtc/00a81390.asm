; OSSL_LIB_CTX_set0_default @ 00a81390
00a81390	stp x20,x19,[sp, #-0x20]!
00a81394	mov x19,x0
00a81398	adrp x0,0xd21000
00a8139c	adrp x1,0xa81000
00a813a0	add x0,x0,#0xd5c
00a813a4	add x1,x1,#0x348
00a813a8	stp x29,x30,[sp, #0x10]
00a813ac	add x29,sp,#0x10
00a813b0	bl 0x00c34d60
00a813b4	mov w8,w0
00a813b8	mov x0,xzr
00a813bc	cbz w8,0x00a813d8
00a813c0	adrp x8,0xd21000
00a813c4	ldr w8,[x8, #0xd60]
00a813c8	cbz w8,0x00a813d8
00a813cc	adrp x0,0xd21000
00a813d0	add x0,x0,#0xd58
00a813d4	bl 0x00c38360
00a813d8	adrp x8,0xd21000
00a813dc	add x8,x8,#0xb90
00a813e0	cmp x0,#0x0
00a813e4	csel x20,x8,x0,eq
00a813e8	cbz x19,0x00a81400
00a813ec	cmp x19,x8
00a813f0	adrp x0,0xd21000
00a813f4	csel x1,xzr,x19,eq
00a813f8	add x0,x0,#0xd58
00a813fc	bl 0x00c38380
00a81400	ldp x29,x30,[sp, #0x10]
00a81404	mov x0,x20
00a81408	ldp x20,x19,[sp], #0x20
00a8140c	ret
