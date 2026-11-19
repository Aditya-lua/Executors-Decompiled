; CRYPTO_gcm128_init @ 00aa98e4
00aa98e4	str x21,[sp, #-0x30]!
00aa98e8	stp x20,x19,[sp, #0x10]
00aa98ec	mov x20,x2
00aa98f0	mov x21,x1
00aa98f4	mov w2,#0x1b8
00aa98f8	mov w1,wzr
00aa98fc	stp x29,x30,[sp, #0x20]
00aa9900	add x29,sp,#0x20
00aa9904	mov x19,x0
00aa9908	bl 0x00c301c0
00aa990c	add x0,x19,#0x50
00aa9910	mov x1,x0
00aa9914	mov x2,x21
00aa9918	stp x20,x21,[x19, #0x178]
00aa991c	blr x20
00aa9920	ldrb w9,[x19, #0x54]
00aa9924	ldrb w14,[x19, #0x5c]
00aa9928	ldr w8,[x19, #0x50]
00aa992c	ldrb w10,[x19, #0x55]
00aa9930	ldr w13,[x19, #0x58]
00aa9934	ldrb w15,[x19, #0x5d]
00aa9938	ldrb w11,[x19, #0x56]
00aa993c	ldrb w16,[x19, #0x5e]
00aa9940	ldrb w17,[x19, #0x5f]
00aa9944	ldrb w12,[x19, #0x57]
00aa9948	lsl x9,x9,#0x18
00aa994c	lsl x14,x14,#0x18
00aa9950	rev w8,w8
00aa9954	rev w13,w13
00aa9958	bfm x9,x10,#0x30,#0x7
00aa995c	bfm x14,x15,#0x30,#0x7
00aa9960	bfm x9,x8,#0x20,#0x1f
00aa9964	bfm x14,x13,#0x20,#0x1f
00aa9968	and x0,x17,#0x1
00aa996c	bfm x9,x11,#0x38,#0x7
00aa9970	bfm x14,x16,#0x38,#0x7
00aa9974	mov x18,#-0x1f00000000000000
00aa9978	neg x10,x0
00aa997c	orr x8,x9,x12
00aa9980	orr x9,x14,x17
00aa9984	and x10,x10,x18
00aa9988	extr x11,x12,x9,#0x1
00aa998c	lsr x12,x8,#0x1
00aa9990	ubfx x13,x9,#0x1,#0x1
00aa9994	eor x10,x10,x12
00aa9998	neg x13,x13
00aa999c	ubfx x14,x11,#0x1,#0x1
00aa99a0	and x13,x13,x18
00aa99a4	lsr x16,x10,#0x1
00aa99a8	neg x14,x14
00aa99ac	extr x12,x12,x11,#0x1
00aa99b0	eor x13,x13,x16
00aa99b4	and x14,x14,x18
00aa99b8	eor x15,x11,x9
00aa99bc	eor x1,x10,x8
00aa99c0	extr x16,x16,x12,#0x1
00aa99c4	eor x14,x14,x13, LSR #0x1
00aa99c8	eor x17,x12,x11
00aa99cc	eor x0,x12,x9
00aa99d0	stp x1,x15,[x19, #0x120]
00aa99d4	stp x13,x12,[x19, #0x80]
00aa99d8	eor x12,x16,x12
00aa99dc	eor x1,x13,x10
00aa99e0	eor x3,x13,x8
00aa99e4	eor x13,x14,x13
00aa99e8	stp x10,x11,[x19, #0xa0]
00aa99ec	eor x18,x16,x11
00aa99f0	eor x2,x16,x9
00aa99f4	stp x14,x16,[x19, #0x70]
00aa99f8	eor x16,x14,x10
00aa99fc	eor x11,x12,x11
00aa9a00	eor x10,x13,x10
00aa9a04	stp x8,x9,[x19, #0x50]
00aa9a08	stp x8,x9,[x19, #0xe0]
00aa9a0c	eor x15,x17,x9
00aa9a10	stp x1,x17,[x19, #0xc0]
00aa9a14	eor x14,x14,x8
00aa9a18	stp x3,x0,[x19, #0x100]
00aa9a1c	eor x17,x12,x9
00aa9a20	eor x0,x18,x9
00aa9a24	eor x1,x1,x8
00aa9a28	stp x13,x12,[x19, #0x90]
00aa9a2c	eor x12,x13,x8
00aa9a30	eor x13,x16,x8
00aa9a34	eor x9,x11,x9
00aa9a38	eor x8,x10,x8
00aa9a3c	stp xzr,xzr,[x19, #0x60]
00aa9a40	stp x16,x18,[x19, #0xb0]
00aa9a44	stp x14,x2,[x19, #0xf0]
00aa9a48	stp x1,x15,[x19, #0x140]
00aa9a4c	stp x10,x11,[x19, #0xd0]
00aa9a50	stp x12,x17,[x19, #0x110]
00aa9a54	stp x13,x0,[x19, #0x130]
00aa9a58	stp x8,x9,[x19, #0x150]
00aa9a5c	ldp x29,x30,[sp, #0x20]
00aa9a60	ldp x20,x19,[sp, #0x10]
00aa9a64	ldr x21,[sp], #0x30
00aa9a68	ret
