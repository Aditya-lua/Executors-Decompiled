; FUN_00c29b0c @ 00c29b0c
00c29b0c	paciasp
00c29b10	stp x29,x30,[sp, #-0x20]!
00c29b14	str x19,[sp, #0x10]
00c29b18	mov x29,sp
00c29b1c	cmp x0,#0x1
00c29b20	mov w1,#0x10
00c29b24	str xzr,[x29, #0x18]
00c29b28	csinc x19,x0,xzr,hi
00c29b2c	add x0,x29,#0x18
00c29b30	mov x2,x19
00c29b34	bl 0x00c437f0
00c29b38	ldr x0,[x29, #0x18]
00c29b3c	cbnz x0,0x00c29b48
00c29b40	mov x0,x19
00c29b44	bl 0x00c29b58
00c29b48	ldr x19,[sp, #0x10]
00c29b4c	ldp x29,x30,[sp], #0x20
00c29b50	autiasp
00c29b54	ret
