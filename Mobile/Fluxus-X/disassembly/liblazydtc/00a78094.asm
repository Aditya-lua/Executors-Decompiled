; FUN_00a78094 @ 00a78094
00a78094	stp x20,x19,[sp, #-0x20]!
00a78098	stp x29,x30,[sp, #0x10]
00a7809c	ldr x19,[x0, #0x98]
00a780a0	add x29,sp,#0x10
00a780a4	cbz x19,0x00a780e0
00a780a8	ldr x0,[x19, #0x40]
00a780ac	adrp x20,0x2cd000
00a780b0	add x20,x20,#0xb91
00a780b4	mov w2,#0x4f
00a780b8	mov x1,x20
00a780bc	bl 0x00c32310
00a780c0	ldr x0,[x19, #0x30]
00a780c4	bl 0x00c37660
00a780c8	ldp x29,x30,[sp, #0x10]
00a780cc	mov w2,#0x51
00a780d0	mov x0,x19
00a780d4	mov x1,x20
00a780d8	ldp x20,x19,[sp], #0x20
00a780dc	b 0x00c32310
00a780e0	ldp x29,x30,[sp, #0x10]
00a780e4	ldp x20,x19,[sp], #0x20
00a780e8	ret
