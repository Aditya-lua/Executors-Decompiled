; FUN_00c195d0 @ 00c195d0
00c195d0	paciasp
00c195d4	stp x29,x30,[sp, #-0x30]!
00c195d8	str x21,[sp, #0x10]
00c195dc	stp x20,x19,[sp, #0x20]
00c195e0	mov x29,sp
00c195e4	ldr x21,[x0, #0x1330]
00c195e8	mov x19,x1
00c195ec	ldr x8,[x21, #0x8]
00c195f0	sub x9,x8,#0xfd0
00c195f4	cmn x9,#0xff1
00c195f8	b.hi 0x00c1961c
00c195fc	mov x20,x0
00c19600	mov w0,#0x1000
00c19604	bl 0x00c308d0
00c19608	cbz x0,0x00c1966c
00c1960c	mov x8,xzr
00c19610	stp x21,xzr,[x0]
00c19614	mov x21,x0
00c19618	str x0,[x20, #0x1330]
00c1961c	add x9,x8,#0x20
00c19620	add x0,x21,x8
00c19624	adrp x8,0xcb2000
00c19628	add x8,x8,#0xcd8
00c1962c	str x9,[x21, #0x8]
00c19630	mov w9,#0x3e
00c19634	str x8,[x0, #0x10]!
00c19638	ldurh w8,[x0, #0x9]
00c1963c	mov w10,#0x540
00c19640	strb w9,[x0, #0x8]
00c19644	ldr x9,[x19]
00c19648	and w8,w8,#0xf000
00c1964c	orr w8,w8,w10
00c19650	sturh w8,[x0, #0x9]
00c19654	str x9,[x0, #0x10]
00c19658	ldp x20,x19,[sp, #0x20]
00c1965c	ldr x21,[sp, #0x10]
00c19660	ldp x29,x30,[sp], #0x30
00c19664	autiasp
00c19668	ret
00c1966c	bl 0x00c2fff0
