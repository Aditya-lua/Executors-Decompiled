; RAND_status @ 00ac8288
00ac8288	str x19,[sp, #-0x20]!
00ac828c	stp x29,x30,[sp, #0x10]
00ac8290	add x29,sp,#0x10
00ac8294	bl 0x00ac7d50
00ac8298	cbz x0,0x00ac82c0
00ac829c	mov x19,x0
00ac82a0	bl 0x00c3e1c0
00ac82a4	cmp x19,x0
00ac82a8	b.eq 0x00ac82c0
00ac82ac	ldr x0,[x19, #0x28]
00ac82b0	cbz x0,0x00ac82d8
00ac82b4	ldp x29,x30,[sp, #0x10]
00ac82b8	ldr x19,[sp], #0x20
00ac82bc	br x0
00ac82c0	mov x0,xzr
00ac82c4	bl 0x00ac7f78
00ac82c8	cbz x0,0x00ac82d8
00ac82cc	bl 0x00c3d1a0
00ac82d0	cmp w0,#0x1
00ac82d4	cset w0,eq
00ac82d8	ldp x29,x30,[sp, #0x10]
00ac82dc	ldr x19,[sp], #0x20
00ac82e0	ret
