; FUN_0083c5a4 @ 0083c5a4
0083c5a4	sub sp,sp,#0x40
0083c5a8	stp x29,x30,[sp, #0x20]
0083c5ac	stp x20,x19,[sp, #0x30]
0083c5b0	add x29,sp,#0x20
0083c5b4	mrs x19,tpidr_el0
0083c5b8	adrp x9,0x35e000
0083c5bc	add x9,x9,#0x8b0
0083c5c0	ldr x8,[x19, #0x28]
0083c5c4	ldr q0,[x9]
0083c5c8	ldur x9,[x9, #0xe]
0083c5cc	stur x8,[x29, #-0x8]
0083c5d0	adrp x8,0xd1e000
0083c5d4	add x8,x8,#0x208
0083c5d8	str q0,[sp]
0083c5dc	stur x9,[sp, #0xe]
0083c5e0	ldarb w8,[x8]
0083c5e4	tbz w8,#0x0,0x0083c608
0083c5e8	ldr x8,[x19, #0x28]
0083c5ec	ldur x9,[x29, #-0x8]
0083c5f0	cmp x8,x9
0083c5f4	b.ne 0x0083c67c
0083c5f8	ldp x20,x19,[sp, #0x30]
0083c5fc	ldp x29,x30,[sp, #0x20]
0083c600	add sp,sp,#0x40
0083c604	ret
0083c608	adrp x0,0xd1e000
0083c60c	add x0,x0,#0x208
0083c610	bl 0x00c2fe90
0083c614	cbz w0,0x0083c5e8
0083c618	adrp x0,0xd1e000
0083c61c	add x0,x0,#0x1f0
0083c620	mov x1,sp
0083c624	bl 0x0083c80c
0083c628	nop
0083c62c	adr x0,0x83c8c8
0083c630	adrp x1,0xd1e000
0083c634	add x1,x1,#0x1f0
0083c638	adrp x2,0xc48000
0083c63c	add x2,x2,#0x880
0083c640	bl 0x00c2fe70
0083c644	adrp x0,0xd1e000
0083c648	add x0,x0,#0x208
0083c64c	bl 0x00c2fea0
0083c650	b 0x0083c5e8
0083c67c	bl 0x00c2fec0
