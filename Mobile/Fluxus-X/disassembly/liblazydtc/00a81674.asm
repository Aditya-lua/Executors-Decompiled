; ossl_lib_ctx_get_ex_data_global @ 00a81674
00a81674	cbnz x0,0x00a816d0
00a81678	stp x29,x30,[sp, #-0x10]!
00a8167c	adrp x0,0xd21000
00a81680	adrp x1,0xa81000
00a81684	add x0,x0,#0xd5c
00a81688	add x1,x1,#0x348
00a8168c	mov x29,sp
00a81690	bl 0x00c34d60
00a81694	cbz w0,0x00a816b8
00a81698	adrp x8,0xd21000
00a8169c	ldr w8,[x8, #0xd60]
00a816a0	mov x0,xzr
00a816a4	cbz w8,0x00a816bc
00a816a8	adrp x0,0xd21000
00a816ac	add x0,x0,#0xd58
00a816b0	bl 0x00c38360
00a816b4	b 0x00a816bc
00a816b8	mov x0,xzr
00a816bc	adrp x8,0xd21000
00a816c0	add x8,x8,#0xb90
00a816c4	cmp x0,#0x0
00a816c8	csel x0,x8,x0,eq
00a816cc	ldp x29,x30,[sp], #0x10
00a816d0	add x8,x0,#0x18
00a816d4	cmp x0,#0x0
00a816d8	csel x0,xzr,x8,eq
00a816dc	ret
