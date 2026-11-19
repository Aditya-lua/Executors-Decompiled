; ASN1_dup @ 009ef830
009ef830	sub sp,sp,#0x40
009ef834	stp x22,x21,[sp, #0x10]
009ef838	stp x20,x19,[sp, #0x20]
009ef83c	stp x29,x30,[sp, #0x30]
009ef840	add x29,sp,#0x30
009ef844	cbz x2,0x009ef8f8
009ef848	mov x19,x1
009ef84c	mov x21,x0
009ef850	mov x0,x2
009ef854	mov x1,xzr
009ef858	mov x20,x2
009ef85c	blr x21
009ef860	cmp w0,#0x1
009ef864	b.lt 0x009ef8f8
009ef868	add w8,w0,#0xa
009ef86c	adrp x1,0x2d1000
009ef870	sxtw x0,w8
009ef874	add x1,x1,#0x6df
009ef878	orr w2,wzr,#0x1e
009ef87c	bl 0x00c32320
009ef880	cbz x0,0x009ef8c8
009ef884	mov x22,x0
009ef888	str x0,[sp, #0x8]
009ef88c	add x1,sp,#0x8
009ef890	mov x0,x20
009ef894	blr x21
009ef898	sxtw x2,w0
009ef89c	mov x1,sp
009ef8a0	mov x0,xzr
009ef8a4	str x22,[sp]
009ef8a8	blr x19
009ef8ac	adrp x1,0x2d1000
009ef8b0	mov x19,x0
009ef8b4	add x1,x1,#0x6df
009ef8b8	mov w2,#0x27
009ef8bc	mov x0,x22
009ef8c0	bl 0x00c32310
009ef8c4	b 0x009ef8fc
009ef8c8	bl 0x00c342a0
009ef8cc	adrp x0,0x2d1000
009ef8d0	adrp x2,0x2d3000
009ef8d4	add x0,x0,#0x6df
009ef8d8	add x2,x2,#0x885
009ef8dc	mov w1,#0x20
009ef8e0	bl 0x00c342b0
009ef8e4	mov w1,#0x100
009ef8e8	mov w0,#0xd
009ef8ec	movk w1,#0xc, LSL #16
009ef8f0	mov x2,xzr
009ef8f4	bl 0x00c342c0
009ef8f8	mov x19,xzr
009ef8fc	mov x0,x19
009ef900	ldp x29,x30,[sp, #0x30]
009ef904	ldp x20,x19,[sp, #0x20]
009ef908	ldp x22,x21,[sp, #0x10]
009ef90c	add sp,sp,#0x40
009ef910	ret
