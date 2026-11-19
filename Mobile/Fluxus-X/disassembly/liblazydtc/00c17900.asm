; FUN_00c17900 @ 00c17900
00c17900	paciasp
00c17904	stp x29,x30,[sp, #-0x40]!
00c17908	stp x24,x23,[sp, #0x10]
00c1790c	stp x22,x21,[sp, #0x20]
00c17910	stp x20,x19,[sp, #0x30]
00c17914	mov x29,sp
00c17918	ldr x24,[x0, #0x1330]
00c1791c	mov x21,x4
00c17920	mov x19,x3
00c17924	mov x20,x2
00c17928	mov x22,x1
00c1792c	ldr x8,[x24, #0x8]
00c17930	sub x9,x8,#0xfc0
00c17934	cmn x9,#0xff1
00c17938	b.hi 0x00c1795c
00c1793c	mov x23,x0
00c17940	mov w0,#0x1000
00c17944	bl 0x00c308d0
00c17948	cbz x0,0x00c179c4
00c1794c	mov x8,xzr
00c17950	stp x24,xzr,[x0]
00c17954	mov x24,x0
00c17958	str x0,[x23, #0x1330]
00c1795c	add x9,x8,#0x30
00c17960	add x0,x24,x8
00c17964	adrp x8,0xcb1000
00c17968	add x8,x8,#0xe50
00c1796c	str x9,[x24, #0x8]
00c17970	mov w11,#0x39
00c17974	str x8,[x0, #0x10]!
00c17978	ldurh w8,[x0, #0x9]
00c1797c	ldrh w9,[x21]
00c17980	ldr x10,[x22]
00c17984	ldr x12,[x20]
00c17988	and w8,w8,#0xf000
00c1798c	strb w11,[x0, #0x8]
00c17990	mov w11,#0x540
00c17994	bfxil w8,w9,#0x0,#0x6
00c17998	ldr x9,[x19]
00c1799c	stp x10,x12,[x0, #0x10]
00c179a0	orr w8,w8,w11
00c179a4	sturh w8,[x0, #0x9]
00c179a8	str x9,[x0, #0x20]
00c179ac	ldp x20,x19,[sp, #0x30]
00c179b0	ldp x22,x21,[sp, #0x20]
00c179b4	ldp x24,x23,[sp, #0x10]
00c179b8	ldp x29,x30,[sp], #0x40
00c179bc	autiasp
00c179c0	ret
00c179c4	bl 0x00c2fff0
