; FUN_00c275bc @ 00c275bc
00c275bc	paciasp
00c275c0	stp x29,x30,[sp, #-0x30]!
00c275c4	stp x22,x21,[sp, #0x10]
00c275c8	stp x20,x19,[sp, #0x20]
00c275cc	mov x29,sp
00c275d0	ldr x22,[x0, #0x1330]
00c275d4	mov x19,x2
00c275d8	mov x20,x1
00c275dc	ldr x8,[x22, #0x8]
00c275e0	sub x9,x8,#0xfd0
00c275e4	cmn x9,#0xff1
00c275e8	b.hi 0x00c2760c
00c275ec	mov x21,x0
00c275f0	mov w0,#0x1000
00c275f4	bl 0x00c308d0
00c275f8	cbz x0,0x00c27660
00c275fc	mov x8,xzr
00c27600	stp x22,xzr,[x0]
00c27604	mov x22,x0
00c27608	str x0,[x21, #0x1330]
00c2760c	add x9,x8,#0x20
00c27610	add x0,x22,x8
00c27614	adrp x8,0xcb3000
00c27618	add x8,x8,#0xe30
00c2761c	str x9,[x22, #0x8]
00c27620	mov w9,#0x1d
00c27624	str x8,[x0, #0x10]!
00c27628	ldurh w8,[x0, #0x9]
00c2762c	mov w10,#0x540
00c27630	strb w9,[x0, #0x8]
00c27634	ldr x9,[x20]
00c27638	and w8,w8,#0xf000
00c2763c	orr w8,w8,w10
00c27640	ldr x10,[x19]
00c27644	sturh w8,[x0, #0x9]
00c27648	stp x9,x10,[x0, #0x10]
00c2764c	ldp x20,x19,[sp, #0x20]
00c27650	ldp x22,x21,[sp, #0x10]
00c27654	ldp x29,x30,[sp], #0x30
00c27658	autiasp
00c2765c	ret
00c27660	bl 0x00c2fff0
