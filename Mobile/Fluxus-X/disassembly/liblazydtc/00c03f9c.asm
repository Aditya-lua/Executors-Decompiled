; FUN_00c03f9c @ 00c03f9c
00c03f9c	paciasp
00c03fa0	stp x29,x30,[sp, #-0x10]!
00c03fa4	mov x29,sp
00c03fa8	adrp x8,0xd27000
00c03fac	add x8,x8,#0xba8
00c03fb0	ldarb w8,[x8]
00c03fb4	tbz w8,#0x0,0x00c04048
00c03fb8	adrp x8,0xd27000
00c03fbc	ldrb w8,[x8, #0xb78]
00c03fc0	tbnz w8,#0x0,0x00c03fd8
00c03fc4	adrp x9,0xd27000
00c03fc8	add x9,x9,#0xb78
00c03fcc	mov w8,#0x4
00c03fd0	strb w8,[x9], #0x4
00c03fd4	b 0x00c03fec
00c03fd8	adrp x8,0xd27000
00c03fdc	add x8,x8,#0xb80
00c03fe0	mov w10,#0x2
00c03fe4	ldr x9,[x8, #0x8]
00c03fe8	str x10,[x8]
00c03fec	mov x8,#0x41
00c03ff0	str wzr,[x9, #0x8]
00c03ff4	movk x8,#0x4d, LSL #32
00c03ff8	str x8,[x9]
00c03ffc	adrp x9,0xd27000
00c04000	ldrb w9,[x9, #0xb90]
00c04004	tbnz w9,#0x0,0x00c0401c
00c04008	adrp x9,0xd27000
00c0400c	add x9,x9,#0xb90
00c04010	mov w10,#0x4
00c04014	strb w10,[x9], #0x4
00c04018	b 0x00c04030
00c0401c	adrp x10,0xd27000
00c04020	add x10,x10,#0xb98
00c04024	mov w11,#0x2
00c04028	ldr x9,[x10, #0x8]
00c0402c	str x11,[x10]
00c04030	add x8,x8,#0xf
00c04034	str x8,[x9]
00c04038	str wzr,[x9, #0x8]
00c0403c	ldp x29,x30,[sp], #0x10
00c04040	autiasp
00c04044	ret
00c04048	adrp x0,0xd27000
00c0404c	add x0,x0,#0xba8
00c04050	bl 0x00c2fe90
00c04054	cbz w0,0x00c03fb8
00c04058	adrp x0,0xc0b000
00c0405c	add x0,x0,#0xa44
00c04060	nop
00c04064	adr x2,0xc48880
00c04068	mov x1,xzr
00c0406c	bl 0x00c2fe70
00c04070	adrp x0,0xd27000
00c04074	add x0,x0,#0xba8
00c04078	bl 0x00c2fea0
00c0407c	b 0x00c03fb8
