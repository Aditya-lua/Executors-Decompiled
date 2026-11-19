; FUN_00ac7784 @ 00ac7784
00ac7784	cbz x0,0x00ac7808
00ac7788	stp x20,x19,[sp, #-0x20]!
00ac778c	stp x29,x30,[sp, #0x10]
00ac7790	mov x19,x0
00ac7794	ldr x0,[x0]
00ac7798	add x29,sp,#0x10
00ac779c	bl 0x00c34d40
00ac77a0	ldr x20,[x19, #0x8]
00ac77a4	cbz x20,0x00ac77c4
00ac77a8	adrp x1,0xac7000
00ac77ac	add x1,x1,#0x820
00ac77b0	mov x0,x20
00ac77b4	bl 0x00c395e0
00ac77b8	mov x0,x20
00ac77bc	bl 0x00c34db0
00ac77c0	str xzr,[x19, #0x8]
00ac77c4	ldr x20,[x19, #0x10]
00ac77c8	cbz x20,0x00ac77e8
00ac77cc	adrp x1,0xac7000
00ac77d0	add x1,x1,#0x820
00ac77d4	mov x0,x20
00ac77d8	bl 0x00c395e0
00ac77dc	mov x0,x20
00ac77e0	bl 0x00c34db0
00ac77e4	str xzr,[x19, #0x10]
00ac77e8	str xzr,[x19, #0x18]
00ac77ec	ldp x29,x30,[sp, #0x10]
00ac77f0	adrp x1,0x2b2000
00ac77f4	add x1,x1,#0xa21
00ac77f8	mov w2,#0x53
00ac77fc	mov x0,x19
00ac7800	ldp x20,x19,[sp], #0x20
00ac7804	b 0x00c32310
00ac7808	ret
