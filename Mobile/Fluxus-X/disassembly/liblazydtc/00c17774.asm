; FUN_00c17774 @ 00c17774
00c17774	paciasp
00c17778	stp x29,x30,[sp, #-0x40]!
00c1777c	stp x24,x23,[sp, #0x10]
00c17780	stp x22,x21,[sp, #0x20]
00c17784	stp x20,x19,[sp, #0x30]
00c17788	mov x29,sp
00c1778c	ldr x24,[x0, #0x1330]
00c17790	mov x21,x4
00c17794	mov x19,x3
00c17798	mov x20,x2
00c1779c	mov x22,x1
00c177a0	ldr x8,[x24, #0x8]
00c177a4	sub x9,x8,#0xfc0
00c177a8	cmn x9,#0xff1
00c177ac	b.hi 0x00c177d0
00c177b0	mov x23,x0
00c177b4	mov w0,#0x1000
00c177b8	bl 0x00c308d0
00c177bc	cbz x0,0x00c1783c
00c177c0	mov x8,xzr
00c177c4	stp x24,xzr,[x0]
00c177c8	mov x24,x0
00c177cc	str x0,[x23, #0x1330]
00c177d0	add x9,x8,#0x30
00c177d4	add x0,x24,x8
00c177d8	ldr x8,[x22]
00c177dc	str x9,[x24, #0x8]
00c177e0	adrp x9,0xcb1000
00c177e4	add x9,x9,#0xd60
00c177e8	str x9,[x0, #0x10]!
00c177ec	ldurh w9,[x0, #0x9]
00c177f0	ldrh w11,[x21]
00c177f4	mov w10,#0x3f
00c177f8	str x8,[x0, #0x10]
00c177fc	and w8,w9,#0xf000
00c17800	strb w10,[x0, #0x8]
00c17804	mov w9,#0x540
00c17808	bfxil w8,w11,#0x0,#0x6
00c1780c	ldr q0,[x20]
00c17810	ldrb w10,[x19]
00c17814	orr w8,w8,w9
00c17818	stur q0,[x0, #0x18]
00c1781c	sturh w8,[x0, #0x9]
00c17820	strb w10,[x0, #0x28]
00c17824	ldp x20,x19,[sp, #0x30]
00c17828	ldp x22,x21,[sp, #0x20]
00c1782c	ldp x24,x23,[sp, #0x10]
00c17830	ldp x29,x30,[sp], #0x40
00c17834	autiasp
00c17838	ret
00c1783c	bl 0x00c2fff0
