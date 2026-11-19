; FUN_00c135e4 @ 00c135e4
00c135e4	paciasp
00c135e8	stp x29,x30,[sp, #-0x30]!
00c135ec	str x21,[sp, #0x10]
00c135f0	stp x20,x19,[sp, #0x20]
00c135f4	mov x29,sp
00c135f8	ldr x21,[x0, #0x1330]
00c135fc	mov x19,x1
00c13600	ldr x8,[x21, #0x8]
00c13604	sub x9,x8,#0xfc0
00c13608	cmn x9,#0xff1
00c1360c	b.hi 0x00c13630
00c13610	mov x20,x0
00c13614	mov w0,#0x1000
00c13618	bl 0x00c308d0
00c1361c	cbz x0,0x00c13690
00c13620	mov x8,xzr
00c13624	stp x21,xzr,[x0]
00c13628	mov x21,x0
00c1362c	str x0,[x20, #0x1330]
00c13630	add x9,x8,#0x30
00c13634	add x0,x21,x8
00c13638	adrp x8,0xcb1000
00c1363c	add x8,x8,#0x3c0
00c13640	str x9,[x21, #0x8]
00c13644	mov w10,#0x540
00c13648	str x8,[x0, #0x10]!
00c1364c	ldurh w9,[x0, #0x9]
00c13650	mov w8,#0x15
00c13654	mov w11,#0x8
00c13658	strb w8,[x0, #0x8]
00c1365c	adrp x8,0x29f000
00c13660	add x8,x8,#0x18f
00c13664	and w9,w9,#0xf000
00c13668	str x8,[x0, #0x10]
00c1366c	orr w8,w9,w10
00c13670	ldr x9,[x19]
00c13674	sturh w8,[x0, #0x9]
00c13678	stp x11,x9,[x0, #0x18]
00c1367c	ldp x20,x19,[sp, #0x20]
00c13680	ldr x21,[sp, #0x10]
00c13684	ldp x29,x30,[sp], #0x30
00c13688	autiasp
00c1368c	ret
00c13690	bl 0x00c2fff0
