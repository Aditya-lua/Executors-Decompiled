; ix::WebSocketHandshake::clientHandshake @ 0099b838
0099b838	stp x28,x27,[sp, #-0x60]!
0099b83c	stp x26,x25,[sp, #0x10]
0099b840	stp x24,x23,[sp, #0x20]
0099b844	stp x22,x21,[sp, #0x30]
0099b848	stp x20,x19,[sp, #0x40]
0099b84c	stp x29,x30,[sp, #0x50]
0099b850	add x29,sp,#0x50
0099b854	sub sp,sp,#0x550
0099b858	mrs x27,tpidr_el0
0099b85c	ldr x9,[x27, #0x28]
0099b860	mov x19,x1
0099b864	mov x23,x0
0099b868	mov w26,w6
0099b86c	str x9,[sp, #0x40]
0099b870	ldr x9,[x0]
0099b874	mov x22,x5
0099b878	mov x28,x4
0099b87c	mov x20,x3
0099b880	stlrb wzr,[x9]
0099b884	ldr x1,[x0]
0099b888	str x8,[sp, #0x38]
0099b88c	sub x8,x29,#0xa0
0099b890	mov w0,w7
0099b894	mov x24,x2
0099b898	bl 0x00c32e00
0099b89c	str xzr,[sp, #0x268]
0099b8a0	str xzr,[sp, #0x260]
0099b8a4	str xzr,[sp, #0x270]
0099b8a8	ldr x8,[x23, #0x8]
0099b8ac	ldr x0,[x8]
0099b8b0	ldr x8,[x0]
0099b8b4	ldr x8,[x8, #0x18]
0099b8b8	add x3,sp,#0x260
0099b8bc	sub x4,x29,#0xa0
0099b8c0	mov x1,x28
0099b8c4	mov w2,w26
0099b8c8	blr x8
0099b8cc	add x25,sp,#0x2a0
0099b8d0	add x10,sp,#0x110
0099b8d4	tbz w0,#0x0,0x0099bb94
0099b8d8	add x8,sp,#0x218
0099b8dc	mov w1,#0x10
0099b8e0	bl 0x00c33b80
0099b8e4	add x8,sp,#0x230
0099b8e8	add x0,sp,#0x218
0099b8ec	bl 0x00c33bd0
0099b8f0	ldrb w8,[sp, #0x218]
0099b8f4	stp x20,x19,[sp, #0x8]
0099b8f8	tbz w8,#0x0,0x0099b904
0099b8fc	ldr x0,[sp, #0x228]
0099b900	bl 0x00c301d0
0099b904	str x27,[sp, #0x18]
0099b908	adrp x21,0xcb4000
0099b90c	adrp x9,0xcb4000
0099b910	ldr x21,[x21, #0xc90]
0099b914	ldr x9,[x9, #0xc88]
0099b918	add x19,sp,#0x2a0
0099b91c	movi v0.2D,#0x0
0099b920	add x0,x19,#0x80
0099b924	add x8,x9,#0x40
0099b928	add x9,x9,#0x18
0099b92c	add x20,x21,#0x40
0099b930	add x1,x19,#0x18
0099b934	mov v0.D[0x0],x9
0099b938	str x20,[sp, #0x2b0]
0099b93c	str x8,[sp, #0x320]
0099b940	str q0,[x25]
0099b944	str x0,[sp, #0x30]
0099b948	str x1,[sp, #0x20]
0099b94c	bl 0x00c30100
0099b950	str xzr,[sp, #0x3a8]
0099b954	adrp x11,0xcb4000
0099b958	ldr x11,[x11, #0xa08]
0099b95c	mov w8,#0xffffffff
0099b960	fmov d0,x20
0099b964	str w8,[sp, #0x3b0]
0099b968	add x8,x11,#0x10
0099b96c	add x9,x21,#0x18
0099b970	add x10,x21,#0x68
0099b974	mov v0.D[0x1],x8
0099b978	add x0,x19,#0x20
0099b97c	add x27,x19,#0x10
0099b980	str x9,[sp, #0x2a0]
0099b984	str x10,[sp, #0x320]
0099b988	str q0,[x25, #0x10]
0099b98c	str x0,[sp, #0x28]
0099b990	bl 0x00c30480
0099b994	movi v0.2D,#0x0
0099b998	stur q0,[x25, #0x48]
0099b99c	stur q0,[x25, #0x38]
0099b9a0	stur q0,[x25, #0x28]
0099b9a4	adrp x9,0xcb4000
0099b9a8	ldr x9,[x9, #0xa00]
0099b9ac	orr w8,wzr,#0x18
0099b9b0	add x9,x9,#0x10
0099b9b4	str x9,[sp, #0x2b8]
0099b9b8	stur q0,[x25, #0x68]
0099b9bc	stur q0,[x25, #0x58]
0099b9c0	str w8,[sp, #0x318]
0099b9c4	adrp x1,0x2b7000
0099b9c8	add x1,x1,#0x3db
0099b9cc	mov w2,#0x4
0099b9d0	mov x0,x27
0099b9d4	bl 0x00c30e90
0099b9d8	ldrb w8,[x22]
0099b9dc	ldp x10,x9,[x22, #0x8]
0099b9e0	tst w8,#0x1
0099b9e4	lsr w11,w8,#0x1
0099b9e8	csinc x1,x9,x22,ne
0099b9ec	csel x2,x11,x10,eq
0099b9f0	bl 0x00c30e90
0099b9f4	adrp x1,0x2d9000
0099b9f8	add x1,x1,#0x335
0099b9fc	mov w2,#0xb
0099ba00	bl 0x00c30e90
0099ba04	adrp x1,0x2a3000
0099ba08	add x1,x1,#0x9c1
0099ba0c	orr w2,wzr,#0x6
0099ba10	mov x0,x27
0099ba14	bl 0x00c30e90
0099ba18	ldrb w8,[x28]
0099ba1c	ldp x10,x9,[x28, #0x8]
0099ba20	tst w8,#0x1
0099ba24	lsr w11,w8,#0x1
0099ba28	csinc x1,x9,x28,ne
0099ba2c	csel x2,x11,x10,eq
0099ba30	bl 0x00c30e90
0099ba34	adrp x1,0x2bc000
0099ba38	add x1,x1,#0xda4
0099ba3c	mov w2,#0x1
0099ba40	bl 0x00c30e90
0099ba44	mov w1,w26
0099ba48	bl 0x00c31aa0
0099ba4c	adrp x1,0x2b9000
0099ba50	add x1,x1,#0x17a
0099ba54	mov w2,#0x2
0099ba58	bl 0x00c30e90
0099ba5c	adrp x1,0x2a5000
0099ba60	add x1,x1,#0x7a1
0099ba64	mov w2,#0x14
0099ba68	mov x0,x27
0099ba6c	bl 0x00c30e90
0099ba70	adrp x1,0x2ab000
0099ba74	add x1,x1,#0x9e7
0099ba78	mov w2,#0x15
0099ba7c	mov x0,x27
0099ba80	bl 0x00c30e90
0099ba84	adrp x1,0x2c1000
0099ba88	add x1,x1,#0x409
0099ba8c	mov w2,#0x1b
0099ba90	mov x0,x27
0099ba94	bl 0x00c30e90
0099ba98	adrp x1,0x2a9000
0099ba9c	add x1,x1,#0xab0
0099baa0	mov w2,#0x13
0099baa4	mov x0,x27
0099baa8	bl 0x00c30e90
0099baac	ldrb w8,[sp, #0x230]
0099bab0	ldr x9,[sp, #0x240]
0099bab4	ldr x10,[sp, #0x238]
0099bab8	add x11,sp,#0x230
0099babc	orr x11,x11,#0x1
0099bac0	tst w8,#0x1
0099bac4	lsr w12,w8,#0x1
0099bac8	csel x1,x11,x9,eq
0099bacc	csel x2,x12,x10,eq
0099bad0	bl 0x00c30e90
0099bad4	adrp x1,0x2b9000
0099bad8	add x1,x1,#0x17a
0099badc	mov w2,#0x2
0099bae0	bl 0x00c30e90
0099bae4	adrp x9,0x2cc000
0099bae8	add x9,x9,#0xd84
0099baec	ldr x9,[x9]
0099baf0	add x11,sp,#0x3c0
0099baf4	mov w8,#0x14
0099baf8	mov w10,#0x746e
0099bafc	str x22,[sp]
0099bb00	str xzr,[sp, #0x3e0]
0099bb04	str xzr,[sp, #0x3e8]
0099bb08	str xzr,[sp, #0x3f0]
0099bb0c	strb w8,[sp, #0x3e0]
0099bb10	sturh w10,[x11, #0x29]
0099bb14	stur x9,[x11, #0x21]
0099bb18	strb wzr,[sp, #0x3eb]
0099bb1c	mov x19,x24
0099bb20	ldr x22,[x19, #0x8]!
0099bb24	cbz x22,0x0099bb74
0099bb28	add x21,x24,#0x10
0099bb2c	mov w20,#0x8
0099bb30	mov x25,x19
0099bb34	add x1,x22,#0x20
0099bb38	add x2,sp,#0x3e0
0099bb3c	mov x0,x21
0099bb40	bl 0x00c331d0
0099bb44	tst w0,#0x1
0099bb48	csel x8,x20,xzr,ne
0099bb4c	csel x25,x25,x22,ne
0099bb50	ldr x22,[x22, x8#0x0]
0099bb54	cbnz x22,0x0099bb34
0099bb58	cmp x25,x19
0099bb5c	b.eq 0x0099bb74
0099bb60	add x2,x25,#0x20
0099bb64	add x1,sp,#0x3e0
0099bb68	mov x0,x21
0099bb6c	bl 0x00c331d0
0099bb70	tbz w0,#0x0,0x0099bdc4
0099bb74	mov x25,x19
0099bb78	ldrb w8,[sp, #0x3e0]
0099bb7c	tbz w8,#0x0,0x0099bdcc
0099bb80	ldr x0,[sp, #0x3f0]
0099bb84	bl 0x00c301d0
0099bb88	cmp x25,x19
0099bb8c	b.ne 0x0099be40
0099bb90	b 0x0099bdd4
0099bb94	adrp x23,0xcb4000
0099bb98	adrp x8,0xcb4000
0099bb9c	ldr x23,[x23, #0xc90]
0099bba0	ldr x8,[x8, #0xc88]
0099bba4	add x20,sp,#0x2a0
0099bba8	movi v0.2D,#0x0
0099bbac	add x19,x20,#0x80
0099bbb0	add x9,x8,#0x40
0099bbb4	add x8,x8,#0x18
0099bbb8	add x24,x23,#0x40
0099bbbc	add x22,x20,#0x18
0099bbc0	mov v0.D[0x0],x8
0099bbc4	str x24,[sp, #0x2b0]
0099bbc8	str x9,[sp, #0x320]
0099bbcc	str q0,[x10, #0x190]
0099bbd0	mov x0,x19
0099bbd4	mov x1,x22
0099bbd8	bl 0x00c30100
0099bbdc	add x11,sp,#0x110
0099bbe0	str xzr,[sp, #0x3a8]
0099bbe4	adrp x12,0xcb4000
0099bbe8	ldr x12,[x12, #0xa08]
0099bbec	mov w8,#0xffffffff
0099bbf0	add x21,x20,#0x10
0099bbf4	fmov d0,x24
0099bbf8	str w8,[sp, #0x3b0]
0099bbfc	add x8,x12,#0x10
0099bc00	add x20,x20,#0x20
0099bc04	add x9,x23,#0x18
0099bc08	add x10,x23,#0x68
0099bc0c	mov v0.D[0x1],x8
0099bc10	mov x0,x20
0099bc14	str x9,[sp, #0x2a0]
0099bc18	str x10,[sp, #0x320]
0099bc1c	str q0,[x11, #0x1a0]
0099bc20	bl 0x00c30480
0099bc24	movi v0.2D,#0x0
0099bc28	stur q0,[x25, #0x48]
0099bc2c	stur q0,[x25, #0x38]
0099bc30	stur q0,[x25, #0x28]
0099bc34	adrp x24,0xcb4000
0099bc38	ldr x24,[x24, #0xa00]
0099bc3c	orr w8,wzr,#0x18
0099bc40	add x9,x24,#0x10
0099bc44	str x9,[sp, #0x2b8]
0099bc48	stur q0,[x25, #0x68]
0099bc4c	stur q0,[x25, #0x58]
0099bc50	str w8,[sp, #0x318]
0099bc54	adrp x1,0x2a5000
0099bc58	add x1,x1,#0x78b
0099bc5c	mov w2,#0x15
0099bc60	mov x0,x21
0099bc64	bl 0x00c30e90
0099bc68	ldrb w8,[x28]
0099bc6c	ldp x10,x9,[x28, #0x8]
0099bc70	tst w8,#0x1
0099bc74	lsr w11,w8,#0x1
0099bc78	csinc x1,x9,x28,ne
0099bc7c	csel x2,x11,x10,eq
0099bc80	bl 0x00c30e90
0099bc84	adrp x1,0x2b7000
0099bc88	add x1,x1,#0x3d1
0099bc8c	mov w2,#0x9
0099bc90	bl 0x00c30e90
0099bc94	mov w1,w26
0099bc98	bl 0x00c31aa0
0099bc9c	adrp x1,0x2b9000
0099bca0	add x1,x1,#0x678
0099bca4	mov w2,#0x9
0099bca8	bl 0x00c30e90
0099bcac	ldrb w8,[sp, #0x260]
0099bcb0	ldr x9,[sp, #0x270]
0099bcb4	ldr x10,[sp, #0x268]
0099bcb8	add x11,sp,#0x260
0099bcbc	orr x11,x11,#0x1
0099bcc0	tst w8,#0x1
0099bcc4	lsr w12,w8,#0x1
0099bcc8	csel x1,x11,x9,eq
0099bccc	csel x2,x12,x10,eq
0099bcd0	bl 0x00c30e90
0099bcd4	add x8,sp,#0x3e0
0099bcd8	mov x0,x22
0099bcdc	bl 0x00c30e20
0099bce0	add x8,sp,#0x248
0099bce4	add x8,x8,#0x8
0099bce8	str xzr,[sp, #0x258]
0099bcec	str xzr,[sp, #0x250]
0099bcf0	stp xzr,xzr,[sp, #0x1e0]
0099bcf4	str x8,[sp, #0x248]
0099bcf8	str xzr,[sp, #0x1f0]
0099bcfc	ldr x0,[sp, #0x38]
0099bd00	add x3,sp,#0x3e0
0099bd04	add x4,sp,#0x248
0099bd08	add x5,sp,#0x1e0
0099bd0c	mov w1,wzr
0099bd10	mov w2,wzr
0099bd14	bl 0x00c33bc0
0099bd18	ldrb w8,[sp, #0x1e0]
0099bd1c	tbz w8,#0x0,0x0099bd28
0099bd20	ldr x0,[sp, #0x1f0]
0099bd24	bl 0x00c301d0
0099bd28	ldr x1,[sp, #0x250]
0099bd2c	add x0,sp,#0x248
0099bd30	bl 0x00c32fc0
0099bd34	ldrb w8,[sp, #0x3e0]
0099bd38	tbz w8,#0x0,0x0099bd44
0099bd3c	ldr x0,[sp, #0x3f0]
0099bd40	bl 0x00c301d0
0099bd44	add x8,x23,#0x18
0099bd48	str x8,[sp, #0x2a0]
0099bd4c	ldrb w8,[sp, #0x2f8]
0099bd50	add x9,x23,#0x68
0099bd54	add x10,x23,#0x40
0099bd58	add x11,x24,#0x10
0099bd5c	str x9,[sp, #0x320]
0099bd60	str x10,[sp, #0x2b0]
0099bd64	str x11,[sp, #0x2b8]
0099bd68	tbz w8,#0x0,0x0099bd74
0099bd6c	ldr x0,[sp, #0x308]
0099bd70	bl 0x00c301d0
0099bd74	adrp x8,0xcb4000
0099bd78	ldr x8,[x8, #0xa08]
0099bd7c	mov x0,x20
0099bd80	add x8,x8,#0x10
0099bd84	str x8,[sp, #0x2b8]
0099bd88	bl 0x00c30090
0099bd8c	mov x0,x19
0099bd90	bl 0x00c30ee0
0099bd94	ldrb w8,[sp, #0x260]
0099bd98	tbz w8,#0x0,0x0099bda4
0099bd9c	ldr x0,[sp, #0x270]
0099bda0	bl 0x00c301d0
0099bda4	ldur x0,[x29, #-0x80]
0099bda8	sub x8,x29,#0xa0
0099bdac	cmp x8,x0
0099bdb0	b.eq 0x0099c180
0099bdb4	cbz x0,0x0099c18c
0099bdb8	ldr x8,[x0]
0099bdbc	ldr x8,[x8, #0x28]
0099bdc0	b 0x0099c188
0099bdc4	ldrb w8,[sp, #0x3e0]
0099bdc8	tbnz w8,#0x0,0x0099bb80
0099bdcc	cmp x25,x19
0099bdd0	b.ne 0x0099be40
0099bdd4	adrp x1,0x2c5000
0099bdd8	add x1,x1,#0x3c8
0099bddc	orr w2,wzr,#0xc
0099bde0	mov x0,x27
0099bde4	bl 0x00c30e90
0099bde8	mov x21,x0
0099bdec	add x8,sp,#0x3e0
0099bdf0	add x20,sp,#0x3e0
0099bdf4	bl 0x00c331c0
0099bdf8	ldrb w8,[sp, #0x3e0]
0099bdfc	ldr x9,[sp, #0x3f0]
0099be00	ldr x10,[sp, #0x3e8]
0099be04	orr x11,x20,#0x1
0099be08	tst w8,#0x1
0099be0c	lsr w12,w8,#0x1
0099be10	csel x1,x11,x9,eq
0099be14	csel x2,x12,x10,eq
0099be18	mov x0,x21
0099be1c	bl 0x00c30e90
0099be20	adrp x1,0x2b9000
0099be24	add x1,x1,#0x17a
0099be28	mov w2,#0x2
0099be2c	bl 0x00c30e90
0099be30	ldrb w8,[sp, #0x3e0]
0099be34	tbz w8,#0x0,0x0099be40
0099be38	ldr x0,[sp, #0x3f0]
0099be3c	bl 0x00c301d0
0099be40	orr w8,wzr,#0xc
0099be44	mov w10,#0x724f
0099be48	mov w9,#0x6e69
0099be4c	movk w10,#0x6769, LSL #16
0099be50	strb w8,[sp, #0x3e0]
0099be54	add x8,sp,#0x3c0
0099be58	str xzr,[sp, #0x3f0]
0099be5c	str xzr,[sp, #0x3e8]
0099be60	sturh w9,[x8, #0x25]
0099be64	stur w10,[x8, #0x21]
0099be68	strb wzr,[sp, #0x3e7]
0099be6c	ldr x22,[x19]
0099be70	cbz x22,0x0099bec0
0099be74	add x21,x24,#0x10
0099be78	mov w20,#0x8
0099be7c	mov x25,x19
0099be80	add x1,x22,#0x20
0099be84	add x2,sp,#0x3e0
0099be88	mov x0,x21
0099be8c	bl 0x00c331d0
0099be90	tst w0,#0x1
0099be94	csel x8,x20,xzr,ne
0099be98	csel x25,x25,x22,ne
0099be9c	ldr x22,[x22, x8#0x0]
0099bea0	cbnz x22,0x0099be80
0099bea4	cmp x25,x19
0099bea8	b.eq 0x0099bec0
0099beac	add x2,x25,#0x20
0099beb0	add x1,sp,#0x3e0
0099beb4	mov x0,x21
0099beb8	bl 0x00c331d0
0099bebc	tbz w0,#0x0,0x0099bee0
0099bec0	mov x25,x19
0099bec4	ldrb w8,[sp, #0x3e0]
0099bec8	tbz w8,#0x0,0x0099bee8
0099becc	ldr x0,[sp, #0x3f0]
0099bed0	bl 0x00c301d0
0099bed4	cmp x25,x19
0099bed8	b.ne 0x0099bf7c
0099bedc	b 0x0099bef0
0099bee0	ldrb w8,[sp, #0x3e0]
0099bee4	tbnz w8,#0x0,0x0099becc
0099bee8	cmp x25,x19
0099beec	b.ne 0x0099bf7c
0099bef0	adrp x1,0x2cf000
0099bef4	add x1,x1,#0x499
0099bef8	mov w2,#0x8
0099befc	mov x0,x27
0099bf00	bl 0x00c30e90
0099bf04	ldr x12,[sp, #0x8]
0099bf08	ldrb w8,[x12]
0099bf0c	ldp x10,x9,[x12, #0x8]
0099bf10	tst w8,#0x1
0099bf14	lsr w11,w8,#0x1
0099bf18	csinc x1,x9,x12,ne
0099bf1c	csel x2,x11,x10,eq
0099bf20	bl 0x00c30e90
0099bf24	adrp x1,0x2c0000
0099bf28	add x1,x1,#0xfba
0099bf2c	orr w2,wzr,#0x3
0099bf30	bl 0x00c30e90
0099bf34	ldrb w8,[x28]
0099bf38	ldp x9,x10,[x28, #0x8]
0099bf3c	add x11,x28,#0x1
0099bf40	tst w8,#0x1
0099bf44	lsr w12,w8,#0x1
0099bf48	csel x1,x11,x10,eq
0099bf4c	csel x2,x12,x9,eq
0099bf50	bl 0x00c30e90
0099bf54	adrp x1,0x2bc000
0099bf58	add x1,x1,#0xda4
0099bf5c	mov w2,#0x1
0099bf60	bl 0x00c30e90
0099bf64	mov w1,w26
0099bf68	bl 0x00c31aa0
0099bf6c	adrp x1,0x2b9000
0099bf70	add x1,x1,#0x17a
0099bf74	mov w2,#0x2
0099bf78	bl 0x00c30e90
0099bf7c	ldr x24,[x24]
0099bf80	cmp x24,x19
0099bf84	b.eq 0x0099c050
0099bf88	adrp x21,0x2d4000
0099bf8c	adrp x20,0x2b9000
0099bf90	add x21,x21,#0xf75
0099bf94	add x20,x20,#0x17a
0099bf98	ldrb w8,[x24, #0x20]
0099bf9c	ldp x9,x10,[x24, #0x28]
0099bfa0	add x11,x24,#0x21
0099bfa4	tst w8,#0x1
0099bfa8	lsr w12,w8,#0x1
0099bfac	csel x1,x11,x10,eq
0099bfb0	csel x2,x12,x9,eq
0099bfb4	mov x0,x27
0099bfb8	bl 0x00c30e90
0099bfbc	mov w2,#0x2
0099bfc0	mov x1,x21
0099bfc4	bl 0x00c30e90
0099bfc8	ldrb w8,[x24, #0x38]
0099bfcc	ldp x9,x10,[x24, #0x40]
0099bfd0	add x11,x24,#0x39
0099bfd4	tst w8,#0x1
0099bfd8	lsr w12,w8,#0x1
0099bfdc	csel x1,x11,x10,eq
0099bfe0	csel x2,x12,x9,eq
0099bfe4	bl 0x00c30e90
0099bfe8	mov w2,#0x2
0099bfec	mov x1,x20
0099bff0	bl 0x00c30e90
0099bff4	ldr x8,[x24, #0x8]
0099bff8	cbz x8,0x0099c00c
0099bffc	mov x24,x8
0099c000	ldr x8,[x8]
0099c004	cbnz x8,0x0099bffc
0099c008	b 0x0099c038
0099c00c	mov x8,x24
0099c010	ldr x9,[x8, #0x10]!
0099c014	ldr x10,[x9]
0099c018	cmp x10,x24
0099c01c	b.eq 0x0099c044
0099c020	ldr x9,[x8]
0099c024	mov x8,x9
0099c028	ldr x24,[x8, #0x10]!
0099c02c	ldr x10,[x24]
0099c030	cmp x10,x9
0099c034	b.ne 0x0099c020
0099c038	cmp x24,x19
0099c03c	b.ne 0x0099bf98
0099c040	b 0x0099c050
0099c044	mov x24,x9
0099c048	cmp x24,x19
0099c04c	b.ne 0x0099bf98
0099c050	ldr x8,[x23, #0x20]
0099c054	ldarb w8,[x8]
0099c058	tbz w8,#0x0,0x0099c0a4
0099c05c	ldr x0,[x23, #0x18]
0099c060	add x8,sp,#0x3e0
0099c064	add x19,sp,#0x3e0
0099c068	bl 0x00c33d60
0099c06c	ldrb w8,[sp, #0x3e0]
0099c070	ldr x9,[sp, #0x3f0]
0099c074	ldr x10,[sp, #0x3e8]
0099c078	orr x11,x19,#0x1
0099c07c	tst w8,#0x1
0099c080	lsr w12,w8,#0x1
0099c084	csel x1,x11,x9,eq
0099c088	csel x2,x12,x10,eq
0099c08c	mov x0,x27
0099c090	bl 0x00c30e90
0099c094	ldrb w8,[sp, #0x3e0]
0099c098	tbz w8,#0x0,0x0099c0a4
0099c09c	ldr x0,[sp, #0x3f0]
0099c0a0	bl 0x00c301d0
0099c0a4	adrp x1,0x2b9000
0099c0a8	add x1,x1,#0x17a
0099c0ac	mov w2,#0x2
0099c0b0	mov x0,x27
0099c0b4	bl 0x00c30e90
0099c0b8	ldr x8,[x23, #0x8]
0099c0bc	ldr x19,[x8]
0099c0c0	ldr x0,[sp, #0x20]
0099c0c4	add x8,sp,#0x3e0
0099c0c8	bl 0x00c30e20
0099c0cc	adrp x27,0xcb4000
0099c0d0	adrp x24,0xcb4000
0099c0d4	ldr x27,[x27, #0xc90]
0099c0d8	ldr x24,[x24, #0xa00]
0099c0dc	add x1,sp,#0x3e0
0099c0e0	sub x2,x29,#0xa0
0099c0e4	mov x0,x19
0099c0e8	bl 0x00c33180
0099c0ec	add x20,sp,#0x110
0099c0f0	add x28,sp,#0x3c0
0099c0f4	ldrb w8,[sp, #0x3e0]
0099c0f8	mov w19,w0
0099c0fc	tbz w8,#0x0,0x0099c108
0099c100	ldr x0,[sp, #0x3f0]
0099c104	bl 0x00c301d0
0099c108	tbz w19,#0x0,0x0099c1bc
0099c10c	ldr x8,[x23, #0x8]
0099c110	ldr x0,[x8]
0099c114	add x8,sp,#0x1e0
0099c118	sub x1,x29,#0xa0
0099c11c	add x19,sp,#0x1e0
0099c120	bl 0x00c33190
0099c124	ldrb w8,[sp, #0x1e8]
0099c128	ldrb w22,[sp, #0x1e0]
0099c12c	stp xzr,xzr,[sp, #0x1c0]
0099c130	str xzr,[sp, #0x1d0]
0099c134	tbnz w8,#0x0,0x0099c2b4
0099c138	add x8,x19,#0x8
0099c13c	ldr x9,[x8, #0x10]
0099c140	ldr q0,[x8]
0099c144	str x9,[sp, #0x1d0]
0099c148	str q0,[x20, #0xb0]
0099c14c	cbz w22,0x0099c350
0099c150	add x8,sp,#0x280
0099c154	add x0,sp,#0x1c0
0099c158	bl 0x00c32f50
0099c15c	ldrb w8,[sp, #0x280]
0099c160	stp xzr,xzr,[sp, #0x190]
0099c164	str xzr,[sp, #0x1a0]
0099c168	tbnz w8,#0x0,0x0099c2e4
0099c16c	ldr x8,[sp, #0x290]
0099c170	ldr q0,[x20, #0x170]
0099c174	str x8,[sp, #0x1a0]
0099c178	str q0,[x20, #0x80]
0099c17c	b 0x0099c468
0099c180	ldr x8,[x0]
0099c184	ldr x8,[x8, #0x20]
0099c188	blr x8
0099c18c	ldr x8,[x27, #0x28]
0099c190	ldr x9,[sp, #0x40]
0099c194	cmp x8,x9
0099c198	b.ne 0x0099d6a8
0099c19c	add sp,sp,#0x550
0099c1a0	ldp x29,x30,[sp, #0x50]
0099c1a4	ldp x20,x19,[sp, #0x40]
0099c1a8	ldp x22,x21,[sp, #0x30]
0099c1ac	ldp x24,x23,[sp, #0x20]
0099c1b0	ldp x26,x25,[sp, #0x10]
0099c1b4	ldp x28,x27,[sp], #0x60
0099c1b8	ret
0099c1bc	stp xzr,xzr,[sp, #0x1e0]
0099c1c0	str xzr,[sp, #0x1f0]
0099c1c4	mov w0,#0x20
0099c1c8	bl 0x00c2fed0
0099c1cc	adrp x9,0x2c7000
0099c1d0	adrp x8,0x29c000
0099c1d4	add x9,x9,#0x3fd
0099c1d8	ldr q0,[x8, #0x410]
0099c1dc	ldur q1,[x9, #0xe]
0099c1e0	ldr q2,[x9]
0099c1e4	ldr x12,[sp, #0x10]
0099c1e8	str x0,[sp, #0x1f0]
0099c1ec	str q0,[x20, #0xd0]
0099c1f0	stur q1,[x0, #0xe]
0099c1f4	strb wzr,[x0, #0x1e]
0099c1f8	str q2,[x0]
0099c1fc	ldrb w8,[x12]
0099c200	ldp x10,x9,[x12, #0x8]
0099c204	tst w8,#0x1
0099c208	lsr w11,w8,#0x1
0099c20c	csinc x1,x9,x12,ne
0099c210	csel x2,x11,x10,eq
0099c214	adrp x23,0xcb4000
0099c218	ldr x23,[x23, #0xa08]
0099c21c	add x0,sp,#0x1e0
0099c220	bl 0x00c308c0
0099c224	ldr x8,[x0, #0x10]
0099c228	str x8,[sp, #0x3f0]
0099c22c	ldr q0,[x0]
0099c230	add x8,sp,#0x200
0099c234	add x8,x8,#0x8
0099c238	str q0,[x28, #0x20]
0099c23c	stp xzr,xzr,[x0, #0x8]
0099c240	str xzr,[x0]
0099c244	str xzr,[sp, #0x210]
0099c248	str xzr,[sp, #0x208]
0099c24c	str x8,[sp, #0x200]
0099c250	str xzr,[sp, #0x288]
0099c254	str xzr,[sp, #0x280]
0099c258	str xzr,[sp, #0x290]
0099c25c	ldr x0,[sp, #0x38]
0099c260	add x3,sp,#0x3e0
0099c264	add x4,sp,#0x200
0099c268	add x5,sp,#0x280
0099c26c	mov w1,wzr
0099c270	mov w2,wzr
0099c274	bl 0x00c33bc0
0099c278	ldrb w8,[sp, #0x280]
0099c27c	tbz w8,#0x0,0x0099c288
0099c280	ldr x0,[sp, #0x290]
0099c284	bl 0x00c301d0
0099c288	ldr x1,[sp, #0x208]
0099c28c	add x0,sp,#0x200
0099c290	bl 0x00c32fc0
0099c294	ldrb w8,[sp, #0x3e0]
0099c298	tbz w8,#0x0,0x0099c2a4
0099c29c	ldr x0,[sp, #0x3f0]
0099c2a0	bl 0x00c301d0
0099c2a4	ldrb w8,[sp, #0x1e0]
0099c2a8	tbz w8,#0x0,0x0099c738
0099c2ac	ldr x0,[sp, #0x1f0]
0099c2b0	b 0x0099c734
0099c2b4	ldr x19,[sp, #0x1f0]
0099c2b8	cmn x19,#0x10
0099c2bc	b.cs 0x0099d6ac
0099c2c0	ldr x20,[sp, #0x1f8]
0099c2c4	cmp x19,#0x17
0099c2c8	b.cs 0x0099c314
0099c2cc	add x9,sp,#0x1c0
0099c2d0	lsl w8,w19,#0x1
0099c2d4	orr x21,x9,#0x1
0099c2d8	strb w8,[sp, #0x1c0]
0099c2dc	cbnz x19,0x0099c334
0099c2e0	b 0x0099c344
0099c2e4	ldr x19,[sp, #0x288]
0099c2e8	cmn x19,#0x10
0099c2ec	b.cs 0x0099d6b4
0099c2f0	ldr x20,[sp, #0x290]
0099c2f4	cmp x19,#0x17
0099c2f8	b.cs 0x0099c434
0099c2fc	add x9,sp,#0x190
0099c300	lsl w8,w19,#0x1
0099c304	orr x21,x9,#0x1
0099c308	strb w8,[sp, #0x190]
0099c30c	cbnz x19,0x0099c454
0099c310	b 0x0099c464
0099c314	add x8,x19,#0x10
0099c318	and x25,x8,#-0x10
0099c31c	mov x0,x25
0099c320	bl 0x00c2fed0
0099c324	orr x8,x25,#0x1
0099c328	mov x21,x0
0099c32c	stp x19,x0,[sp, #0x1c8]
0099c330	str x8,[sp, #0x1c0]
0099c334	mov x0,x21
0099c338	mov x1,x20
0099c33c	mov x2,x19
0099c340	bl 0x00c2ffd0
0099c344	add x20,sp,#0x110
0099c348	strb wzr,[x21, x19]
0099c34c	cbnz w22,0x0099c150
0099c350	str xzr,[sp, #0x288]
0099c354	str xzr,[sp, #0x280]
0099c358	str xzr,[sp, #0x290]
0099c35c	orr w0,wzr,#0x30
0099c360	bl 0x00c2fed0
0099c364	adrp x9,0x2ad000
0099c368	adrp x8,0x29c000
0099c36c	add x9,x9,#0x590
0099c370	ldr q0,[x8, #0x5b0]
0099c374	ldur x8,[x9, #0x1d]
0099c378	ldp q1,q2,[x9]
0099c37c	ldr x12,[sp, #0x10]
0099c380	str x0,[sp, #0x290]
0099c384	str q0,[x20, #0x170]
0099c388	stur x8,[x0, #0x1d]
0099c38c	stp q1,q2,[x0]
0099c390	strb wzr,[x0, #0x25]
0099c394	ldrb w8,[x12]
0099c398	ldp x10,x9,[x12, #0x8]
0099c39c	tst w8,#0x1
0099c3a0	lsr w11,w8,#0x1
0099c3a4	csinc x1,x9,x12,ne
0099c3a8	csel x2,x11,x10,eq
0099c3ac	adrp x23,0xcb4000
0099c3b0	ldr x23,[x23, #0xa08]
0099c3b4	add x0,sp,#0x280
0099c3b8	bl 0x00c308c0
0099c3bc	ldr x8,[x0, #0x10]
0099c3c0	str x8,[sp, #0x3f0]
0099c3c4	ldr q0,[x0]
0099c3c8	add x8,sp,#0x1a8
0099c3cc	add x8,x8,#0x8
0099c3d0	str q0,[x28, #0x20]
0099c3d4	stp xzr,xzr,[x0, #0x8]
0099c3d8	str xzr,[x0]
0099c3dc	stp xzr,xzr,[sp, #0x1b0]
0099c3e0	str x8,[sp, #0x1a8]
0099c3e4	stp xzr,xzr,[sp, #0x158]
0099c3e8	str xzr,[sp, #0x168]
0099c3ec	ldr x0,[sp, #0x38]
0099c3f0	add x3,sp,#0x3e0
0099c3f4	add x4,sp,#0x1a8
0099c3f8	add x5,sp,#0x158
0099c3fc	mov w1,wzr
0099c400	mov w2,wzr
0099c404	bl 0x00c33bc0
0099c408	ldrb w8,[sp, #0x158]
0099c40c	tbz w8,#0x0,0x0099c418
0099c410	ldr x0,[sp, #0x168]
0099c414	bl 0x00c301d0
0099c418	ldr x1,[sp, #0x1b0]
0099c41c	add x0,sp,#0x1a8
0099c420	bl 0x00c32fc0
0099c424	ldrb w8,[sp, #0x3e0]
0099c428	tbz w8,#0x0,0x0099c6f4
0099c42c	ldr x0,[sp, #0x3f0]
0099c430	b 0x0099c6f0
0099c434	add x8,x19,#0x10
0099c438	and x25,x8,#-0x10
0099c43c	mov x0,x25
0099c440	bl 0x00c2fed0
0099c444	orr x8,x25,#0x1
0099c448	mov x21,x0
0099c44c	stp x19,x0,[sp, #0x198]
0099c450	str x8,[sp, #0x190]
0099c454	mov x0,x21
0099c458	mov x1,x20
0099c45c	mov x2,x19
0099c460	bl 0x00c2ffd0
0099c464	strb wzr,[x21, x19]
0099c468	ldrb w8,[sp, #0x190]
0099c46c	ldr x9,[sp, #0x198]
0099c470	ldr w26,[sp, #0x298]
0099c474	lsr w10,w8,#0x1
0099c478	tst w8,#0x1
0099c47c	csel x9,x10,x9,eq
0099c480	cmp x9,#0x8
0099c484	b.ne 0x0099c4b8
0099c488	ldr x9,[sp, #0x1a0]
0099c48c	add x10,sp,#0x190
0099c490	orr x10,x10,#0x1
0099c494	tst w8,#0x1
0099c498	csel x8,x10,x9,eq
0099c49c	ldr x8,[x8]
0099c4a0	mov x9,#0x5448
0099c4a4	movk x9,#0x5054, LSL #16
0099c4a8	movk x9,#0x312f, LSL #32
0099c4ac	movk x9,#0x312e, LSL #48
0099c4b0	cmp x8,x9
0099c4b4	b.eq 0x0099c7a0
0099c4b8	adrp x8,0xcb4000
0099c4bc	ldr x8,[x8, #0xc88]
0099c4c0	add x20,sp,#0x3e0
0099c4c4	movi v0.2D,#0x0
0099c4c8	add x23,x27,#0x40
0099c4cc	mov x9,x8
0099c4d0	add x9,x9,#0x18
0099c4d4	add x8,x8,#0x40
0099c4d8	add x19,x20,#0x80
0099c4dc	add x22,x20,#0x18
0099c4e0	mov v0.D[0x0],x9
0099c4e4	str x23,[sp, #0x3f0]
0099c4e8	str x8,[sp, #0x460]
0099c4ec	str q0,[x28, #0x20]
0099c4f0	mov x0,x19
0099c4f4	mov x1,x22
0099c4f8	bl 0x00c30100
0099c4fc	str xzr,[sp, #0x4e8]
0099c500	fmov d0,x23
0099c504	adrp x23,0xcb4000
0099c508	ldr x23,[x23, #0xa08]
0099c50c	add x21,x20,#0x10
0099c510	add x20,x20,#0x20
0099c514	mov w8,#0xffffffff
0099c518	add x11,x23,#0x10
0099c51c	add x9,x27,#0x18
0099c520	add x10,x27,#0x68
0099c524	mov v0.D[0x1],x11
0099c528	mov x0,x20
0099c52c	str w8,[sp, #0x4f0]
0099c530	str x9,[sp, #0x3e0]
0099c534	str x10,[sp, #0x460]
0099c538	str q0,[x28, #0x30]
0099c53c	bl 0x00c30480
0099c540	movi v0.2D,#0x0
0099c544	add x8,x24,#0x10
0099c548	orr w9,wzr,#0x18
0099c54c	stur q0,[x28, #0x68]
0099c550	stur q0,[x28, #0x58]
0099c554	stur q0,[x28, #0x48]
0099c558	str x8,[sp, #0x3f8]
0099c55c	stur q0,[x28, #0x88]
0099c560	stur q0,[x28, #0x78]
0099c564	str w9,[sp, #0x458]
0099c568	adrp x1,0x2c7000
0099c56c	add x1,x1,#0x41c
0099c570	orr w2,wzr,#0x18
0099c574	mov x0,x21
0099c578	bl 0x00c30e90
0099c57c	ldrb w8,[sp, #0x190]
0099c580	ldp x10,x9,[sp, #0x198]
0099c584	add x11,sp,#0x190
0099c588	orr x11,x11,#0x1
0099c58c	tst w8,#0x1
0099c590	lsr w12,w8,#0x1
0099c594	csel x1,x11,x9,eq
0099c598	csel x2,x12,x10,eq
0099c59c	bl 0x00c30e90
0099c5a0	adrp x1,0x2b3000
0099c5a4	add x1,x1,#0xabc
0099c5a8	mov w2,#0x2
0099c5ac	bl 0x00c30e90
0099c5b0	adrp x1,0x2ad000
0099c5b4	add x1,x1,#0x577
0099c5b8	orr w2,wzr,#0x18
0099c5bc	bl 0x00c30e90
0099c5c0	ldr x12,[sp, #0x10]
0099c5c4	ldrb w8,[x12]
0099c5c8	ldp x10,x9,[x12, #0x8]
0099c5cc	tst w8,#0x1
0099c5d0	lsr w11,w8,#0x1
0099c5d4	csinc x1,x9,x12,ne
0099c5d8	csel x2,x11,x10,eq
0099c5dc	bl 0x00c30e90
0099c5e0	adrp x1,0x2bd000
0099c5e4	add x1,x1,#0x366
0099c5e8	mov w2,#0xa
0099c5ec	bl 0x00c30e90
0099c5f0	mov w1,w26
0099c5f4	bl 0x00c31aa0
0099c5f8	adrp x1,0x2d5000
0099c5fc	add x1,x1,#0x5df
0099c600	mov w2,#0x14
0099c604	bl 0x00c30e90
0099c608	ldrb w8,[sp, #0x1c0]
0099c60c	ldp x10,x9,[sp, #0x1c8]
0099c610	add x11,sp,#0x1c0
0099c614	orr x11,x11,#0x1
0099c618	tst w8,#0x1
0099c61c	lsr w12,w8,#0x1
0099c620	csel x1,x11,x9,eq
0099c624	csel x2,x12,x10,eq
0099c628	bl 0x00c30e90
0099c62c	add x8,sp,#0x158
0099c630	mov x0,x22
0099c634	bl 0x00c30e20
0099c638	add x8,sp,#0x178
0099c63c	add x8,x8,#0x8
0099c640	stp xzr,xzr,[sp, #0x180]
0099c644	str xzr,[sp, #0x3c8]
0099c648	str xzr,[sp, #0x3c0]
0099c64c	str x8,[sp, #0x178]
0099c650	str xzr,[sp, #0x3d0]
0099c654	ldr x0,[sp, #0x38]
0099c658	add x3,sp,#0x158
0099c65c	add x4,sp,#0x178
0099c660	add x5,sp,#0x3c0
0099c664	mov w1,wzr
0099c668	mov w2,w26
0099c66c	bl 0x00c33bc0
0099c670	ldrb w8,[sp, #0x3c0]
0099c674	tbz w8,#0x0,0x0099c680
0099c678	ldr x0,[sp, #0x3d0]
0099c67c	bl 0x00c301d0
0099c680	ldr x1,[sp, #0x180]
0099c684	add x0,sp,#0x178
0099c688	bl 0x00c32fc0
0099c68c	ldrb w8,[sp, #0x158]
0099c690	tbz w8,#0x0,0x0099c69c
0099c694	ldr x0,[sp, #0x168]
0099c698	bl 0x00c301d0
0099c69c	add x8,x27,#0x18
0099c6a0	str x8,[sp, #0x3e0]
0099c6a4	ldrb w8,[sp, #0x438]
0099c6a8	add x9,x27,#0x68
0099c6ac	add x10,x27,#0x40
0099c6b0	add x11,x24,#0x10
0099c6b4	str x9,[sp, #0x460]
0099c6b8	str x10,[sp, #0x3f0]
0099c6bc	str x11,[sp, #0x3f8]
0099c6c0	tbz w8,#0x0,0x0099c6cc
0099c6c4	ldr x0,[sp, #0x448]
0099c6c8	bl 0x00c301d0
0099c6cc	add x8,x23,#0x10
0099c6d0	mov x0,x20
0099c6d4	str x8,[sp, #0x3f8]
0099c6d8	bl 0x00c30090
0099c6dc	mov x0,x19
0099c6e0	bl 0x00c30ee0
0099c6e4	ldrb w8,[sp, #0x190]
0099c6e8	tbz w8,#0x0,0x0099c6f4
0099c6ec	ldr x0,[sp, #0x1a0]
0099c6f0	bl 0x00c301d0
0099c6f4	ldrb w8,[sp, #0x280]
0099c6f8	tbnz w8,#0x0,0x0099c710
0099c6fc	ldrb w8,[sp, #0x1c0]
0099c700	tbnz w8,#0x0,0x0099c720
0099c704	ldrb w8,[sp, #0x1e8]
0099c708	tbnz w8,#0x0,0x0099c730
0099c70c	b 0x0099c738
0099c710	ldr x0,[sp, #0x290]
0099c714	bl 0x00c301d0
0099c718	ldrb w8,[sp, #0x1c0]
0099c71c	tbz w8,#0x0,0x0099c704
0099c720	ldr x0,[sp, #0x1d0]
0099c724	bl 0x00c301d0
0099c728	ldrb w8,[sp, #0x1e8]
0099c72c	tbz w8,#0x0,0x0099c738
0099c730	ldr x0,[sp, #0x1f8]
0099c734	bl 0x00c301d0
0099c738	add x8,x27,#0x18
0099c73c	str x8,[sp, #0x2a0]
0099c740	ldrb w8,[sp, #0x2f8]
0099c744	add x9,x27,#0x68
0099c748	add x10,x27,#0x40
0099c74c	add x11,x24,#0x10
0099c750	str x9,[sp, #0x320]
0099c754	str x10,[sp, #0x2b0]
0099c758	str x11,[sp, #0x2b8]
0099c75c	tbz w8,#0x0,0x0099c768
0099c760	ldr x0,[sp, #0x308]
0099c764	bl 0x00c301d0
0099c768	ldr x0,[sp, #0x28]
0099c76c	add x8,x23,#0x10
0099c770	str x8,[sp, #0x2b8]
0099c774	bl 0x00c30090
0099c778	ldr x0,[sp, #0x30]
0099c77c	bl 0x00c30ee0
0099c780	ldrb w8,[sp, #0x230]
0099c784	ldr x27,[sp, #0x18]
0099c788	tbz w8,#0x0,0x0099bd94
0099c78c	ldr x0,[sp, #0x240]
0099c790	bl 0x00c301d0
0099c794	ldrb w8,[sp, #0x260]
0099c798	tbnz w8,#0x0,0x0099bd9c
0099c79c	b 0x0099bda4
0099c7a0	ldr x0,[x23, #0x8]
0099c7a4	add x8,sp,#0x158
0099c7a8	sub x1,x29,#0xa0
0099c7ac	add x19,sp,#0x158
0099c7b0	bl 0x00c33170
0099c7b4	ldr x24,[sp, #0x160]
0099c7b8	ldrb w21,[sp, #0x158]
0099c7bc	add x8,sp,#0x140
0099c7c0	add x22,x19,#0x10
0099c7c4	add x25,x8,#0x8
0099c7c8	cmp x24,x22
0099c7cc	stp xzr,xzr,[sp, #0x148]
0099c7d0	str x25,[sp, #0x140]
0099c7d4	b.eq 0x0099c8a0
0099c7d8	add x20,x24,#0x20
0099c7dc	add x0,sp,#0x140
0099c7e0	add x2,sp,#0x3c0
0099c7e4	add x3,sp,#0x110
0099c7e8	mov x1,x25
0099c7ec	mov x4,x20
0099c7f0	bl 0x00c32f90
0099c7f4	ldr x8,[x0]
0099c7f8	mov x19,x0
0099c7fc	cbnz x8,0x0099c84c
0099c800	add x8,sp,#0x3e0
0099c804	add x0,sp,#0x140
0099c808	mov x1,x20
0099c80c	bl 0x00c32fa0
0099c810	ldr x1,[sp, #0x3e0]
0099c814	ldr x8,[sp, #0x3c0]
0099c818	stp xzr,xzr,[x1]
0099c81c	str x8,[x1, #0x10]
0099c820	str x1,[x19]
0099c824	ldr x8,[sp, #0x140]
0099c828	ldr x8,[x8]
0099c82c	cbz x8,0x0099c838
0099c830	str x8,[sp, #0x140]
0099c834	ldr x1,[x19]
0099c838	ldr x0,[sp, #0x148]
0099c83c	bl 0x00c30c90
0099c840	ldr x8,[sp, #0x150]
0099c844	add x8,x8,#0x1
0099c848	str x8,[sp, #0x150]
0099c84c	ldr x8,[x24, #0x8]
0099c850	cbz x8,0x0099c864
0099c854	mov x24,x8
0099c858	ldr x8,[x8]
0099c85c	cbnz x8,0x0099c854
0099c860	b 0x0099c898
0099c864	mov x8,x24
0099c868	ldr x9,[x8, #0x10]!
0099c86c	ldr x10,[x9]
0099c870	cmp x10,x24
0099c874	b.eq 0x0099c894
0099c878	ldr x9,[x8]
0099c87c	mov x8,x9
0099c880	ldr x24,[x8, #0x10]!
0099c884	ldr x10,[x24]
0099c888	cmp x10,x9
0099c88c	b.ne 0x0099c878
0099c890	b 0x0099c898
0099c894	mov x24,x9
0099c898	cmp x24,x22
0099c89c	b.ne 0x0099c7d8
0099c8a0	cbz w21,0x0099c9f4
0099c8a4	cmp w26,#0x65
0099c8a8	b.ne 0x0099caac
0099c8ac	adrp x10,0x2d7000
0099c8b0	add x10,x10,#0x731
0099c8b4	ldr x24,[x10]
0099c8b8	ldr x21,[sp, #0x148]
0099c8bc	mov w8,#0x14
0099c8c0	mov w9,#0x6e6f
0099c8c4	str xzr,[sp, #0x3e0]
0099c8c8	str xzr,[sp, #0x3e8]
0099c8cc	str xzr,[sp, #0x3f0]
0099c8d0	strb w8,[sp, #0x3e0]
0099c8d4	sturh w9,[x28, #0x29]
0099c8d8	stur x24,[x28, #0x21]
0099c8dc	strb wzr,[sp, #0x3eb]
0099c8e0	cbz x21,0x0099c934
0099c8e4	add x8,sp,#0x140
0099c8e8	add x19,x8,#0x10
0099c8ec	mov w22,#0x8
0099c8f0	mov x20,x25
0099c8f4	add x1,x21,#0x20
0099c8f8	add x2,sp,#0x3e0
0099c8fc	mov x0,x19
0099c900	bl 0x00c331d0
0099c904	tst w0,#0x1
0099c908	csel x8,x22,xzr,ne
0099c90c	csel x20,x20,x21,ne
0099c910	ldr x21,[x21, x8#0x0]
0099c914	cbnz x21,0x0099c8f4
0099c918	cmp x20,x25
0099c91c	b.eq 0x0099c934
0099c920	add x2,x20,#0x20
0099c924	add x1,sp,#0x3e0
0099c928	mov x0,x19
0099c92c	bl 0x00c331d0
0099c930	tbz w0,#0x0,0x0099cd1c
0099c934	mov x20,x25
0099c938	ldrb w8,[sp, #0x3e0]
0099c93c	tbz w8,#0x0,0x0099cd24
0099c940	ldr x0,[sp, #0x3f0]
0099c944	bl 0x00c301d0
0099c948	cmp x20,x25
0099c94c	b.ne 0x0099cd2c
0099c950	str xzr,[sp, #0x3e8]
0099c954	str xzr,[sp, #0x3e0]
0099c958	str xzr,[sp, #0x3f0]
0099c95c	mov w0,#0x20
0099c960	bl 0x00c2fed0
0099c964	adrp x8,0x29c000
0099c968	ldr q0,[x8, #0x280]
0099c96c	adrp x8,0x2db000
0099c970	add x8,x8,#0x732
0099c974	str x0,[sp, #0x3f0]
0099c978	str q0,[x28, #0x20]
0099c97c	ldr q0,[x8]
0099c980	ldr x8,[x8, #0x10]
0099c984	add x9,sp,#0xe0
0099c988	add x9,x9,#0x8
0099c98c	strb wzr,[x0, #0x18]
0099c990	stp xzr,xzr,[sp, #0xe8]
0099c994	str xzr,[sp, #0x3c8]
0099c998	str xzr,[sp, #0x3c0]
0099c99c	str x9,[sp, #0xe0]
0099c9a0	str x8,[x0, #0x10]
0099c9a4	str q0,[x0]
0099c9a8	str xzr,[sp, #0x3d0]
0099c9ac	ldr x0,[sp, #0x38]
0099c9b0	adrp x23,0xcb4000
0099c9b4	adrp x24,0xcb4000
0099c9b8	ldr x23,[x23, #0xa08]
0099c9bc	ldr x24,[x24, #0xa00]
0099c9c0	mov w2,#0x65
0099c9c4	add x3,sp,#0x3e0
0099c9c8	add x4,sp,#0xe0
0099c9cc	add x5,sp,#0x3c0
0099c9d0	mov w1,wzr
0099c9d4	bl 0x00c33bc0
0099c9d8	ldrb w8,[sp, #0x3c0]
0099c9dc	tbz w8,#0x0,0x0099c9e8
0099c9e0	ldr x0,[sp, #0x3d0]
0099c9e4	bl 0x00c301d0
0099c9e8	ldr x1,[sp, #0xe8]
0099c9ec	add x0,sp,#0xe0
0099c9f0	b 0x0099ca94
0099c9f4	str xzr,[sp, #0x3e8]
0099c9f8	str xzr,[sp, #0x3e0]
0099c9fc	str xzr,[sp, #0x3f0]
0099ca00	adrp x24,0xcb4000
0099ca04	ldr x24,[x24, #0xa00]
0099ca08	mov w0,#0x20
0099ca0c	bl 0x00c2fed0
0099ca10	adrp x8,0x29c000
0099ca14	ldr q0,[x8, #0xb80]
0099ca18	adrp x8,0x2ab000
0099ca1c	add x8,x8,#0x960
0099ca20	str x0,[sp, #0x3f0]
0099ca24	str q0,[x28, #0x20]
0099ca28	ldur q0,[x8, #0xa]
0099ca2c	add x9,sp,#0x128
0099ca30	strb wzr,[x0, #0x1a]
0099ca34	stp xzr,xzr,[sp, #0x130]
0099ca38	stur q0,[x0, #0xa]
0099ca3c	ldr q0,[x8]
0099ca40	add x8,x9,#0x8
0099ca44	str xzr,[sp, #0x3c8]
0099ca48	str xzr,[sp, #0x3c0]
0099ca4c	str x8,[sp, #0x128]
0099ca50	str q0,[x0]
0099ca54	str xzr,[sp, #0x3d0]
0099ca58	ldr x0,[sp, #0x38]
0099ca5c	adrp x23,0xcb4000
0099ca60	ldr x23,[x23, #0xa08]
0099ca64	add x3,sp,#0x3e0
0099ca68	add x4,sp,#0x128
0099ca6c	add x5,sp,#0x3c0
0099ca70	mov w1,wzr
0099ca74	mov w2,w26
0099ca78	bl 0x00c33bc0
0099ca7c	ldrb w8,[sp, #0x3c0]
0099ca80	tbz w8,#0x0,0x0099ca8c
0099ca84	ldr x0,[sp, #0x3d0]
0099ca88	bl 0x00c301d0
0099ca8c	ldr x1,[sp, #0x130]
0099ca90	add x0,sp,#0x128
0099ca94	bl 0x00c32fc0
0099ca98	ldrb w8,[sp, #0x3e0]
0099ca9c	tbz w8,#0x0,0x0099cfd0
0099caa0	ldr x0,[sp, #0x3f0]
0099caa4	bl 0x00c301d0
0099caa8	b 0x0099cfd0
0099caac	adrp x8,0xcb4000
0099cab0	ldr x8,[x8, #0xc88]
0099cab4	add x20,sp,#0x3e0
0099cab8	movi v0.2D,#0x0
0099cabc	add x22,x27,#0x40
0099cac0	mov x9,x8
0099cac4	add x9,x9,#0x18
0099cac8	add x8,x8,#0x40
0099cacc	add x19,x20,#0x80
0099cad0	add x23,x20,#0x18
0099cad4	mov v0.D[0x0],x9
0099cad8	str x22,[sp, #0x3f0]
0099cadc	str x8,[sp, #0x460]
0099cae0	str q0,[x28, #0x20]
0099cae4	adrp x24,0xcb4000
0099cae8	ldr x24,[x24, #0xa00]
0099caec	mov x0,x19
0099caf0	mov x1,x23
0099caf4	bl 0x00c30100
0099caf8	str xzr,[sp, #0x4e8]
0099cafc	adrp x11,0xcb4000
0099cb00	ldr x11,[x11, #0xa08]
0099cb04	add x21,x20,#0x10
0099cb08	fmov d0,x22
0099cb0c	add x20,x20,#0x20
0099cb10	add x11,x11,#0x10
0099cb14	mov w8,#0xffffffff
0099cb18	add x9,x27,#0x18
0099cb1c	add x10,x27,#0x68
0099cb20	mov v0.D[0x1],x11
0099cb24	mov x0,x20
0099cb28	str w8,[sp, #0x4f0]
0099cb2c	str x9,[sp, #0x3e0]
0099cb30	str x10,[sp, #0x460]
0099cb34	str q0,[x28, #0x30]
0099cb38	bl 0x00c30480
0099cb3c	movi v0.2D,#0x0
0099cb40	add x8,x24,#0x10
0099cb44	orr w9,wzr,#0x18
0099cb48	stur q0,[x28, #0x68]
0099cb4c	stur q0,[x28, #0x58]
0099cb50	stur q0,[x28, #0x48]
0099cb54	str x8,[sp, #0x3f8]
0099cb58	stur q0,[x28, #0x88]
0099cb5c	stur q0,[x28, #0x78]
0099cb60	str w9,[sp, #0x458]
0099cb64	adrp x1,0x2ab000
0099cb68	add x1,x1,#0x9fd
0099cb6c	mov w2,#0x2f
0099cb70	mov x0,x21
0099cb74	bl 0x00c30e90
0099cb78	mov w1,w26
0099cb7c	bl 0x00c31aa0
0099cb80	adrp x1,0x2cf000
0099cb84	add x1,x1,#0x51a
0099cb88	mov w2,#0x16
0099cb8c	bl 0x00c30e90
0099cb90	ldr x12,[sp, #0x10]
0099cb94	ldrb w8,[x12]
0099cb98	ldp x10,x9,[x12, #0x8]
0099cb9c	tst w8,#0x1
0099cba0	lsr w11,w8,#0x1
0099cba4	csinc x1,x9,x12,ne
0099cba8	csel x2,x11,x10,eq
0099cbac	bl 0x00c30e90
0099cbb0	adrp x1,0x2d5000
0099cbb4	add x1,x1,#0x5df
0099cbb8	mov w2,#0x14
0099cbbc	bl 0x00c30e90
0099cbc0	ldrb w8,[sp, #0x1c0]
0099cbc4	ldp x10,x9,[sp, #0x1c8]
0099cbc8	add x11,sp,#0x1c0
0099cbcc	orr x11,x11,#0x1
0099cbd0	tst w8,#0x1
0099cbd4	lsr w12,w8,#0x1
0099cbd8	csel x1,x11,x9,eq
0099cbdc	csel x2,x12,x10,eq
0099cbe0	bl 0x00c30e90
0099cbe4	add x8,sp,#0x110
0099cbe8	mov x0,x23
0099cbec	bl 0x00c30e20
0099cbf0	ldr x22,[sp, #0x140]
0099cbf4	add x8,sp,#0xf8
0099cbf8	add x23,x8,#0x8
0099cbfc	stp xzr,xzr,[sp, #0x100]
0099cc00	cmp x22,x25
0099cc04	str x23,[sp, #0xf8]
0099cc08	b.eq 0x0099ccd4
0099cc0c	add x24,x22,#0x20
0099cc10	add x0,sp,#0xf8
0099cc14	add x2,sp,#0x60
0099cc18	add x3,sp,#0x278
0099cc1c	mov x1,x23
0099cc20	mov x4,x24
0099cc24	bl 0x00c32f90
0099cc28	ldr x8,[x0]
0099cc2c	mov x21,x0
0099cc30	cbnz x8,0x0099cc80
0099cc34	add x8,sp,#0x3c0
0099cc38	add x0,sp,#0xf8
0099cc3c	mov x1,x24
0099cc40	bl 0x00c32fa0
0099cc44	ldr x1,[sp, #0x3c0]
0099cc48	ldr x8,[sp, #0x60]
0099cc4c	stp xzr,xzr,[x1]
0099cc50	str x8,[x1, #0x10]
0099cc54	str x1,[x21]
0099cc58	ldr x8,[sp, #0xf8]
0099cc5c	ldr x8,[x8]
0099cc60	cbz x8,0x0099cc6c
0099cc64	str x8,[sp, #0xf8]
0099cc68	ldr x1,[x21]
0099cc6c	ldr x0,[sp, #0x100]
0099cc70	bl 0x00c30c90
0099cc74	ldr x8,[sp, #0x108]
0099cc78	add x8,x8,#0x1
0099cc7c	str x8,[sp, #0x108]
0099cc80	ldr x8,[x22, #0x8]
0099cc84	cbz x8,0x0099cc98
0099cc88	mov x22,x8
0099cc8c	ldr x8,[x8]
0099cc90	cbnz x8,0x0099cc88
0099cc94	b 0x0099cccc
0099cc98	mov x8,x22
0099cc9c	ldr x9,[x8, #0x10]!
0099cca0	ldr x10,[x9]
0099cca4	cmp x10,x22
0099cca8	b.eq 0x0099ccc8
0099ccac	ldr x9,[x8]
0099ccb0	mov x8,x9
0099ccb4	ldr x22,[x8, #0x10]!
0099ccb8	ldr x10,[x22]
0099ccbc	cmp x10,x9
0099ccc0	b.ne 0x0099ccac
0099ccc4	b 0x0099cccc
0099ccc8	mov x22,x9
0099cccc	cmp x22,x25
0099ccd0	b.ne 0x0099cc0c
0099ccd4	ldr x0,[sp, #0x38]
0099ccd8	ldr x5,[sp]
0099ccdc	add x3,sp,#0x110
0099cce0	add x4,sp,#0xf8
0099cce4	mov w1,wzr
0099cce8	mov w2,w26
0099ccec	bl 0x00c33bc0
0099ccf0	ldr x1,[sp, #0x100]
0099ccf4	add x0,sp,#0xf8
0099ccf8	bl 0x00c32fc0
0099ccfc	adrp x23,0xcb4000
0099cd00	adrp x24,0xcb4000
0099cd04	ldrb w8,[sp, #0x110]
0099cd08	ldr x23,[x23, #0xa08]
0099cd0c	ldr x24,[x24, #0xa00]
0099cd10	tbz w8,#0x0,0x0099cf88
0099cd14	ldr x0,[sp, #0x120]
0099cd18	b 0x0099cf84
0099cd1c	ldrb w8,[sp, #0x3e0]
0099cd20	tbnz w8,#0x0,0x0099c940
0099cd24	cmp x20,x25
0099cd28	b.eq 0x0099c950
0099cd2c	mov w8,#0x14
0099cd30	mov w9,#0x6e6f
0099cd34	add x10,sp,#0x3e0
0099cd38	str xzr,[sp, #0x3e0]
0099cd3c	str xzr,[sp, #0x3e8]
0099cd40	str xzr,[sp, #0x3f0]
0099cd44	strb w8,[sp, #0x3e0]
0099cd48	sturh w9,[x28, #0x29]
0099cd4c	stur x24,[x28, #0x21]
0099cd50	strb wzr,[sp, #0x3eb]
0099cd54	str x10,[sp, #0x3c0]
0099cd58	adrp x2,0x74a000
0099cd5c	add x2,x2,#0xba8
0099cd60	add x0,sp,#0x140
0099cd64	add x1,sp,#0x3e0
0099cd68	add x3,sp,#0x3c0
0099cd6c	add x4,sp,#0x110
0099cd70	bl 0x00c32fb0
0099cd74	mov x9,#0x7055
0099cd78	movk x9,#0x7267, LSL #16
0099cd7c	movk x9,#0x6461, LSL #32
0099cd80	add x0,x0,#0x38
0099cd84	orr w8,wzr,#0xe
0099cd88	movk x9,#0x65, LSL #48
0099cd8c	str xzr,[sp, #0x3c0]
0099cd90	str xzr,[sp, #0x3c8]
0099cd94	str xzr,[sp, #0x3d0]
0099cd98	strb w8,[sp, #0x3c0]
0099cd9c	stur x9,[x28, #0x1]
0099cda0	add x1,sp,#0x3c0
0099cda4	bl 0x00c33740
0099cda8	ldrb w8,[sp, #0x3c0]
0099cdac	mov w19,w0
0099cdb0	tbnz w8,#0x0,0x0099cff8
0099cdb4	ldrb w8,[sp, #0x3e0]
0099cdb8	tbnz w8,#0x0,0x0099d008
0099cdbc	tbz w19,#0x0,0x0099d014
0099cdc0	adrp x8,0xcb4000
0099cdc4	ldr x8,[x8, #0xc88]
0099cdc8	add x20,sp,#0x3e0
0099cdcc	movi v0.2D,#0x0
0099cdd0	add x23,x27,#0x40
0099cdd4	mov x9,x8
0099cdd8	add x9,x9,#0x18
0099cddc	add x8,x8,#0x40
0099cde0	add x19,x20,#0x80
0099cde4	add x22,x20,#0x18
0099cde8	mov v0.D[0x0],x9
0099cdec	str x23,[sp, #0x3f0]
0099cdf0	str x8,[sp, #0x460]
0099cdf4	str q0,[x28, #0x20]
0099cdf8	mov x0,x19
0099cdfc	mov x1,x22
0099ce00	bl 0x00c30100
0099ce04	str xzr,[sp, #0x4e8]
0099ce08	adrp x11,0xcb4000
0099ce0c	ldr x11,[x11, #0xa08]
0099ce10	add x21,x20,#0x10
0099ce14	fmov d0,x23
0099ce18	add x20,x20,#0x20
0099ce1c	add x11,x11,#0x10
0099ce20	mov w8,#0xffffffff
0099ce24	add x9,x27,#0x18
0099ce28	add x10,x27,#0x68
0099ce2c	mov v0.D[0x1],x11
0099ce30	mov x0,x20
0099ce34	str w8,[sp, #0x4f0]
0099ce38	str x9,[sp, #0x3e0]
0099ce3c	str x10,[sp, #0x460]
0099ce40	str q0,[x28, #0x30]
0099ce44	bl 0x00c30480
0099ce48	movi v0.2D,#0x0
0099ce4c	stur q0,[x28, #0x68]
0099ce50	stur q0,[x28, #0x58]
0099ce54	stur q0,[x28, #0x48]
0099ce58	adrp x8,0xcb4000
0099ce5c	ldr x8,[x8, #0xa00]
0099ce60	orr w9,wzr,#0x18
0099ce64	add x8,x8,#0x10
0099ce68	str x8,[sp, #0x3f8]
0099ce6c	stur q0,[x28, #0x88]
0099ce70	stur q0,[x28, #0x78]
0099ce74	str w9,[sp, #0x458]
0099ce78	adrp x1,0x2af000
0099ce7c	add x1,x1,#0x794
0099ce80	mov w2,#0x1a
0099ce84	mov x0,x21
0099ce88	bl 0x00c30e90
0099ce8c	mov x23,x0
0099ce90	mov w8,#0x14
0099ce94	mov w9,#0x6e6f
0099ce98	add x10,sp,#0x3c0
0099ce9c	str xzr,[sp, #0x3c0]
0099cea0	str xzr,[sp, #0x3c8]
0099cea4	str xzr,[sp, #0x3d0]
0099cea8	strb w8,[sp, #0x3c0]
0099ceac	sturh w9,[x28, #0x9]
0099ceb0	stur x24,[x28, #0x1]
0099ceb4	strb wzr,[sp, #0x3cb]
0099ceb8	str x10,[sp, #0x110]
0099cebc	adrp x2,0x74a000
0099cec0	add x2,x2,#0xba8
0099cec4	add x0,sp,#0x140
0099cec8	add x1,sp,#0x3c0
0099cecc	add x3,sp,#0x110
0099ced0	add x4,sp,#0x60
0099ced4	bl 0x00c32fb0
0099ced8	ldrb w8,[x0, #0x38]
0099cedc	ldp x9,x10,[x0, #0x40]
0099cee0	add x11,x0,#0x39
0099cee4	tst w8,#0x1
0099cee8	lsr w12,w8,#0x1
0099ceec	csel x1,x11,x10,eq
0099cef0	csel x2,x12,x9,eq
0099cef4	mov x0,x23
0099cef8	bl 0x00c30e90
0099cefc	adrp x24,0xcb4000
0099cf00	ldrb w8,[sp, #0x3c0]
0099cf04	ldr x24,[x24, #0xa00]
0099cf08	tbz w8,#0x0,0x0099cf14
0099cf0c	ldr x0,[sp, #0x3d0]
0099cf10	bl 0x00c301d0
0099cf14	adrp x23,0xcb4000
0099cf18	ldr x23,[x23, #0xa08]
0099cf1c	add x8,sp,#0x3c0
0099cf20	mov x0,x22
0099cf24	bl 0x00c30e20
0099cf28	add x8,sp,#0xc8
0099cf2c	add x8,x8,#0x8
0099cf30	stp xzr,xzr,[sp, #0xd0]
0099cf34	stp xzr,xzr,[sp, #0x110]
0099cf38	str x8,[sp, #0xc8]
0099cf3c	str xzr,[sp, #0x120]
0099cf40	ldr x0,[sp, #0x38]
0099cf44	mov w2,#0x65
0099cf48	add x3,sp,#0x3c0
0099cf4c	add x4,sp,#0xc8
0099cf50	add x5,sp,#0x110
0099cf54	mov w1,wzr
0099cf58	bl 0x00c33bc0
0099cf5c	ldrb w8,[sp, #0x110]
0099cf60	tbz w8,#0x0,0x0099cf6c
0099cf64	ldr x0,[sp, #0x120]
0099cf68	bl 0x00c301d0
0099cf6c	ldr x1,[sp, #0xd0]
0099cf70	add x0,sp,#0xc8
0099cf74	bl 0x00c32fc0
0099cf78	ldrb w8,[sp, #0x3c0]
0099cf7c	tbz w8,#0x0,0x0099cf88
0099cf80	ldr x0,[sp, #0x3d0]
0099cf84	bl 0x00c301d0
0099cf88	add x8,x27,#0x18
0099cf8c	str x8,[sp, #0x3e0]
0099cf90	ldrb w8,[sp, #0x438]
0099cf94	add x9,x27,#0x68
0099cf98	add x10,x27,#0x40
0099cf9c	add x11,x24,#0x10
0099cfa0	str x9,[sp, #0x460]
0099cfa4	str x10,[sp, #0x3f0]
0099cfa8	str x11,[sp, #0x3f8]
0099cfac	tbz w8,#0x0,0x0099cfb8
0099cfb0	ldr x0,[sp, #0x448]
0099cfb4	bl 0x00c301d0
0099cfb8	add x8,x23,#0x10
0099cfbc	mov x0,x20
0099cfc0	str x8,[sp, #0x3f8]
0099cfc4	bl 0x00c30090
0099cfc8	mov x0,x19
0099cfcc	bl 0x00c30ee0
0099cfd0	ldr x1,[sp, #0x148]
0099cfd4	add x0,sp,#0x140
0099cfd8	bl 0x00c32fc0
0099cfdc	ldr x1,[sp, #0x168]
0099cfe0	add x8,sp,#0x158
0099cfe4	add x0,x8,#0x8
0099cfe8	bl 0x00c32fc0
0099cfec	ldrb w8,[sp, #0x190]
0099cff0	tbnz w8,#0x0,0x0099c6ec
0099cff4	b 0x0099c6f4
0099cff8	ldr x0,[sp, #0x3d0]
0099cffc	bl 0x00c301d0
0099d000	ldrb w8,[sp, #0x3e0]
0099d004	tbz w8,#0x0,0x0099cdbc
0099d008	ldr x0,[sp, #0x3f0]
0099d00c	bl 0x00c301d0
0099d010	tbnz w19,#0x0,0x0099cdc0
0099d014	str xzr,[sp, #0x3e8]
0099d018	str xzr,[sp, #0x3e0]
0099d01c	stur xzr,[x28, #0x35]
0099d020	str xzr,[sp, #0x3f0]
0099d024	add x0,sp,#0x230
0099d028	add x1,sp,#0x3e0
0099d02c	bl 0x00c33b60
0099d030	add x0,sp,#0x3e0
0099d034	str xzr,[sp, #0x3c8]
0099d038	str xzr,[sp, #0x3c0]
0099d03c	str xzr,[sp, #0x3d0]
0099d040	bl 0x00c2ff50
0099d044	adrp x24,0xcb4000
0099d048	ldr x24,[x24, #0xa00]
0099d04c	mov x19,x0
0099d050	cmn x0,#0x10
0099d054	b.cs 0x0099d6bc
0099d058	cmp x19,#0x17
0099d05c	b.cs 0x0099d07c
0099d060	add x9,sp,#0x3c0
0099d064	lsl w8,w19,#0x1
0099d068	orr x20,x9,#0x1
0099d06c	add x21,sp,#0x110
0099d070	strb w8,[sp, #0x3c0]
0099d074	cbnz x19,0x0099d0a4
0099d078	b 0x0099d0b4
0099d07c	add x8,x19,#0x10
0099d080	and x21,x8,#-0x10
0099d084	mov x0,x21
0099d088	bl 0x00c2fed0
0099d08c	orr x8,x21,#0x1
0099d090	mov x20,x0
0099d094	str x0,[sp, #0x3d0]
0099d098	str x8,[sp, #0x3c0]
0099d09c	str x19,[sp, #0x3c8]
0099d0a0	add x21,sp,#0x110
0099d0a4	add x1,sp,#0x3e0
0099d0a8	mov x0,x20
0099d0ac	mov x2,x19
0099d0b0	bl 0x00c2ffd0
0099d0b4	adrp x10,0x2db000
0099d0b8	add x10,x10,#0x74b
0099d0bc	ldr q0,[x10]
0099d0c0	mov w9,#0x6563
0099d0c4	mov w8,#0x28
0099d0c8	movk w9,#0x7470, LSL #16
0099d0cc	add x10,sp,#0x110
0099d0d0	strb wzr,[x20, x19]
0099d0d4	stp xzr,xzr,[sp, #0x110]
0099d0d8	str xzr,[sp, #0x120]
0099d0dc	strb w8,[sp, #0x110]
0099d0e0	stur w9,[x21, #0x11]
0099d0e4	stur q0,[x21, #0x1]
0099d0e8	strb wzr,[sp, #0x125]
0099d0ec	str x10,[sp, #0x60]
0099d0f0	adrp x2,0x74a000
0099d0f4	add x2,x2,#0xba8
0099d0f8	add x0,sp,#0x140
0099d0fc	add x1,sp,#0x110
0099d100	add x3,sp,#0x60
0099d104	add x4,sp,#0x278
0099d108	bl 0x00c32fb0
0099d10c	mov x9,x0
0099d110	ldrb w11,[x9, #0x38]!
0099d114	ldrb w8,[sp, #0x3c0]
0099d118	ldr x12,[sp, #0x3c8]
0099d11c	ldr x13,[x0, #0x40]
0099d120	lsr w14,w11,#0x1
0099d124	lsr w10,w8,#0x1
0099d128	tst w8,#0x1
0099d12c	csel x2,x10,x12,eq
0099d130	tst w11,#0x1
0099d134	csel x12,x14,x13,eq
0099d138	cmp x2,x12
0099d13c	and w19,w8,#0x1
0099d140	b.ne 0x0099d198
0099d144	ldr x12,[sp, #0x3d0]
0099d148	ldr x13,[x0, #0x48]
0099d14c	add x8,sp,#0x3c0
0099d150	cmp w19,#0x0
0099d154	orr x8,x8,#0x1
0099d158	csel x0,x8,x12,eq
0099d15c	tst w11,#0x1
0099d160	csinc x1,x13,x9,ne
0099d164	cbnz w19,0x0099d340
0099d168	cbz x2,0x0099d190
0099d16c	neg x9,x10
0099d170	ldrb w10,[x8]
0099d174	ldrb w11,[x1]
0099d178	cmp w10,w11
0099d17c	b.ne 0x0099d3cc
0099d180	add x8,x8,#0x1
0099d184	adds x9,x9,#0x1
0099d188	add x1,x1,#0x1
0099d18c	b.ne 0x0099d170
0099d190	mov w20,wzr
0099d194	b 0x0099d3d0
0099d198	mov w20,#0x1
0099d19c	ldrb w8,[sp, #0x110]
0099d1a0	tbz w8,#0x0,0x0099d1b4
0099d1a4	ldr x0,[sp, #0x120]
0099d1a8	bl 0x00c301d0
0099d1ac	ldrb w8,[sp, #0x3c0]
0099d1b0	and w19,w8,#0x1
0099d1b4	cbz w19,0x0099d1c0
0099d1b8	ldr x0,[sp, #0x3d0]
0099d1bc	bl 0x00c301d0
0099d1c0	cbz w20,0x0099d270
0099d1c4	str xzr,[sp, #0x3c8]
0099d1c8	str xzr,[sp, #0x3c0]
0099d1cc	str xzr,[sp, #0x3d0]
0099d1d0	orr w0,wzr,#0x30
0099d1d4	bl 0x00c2fed0
0099d1d8	adrp x8,0x29c000
0099d1dc	ldr q0,[x8, #0x420]
0099d1e0	adrp x8,0x2af000
0099d1e4	add x8,x8,#0x7af
0099d1e8	ldp q2,q1,[x8]
0099d1ec	mov w8,#0x6575
0099d1f0	add x9,sp,#0xb0
0099d1f4	strh w8,[x0, #0x20]
0099d1f8	add x8,x9,#0x8
0099d1fc	str x0,[sp, #0x3d0]
0099d200	str q0,[x28]
0099d204	stp q2,q1,[x0]
0099d208	strb wzr,[x0, #0x22]
0099d20c	stp xzr,xzr,[sp, #0xb8]
0099d210	stp xzr,xzr,[sp, #0x110]
0099d214	str x8,[sp, #0xb0]
0099d218	str xzr,[sp, #0x120]
0099d21c	ldr x0,[sp, #0x38]
0099d220	adrp x23,0xcb4000
0099d224	ldr x23,[x23, #0xa08]
0099d228	mov w2,#0x65
0099d22c	add x3,sp,#0x3c0
0099d230	add x4,sp,#0xb0
0099d234	add x5,sp,#0x110
0099d238	mov w1,wzr
0099d23c	bl 0x00c33bc0
0099d240	ldrb w8,[sp, #0x110]
0099d244	tbz w8,#0x0,0x0099d250
0099d248	ldr x0,[sp, #0x120]
0099d24c	bl 0x00c301d0
0099d250	ldr x1,[sp, #0xb8]
0099d254	add x0,sp,#0xb0
0099d258	bl 0x00c32fc0
0099d25c	ldrb w8,[sp, #0x3c0]
0099d260	tbz w8,#0x0,0x0099cfd0
0099d264	ldr x0,[sp, #0x3d0]
0099d268	bl 0x00c301d0
0099d26c	b 0x0099cfd0
0099d270	ldr x8,[x23, #0x20]
0099d274	ldarb w8,[x8]
0099d278	tbz w8,#0x0,0x0099d568
0099d27c	add x26,sp,#0x3c0
0099d280	stp xzr,xzr,[sp, #0x110]
0099d284	str xzr,[sp, #0x120]
0099d288	mov w0,#0x20
0099d28c	bl 0x00c2fed0
0099d290	adrp x9,0x2bf000
0099d294	adrp x8,0x29c000
0099d298	add x9,x9,#0x584
0099d29c	ldr q0,[x8, #0x280]
0099d2a0	ldr x8,[x9, #0x10]
0099d2a4	ldr q1,[x9]
0099d2a8	add x9,sp,#0x110
0099d2ac	add x22,sp,#0x110
0099d2b0	str x0,[sp, #0x120]
0099d2b4	strb wzr,[x0, #0x18]
0099d2b8	str q0,[x21]
0099d2bc	str x8,[x0, #0x10]
0099d2c0	str q1,[x0]
0099d2c4	str x9,[sp, #0x60]
0099d2c8	adrp x2,0x74a000
0099d2cc	add x2,x2,#0xba8
0099d2d0	add x0,sp,#0x140
0099d2d4	add x1,sp,#0x110
0099d2d8	add x3,sp,#0x60
0099d2dc	add x4,sp,#0x278
0099d2e0	bl 0x00c32fb0
0099d2e4	str xzr,[sp, #0x3d0]
0099d2e8	str xzr,[sp, #0x3c8]
0099d2ec	str xzr,[sp, #0x3c0]
0099d2f0	mov x8,x0
0099d2f4	ldrb w9,[x8, #0x38]!
0099d2f8	tbnz w9,#0x0,0x0099d35c
0099d2fc	ldr x9,[x8, #0x10]
0099d300	str x9,[sp, #0x3d0]
0099d304	ldr q0,[x8]
0099d308	str q0,[x26]
0099d30c	ldrb w8,[sp, #0x110]
0099d310	tbz w8,#0x0,0x0099d31c
0099d314	ldr x0,[sp, #0x120]
0099d318	bl 0x00c301d0
0099d31c	ldrb w8,[sp, #0x3c0]
0099d320	stp xzr,xzr,[sp, #0x90]
0099d324	str xzr,[sp, #0xa0]
0099d328	tbnz w8,#0x0,0x0099d38c
0099d32c	ldr x8,[sp, #0x3d0]
0099d330	ldr q0,[x26]
0099d334	str x8,[sp, #0xa0]
0099d338	str q0,[sp, #0x90]
0099d33c	b 0x0099d46c
0099d340	cbz x2,0x0099d3bc
0099d344	bl 0x00c300b0
0099d348	cmp w0,#0x0
0099d34c	cset w20,ne
0099d350	ldrb w8,[sp, #0x110]
0099d354	tbnz w8,#0x0,0x0099d1a4
0099d358	b 0x0099d1b4
0099d35c	ldr x19,[x0, #0x40]
0099d360	cmn x19,#0x10
0099d364	b.cs 0x0099d6c4
0099d368	ldr x20,[x0, #0x48]
0099d36c	cmp x19,#0x17
0099d370	b.cs 0x0099d3f4
0099d374	add x9,sp,#0x3c0
0099d378	lsl w8,w19,#0x1
0099d37c	orr x21,x9,#0x1
0099d380	strb w8,[sp, #0x3c0]
0099d384	cbnz x19,0x0099d418
0099d388	b 0x0099d428
0099d38c	ldr x19,[sp, #0x3c8]
0099d390	cmn x19,#0x10
0099d394	b.cs 0x0099d6cc
0099d398	ldr x20,[sp, #0x3d0]
0099d39c	cmp x19,#0x17
0099d3a0	b.cs 0x0099d438
0099d3a4	add x9,sp,#0x90
0099d3a8	lsl w8,w19,#0x1
0099d3ac	orr x21,x9,#0x1
0099d3b0	strb w8,[sp, #0x90]
0099d3b4	cbnz x19,0x0099d458
0099d3b8	b 0x0099d468
0099d3bc	mov w20,wzr
0099d3c0	ldrb w8,[sp, #0x110]
0099d3c4	tbnz w8,#0x0,0x0099d1a4
0099d3c8	b 0x0099d1b4
0099d3cc	mov w20,#0x1
0099d3d0	adrp x27,0xcb4000
0099d3d4	adrp x24,0xcb4000
0099d3d8	ldr x27,[x27, #0xc90]
0099d3dc	ldr x24,[x24, #0xa00]
0099d3e0	add x21,sp,#0x110
0099d3e4	add x28,sp,#0x3c0
0099d3e8	ldrb w8,[sp, #0x110]
0099d3ec	tbz w8,#0x0,0x0099d1b4
0099d3f0	b 0x0099d1a4
0099d3f4	add x8,x19,#0x10
0099d3f8	and x24,x8,#-0x10
0099d3fc	mov x0,x24
0099d400	bl 0x00c2fed0
0099d404	orr x8,x24,#0x1
0099d408	mov x21,x0
0099d40c	str x0,[sp, #0x3d0]
0099d410	str x8,[sp, #0x3c0]
0099d414	str x19,[sp, #0x3c8]
0099d418	mov x0,x21
0099d41c	mov x1,x20
0099d420	mov x2,x19
0099d424	bl 0x00c2ffd0
0099d428	strb wzr,[x21, x19]
0099d42c	ldrb w8,[sp, #0x110]
0099d430	tbz w8,#0x0,0x0099d31c
0099d434	b 0x0099d314
0099d438	add x8,x19,#0x10
0099d43c	and x24,x8,#-0x10
0099d440	mov x0,x24
0099d444	bl 0x00c2fed0
0099d448	orr x8,x24,#0x1
0099d44c	mov x21,x0
0099d450	stp x19,x0,[sp, #0x98]
0099d454	str x8,[sp, #0x90]
0099d458	mov x0,x21
0099d45c	mov x1,x20
0099d460	mov x2,x19
0099d464	bl 0x00c2ffd0
0099d468	strb wzr,[x21, x19]
0099d46c	add x0,sp,#0x278
0099d470	add x1,sp,#0x90
0099d474	bl 0x00c33d70
0099d478	ldrb w8,[sp, #0x90]
0099d47c	tbz w8,#0x0,0x0099d488
0099d480	ldr x0,[sp, #0xa0]
0099d484	bl 0x00c301d0
0099d488	add x0,sp,#0x278
0099d48c	bl 0x00c33db0
0099d490	tbz w0,#0x0,0x0099d550
0099d494	ldr x8,[x23, #0x10]
0099d498	ldr x0,[x8]
0099d49c	add x1,sp,#0x278
0099d4a0	bl 0x00c33c20
0099d4a4	tbnz w0,#0x0,0x0099d558
0099d4a8	stp xzr,xzr,[sp, #0x110]
0099d4ac	str xzr,[sp, #0x120]
0099d4b0	orr w0,wzr,#0x30
0099d4b4	bl 0x00c2fed0
0099d4b8	adrp x8,0x29c000
0099d4bc	ldr q0,[x8, #0x1e0]
0099d4c0	adrp x8,0x2d3000
0099d4c4	add x8,x8,#0x3f5
0099d4c8	ldur q1,[x8, #0x1f]
0099d4cc	ldp q2,q3,[x8]
0099d4d0	add x8,sp,#0x78
0099d4d4	add x8,x8,#0x8
0099d4d8	str x0,[sp, #0x120]
0099d4dc	str q0,[x22]
0099d4e0	stur q1,[x0, #0x1f]
0099d4e4	stp q2,q3,[x0]
0099d4e8	strb wzr,[x0, #0x2f]
0099d4ec	stp xzr,xzr,[sp, #0x80]
0099d4f0	stp xzr,xzr,[sp, #0x60]
0099d4f4	stp xzr,x8,[sp, #0x70]
0099d4f8	ldr x0,[sp, #0x38]
0099d4fc	add x3,sp,#0x110
0099d500	add x4,sp,#0x78
0099d504	add x5,sp,#0x60
0099d508	mov w1,wzr
0099d50c	mov w2,wzr
0099d510	bl 0x00c33bc0
0099d514	ldrb w8,[sp, #0x60]
0099d518	tbz w8,#0x0,0x0099d524
0099d51c	ldr x0,[sp, #0x70]
0099d520	bl 0x00c301d0
0099d524	ldr x1,[sp, #0x80]
0099d528	add x0,sp,#0x78
0099d52c	bl 0x00c32fc0
0099d530	ldrb w8,[sp, #0x110]
0099d534	tbz w8,#0x0,0x0099d540
0099d538	ldr x0,[sp, #0x120]
0099d53c	bl 0x00c301d0
0099d540	ldrb w8,[sp, #0x3c0]
0099d544	tbz w8,#0x0,0x0099d68c
0099d548	ldr x0,[sp, #0x3d0]
0099d54c	b 0x0099d688
0099d550	ldr x8,[x23, #0x20]
0099d554	stlrb wzr,[x8]
0099d558	ldrb w8,[sp, #0x3c0]
0099d55c	tbz w8,#0x0,0x0099d568
0099d560	ldr x0,[sp, #0x3d0]
0099d564	bl 0x00c301d0
0099d568	ldr x22,[sp, #0x140]
0099d56c	add x8,sp,#0x48
0099d570	add x19,x8,#0x8
0099d574	stp xzr,xzr,[sp, #0x110]
0099d578	cmp x22,x25
0099d57c	str xzr,[sp, #0x120]
0099d580	stp xzr,xzr,[sp, #0x50]
0099d584	str x19,[sp, #0x48]
0099d588	b.eq 0x0099d654
0099d58c	add x21,x22,#0x20
0099d590	add x0,sp,#0x48
0099d594	add x2,sp,#0x60
0099d598	add x3,sp,#0x278
0099d59c	mov x1,x19
0099d5a0	mov x4,x21
0099d5a4	bl 0x00c32f90
0099d5a8	ldr x8,[x0]
0099d5ac	mov x20,x0
0099d5b0	cbnz x8,0x0099d600
0099d5b4	add x8,sp,#0x3c0
0099d5b8	add x0,sp,#0x48
0099d5bc	mov x1,x21
0099d5c0	bl 0x00c32fa0
0099d5c4	ldr x1,[sp, #0x3c0]
0099d5c8	ldr x8,[sp, #0x60]
0099d5cc	stp xzr,xzr,[x1]
0099d5d0	str x8,[x1, #0x10]
0099d5d4	str x1,[x20]
0099d5d8	ldr x8,[sp, #0x48]
0099d5dc	ldr x8,[x8]
0099d5e0	cbz x8,0x0099d5ec
0099d5e4	str x8,[sp, #0x48]
0099d5e8	ldr x1,[x20]
0099d5ec	ldr x0,[sp, #0x50]
0099d5f0	bl 0x00c30c90
0099d5f4	ldr x8,[sp, #0x58]
0099d5f8	add x8,x8,#0x1
0099d5fc	str x8,[sp, #0x58]
0099d600	ldr x8,[x22, #0x8]
0099d604	cbz x8,0x0099d618
0099d608	mov x22,x8
0099d60c	ldr x8,[x8]
0099d610	cbnz x8,0x0099d608
0099d614	b 0x0099d64c
0099d618	mov x8,x22
0099d61c	ldr x9,[x8, #0x10]!
0099d620	ldr x10,[x9]
0099d624	cmp x10,x22
0099d628	b.eq 0x0099d648
0099d62c	ldr x9,[x8]
0099d630	mov x8,x9
0099d634	ldr x22,[x8, #0x10]!
0099d638	ldr x10,[x22]
0099d63c	cmp x10,x9
0099d640	b.ne 0x0099d62c
0099d644	b 0x0099d64c
0099d648	mov x22,x9
0099d64c	cmp x22,x25
0099d650	b.ne 0x0099d58c
0099d654	ldr x0,[sp, #0x38]
0099d658	ldr x5,[sp]
0099d65c	mov w1,#0x1
0099d660	mov w2,#0x65
0099d664	add x3,sp,#0x110
0099d668	add x4,sp,#0x48
0099d66c	bl 0x00c33bc0
0099d670	ldr x1,[sp, #0x50]
0099d674	add x0,sp,#0x48
0099d678	bl 0x00c32fc0
0099d67c	ldrb w8,[sp, #0x110]
0099d680	tbz w8,#0x0,0x0099d68c
0099d684	ldr x0,[sp, #0x120]
0099d688	bl 0x00c301d0
0099d68c	adrp x27,0xcb4000
0099d690	adrp x23,0xcb4000
0099d694	adrp x24,0xcb4000
0099d698	ldr x27,[x27, #0xc90]
0099d69c	ldr x23,[x23, #0xa08]
0099d6a0	ldr x24,[x24, #0xa00]
0099d6a4	b 0x0099cfd0
0099d6a8	bl 0x00c2fec0
0099d6ac	add x0,sp,#0x1c0
0099d6b0	bl 0x00c30ce0
0099d6b4	add x0,sp,#0x190
0099d6b8	bl 0x00c30ce0
0099d6bc	add x0,sp,#0x3c0
0099d6c0	bl 0x00c30ce0
0099d6c4	add x0,sp,#0x3c0
0099d6c8	bl 0x00c30ce0
0099d6cc	add x0,sp,#0x90
0099d6d0	bl 0x00c30ce0
