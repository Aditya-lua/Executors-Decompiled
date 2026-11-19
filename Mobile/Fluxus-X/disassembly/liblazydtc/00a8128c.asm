; ossl_lib_ctx_is_default @ 00a8128c
00a8128c	cbz x0,0x00a812d8
00a81290	str x19,[sp, #-0x20]!
00a81294	mov x19,x0
00a81298	adrp x0,0xd21000
00a8129c	adrp x1,0xa81000
00a812a0	add x0,x0,#0xd5c
00a812a4	add x1,x1,#0x348
00a812a8	stp x29,x30,[sp, #0x10]
00a812ac	add x29,sp,#0x10
00a812b0	bl 0x00c34d60
00a812b4	cbz w0,0x00a812e0
00a812b8	adrp x8,0xd21000
00a812bc	ldr w8,[x8, #0xd60]
00a812c0	mov x0,xzr
00a812c4	cbz w8,0x00a812e4
00a812c8	adrp x0,0xd21000
00a812cc	add x0,x0,#0xd58
00a812d0	bl 0x00c38360
00a812d4	b 0x00a812e4
00a812d8	mov w0,#0x1
00a812dc	ret
00a812e0	mov x0,xzr
00a812e4	adrp x8,0xd21000
00a812e8	add x8,x8,#0xb90
00a812ec	cmp x0,#0x0
00a812f0	ldp x29,x30,[sp, #0x10]
00a812f4	csel x8,x8,x0,eq
00a812f8	cmp x8,x19
00a812fc	cset w0,eq
00a81300	ldr x19,[sp], #0x20
00a81304	ret
