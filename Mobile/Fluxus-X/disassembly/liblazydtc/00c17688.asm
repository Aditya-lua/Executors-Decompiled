; FUN_00c17688 @ 00c17688
00c17688	paciasp
00c1768c	stp x29,x30,[sp, #-0x50]!
00c17690	stp x26,x25,[sp, #0x10]
00c17694	stp x24,x23,[sp, #0x20]
00c17698	stp x22,x21,[sp, #0x30]
00c1769c	stp x20,x19,[sp, #0x40]
00c176a0	mov x29,sp
00c176a4	ldr x26,[x0, #0x1330]
00c176a8	mov x22,x6
00c176ac	mov x20,x5
00c176b0	mov x21,x4
00c176b4	mov x19,x3
00c176b8	mov x24,x2
00c176bc	ldr x8,[x26, #0x8]
00c176c0	mov x23,x1
00c176c4	sub x9,x8,#0xfb0
00c176c8	cmn x9,#0xff1
00c176cc	b.hi 0x00c176f0
00c176d0	mov x25,x0
00c176d4	mov w0,#0x1000
00c176d8	bl 0x00c308d0
00c176dc	cbz x0,0x00c17770
00c176e0	mov x8,xzr
00c176e4	stp x26,xzr,[x0]
00c176e8	mov x26,x0
00c176ec	str x0,[x25, #0x1330]
00c176f0	add x9,x8,#0x40
00c176f4	add x0,x26,x8
00c176f8	ldr x8,[x24]
00c176fc	str x9,[x26, #0x8]
00c17700	adrp x9,0xcb1000
00c17704	add x9,x9,#0xc70
00c17708	str x9,[x0, #0x10]!
00c1770c	mov w9,#0x40
00c17710	ldrh w10,[x22]
00c17714	strb w9,[x0, #0x8]
00c17718	ldurh w9,[x0, #0x9]
00c1771c	ldr q0,[x23]
00c17720	str x8,[x0, #0x20]
00c17724	ldrb w11,[x21]
00c17728	and w9,w9,#0xf000
00c1772c	ldrb w12,[x20]
00c17730	ldr q1,[x19]
00c17734	bfxil w9,w10,#0x0,#0x6
00c17738	mov w8,#0x540
00c1773c	str q0,[x0, #0x10]
00c17740	strb w11,[x0, #0x38]
00c17744	orr w8,w9,w8
00c17748	stur q1,[x0, #0x28]
00c1774c	sturh w8,[x0, #0x9]
00c17750	strb w12,[x0, #0x39]
00c17754	ldp x20,x19,[sp, #0x40]
00c17758	ldp x22,x21,[sp, #0x30]
00c1775c	ldp x24,x23,[sp, #0x20]
00c17760	ldp x26,x25,[sp, #0x10]
00c17764	ldp x29,x30,[sp], #0x50
00c17768	autiasp
00c1776c	ret
00c17770	bl 0x00c2fff0
