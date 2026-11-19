; CRYPTO_128_unwrap @ 00aac830
00aac830	sub sp,sp,#0x80
00aac834	sub x8,x4,#0x18
00aac838	orr w9,wzr,#0x7ffffff0
00aac83c	cmp x8,x9
00aac840	stp x28,x27,[sp, #0x20]
00aac844	stp x26,x25,[sp, #0x30]
00aac848	stp x24,x23,[sp, #0x40]
00aac84c	stp x22,x21,[sp, #0x50]
00aac850	stp x20,x19,[sp, #0x60]
00aac854	stp x29,x30,[sp, #0x70]
00aac858	add x29,sp,#0x70
00aac85c	b.hi 0x00aac968
00aac860	sub x19,x4,#0x8
00aac864	mov x24,x4
00aac868	and x8,x19,#0x7
00aac86c	cbnz x8,0x00aac968
00aac870	ldr x8,[x3], #0x8
00aac874	lsr x9,x19,#0x3
00aac878	mov x20,x2
00aac87c	mov x21,x1
00aac880	mov x23,x0
00aac884	add x9,x9,x9, LSL #0x1
00aac888	mov x0,x2
00aac88c	mov x1,x3
00aac890	mov x2,x19
00aac894	mov x22,x5
00aac898	lsl x25,x9,#0x1
00aac89c	str x8,[sp, #0x10]
00aac8a0	bl 0x00c2ff60
00aac8a4	add x8,x20,x24
00aac8a8	mov x26,xzr
00aac8ac	sub x24,x8,#0x10
00aac8b0	cbz x19,0x00aac924
00aac8b4	mov x27,xzr
00aac8b8	mov x28,x24
00aac8bc	ldrb w8,[sp, #0x17]
00aac8c0	cmp x25,#0x100
00aac8c4	eor w8,w8,w25
00aac8c8	strb w8,[sp, #0x17]
00aac8cc	b.cc 0x00aac8f4
00aac8d0	ldrb w8,[sp, #0x16]
00aac8d4	eor w8,w8,w25, LSR #0x8
00aac8d8	strb w8,[sp, #0x16]
00aac8dc	ldrb w8,[sp, #0x15]
00aac8e0	eor w8,w8,w25, LSR #0x10
00aac8e4	strb w8,[sp, #0x15]
00aac8e8	ldrb w8,[sp, #0x14]
00aac8ec	eor w8,w8,w25, LSR #0x18
00aac8f0	strb w8,[sp, #0x14]
00aac8f4	ldr x8,[x28]
00aac8f8	add x0,sp,#0x10
00aac8fc	add x1,sp,#0x10
00aac900	mov x2,x23
00aac904	str x8,[sp, #0x18]
00aac908	blr x22
00aac90c	ldr x8,[sp, #0x18]
00aac910	add x27,x27,#0x8
00aac914	cmp x27,x19
00aac918	sub x25,x25,#0x1
00aac91c	str x8,[x28], #-0x8
00aac920	b.cc 0x00aac8bc
00aac924	add x26,x26,#0x1
00aac928	cmp x26,#0x6
00aac92c	b.ne 0x00aac8b0
00aac930	ldr x8,[sp, #0x10]
00aac934	str x8,[sp, #0x8]
00aac938	cbz x19,0x00aac96c
00aac93c	adrp x8,0x76e000
00aac940	add x8,x8,#0xa18
00aac944	cmp x21,#0x0
00aac948	csel x1,x8,x21,eq
00aac94c	add x0,sp,#0x8
00aac950	mov w2,#0x8
00aac954	bl 0x00c362f0
00aac958	cbz w0,0x00aac96c
00aac95c	mov x0,x20
00aac960	mov x1,x19
00aac964	bl 0x00c34750
00aac968	mov x19,xzr
00aac96c	mov x0,x19
00aac970	ldp x29,x30,[sp, #0x70]
00aac974	ldp x20,x19,[sp, #0x60]
00aac978	ldp x22,x21,[sp, #0x50]
00aac97c	ldp x24,x23,[sp, #0x40]
00aac980	ldp x26,x25,[sp, #0x30]
00aac984	ldp x28,x27,[sp, #0x20]
00aac988	add sp,sp,#0x80
00aac98c	ret
