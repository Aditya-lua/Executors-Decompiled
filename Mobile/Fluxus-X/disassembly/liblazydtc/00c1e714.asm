; FUN_00c1e714 @ 00c1e714
00c1e714	paciasp
00c1e718	stp x29,x30,[sp, #-0x50]!
00c1e71c	str x25,[sp, #0x10]
00c1e720	stp x24,x23,[sp, #0x20]
00c1e724	stp x22,x21,[sp, #0x30]
00c1e728	stp x20,x19,[sp, #0x40]
00c1e72c	mov x29,sp
00c1e730	ldr x25,[x0, #0x1330]
00c1e734	mov x19,x5
00c1e738	mov x21,x4
00c1e73c	mov x20,x3
00c1e740	mov x23,x2
00c1e744	mov x22,x1
00c1e748	ldr x8,[x25, #0x8]
00c1e74c	sub x9,x8,#0xfa0
00c1e750	cmn x9,#0xff1
00c1e754	b.hi 0x00c1e778
00c1e758	mov x24,x0
00c1e75c	mov w0,#0x1000
00c1e760	bl 0x00c308d0
00c1e764	cbz x0,0x00c1e7f0
00c1e768	mov x8,xzr
00c1e76c	stp x25,xzr,[x0]
00c1e770	mov x25,x0
00c1e774	str x0,[x24, #0x1330]
00c1e778	add x9,x8,#0x50
00c1e77c	add x0,x25,x8
00c1e780	ldr x8,[x23]
00c1e784	str x9,[x25, #0x8]
00c1e788	adrp x9,0xcb2000
00c1e78c	add x9,x9,#0x5d0
00c1e790	mov w10,#0x34
00c1e794	str x9,[x0, #0x10]!
00c1e798	ldr x11,[x21]
00c1e79c	strb w10,[x0, #0x8]
00c1e7a0	ldurh w9,[x0, #0x9]
00c1e7a4	ldr q0,[x22]
00c1e7a8	str x8,[x0, #0x20]
00c1e7ac	mov w10,#0x540
00c1e7b0	ldr q1,[x20]
00c1e7b4	str x11,[x0, #0x38]
00c1e7b8	and w9,w9,#0xf000
00c1e7bc	ldr q2,[x19]
00c1e7c0	orr w8,w9,w10
00c1e7c4	str q0,[x0, #0x10]
00c1e7c8	sturh w8,[x0, #0x9]
00c1e7cc	stur q1,[x0, #0x28]
00c1e7d0	str q2,[x0, #0x40]
00c1e7d4	ldp x20,x19,[sp, #0x40]
00c1e7d8	ldr x25,[sp, #0x10]
00c1e7dc	ldp x22,x21,[sp, #0x30]
00c1e7e0	ldp x24,x23,[sp, #0x20]
00c1e7e4	ldp x29,x30,[sp], #0x50
00c1e7e8	autiasp
00c1e7ec	ret
00c1e7f0	bl 0x00c2fff0
