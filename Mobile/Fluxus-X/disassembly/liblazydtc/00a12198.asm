; CTLOG_free @ 00a12198
00a12198	cbz x0,0x00a121f4
00a1219c	stp x20,x19,[sp, #-0x20]!
00a121a0	stp x29,x30,[sp, #0x10]
00a121a4	mov x19,x0
00a121a8	ldr x0,[x0, #0x10]
00a121ac	adrp x20,0x2b2000
00a121b0	add x20,x20,#0xaa
00a121b4	mov w2,#0x137
00a121b8	mov x1,x20
00a121bc	add x29,sp,#0x10
00a121c0	bl 0x00c32310
00a121c4	ldr x0,[x19, #0x38]
00a121c8	bl 0x00c32450
00a121cc	ldr x0,[x19, #0x8]
00a121d0	mov w2,#0x139
00a121d4	mov x1,x20
00a121d8	bl 0x00c32310
00a121dc	ldp x29,x30,[sp, #0x10]
00a121e0	mov w2,#0x13a
00a121e4	mov x0,x19
00a121e8	mov x1,x20
00a121ec	ldp x20,x19,[sp], #0x20
00a121f0	b 0x00c32310
00a121f4	ret
