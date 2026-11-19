; FUN_00c19918 @ 00c19918
00c19918	paciasp
00c1991c	stp x29,x30,[sp, #-0x30]!
00c19920	str x21,[sp, #0x10]
00c19924	stp x20,x19,[sp, #0x20]
00c19928	mov x29,sp
00c1992c	ldr x21,[x0, #0x1330]
00c19930	mov x19,x1
00c19934	ldr x8,[x21, #0x8]
00c19938	sub x9,x8,#0xfd0
00c1993c	cmn x9,#0xff1
00c19940	b.hi 0x00c19964
00c19944	mov x20,x0
00c19948	mov w0,#0x1000
00c1994c	bl 0x00c308d0
00c19950	cbz x0,0x00c199b4
00c19954	mov x8,xzr
00c19958	stp x21,xzr,[x0]
00c1995c	mov x21,x0
00c19960	str x0,[x20, #0x1330]
00c19964	add x9,x8,#0x20
00c19968	add x0,x21,x8
00c1996c	adrp x8,0xcb2000
00c19970	add x8,x8,#0xdc8
00c19974	str x9,[x21, #0x8]
00c19978	mov w9,#0x48
00c1997c	str x8,[x0, #0x10]!
00c19980	ldurh w8,[x0, #0x9]
00c19984	mov w10,#0x540
00c19988	strb w9,[x0, #0x8]
00c1998c	ldr x9,[x19]
00c19990	and w8,w8,#0xf000
00c19994	orr w8,w8,w10
00c19998	sturh w8,[x0, #0x9]
00c1999c	str x9,[x0, #0x10]
00c199a0	ldp x20,x19,[sp, #0x20]
00c199a4	ldr x21,[sp, #0x10]
00c199a8	ldp x29,x30,[sp], #0x30
00c199ac	autiasp
00c199b0	ret
00c199b4	bl 0x00c2fff0
