; FUN_00c19530 @ 00c19530
00c19530	paciasp
00c19534	stp x29,x30,[sp, #-0x30]!
00c19538	str x21,[sp, #0x10]
00c1953c	stp x20,x19,[sp, #0x20]
00c19540	mov x29,sp
00c19544	ldr x21,[x0, #0x1330]
00c19548	mov x19,x1
00c1954c	ldr x8,[x21, #0x8]
00c19550	sub x9,x8,#0xfd0
00c19554	cmn x9,#0xff1
00c19558	b.hi 0x00c1957c
00c1955c	mov x20,x0
00c19560	mov w0,#0x1000
00c19564	bl 0x00c308d0
00c19568	cbz x0,0x00c195cc
00c1956c	mov x8,xzr
00c19570	stp x21,xzr,[x0]
00c19574	mov x21,x0
00c19578	str x0,[x20, #0x1330]
00c1957c	add x9,x8,#0x20
00c19580	add x0,x21,x8
00c19584	adrp x8,0xcb2000
00c19588	add x8,x8,#0x828
00c1958c	str x9,[x21, #0x8]
00c19590	mov w9,#0x2a
00c19594	str x8,[x0, #0x10]!
00c19598	ldurh w8,[x0, #0x9]
00c1959c	mov w10,#0x540
00c195a0	strb w9,[x0, #0x8]
00c195a4	ldr x9,[x19]
00c195a8	and w8,w8,#0xf000
00c195ac	orr w8,w8,w10
00c195b0	sturh w8,[x0, #0x9]
00c195b4	str x9,[x0, #0x10]
00c195b8	ldp x20,x19,[sp, #0x20]
00c195bc	ldr x21,[sp, #0x10]
00c195c0	ldp x29,x30,[sp], #0x30
00c195c4	autiasp
00c195c8	ret
00c195cc	bl 0x00c2fff0
