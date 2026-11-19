; FUN_00c253e0 @ 00c253e0
00c253e0	paciasp
00c253e4	stp x29,x30,[sp, #-0x30]!
00c253e8	str x21,[sp, #0x10]
00c253ec	stp x20,x19,[sp, #0x20]
00c253f0	mov x29,sp
00c253f4	ldr x21,[x0, #0x1330]
00c253f8	mov x19,x1
00c253fc	ldr x8,[x21, #0x8]
00c25400	sub x9,x8,#0xfd0
00c25404	cmn x9,#0xff1
00c25408	b.hi 0x00c2542c
00c2540c	mov x20,x0
00c25410	mov w0,#0x1000
00c25414	bl 0x00c308d0
00c25418	cbz x0,0x00c25488
00c2541c	mov x8,xzr
00c25420	stp x21,xzr,[x0]
00c25424	mov x21,x0
00c25428	str x0,[x20, #0x1330]
00c2542c	add x9,x8,#0x20
00c25430	mov x0,x19
00c25434	add x20,x21,x8
00c25438	str x9,[x21, #0x8]
00c2543c	bl 0x00c2ff50
00c25440	adrp x9,0xcb1000
00c25444	add x9,x9,#0x4c0
00c25448	mov w11,#0x540
00c2544c	str x9,[x20, #0x10]!
00c25450	ldurh w9,[x20, #0x9]
00c25454	mov x8,x0
00c25458	mov w10,#0x8
00c2545c	and w9,w9,#0xf000
00c25460	strb w10,[x20, #0x8]
00c25464	orr w9,w9,w11
00c25468	stp x19,x8,[x20, #0x10]
00c2546c	sturh w9,[x20, #0x9]
00c25470	mov x0,x20
00c25474	ldp x20,x19,[sp, #0x20]
00c25478	ldr x21,[sp, #0x10]
00c2547c	ldp x29,x30,[sp], #0x30
00c25480	autiasp
00c25484	ret
00c25488	bl 0x00c2fff0
