; FUN_0082fdac @ 0082fdac
0082fdac	sub sp,sp,#0x40
0082fdb0	stp x29,x30,[sp, #0x20]
0082fdb4	stp x20,x19,[sp, #0x30]
0082fdb8	add x29,sp,#0x20
0082fdbc	mrs x20,tpidr_el0
0082fdc0	mov w1,#0x1
0082fdc4	mov x19,x0
0082fdc8	ldr x8,[x20, #0x28]
0082fdcc	stur x8,[x29, #-0x8]
0082fdd0	bl 0x008af0d0
0082fdd4	mov x0,x19
0082fdd8	mov w1,#0x2
0082fddc	bl 0x008ab0e0
0082fde0	cbz w0,0x0082fdec
0082fde4	cmp w0,#0x6
0082fde8	b.ne 0x0082fee8
0082fdec	mov x0,x19
0082fdf0	mov w1,#0x2
0082fdf4	bl 0x008aaf04
0082fdf8	mov x0,x19
0082fdfc	mov w1,#0x1
0082fe00	bl 0x008adbdc
0082fe04	cbz w0,0x0082fe38
0082fe08	ldr x8,[x20, #0x28]
0082fe0c	ldur x9,[x29, #-0x8]
0082fe10	cmp x8,x9
0082fe14	b.ne 0x0082ff8c
0082fe18	mov x0,x19
0082fe1c	mov w1,#0x1
0082fe20	bl 0x008aaf04
0082fe24	mov w0,#0x1
0082fe28	ldp x20,x19,[sp, #0x30]
0082fe2c	ldp x29,x30,[sp, #0x20]
0082fe30	add sp,sp,#0x40
0082fe34	ret
0082fe38	adrp x8,0x35e000
0082fe3c	add x8,x8,#0x73c
0082fe40	ldr q0,[x8]
0082fe44	ldr x8,[x8, #0x10]
0082fe48	str q0,[sp]
0082fe4c	str x8,[sp, #0x10]
0082fe50	adrp x8,0xd1d000
0082fe54	add x8,x8,#0x820
0082fe58	ldarb w8,[x8]
0082fe5c	tbz w8,#0x0,0x0082ff18
0082fe60	adrp x8,0xd1d000
0082fe64	ldrb w8,[x8, #0x818]
0082fe68	cmp w8,#0x1
0082fe6c	b.ne 0x0082fea0
0082fe70	adrp x8,0xd1d000
0082fe74	add x8,x8,#0x800
0082fe78	adrp x9,0x29b000
0082fe7c	ldp d1,d2,[x8]
0082fe80	ldr d0,[x9, #0x868]
0082fe84	ldr d3,[x8, #0x10]
0082fe88	strb wzr,[x8, #0x18]
0082fe8c	eor v1.8B,v1.8B,v0.8B
0082fe90	eor v2.8B,v2.8B,v0.8B
0082fe94	eor v0.8B,v3.8B,v0.8B
0082fe98	stp d1,d2,[x8]
0082fe9c	str d0,[x8, #0x10]
0082fea0	mov x0,x19
0082fea4	mov w1,#0x1
0082fea8	bl 0x008aee78
0082feac	adrp x1,0x2b6000
0082feb0	add x1,x1,#0xc62
0082feb4	adrp x2,0xd1d000
0082feb8	add x2,x2,#0x800
0082febc	mov x0,x19
0082fec0	bl 0x008ac684
0082fec4	mov x0,x19
0082fec8	mov w1,#0x2
0082fecc	bl 0x008ae364
0082fed0	ldr x8,[x20, #0x28]
0082fed4	ldur x9,[x29, #-0x8]
0082fed8	cmp x8,x9
0082fedc	b.ne 0x0082ff8c
0082fee0	mov x0,x19
0082fee4	bl 0x008aa5f4
0082fee8	bl 0x008308e4
0082feec	ldr x8,[x20, #0x28]
0082fef0	ldur x9,[x29, #-0x8]
0082fef4	cmp x8,x9
0082fef8	b.ne 0x0082ff8c
0082fefc	adrp x0,0xd1d000
0082ff00	add x0,x0,#0x7e0
0082ff04	bl 0x008309c0
0082ff08	mov x2,x0
0082ff0c	mov x0,x19
0082ff10	mov w1,#0x2
0082ff14	bl 0x008aec14
0082ff18	adrp x0,0xd1d000
0082ff1c	add x0,x0,#0x820
0082ff20	bl 0x00c2fe90
0082ff24	cbz w0,0x0082fe60
0082ff28	adrp x0,0xd1d000
0082ff2c	add x0,x0,#0x800
0082ff30	mov x1,sp
0082ff34	bl 0x00830ae8
0082ff38	nop
0082ff3c	adr x0,0x830bb4
0082ff40	adrp x1,0xd1d000
0082ff44	add x1,x1,#0x800
0082ff48	adrp x2,0xc48000
0082ff4c	add x2,x2,#0x880
0082ff50	bl 0x00c2fe70
0082ff54	adrp x0,0xd1d000
0082ff58	add x0,x0,#0x820
0082ff5c	bl 0x00c2fea0
0082ff60	b 0x0082fe60
0082ff8c	bl 0x00c2fec0
