; FUN_00c1a5c4 @ 00c1a5c4
00c1a5c4	paciasp
00c1a5c8	stp x29,x30,[sp, #-0x40]!
00c1a5cc	str x23,[sp, #0x10]
00c1a5d0	stp x22,x21,[sp, #0x20]
00c1a5d4	stp x20,x19,[sp, #0x30]
00c1a5d8	mov x29,sp
00c1a5dc	ldr x23,[x0, #0x1330]
00c1a5e0	mov x20,x3
00c1a5e4	mov x19,x2
00c1a5e8	mov x21,x1
00c1a5ec	ldr x8,[x23, #0x8]
00c1a5f0	sub x9,x8,#0xfc0
00c1a5f4	cmn x9,#0xff1
00c1a5f8	b.hi 0x00c1a61c
00c1a5fc	mov x22,x0
00c1a600	mov w0,#0x1000
00c1a604	bl 0x00c308d0
00c1a608	cbz x0,0x00c1a680
00c1a60c	mov x8,xzr
00c1a610	stp x23,xzr,[x0]
00c1a614	mov x23,x0
00c1a618	str x0,[x22, #0x1330]
00c1a61c	add x9,x8,#0x30
00c1a620	add x0,x23,x8
00c1a624	adrp x8,0xcb1000
00c1a628	add x8,x8,#0xa90
00c1a62c	str x9,[x23, #0x8]
00c1a630	mov w9,#0x42
00c1a634	str x8,[x0, #0x10]!
00c1a638	ldurh w8,[x0, #0x9]
00c1a63c	ldrh w10,[x20]
00c1a640	strb w9,[x0, #0x8]
00c1a644	mov w9,#0x540
00c1a648	and w8,w8,#0xf000
00c1a64c	ldr q0,[x21]
00c1a650	bfxil w8,w10,#0x0,#0x6
00c1a654	ldr x10,[x19]
00c1a658	str q0,[x0, #0x10]
00c1a65c	orr w8,w8,w9
00c1a660	sturh w8,[x0, #0x9]
00c1a664	str x10,[x0, #0x20]
00c1a668	ldp x20,x19,[sp, #0x30]
00c1a66c	ldr x23,[sp, #0x10]
00c1a670	ldp x22,x21,[sp, #0x20]
00c1a674	ldp x29,x30,[sp], #0x40
00c1a678	autiasp
00c1a67c	ret
00c1a680	bl 0x00c2fff0
