; FUN_00872dd0 @ 00872dd0
00872dd0	stp x29,x30,[sp, #-0x20]!
00872dd4	str x19,[sp, #0x10]
00872dd8	mov x29,sp
00872ddc	mov x19,x0
00872de0	ldr x0,[x0]
00872de4	cbz x0,0x00872e14
00872de8	bl 0x00c301d0
00872dec	ldr x0,[x19, #0x18]
00872df0	str xzr,[x19]
00872df4	bl 0x00c301d0
00872df8	mov x0,xzr
00872dfc	stp xzr,xzr,[x19, #0x8]
00872e00	str xzr,[x19, #0x18]
00872e04	bl 0x00c301d0
00872e08	mov w8,#0x40
00872e0c	str xzr,[x19, #0x20]
00872e10	strb w8,[x19, #0x30]
00872e14	ldr x0,[x19, #0x18]
00872e18	ldr x19,[sp, #0x10]
00872e1c	ldp x29,x30,[sp], #0x20
00872e20	b 0x00c301d0
