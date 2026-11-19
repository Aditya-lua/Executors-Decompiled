; FUN_008de870 @ 008de870
008de870	stp x29,x30,[sp, #-0x60]!
008de874	stp x28,x27,[sp, #0x10]
008de878	stp x26,x25,[sp, #0x20]
008de87c	stp x24,x23,[sp, #0x30]
008de880	stp x22,x21,[sp, #0x40]
008de884	stp x20,x19,[sp, #0x50]
008de888	mov x29,sp
008de88c	sub sp,sp,#0xa30
008de890	mrs x12,tpidr_el0
008de894	mov x19,x0
008de898	add x20,x0,#0x858
008de89c	ldr x8,[x12, #0x28]
008de8a0	stur x8,[x29, #-0x10]
008de8a4	ldr x9,[x0, #0x860]
008de8a8	ldr x8,[x0, #0x858]
008de8ac	str x12,[sp]
008de8b0	sub x10,x9,x8
008de8b4	asr x9,x10,#0x4
008de8b8	lsr x11,x9,#0xe
008de8bc	cbnz x11,0x008de8d4
008de8c0	mov w8,#0x4000
008de8c4	mov x0,x20
008de8c8	sub x1,x8,x9
008de8cc	bl 0x008dfd24
008de8d0	b 0x008de8e4
008de8d4	cmp x10,#0x40, LSL #12
008de8d8	b.eq 0x008de8e4
008de8dc	add x8,x8,#0x40, LSL #12
008de8e0	str x8,[x19, #0x860]
008de8e4	add x9,x19,#0x58
008de8e8	add x8,x19,#0x60
008de8ec	mov x21,xzr
008de8f0	stp x8,x9,[sp, #0x8]
008de8f4	mov w8,#0x8
008de8f8	str x8,[sp, #0x20]
008de8fc	mov w8,#0x8
008de900	str x8,[sp, #0x18]
008de904	b 0x008de928
008de908	ldr x8,[sp, #0x18]
008de90c	add x21,x21,#0x1
008de910	cmp x21,#0x80
008de914	add x9,x8,#0x10
008de918	ldr x8,[sp, #0x20]
008de91c	add x8,x8,#0x800
008de920	stp x9,x8,[sp, #0x18]
008de924	b.eq 0x008dea54
008de928	and w22,w21,#0x7
008de92c	mov w8,#0x1
008de930	lsr w24,w21,#0x3
008de934	lsl w25,w8,w22
008de938	ldr x9,[x19, #0x10]
008de93c	ldr x10,[x19, #0x28]
008de940	mov w8,w25
008de944	bfm w8,w24,#0x18,#0x16
008de948	ubfiz x8,x8,#0x4,#0x20
008de94c	add x9,x9,x8
008de950	add x8,x10,x8
008de954	ldp x0,x1,[x9]
008de958	ldp x2,x3,[x8]
008de95c	bl 0x008dd964
008de960	ldr x8,[sp, #0x10]
008de964	add x27,x8,x21, LSL #0x4
008de968	stp x0,x1,[x27]
008de96c	cbz x21,0x008de908
008de970	lsl w8,w24,#0x8
008de974	mov w9,#0x1fffff
008de978	ldr x26,[sp, #0x8]
008de97c	add w9,w24,w9
008de980	mov x23,xzr
008de984	str w9,[sp, #0x40]
008de988	lsl w9,w22,#0x8
008de98c	orr w28,w8,w25
008de990	ldp x25,x22,[sp, #0x18]
008de994	str w9,[sp, #0x30]
008de998	b 0x008dea04
008de99c	ldr w10,[sp, #0x40]
008de9a0	madd w9,w8,w8,w8
008de9a4	sub w10,w10,w8
008de9a8	add w8,w10,w8, LSL #0x4
008de9ac	ldr w10,[sp, #0x30]
008de9b0	sub w8,w8,w9, LSR #0x1
008de9b4	and w9,w23,#0x7
008de9b8	orr w8,w10,w8, LSL #0xb
008de9bc	mov w10,#0x1
008de9c0	lsl w9,w10,w9
008de9c4	orr w8,w8,w9
008de9c8	ldr x9,[x19, #0x40]
008de9cc	eor w8,w8,#0x700
008de9d0	add x8,x9,w8, SXTW  #0x4
008de9d4	ldp x0,x1,[x8]
008de9d8	ldr x8,[x20]
008de9dc	add x23,x23,#0x1
008de9e0	add x26,x26,#0x10
008de9e4	cmp x21,x23
008de9e8	add x9,x8,x22
008de9ec	add x8,x8,x25
008de9f0	add x25,x25,#0x800
008de9f4	add x22,x22,#0x10
008de9f8	stp x0,x1,[x9, #-0x8]
008de9fc	stp x0,x1,[x8, #-0x8]
008dea00	b.eq 0x008de908
008dea04	lsr w8,w23,#0x3
008dea08	cmp w24,w8
008dea0c	b.ne 0x008de99c
008dea10	and w8,w23,#0x7
008dea14	mov w9,#0x1
008dea18	ldr x10,[x19, #0x28]
008dea1c	lsl w8,w9,w8
008dea20	ldr x9,[x19, #0x10]
008dea24	orr w8,w8,w28
008dea28	ubfiz x8,x8,#0x4,#0x20
008dea2c	add x9,x9,x8
008dea30	add x8,x10,x8
008dea34	ldp x0,x1,[x9]
008dea38	ldp x2,x3,[x8]
008dea3c	bl 0x008dd964
008dea40	ldp x2,x3,[x27]
008dea44	bl 0x008dd964
008dea48	ldp x2,x3,[x26, #-0x8]
008dea4c	bl 0x008dd964
008dea50	b 0x008de9d8
008dea54	mov x10,#0x7f2d
008dea58	mov w8,#0xa17e
008dea5c	mov w9,#0x1
008dea60	movk x10,#0x4c95, LSL #16
008dea64	add x11,sp,#0x58
008dea68	str x8,[sp, #0x58]
008dea6c	movk x10,#0xf42d, LSL #32
008dea70	movk x10,#0x5851, LSL #48
008dea74	eor x8,x8,x8, LSR #0x3e
008dea78	madd x8,x8,x10,x9
008dea7c	str x8,[x11, x9, LSL #0x3]
008dea80	add x9,x9,#0x1
008dea84	cmp x9,#0x138
008dea88	b.ne 0x008dea74
008dea8c	mov x9,#0xeda60000
008dea90	orr x8,xzr,#0x5555555555555555
008dea94	mov x10,#0xeee000000000
008dea98	movk x9,#0x7fff, LSL #32
008dea9c	and x8,x8,#0xfffffffff
008deaa0	movk x10,#0xfff7, LSL #48
008deaa4	movk x9,#0x71d6, LSL #48
008deaa8	dup v1.2D,x8
008deaac	mov x27,#0xd21
008deab0	dup v0.2D,x9
008deab4	movk x27,#0x20d2, LSL #16
008deab8	mov x25,xzr
008deabc	movk x27,#0xd20d, LSL #32
008deac0	mov w26,#0x40
008deac4	mov w28,#0x138
008deac8	movk x27,#0xd20, LSL #48
008deacc	add x24,sp,#0x58
008dead0	str xzr,[sp, #0xa18]
008dead4	stp q0,q1,[sp, #0x30]
008dead8	dup v0.2D,x10
008deadc	str q0,[sp, #0x20]
008deae0	add x8,x25,#0x1
008deae4	add x10,x25,#0x9c
008deae8	mov x13,#0x19e9
008deaec	lsr x9,x8,#0x3
008deaf0	lsr x11,x10,#0x3
008deaf4	movk x13,#0xa966, LSL #16
008deaf8	movk x13,#0x6f5a, LSL #32
008deafc	ldp q2,q3,[sp, #0x30]
008deb00	umulh x9,x9,x27
008deb04	movk x13,#0xb502, LSL #48
008deb08	mov x0,x19
008deb0c	umulh x11,x11,x27
008deb10	lsr x9,x9,#0x1
008deb14	lsr x11,x11,#0x1
008deb18	msub x8,x9,x28,x8
008deb1c	msub x9,x11,x28,x10
008deb20	ldr x11,[x24, x25, LSL #0x3]
008deb24	and x11,x11,#-0x80000000
008deb28	ldr x10,[x24, x8, LSL #0x3]
008deb2c	ldr x9,[x24, x9, LSL #0x3]
008deb30	tst w10,#0x1
008deb34	and x10,x10,#0x7ffffffe
008deb38	csel x12,x13,xzr,ne
008deb3c	orr x10,x10,x11
008deb40	eor x9,x12,x9
008deb44	eor x9,x9,x10, LSR #0x1
008deb48	subs x10,x8,#0x137
008deb4c	str x9,[x24, x25, LSL #0x3]
008deb50	csinc x25,x10,x8,cs
008deb54	cmp x8,#0x9c
008deb58	ldr x9,[sp, #0xa18]
008deb5c	mov w10,#0x9c
008deb60	ldr x11,[x24, x8, LSL #0x3]
008deb64	cneg x10,x10,cs
008deb68	ldr d0,[x24,x9, lsl #3]
008deb6c	str x8,[sp, #0xa18]
008deb70	add x10,x10,x8
008deb74	ldr x9,[x24, x25, LSL #0x3]
008deb78	ldr x10,[x24, x10, LSL #0x3]
008deb7c	and x11,x11,#-0x80000000
008deb80	str x25,[sp, #0xa18]
008deb84	tst w9,#0x1
008deb88	and x9,x9,#0x7ffffffe
008deb8c	csel x12,x13,xzr,ne
008deb90	orr x9,x9,x11
008deb94	eor x10,x12,x10
008deb98	eor x9,x10,x9, LSR #0x1
008deb9c	str x9,[x24, x8, LSL #0x3]
008deba0	mov v0.D[0x1],x9
008deba4	ushr v1.2D,v0.2D,#0x1d
008deba8	and v1.16B,v1.16B,v3.16B
008debac	eor v0.16B,v1.16B,v0.16B
008debb0	shl v1.2D,v0.2D,0x11
008debb4	and v1.16B,v1.16B,v2.16B
008debb8	ldr q2,[sp, #0x20]
008debbc	eor v0.16B,v1.16B,v0.16B
008debc0	shl v1.2D,v0.2D,0x25
008debc4	and v1.16B,v1.16B,v2.16B
008debc8	eor v0.16B,v1.16B,v0.16B
008debcc	ushr v1.2D,v0.2D,#0x2b
008debd0	eor v0.16B,v1.16B,v0.16B
008debd4	mov x20,v0.D[0x1]
008debd8	fmov x21,d0
008debdc	mov x1,x21
008debe0	mov x2,x20
008debe4	bl 0x008decbc
008debe8	mov x22,x0
008debec	mov x23,x1
008debf0	mov x0,x19
008debf4	mov x1,x21
008debf8	mov x2,x20
008debfc	bl 0x008df008
008dec00	cmp x22,x0
008dec04	ccmp x23,x1,#0x0,eq
008dec08	b.ne 0x008dec4c
008dec0c	subs w26,w26,#0x1
008dec10	b.ne 0x008deae0
008dec14	ldr x8,[sp]
008dec18	ldr x8,[x8, #0x28]
008dec1c	ldur x9,[x29, #-0x10]
008dec20	cmp x8,x9
008dec24	b.ne 0x008decb8
008dec28	mov x0,x19
008dec2c	add sp,sp,#0xa30
008dec30	ldp x20,x19,[sp, #0x50]
008dec34	ldp x22,x21,[sp, #0x40]
008dec38	ldp x24,x23,[sp, #0x30]
008dec3c	ldp x26,x25,[sp, #0x20]
008dec40	ldp x28,x27,[sp, #0x10]
008dec44	ldp x29,x30,[sp], #0x60
008dec48	b 0x008df0fc
008dec4c	mov w0,#0x10
008dec50	bl 0x00c30000
008dec54	mov x19,x0
008dec58	adrp x1,0x2c2000
008dec5c	add x1,x1,#0xe97
008dec60	bl 0x00c30a80
008dec64	ldr x8,[sp]
008dec68	ldr x8,[x8, #0x28]
008dec6c	ldur x9,[x29, #-0x10]
008dec70	cmp x8,x9
008dec74	b.ne 0x008decb8
008dec78	adrp x1,0xcb4000
008dec7c	adrp x2,0xcb4000
008dec80	mov x0,x19
008dec84	ldr x1,[x1, #0xc20]
008dec88	ldr x2,[x2, #0xc28]
008dec8c	bl 0x00c30020
008decb8	bl 0x00c2fec0
