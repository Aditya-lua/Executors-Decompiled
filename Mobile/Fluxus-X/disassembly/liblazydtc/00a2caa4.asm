; BN_GF2m_mod_inv @ 00a2caa4
00a2caa4	sub sp,sp,#0xb0
00a2caa8	stp x22,x21,[sp, #0x80]
00a2caac	mov x21,x0
00a2cab0	mov x0,x3
00a2cab4	stp x28,x27,[sp, #0x50]
00a2cab8	stp x26,x25,[sp, #0x60]
00a2cabc	stp x24,x23,[sp, #0x70]
00a2cac0	stp x20,x19,[sp, #0x90]
00a2cac4	stp x29,x30,[sp, #0xa0]
00a2cac8	add x29,sp,#0xa0
00a2cacc	mov x19,x3
00a2cad0	mov x20,x2
00a2cad4	mov x23,x1
00a2cad8	bl 0x00c38a90
00a2cadc	mov x0,x19
00a2cae0	bl 0x00c38a40
00a2cae4	cbz x0,0x00a2cbb0
00a2cae8	mov x22,x0
00a2caec	mov x0,x20
00a2caf0	bl 0x00c322f0
00a2caf4	cmp w0,#0x2
00a2caf8	mov w24,wzr
00a2cafc	b.lt 0x00a2cbb4
00a2cb00	sub w24,w0,#0x1
00a2cb04	mov w2,#0xffffffff
00a2cb08	mov x0,x22
00a2cb0c	mov w1,w24
00a2cb10	mov w3,wzr
00a2cb14	mov w4,wzr
00a2cb18	mov x5,x19
00a2cb1c	bl 0x00c39150
00a2cb20	cbz w0,0x00a2cbb0
00a2cb24	mov x0,x22
00a2cb28	bl 0x00c369b0
00a2cb2c	cbnz w0,0x00a2cb04
00a2cb30	mov x0,x21
00a2cb34	mov x1,x23
00a2cb38	mov x2,x22
00a2cb3c	mov x3,x20
00a2cb40	mov x4,x19
00a2cb44	bl 0x00a2c73c
00a2cb48	cbz w0,0x00a2cbb0
00a2cb4c	mov x0,x19
00a2cb50	bl 0x00c38a90
00a2cb54	mov x0,x19
00a2cb58	bl 0x00c38a40
00a2cb5c	str x0,[sp, #0x38]
00a2cb60	mov x0,x19
00a2cb64	bl 0x00c38a40
00a2cb68	str x0,[sp, #0x30]
00a2cb6c	mov x0,x19
00a2cb70	bl 0x00c38a40
00a2cb74	str x0,[sp, #0x48]
00a2cb78	mov x0,x19
00a2cb7c	bl 0x00c38a40
00a2cb80	str x0,[sp, #0x40]
00a2cb84	cbz x0,0x00a2cba8
00a2cb88	ldr x0,[sp, #0x48]
00a2cb8c	mov x1,x21
00a2cb90	mov x2,x20
00a2cb94	bl 0x00a2ba74
00a2cb98	cbz w0,0x00a2cba8
00a2cb9c	ldr x0,[sp, #0x48]
00a2cba0	bl 0x00c369b0
00a2cba4	cbz w0,0x00a2cbe0
00a2cba8	mov x0,x19
00a2cbac	bl 0x00c38a20
00a2cbb0	mov w24,wzr
00a2cbb4	mov x0,x19
00a2cbb8	bl 0x00c38a20
00a2cbbc	mov w0,w24
00a2cbc0	ldp x29,x30,[sp, #0xa0]
00a2cbc4	ldp x20,x19,[sp, #0x90]
00a2cbc8	ldp x22,x21,[sp, #0x80]
00a2cbcc	ldp x24,x23,[sp, #0x70]
00a2cbd0	ldp x26,x25,[sp, #0x60]
00a2cbd4	ldp x28,x27,[sp, #0x50]
00a2cbd8	add sp,sp,#0xb0
00a2cbdc	ret
00a2cbe0	ldr x0,[sp, #0x40]
00a2cbe4	mov x1,x20
00a2cbe8	bl 0x00c36990
00a2cbec	cbz x0,0x00a2cba8
00a2cbf0	ldr x23,[sp, #0x48]
00a2cbf4	mov x0,x23
00a2cbf8	bl 0x00c322f0
00a2cbfc	mov w28,w0
00a2cc00	ldr x0,[sp, #0x40]
00a2cc04	bl 0x00c322f0
00a2cc08	ldr w27,[x20, #0x8]
00a2cc0c	mov w24,w0
00a2cc10	mov x0,x23
00a2cc14	mov w1,w27
00a2cc18	bl 0x00c38e80
00a2cc1c	cbz x0,0x00a2cba8
00a2cc20	str w24,[sp, #0x28]
00a2cc24	ldr x24,[sp, #0x48]
00a2cc28	ldrsw x8,[x24, #0x8]
00a2cc2c	ldr x23,[x24]
00a2cc30	cmp w8,w27
00a2cc34	b.ge 0x00a2cc54
00a2cc38	sub w9,w27,#0x1
00a2cc3c	add x0,x23,x8, LSL #0x3
00a2cc40	sub w8,w9,w8
00a2cc44	lsl x8,x8,#0x3
00a2cc48	add x2,x8,#0x8
00a2cc4c	mov w1,wzr
00a2cc50	bl 0x00c301c0
00a2cc54	ldr x0,[sp, #0x38]
00a2cc58	mov w1,w27
00a2cc5c	str w27,[x24, #0x8]
00a2cc60	bl 0x00c38e80
00a2cc64	cbz x0,0x00a2cba8
00a2cc68	ldr x8,[sp, #0x38]
00a2cc6c	subs w25,w27,#0x2
00a2cc70	ldr x24,[x8]
00a2cc74	mov w8,#0x1
00a2cc78	str x8,[x24]
00a2cc7c	b.lt 0x00a2cc94
00a2cc80	sub w8,w27,#0x1
00a2cc84	add x0,x24,#0x8
00a2cc88	lsl x2,x8,#0x3
00a2cc8c	mov w1,wzr
00a2cc90	bl 0x00c301c0
00a2cc94	ldp x0,x8,[sp, #0x30]
00a2cc98	mov w1,w27
00a2cc9c	str w27,[x8, #0x8]
00a2cca0	bl 0x00c38e80
00a2cca4	ldr w26,[sp, #0x28]
00a2cca8	cbz x0,0x00a2cba8
00a2ccac	ldr x8,[sp, #0x30]
00a2ccb0	cmp w27,#0x0
00a2ccb4	ldr x3,[x8]
00a2ccb8	b.le 0x00a2cce0
00a2ccbc	lsl x2,x27,#0x3
00a2ccc0	mov x0,x3
00a2ccc4	mov w1,wzr
00a2ccc8	mov x26,x25
00a2cccc	mov x25,x3
00a2ccd0	bl 0x00c301c0
00a2ccd4	mov x3,x25
00a2ccd8	mov x25,x26
00a2ccdc	ldr w26,[sp, #0x28]
00a2cce0	ldr x8,[sp, #0x30]
00a2cce4	add x4,x25,#0x1
00a2cce8	sub w5,w27,#0x1
00a2ccec	and x9,x27,#0xfffffffc
00a2ccf0	str w27,[x8, #0x8]
00a2ccf4	ldr x8,[sp, #0x40]
00a2ccf8	ldr x8,[x8]
00a2ccfc	stp x9,x5,[sp, #0x8]
00a2cd00	mov x6,x8
00a2cd04	stp x4,x8,[sp, #0x18]
00a2cd08	b 0x00a2cd20
00a2cd0c	bl 0x00c38d80
00a2cd10	ldp x5,x4,[sp, #0x10]
00a2cd14	ldr x6,[sp, #0x28]
00a2cd18	sub w28,w0,w28
00a2cd1c	mov x3,x25
00a2cd20	ldr x9,[x23]
00a2cd24	cbz w28,0x00a2cdd8
00a2cd28	add x10,x24,#0x8
00a2cd2c	add x11,x23,#0x8
00a2cd30	mov w8,w28
00a2cd34	tbnz w9,#0x0,0x00a2cf48
00a2cd38	ldr x14,[x20]
00a2cd3c	ldr x12,[x24]
00a2cd40	cmp w27,#0x2
00a2cd44	ldr x15,[x14]
00a2cd48	and x13,x12,#0x1
00a2cd4c	neg x13,x13
00a2cd50	and x15,x15,x13
00a2cd54	eor x12,x15,x12
00a2cd58	b.lt 0x00a2cdb0
00a2cd5c	add x14,x14,#0x8
00a2cd60	mov x15,x5
00a2cd64	mov x16,x11
00a2cd68	mov x17,x10
00a2cd6c	mov x18,x9
00a2cd70	ldr x9,[x16]
00a2cd74	mov x1,x12
00a2cd78	subs x15,x15,#0x1
00a2cd7c	extr x18,x9,x18,#0x1
00a2cd80	stur x18,[x16, #-0x8]
00a2cd84	ldr x18,[x17]
00a2cd88	ldr x0,[x14], #0x8
00a2cd8c	add x16,x16,#0x8
00a2cd90	and x12,x0,x13
00a2cd94	eor x12,x12,x18
00a2cd98	extr x18,x12,x1,#0x1
00a2cd9c	stur x18,[x17, #-0x8]
00a2cda0	add x17,x17,#0x8
00a2cda4	b.ne 0x00a2cd6c
00a2cda8	mov x13,x4
00a2cdac	b 0x00a2cdb4
00a2cdb0	mov x13,xzr
00a2cdb4	lsr x9,x9,#0x1
00a2cdb8	ubfiz x13,x13,#0x3,#0x20
00a2cdbc	lsr x12,x12,#0x1
00a2cdc0	str x9,[x23, x13#0x0]
00a2cdc4	str x12,[x24, x13#0x0]
00a2cdc8	ldr x9,[x23]
00a2cdcc	subs w8,w8,#0x1
00a2cdd0	b.ne 0x00a2cd34
00a2cdd4	b 0x00a2cf50
00a2cdd8	mov w8,wzr
00a2cddc	cbz x9,0x00a2cba8
00a2cde0	cmp x9,#0x1
00a2cde4	b.eq 0x00a2cfe8
00a2cde8	cmp w8,w26
00a2cdec	b.ge 0x00a2ce38
00a2cdf0	ldr x0,[sp, #0x48]
00a2cdf4	ldr x1,[sp, #0x38]
00a2cdf8	mov w28,w26
00a2cdfc	mov w26,w8
00a2ce00	ldr x8,[sp, #0x40]
00a2ce04	ldr x10,[x0]
00a2ce08	ldr x9,[x1]
00a2ce0c	mov x24,x3
00a2ce10	stp x0,x8,[sp, #0x40]
00a2ce14	ldr x8,[sp, #0x30]
00a2ce18	mov x23,x6
00a2ce1c	mov x6,x10
00a2ce20	mov x3,x9
00a2ce24	str x10,[sp, #0x20]
00a2ce28	stp x1,x8,[sp, #0x30]
00a2ce2c	cmp w27,#0x1
00a2ce30	b.ge 0x00a2ce44
00a2ce34	b 0x00a2cf9c
00a2ce38	mov w28,w8
00a2ce3c	cmp w27,#0x1
00a2ce40	b.lt 0x00a2cf9c
00a2ce44	cmp x27,#0x4
00a2ce48	mov x9,xzr
00a2ce4c	b.cc 0x00a2cf5c
00a2ce50	lsl x8,x27,#0x3
00a2ce54	add x15,x24,x8
00a2ce58	ldr x14,[sp, #0x20]
00a2ce5c	add x11,x23,x8
00a2ce60	cmp x23,x15
00a2ce64	add x13,x6,x8
00a2ce68	add x16,x3,x8
00a2ce6c	cset w8,cc
00a2ce70	cmp x24,x11
00a2ce74	cset w9,cc
00a2ce78	cmp x23,x13
00a2ce7c	and w17,w8,w9
00a2ce80	cset w8,cc
00a2ce84	cmp x14,x11
00a2ce88	cset w10,cc
00a2ce8c	cmp x23,x16
00a2ce90	cset w9,cc
00a2ce94	cmp x3,x11
00a2ce98	cset w12,cc
00a2ce9c	cmp x24,x13
00a2cea0	cset w11,cc
00a2cea4	cmp x14,x15
00a2cea8	cset w14,cc
00a2ceac	cmp x24,x16
00a2ceb0	cset w13,cc
00a2ceb4	cmp x3,x15
00a2ceb8	cset w15,cc
00a2cebc	tbnz w17,#0x0,0x00a2cf58
00a2cec0	and w8,w8,w10
00a2cec4	tbnz w8,#0x0,0x00a2cf58
00a2cec8	and w8,w9,w12
00a2cecc	tbnz w8,#0x0,0x00a2cf58
00a2ced0	and w8,w11,w14
00a2ced4	tbnz w8,#0x0,0x00a2cf58
00a2ced8	and w8,w13,w15
00a2cedc	mov x9,xzr
00a2cee0	tbnz w8,#0x0,0x00a2cf5c
00a2cee4	ldr x12,[sp, #0x8]
00a2cee8	add x8,x6,#0x10
00a2ceec	add x9,x23,#0x10
00a2cef0	add x10,x3,#0x10
00a2cef4	add x11,x24,#0x10
00a2cef8	ldp q0,q1,[x8, #-0x10]
00a2cefc	ldp q2,q3,[x9, #-0x10]
00a2cf00	add x8,x8,#0x20
00a2cf04	subs x12,x12,#0x4
00a2cf08	eor v0.16B,v2.16B,v0.16B
00a2cf0c	eor v1.16B,v3.16B,v1.16B
00a2cf10	stp q0,q1,[x9, #-0x10]
00a2cf14	ldp q0,q1,[x10, #-0x10]
00a2cf18	ldp q2,q3,[x11, #-0x10]
00a2cf1c	add x9,x9,#0x20
00a2cf20	add x10,x10,#0x20
00a2cf24	eor v0.16B,v2.16B,v0.16B
00a2cf28	eor v1.16B,v3.16B,v1.16B
00a2cf2c	stp q0,q1,[x11, #-0x10]
00a2cf30	add x11,x11,#0x20
00a2cf34	b.ne 0x00a2cef8
00a2cf38	ldr x9,[sp, #0x8]
00a2cf3c	cmp x27,x9
00a2cf40	b.ne 0x00a2cf5c
00a2cf44	b 0x00a2cf9c
00a2cf48	cmp w8,#0x40
00a2cf4c	b.gt 0x00a2cde8
00a2cf50	cbnz x9,0x00a2cde0
00a2cf54	b 0x00a2cba8
00a2cf58	mov x9,xzr
00a2cf5c	lsl x12,x9,#0x3
00a2cf60	sub x8,x27,x9
00a2cf64	add x9,x24,x12
00a2cf68	add x10,x3,x12
00a2cf6c	add x11,x23,x12
00a2cf70	add x12,x6,x12
00a2cf74	ldr x13,[x12], #0x8
00a2cf78	ldr x14,[x11]
00a2cf7c	subs x8,x8,#0x1
00a2cf80	eor x13,x14,x13
00a2cf84	str x13,[x11], #0x8
00a2cf88	ldr x13,[x10], #0x8
00a2cf8c	ldr x14,[x9]
00a2cf90	eor x13,x14,x13
00a2cf94	str x13,[x9], #0x8
00a2cf98	b.ne 0x00a2cf74
00a2cf9c	cmp w28,w26
00a2cfa0	b.ne 0x00a2cd20
00a2cfa4	sub w8,w28,#0x1
00a2cfa8	add w9,w28,#0x3e
00a2cfac	cmp w8,#0x0
00a2cfb0	csel w9,w9,w8,lt
00a2cfb4	asr w8,w9,#0x6
00a2cfb8	and w9,w9,#0xffffffc0
00a2cfbc	orr w10,wzr,#0xffffffc0
00a2cfc0	mov x25,x3
00a2cfc4	sub w28,w10,w9
00a2cfc8	add x9,x23,w8, SXTW  #0x3
00a2cfcc	str x6,[sp, #0x28]
00a2cfd0	ldr x0,[x9], #-0x8
00a2cfd4	add w28,w28,#0x40
00a2cfd8	cbz w8,0x00a2cd0c
00a2cfdc	sub w8,w8,#0x1
00a2cfe0	cbz x0,0x00a2cfd0
00a2cfe4	b 0x00a2cd0c
00a2cfe8	ldr x23,[sp, #0x38]
00a2cfec	mov x0,x23
00a2cff0	bl 0x00c38e40
00a2cff4	mov x0,x21
00a2cff8	mov x1,x23
00a2cffc	bl 0x00c36990
00a2d000	mov x23,x0
00a2d004	mov x0,x19
00a2d008	bl 0x00c38a20
00a2d00c	cbz x23,0x00a2cbb0
00a2d010	mov x0,x21
00a2d014	mov x1,x21
00a2d018	mov x2,x22
00a2d01c	mov x3,x20
00a2d020	mov x4,x19
00a2d024	bl 0x00a2c73c
00a2d028	cmp w0,#0x0
00a2d02c	cset w24,ne
00a2d030	b 0x00a2cbb4
