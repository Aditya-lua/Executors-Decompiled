; FUN_00c2c2f4 @ 00c2c2f4
00c2c2f4	paciasp
00c2c2f8	sub sp,sp,#0x20
00c2c2fc	stp x29,x30,[sp, #0x10]
00c2c300	add x29,sp,#0x10
00c2c304	add x2,sp,#0x8
00c2c308	mov w1,#0xffffffff
00c2c30c	bl 0x00c2c3fc
00c2c310	ldr x0,[sp, #0x8]
00c2c314	ldp x29,x30,[sp, #0x10]
00c2c318	add sp,sp,#0x20
00c2c31c	autiasp
00c2c320	ret
