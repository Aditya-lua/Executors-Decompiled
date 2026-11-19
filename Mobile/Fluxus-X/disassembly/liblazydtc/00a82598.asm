; ossl_namemap_stored @ 00a82598
00a82598	sub sp,sp,#0x50
00a8259c	adrp x2,0xc61000
00a825a0	add x2,x2,#0x420
00a825a4	mov w1,#0x4
00a825a8	stp x22,x21,[sp, #0x20]
00a825ac	stp x20,x19,[sp, #0x30]
00a825b0	stp x29,x30,[sp, #0x40]
00a825b4	add x29,sp,#0x40
00a825b8	bl 0x00c3b520
00a825bc	mov x19,x0
00a825c0	cbz x0,0x00a826ac
00a825c4	ldr w8,[x19, #0x18]
00a825c8	cbnz w8,0x00a826ac
00a825cc	orr w0,wzr,#0xc
00a825d0	mov x1,xzr
00a825d4	bl 0x00c35500
00a825d8	adrp x1,0xa82000
00a825dc	add x1,x1,#0xc74
00a825e0	mov w0,#0x2
00a825e4	mov x2,x19
00a825e8	bl 0x00c3d830
00a825ec	adrp x1,0xa82000
00a825f0	add x1,x1,#0xcc8
00a825f4	mov w0,#0x1
00a825f8	mov x2,x19
00a825fc	bl 0x00c3d830
00a82600	bl 0x00c37b80
00a82604	cmp w0,#0x1
00a82608	b.lt 0x00a826ac
00a8260c	adrp x22,0x2a0000
00a82610	mov w20,w0
00a82614	mov w21,wzr
00a82618	add x22,x22,#0x32e
00a8261c	mov w0,w21
00a82620	bl 0x00c37b70
00a82624	mov x5,x0
00a82628	add x0,sp,#0x1c
00a8262c	add x1,sp,#0x18
00a82630	add x2,sp,#0x14
00a82634	add x4,sp,#0x8
00a82638	mov x3,xzr
00a8263c	str xzr,[sp, #0x18]
00a82640	str wzr,[sp, #0x14]
00a82644	str xzr,[sp, #0x8]
00a82648	bl 0x00c352d0
00a8264c	ldr w1,[sp, #0x1c]
00a82650	cbz w1,0x00a826a0
00a82654	ldrb w8,[sp, #0x14]
00a82658	tbnz w8,#0x0,0x00a8267c
00a8265c	cmp w1,#0x398
00a82660	b.ne 0x00a82684
00a82664	mov w0,wzr
00a82668	mov x2,x22
00a8266c	mov x3,x19
00a82670	bl 0x00a82f04
00a82674	ldr w1,[sp, #0x1c]
00a82678	b 0x00a82684
00a8267c	cmp w1,#0x494
00a82680	b.ne 0x00a82690
00a82684	ldr x2,[sp, #0x8]
00a82688	mov w0,wzr
00a8268c	b 0x00a82698
00a82690	ldr w0,[sp, #0x18]
00a82694	ldr x2,[sp, #0x8]
00a82698	mov x3,x19
00a8269c	bl 0x00a82f04
00a826a0	add w21,w21,#0x1
00a826a4	cmp w20,w21
00a826a8	b.ne 0x00a8261c
00a826ac	mov x0,x19
00a826b0	ldp x29,x30,[sp, #0x40]
00a826b4	ldp x20,x19,[sp, #0x30]
00a826b8	ldp x22,x21,[sp, #0x20]
00a826bc	add sp,sp,#0x50
00a826c0	ret
