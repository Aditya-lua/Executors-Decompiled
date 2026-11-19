; mbedtls_des_crypt_ecb @ 00b750dc
00b750dc	str x25,[sp, #-0x40]!
00b750e0	stp x24,x23,[sp, #0x10]
00b750e4	stp x22,x21,[sp, #0x20]
00b750e8	stp x20,x19,[sp, #0x30]
00b750ec	ldp w3,w4,[x1]
00b750f0	adrp x13,0x77e000
00b750f4	adrp x14,0x77e000
00b750f8	adrp x15,0x77e000
00b750fc	rev w3,w3
00b75100	rev w4,w4
00b75104	eor w5,w4,w3, LSR #0x4
00b75108	and w5,w5,#0xf0f0f0f
00b7510c	eor w4,w5,w4
00b75110	eor w3,w3,w5, LSL #0x4
00b75114	and w5,w4,#0xffff
00b75118	eor w5,w5,w3, LSR #0x10
00b7511c	eor w4,w5,w4
00b75120	eor w3,w3,w5, LSL #0x10
00b75124	eor w5,w3,w4, LSR #0x2
00b75128	and w5,w5,#0x33333333
00b7512c	eor w3,w5,w3
00b75130	eor w4,w4,w5, LSL #0x2
00b75134	eor w5,w3,w4, LSR #0x8
00b75138	and w5,w5,#0xff00ff
00b7513c	eor w3,w5,w3
00b75140	eor w4,w4,w5, LSL #0x8
00b75144	eor w5,w3,w4, LSL #0x1
00b75148	and w5,w5,#0xaaaaaaaa
00b7514c	eor w3,w5,w3
00b75150	adrp x16,0x77e000
00b75154	adrp x17,0x77e000
00b75158	adrp x18,0x77e000
00b7515c	adrp x1,0x77e000
00b75160	eor w4,w5,w4, ROR #0x1f
00b75164	ror w5,w3,#0x1f
00b75168	adrp x3,0x77f000
00b7516c	mov x12,xzr
00b75170	orr w10,wzr,#0xaaaaaaaa
00b75174	orr w9,wzr,#0x33333333
00b75178	orr w8,wzr,#0xf0f0f0f
00b7517c	orr w11,wzr,#0xff00ff
00b75180	add x13,x13,#0x940
00b75184	add x14,x14,#0xa40
00b75188	add x15,x15,#0xb40
00b7518c	add x16,x16,#0xc40
00b75190	add x17,x17,#0xd40
00b75194	add x18,x18,#0xe40
00b75198	add x1,x1,#0xf40
00b7519c	add x3,x3,#0x40
00b751a0	add x6,x0,x12
00b751a4	ldp w7,w19,[x6]
00b751a8	ldp w20,w6,[x6, #0x8]
00b751ac	add x12,x12,#0x10
00b751b0	cmp w12,#0x80
00b751b4	eor w7,w7,w4
00b751b8	and w21,w7,#0x3f
00b751bc	ubfx w22,w7,#0x8,#0x6
00b751c0	ldr w21,[x13, w21, UXTW #0x2]
00b751c4	ubfx w23,w7,#0x10,#0x6
00b751c8	ldr w22,[x14, w22, UXTW #0x2]
00b751cc	eor w19,w19,w4, ROR #0x4
00b751d0	ubfx w7,w7,#0x18,#0x6
00b751d4	ldr w23,[x15, w23, UXTW #0x2]
00b751d8	and w24,w19,#0x3f
00b751dc	ldr w7,[x16, w7, UXTW #0x2]
00b751e0	ubfx w25,w19,#0x8,#0x6
00b751e4	eor w5,w21,w5
00b751e8	ldr w24,[x17, w24, UXTW #0x2]
00b751ec	ubfx w21,w19,#0x10,#0x6
00b751f0	ldr w25,[x18, w25, UXTW #0x2]
00b751f4	eor w5,w5,w22
00b751f8	ubfx w19,w19,#0x18,#0x6
00b751fc	ldr w21,[x1, w21, UXTW #0x2]
00b75200	eor w5,w5,w23
00b75204	ldr w19,[x3, w19, UXTW #0x2]
00b75208	eor w5,w5,w7
00b7520c	eor w5,w5,w24
00b75210	eor w5,w5,w25
00b75214	eor w5,w5,w21
00b75218	eor w5,w5,w19
00b7521c	eor w7,w20,w5
00b75220	and w19,w7,#0x3f
00b75224	ubfx w20,w7,#0x8,#0x6
00b75228	ldr w19,[x13, w19, UXTW #0x2]
00b7522c	ubfx w21,w7,#0x10,#0x6
00b75230	ldr w20,[x14, w20, UXTW #0x2]
00b75234	eor w6,w6,w5, ROR #0x4
00b75238	ubfx w7,w7,#0x18,#0x6
00b7523c	ldr w21,[x15, w21, UXTW #0x2]
00b75240	and w22,w6,#0x3f
00b75244	ldr w7,[x16, w7, UXTW #0x2]
00b75248	ubfx w23,w6,#0x8,#0x6
00b7524c	ldr w22,[x17, w22, UXTW #0x2]
00b75250	eor w4,w19,w4
00b75254	ubfx w24,w6,#0x10,#0x6
00b75258	ldr w23,[x18, w23, UXTW #0x2]
00b7525c	eor w4,w4,w20
00b75260	ubfx w6,w6,#0x18,#0x6
00b75264	ldr w24,[x1, w24, UXTW #0x2]
00b75268	eor w4,w4,w21
00b7526c	ldr w6,[x3, w6, UXTW #0x2]
00b75270	eor w4,w4,w7
00b75274	eor w4,w4,w22
00b75278	eor w4,w4,w23
00b7527c	eor w4,w4,w24
00b75280	eor w4,w4,w6
00b75284	b.ne 0x00b751a0
00b75288	ror w12,w4,#0x1
00b7528c	eor w13,w12,w5
00b75290	and w10,w13,w10
00b75294	eor w12,w10,w12
00b75298	eor w10,w10,w5
00b7529c	extr w10,w5,w10,#0x1
00b752a0	eor w13,w12,w10, LSR #0x8
00b752a4	and w11,w13,w11
00b752a8	eor w12,w11,w12
00b752ac	eor w10,w10,w11, LSL #0x8
00b752b0	eor w11,w12,w10, LSR #0x2
00b752b4	and w9,w11,w9
00b752b8	eor w11,w9,w12
00b752bc	eor w9,w10,w9, LSL #0x2
00b752c0	and w10,w9,#0xffff
00b752c4	eor w10,w10,w11, LSR #0x10
00b752c8	eor w9,w10,w9
00b752cc	eor w10,w11,w10, LSL #0x10
00b752d0	eor w11,w9,w10, LSR #0x4
00b752d4	and w8,w11,w8
00b752d8	eor w9,w8,w9
00b752dc	eor w8,w10,w8, LSL #0x4
00b752e0	rev w8,w8
00b752e4	rev w9,w9
00b752e8	stp w8,w9,[x2]
00b752ec	ldp x20,x19,[sp, #0x30]
00b752f0	ldp x22,x21,[sp, #0x20]
00b752f4	ldp x24,x23,[sp, #0x10]
00b752f8	mov w0,wzr
00b752fc	ldr x25,[sp], #0x40
00b75300	ret
