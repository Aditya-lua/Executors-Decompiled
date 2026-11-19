; mbedtls_des3_crypt_cbc @ 00b758c8
00b758c8	str x25,[sp, #-0x50]!
00b758cc	stp x24,x23,[sp, #0x10]
00b758d0	stp x22,x21,[sp, #0x20]
00b758d4	stp x20,x19,[sp, #0x30]
00b758d8	stp x29,x30,[sp, #0x40]
00b758dc	add x29,sp,#0x40
00b758e0	mov x19,x5
00b758e4	mov x23,x4
00b758e8	mov x20,x3
00b758ec	mov x21,x2
00b758f0	tst x2,#0x7
00b758f4	mov x22,x0
00b758f8	b.eq 0x00b75904
00b758fc	mov w0,#0xffffffce
00b75900	b 0x00b75a6c
00b75904	cmp w1,#0x1
00b75908	b.ne 0x00b759b8
00b7590c	cbz x21,0x00b75a68
00b75910	ldrb w8,[x20]
00b75914	ldrb w9,[x23]
00b75918	mov x0,x22
00b7591c	mov x1,x19
00b75920	mov x2,x19
00b75924	eor w8,w8,w9
00b75928	strb w8,[x19]
00b7592c	ldrb w8,[x23, #0x1]
00b75930	ldrb w9,[x20, #0x1]
00b75934	eor w8,w9,w8
00b75938	strb w8,[x19, #0x1]
00b7593c	ldrb w8,[x23, #0x2]
00b75940	ldrb w9,[x20, #0x2]
00b75944	eor w8,w9,w8
00b75948	strb w8,[x19, #0x2]
00b7594c	ldrb w8,[x23, #0x3]
00b75950	ldrb w9,[x20, #0x3]
00b75954	eor w8,w9,w8
00b75958	strb w8,[x19, #0x3]
00b7595c	ldrb w8,[x23, #0x4]
00b75960	ldrb w9,[x20, #0x4]
00b75964	eor w8,w9,w8
00b75968	strb w8,[x19, #0x4]
00b7596c	ldrb w8,[x23, #0x5]
00b75970	ldrb w9,[x20, #0x5]
00b75974	eor w8,w9,w8
00b75978	strb w8,[x19, #0x5]
00b7597c	ldrb w8,[x23, #0x6]
00b75980	ldrb w9,[x20, #0x6]
00b75984	eor w8,w9,w8
00b75988	strb w8,[x19, #0x6]
00b7598c	ldrb w8,[x23, #0x7]
00b75990	ldrb w9,[x20, #0x7]
00b75994	eor w8,w9,w8
00b75998	strb w8,[x19, #0x7]
00b7599c	bl 0x00c422b0
00b759a0	ldr x8,[x19], #0x8
00b759a4	subs x21,x21,#0x8
00b759a8	add x23,x23,#0x8
00b759ac	str x8,[x20]
00b759b0	b.ne 0x00b75914
00b759b4	b 0x00b75a68
00b759b8	cbz x21,0x00b75a68
00b759bc	mov x24,x23
00b759c0	ldr x25,[x24], #0x8
00b759c4	mov x0,x22
00b759c8	mov x1,x23
00b759cc	mov x2,x19
00b759d0	bl 0x00c422b0
00b759d4	ldrb w8,[x19]
00b759d8	ldrb w9,[x20]
00b759dc	subs x21,x21,#0x8
00b759e0	mov x23,x24
00b759e4	eor w8,w9,w8
00b759e8	strb w8,[x19]
00b759ec	ldrb w9,[x19, #0x1]
00b759f0	ldrb w8,[x20, #0x1]
00b759f4	eor w8,w8,w9
00b759f8	strb w8,[x19, #0x1]
00b759fc	ldrb w9,[x19, #0x2]
00b75a00	ldrb w8,[x20, #0x2]
00b75a04	eor w8,w8,w9
00b75a08	strb w8,[x19, #0x2]
00b75a0c	ldrb w9,[x19, #0x3]
00b75a10	ldrb w8,[x20, #0x3]
00b75a14	eor w8,w8,w9
00b75a18	strb w8,[x19, #0x3]
00b75a1c	ldrb w9,[x19, #0x4]
00b75a20	ldrb w8,[x20, #0x4]
00b75a24	eor w8,w8,w9
00b75a28	strb w8,[x19, #0x4]
00b75a2c	ldrb w9,[x19, #0x5]
00b75a30	ldrb w8,[x20, #0x5]
00b75a34	eor w8,w8,w9
00b75a38	strb w8,[x19, #0x5]
00b75a3c	ldrb w9,[x19, #0x6]
00b75a40	ldrb w8,[x20, #0x6]
00b75a44	eor w8,w8,w9
00b75a48	strb w8,[x19, #0x6]
00b75a4c	ldrb w9,[x19, #0x7]
00b75a50	ldrb w8,[x20, #0x7]
00b75a54	eor w8,w8,w9
00b75a58	strb w8,[x19, #0x7]
00b75a5c	add x19,x19,#0x8
00b75a60	str x25,[x20]
00b75a64	b.ne 0x00b759c0
00b75a68	mov w0,wzr
00b75a6c	ldp x29,x30,[sp, #0x40]
00b75a70	ldp x20,x19,[sp, #0x30]
00b75a74	ldp x22,x21,[sp, #0x20]
00b75a78	ldp x24,x23,[sp, #0x10]
00b75a7c	ldr x25,[sp], #0x50
00b75a80	ret
