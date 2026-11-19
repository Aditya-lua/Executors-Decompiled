; ossl_lib_ctx_is_global_default @ 00a81468
00a81468	cbnz x0,0x00a814c4
00a8146c	stp x29,x30,[sp, #-0x10]!
00a81470	adrp x0,0xd21000
00a81474	adrp x1,0xa81000
00a81478	add x0,x0,#0xd5c
00a8147c	add x1,x1,#0x348
00a81480	mov x29,sp
00a81484	bl 0x00c34d60
00a81488	cbz w0,0x00a814ac
00a8148c	adrp x8,0xd21000
00a81490	ldr w8,[x8, #0xd60]
00a81494	mov x0,xzr
00a81498	cbz w8,0x00a814b0
00a8149c	adrp x0,0xd21000
00a814a0	add x0,x0,#0xd58
00a814a4	bl 0x00c38360
00a814a8	b 0x00a814b0
00a814ac	mov x0,xzr
00a814b0	adrp x8,0xd21000
00a814b4	add x8,x8,#0xb90
00a814b8	cmp x0,#0x0
00a814bc	csel x0,x8,x0,eq
00a814c0	ldp x29,x30,[sp], #0x10
00a814c4	adrp x8,0xd21000
00a814c8	add x8,x8,#0xb90
00a814cc	cmp x0,x8
00a814d0	cset w0,eq
00a814d4	ret
