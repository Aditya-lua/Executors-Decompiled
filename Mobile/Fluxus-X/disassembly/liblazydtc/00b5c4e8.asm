; FUN_00b5c4e8 @ 00b5c4e8
00b5c4e8	stp x20,x19,[sp, #-0x20]!
00b5c4ec	stp x29,x30,[sp, #0x10]
00b5c4f0	mov x19,x0
00b5c4f4	ldr x0,[x0, #0x8]
00b5c4f8	adrp x20,0x2ce000
00b5c4fc	add x20,x20,#0x95b
00b5c500	mov w2,#0x186
00b5c504	mov x1,x20
00b5c508	add x29,sp,#0x10
00b5c50c	bl 0x00c32310
00b5c510	ldr x0,[x19, #0x168]
00b5c514	bl 0x00c31f90
00b5c518	ldr x0,[x19, #0x160]
00b5c51c	bl 0x00c35800
00b5c520	ldr x0,[x19, #0x10]
00b5c524	str xzr,[x19, #0x8]
00b5c528	stp xzr,xzr,[x19, #0x160]
00b5c52c	bl 0x00c3a0a0
00b5c530	ldp x29,x30,[sp, #0x10]
00b5c534	mov w2,#0x18d
00b5c538	mov x0,x19
00b5c53c	mov x1,x20
00b5c540	ldp x20,x19,[sp], #0x20
00b5c544	b 0x00c32310
