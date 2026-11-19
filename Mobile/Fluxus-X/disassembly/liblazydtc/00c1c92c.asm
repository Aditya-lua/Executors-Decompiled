; FUN_00c1c92c @ 00c1c92c
00c1c92c	paciasp
00c1c930	sub sp,sp,#0x130
00c1c934	stp x29,x30,[sp, #0xd0]
00c1c938	stp x28,x27,[sp, #0xe0]
00c1c93c	stp x26,x25,[sp, #0xf0]
00c1c940	stp x24,x23,[sp, #0x100]
00c1c944	stp x22,x21,[sp, #0x110]
00c1c948	stp x20,x19,[sp, #0x120]
00c1c94c	add x29,sp,#0xd0
00c1c950	mov x19,x0
00c1c954	cbz x1,0x00c1c960
00c1c958	ldr x8,[x19, #0x298]
00c1c95c	str x8,[x19, #0x2a0]
00c1c960	ldp x9,x23,[x19]
00c1c964	sub x8,x23,x9
00c1c968	cmp x8,#0x2
00c1c96c	b.cs 0x00c1c998
00c1c970	mov x0,xzr
00c1c974	ldp x20,x19,[sp, #0x120]
00c1c978	ldp x22,x21,[sp, #0x110]
00c1c97c	ldp x24,x23,[sp, #0x100]
00c1c980	ldp x26,x25,[sp, #0xf0]
00c1c984	ldp x28,x27,[sp, #0xe0]
00c1c988	ldp x29,x30,[sp, #0xd0]
00c1c98c	add sp,sp,#0x130
00c1c990	autiasp
00c1c994	ret
00c1c998	ldrh w8,[x9]
00c1c99c	mov w10,#0x7455
00c1c9a0	cmp w8,w10
00c1c9a4	b.eq 0x00c1ca9c
00c1c9a8	ldrh w8,[x9]
00c1c9ac	mov w10,#0x6c55
00c1c9b0	cmp w8,w10
00c1c9b4	b.eq 0x00c1cad0
00c1c9b8	ldrh w8,[x9]
00c1c9bc	mov w10,#0x6255
00c1c9c0	cmp w8,w10
00c1c9c4	b.ne 0x00c1c970
00c1c9c8	add x8,x9,#0x2
00c1c9cc	cmp x23,x8
00c1c9d0	str x8,[x19]
00c1c9d4	b.eq 0x00c1ca08
00c1c9d8	ldrb w9,[x8]
00c1c9dc	sub w9,w9,#0x3a
00c1c9e0	cmn w9,#0xa
00c1c9e4	b.cc 0x00c1ca08
00c1c9e8	ldrb w9,[x8]
00c1c9ec	sub w9,w9,#0x3a
00c1c9f0	cmn w9,#0xa
00c1c9f4	b.cc 0x00c1ca08
00c1c9f8	add x8,x8,#0x1
00c1c9fc	cmp x8,x23
00c1ca00	str x8,[x19]
00c1ca04	b.ne 0x00c1c9e8
00c1ca08	cmp x8,x23
00c1ca0c	b.eq 0x00c1c970
00c1ca10	ldrb w9,[x8]
00c1ca14	cmp w9,#0x5f
00c1ca18	b.ne 0x00c1c970
00c1ca1c	ldr x20,[x19, #0x1330]
00c1ca20	add x8,x8,#0x1
00c1ca24	str x8,[x19]
00c1ca28	ldr x9,[x20, #0x8]
00c1ca2c	sub x10,x9,#0xfd0
00c1ca30	cmn x10,#0xff1
00c1ca34	b.hi 0x00c1ca54
00c1ca38	mov w0,#0x1000
00c1ca3c	bl 0x00c308d0
00c1ca40	cbz x0,0x00c1d044
00c1ca44	mov x9,xzr
00c1ca48	stp x20,xzr,[x0]
00c1ca4c	mov x20,x0
00c1ca50	str x0,[x19, #0x1330]
00c1ca54	add x8,x9,#0x20
00c1ca58	add x0,x20,x9
00c1ca5c	adrp x9,0xcb1000
00c1ca60	add x9,x9,#0x4c0
00c1ca64	str x8,[x20, #0x8]
00c1ca68	mov w10,#0x540
00c1ca6c	str x9,[x0, #0x10]!
00c1ca70	ldurh w8,[x0, #0x9]
00c1ca74	mov w9,#0x8
00c1ca78	and w8,w8,#0xf000
00c1ca7c	strb w9,[x0, #0x8]
00c1ca80	adrp x9,0x2cc000
00c1ca84	add x9,x9,#0xa69
00c1ca88	orr w8,w8,w10
00c1ca8c	sturh w8,[x0, #0x9]
00c1ca90	mov w8,#0xf
00c1ca94	stp x9,x8,[x0, #0x10]
00c1ca98	b 0x00c1c974
00c1ca9c	add x8,x9,#0x2
00c1caa0	cmp x23,x8
00c1caa4	str x8,[x19]
00c1caa8	b.eq 0x00c1cabc
00c1caac	ldrb w10,[x8]
00c1cab0	sub w10,w10,#0x3a
00c1cab4	cmn w10,#0xa
00c1cab8	b.cs 0x00c1cb5c
00c1cabc	mov x20,xzr
00c1cac0	mov x21,xzr
00c1cac4	cmp x8,x23
00c1cac8	b.ne 0x00c1cba0
00c1cacc	b 0x00c1c970
00c1cad0	ldr x22,[x19, #0x2a0]
00c1cad4	ldr x21,[x19, #0x298]
00c1cad8	add x25,sp,#0x60
00c1cadc	add x24,x9,#0x2
00c1cae0	add x9,x25,#0x28
00c1cae4	movi v0.2D,#0x0
00c1cae8	sub x20,x22,x21
00c1caec	stp x9,x9,[sp, #0x70]
00c1caf0	asr x8,x20,#0x3
00c1caf4	str x9,[sp, #0x10]
00c1caf8	ldr x9,[x19, #0x310]
00c1cafc	str x24,[x19]
00c1cb00	str x8,[x19, #0x310]
00c1cb04	stp x19,x8,[sp, #0x60]
00c1cb08	ldr x8,[x19, #0x2a8]
00c1cb0c	str x9,[sp, #0x18]
00c1cb10	add x9,x25,#0x68
00c1cb14	str x9,[sp, #0x80]
00c1cb18	add x9,sp,#0x60
00c1cb1c	cmp x22,x8
00c1cb20	stur q0,[sp, #0x88]
00c1cb24	stur q0,[sp, #0x98]
00c1cb28	stur q0,[x9, #0x48]
00c1cb2c	stur q0,[x9, #0x58]
00c1cb30	b.ne 0x00c1cc5c
00c1cb34	add x8,x19,#0x2b0
00c1cb38	lsl x1,x20,#0x1
00c1cb3c	cmp x21,x8
00c1cb40	b.eq 0x00c1cc20
00c1cb44	mov x0,x21
00c1cb48	bl 0x00c30950
00c1cb4c	str x0,[x19, #0x298]
00c1cb50	cbz x0,0x00c1d068
00c1cb54	ldp x24,x23,[x19]
00c1cb58	b 0x00c1cc4c
00c1cb5c	add x10,x9,#0x2
00c1cb60	mov x9,x8
00c1cb64	ldrb w11,[x9]
00c1cb68	sub w11,w11,#0x3a
00c1cb6c	cmn w11,#0xa
00c1cb70	b.cc 0x00c1cb8c
00c1cb74	add x9,x9,#0x1
00c1cb78	add x10,x10,#0x1
00c1cb7c	cmp x9,x23
00c1cb80	str x9,[x19]
00c1cb84	b.ne 0x00c1cb64
00c1cb88	mov x10,x23
00c1cb8c	mov x20,x8
00c1cb90	sub x21,x10,x8
00c1cb94	mov x8,x9
00c1cb98	cmp x8,x23
00c1cb9c	b.eq 0x00c1c970
00c1cba0	ldrb w9,[x8]
00c1cba4	cmp w9,#0x5f
00c1cba8	b.ne 0x00c1c970
00c1cbac	ldr x22,[x19, #0x1330]
00c1cbb0	add x8,x8,#0x1
00c1cbb4	str x8,[x19]
00c1cbb8	ldr x9,[x22, #0x8]
00c1cbbc	sub x10,x9,#0xfd0
00c1cbc0	cmn x10,#0xff1
00c1cbc4	b.hi 0x00c1cbe4
00c1cbc8	mov w0,#0x1000
00c1cbcc	bl 0x00c308d0
00c1cbd0	cbz x0,0x00c1d044
00c1cbd4	mov x9,xzr
00c1cbd8	stp x22,xzr,[x0]
00c1cbdc	mov x22,x0
00c1cbe0	str x0,[x19, #0x1330]
00c1cbe4	add x8,x9,#0x20
00c1cbe8	add x0,x22,x9
00c1cbec	adrp x9,0xcb2000
00c1cbf0	add x9,x9,#0x288
00c1cbf4	str x8,[x22, #0x8]
00c1cbf8	mov w10,#0x540
00c1cbfc	str x9,[x0, #0x10]!
00c1cc00	ldurh w8,[x0, #0x9]
00c1cc04	mov w9,#0x33
00c1cc08	stp x20,x21,[x0, #0x10]
00c1cc0c	and w8,w8,#0xf000
00c1cc10	strb w9,[x0, #0x8]
00c1cc14	orr w8,w8,w10
00c1cc18	sturh w8,[x0, #0x9]
00c1cc1c	b 0x00c1c974
00c1cc20	mov x0,x1
00c1cc24	bl 0x00c308d0
00c1cc28	cbz x0,0x00c1d06c
00c1cc2c	cmp x22,x21
00c1cc30	b.eq 0x00c1cc48
00c1cc34	mov x1,x21
00c1cc38	mov x2,x20
00c1cc3c	mov x22,x0
00c1cc40	bl 0x00c2ff60
00c1cc44	mov x0,x22
00c1cc48	str x0,[x19, #0x298]
00c1cc4c	asr x8,x20,#0x2
00c1cc50	add x22,x0,x20
00c1cc54	add x8,x0,x8, LSL #0x3
00c1cc58	str x8,[x19, #0x2a8]
00c1cc5c	ldp x28,x8,[x19, #0x10]
00c1cc60	add x20,x25,#0x10
00c1cc64	str x20,[x22], #0x8
00c1cc68	str x22,[x19, #0x2a0]
00c1cc6c	str x8,[sp, #0x8]
00c1cc70	subs x8,x23,x24
00c1cc74	b.eq 0x00c1cd60
00c1cc78	add x25,x19,#0x28
00c1cc7c	adrp x21,0x2a9000
00c1cc80	add x21,x21,#0xfe
00c1cc84	b 0x00c1ccc0
00c1cc88	mov x0,x23
00c1cc8c	bl 0x00c30950
00c1cc90	str x0,[x19, #0x10]
00c1cc94	cbz x0,0x00c1d01c
00c1cc98	asr x8,x22,#0x2
00c1cc9c	add x27,x0,x22
00c1cca0	add x8,x0,x8, LSL #0x3
00c1cca4	mov x0,x26
00c1cca8	str x8,[x19, #0x20]
00c1ccac	ldp x24,x8,[x19]
00c1ccb0	str x0,[x27], #0x8
00c1ccb4	str x27,[x19, #0x18]
00c1ccb8	subs x8,x8,x24
00c1ccbc	b.eq 0x00c1cd60
00c1ccc0	ldrb w9,[x24]
00c1ccc4	cmp w9,#0x54
00c1ccc8	b.ne 0x00c1cd60
00c1cccc	cmp x8,#0x2
00c1ccd0	b.cc 0x00c1ccdc
00c1ccd4	ldrb w1,[x24, #0x1]
00c1ccd8	b 0x00c1cce0
00c1ccdc	mov w1,wzr
00c1cce0	mov x0,x21
00c1cce4	mov w2,#0x5
00c1cce8	bl 0x00c300a0
00c1ccec	cbz x0,0x00c1cd60
00c1ccf0	sub x8,x0,x21
00c1ccf4	cmn x8,#0x1
00c1ccf8	b.eq 0x00c1cd60
00c1ccfc	mov x0,x19
00c1cd00	mov x1,x20
00c1cd04	bl 0x00c1ddc8
00c1cd08	cbz x0,0x00c1cfc8
00c1cd0c	ldp x27,x8,[x19, #0x18]
00c1cd10	cmp x27,x8
00c1cd14	b.ne 0x00c1ccac
00c1cd18	ldr x23,[x19, #0x10]
00c1cd1c	mov x26,x0
00c1cd20	sub x22,x27,x23
00c1cd24	cmp x23,x25
00c1cd28	lsl x1,x22,#0x1
00c1cd2c	b.ne 0x00c1cc88
00c1cd30	mov x0,x1
00c1cd34	bl 0x00c308d0
00c1cd38	cbz x0,0x00c1d040
00c1cd3c	cmp x27,x25
00c1cd40	b.eq 0x00c1cd58
00c1cd44	mov x1,x23
00c1cd48	mov x2,x22
00c1cd4c	mov x24,x0
00c1cd50	bl 0x00c2ff60
00c1cd54	mov x0,x24
00c1cd58	str x0,[x19, #0x10]
00c1cd5c	b 0x00c1cc98
00c1cd60	ldr x8,[sp, #0x8]
00c1cd64	mov x0,x19
00c1cd68	sub x8,x8,x28
00c1cd6c	asr x20,x8,#0x3
00c1cd70	mov x1,x20
00c1cd74	bl 0x00c13140
00c1cd78	stp x0,x1,[sp, #0x50]
00c1cd7c	cbnz x1,0x00c1cd98
00c1cd80	ldr x8,[x19, #0x2a0]
00c1cd84	ldr x9,[x19, #0x298]
00c1cd88	cmp x8,x9
00c1cd8c	b.eq 0x00c1d048
00c1cd90	sub x8,x8,#0x8
00c1cd94	str x8,[x19, #0x2a0]
00c1cd98	ldp x8,x9,[x19]
00c1cd9c	str xzr,[sp, #0x48]
00c1cda0	cmp x8,x9
00c1cda4	b.eq 0x00c1ce00
00c1cda8	ldrb w10,[x8]
00c1cdac	cmp w10,#0x51
00c1cdb0	b.ne 0x00c1cde0
00c1cdb4	ldrb w21,[x19, #0x30a]
00c1cdb8	add x8,x8,#0x1
00c1cdbc	mov w9,#0x1
00c1cdc0	str x8,[x19]
00c1cdc4	strb w9,[x19, #0x30a]
00c1cdc8	mov x0,x19
00c1cdcc	bl 0x00c16098
00c1cdd0	strb w21,[x19, #0x30a]
00c1cdd4	str x0,[sp, #0x48]
00c1cdd8	cbz x0,0x00c1cfc8
00c1cddc	ldp x8,x9,[x19]
00c1cde0	cmp x9,x8
00c1cde4	b.eq 0x00c1ce00
00c1cde8	ldrb w9,[x8]
00c1cdec	cmp w9,#0x76
00c1cdf0	b.ne 0x00c1ce00
00c1cdf4	add x8,x8,#0x1
00c1cdf8	str x8,[x19]
00c1cdfc	b 0x00c1ceb0
00c1ce00	add x24,x19,#0x28
00c1ce04	mov x0,x19
00c1ce08	bl 0x00c10bfc
00c1ce0c	cbz x0,0x00c1cfc8
00c1ce10	ldp x23,x8,[x19, #0x18]
00c1ce14	cmp x23,x8
00c1ce18	b.ne 0x00c1ce88
00c1ce1c	ldr x22,[x19, #0x10]
00c1ce20	mov x25,x0
00c1ce24	sub x21,x23,x22
00c1ce28	cmp x22,x24
00c1ce2c	lsl x1,x21,#0x1
00c1ce30	b.eq 0x00c1ce48
00c1ce34	mov x0,x22
00c1ce38	bl 0x00c30950
00c1ce3c	str x0,[x19, #0x10]
00c1ce40	cbnz x0,0x00c1ce74
00c1ce44	b 0x00c1d014
00c1ce48	mov x0,x1
00c1ce4c	bl 0x00c308d0
00c1ce50	cbz x0,0x00c1d018
00c1ce54	cmp x23,x24
00c1ce58	b.eq 0x00c1ce70
00c1ce5c	mov x1,x22
00c1ce60	mov x2,x21
00c1ce64	mov x23,x0
00c1ce68	bl 0x00c2ff60
00c1ce6c	mov x0,x23
00c1ce70	str x0,[x19, #0x10]
00c1ce74	asr x8,x21,#0x2
00c1ce78	add x23,x0,x21
00c1ce7c	add x8,x0,x8, LSL #0x3
00c1ce80	mov x0,x25
00c1ce84	str x8,[x19, #0x20]
00c1ce88	ldp x8,x9,[x19]
00c1ce8c	str x0,[x23], #0x8
00c1ce90	str x23,[x19, #0x18]
00c1ce94	cmp x9,x8
00c1ce98	b.eq 0x00c1ce04
00c1ce9c	ldrb w8,[x8]
00c1cea0	cmp w8,#0x51
00c1cea4	b.eq 0x00c1ceb0
00c1cea8	cmp w8,#0x45
00c1ceac	b.ne 0x00c1ce04
00c1ceb0	mov x0,x19
00c1ceb4	mov x1,x20
00c1ceb8	bl 0x00c13140
00c1cebc	ldp x9,x8,[x19]
00c1cec0	stp x0,x1,[sp, #0x38]
00c1cec4	str xzr,[sp, #0x30]
00c1cec8	cmp x9,x8
00c1cecc	b.eq 0x00c1cfc4
00c1ced0	ldrb w10,[x9]
00c1ced4	cmp w10,#0x51
00c1ced8	b.ne 0x00c1cf08
00c1cedc	ldrb w21,[x19, #0x30a]
00c1cee0	add x8,x9,#0x1
00c1cee4	mov w9,#0x1
00c1cee8	str x8,[x19]
00c1ceec	strb w9,[x19, #0x30a]
00c1cef0	mov x0,x19
00c1cef4	bl 0x00c16098
00c1cef8	strb w21,[x19, #0x30a]
00c1cefc	str x0,[sp, #0x30]
00c1cf00	cbz x0,0x00c1cfc8
00c1cf04	ldp x9,x8,[x19]
00c1cf08	cmp x9,x8
00c1cf0c	b.eq 0x00c1cfc4
00c1cf10	ldrb w10,[x9]
00c1cf14	cmp w10,#0x45
00c1cf18	b.ne 0x00c1cfc4
00c1cf1c	add x9,x9,#0x1
00c1cf20	cmp x8,x9
00c1cf24	str x9,[x19]
00c1cf28	b.eq 0x00c1cf3c
00c1cf2c	ldrb w10,[x9]
00c1cf30	sub w10,w10,#0x3a
00c1cf34	cmn w10,#0xa
00c1cf38	b.cs 0x00c1cf48
00c1cf3c	mov x11,xzr
00c1cf40	mov x12,xzr
00c1cf44	b 0x00c1cf84
00c1cf48	mov x10,x9
00c1cf4c	ldrb w11,[x10]
00c1cf50	sub w11,w11,#0x3a
00c1cf54	cmn w11,#0xa
00c1cf58	b.cc 0x00c1cf74
00c1cf5c	add x10,x10,#0x1
00c1cf60	cmp x10,x8
00c1cf64	str x10,[x19]
00c1cf68	b.ne 0x00c1cf4c
00c1cf6c	mov x12,x8
00c1cf70	b 0x00c1cf78
00c1cf74	mov x12,x10
00c1cf78	mov x11,x9
00c1cf7c	sub x12,x12,x9
00c1cf80	mov x9,x10
00c1cf84	cmp x9,x8
00c1cf88	stp x11,x12,[sp, #0x20]
00c1cf8c	b.eq 0x00c1cfc4
00c1cf90	ldrb w8,[x9]
00c1cf94	cmp w8,#0x5f
00c1cf98	b.ne 0x00c1cfc4
00c1cf9c	add x8,x9,#0x1
00c1cfa0	add x1,sp,#0x50
00c1cfa4	add x2,sp,#0x48
00c1cfa8	add x3,sp,#0x38
00c1cfac	add x4,sp,#0x30
00c1cfb0	add x5,sp,#0x20
00c1cfb4	mov x0,x19
00c1cfb8	str x8,[x19]
00c1cfbc	bl 0x00c1e714
00c1cfc0	b 0x00c1cfc8
00c1cfc4	mov x0,xzr
00c1cfc8	ldp x9,x10,[sp, #0x60]
00c1cfcc	ldr x8,[x9, #0x2a0]
00c1cfd0	ldr x11,[x9, #0x298]
00c1cfd4	sub x8,x8,x11
00c1cfd8	cmp x10,x8, ASR #0x3
00c1cfdc	b.hi 0x00c1d020
00c1cfe0	ldr x8,[sp, #0x70]
00c1cfe4	add x10,x11,x10, LSL #0x3
00c1cfe8	ldr x11,[sp, #0x10]
00c1cfec	cmp x8,x11
00c1cff0	str x10,[x9, #0x2a0]
00c1cff4	b.eq 0x00c1d008
00c1cff8	mov x20,x0
00c1cffc	mov x0,x8
00c1d000	bl 0x00c30960
00c1d004	mov x0,x20
00c1d008	ldr x8,[sp, #0x18]
00c1d00c	str x8,[x19, #0x310]
00c1d010	b 0x00c1c974
00c1d014	bl 0x00c30b40
00c1d018	bl 0x00c30b40
00c1d01c	bl 0x00c30b40
00c1d020	adrp x0,0x29f000
00c1d024	add x0,x0,#0x357
00c1d028	adrp x1,0x2c0000
00c1d02c	add x1,x1,#0xcf7
00c1d030	adrp x3,0x2ab000
00c1d034	add x3,x3,#0x32c
00c1d038	mov w2,#0xac7
00c1d03c	bl 0x00c0de94
00c1d040	bl 0x00c30b40
00c1d044	bl 0x00c2fff0
00c1d048	adrp x0,0x29f000
00c1d04c	add x0,x0,#0x357
00c1d050	adrp x1,0x2c0000
00c1d054	add x1,x1,#0xcf7
00c1d058	adrp x3,0x2ae000
00c1d05c	add x3,x3,#0xebe
00c1d060	mov w2,#0x81
00c1d064	bl 0x00c0de94
00c1d068	bl 0x00c30b40
00c1d06c	bl 0x00c30b40
