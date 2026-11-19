; FUN_00c238e8 @ 00c238e8
00c238e8	paciasp
00c238ec	stp x29,x30,[sp, #-0x30]!
00c238f0	stp x22,x21,[sp, #0x10]
00c238f4	stp x20,x19,[sp, #0x20]
00c238f8	mov x29,sp
00c238fc	ldr x22,[x0, #0x1330]
00c23900	mov x19,x2
00c23904	mov x20,x1
00c23908	ldr x8,[x22, #0x8]
00c2390c	sub x9,x8,#0xfd0
00c23910	cmn x9,#0xff1
00c23914	b.hi 0x00c23938
00c23918	mov x21,x0
00c2391c	mov w0,#0x1000
00c23920	bl 0x00c308d0
00c23924	cbz x0,0x00c2398c
00c23928	mov x8,xzr
00c2392c	stp x22,xzr,[x0]
00c23930	mov x22,x0
00c23934	str x0,[x21, #0x1330]
00c23938	add x9,x8,#0x20
00c2393c	add x0,x22,x8
00c23940	adrp x8,0xcb3000
00c23944	add x8,x8,#0x458
00c23948	str x9,[x22, #0x8]
00c2394c	mov w9,#0x1a
00c23950	str x8,[x0, #0x10]!
00c23954	ldurh w8,[x0, #0x9]
00c23958	mov w10,#0x540
00c2395c	strb w9,[x0, #0x8]
00c23960	ldr x9,[x20]
00c23964	and w8,w8,#0xf000
00c23968	orr w8,w8,w10
00c2396c	ldr x10,[x19]
00c23970	sturh w8,[x0, #0x9]
00c23974	stp x9,x10,[x0, #0x10]
00c23978	ldp x20,x19,[sp, #0x20]
00c2397c	ldp x22,x21,[sp, #0x10]
00c23980	ldp x29,x30,[sp], #0x30
00c23984	autiasp
00c23988	ret
00c2398c	bl 0x00c2fff0
