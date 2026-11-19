; ECDSA_SIG_free @ 00a264e4
00a264e4	cbz x0,0x00a26524
00a264e8	str x19,[sp, #-0x20]!
00a264ec	stp x29,x30,[sp, #0x10]
00a264f0	mov x19,x0
00a264f4	ldr x0,[x0]
00a264f8	add x29,sp,#0x10
00a264fc	bl 0x00c322e0
00a26500	ldr x0,[x19, #0x8]
00a26504	bl 0x00c322e0
00a26508	ldp x29,x30,[sp, #0x10]
00a2650c	adrp x1,0x2af000
00a26510	add x1,x1,#0xe09
00a26514	mov w2,#0x4c0
00a26518	mov x0,x19
00a2651c	ldr x19,[sp], #0x20
00a26520	b 0x00c32310
00a26524	ret
