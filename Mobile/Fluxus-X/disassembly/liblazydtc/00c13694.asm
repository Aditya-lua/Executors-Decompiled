; FUN_00c13694 @ 00c13694
00c13694	paciasp
00c13698	stp x29,x30,[sp, #-0x30]!
00c1369c	str x21,[sp, #0x10]
00c136a0	stp x20,x19,[sp, #0x20]
00c136a4	mov x29,sp
00c136a8	ldr x21,[x0, #0x1330]
00c136ac	mov x19,x1
00c136b0	ldr x8,[x21, #0x8]
00c136b4	sub x9,x8,#0xfc0
00c136b8	cmn x9,#0xff1
00c136bc	b.hi 0x00c136e0
00c136c0	mov x20,x0
00c136c4	mov w0,#0x1000
00c136c8	bl 0x00c308d0
00c136cc	cbz x0,0x00c13740
00c136d0	mov x8,xzr
00c136d4	stp x21,xzr,[x0]
00c136d8	mov x21,x0
00c136dc	str x0,[x20, #0x1330]
00c136e0	add x9,x8,#0x30
00c136e4	add x0,x21,x8
00c136e8	adrp x8,0xcb1000
00c136ec	add x8,x8,#0x3c0
00c136f0	str x9,[x21, #0x8]
00c136f4	mov w10,#0x540
00c136f8	str x8,[x0, #0x10]!
00c136fc	ldurh w9,[x0, #0x9]
00c13700	mov w8,#0x15
00c13704	mov w11,#0xd
00c13708	strb w8,[x0, #0x8]
00c1370c	adrp x8,0x2c0000
00c13710	add x8,x8,#0xce9
00c13714	and w9,w9,#0xf000
00c13718	str x8,[x0, #0x10]
00c1371c	orr w8,w9,w10
00c13720	ldr x9,[x19]
00c13724	sturh w8,[x0, #0x9]
00c13728	stp x11,x9,[x0, #0x18]
00c1372c	ldp x20,x19,[sp, #0x20]
00c13730	ldr x21,[sp, #0x10]
00c13734	ldp x29,x30,[sp], #0x30
00c13738	autiasp
00c1373c	ret
00c13740	bl 0x00c2fff0
