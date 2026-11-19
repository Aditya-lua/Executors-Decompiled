; SEED_set_key @ 00adbb3c
00adbb3c	sub sp,sp,#0x1d0
00adbb40	stp x28,x27,[sp, #0x170]
00adbb44	stp x26,x25,[sp, #0x180]
00adbb48	stp x24,x23,[sp, #0x190]
00adbb4c	stp x22,x21,[sp, #0x1a0]
00adbb50	stp x20,x19,[sp, #0x1b0]
00adbb54	stp x29,x30,[sp, #0x1c0]
00adbb58	ldrb w3,[x0]
00adbb5c	ldrb w17,[x0, #0x4]
00adbb60	ldrb w6,[x0, #0x1]
00adbb64	ldrb w18,[x0, #0x5]
00adbb68	ldrb w12,[x0, #0x2]
00adbb6c	ldrb w8,[x0, #0x6]
00adbb70	ldrb w11,[x0, #0x3]
00adbb74	ldrb w2,[x0, #0x7]
00adbb78	ldrb w9,[x0, #0x8]
00adbb7c	ldrb w15,[x0, #0x9]
00adbb80	lsl w3,w3,#0x18
00adbb84	lsl w17,w17,#0x18
00adbb88	ldrb w7,[x0, #0xa]
00adbb8c	bfm w3,w6,#0x10,#0x7
00adbb90	bfm w17,w18,#0x10,#0x7
00adbb94	ldrb w4,[x0, #0xb]
00adbb98	bfm w3,w12,#0x18,#0x7
00adbb9c	bfm w17,w8,#0x18,#0x7
00adbba0	orr w18,w3,w11
00adbba4	extr w3,w2,w3,#0x8
00adbba8	orr w2,w17,w2
00adbbac	extr w11,w11,w17,#0x8
00adbbb0	lsl w17,w9,#0x18
00adbbb4	ldrb w13,[x0, #0xc]
00adbbb8	bfm w17,w15,#0x10,#0x7
00adbbbc	ldrb w14,[x0, #0xd]
00adbbc0	bfm w17,w7,#0x18,#0x7
00adbbc4	ldrb w27,[x0, #0xe]
00adbbc8	mov w24,#0x8647
00adbbcc	orr w17,w17,w4
00adbbd0	ldrb w5,[x0, #0xf]
00adbbd4	movk w24,#0x61c8, LSL #16
00adbbd8	add w18,w18,w17
00adbbdc	add w25,w18,w24
00adbbe0	lsl w18,w13,#0x18
00adbbe4	bfm w18,w14,#0x10,#0x7
00adbbe8	bfm w18,w27,#0x18,#0x7
00adbbec	orr w18,w18,w5
00adbbf0	mov w6,#0x79b9
00adbbf4	sub w2,w2,w18
00adbbf8	movk w6,#0x9e37, LSL #16
00adbbfc	mov w30,#0xc8d
00adbc00	mov w19,#0xf373
00adbc04	add w24,w2,w6
00adbc08	mov w2,w13
00adbc0c	movk w30,#0xc391, LSL #16
00adbc10	movk w19,#0x3c6e, LSL #16
00adbc14	bfm w2,w17,#0x18,#0x17
00adbc18	add w17,w3,w17
00adbc1c	mov w22,#0x191a
00adbc20	add w6,w17,w30
00adbc24	mov w30,w9
00adbc28	add w17,w11,w19
00adbc2c	movk w22,#0x8722, LSL #16
00adbc30	mov w20,#0xe6e6
00adbc34	mov w10,#0x3234
00adbc38	bfm w30,w18,#0x18,#0x17
00adbc3c	sub w19,w17,w18
00adbc40	add w17,w3,w2
00adbc44	extr w18,w8,w3,#0x8
00adbc48	str x1,[sp, #0x158]
00adbc4c	movk w20,#0x78dd, LSL #16
00adbc50	movk w10,#0xe44, LSL #16
00adbc54	mov w1,#0xcdcc
00adbc58	add w17,w17,w22
00adbc5c	mov w22,w14
00adbc60	add w8,w18,w2
00adbc64	movk w1,#0xf1bb, LSL #16
00adbc68	bfm w22,w2,#0x18,#0x17
00adbc6c	add w2,w8,w10
00adbc70	add w8,w11,w20
00adbc74	extr w12,w12,w11,#0x8
00adbc78	sub w20,w8,w30
00adbc7c	add w8,w12,w1
00adbc80	mov w28,#0x6467
00adbc84	sub w8,w8,w30
00adbc88	movk w28,#0x1c88, LSL #16
00adbc8c	str w8,[sp, #0x130]
00adbc90	add w8,w18,w22
00adbc94	add w8,w8,w28
00adbc98	str w8,[sp, #0x164]
00adbc9c	lsr w8,w11,#0x8
00adbca0	mov w0,#0xc8cd
00adbca4	extr w8,w8,w18,#0x8
00adbca8	movk w0,#0x3910, LSL #16
00adbcac	add w11,w8,w22
00adbcb0	add w11,w11,w0
00adbcb4	mov w29,#0x9b99
00adbcb8	mov w21,#0x3733
00adbcbc	str w11,[sp, #0x168]
00adbcc0	lsr w11,w3,#0x8
00adbcc4	movk w29,#0xe377, LSL #16
00adbcc8	movk w21,#0xc6ef, LSL #16
00adbccc	mov w10,w15
00adbcd0	mov w28,w27
00adbcd4	extr w3,w11,w12,#0x8
00adbcd8	bfm w10,w30,#0x18,#0x17
00adbcdc	bfm w28,w22,#0x18,#0x17
00adbce0	mov w22,w7
00adbce4	add w0,w12,w29
00adbce8	add w11,w3,w21
00adbcec	mov w26,#0x9199
00adbcf0	sub w0,w0,w10
00adbcf4	bfm w22,w10,#0x18,#0x17
00adbcf8	sub w10,w11,w10
00adbcfc	movk w26,#0x7221, LSL #16
00adbd00	str w10,[sp, #0x160]
00adbd04	add w10,w8,w28
00adbd08	add w10,w10,w26
00adbd0c	lsr w11,w12,#0x8
00adbd10	mov w23,#0x2331
00adbd14	str w10,[sp, #0x16c]
00adbd18	mov w10,#0xdccf
00adbd1c	extr w11,w11,w8,#0x8
00adbd20	lsr w18,w18,#0x8
00adbd24	movk w23,#0xe443, LSL #16
00adbd28	movk w10,#0x1bbc, LSL #16
00adbd2c	add w12,w11,w28
00adbd30	extr w18,w18,w3,#0x8
00adbd34	add w12,w12,w23
00adbd38	add w10,w18,w10
00adbd3c	mov w16,#0x6e67
00adbd40	bfm w5,w28,#0x18,#0x17
00adbd44	str w12,[sp, #0x138]
00adbd48	mov w12,#0x4662
00adbd4c	sub w10,w10,w22
00adbd50	movk w16,#0x8dde, LSL #16
00adbd54	movk w12,#0xc886, LSL #16
00adbd58	str w10,[sp, #0x134]
00adbd5c	add w10,w11,w5
00adbd60	add w16,w3,w16
00adbd64	add w10,w10,w12
00adbd68	lsr w12,w3,#0x8
00adbd6c	sub w16,w16,w22
00adbd70	str w10,[sp, #0x13c]
00adbd74	mov w10,#0x8cc4
00adbd78	extr w12,w12,w11,#0x8
00adbd7c	str w16,[sp, #0x154]
00adbd80	movk w10,#0x910c, LSL #16
00adbd84	add w16,w12,w5
00adbd88	add w10,w16,w10
00adbd8c	str w10,[sp, #0x128]
00adbd90	mov w10,#0xb99e
00adbd94	movk w10,#0x3779, LSL #16
00adbd98	bfm w4,w22,#0x18,#0x17
00adbd9c	lsr w8,w8,#0x8
00adbda0	add w10,w18,w10
00adbda4	extr w16,w8,w18,#0x8
00adbda8	sub w8,w10,w4
00adbdac	str w8,[sp, #0x150]
00adbdb0	mov w8,#0x733c
00adbdb4	movk w8,#0x6ef3, LSL #16
00adbdb8	add w8,w16,w8
00adbdbc	sub w8,w8,w4
00adbdc0	bfm w9,w5,#0x18,#0x17
00adbdc4	str w8,[sp, #0x120]
00adbdc8	mov w8,#0x1988
00adbdcc	movk w8,#0x2219, LSL #16
00adbdd0	add w10,w12,w9
00adbdd4	add w8,w10,w8
00adbdd8	str w8,[sp, #0x124]
00adbddc	lsr w8,w18,#0x8
00adbde0	extr w8,w8,w12,#0x8
00adbde4	mov w10,#0x330f
00adbde8	bfm w15,w9,#0x18,#0x17
00adbdec	add w9,w8,w9
00adbdf0	movk w10,#0x4432, LSL #16
00adbdf4	add w9,w9,w10
00adbdf8	mov w10,#0xe678
00adbdfc	movk w10,#0xdde6, LSL #16
00adbe00	bfm w13,w4,#0x18,#0x17
00adbe04	add w10,w16,w10
00adbe08	sub w10,w10,w13
00adbe0c	str w9,[sp, #0x14c]
00adbe10	lsr w9,w11,#0x8
00adbe14	str w10,[sp, #0x118]
00adbe18	mov w10,#0xccf1
00adbe1c	extr w9,w9,w16,#0x8
00adbe20	movk w10,#0xbbcd, LSL #16
00adbe24	add w10,w9,w10
00adbe28	sub w10,w10,w13
00adbe2c	adrp x30,0x774000
00adbe30	str w10,[sp, #0x11c]
00adbe34	add x30,x30,#0xae8
00adbe38	and w10,w25,#0xff
00adbe3c	ldr w11,[x30, w10, UXTW #0x2]
00adbe40	add x29,x30,#0x400
00adbe44	ubfx w10,w25,#0x8,#0x8
00adbe48	bfm w14,w13,#0x18,#0x17
00adbe4c	ldr w13,[x29, w10, UXTW #0x2]
00adbe50	lsr w10,w12,#0x8
00adbe54	extr w5,w10,w9,#0x8
00adbe58	mov w10,#0x33c6
00adbe5c	movk w10,#0xef37, LSL #16
00adbe60	str w17,[sp, #0x12c]
00adbe64	add w17,w5,w10
00adbe68	mov w10,#0x678d
00adbe6c	movk w10,#0xde6e, LSL #16
00adbe70	add w4,w5,w10
00adbe74	lsr w10,w8,#0x8
00adbe78	eor w18,w13,w11
00adbe7c	and w11,w24,#0xff
00adbe80	ubfx w13,w24,#0x8,#0x8
00adbe84	extr w10,w10,w5,#0x8
00adbe88	ldr w11,[x30, w11, UXTW #0x2]
00adbe8c	ldr w13,[x29, w13, UXTW #0x2]
00adbe90	and w3,w6,#0xff
00adbe94	ubfx w5,w6,#0x8,#0x8
00adbe98	and w21,w19,#0xff
00adbe9c	ubfx w22,w19,#0x8,#0x8
00adbea0	ldr w3,[x30, w3, UXTW #0x2]
00adbea4	ldr w5,[x29, w5, UXTW #0x2]
00adbea8	ldr w21,[x30, w21, UXTW #0x2]
00adbeac	ldr w22,[x29, w22, UXTW #0x2]
00adbeb0	eor w28,w13,w11
00adbeb4	lsr w11,w16,#0x8
00adbeb8	eor w3,w5,w3
00adbebc	eor w5,w22,w21
00adbec0	extr w22,w11,w8,#0x8
00adbec4	mov w11,#0x661d
00adbec8	add w8,w8,w15
00adbecc	movk w11,#0x8864, LSL #16
00adbed0	add w8,w8,w11
00adbed4	mov w11,#0xcc3a
00adbed8	str w8,[sp, #0xcc]
00adbedc	add w8,w22,w15
00adbee0	movk w11,#0x10c8, LSL #16
00adbee4	add w8,w8,w11
00adbee8	str w8,[sp, #0xc8]
00adbeec	mov w8,#0x99e3
00adbef0	movk w8,#0x779b, LSL #16
00adbef4	add w8,w9,w8
00adbef8	sub w8,w8,w14
00adbefc	str w8,[sp, #0xa0]
00adbf00	mov w12,w27
00adbf04	sub w8,w17,w14
00adbf08	bfm w12,w14,#0x18,#0x17
00adbf0c	str w8,[sp, #0xb4]
00adbf10	add x14,x30,#0x800
00adbf14	ubfx w8,w25,#0x10,#0x8
00adbf18	ldr w8,[x14, w8, UXTW #0x2]
00adbf1c	lsr w9,w9,#0x8
00adbf20	and w23,w20,#0xff
00adbf24	ubfx w26,w20,#0x8,#0x8
00adbf28	bfm w7,w15,#0x18,#0x17
00adbf2c	extr w9,w9,w22,#0x8
00adbf30	ldr w23,[x30, w23, UXTW #0x2]
00adbf34	ldr w26,[x29, w26, UXTW #0x2]
00adbf38	add w1,w9,w7
00adbf3c	eor w9,w18,w8
00adbf40	ubfx w8,w24,#0x10,#0x8
00adbf44	ldr w18,[sp, #0x12c]
00adbf48	ldr w8,[x14, w8, UXTW #0x2]
00adbf4c	eor w21,w26,w23
00adbf50	add w15,w22,w7
00adbf54	ubfx w22,w19,#0x10,#0x8
00adbf58	and w23,w18,#0xff
00adbf5c	ubfx w26,w18,#0x8,#0x8
00adbf60	ldr w22,[x14, w22, UXTW #0x2]
00adbf64	ldr w23,[x30, w23, UXTW #0x2]
00adbf68	ldr w26,[x29, w26, UXTW #0x2]
00adbf6c	eor w28,w28,w8
00adbf70	ubfx w8,w20,#0x10,#0x8
00adbf74	ldr w13,[sp, #0x130]
00adbf78	ldr w8,[x14, w8, UXTW #0x2]
00adbf7c	eor w5,w5,w22
00adbf80	eor w22,w26,w23
00adbf84	and w26,w13,#0xff
00adbf88	ubfx w17,w13,#0x8,#0x8
00adbf8c	ldr w26,[x30, w26, UXTW #0x2]
00adbf90	ldr w17,[x29, w17, UXTW #0x2]
00adbf94	eor w21,w21,w8
00adbf98	mov w8,#0x9873
00adbf9c	mov w7,#0xcf1b
00adbfa0	movk w8,#0x2191, LSL #16
00adbfa4	movk w7,#0xbcdc, LSL #16
00adbfa8	add w8,w15,w8
00adbfac	add w7,w10,w7
00adbfb0	ubfx w10,w6,#0x10,#0x8
00adbfb4	str w8,[sp, #0x64]
00adbfb8	lsr w8,w25,#0x18
00adbfbc	add x15,x30,#0xc00
00adbfc0	ldr w10,[x14, w10, UXTW #0x2]
00adbfc4	eor w17,w17,w26
00adbfc8	ldr w26,[x15, w8, UXTW #0x2]
00adbfcc	mov w8,#0x30e5
00adbfd0	movk w8,#0x4323, LSL #16
00adbfd4	add w8,w1,w8
00adbfd8	str w8,[sp, #0x144]
00adbfdc	sub w8,w7,w12
00adbfe0	lsr w7,w19,#0x18
00adbfe4	eor w3,w3,w10
00adbfe8	and w10,w2,#0xff
00adbfec	ubfx w23,w2,#0x8,#0x8
00adbff0	lsr w6,w6,#0x18
00adbff4	ldr w7,[x15, w7, UXTW #0x2]
00adbff8	ubfx w19,w18,#0x10,#0x8
00adbffc	ldr w10,[x30, w10, UXTW #0x2]
00adc000	ldr w23,[x29, w23, UXTW #0x2]
00adc004	str w8,[sp, #0x148]
00adc008	ldr w6,[x15, w6, UXTW #0x2]
00adc00c	ldr w19,[x14, w19, UXTW #0x2]
00adc010	ldr w8,[sp, #0x164]
00adc014	mov w11,w2
00adc018	eor w5,w5,w7
00adc01c	lsr w7,w20,#0x18
00adc020	and w27,w0,#0xff
00adc024	ubfx w2,w0,#0x8,#0x8
00adc028	eor w23,w23,w10
00adc02c	sub w10,w4,w12
00adc030	eor w3,w3,w6
00adc034	eor w6,w22,w19
00adc038	ldr w7,[x15, w7, UXTW #0x2]
00adc03c	ubfx w19,w11,#0x10,#0x8
00adc040	and w22,w8,#0xff
00adc044	ubfx w25,w8,#0x8,#0x8
00adc048	mov w16,w13
00adc04c	ldr w27,[x30, w27, UXTW #0x2]
00adc050	ldr w2,[x29, w2, UXTW #0x2]
00adc054	str w10,[sp, #0x140]
00adc058	eor w12,w9,w26
00adc05c	ldr w19,[x14, w19, UXTW #0x2]
00adc060	ubfx w20,w13,#0x10,#0x8
00adc064	ldr w22,[x30, w22, UXTW #0x2]
00adc068	ldr w25,[x29, w25, UXTW #0x2]
00adc06c	ldr w9,[sp, #0x168]
00adc070	ldr w10,[sp, #0x160]
00adc074	ldr w13,[sp, #0x154]
00adc078	lsr w4,w24,#0x18
00adc07c	ldr w4,[x15, w4, UXTW #0x2]
00adc080	ldr w20,[x14, w20, UXTW #0x2]
00adc084	mov w1,w8
00adc088	eor w8,w21,w7
00adc08c	eor w2,w2,w27
00adc090	str w8,[sp, #0x114]
00adc094	eor w7,w23,w19
00adc098	eor w19,w25,w22
00adc09c	and w21,w9,#0xff
00adc0a0	ubfx w22,w9,#0x8,#0x8
00adc0a4	mov w8,w9
00adc0a8	and w23,w10,#0xff
00adc0ac	ubfx w25,w10,#0x8,#0x8
00adc0b0	mov w9,w10
00adc0b4	and w26,w13,#0xff
00adc0b8	ubfx w27,w13,#0x8,#0x8
00adc0bc	mov w10,w13
00adc0c0	ldr x13,[sp, #0x158]
00adc0c4	eor w4,w28,w4
00adc0c8	eor w17,w17,w20
00adc0cc	ubfx w20,w0,#0x10,#0x8
00adc0d0	ldr w20,[x14, w20, UXTW #0x2]
00adc0d4	ldr w21,[x30, w21, UXTW #0x2]
00adc0d8	ldr w22,[x29, w22, UXTW #0x2]
00adc0dc	ldr w23,[x30, w23, UXTW #0x2]
00adc0e0	ldr w25,[x29, w25, UXTW #0x2]
00adc0e4	ldr w26,[x30, w26, UXTW #0x2]
00adc0e8	ldr w27,[x29, w27, UXTW #0x2]
00adc0ec	stp w12,w4,[x13]
00adc0f0	stp w3,w5,[x13, #0x8]
00adc0f4	lsr w18,w18,#0x18
00adc0f8	lsr w3,w11,#0x18
00adc0fc	ldr w18,[x15, w18, UXTW #0x2]
00adc100	lsr w4,w16,#0x18
00adc104	ldr w3,[x15, w3, UXTW #0x2]
00adc108	ldr w4,[x15, w4, UXTW #0x2]
00adc10c	ubfx w5,w1,#0x10,#0x8
00adc110	ldr w5,[x14, w5, UXTW #0x2]
00adc114	eor w11,w6,w18
00adc118	str w11,[sp, #0x108]
00adc11c	eor w11,w7,w3
00adc120	str w11,[sp, #0x12c]
00adc124	eor w11,w17,w4
00adc128	str w11,[sp, #0x110]
00adc12c	eor w11,w19,w5
00adc130	str w11,[sp, #0x10c]
00adc134	ldr w11,[sp, #0x16c]
00adc138	lsr w17,w0,#0x18
00adc13c	ldr w17,[x15, w17, UXTW #0x2]
00adc140	ubfx w18,w8,#0x10,#0x8
00adc144	ldr w18,[x14, w18, UXTW #0x2]
00adc148	ubfx w0,w9,#0x10,#0x8
00adc14c	ldr w0,[x14, w0, UXTW #0x2]
00adc150	and w3,w11,#0xff
00adc154	ubfx w4,w11,#0x8,#0x8
00adc158	eor w2,w2,w20
00adc15c	ldr w3,[x30, w3, UXTW #0x2]
00adc160	ldr w4,[x29, w4, UXTW #0x2]
00adc164	eor w20,w22,w21
00adc168	eor w12,w2,w17
00adc16c	eor w21,w25,w23
00adc170	str w12,[sp, #0x130]
00adc174	eor w12,w20,w18
00adc178	str w12,[sp, #0xfc]
00adc17c	eor w12,w21,w0
00adc180	str w12,[sp, #0xf8]
00adc184	eor w12,w4,w3
00adc188	str w12,[sp, #0xf4]
00adc18c	ldr w12,[sp, #0x134]
00adc190	ubfx w17,w10,#0x10,#0x8
00adc194	ldr w16,[sp, #0x138]
00adc198	eor w22,w27,w26
00adc19c	ldr w17,[x14, w17, UXTW #0x2]
00adc1a0	and w2,w12,#0xff
00adc1a4	ubfx w3,w12,#0x8,#0x8
00adc1a8	mov w26,w12
00adc1ac	ldr w12,[sp, #0x150]
00adc1b0	ldr w8,[sp, #0x13c]
00adc1b4	and w18,w16,#0xff
00adc1b8	ubfx w0,w16,#0x8,#0x8
00adc1bc	ldr w18,[x30, w18, UXTW #0x2]
00adc1c0	mov w25,w16
00adc1c4	ldr w0,[x29, w0, UXTW #0x2]
00adc1c8	and w4,w12,#0xff
00adc1cc	ubfx w5,w12,#0x8,#0x8
00adc1d0	eor w12,w22,w17
00adc1d4	and w17,w8,#0xff
00adc1d8	ldr w16,[sp, #0x128]
00adc1dc	ldr w13,[x30, w17, UXTW #0x2]
00adc1e0	str w12,[sp, #0xc0]
00adc1e4	eor w12,w0,w18
00adc1e8	and w17,w16,#0xff
00adc1ec	ldr w0,[sp, #0x120]
00adc1f0	str w13,[sp, #0xb0]
00adc1f4	ldr w13,[x30, w17, UXTW #0x2]
00adc1f8	ldr w2,[x30, w2, UXTW #0x2]
00adc1fc	and w17,w0,#0xff
00adc200	ldr w3,[x29, w3, UXTW #0x2]
00adc204	str w13,[sp, #0xac]
00adc208	ldr w13,[x30, w17, UXTW #0x2]
00adc20c	str w12,[sp, #0xbc]
00adc210	eor w12,w3,w2
00adc214	ldr w2,[sp, #0x124]
00adc218	str w13,[sp, #0xa8]
00adc21c	ldr w13,[sp, #0x118]
00adc220	ldr w9,[sp, #0x14c]
00adc224	ldr w4,[x30, w4, UXTW #0x2]
00adc228	ldr w5,[x29, w5, UXTW #0x2]
00adc22c	and w17,w13,#0xff
00adc230	ldr w17,[x30, w17, UXTW #0x2]
00adc234	str w12,[sp, #0xb8]
00adc238	eor w12,w5,w4
00adc23c	ldr w4,[sp, #0x11c]
00adc240	str w17,[sp, #0xa4]
00adc244	and w17,w2,#0xff
00adc248	ldr w17,[x30, w17, UXTW #0x2]
00adc24c	ldr w24,[sp, #0xa0]
00adc250	ldp w23,w1,[sp, #0xc8]
00adc254	ldr w10,[sp, #0xb4]
00adc258	str w17,[sp, #0xdc]
00adc25c	and w17,w9,#0xff
00adc260	ldr w17,[x30, w17, UXTW #0x2]
00adc264	mov w27,w11
00adc268	ldr w11,[sp, #0x140]
00adc26c	ldr w19,[sp, #0x64]
00adc270	str w17,[sp, #0xd8]
00adc274	and w17,w4,#0xff
00adc278	ldr w17,[x30, w17, UXTW #0x2]
00adc27c	ldr w20,[sp, #0x144]
00adc280	ldr w21,[sp, #0x148]
00adc284	str w12,[sp, #0xc4]
00adc288	str w17,[sp, #0xd4]
00adc28c	and w17,w24,#0xff
00adc290	ldr w17,[x30, w17, UXTW #0x2]
00adc294	ubfx w18,w16,#0x8,#0x8
00adc298	ubfx w7,w1,#0x8,#0x8
00adc29c	ubfx w22,w19,#0x8,#0x8
00adc2a0	str w17,[sp, #0xd0]
00adc2a4	and w17,w1,#0xff
00adc2a8	ldr w17,[x30, w17, UXTW #0x2]
00adc2ac	mov w3,w23
00adc2b0	ubfx w28,w26,#0x10,#0x8
00adc2b4	ubfx w6,w3,#0x10,#0x8
00adc2b8	str w17,[sp, #0xf0]
00adc2bc	and w17,w23,#0xff
00adc2c0	ldr w17,[x30, w17, UXTW #0x2]
00adc2c4	str w17,[sp, #0xec]
00adc2c8	and w17,w10,#0xff
00adc2cc	ldr w17,[x30, w17, UXTW #0x2]
00adc2d0	str w17,[sp, #0xe8]
00adc2d4	and w17,w11,#0xff
00adc2d8	ldr w17,[x30, w17, UXTW #0x2]
00adc2dc	str w17,[sp, #0xe4]
00adc2e0	and w17,w19,#0xff
00adc2e4	ldr w17,[x30, w17, UXTW #0x2]
00adc2e8	str w17,[sp, #0x104]
00adc2ec	and w17,w20,#0xff
00adc2f0	ldr w17,[x30, w17, UXTW #0x2]
00adc2f4	str w17,[sp, #0x100]
00adc2f8	and w17,w21,#0xff
00adc2fc	ldr w17,[x30, w17, UXTW #0x2]
00adc300	ubfx w30,w21,#0x8,#0x8
00adc304	ubfx w21,w9,#0x10,#0x8
00adc308	str w17,[sp, #0xe0]
00adc30c	ubfx w17,w8,#0x8,#0x8
00adc310	ldr w12,[x29, w17, UXTW #0x2]
00adc314	mov w17,w2
00adc318	str w12,[sp, #0x70]
00adc31c	ldr w12,[x29, w18, UXTW #0x2]
00adc320	mov w18,w0
00adc324	ubfx w0,w0,#0x8,#0x8
00adc328	str w12,[sp, #0x6c]
00adc32c	ldr w12,[x29, w0, UXTW #0x2]
00adc330	ubfx w0,w13,#0x8,#0x8
00adc334	str w12,[sp, #0x68]
00adc338	ldr w12,[x29, w0, UXTW #0x2]
00adc33c	ubfx w0,w2,#0x8,#0x8
00adc340	mov w2,w4
00adc344	str w12,[sp, #0x60]
00adc348	ldr w12,[x29, w0, UXTW #0x2]
00adc34c	ubfx w0,w9,#0x8,#0x8
00adc350	ldr w9,[sp, #0x160]
00adc354	str w12,[sp, #0x80]
00adc358	ldr w12,[x29, w0, UXTW #0x2]
00adc35c	ubfx w0,w4,#0x8,#0x8
00adc360	lsr w9,w9,#0x18
00adc364	str w12,[sp, #0x7c]
00adc368	ldr w12,[x29, w0, UXTW #0x2]
00adc36c	ubfx w0,w24,#0x8,#0x8
00adc370	ldr w0,[x29, w0, UXTW #0x2]
00adc374	stp w0,w12,[sp, #0x74]
00adc378	mov w0,w1
00adc37c	ldr w1,[x29, w7, UXTW #0x2]
00adc380	ubfx w7,w23,#0x8,#0x8
00adc384	ubfx w23,w20,#0x8,#0x8
00adc388	ubfx w20,w17,#0x10,#0x8
00adc38c	str w1,[sp, #0x90]
00adc390	ldr w1,[x29, w7, UXTW #0x2]
00adc394	ubfx w7,w10,#0x8,#0x8
00adc398	ubfx w5,w0,#0x10,#0x8
00adc39c	str w1,[sp, #0x8c]
00adc3a0	ldr w1,[x29, w7, UXTW #0x2]
00adc3a4	ubfx w7,w11,#0x8,#0x8
00adc3a8	ldr w4,[x29, w7, UXTW #0x2]
00adc3ac	mov w11,w19
00adc3b0	ubfx w19,w2,#0x10,#0x8
00adc3b4	ubfx w7,w24,#0x10,#0x8
00adc3b8	stp w4,w1,[sp, #0x84]
00adc3bc	ldr w4,[x29, w22, UXTW #0x2]
00adc3c0	ldr w1,[sp, #0x150]
00adc3c4	ubfx w22,w16,#0x10,#0x8
00adc3c8	str w4,[sp, #0x9c]
00adc3cc	ldr w4,[x29, w23, UXTW #0x2]
00adc3d0	ubfx w23,w18,#0x10,#0x8
00adc3d4	str w4,[sp, #0x98]
00adc3d8	ldr w4,[x29, w30, UXTW #0x2]
00adc3dc	ubfx w30,w27,#0x10,#0x8
00adc3e0	ldr w12,[x14, w30, UXTW #0x2]
00adc3e4	ubfx w27,w25,#0x10,#0x8
00adc3e8	str w4,[sp, #0x94]
00adc3ec	mov w30,w25
00adc3f0	str w12,[sp, #0x3c]
00adc3f4	ldr w12,[x14, w27, UXTW #0x2]
00adc3f8	mov w27,w26
00adc3fc	ubfx w26,w1,#0x10,#0x8
00adc400	ldr w4,[x14, w26, UXTW #0x2]
00adc404	str w12,[sp, #0x40]
00adc408	ldr w12,[x14, w28, UXTW #0x2]
00adc40c	ubfx w25,w8,#0x10,#0x8
00adc410	ubfx w29,w13,#0x10,#0x8
00adc414	mov w28,w8
00adc418	stp w12,w4,[sp, #0x14]
00adc41c	ldr w4,[x14, w25, UXTW #0x2]
00adc420	mov w25,w16
00adc424	ldr w16,[x14, w22, UXTW #0x2]
00adc428	ldr w8,[sp, #0x168]
00adc42c	mov w26,w13
00adc430	ldr w13,[sp, #0x144]
00adc434	stp w16,w4,[sp, #0x24]
00adc438	ldr w16,[x14, w23, UXTW #0x2]
00adc43c	mov w23,w17
00adc440	ubfx w4,w10,#0x10,#0x8
00adc444	ldr w17,[sp, #0x140]
00adc448	str w16,[sp, #0x20]
00adc44c	ldr w16,[x14, w29, UXTW #0x2]
00adc450	lsr w8,w8,#0x18
00adc454	ldr w12,[sp, #0x148]
00adc458	mov w29,w3
00adc45c	str w16,[sp, #0x1c]
00adc460	ldr w16,[x14, w20, UXTW #0x2]
00adc464	mov w20,w2
00adc468	ubfx w2,w11,#0x10,#0x8
00adc46c	ubfx w3,w13,#0x10,#0x8
00adc470	str w16,[sp, #0x38]
00adc474	ldr w16,[x14, w21, UXTW #0x2]
00adc478	mov w21,w0
00adc47c	ubfx w0,w17,#0x10,#0x8
00adc480	mov w22,w18
00adc484	str w16,[sp, #0x34]
00adc488	ldr w16,[x14, w19, UXTW #0x2]
00adc48c	ubfx w18,w12,#0x10,#0x8
00adc490	str w16,[sp, #0x30]
00adc494	ldr w16,[x14, w7, UXTW #0x2]
00adc498	str w16,[sp, #0x2c]
00adc49c	ldr w16,[x14, w5, UXTW #0x2]
00adc4a0	mov w5,w10
00adc4a4	ldr w10,[sp, #0x154]
00adc4a8	str w16,[sp, #0x50]
00adc4ac	ldr w16,[x14, w6, UXTW #0x2]
00adc4b0	lsr w10,w10,#0x18
00adc4b4	str w16,[sp, #0x4c]
00adc4b8	ldr w16,[x14, w4, UXTW #0x2]
00adc4bc	str w16,[sp, #0x48]
00adc4c0	ldr w16,[x14, w0, UXTW #0x2]
00adc4c4	mov w0,w11
00adc4c8	str w16,[sp, #0x44]
00adc4cc	ldr w16,[x14, w2, UXTW #0x2]
00adc4d0	ldr w2,[x15, w8, UXTW #0x2]
00adc4d4	ldr w8,[sp, #0x16c]
00adc4d8	str w16,[sp, #0x5c]
00adc4dc	ldr w16,[x14, w3, UXTW #0x2]
00adc4e0	lsr w11,w8,#0x18
00adc4e4	lsr w8,w30,#0x18
00adc4e8	ldr w3,[x15, w8, UXTW #0x2]
00adc4ec	lsr w8,w25,#0x18
00adc4f0	ldr w25,[x15, w8, UXTW #0x2]
00adc4f4	ldr w8,[sp, #0x14c]
00adc4f8	ldr w14,[x14, w18, UXTW #0x2]
00adc4fc	ldr w7,[x15, w11, UXTW #0x2]
00adc500	lsr w11,w28,#0x18
00adc504	lsr w8,w8,#0x18
00adc508	ldr w8,[x15, w8, UXTW #0x2]
00adc50c	stp w14,w16,[sp, #0x54]
00adc510	ldr w16,[x15, w9, UXTW #0x2]
00adc514	lsr w9,w27,#0x18
00adc518	ldr w4,[x15, w9, UXTW #0x2]
00adc51c	lsr w9,w22,#0x18
00adc520	ldr w19,[x15, w9, UXTW #0x2]
00adc524	lsr w9,w20,#0x18
00adc528	ldr w14,[sp, #0x164]
00adc52c	str w8,[sp, #0x164]
00adc530	ldr w8,[x15, w9, UXTW #0x2]
00adc534	lsr w9,w5,#0x18
00adc538	lsr w18,w14,#0x18
00adc53c	ldr w14,[x15, w10, UXTW #0x2]
00adc540	str w8,[sp, #0x168]
00adc544	lsr w8,w29,#0x18
00adc548	ldr w29,[x15, w8, UXTW #0x2]
00adc54c	ldr w8,[x15, w9, UXTW #0x2]
00adc550	lsr w10,w1,#0x18
00adc554	ldr x1,[sp, #0x158]
00adc558	ldr w6,[x15, w10, UXTW #0x2]
00adc55c	str w8,[sp, #0x16c]
00adc560	lsr w8,w12,#0x18
00adc564	ldr w8,[x15, w8, UXTW #0x2]
00adc568	lsr w10,w26,#0x18
00adc56c	ldr w22,[x15, w11, UXTW #0x2]
00adc570	lsr w11,w23,#0x18
00adc574	str w8,[sp, #0x154]
00adc578	ldr w8,[sp, #0x108]
00adc57c	ldr w23,[x15, w10, UXTW #0x2]
00adc580	lsr w10,w24,#0x18
00adc584	ldr w20,[x15, w11, UXTW #0x2]
00adc588	lsr w11,w21,#0x18
00adc58c	ldr w21,[x15, w10, UXTW #0x2]
00adc590	lsr w24,w17,#0x18
00adc594	lsr w10,w0,#0x18
00adc598	lsr w9,w13,#0x18
00adc59c	ldr w18,[x15, w18, UXTW #0x2]
00adc5a0	ldr w11,[x15, w11, UXTW #0x2]
00adc5a4	ldr w24,[x15, w24, UXTW #0x2]
00adc5a8	ldr w5,[x15, w10, UXTW #0x2]
00adc5ac	ldr w9,[x15, w9, UXTW #0x2]
00adc5b0	str w8,[x1, #0x10]
00adc5b4	ldr w8,[sp, #0x114]
00adc5b8	str w9,[sp, #0x160]
00adc5bc	ldr w9,[sp, #0x3c]
00adc5c0	str w8,[x1, #0x14]
00adc5c4	ldr w8,[sp, #0x12c]
00adc5c8	str w8,[x1, #0x18]
00adc5cc	ldr w8,[sp, #0x110]
00adc5d0	str w8,[x1, #0x1c]
00adc5d4	ldr w8,[sp, #0x10c]
00adc5d8	eor w15,w8,w18
00adc5dc	ldr w8,[sp, #0xfc]
00adc5e0	eor w13,w8,w2
00adc5e4	ldr w8,[sp, #0xf8]
00adc5e8	eor w12,w8,w16
00adc5ec	ldr w8,[sp, #0xf4]
00adc5f0	ldr w16,[sp, #0x60]
00adc5f4	eor w18,w8,w9
00adc5f8	ldr w8,[sp, #0xc0]
00adc5fc	ldr w9,[sp, #0x40]
00adc600	eor w14,w8,w14
00adc604	ldr w8,[sp, #0xbc]
00adc608	eor w27,w8,w9
00adc60c	ldr w8,[sp, #0xb8]
00adc610	ldr w9,[sp, #0x14]
00adc614	eor w28,w8,w9
00adc618	ldr w8,[sp, #0xb0]
00adc61c	ldr w9,[sp, #0x70]
00adc620	eor w30,w9,w8
00adc624	ldr w8,[sp, #0xc4]
00adc628	ldr w9,[sp, #0x18]
00adc62c	eor w26,w8,w9
00adc630	ldr w8,[sp, #0xac]
00adc634	ldp w10,w9,[sp, #0x68]
00adc638	str w15,[x1, #0x20]
00adc63c	ldr w15,[sp, #0x130]
00adc640	str w12,[x1, #0x2c]
00adc644	eor w8,w9,w8
00adc648	ldr w9,[sp, #0xa8]
00adc64c	eor w12,w18,w7
00adc650	eor w17,w26,w6
00adc654	eor w9,w10,w9
00adc658	ldr w10,[sp, #0xa4]
00adc65c	stp w15,w13,[x1, #0x24]
00adc660	ldp w2,w0,[sp, #0x7c]
00adc664	eor w13,w27,w3
00adc668	eor w10,w16,w10
00adc66c	ldp w18,w16,[sp, #0x24]
00adc670	eor w15,w28,w4
00adc674	ldp w4,w3,[sp, #0x74]
00adc678	eor w8,w8,w18
00adc67c	ldr w18,[sp, #0x20]
00adc680	eor w16,w30,w16
00adc684	eor w8,w8,w25
00adc688	eor w9,w9,w18
00adc68c	ldr w18,[sp, #0xdc]
00adc690	eor w9,w9,w19
00adc694	eor w18,w0,w18
00adc698	ldr w0,[sp, #0x1c]
00adc69c	eor w10,w10,w0
00adc6a0	ldr w0,[sp, #0xd8]
00adc6a4	eor w10,w10,w23
00adc6a8	eor w0,w2,w0
00adc6ac	ldr w2,[sp, #0xd4]
00adc6b0	eor w2,w3,w2
00adc6b4	ldr w3,[sp, #0xd0]
00adc6b8	stp w12,w14,[x1, #0x30]
00adc6bc	stp w13,w15,[x1, #0x38]
00adc6c0	ldp w14,w13,[sp, #0x34]
00adc6c4	ldr w15,[sp, #0x30]
00adc6c8	eor w12,w16,w22
00adc6cc	eor w26,w4,w3
00adc6d0	eor w13,w18,w13
00adc6d4	eor w14,w0,w14
00adc6d8	eor w15,w2,w15
00adc6dc	ldp w0,w16,[sp, #0xec]
00adc6e0	ldp w2,w18,[sp, #0x8c]
00adc6e4	ldp w4,w3,[sp, #0x84]
00adc6e8	eor w0,w2,w0
00adc6ec	ldr w2,[sp, #0xe8]
00adc6f0	eor w16,w18,w16
00adc6f4	ldr w18,[sp, #0x2c]
00adc6f8	eor w2,w3,w2
00adc6fc	ldr w3,[sp, #0xe4]
00adc700	stp w12,w17,[x1, #0x40]
00adc704	stp w8,w9,[x1, #0x48]
00adc708	ldr w12,[sp, #0x168]
00adc70c	eor w8,w13,w20
00adc710	ldr w9,[sp, #0x164]
00adc714	eor w18,w26,w18
00adc718	eor w12,w15,w12
00adc71c	ldp w15,w13,[sp, #0x4c]
00adc720	eor w9,w14,w9
00adc724	eor w14,w18,w21
00adc728	ldr w17,[sp, #0x104]
00adc72c	eor w13,w16,w13
00adc730	ldr w16,[sp, #0x48]
00adc734	eor w15,w0,w15
00adc738	ldr w0,[sp, #0x100]
00adc73c	eor w3,w4,w3
00adc740	eor w16,w2,w16
00adc744	ldp w2,w18,[sp, #0x98]
00adc748	eor w17,w18,w17
00adc74c	ldr w18,[sp, #0x44]
00adc750	eor w0,w2,w0
00adc754	ldr w2,[sp, #0xe0]
00adc758	eor w18,w3,w18
00adc75c	ldr w3,[sp, #0x94]
00adc760	stp w8,w10,[x1, #0x50]
00adc764	stp w9,w12,[x1, #0x58]
00adc768	ldr w10,[sp, #0x16c]
00adc76c	eor w8,w13,w11
00adc770	eor w9,w15,w29
00adc774	ldp w13,w11,[sp, #0x58]
00adc778	eor w10,w16,w10
00adc77c	ldr w15,[sp, #0x54]
00adc780	stp w8,w14,[x1, #0x60]
00adc784	stp w9,w10,[x1, #0x68]
00adc788	ldr w9,[sp, #0x160]
00adc78c	ldr w10,[sp, #0x154]
00adc790	eor w2,w3,w2
00adc794	eor w11,w17,w11
00adc798	eor w13,w0,w13
00adc79c	eor w15,w2,w15
00adc7a0	eor w12,w18,w24
00adc7a4	eor w8,w11,w5
00adc7a8	eor w9,w13,w9
00adc7ac	eor w10,w15,w10
00adc7b0	stp w8,w12,[x1, #0x70]
00adc7b4	stp w9,w10,[x1, #0x78]
00adc7b8	ldp x29,x30,[sp, #0x1c0]
00adc7bc	ldp x20,x19,[sp, #0x1b0]
00adc7c0	ldp x22,x21,[sp, #0x1a0]
00adc7c4	ldp x24,x23,[sp, #0x190]
00adc7c8	ldp x26,x25,[sp, #0x180]
00adc7cc	ldp x28,x27,[sp, #0x170]
00adc7d0	add sp,sp,#0x1d0
00adc7d4	ret
