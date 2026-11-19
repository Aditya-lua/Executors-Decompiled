; FUN_00b0dcb0 @ 00b0dcb0
00b0dcb0	sub sp,sp,#0x70
00b0dcb4	stp x28,x27,[sp, #0x10]
00b0dcb8	stp x26,x25,[sp, #0x20]
00b0dcbc	stp x24,x23,[sp, #0x30]
00b0dcc0	stp x22,x21,[sp, #0x40]
00b0dcc4	stp x20,x19,[sp, #0x50]
00b0dcc8	stp x29,x30,[sp, #0x60]
00b0dccc	add x29,sp,#0x60
00b0dcd0	mov x19,x0
00b0dcd4	bl 0x00b10a8c
00b0dcd8	cmp w0,#0x1
00b0dcdc	b.lt 0x00b0e85c
00b0dce0	ldr x0,[x19, #0x98]
00b0dce4	bl 0x00c325e0
00b0dce8	ldr x8,[x19, #0xd8]
00b0dcec	mov w21,w0
00b0dcf0	cbz x8,0x00b0dd00
00b0dcf4	mov w26,wzr
00b0dcf8	orr w22,wzr,#0x6
00b0dcfc	b 0x00b0dd10
00b0dd00	ldr x8,[x19, #0x20]
00b0dd04	ldr w9,[x8, #0x18]
00b0dd08	ldr w22,[x8, #0x20]
00b0dd0c	ubfx w26,w9,#0x6,#0x1
00b0dd10	cmp w21,#0x1
00b0dd14	add x20,x19,#0xac
00b0dd18	b.lt 0x00b0e39c
00b0dd1c	mov w24,wzr
00b0dd20	mov w23,wzr
00b0dd24	mov w28,wzr
00b0dd28	mov w27,#0xffffffff
00b0dd2c	ldr x0,[x19, #0x98]
00b0dd30	mov w1,w23
00b0dd34	bl 0x00c32610
00b0dd38	ldr x8,[x19, #0x20]
00b0dd3c	mov x25,x0
00b0dd40	ldrb w8,[x8, #0x18]
00b0dd44	tbnz w8,#0x4,0x00b0dd70
00b0dd48	ldrb w8,[x25, #0xe9]
00b0dd4c	tbz w8,#0x1,0x00b0dd70
00b0dd50	ldr x8,[x19, #0x38]
00b0dd54	mov w9,#0x22
00b0dd58	mov w0,wzr
00b0dd5c	mov x1,x19
00b0dd60	str x25,[x19, #0xb8]
00b0dd64	stp w23,w9,[x19, #0xac]
00b0dd68	blr x8
00b0dd6c	cbz w0,0x00b0e85c
00b0dd70	cbnz w26,0x00b0dd9c
00b0dd74	ldrb w8,[x25, #0xe9]
00b0dd78	tbz w8,#0x2,0x00b0dd9c
00b0dd7c	ldr x8,[x19, #0x38]
00b0dd80	mov w9,#0x28
00b0dd84	mov w0,wzr
00b0dd88	mov x1,x19
00b0dd8c	str x25,[x19, #0xb8]
00b0dd90	stp w23,w9,[x19, #0xac]
00b0dd94	blr x8
00b0dd98	cbz w0,0x00b0e85c
00b0dd9c	mov x0,x25
00b0dda0	bl 0x00c40a50
00b0dda4	cbz w27,0x00b0ddbc
00b0dda8	cmn w27,#0x1
00b0ddac	b.ne 0x00b0dde8
00b0ddb0	cmp w0,#0x2
00b0ddb4	b.cs 0x00b0de0c
00b0ddb8	b 0x00b0de50
00b0ddbc	cbz w0,0x00b0de50
00b0ddc0	mov x0,x25
00b0ddc4	str w23,[x20]
00b0ddc8	cbnz x25,0x00b0ddd8
00b0ddcc	ldr x0,[x19, #0x98]
00b0ddd0	mov w1,w23
00b0ddd4	bl 0x00c32610
00b0ddd8	ldr x8,[x19, #0x38]
00b0dddc	str x0,[x19, #0xb8]
00b0dde0	mov w9,#0x25
00b0dde4	b 0x00b0de3c
00b0dde8	cbz w0,0x00b0de18
00b0ddec	add w8,w23,#0x1
00b0ddf0	cmp w8,w21
00b0ddf4	b.ge 0x00b0de04
00b0ddf8	cmp w0,#0x1
00b0ddfc	b.ne 0x00b0de18
00b0de00	b 0x00b0de50
00b0de04	cmp w0,#0x1
00b0de08	b.eq 0x00b0de50
00b0de0c	ldr x8,[x19, #0x20]
00b0de10	ldr x8,[x8, #0x18]
00b0de14	tbz w8,#0x5,0x00b0de50
00b0de18	mov x0,x25
00b0de1c	str w23,[x20]
00b0de20	cbnz x25,0x00b0de30
00b0de24	ldr x0,[x19, #0x98]
00b0de28	mov w1,w23
00b0de2c	bl 0x00c32610
00b0de30	ldr x8,[x19, #0x38]
00b0de34	mov w9,#0x4f
00b0de38	str x0,[x19, #0xb8]
00b0de3c	mov w0,wzr
00b0de40	mov x1,x19
00b0de44	str w9,[x19, #0xb0]
00b0de48	blr x8
00b0de4c	cbz w0,0x00b0e85c
00b0de50	cmp w21,#0x1
00b0de54	b.eq 0x00b0e238
00b0de58	mov x0,x25
00b0de5c	str w27,[sp, #0x4]
00b0de60	mov w27,w21
00b0de64	mov w21,w24
00b0de68	mov w24,w28
00b0de6c	mov w28,w22
00b0de70	mov w22,w26
00b0de74	bl 0x00c32cb0
00b0de78	cbz x0,0x00b0ded8
00b0de7c	mov x26,x0
00b0de80	bl 0x00c324b0
00b0de84	cmp w0,#0x198
00b0de88	b.ne 0x00b0df10
00b0de8c	adrp x1,0x2d9000
00b0de90	add x2,sp,#0x8
00b0de94	mov x0,x26
00b0de98	add x1,x1,#0xa9b
00b0de9c	bl 0x00c3d950
00b0dea0	cmp w0,#0x1
00b0dea4	b.ne 0x00b0ded8
00b0dea8	ldr w8,[sp, #0x8]
00b0deac	cbz w8,0x00b0df10
00b0deb0	mov x0,x25
00b0deb4	str w23,[x20]
00b0deb8	cbnz x25,0x00b0dec8
00b0debc	ldr x0,[x19, #0x98]
00b0dec0	mov w1,w23
00b0dec4	bl 0x00c32610
00b0dec8	ldr x8,[x19, #0x38]
00b0decc	mov w9,#0x5e
00b0ded0	str x0,[x19, #0xb8]
00b0ded4	b 0x00b0defc
00b0ded8	mov x0,x25
00b0dedc	str w23,[x20]
00b0dee0	cbnz x25,0x00b0def0
00b0dee4	ldr x0,[x19, #0x98]
00b0dee8	mov w1,w23
00b0deec	bl 0x00c32610
00b0def0	ldr x8,[x19, #0x38]
00b0def4	str x0,[x19, #0xb8]
00b0def8	mov w9,#0x1
00b0defc	mov w0,wzr
00b0df00	mov x1,x19
00b0df04	str w9,[x19, #0xb0]
00b0df08	blr x8
00b0df0c	cbz w0,0x00b0e85c
00b0df10	ldr x8,[x19, #0x20]
00b0df14	mov w26,w22
00b0df18	mov w22,w28
00b0df1c	mov w28,w24
00b0df20	ldrb w8,[x8, #0x18]
00b0df24	mov w24,w21
00b0df28	mov w21,w27
00b0df2c	ldr w27,[sp, #0x4]
00b0df30	tbz w8,#0x5,0x00b0e238
00b0df34	ldr x8,[x25, #0xd8]
00b0df38	cmn x8,#0x1
00b0df3c	b.eq 0x00b0df90
00b0df40	ldrb w8,[x25, #0xe8]
00b0df44	tbnz w8,#0x4,0x00b0df68
00b0df48	ldr x8,[x19, #0x38]
00b0df4c	mov w9,#0x50
00b0df50	mov w0,wzr
00b0df54	mov x1,x19
00b0df58	str x25,[x19, #0xb8]
00b0df5c	stp w23,w9,[x19, #0xac]
00b0df60	blr x8
00b0df64	cbz w0,0x00b0e85c
00b0df68	ldrb w8,[x25, #0xec]
00b0df6c	tbnz w8,#0x2,0x00b0df90
00b0df70	ldr x8,[x19, #0x38]
00b0df74	mov w9,#0x51
00b0df78	mov w0,wzr
00b0df7c	mov x1,x19
00b0df80	str x25,[x19, #0xb8]
00b0df84	stp w23,w9,[x19, #0xac]
00b0df88	blr x8
00b0df8c	cbz w0,0x00b0e85c
00b0df90	ldr w8,[x25, #0xe8]
00b0df94	mov w9,#0x11
00b0df98	movk w9,#0x1, LSL #16
00b0df9c	and w9,w8,w9
00b0dfa0	cmp w9,#0x11
00b0dfa4	b.ne 0x00b0dfcc
00b0dfa8	ldr x8,[x19, #0x38]
00b0dfac	mov w9,#0x59
00b0dfb0	mov w0,wzr
00b0dfb4	mov x1,x19
00b0dfb8	str x25,[x19, #0xb8]
00b0dfbc	stp w23,w9,[x19, #0xac]
00b0dfc0	blr x8
00b0dfc4	cbz w0,0x00b0e85c
00b0dfc8	ldr w8,[x25, #0xe8]
00b0dfcc	tbnz w8,#0x4,0x00b0dfec
00b0dfd0	ldrb w8,[x25, #0xec]
00b0dfd4	tbz w8,#0x2,0x00b0e014
00b0dfd8	ldr x8,[x19, #0x38]
00b0dfdc	mov w9,#0x52
00b0dfe0	str x25,[x19, #0xb8]
00b0dfe4	str w23,[x19, #0xac]
00b0dfe8	b 0x00b0e000
00b0dfec	tbnz w8,#0x1,0x00b0e014
00b0dff0	ldr x8,[x19, #0x38]
00b0dff4	str x25,[x19, #0xb8]
00b0dff8	str w23,[x19, #0xac]
00b0dffc	mov w9,#0x5c
00b0e000	mov w0,wzr
00b0e004	mov x1,x19
00b0e008	str w9,[x19, #0xb0]
00b0e00c	blr x8
00b0e010	cbz w0,0x00b0e85c
00b0e014	mov x0,x25
00b0e018	bl 0x00c32cf0
00b0e01c	bl 0x00c37860
00b0e020	cbnz w0,0x00b0e040
00b0e024	ldr x8,[x19, #0x38]
00b0e028	mov w9,#0x53
00b0e02c	mov x1,x19
00b0e030	str x25,[x19, #0xb8]
00b0e034	stp w23,w9,[x19, #0xac]
00b0e038	blr x8
00b0e03c	cbz w0,0x00b0e85c
00b0e040	ldrb w8,[x25, #0xe8]
00b0e044	tbnz w8,#0x4,0x00b0e058
00b0e048	ldrb w8,[x25, #0xec]
00b0e04c	tbnz w8,#0x1,0x00b0e058
00b0e050	ldr x8,[x25, #0x118]
00b0e054	cbnz x8,0x00b0e084
00b0e058	mov x0,x25
00b0e05c	bl 0x00c32d20
00b0e060	bl 0x00c37860
00b0e064	cbnz w0,0x00b0e084
00b0e068	ldr x8,[x19, #0x38]
00b0e06c	mov w9,#0x54
00b0e070	mov x1,x19
00b0e074	str x25,[x19, #0xb8]
00b0e078	stp w23,w9,[x19, #0xac]
00b0e07c	blr x8
00b0e080	cbz w0,0x00b0e85c
00b0e084	mov x0,x25
00b0e088	bl 0x00c32d20
00b0e08c	bl 0x00c37860
00b0e090	cbz w0,0x00b0e0cc
00b0e094	ldr x0,[x25, #0x118]
00b0e098	cbz x0,0x00b0e100
00b0e09c	bl 0x00c325e0
00b0e0a0	cmp w0,#0x0
00b0e0a4	b.gt 0x00b0e100
00b0e0a8	ldr x8,[x19, #0x38]
00b0e0ac	mov w9,#0x57
00b0e0b0	mov w0,wzr
00b0e0b4	mov x1,x19
00b0e0b8	str x25,[x19, #0xb8]
00b0e0bc	stp w23,w9,[x19, #0xac]
00b0e0c0	blr x8
00b0e0c4	cbnz w0,0x00b0e100
00b0e0c8	b 0x00b0e85c
00b0e0cc	ldr x8,[x25, #0x118]
00b0e0d0	cbz x8,0x00b0e100
00b0e0d4	ldrb w8,[x25, #0xea]
00b0e0d8	tbnz w8,#0x3,0x00b0e094
00b0e0dc	ldr x8,[x19, #0x38]
00b0e0e0	mov w9,#0x58
00b0e0e4	mov w0,wzr
00b0e0e8	mov x1,x19
00b0e0ec	str x25,[x19, #0xb8]
00b0e0f0	stp w23,w9,[x19, #0xac]
00b0e0f4	blr x8
00b0e0f8	cbnz w0,0x00b0e094
00b0e0fc	b 0x00b0e85c
00b0e100	add x0,x25,#0x88
00b0e104	add x1,x25,#0x20
00b0e108	bl 0x00c38210
00b0e10c	cbz w0,0x00b0e130
00b0e110	ldr x8,[x19, #0x38]
00b0e114	mov w9,#0x4e
00b0e118	mov w0,wzr
00b0e11c	mov x1,x19
00b0e120	str x25,[x19, #0xb8]
00b0e124	stp w23,w9,[x19, #0xac]
00b0e128	blr x8
00b0e12c	cbz w0,0x00b0e85c
00b0e130	ldr x8,[x25, #0x100]
00b0e134	cbz x8,0x00b0e160
00b0e138	ldrb w8,[x25, #0xea]
00b0e13c	tbz w8,#0x1,0x00b0e160
00b0e140	ldr x8,[x19, #0x38]
00b0e144	mov w9,#0x5a
00b0e148	mov w0,wzr
00b0e14c	mov x1,x19
00b0e150	str x25,[x19, #0xb8]
00b0e154	stp w23,w9,[x19, #0xac]
00b0e158	blr x8
00b0e15c	cbz w0,0x00b0e85c
00b0e160	ldr x8,[x25, #0xf8]
00b0e164	cbz x8,0x00b0e190
00b0e168	ldrb w8,[x25, #0xea]
00b0e16c	tbz w8,#0x2,0x00b0e190
00b0e170	ldr x8,[x19, #0x38]
00b0e174	mov w9,#0x5b
00b0e178	mov w0,wzr
00b0e17c	mov x1,x19
00b0e180	str x25,[x19, #0xb8]
00b0e184	stp w23,w9,[x19, #0xac]
00b0e188	blr x8
00b0e18c	cbz w0,0x00b0e85c
00b0e190	mov x0,x25
00b0e194	bl 0x00c32d30
00b0e198	cmp x0,#0x2
00b0e19c	b.lt 0x00b0e200
00b0e1a0	add w8,w23,#0x1
00b0e1a4	cmp w8,w21
00b0e1a8	b.ge 0x00b0e1dc
00b0e1ac	ldr x8,[x25, #0x100]
00b0e1b0	cbz x8,0x00b0e1bc
00b0e1b4	ldr x8,[x8]
00b0e1b8	cbnz x8,0x00b0e1dc
00b0e1bc	ldr x8,[x19, #0x38]
00b0e1c0	mov w9,#0x55
00b0e1c4	mov w0,wzr
00b0e1c8	mov x1,x19
00b0e1cc	str x25,[x19, #0xb8]
00b0e1d0	stp w23,w9,[x19, #0xac]
00b0e1d4	blr x8
00b0e1d8	cbz w0,0x00b0e85c
00b0e1dc	ldrb w8,[x25, #0xe8]
00b0e1e0	tbz w8,#0x4,0x00b0e238
00b0e1e4	ldr x8,[x25, #0xf8]
00b0e1e8	cbnz x8,0x00b0e238
00b0e1ec	ldr x8,[x19, #0x38]
00b0e1f0	str x25,[x19, #0xb8]
00b0e1f4	str w23,[x19, #0xac]
00b0e1f8	mov w9,#0x56
00b0e1fc	b 0x00b0e224
00b0e200	mov x0,x25
00b0e204	bl 0x00c32c80
00b0e208	bl 0x00c325e0
00b0e20c	cmp w0,#0x1
00b0e210	b.lt 0x00b0e238
00b0e214	ldr x8,[x19, #0x38]
00b0e218	mov w9,#0x5d
00b0e21c	str x25,[x19, #0xb8]
00b0e220	str w23,[x19, #0xac]
00b0e224	mov w0,wzr
00b0e228	mov x1,x19
00b0e22c	str w9,[x19, #0xb0]
00b0e230	blr x8
00b0e234	cbz w0,0x00b0e85c
00b0e238	cmp w22,#0x1
00b0e23c	b.lt 0x00b0e2e0
00b0e240	ldr w8,[x19, #0x94]
00b0e244	cmp w8,w23
00b0e248	b.gt 0x00b0e27c
00b0e24c	ldr x8,[x19, #0x20]
00b0e250	ldr w9,[x8, #0x20]
00b0e254	cmp w9,w22
00b0e258	b.ne 0x00b0e27c
00b0e25c	ldr w1,[x8, #0x24]
00b0e260	mov w2,#0x4
00b0e264	mov x0,x25
00b0e268	bl 0x00c3f100
00b0e26c	cmp w0,#0x1
00b0e270	b.eq 0x00b0e2e0
00b0e274	cmp w0,#0x2
00b0e278	b.eq 0x00b0e2a8
00b0e27c	cmp w27,#0x0
00b0e280	cset w2,gt
00b0e284	mov x0,x25
00b0e288	mov w1,w22
00b0e28c	bl 0x00c40a60
00b0e290	cbz w0,0x00b0e2a8
00b0e294	cmp w0,#0x1
00b0e298	b.eq 0x00b0e2e0
00b0e29c	ldr x8,[x19, #0x20]
00b0e2a0	ldrb w8,[x8, #0x18]
00b0e2a4	tbz w8,#0x5,0x00b0e2e0
00b0e2a8	mov x0,x25
00b0e2ac	str w23,[x20]
00b0e2b0	cbnz x25,0x00b0e2c0
00b0e2b4	ldr x0,[x19, #0x98]
00b0e2b8	mov w1,w23
00b0e2bc	bl 0x00c32610
00b0e2c0	ldr x8,[x19, #0x38]
00b0e2c4	str x0,[x19, #0xb8]
00b0e2c8	mov w9,#0x1a
00b0e2cc	mov w0,wzr
00b0e2d0	mov x1,x19
00b0e2d4	str w9,[x19, #0xb0]
00b0e2d8	blr x8
00b0e2dc	cbz w0,0x00b0e85c
00b0e2e0	cmp w23,#0x2
00b0e2e4	b.cc 0x00b0e324
00b0e2e8	ldr x8,[x25, #0xd8]
00b0e2ec	cmn x8,#0x1
00b0e2f0	b.eq 0x00b0e328
00b0e2f4	add x8,x8,w24, SXTW 
00b0e2f8	cmp x8,w28, SXTW 
00b0e2fc	b.ge 0x00b0e328
00b0e300	ldr x8,[x19, #0x38]
00b0e304	mov w9,#0x19
00b0e308	mov w0,wzr
00b0e30c	mov x1,x19
00b0e310	str x25,[x19, #0xb8]
00b0e314	stp w23,w9,[x19, #0xac]
00b0e318	blr x8
00b0e31c	cbnz w0,0x00b0e328
00b0e320	b 0x00b0e85c
00b0e324	cbz w23,0x00b0e344
00b0e328	ldr w8,[x25, #0xe8]
00b0e32c	mov w9,#0x1
00b0e330	bic w9,w9,w8, LSR #0x5
00b0e334	add w28,w9,w28
00b0e338	tbnz w8,#0xa,0x00b0e34c
00b0e33c	mov w27,#0x1
00b0e340	b 0x00b0e390
00b0e344	ldr w8,[x25, #0xe8]
00b0e348	tbz w8,#0xa,0x00b0e33c
00b0e34c	ldr x8,[x25, #0xe0]
00b0e350	cmn x8,#0x1
00b0e354	b.eq 0x00b0e388
00b0e358	cmp x8,w24, SXTW 
00b0e35c	b.ge 0x00b0e384
00b0e360	ldr x8,[x19, #0x38]
00b0e364	mov w9,#0x26
00b0e368	mov w0,wzr
00b0e36c	mov x1,x19
00b0e370	str x25,[x19, #0xb8]
00b0e374	stp w23,w9,[x19, #0xac]
00b0e378	blr x8
00b0e37c	cbz w0,0x00b0e85c
00b0e380	ldr x8,[x25, #0xe0]
00b0e384	mov w24,w8
00b0e388	mov w27,wzr
00b0e38c	add w24,w24,#0x1
00b0e390	add w23,w23,#0x1
00b0e394	cmp w23,w21
00b0e398	b.lt 0x00b0dd2c
00b0e39c	ldr x0,[x19, #0x98]
00b0e3a0	bl 0x00c325e0
00b0e3a4	subs w24,w0,#0x1
00b0e3a8	b.lt 0x00b0e4f0
00b0e3ac	ldr x8,[x19, #0x20]
00b0e3b0	ldr w8,[x8, #0x2c]
00b0e3b4	cmp w8,#0x1
00b0e3b8	b.lt 0x00b0e4f0
00b0e3bc	adrp x28,0x77b000
00b0e3c0	mov w21,w0
00b0e3c4	mov w22,wzr
00b0e3c8	mov w25,#0xffffffff
00b0e3cc	mov w27,#0x5
00b0e3d0	add x28,x28,#0x7f4
00b0e3d4	ldr x0,[x19, #0x98]
00b0e3d8	mov w1,w22
00b0e3dc	bl 0x00c32610
00b0e3e0	mov x23,x0
00b0e3e4	cbz w22,0x00b0e458
00b0e3e8	mov x0,x23
00b0e3ec	bl 0x00c32cb0
00b0e3f0	ldr x8,[x19, #0x20]
00b0e3f4	ldr w8,[x8, #0x2c]
00b0e3f8	cmp w8,#0x1
00b0e3fc	b.lt 0x00b0e458
00b0e400	cbz x0,0x00b0e420
00b0e404	cmp w8,#0x5
00b0e408	csel w26,w8,w27,lt
00b0e40c	bl 0x00c324c0
00b0e410	add x8,x28,w26, SXTW  #0x2
00b0e414	ldur w8,[x8, #-0x4]
00b0e418	cmp w0,w8
00b0e41c	b.ge 0x00b0e458
00b0e420	mov x0,x23
00b0e424	str w22,[x20]
00b0e428	cbnz x23,0x00b0e438
00b0e42c	ldr x0,[x19, #0x98]
00b0e430	mov w1,w22
00b0e434	bl 0x00c32610
00b0e438	ldr x8,[x19, #0x38]
00b0e43c	str x0,[x19, #0xb8]
00b0e440	mov w9,#0x43
00b0e444	mov w0,wzr
00b0e448	mov x1,x19
00b0e44c	str w9,[x19, #0xb0]
00b0e450	blr x8
00b0e454	cbz w0,0x00b0e85c
00b0e458	cmp w22,w24
00b0e45c	b.ge 0x00b0e4e4
00b0e460	str w25,[sp, #0xc]
00b0e464	ldr x8,[x19, #0x20]
00b0e468	ldr w26,[x8, #0x2c]
00b0e46c	cmp w26,#0x0
00b0e470	b.le 0x00b0e4e4
00b0e474	add x3,sp,#0xc
00b0e478	mov x0,x23
00b0e47c	mov x1,xzr
00b0e480	mov x2,xzr
00b0e484	mov x4,xzr
00b0e488	bl 0x00c36580
00b0e48c	cbz w0,0x00b0e4ac
00b0e490	cmp w26,#0x5
00b0e494	csel w8,w26,w27,lt
00b0e498	add x8,x28,w8, SXTW  #0x2
00b0e49c	ldr w9,[sp, #0xc]
00b0e4a0	ldur w8,[x8, #-0x4]
00b0e4a4	cmp w9,w8
00b0e4a8	b.ge 0x00b0e4e4
00b0e4ac	str w22,[x20]
00b0e4b0	cbnz x23,0x00b0e4c4
00b0e4b4	ldr x0,[x19, #0x98]
00b0e4b8	mov w1,w22
00b0e4bc	bl 0x00c32610
00b0e4c0	mov x23,x0
00b0e4c4	ldr x8,[x19, #0x38]
00b0e4c8	mov w9,#0x44
00b0e4cc	mov w0,wzr
00b0e4d0	mov x1,x19
00b0e4d4	str x23,[x19, #0xb8]
00b0e4d8	str w9,[x19, #0xb0]
00b0e4dc	blr x8
00b0e4e0	cbz w0,0x00b0e85c
00b0e4e4	add w22,w22,#0x1
00b0e4e8	cmp w22,w21
00b0e4ec	b.lt 0x00b0e3d4
00b0e4f0	mov x0,x19
00b0e4f4	bl 0x00b11384
00b0e4f8	cmp w0,#0x1
00b0e4fc	b.lt 0x00b0e85c
00b0e500	ldr x1,[x19, #0x98]
00b0e504	mov x0,xzr
00b0e508	bl 0x00b0ed4c
00b0e50c	cbz w0,0x00b0e858
00b0e510	ldr x8,[x19, #0x50]
00b0e514	mov x0,x19
00b0e518	blr x8
00b0e51c	cmp w0,#0x1
00b0e520	b.lt 0x00b0e85c
00b0e524	ldr x8,[x19, #0x20]
00b0e528	ldr x2,[x19, #0x98]
00b0e52c	mov x0,x20
00b0e530	mov x1,xzr
00b0e534	ldr x3,[x8, #0x18]
00b0e538	bl 0x00c36570
00b0e53c	cbz w0,0x00b0e56c
00b0e540	mov w20,w0
00b0e544	ldr w1,[x19, #0xac]
00b0e548	ldr x0,[x19, #0x98]
00b0e54c	bl 0x00c32610
00b0e550	ldr x8,[x19, #0x38]
00b0e554	str x0,[x19, #0xb8]
00b0e558	mov w0,wzr
00b0e55c	mov x1,x19
00b0e560	str w20,[x19, #0xb0]
00b0e564	blr x8
00b0e568	cbz w0,0x00b0e85c
00b0e56c	ldr x8,[x19, #0x30]
00b0e570	cbz x8,0x00b0e588
00b0e574	mov x0,x19
00b0e578	blr x8
00b0e57c	cmp w0,#0x1
00b0e580	b.ge 0x00b0e598
00b0e584	b 0x00b0e85c
00b0e588	mov x0,x19
00b0e58c	bl 0x00b0fba0
00b0e590	cmp w0,#0x1
00b0e594	b.lt 0x00b0e85c
00b0e598	ldr x0,[x19, #0x98]
00b0e59c	bl 0x00c325e0
00b0e5a0	cmp w0,#0x1
00b0e5a4	b.lt 0x00b0e7e4
00b0e5a8	mov w20,w0
00b0e5ac	b 0x00b0e610
00b0e5b0	mov x0,x23
00b0e5b4	bl 0x00c34f50
00b0e5b8	cbz x0,0x00b0e820
00b0e5bc	mov w1,w24
00b0e5c0	mov x23,x0
00b0e5c4	bl 0x00c40ad0
00b0e5c8	mov x24,x0
00b0e5cc	bl 0x00c37840
00b0e5d0	bl 0x00c37750
00b0e5d4	cmp w0,#0xd
00b0e5d8	b.ne 0x00b0e5ec
00b0e5dc	mov x0,x23
00b0e5e0	mov x1,x22
00b0e5e4	bl 0x00c36560
00b0e5e8	cbz w0,0x00b0e608
00b0e5ec	mov w22,#0x48
00b0e5f0	mov x0,x24
00b0e5f4	bl 0x00c40940
00b0e5f8	mov x0,x23
00b0e5fc	bl 0x00c34810
00b0e600	cbnz w22,0x00b0e6b8
00b0e604	b 0x00b0e6d4
00b0e608	mov w22,wzr
00b0e60c	b 0x00b0e5f0
00b0e610	ldr x0,[x19, #0x98]
00b0e614	mov w27,w20
00b0e618	sub w20,w20,#0x1
00b0e61c	mov w1,w20
00b0e620	bl 0x00c32610
00b0e624	ldr w8,[x0, #0xe8]
00b0e628	mov x21,x0
00b0e62c	cbz w20,0x00b0e634
00b0e630	tbnz w8,#0x5,0x00b0e7dc
00b0e634	tbz w8,#0xa,0x00b0e6d4
00b0e638	mov x0,x21
00b0e63c	bl 0x00c32d20
00b0e640	mov x23,x0
00b0e644	mov x0,x21
00b0e648	bl 0x00c32cf0
00b0e64c	mov x22,x0
00b0e650	mov x0,x23
00b0e654	bl 0x00c37860
00b0e658	subs w25,w0,#0x2
00b0e65c	b.lt 0x00b0e6b4
00b0e660	mov w24,w0
00b0e664	mov x0,x23
00b0e668	bl 0x00c37860
00b0e66c	mov w26,w0
00b0e670	mov x0,x22
00b0e674	bl 0x00c37860
00b0e678	add w8,w0,#0x1
00b0e67c	cmp w26,w8
00b0e680	b.ne 0x00b0e6b4
00b0e684	sub w24,w24,#0x1
00b0e688	mov x0,x23
00b0e68c	mov w1,w24
00b0e690	bl 0x00c32bb0
00b0e694	bl 0x00c37850
00b0e698	mov w26,w0
00b0e69c	mov x0,x23
00b0e6a0	mov w1,w25
00b0e6a4	bl 0x00c32bb0
00b0e6a8	bl 0x00c37850
00b0e6ac	cmp w26,w0
00b0e6b0	b.ne 0x00b0e5b0
00b0e6b4	mov w22,#0x48
00b0e6b8	ldr x8,[x19, #0x38]
00b0e6bc	mov w0,wzr
00b0e6c0	mov x1,x19
00b0e6c4	str x21,[x19, #0xb8]
00b0e6c8	stp w20,w22,[x19, #0xac]
00b0e6cc	blr x8
00b0e6d0	cbz w0,0x00b0e85c
00b0e6d4	ldr x0,[x19, #0x98]
00b0e6d8	bl 0x00c325e0
00b0e6dc	cmp w0,w27
00b0e6e0	b.le 0x00b0e7dc
00b0e6e4	mov w22,w0
00b0e6e8	b 0x00b0e6fc
00b0e6ec	mov x0,x25
00b0e6f0	bl 0x00c324e0
00b0e6f4	cbnz w23,0x00b0e7b0
00b0e6f8	b 0x00b0e7d4
00b0e6fc	ldr x0,[x19, #0x98]
00b0e700	sub w22,w22,#0x1
00b0e704	mov w1,w22
00b0e708	bl 0x00c32610
00b0e70c	ldr x24,[x0, #0x120]
00b0e710	cbz x24,0x00b0e7d4
00b0e714	mov x0,x21
00b0e718	mov x1,x24
00b0e71c	bl 0x00c40990
00b0e720	mov w23,w0
00b0e724	orr w8,w0,w20
00b0e728	cbnz w8,0x00b0e7ac
00b0e72c	ldr x8,[x19, #0x20]
00b0e730	ldr w8,[x8, #0x40]
00b0e734	tbnz w8,#0x5,0x00b0e7ac
00b0e738	tbnz w8,#0x0,0x00b0e79c
00b0e73c	mov w1,#0x55
00b0e740	mov x0,x21
00b0e744	mov x2,xzr
00b0e748	mov x3,xzr
00b0e74c	bl 0x00c32ce0
00b0e750	cbz x0,0x00b0e79c
00b0e754	mov x25,x0
00b0e758	bl 0x00c325e0
00b0e75c	cmp w0,#0x1
00b0e760	b.lt 0x00b0e794
00b0e764	mov w26,wzr
00b0e768	mov x0,x25
00b0e76c	mov w1,w26
00b0e770	bl 0x00c32610
00b0e774	ldr w8,[x0]
00b0e778	cmp w8,#0x2
00b0e77c	b.eq 0x00b0e6ec
00b0e780	mov x0,x25
00b0e784	add w26,w26,#0x1
00b0e788	bl 0x00c325e0
00b0e78c	cmp w26,w0
00b0e790	b.lt 0x00b0e768
00b0e794	mov x0,x25
00b0e798	bl 0x00c324e0
00b0e79c	mov x0,x21
00b0e7a0	mov x1,x24
00b0e7a4	bl 0x00c409a0
00b0e7a8	mov w23,w0
00b0e7ac	cbz w23,0x00b0e7d4
00b0e7b0	cmp w23,#0x11
00b0e7b4	b.eq 0x00b0e858
00b0e7b8	ldr x8,[x19, #0x38]
00b0e7bc	mov w0,wzr
00b0e7c0	mov x1,x19
00b0e7c4	str x21,[x19, #0xb8]
00b0e7c8	stp w20,w23,[x19, #0xac]
00b0e7cc	blr x8
00b0e7d0	cbz w0,0x00b0e85c
00b0e7d4	cmp w22,w27
00b0e7d8	b.gt 0x00b0e6fc
00b0e7dc	cmp w27,#0x1
00b0e7e0	b.gt 0x00b0e610
00b0e7e4	mov x0,x19
00b0e7e8	bl 0x00c40770
00b0e7ec	cmp w0,#0x1
00b0e7f0	b.lt 0x00b0e85c
00b0e7f4	mov x0,x19
00b0e7f8	bl 0x00c40730
00b0e7fc	cmp w0,#0x1
00b0e800	b.lt 0x00b0e85c
00b0e804	ldr x8,[x19, #0x20]
00b0e808	ldrb w8,[x8, #0x18]
00b0e80c	tbz w8,#0x7,0x00b0e85c
00b0e810	ldr x8,[x19, #0x70]
00b0e814	mov x0,x19
00b0e818	blr x8
00b0e81c	b 0x00b0e85c
00b0e820	bl 0x00c342a0
00b0e824	adrp x0,0x2a0000
00b0e828	adrp x2,0x2c6000
00b0e82c	add x0,x0,#0xe02
00b0e830	add x2,x2,#0x428
00b0e834	mov w1,#0x2c2
00b0e838	bl 0x00c342b0
00b0e83c	mov w1,#0x100
00b0e840	mov w0,#0xb
00b0e844	movk w1,#0xc, LSL #16
00b0e848	mov x2,xzr
00b0e84c	bl 0x00c342c0
00b0e850	mov w8,#0x11
00b0e854	str w8,[x19, #0xb0]
00b0e858	mov w0,#0xffffffff
00b0e85c	ldp x29,x30,[sp, #0x60]
00b0e860	ldp x20,x19,[sp, #0x50]
00b0e864	ldp x22,x21,[sp, #0x40]
00b0e868	ldp x24,x23,[sp, #0x30]
00b0e86c	ldp x26,x25,[sp, #0x20]
00b0e870	ldp x28,x27,[sp, #0x10]
00b0e874	add sp,sp,#0x70
00b0e878	ret
