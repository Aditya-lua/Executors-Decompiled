; FUN_00c2c268 @ 00c2c268
00c2c268	paciasp
00c2c26c	sub sp,sp,#0x60
00c2c270	stp x29,x30,[sp, #0x50]
00c2c274	add x29,sp,#0x50
00c2c278	add x1,sp,#0x8
00c2c27c	bl 0x00c2c58c
00c2c280	ldr x8,[sp, #0x18]
00c2c284	cmp w0,#0x0
00c2c288	csel x0,x8,xzr,eq
00c2c28c	ldp x29,x30,[sp, #0x50]
00c2c290	add sp,sp,#0x60
00c2c294	autiasp
00c2c298	ret
