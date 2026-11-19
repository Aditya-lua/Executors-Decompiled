; ASN1_item_dup @ 009ef914
009ef914	sub sp,sp,#0x60
009ef918	stp x22,x21,[sp, #0x30]
009ef91c	stp x20,x19,[sp, #0x40]
009ef920	stp x29,x30,[sp, #0x50]
009ef924	add x29,sp,#0x50
009ef928	stp xzr,x1,[sp, #0x20]
009ef92c	stp xzr,xzr,[sp]
009ef930	cbz x1,0x009efab8
009ef934	ldrb w9,[x0]
009ef938	mov x8,x1
009ef93c	mov x19,x0
009ef940	cmp w9,#0x6
009ef944	b.hi 0x009ef9c8
009ef948	mov w10,#0x1
009ef94c	lsl w9,w10,w9
009ef950	mov w10,#0x46
009ef954	mov w22,wzr
009ef958	tst w9,w10
009ef95c	mov x21,xzr
009ef960	b.eq 0x009ef9d8
009ef964	ldr x9,[x19, #0x20]
009ef968	cbz x9,0x009ef9c8
009ef96c	ldr x21,[x9, #0x18]
009ef970	cbz x21,0x009ef9d4
009ef974	orr w0,wzr,#0xe
009ef978	add x1,sp,#0x28
009ef97c	mov x2,x19
009ef980	mov x3,xzr
009ef984	blr x21
009ef988	cbz w0,0x009efa50
009ef98c	mov w0,#0x10
009ef990	add x1,sp,#0x28
009ef994	add x3,sp,#0x8
009ef998	mov x2,x19
009ef99c	blr x21
009ef9a0	cbz w0,0x009efa50
009ef9a4	mov w0,#0x11
009ef9a8	add x1,sp,#0x28
009ef9ac	mov x3,sp
009ef9b0	mov x2,x19
009ef9b4	blr x21
009ef9b8	cbz w0,0x009efa50
009ef9bc	ldr x8,[sp, #0x28]
009ef9c0	mov w22,#0x1
009ef9c4	b 0x009ef9d8
009ef9c8	mov w22,wzr
009ef9cc	mov x21,xzr
009ef9d0	b 0x009ef9d8
009ef9d4	mov w22,wzr
009ef9d8	add x1,sp,#0x20
009ef9dc	mov x0,x8
009ef9e0	mov x2,x19
009ef9e4	bl 0x00c36170
009ef9e8	ldr x8,[sp, #0x20]
009ef9ec	cbz x8,0x009efa88
009ef9f0	ldp x5,x4,[sp]
009ef9f4	sxtw x2,w0
009ef9f8	add x1,sp,#0x18
009ef9fc	mov x0,xzr
009efa00	mov x3,x19
009efa04	str x8,[sp, #0x18]
009efa08	bl 0x00c37a00
009efa0c	ldr x8,[sp, #0x20]
009efa10	adrp x1,0x2d1000
009efa14	mov x20,x0
009efa18	str x0,[sp, #0x10]
009efa1c	add x1,x1,#0x6df
009efa20	mov w2,#0x56
009efa24	mov x0,x8
009efa28	bl 0x00c32310
009efa2c	tbz w22,#0x0,0x009efabc
009efa30	ldr x3,[sp, #0x28]
009efa34	orr w0,wzr,#0xf
009efa38	add x1,sp,#0x10
009efa3c	mov x2,x19
009efa40	blr x21
009efa44	cbz w0,0x009efa50
009efa48	ldr x20,[sp, #0x10]
009efa4c	b 0x009efabc
009efa50	bl 0x00c342a0
009efa54	adrp x0,0x2d1000
009efa58	adrp x2,0x2d1000
009efa5c	add x0,x0,#0x6df
009efa60	add x2,x2,#0x6f3
009efa64	mov w1,#0x5f
009efa68	bl 0x00c342b0
009efa6c	ldr x3,[x19, #0x30]
009efa70	adrp x2,0x2a9000
009efa74	add x2,x2,#0xf5e
009efa78	mov w0,#0xd
009efa7c	mov w1,#0x64
009efa80	bl 0x00c342c0
009efa84	b 0x009efab8
009efa88	bl 0x00c342a0
009efa8c	adrp x0,0x2d1000
009efa90	adrp x2,0x2d1000
009efa94	add x0,x0,#0x6df
009efa98	add x2,x2,#0x6f3
009efa9c	mov w1,#0x51
009efaa0	bl 0x00c342b0
009efaa4	mov w1,#0x100
009efaa8	mov w0,#0xd
009efaac	movk w1,#0xc, LSL #16
009efab0	mov x2,xzr
009efab4	bl 0x00c342c0
009efab8	mov x20,xzr
009efabc	mov x0,x20
009efac0	ldp x29,x30,[sp, #0x50]
009efac4	ldp x20,x19,[sp, #0x40]
009efac8	ldp x22,x21,[sp, #0x30]
009efacc	add sp,sp,#0x60
009efad0	ret
