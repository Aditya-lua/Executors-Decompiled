; psa_sign_hash_complete @ 00b8a3ec
00b8a3ec	stp x24,x23,[sp, #-0x40]!
00b8a3f0	stp x22,x21,[sp, #0x10]
00b8a3f4	stp x20,x19,[sp, #0x20]
00b8a3f8	stp x29,x30,[sp, #0x30]
00b8a3fc	add x29,sp,#0x30
00b8a400	str xzr,[x3]
00b8a404	ldr w21,[x0]
00b8a408	ldrb w24,[x0, #0x8]
00b8a40c	mov x20,x2
00b8a410	mov x19,x0
00b8a414	mov x22,x1
00b8a418	cbz w21,0x00b8a484
00b8a41c	tbnz w24,#0x0,0x00b8a494
00b8a420	cbz x20,0x00b8a49c
00b8a424	mov w1,#0x1
00b8a428	mov x0,x20
00b8a42c	bl 0x00c30a30
00b8a430	mov x23,x0
00b8a434	cbz x0,0x00b8a4a4
00b8a438	mov w1,#0x21
00b8a43c	mov x0,x23
00b8a440	mov x2,x20
00b8a444	str wzr,[x19, #0xc]
00b8a448	bl 0x00c301c0
00b8a44c	orr w8,w24,#0x1
00b8a450	strb w8,[x19, #0x8]
00b8a454	str wzr,[x19]
00b8a458	cbz x22,0x00b8a4cc
00b8a45c	cmp w21,#0x1
00b8a460	mov w8,#0xffffff79
00b8a464	mov x0,x22
00b8a468	mov x1,x23
00b8a46c	mov x2,x20
00b8a470	cinc w21,w8,eq
00b8a474	bl 0x00c2ffd0
00b8a478	mov x0,x23
00b8a47c	bl 0x00c30960
00b8a480	b 0x00b8a4b4
00b8a484	orr w8,w24,#0x1
00b8a488	strb w8,[x19, #0x8]
00b8a48c	mov w21,#0xffffff77
00b8a490	b 0x00b8a4b4
00b8a494	mov w21,#0xffffff77
00b8a498	b 0x00b8a4a8
00b8a49c	mov w21,#0xffffff76
00b8a4a0	b 0x00b8a4a8
00b8a4a4	mov w21,#0xffffff73
00b8a4a8	orr w8,w24,#0x1
00b8a4ac	strb w8,[x19, #0x8]
00b8a4b0	str wzr,[x19]
00b8a4b4	mov w0,w21
00b8a4b8	ldp x29,x30,[sp, #0x30]
00b8a4bc	ldp x20,x19,[sp, #0x20]
00b8a4c0	ldp x22,x21,[sp, #0x10]
00b8a4c4	ldp x24,x23,[sp], #0x40
00b8a4c8	ret
00b8a4cc	mov w21,#0xffffff69
00b8a4d0	b 0x00b8a4b4
