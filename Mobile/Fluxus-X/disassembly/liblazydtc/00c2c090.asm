; FUN_00c2c090 @ 00c2c090
00c2c090	paciasp
00c2c094	stp x29,x30,[sp, #-0x20]!
00c2c098	stp x28,x19,[sp, #0x10]
00c2c09c	mov x29,sp
00c2c0a0	sub sp,sp,#0x480
00c2c0a4	mov x19,x0
00c2c0a8	add x0,sp,#0x270
00c2c0ac	bl 0x00c2fc80
00c2c0b0	ldr x3,[x19, #0x10]
00c2c0b4	cbnz x3,0x00c2c0cc
00c2c0b8	add x0,sp,#0x270
00c2c0bc	mov x1,sp
00c2c0c0	mov x2,x19
00c2c0c4	bl 0x00c2be38
00c2c0c8	b 0x00c2c0e0
00c2c0cc	ldr x4,[x19, #0x18]
00c2c0d0	add x0,sp,#0x270
00c2c0d4	mov x1,sp
00c2c0d8	mov x2,x19
00c2c0dc	bl 0x00c2c114
00c2c0e0	adrp x19,0xcb4000
00c2c0e4	adrp x1,0x2a1000
00c2c0e8	add x1,x1,#0x45d
00c2c0ec	ldr x19,[x19, #0xba0]
00c2c0f0	adrp x2,0x2d4000
00c2c0f4	add x2,x2,#0xc96
00c2c0f8	adrp x3,0x2a9000
00c2c0fc	add x3,x3,#0x141
00c2c100	add x0,x19,#0x130
00c2c104	bl 0x00c30940
00c2c108	add x0,x19,#0x130
00c2c10c	bl 0x00c30c50
00c2c110	bl 0x00c30b40
