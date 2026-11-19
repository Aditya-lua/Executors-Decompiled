; FUN_00bf6dcc @ 00bf6dcc
00bf6dcc	paciasp
00bf6dd0	stp x29,x30,[sp, #-0x20]!
00bf6dd4	stp x20,x19,[sp, #0x10]
00bf6dd8	mov x29,sp
00bf6ddc	adrp x8,0xcb5000
00bf6de0	movi v0.2D,#0x0
00bf6de4	sub x9,x2,#0x1
00bf6de8	ldr x8,[x8, #0xdf8]
00bf6dec	mov x19,x0
00bf6df0	add x8,x8,#0x10
00bf6df4	stp x8,x9,[x0]
00bf6df8	stur q0,[x0, #0x18]
00bf6dfc	stur q0,[x0, #0x28]
00bf6e00	stur q0,[x0, #0x38]
00bf6e04	stur q0,[x0, #0x48]
00bf6e08	stur q0,[x0, #0x58]
00bf6e0c	stur q0,[x0, #0x68]
00bf6e10	ldrb w8,[x1]
00bf6e14	ldr x9,[x1, #0x10]
00bf6e18	tst w8,#0x1
00bf6e1c	csinc x1,x9,x1,ne
00bf6e20	bl 0x00c44450
00bf6e24	ldp x20,x19,[sp, #0x10]
00bf6e28	ldp x29,x30,[sp], #0x20
00bf6e2c	autiasp
00bf6e30	ret
