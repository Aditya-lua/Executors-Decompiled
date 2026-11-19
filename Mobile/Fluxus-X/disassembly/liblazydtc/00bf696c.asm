; FUN_00bf696c @ 00bf696c
00bf696c	paciasp
00bf6970	stp x29,x30,[sp, #-0x30]!
00bf6974	str x21,[sp, #0x10]
00bf6978	stp x20,x19,[sp, #0x20]
00bf697c	mov x29,sp
00bf6980	adrp x8,0xcb5000
00bf6984	movi v0.2D,#0x0
00bf6988	sub x9,x2,#0x1
00bf698c	ldr x8,[x8, #0xde8]
00bf6990	mov x21,x0
00bf6994	mov x19,x0
00bf6998	add x8,x8,#0x10
00bf699c	stp x8,x9,[x0]
00bf69a0	str q0,[x21, #0x18]!
00bf69a4	stur q0,[x0, #0x28]
00bf69a8	stur q0,[x0, #0x38]
00bf69ac	stur q0,[x0, #0x48]
00bf69b0	stur q0,[x0, #0x58]
00bf69b4	stur q0,[x0, #0x68]
00bf69b8	ldrb w8,[x1]
00bf69bc	ldr x9,[x1, #0x10]
00bf69c0	tst w8,#0x1
00bf69c4	csinc x1,x9,x1,ne
00bf69c8	bl 0x00c44430
00bf69cc	ldp x20,x19,[sp, #0x20]
00bf69d0	ldr x21,[sp, #0x10]
00bf69d4	ldp x29,x30,[sp], #0x30
00bf69d8	autiasp
00bf69dc	ret
