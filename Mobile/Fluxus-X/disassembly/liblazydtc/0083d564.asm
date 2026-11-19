; FUN_0083d564 @ 0083d564
0083d564	sub sp,sp,#0x40
0083d568	stp x29,x30,[sp, #0x20]
0083d56c	stp x20,x19,[sp, #0x30]
0083d570	add x29,sp,#0x20
0083d574	mrs x19,tpidr_el0
0083d578	adrp x9,0x35e000
0083d57c	add x9,x9,#0x8dc
0083d580	ldr x8,[x19, #0x28]
0083d584	ldr q0,[x9]
0083d588	ldur x9,[x9, #0xe]
0083d58c	stur x8,[x29, #-0x8]
0083d590	adrp x8,0xd1e000
0083d594	add x8,x8,#0x280
0083d598	str q0,[sp]
0083d59c	stur x9,[sp, #0xe]
0083d5a0	ldarb w8,[x8]
0083d5a4	tbz w8,#0x0,0x0083d5c8
0083d5a8	ldr x8,[x19, #0x28]
0083d5ac	ldur x9,[x29, #-0x8]
0083d5b0	cmp x8,x9
0083d5b4	b.ne 0x0083d63c
0083d5b8	ldp x20,x19,[sp, #0x30]
0083d5bc	ldp x29,x30,[sp, #0x20]
0083d5c0	add sp,sp,#0x40
0083d5c4	ret
0083d5c8	adrp x0,0xd1e000
0083d5cc	add x0,x0,#0x280
0083d5d0	bl 0x00c2fe90
0083d5d4	cbz w0,0x0083d5a8
0083d5d8	adrp x0,0xd1e000
0083d5dc	add x0,x0,#0x268
0083d5e0	mov x1,sp
0083d5e4	bl 0x0083d6a0
0083d5e8	nop
0083d5ec	adr x0,0x83d75c
0083d5f0	adrp x1,0xd1e000
0083d5f4	add x1,x1,#0x268
0083d5f8	adrp x2,0xc48000
0083d5fc	add x2,x2,#0x880
0083d600	bl 0x00c2fe70
0083d604	adrp x0,0xd1e000
0083d608	add x0,x0,#0x280
0083d60c	bl 0x00c2fea0
0083d610	b 0x0083d5a8
0083d63c	bl 0x00c2fec0
