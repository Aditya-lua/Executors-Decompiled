; FUN_00bf6fa4 @ 00bf6fa4
00bf6fa4	paciasp
00bf6fa8	stp x29,x30,[sp, #-0x20]!
00bf6fac	stp x20,x19,[sp, #0x10]
00bf6fb0	mov x29,sp
00bf6fb4	adrp x8,0xcb5000
00bf6fb8	movi v0.2D,#0x0
00bf6fbc	sub x9,x2,#0x1
00bf6fc0	ldr x8,[x8, #0xe00]
00bf6fc4	mov x19,x0
00bf6fc8	add x8,x8,#0x10
00bf6fcc	stp x8,x9,[x0]
00bf6fd0	stur q0,[x0, #0x18]
00bf6fd4	stur q0,[x0, #0x28]
00bf6fd8	stur q0,[x0, #0x38]
00bf6fdc	stur q0,[x0, #0x48]
00bf6fe0	stur q0,[x0, #0x58]
00bf6fe4	stur q0,[x0, #0x68]
00bf6fe8	ldrb w8,[x1]
00bf6fec	ldr x9,[x1, #0x10]
00bf6ff0	tst w8,#0x1
00bf6ff4	csinc x1,x9,x1,ne
00bf6ff8	bl 0x00c44460
00bf6ffc	ldp x20,x19,[sp, #0x10]
00bf7000	ldp x29,x30,[sp], #0x20
00bf7004	autiasp
00bf7008	ret
