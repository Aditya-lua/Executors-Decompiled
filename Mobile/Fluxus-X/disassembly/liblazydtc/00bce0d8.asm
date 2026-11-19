; std::__ndk1::ios_base::init @ 00bce0d8
00bce0d8	bti c
00bce0dc	adrp x9,0x29c000
00bce0e0	cmp x1,#0x0
00bce0e4	mov x8,x0
00bce0e8	ldr q0,[x9, #0xf60]
00bce0ec	cset w9,eq
00bce0f0	str x1,[x0, #0x28]
00bce0f4	stp w9,wzr,[x0, #0x20]
00bce0f8	mov w9,#0x1002
00bce0fc	str q0,[x0, #0x10]
00bce100	movi v0.2D,#0x0
00bce104	str w9,[x0, #0x8]
00bce108	stur q0,[x0, #0x38]
00bce10c	stur q0,[x0, #0x48]
00bce110	stur q0,[x0, #0x58]
00bce114	stur q0,[x0, #0x68]
00bce118	add x0,x0,#0x30
00bce11c	stur q0,[x8, #0x78]
00bce120	b 0x00c30480
