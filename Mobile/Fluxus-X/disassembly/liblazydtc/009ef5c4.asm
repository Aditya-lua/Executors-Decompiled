; ASN1_TIME_normalize @ 009ef5c4
009ef5c4	sub sp,sp,#0x60
009ef5c8	str x19,[sp, #0x40]
009ef5cc	mov x19,x0
009ef5d0	stp x29,x30,[sp, #0x50]
009ef5d4	add x29,sp,#0x50
009ef5d8	cbz x0,0x009ef614
009ef5dc	add x0,sp,#0x8
009ef5e0	mov x1,x19
009ef5e4	bl 0x009ee624
009ef5e8	cbz w0,0x009ef604
009ef5ec	add x1,sp,#0x8
009ef5f0	mov w2,#0xffffffff
009ef5f4	mov x0,x19
009ef5f8	bl 0x009eec44
009ef5fc	cmp x0,#0x0
009ef600	cset w0,ne
009ef604	ldp x29,x30,[sp, #0x50]
009ef608	ldr x19,[sp, #0x40]
009ef60c	add sp,sp,#0x60
009ef610	ret
009ef614	sub x0,x29,#0x8
009ef618	bl 0x00c30970
009ef61c	sub x0,x29,#0x8
009ef620	add x1,sp,#0x8
009ef624	stp xzr,xzr,[sp, #0x30]
009ef628	stp xzr,xzr,[sp, #0x20]
009ef62c	stp xzr,xzr,[sp, #0x10]
009ef630	str xzr,[sp, #0x8]
009ef634	bl 0x00c37980
009ef638	cmp x0,#0x0
009ef63c	cset w0,ne
009ef640	cbnz w0,0x009ef5ec
009ef644	b 0x009ef604
