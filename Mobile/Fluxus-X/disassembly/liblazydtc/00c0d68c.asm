; FUN_00c0d68c @ 00c0d68c
00c0d68c	paciasp
00c0d690	stp x29,x30,[sp, #-0x20]!
00c0d694	str x19,[sp, #0x10]
00c0d698	mov x29,sp
00c0d69c	mov x19,x0
00c0d6a0	adrp x0,0xd27000
00c0d6a4	add x0,x0,#0xe08
00c0d6a8	bl 0x00c31cb0
00c0d6ac	cbnz w0,0x00c0d6c0
00c0d6b0	ldr x19,[sp, #0x10]
00c0d6b4	ldp x29,x30,[sp], #0x20
00c0d6b8	autiasp
00c0d6bc	ret
00c0d6c0	ldr x1,[x19]
00c0d6c4	adrp x0,0x2a1000
00c0d6c8	add x0,x0,#0x418
00c0d6cc	bl 0x00c0de94
