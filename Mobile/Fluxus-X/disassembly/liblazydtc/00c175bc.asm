; FUN_00c175bc @ 00c175bc
00c175bc	paciasp
00c175c0	stp x29,x30,[sp, #-0x40]!
00c175c4	stp x24,x23,[sp, #0x10]
00c175c8	stp x22,x21,[sp, #0x20]
00c175cc	stp x20,x19,[sp, #0x30]
00c175d0	mov x29,sp
00c175d4	ldr x24,[x0, #0x1330]
00c175d8	mov x21,x4
00c175dc	mov x20,x3
00c175e0	mov x19,x2
00c175e4	mov x22,x1
00c175e8	ldr x8,[x24, #0x8]
00c175ec	sub x9,x8,#0xfc0
00c175f0	cmn x9,#0xff1
00c175f4	b.hi 0x00c17618
00c175f8	mov x23,x0
00c175fc	mov w0,#0x1000
00c17600	bl 0x00c308d0
00c17604	cbz x0,0x00c17684
00c17608	mov x8,xzr
00c1760c	stp x24,xzr,[x0]
00c17610	mov x24,x0
00c17614	str x0,[x23, #0x1330]
00c17618	add x9,x8,#0x30
00c1761c	add x0,x24,x8
00c17620	ldr x8,[x22]
00c17624	str x9,[x24, #0x8]
00c17628	adrp x9,0xcb1000
00c1762c	add x9,x9,#0xbf8
00c17630	str x9,[x0, #0x10]!
00c17634	ldurh w9,[x0, #0x9]
00c17638	mov w10,#0x3a
00c1763c	ldrh w11,[x21]
00c17640	strb w10,[x0, #0x8]
00c17644	ldr x10,[x20]
00c17648	str x8,[x0, #0x10]
00c1764c	and w8,w9,#0xf000
00c17650	mov w9,#0x540
00c17654	bfxil w8,w11,#0x0,#0x6
00c17658	ldr q0,[x19]
00c1765c	orr w8,w8,w9
00c17660	stur q0,[x0, #0x18]
00c17664	sturh w8,[x0, #0x9]
00c17668	str x10,[x0, #0x28]
00c1766c	ldp x20,x19,[sp, #0x30]
00c17670	ldp x22,x21,[sp, #0x20]
00c17674	ldp x24,x23,[sp, #0x10]
00c17678	ldp x29,x30,[sp], #0x40
00c1767c	autiasp
00c17680	ret
00c17684	bl 0x00c2fff0
