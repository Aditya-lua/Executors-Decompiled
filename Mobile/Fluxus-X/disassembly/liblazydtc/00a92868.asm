; ChaCha20_ctr32 @ 00a92868
00a92868	sub sp,sp,#0xb0
00a9286c	stp x28,x27,[sp, #0x50]
00a92870	stp x26,x25,[sp, #0x60]
00a92874	stp x24,x23,[sp, #0x70]
00a92878	stp x22,x21,[sp, #0x80]
00a9287c	stp x20,x19,[sp, #0x90]
00a92880	stp x29,x30,[sp, #0xa0]
00a92884	cbz x2,0x00a92c14
00a92888	ldr w8,[x3]
00a9288c	ldr w15,[x3, #0x1c]
00a92890	add x19,sp,#0x10
00a92894	str w8,[sp, #0xc]
00a92898	ldp w8,w10,[x3, #0x4]
00a9289c	str w8,[sp, #0x8]
00a928a0	ldp w11,w5,[x3, #0xc]
00a928a4	ldp w13,w14,[x3, #0x14]
00a928a8	ldp w20,w17,[x4]
00a928ac	ldp w18,w3,[x4, #0x8]
00a928b0	add x8,x19,#0x10
00a928b4	str x8,[sp]
00a928b8	ldp w9,w8,[sp, #0x8]
00a928bc	mov w6,#0x6574
00a928c0	mov w7,#0x2d32
00a928c4	mov w21,#0x646e
00a928c8	mov w4,#0x7865
00a928cc	mov w22,#0x16
00a928d0	mov w24,w15
00a928d4	mov w23,w3
00a928d8	movk w6,#0x6b20, LSL #16
00a928dc	mov w27,w11
00a928e0	mov w25,w14
00a928e4	mov w26,w18
00a928e8	movk w7,#0x7962, LSL #16
00a928ec	mov w30,w10
00a928f0	mov w29,w13
00a928f4	mov w28,w17
00a928f8	movk w21,#0x3320, LSL #16
00a928fc	mov w12,w5
00a92900	mov w16,w20
00a92904	movk w4,#0x6170, LSL #16
00a92908	add w4,w8,w4
00a9290c	add w21,w9,w21
00a92910	add w7,w30,w7
00a92914	add w6,w27,w6
00a92918	eor w16,w4,w16
00a9291c	eor w28,w21,w28
00a92920	eor w26,w7,w26
00a92924	eor w23,w6,w23
00a92928	ror w16,w16,#0x10
00a9292c	ror w28,w28,#0x10
00a92930	ror w26,w26,#0x10
00a92934	ror w23,w23,#0x10
00a92938	add w12,w16,w12
00a9293c	add w29,w28,w29
00a92940	add w25,w26,w25
00a92944	add w24,w23,w24
00a92948	eor w8,w12,w8
00a9294c	eor w9,w29,w9
00a92950	eor w30,w25,w30
00a92954	eor w27,w24,w27
00a92958	ror w8,w8,#0x14
00a9295c	ror w9,w9,#0x14
00a92960	ror w30,w30,#0x14
00a92964	ror w27,w27,#0x14
00a92968	add w4,w8,w4
00a9296c	add w21,w9,w21
00a92970	add w7,w30,w7
00a92974	add w6,w27,w6
00a92978	eor w16,w4,w16
00a9297c	eor w28,w21,w28
00a92980	eor w26,w7,w26
00a92984	eor w23,w6,w23
00a92988	ror w16,w16,#0x18
00a9298c	ror w28,w28,#0x18
00a92990	ror w26,w26,#0x18
00a92994	ror w23,w23,#0x18
00a92998	add w12,w16,w12
00a9299c	add w29,w28,w29
00a929a0	add w25,w26,w25
00a929a4	add w24,w23,w24
00a929a8	eor w8,w12,w8
00a929ac	eor w9,w29,w9
00a929b0	eor w30,w25,w30
00a929b4	eor w27,w24,w27
00a929b8	ror w8,w8,#0x19
00a929bc	ror w9,w9,#0x19
00a929c0	ror w30,w30,#0x19
00a929c4	ror w27,w27,#0x19
00a929c8	add w4,w9,w4
00a929cc	add w21,w30,w21
00a929d0	add w7,w27,w7
00a929d4	add w6,w8,w6
00a929d8	eor w23,w4,w23
00a929dc	eor w16,w16,w21
00a929e0	eor w28,w28,w7
00a929e4	eor w26,w6,w26
00a929e8	ror w23,w23,#0x10
00a929ec	ror w16,w16,#0x10
00a929f0	ror w28,w28,#0x10
00a929f4	ror w26,w26,#0x10
00a929f8	add w25,w23,w25
00a929fc	add w24,w16,w24
00a92a00	add w12,w12,w28
00a92a04	add w29,w26,w29
00a92a08	eor w9,w25,w9
00a92a0c	eor w30,w24,w30
00a92a10	eor w27,w12,w27
00a92a14	eor w8,w29,w8
00a92a18	ror w9,w9,#0x14
00a92a1c	ror w30,w30,#0x14
00a92a20	ror w27,w27,#0x14
00a92a24	ror w8,w8,#0x14
00a92a28	add w4,w9,w4
00a92a2c	add w21,w30,w21
00a92a30	add w7,w27,w7
00a92a34	add w6,w8,w6
00a92a38	eor w23,w4,w23
00a92a3c	eor w16,w21,w16
00a92a40	eor w28,w7,w28
00a92a44	eor w26,w6,w26
00a92a48	ror w23,w23,#0x18
00a92a4c	ror w16,w16,#0x18
00a92a50	ror w28,w28,#0x18
00a92a54	ror w26,w26,#0x18
00a92a58	add w25,w23,w25
00a92a5c	add w24,w16,w24
00a92a60	add w12,w28,w12
00a92a64	add w29,w26,w29
00a92a68	sub w22,w22,#0x2
00a92a6c	eor w9,w25,w9
00a92a70	eor w30,w24,w30
00a92a74	eor w27,w12,w27
00a92a78	eor w8,w29,w8
00a92a7c	cmp w22,#0x2
00a92a80	ror w9,w9,#0x19
00a92a84	ror w30,w30,#0x19
00a92a88	ror w27,w27,#0x19
00a92a8c	ror w8,w8,#0x19
00a92a90	b.hi 0x00a92908
00a92a94	mov w22,#0x7865
00a92a98	movk w22,#0x6170, LSL #16
00a92a9c	add w4,w4,w22
00a92aa0	str w4,[sp, #0x10]
00a92aa4	mov w4,#0x646e
00a92aa8	movk w4,#0x3320, LSL #16
00a92aac	add w4,w21,w4
00a92ab0	str w4,[sp, #0x14]
00a92ab4	mov w4,#0x2d32
00a92ab8	movk w4,#0x7962, LSL #16
00a92abc	add w4,w7,w4
00a92ac0	str w4,[sp, #0x18]
00a92ac4	mov w4,#0x6574
00a92ac8	movk w4,#0x6b20, LSL #16
00a92acc	add w4,w6,w4
00a92ad0	str w4,[sp, #0x1c]
00a92ad4	ldr w4,[sp, #0xc]
00a92ad8	cmp x2,#0x40
00a92adc	add w8,w8,w4
00a92ae0	str w8,[sp, #0x20]
00a92ae4	ldr w8,[sp, #0x8]
00a92ae8	add w8,w9,w8
00a92aec	str w8,[sp, #0x24]
00a92af0	add w8,w30,w10
00a92af4	str w8,[sp, #0x28]
00a92af8	add w8,w27,w11
00a92afc	str w8,[sp, #0x2c]
00a92b00	add w8,w12,w5
00a92b04	str w8,[sp, #0x30]
00a92b08	add w8,w29,w13
00a92b0c	str w8,[sp, #0x34]
00a92b10	add w8,w25,w14
00a92b14	str w8,[sp, #0x38]
00a92b18	add w8,w24,w15
00a92b1c	str w8,[sp, #0x3c]
00a92b20	add w8,w16,w20
00a92b24	str w8,[sp, #0x40]
00a92b28	add w8,w28,w17
00a92b2c	str w8,[sp, #0x44]
00a92b30	add w8,w26,w18
00a92b34	str w8,[sp, #0x48]
00a92b38	mov w8,#0x40
00a92b3c	csel x8,x2,x8,cc
00a92b40	add w9,w23,w3
00a92b44	str w9,[sp, #0x4c]
00a92b48	cbz x8,0x00a92c00
00a92b4c	cmp x8,#0x20
00a92b50	mov x9,xzr
00a92b54	b.cc 0x00a92be4
00a92b58	add x9,x1,x8
00a92b5c	add x12,x0,x8
00a92b60	cmp x0,x9
00a92b64	add x16,x19,x8
00a92b68	cset w9,cc
00a92b6c	cmp x1,x12
00a92b70	cset w4,cc
00a92b74	cmp x0,x16
00a92b78	and w16,w9,w4
00a92b7c	cset w9,cc
00a92b80	cmp x12,x19
00a92b84	cset w12,hi
00a92b88	tbnz w16,#0x0,0x00a92be0
00a92b8c	and w12,w9,w12
00a92b90	mov x9,xzr
00a92b94	tbnz w12,#0x0,0x00a92be4
00a92b98	ldr x6,[sp]
00a92b9c	and x9,x8,#0x60
00a92ba0	add x12,x1,#0x10
00a92ba4	add x16,x0,#0x10
00a92ba8	mov x4,x9
00a92bac	ldp q0,q1,[x12, #-0x10]
00a92bb0	ldp q2,q3,[x6, #-0x10]
00a92bb4	add x12,x12,#0x20
00a92bb8	add x6,x6,#0x20
00a92bbc	subs x4,x4,#0x20
00a92bc0	eor v0.16B,v2.16B,v0.16B
00a92bc4	eor v1.16B,v3.16B,v1.16B
00a92bc8	stp q0,q1,[x16, #-0x10]
00a92bcc	add x16,x16,#0x20
00a92bd0	b.ne 0x00a92bac
00a92bd4	cmp x8,x9
00a92bd8	b.ne 0x00a92be4
00a92bdc	b 0x00a92c00
00a92be0	mov x9,xzr
00a92be4	ldrb w12,[x1, x9]
00a92be8	ldrb w16,[x19, x9]
00a92bec	eor w12,w16,w12
00a92bf0	strb w12,[x0, x9]
00a92bf4	add x9,x9,#0x1
00a92bf8	cmp x9,x8
00a92bfc	b.cc 0x00a92be4
00a92c00	add x0,x0,x8
00a92c04	add x1,x1,x8
00a92c08	subs x2,x2,x8
00a92c0c	add w20,w20,#0x1
00a92c10	b.ne 0x00a928b8
00a92c14	ldp x29,x30,[sp, #0xa0]
00a92c18	ldp x20,x19,[sp, #0x90]
00a92c1c	ldp x22,x21,[sp, #0x80]
00a92c20	ldp x24,x23,[sp, #0x70]
00a92c24	ldp x26,x25,[sp, #0x60]
00a92c28	ldp x28,x27,[sp, #0x50]
00a92c2c	add sp,sp,#0xb0
00a92c30	ret
