; Camellia_Ekeygen @ 00a8ed10
00a8ed10	sub sp,sp,#0x70
00a8ed14	stp x28,x27,[sp, #0x10]
00a8ed18	stp x26,x25,[sp, #0x20]
00a8ed1c	stp x24,x23,[sp, #0x30]
00a8ed20	stp x22,x21,[sp, #0x40]
00a8ed24	stp x20,x19,[sp, #0x50]
00a8ed28	stp x29,x30,[sp, #0x60]
00a8ed2c	ldrb w8,[x1]
00a8ed30	ldrb w13,[x1, #0x1]
00a8ed34	ldrb w10,[x1, #0x2]
00a8ed38	ldrb w11,[x1, #0x3]
00a8ed3c	lsl w9,w8,#0x18
00a8ed40	bfm w9,w13,#0x10,#0x7
00a8ed44	mov w8,w9
00a8ed48	bfm w8,w10,#0x18,#0x7
00a8ed4c	orr w10,w8,w11
00a8ed50	str w10,[x2]
00a8ed54	ldrb w8,[x1, #0x4]
00a8ed58	ldrb w16,[x1, #0x5]
00a8ed5c	ldrb w11,[x1, #0x6]
00a8ed60	ldrb w14,[x1, #0x7]
00a8ed64	lsl w12,w8,#0x18
00a8ed68	bfm w12,w16,#0x10,#0x7
00a8ed6c	mov w8,w12
00a8ed70	bfm w8,w11,#0x18,#0x7
00a8ed74	orr w11,w8,w14
00a8ed78	str w11,[x2, #0x4]
00a8ed7c	ldrb w8,[x1, #0x8]
00a8ed80	ldrb w17,[x1, #0x9]
00a8ed84	ldrb w14,[x1, #0xa]
00a8ed88	ldrb w15,[x1, #0xb]
00a8ed8c	lsl w18,w8,#0x18
00a8ed90	bfm w18,w17,#0x10,#0x7
00a8ed94	mov w8,w18
00a8ed98	bfm w8,w14,#0x18,#0x7
00a8ed9c	orr w14,w8,w15
00a8eda0	str w14,[x2, #0x8]
00a8eda4	ldrb w15,[x1, #0xc]
00a8eda8	ldrb w8,[x1, #0xd]
00a8edac	ldrb w4,[x1, #0xe]
00a8edb0	ldrb w5,[x1, #0xf]
00a8edb4	lsl w3,w15,#0x18
00a8edb8	bfm w3,w8,#0x10,#0x7
00a8edbc	mov w15,w3
00a8edc0	bfm w15,w4,#0x18,#0x7
00a8edc4	orr w15,w15,w5
00a8edc8	cmp w0,#0x80
00a8edcc	str w15,[x2, #0xc]
00a8edd0	b.ne 0x00a8ede8
00a8edd4	mov w7,w15
00a8edd8	mov w6,w14
00a8eddc	mov w20,w11
00a8ede0	mov w19,w10
00a8ede4	b 0x00a8ee40
00a8ede8	ldr w4,[x1, #0x10]
00a8edec	cmp w0,#0xc0
00a8edf0	rev w4,w4
00a8edf4	str w4,[x2, #0x20]
00a8edf8	ldr w5,[x1, #0x14]
00a8edfc	rev w5,w5
00a8ee00	str w5,[x2, #0x24]
00a8ee04	b.ne 0x00a8ee18
00a8ee08	mvn w6,w4
00a8ee0c	str w6,[x2, #0x28]
00a8ee10	mvn w1,w5
00a8ee14	b 0x00a8ee2c
00a8ee18	ldr w6,[x1, #0x18]
00a8ee1c	rev w6,w6
00a8ee20	str w6,[x2, #0x28]
00a8ee24	ldr w1,[x1, #0x1c]
00a8ee28	rev w1,w1
00a8ee2c	eor w19,w4,w10
00a8ee30	eor w20,w5,w11
00a8ee34	eor w6,w6,w14
00a8ee38	eor w7,w1,w15
00a8ee3c	str w1,[x2, #0x2c]
00a8ee40	mov w4,#0x667f
00a8ee44	movk w4,#0xa09e, LSL #16
00a8ee48	adrp x1,0x76b000
00a8ee4c	add x1,x1,#0x5a0
00a8ee50	eor w22,w19,w4
00a8ee54	add x5,x1,#0x400
00a8ee58	add x4,x1,#0xc00
00a8ee5c	and w23,w22,#0xff
00a8ee60	ubfx w24,w22,#0x8,#0x8
00a8ee64	ldr w23,[x5, w23, UXTW #0x2]
00a8ee68	ldr w24,[x4, w24, UXTW #0x2]
00a8ee6c	cmp w0,#0x80
00a8ee70	add x0,x1,#0x800
00a8ee74	mov w21,#0x908b
00a8ee78	eor w23,w24,w23
00a8ee7c	ubfx w24,w22,#0x10,#0x8
00a8ee80	ldr w24,[x0, w24, UXTW #0x2]
00a8ee84	lsr w22,w22,#0x18
00a8ee88	movk w21,#0x3bcc, LSL #16
00a8ee8c	ldr w22,[x1, w22, UXTW #0x2]
00a8ee90	eor w21,w20,w21
00a8ee94	and w25,w21,#0xff
00a8ee98	ubfx w26,w21,#0x8,#0x8
00a8ee9c	ldr w25,[x1, w25, UXTW #0x2]
00a8eea0	ldr w26,[x5, w26, UXTW #0x2]
00a8eea4	eor w23,w23,w24
00a8eea8	eor w22,w23,w22
00a8eeac	ubfx w23,w21,#0x10,#0x8
00a8eeb0	lsr w21,w21,#0x18
00a8eeb4	ldr w23,[x4, w23, UXTW #0x2]
00a8eeb8	ldr w21,[x0, w21, UXTW #0x2]
00a8eebc	eor w25,w26,w25
00a8eec0	eor w25,w25,w22
00a8eec4	eor w7,w7,w22, ROR #0x8
00a8eec8	eor w22,w25,w23
00a8eecc	mov w26,#0xe858
00a8eed0	eor w21,w22,w21
00a8eed4	movk w26,#0xb67a, LSL #16
00a8eed8	eor w6,w21,w6
00a8eedc	eor w7,w7,w21
00a8eee0	eor w21,w6,w26
00a8eee4	and w22,w21,#0xff
00a8eee8	ubfx w23,w21,#0x8,#0x8
00a8eeec	ldr w22,[x5, w22, UXTW #0x2]
00a8eef0	ldr w23,[x4, w23, UXTW #0x2]
00a8eef4	ubfx w26,w21,#0x10,#0x8
00a8eef8	mov w24,#0x73b2
00a8eefc	lsr w21,w21,#0x18
00a8ef00	ldr w26,[x0, w26, UXTW #0x2]
00a8ef04	movk w24,#0x4caa, LSL #16
00a8ef08	ldr w21,[x1, w21, UXTW #0x2]
00a8ef0c	eor w24,w7,w24
00a8ef10	and w25,w24,#0xff
00a8ef14	eor w22,w23,w22
00a8ef18	ubfx w23,w24,#0x8,#0x8
00a8ef1c	ldr w25,[x1, w25, UXTW #0x2]
00a8ef20	ldr w23,[x5, w23, UXTW #0x2]
00a8ef24	eor w22,w22,w26
00a8ef28	eor w21,w22,w21
00a8ef2c	ubfx w22,w24,#0x10,#0x8
00a8ef30	lsr w24,w24,#0x18
00a8ef34	ldr w22,[x4, w22, UXTW #0x2]
00a8ef38	ldr w24,[x0, w24, UXTW #0x2]
00a8ef3c	eor w23,w23,w25
00a8ef40	eor w20,w20,w11
00a8ef44	eor w23,w23,w21
00a8ef48	eor w20,w20,w21, ROR #0x8
00a8ef4c	eor w21,w23,w22
00a8ef50	eor w19,w19,w10
00a8ef54	mov w25,#0x372f
00a8ef58	eor w21,w21,w24
00a8ef5c	movk w25,#0xc6ef, LSL #16
00a8ef60	eor w19,w19,w21
00a8ef64	eor w20,w20,w21
00a8ef68	eor w21,w19,w25
00a8ef6c	and w23,w21,#0xff
00a8ef70	ubfx w24,w21,#0x8,#0x8
00a8ef74	ldr w23,[x5, w23, UXTW #0x2]
00a8ef78	ldr w24,[x4, w24, UXTW #0x2]
00a8ef7c	mov w26,#0x82be
00a8ef80	movk w26,#0xe94f, LSL #16
00a8ef84	eor w22,w20,w26
00a8ef88	eor w23,w24,w23
00a8ef8c	ubfx w24,w21,#0x10,#0x8
00a8ef90	ldr w24,[x0, w24, UXTW #0x2]
00a8ef94	lsr w21,w21,#0x18
00a8ef98	ldr w21,[x1, w21, UXTW #0x2]
00a8ef9c	and w25,w22,#0xff
00a8efa0	ubfx w26,w22,#0x8,#0x8
00a8efa4	ldr w25,[x1, w25, UXTW #0x2]
00a8efa8	ldr w26,[x5, w26, UXTW #0x2]
00a8efac	eor w23,w23,w24
00a8efb0	eor w21,w23,w21
00a8efb4	ubfx w23,w22,#0x10,#0x8
00a8efb8	lsr w22,w22,#0x18
00a8efbc	ldr w23,[x4, w23, UXTW #0x2]
00a8efc0	ldr w22,[x0, w22, UXTW #0x2]
00a8efc4	eor w25,w26,w25
00a8efc8	eor w7,w7,w15
00a8efcc	eor w25,w25,w21
00a8efd0	eor w21,w7,w21, ROR #0x8
00a8efd4	eor w7,w25,w23
00a8efd8	mov w26,#0x53a5
00a8efdc	eor w6,w6,w14
00a8efe0	eor w22,w7,w22
00a8efe4	movk w26,#0x54ff, LSL #16
00a8efe8	mov w24,#0x6f1c
00a8efec	eor w7,w6,w22
00a8eff0	movk w24,#0xf1d3, LSL #16
00a8eff4	eor w6,w21,w22
00a8eff8	eor w21,w7,w26
00a8effc	eor w22,w6,w24
00a8f000	and w23,w21,#0xff
00a8f004	ubfx w24,w21,#0x8,#0x8
00a8f008	ldr w23,[x5, w23, UXTW #0x2]
00a8f00c	ldr w24,[x4, w24, UXTW #0x2]
00a8f010	and w25,w22,#0xff
00a8f014	ubfx w26,w22,#0x8,#0x8
00a8f018	ldr w25,[x1, w25, UXTW #0x2]
00a8f01c	ldr w26,[x5, w26, UXTW #0x2]
00a8f020	eor w23,w24,w23
00a8f024	ubfx w24,w21,#0x10,#0x8
00a8f028	lsr w21,w21,#0x18
00a8f02c	ldr w24,[x0, w24, UXTW #0x2]
00a8f030	ldr w21,[x1, w21, UXTW #0x2]
00a8f034	eor w25,w26,w25
00a8f038	ubfx w26,w22,#0x10,#0x8
00a8f03c	lsr w22,w22,#0x18
00a8f040	ldr w26,[x4, w26, UXTW #0x2]
00a8f044	ldr w22,[x0, w22, UXTW #0x2]
00a8f048	eor w23,w23,w24
00a8f04c	eor w21,w23,w21
00a8f050	eor w23,w25,w21
00a8f054	eor w21,w20,w21, ROR #0x8
00a8f058	eor w20,w23,w26
00a8f05c	eor w22,w20,w22
00a8f060	eor w20,w22,w19
00a8f064	eor w19,w21,w22
00a8f068	b.ne 0x00a8f208
00a8f06c	stp w20,w19,[x2, #0x10]
00a8f070	stp w7,w6,[x2, #0x18]
00a8f074	extr w5,w20,w19,#0x11
00a8f078	extr w4,w19,w7,#0x11
00a8f07c	extr w1,w7,w6,#0x11
00a8f080	extr w21,w6,w20,#0x11
00a8f084	lsr w8,w20,#0x2
00a8f088	lsr w13,w19,#0x2
00a8f08c	lsr w16,w7,#0x2
00a8f090	lsr w17,w6,#0x2
00a8f094	lsr w6,w9,#0x11
00a8f098	lsr w7,w12,#0x11
00a8f09c	extr w10,w10,w12,#0x11
00a8f0a0	lsr w19,w18,#0x11
00a8f0a4	extr w11,w11,w18,#0x11
00a8f0a8	lsr w18,w3,#0x11
00a8f0ac	extr w3,w14,w3,#0x11
00a8f0b0	extr w9,w15,w9,#0x11
00a8f0b4	mov w20,w13
00a8f0b8	lsl w25,w8,#0xf
00a8f0bc	stp w3,w9,[x2, #0x28]
00a8f0c0	lsr w26,w10,#0x2
00a8f0c4	extr w7,w7,w11,#0x2
00a8f0c8	extr w18,w18,w9,#0x2
00a8f0cc	lsr w9,w9,#0x2
00a8f0d0	extr w6,w6,w10,#0x2
00a8f0d4	stp w5,w4,[x2, #0x30]
00a8f0d8	mov w23,w8
00a8f0dc	lsl w24,w17,#0xf
00a8f0e0	stp w10,w11,[x2, #0x20]
00a8f0e4	extr w19,w19,w3,#0x2
00a8f0e8	lsr w3,w3,#0x2
00a8f0ec	bfm w20,w5,#0x11,#0x10
00a8f0f0	bfxil w25,w5,#0x2,#0xf
00a8f0f4	extr w10,w9,w6,#0x11
00a8f0f8	extr w5,w26,w7,#0x11
00a8f0fc	stp w1,w21,[x2, #0x38]
00a8f100	lsr w11,w11,#0x2
00a8f104	bfm w23,w21,#0x11,#0x10
00a8f108	bfxil w24,w21,#0x2,#0xf
00a8f10c	lsr w21,w18,#0xf
00a8f110	extr w3,w3,w18,#0xf
00a8f114	stp w10,w5,[x2, #0x68]
00a8f118	lsr w5,w6,#0xf
00a8f11c	extr w9,w9,w6,#0xf
00a8f120	extr w26,w26,w7,#0xf
00a8f124	mov w22,w16
00a8f128	stp w3,w9,[x2, #0x90]
00a8f12c	extr w10,w21,w9,#0xf
00a8f130	lsr w21,w7,#0xf
00a8f134	extr w11,w11,w19,#0xf
00a8f138	extr w9,w5,w26,#0xf
00a8f13c	mov w5,w17
00a8f140	stp w26,w11,[x2, #0x98]
00a8f144	extr w11,w21,w11,#0xf
00a8f148	bfm w22,w4,#0x11,#0x10
00a8f14c	lsr w4,w4,#0x2
00a8f150	bfm w5,w1,#0x11,#0x10
00a8f154	lsr w21,w1,#0x2
00a8f158	stp w19,w18,[x2, #0x80]
00a8f15c	stp w18,w6,[x2, #0x58]
00a8f160	stp w6,w7,[x2, #0x88]
00a8f164	stp w7,w19,[x2, #0x50]
00a8f168	lsl w18,w19,#0x2
00a8f16c	stp w5,w23,[x2, #0x48]
00a8f170	bfm w4,w20,#0x11,#0x10
00a8f174	bfm w21,w22,#0x11,#0x10
00a8f178	lsr w6,w20,#0x2
00a8f17c	lsr w7,w22,#0x2
00a8f180	lsr w5,w5,#0x2
00a8f184	lsr w19,w23,#0x2
00a8f188	bfm w7,w4,#0x11,#0x10
00a8f18c	bfm w5,w21,#0x11,#0x10
00a8f190	bfm w19,w24,#0x11,#0x10
00a8f194	bfm w6,w25,#0x11,#0x10
00a8f198	and w1,w18,#0xfffe0000
00a8f19c	lsr w18,w3,#0xf
00a8f1a0	stp w4,w21,[x2, #0x60]
00a8f1a4	stp w7,w5,[x2, #0x70]
00a8f1a8	stp w19,w6,[x2, #0x78]
00a8f1ac	bfm w17,w5,#0x1e,#0x1d
00a8f1b0	bfm w8,w19,#0x1e,#0x1d
00a8f1b4	bfm w13,w6,#0x1e,#0x1d
00a8f1b8	bfm w16,w7,#0x1e,#0x1d
00a8f1bc	lsr w3,w5,#0xd
00a8f1c0	lsr w4,w19,#0xd
00a8f1c4	lsr w5,w6,#0xd
00a8f1c8	lsr w6,w7,#0xd
00a8f1cc	bfm w4,w17,#0xf,#0xe
00a8f1d0	bfm w5,w8,#0xf,#0xe
00a8f1d4	bfm w6,w13,#0xf,#0xe
00a8f1d8	bfm w3,w16,#0xf,#0xe
00a8f1dc	orr w0,wzr,#0x3
00a8f1e0	mov w12,#0x2f
00a8f1e4	mov w14,#0x2e
00a8f1e8	mov w15,#0x2d
00a8f1ec	stp w20,w22,[x2, #0x40]
00a8f1f0	stp w17,w8,[x2, #0xa0]
00a8f1f4	stp w13,w16,[x2, #0xa8]
00a8f1f8	stp w4,w5,[x2, #0xc0]
00a8f1fc	stp w6,w3,[x2, #0xc8]
00a8f200	mov w8,#0x2c
00a8f204	b 0x00a8f53c
00a8f208	extr w25,w11,w18,#0x13
00a8f20c	extr w18,w14,w3,#0x13
00a8f210	lsr w3,w11,#0x4
00a8f214	lsr w27,w14,#0x4
00a8f218	lsr w23,w7,#0x11
00a8f21c	lsr w24,w6,#0x11
00a8f220	extr w26,w7,w6,#0x11
00a8f224	stp w25,w18,[x2, #0x60]
00a8f228	lsl w28,w18,#0xf
00a8f22c	bfm w18,w27,#0xf,#0xe
00a8f230	lsl w27,w25,#0xf
00a8f234	bfm w25,w3,#0xf,#0xe
00a8f238	extr w3,w6,w20,#0x11
00a8f23c	stp w7,w6,[x2, #0x38]
00a8f240	stp w26,w3,[x2, #0x38]
00a8f244	extr w23,w23,w26,#0x2
00a8f248	lsr w26,w26,#0x2
00a8f24c	extr w24,w24,w3,#0x2
00a8f250	lsr w22,w20,#0x11
00a8f254	stp w23,w24,[x2, #0xc0]
00a8f258	extr w26,w26,w24,#0xf
00a8f25c	stp w23,w24,[x2, #0x74]
00a8f260	extr w24,w20,w19,#0x11
00a8f264	lsr w3,w3,#0x2
00a8f268	extr w22,w22,w24,#0x2
00a8f26c	lsr w21,w19,#0x11
00a8f270	str w22,[x2, #0x7c]
00a8f274	str w22,[x2, #0xc8]
00a8f278	extr w3,w3,w22,#0xf
00a8f27c	extr w22,w19,w7,#0x11
00a8f280	stp w20,w19,[x2, #0x30]
00a8f284	stp w24,w22,[x2, #0x30]
00a8f288	lsr w24,w24,#0x2
00a8f28c	extr w21,w21,w22,#0x2
00a8f290	lsr w22,w22,#0x2
00a8f294	extr w29,w15,w9,#0x13
00a8f298	extr w12,w10,w12,#0x13
00a8f29c	str w21,[x2, #0x70]
00a8f2a0	str w21,[x2, #0xcc]
00a8f2a4	extr w21,w24,w21,#0xf
00a8f2a8	extr w22,w22,w23,#0xf
00a8f2ac	ldp w23,w24,[x2, #0x20]
00a8f2b0	stp w29,w12,[x2, #0x68]
00a8f2b4	str w8,[sp, #0xc]
00a8f2b8	ldp w30,w8,[x2, #0x28]
00a8f2bc	bfxil w27,w14,#0x4,#0xf
00a8f2c0	lsr w10,w10,#0x4
00a8f2c4	lsl w14,w12,#0xf
00a8f2c8	lsr w9,w15,#0x4
00a8f2cc	bfxil w28,w15,#0x4,#0xf
00a8f2d0	bfm w12,w10,#0xf,#0xe
00a8f2d4	mov w15,w10
00a8f2d8	bfxil w14,w11,#0x4,#0xf
00a8f2dc	lsr w11,w17,#0x1
00a8f2e0	stp w21,w22,[x2, #0xe8]
00a8f2e4	lsr w22,w8,#0x2
00a8f2e8	bfm w15,w29,#0x11,#0x10
00a8f2ec	bfm w29,w9,#0xf,#0xe
00a8f2f0	lsr w9,w16,#0x1
00a8f2f4	stp w12,w25,[x2, #0xb8]
00a8f2f8	bfm w11,w25,#0x1e,#0x1d
00a8f2fc	stp w26,w3,[x2, #0xe0]
00a8f300	extr w3,w30,w8,#0x11
00a8f304	mov w25,w22
00a8f308	bfm w9,w12,#0x1e,#0x1d
00a8f30c	mov w12,#0x27fa
00a8f310	extr w17,w24,w30,#0x11
00a8f314	lsr w21,w30,#0x2
00a8f318	bfm w25,w3,#0x11,#0x10
00a8f31c	movk w12,#0x10e5, LSL #16
00a8f320	mov w16,#0x2d1d
00a8f324	lsr w10,w13,#0x1
00a8f328	stp w15,w14,[x2, #0x88]
00a8f32c	eor w13,w23,w20
00a8f330	extr w15,w23,w24,#0x11
00a8f334	lsr w20,w24,#0x2
00a8f338	str w3,[x2, #0x28]
00a8f33c	extr w3,w21,w25,#0x2
00a8f340	bfm w21,w17,#0x11,#0x10
00a8f344	movk w16,#0xde68, LSL #16
00a8f348	eor w14,w24,w19
00a8f34c	eor w12,w13,w12
00a8f350	stp w15,w17,[x2, #0x20]
00a8f354	extr w17,w20,w21,#0x2
00a8f358	stp w27,w28,[x2, #0x80]
00a8f35c	str w29,[x2, #0xb4]
00a8f360	eor w16,w14,w16
00a8f364	and w26,w12,#0xff
00a8f368	bfm w20,w15,#0x11,#0x10
00a8f36c	ubfx w15,w12,#0x8,#0x8
00a8f370	str w17,[x2, #0x90]
00a8f374	and w17,w16,#0xff
00a8f378	ldr w26,[x5, w26, UXTW #0x2]
00a8f37c	ldr w15,[x4, w15, UXTW #0x2]
00a8f380	str w3,[x2, #0x94]
00a8f384	ubfx w3,w16,#0x8,#0x8
00a8f388	ldr w17,[x1, w17, UXTW #0x2]
00a8f38c	ldr w3,[x5, w3, UXTW #0x2]
00a8f390	extr w19,w8,w23,#0x11
00a8f394	eor w15,w15,w26
00a8f398	lsr w26,w23,#0x2
00a8f39c	str w19,[x2, #0x2c]
00a8f3a0	eor w17,w3,w17
00a8f3a4	extr w3,w26,w20,#0x2
00a8f3a8	bfm w26,w19,#0x11,#0x10
00a8f3ac	ubfx w19,w12,#0x10,#0x8
00a8f3b0	ldr w19,[x0, w19, UXTW #0x2]
00a8f3b4	stp w20,w21,[x2, #0x40]
00a8f3b8	eor w6,w8,w6
00a8f3bc	stp w25,w26,[x2, #0x48]
00a8f3c0	bfxil w25,w8,#0x2,#0x2
00a8f3c4	lsr w8,w12,#0x18
00a8f3c8	bfxil w20,w24,#0x2,#0x2
00a8f3cc	bfxil w21,w30,#0x2,#0x2
00a8f3d0	ldr w8,[x1, w8, UXTW #0x2]
00a8f3d4	extr w12,w22,w26,#0x2
00a8f3d8	bfxil w26,w23,#0x2,#0x2
00a8f3dc	stp w20,w21,[x2, #0xd8]
00a8f3e0	stp w12,w3,[x2, #0x98]
00a8f3e4	stp w25,w26,[x2, #0xd0]
00a8f3e8	ubfx w3,w16,#0x10,#0x8
00a8f3ec	lsr w16,w16,#0x18
00a8f3f0	ldr w3,[x4, w3, UXTW #0x2]
00a8f3f4	eor w15,w15,w19
00a8f3f8	ldr w16,[x0, w16, UXTW #0x2]
00a8f3fc	eor w8,w15,w8
00a8f400	eor w17,w17,w8
00a8f404	eor w17,w17,w3
00a8f408	eor w7,w30,w7
00a8f40c	mov w12,#0x88c2
00a8f410	mov w15,#0xc1fd
00a8f414	eor w8,w6,w8, ROR #0x8
00a8f418	eor w16,w17,w16
00a8f41c	movk w12,#0xb056, LSL #16
00a8f420	movk w15,#0xb3e6, LSL #16
00a8f424	eor w17,w7,w16
00a8f428	eor w8,w8,w16
00a8f42c	eor w12,w17,w12
00a8f430	eor w15,w8,w15
00a8f434	and w16,w12,#0xff
00a8f438	ubfx w3,w12,#0x8,#0x8
00a8f43c	ubfx w7,w15,#0x8,#0x8
00a8f440	ldr w16,[x5, w16, UXTW #0x2]
00a8f444	ldr w5,[x5, w7, UXTW #0x2]
00a8f448	lsr w7,w12,#0x18
00a8f44c	ldr w3,[x4, w3, UXTW #0x2]
00a8f450	ubfx w12,w12,#0x10,#0x8
00a8f454	and w6,w15,#0xff
00a8f458	ldr w12,[x0, w12, UXTW #0x2]
00a8f45c	ldr w6,[x1, w6, UXTW #0x2]
00a8f460	ldr w1,[x1, w7, UXTW #0x2]
00a8f464	ubfx w7,w15,#0x10,#0x8
00a8f468	ldr w4,[x4, w7, UXTW #0x2]
00a8f46c	lsr w15,w15,#0x18
00a8f470	eor w16,w3,w16
00a8f474	ldr w15,[x0, w15, UXTW #0x2]
00a8f478	eor w12,w16,w12
00a8f47c	eor w0,w5,w6
00a8f480	eor w12,w12,w1
00a8f484	eor w16,w0,w12
00a8f488	eor w12,w14,w12, ROR #0x8
00a8f48c	eor w14,w16,w4
00a8f490	eor w14,w14,w15
00a8f494	eor w13,w14,w13
00a8f498	stp w17,w8,[x2, #0x18]
00a8f49c	lsr w16,w8,#0x2
00a8f4a0	extr w15,w17,w8,#0x2
00a8f4a4	extr w8,w8,w13,#0x2
00a8f4a8	eor w12,w12,w14
00a8f4ac	lsr w14,w15,#0x2
00a8f4b0	extr w16,w16,w8,#0x2
00a8f4b4	str w16,[x2, #0xa8]
00a8f4b8	extr w14,w14,w16,#0xd
00a8f4bc	lsr w16,w17,#0x2
00a8f4c0	extr w16,w16,w15,#0x2
00a8f4c4	stp w13,w12,[x2, #0x10]
00a8f4c8	stp w15,w8,[x2, #0x58]
00a8f4cc	lsr w15,w13,#0x2
00a8f4d0	extr w13,w13,w12,#0x2
00a8f4d4	extr w17,w12,w17,#0x2
00a8f4d8	lsr w12,w12,#0x2
00a8f4dc	lsr w8,w8,#0x2
00a8f4e0	extr w15,w15,w13,#0x2
00a8f4e4	extr w12,w12,w17,#0x2
00a8f4e8	stp w15,w18,[x2, #0xac]
00a8f4ec	extr w8,w8,w15,#0xd
00a8f4f0	lsr w15,w13,#0x2
00a8f4f4	stp w12,w16,[x2, #0xa0]
00a8f4f8	stp w13,w17,[x2, #0x50]
00a8f4fc	extr w15,w15,w12,#0xd
00a8f500	ldr w12,[sp, #0xc]
00a8f504	bfm w10,w29,#0x1e,#0x1d
00a8f508	mov w0,#0x4
00a8f50c	str w14,[x2, #0x100]
00a8f510	ubfx w1,w12,#0x1,#0x2
00a8f514	lsr w12,w17,#0x2
00a8f518	extr w13,w12,w16,#0xd
00a8f51c	orr w12,wzr,#0x3f
00a8f520	str w8,[x2, #0x104]
00a8f524	orr w14,wzr,#0x3e
00a8f528	str w15,[x2, #0x108]
00a8f52c	mov w15,#0x3d
00a8f530	lsl w18,w18,#0x2
00a8f534	orr w8,wzr,#0x3c
00a8f538	str w13,[x2, #0x10c]
00a8f53c	orr w13,w18,w1
00a8f540	str w10,[x2, x8, LSL #0x2]
00a8f544	str w9,[x2, x15, LSL #0x2]
00a8f548	str w11,[x2, x14, LSL #0x2]
00a8f54c	str w13,[x2, x12, LSL #0x2]
00a8f550	ldp x29,x30,[sp, #0x60]
00a8f554	ldp x20,x19,[sp, #0x50]
00a8f558	ldp x22,x21,[sp, #0x40]
00a8f55c	ldp x24,x23,[sp, #0x30]
00a8f560	ldp x26,x25,[sp, #0x20]
00a8f564	ldp x28,x27,[sp, #0x10]
00a8f568	add sp,sp,#0x70
00a8f56c	ret
