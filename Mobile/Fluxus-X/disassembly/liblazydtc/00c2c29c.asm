; FUN_00c2c29c @ 00c2c29c
00c2c29c	paciasp
00c2c2a0	sub sp,sp,#0x60
00c2c2a4	stp x29,x30,[sp, #0x50]
00c2c2a8	add x29,sp,#0x50
00c2c2ac	add x1,sp,#0x8
00c2c2b0	bl 0x00c2c58c
00c2c2b4	ldr x8,[sp, #0x8]
00c2c2b8	cmp w0,#0x0
00c2c2bc	csel x0,x8,xzr,eq
00c2c2c0	ldp x29,x30,[sp, #0x50]
00c2c2c4	add sp,sp,#0x60
00c2c2c8	autiasp
00c2c2cc	ret
