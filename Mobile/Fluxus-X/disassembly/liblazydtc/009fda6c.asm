; FUN_009fda6c @ 009fda6c
009fda6c	sub sp,sp,#0xa0
009fda70	add x8,x6,#0x18
009fda74	stp x28,x27,[sp, #0x40]
009fda78	stp x26,x25,[sp, #0x50]
009fda7c	stp x24,x23,[sp, #0x60]
009fda80	stp x22,x21,[sp, #0x70]
009fda84	stp x20,x19,[sp, #0x80]
009fda88	stp x29,x30,[sp, #0x90]
009fda8c	mov x25,x5
009fda90	stp x4,x3,[sp, #0x10]
009fda94	stp x0,xzr,[sp, #0x30]
009fda98	stp x8,x6,[sp, #0x20]
009fda9c	ldrb w22,[x25], #0x1
009fdaa0	adrp x19,0x74e000
009fdaa4	mov x20,x2
009fdaa8	mov x21,x1
009fdaac	mov w24,wzr
009fdab0	mov w28,wzr
009fdab4	mov w9,wzr
009fdab8	mov w26,wzr
009fdabc	mov w27,#0xffffffff
009fdac0	add x19,x19,#0x3a4
009fdac4	add x29,sp,#0x90
009fdac8	ands w23,w22,#0xff
009fdacc	b.eq 0x009fe4b0
009fdad0	cbnz x21,0x009fdae4
009fdad4	ldr x8,[sp, #0x38]
009fdad8	ldr x10,[x20]
009fdadc	cmp x8,x10
009fdae0	b.cs 0x009fe4b4
009fdae4	cmp w9,#0x6
009fdae8	b.hi 0x009fdc0c
009fdaec	mov w8,w9
009fdaf0	ldrsw x8,[x19, x8, LSL #0x2]
009fdaf4	add x8,x8,x19
009fdaf8	br x8
009fdafc	and w8,w22,#0xff
009fdb00	cmp w8,#0x25
009fdb04	b.ne 0x009fdc94
009fdb08	ldrb w22,[x25], #0x1
009fdb0c	mov w9,#0x1
009fdb10	cmp w9,#0x7
009fdb14	b.ne 0x009fdac8
009fdb18	b 0x009fe4b0
009fdb1c	and w8,w22,#0xff
009fdb20	sub w8,w8,#0x20
009fdb24	cmp w8,#0x10
009fdb28	mov w9,#0x2
009fdb2c	b.hi 0x009fdc0c
009fdb30	adrp x10,0x74e000
009fdb34	add x10,x10,#0x5f4
009fdb38	ldrsw x8,[x10, x8, LSL #0x2]
009fdb3c	add x8,x8,x10
009fdb40	br x8
009fdb44	ldrb w22,[x25], #0x1
009fdb48	orr w28,w28,#0x4
009fdb4c	mov w9,#0x1
009fdb50	cmp w9,#0x7
009fdb54	b.ne 0x009fdac8
009fdb58	b 0x009fe4b0
009fdb5c	mov w0,w23
009fdb60	bl 0x00c37770
009fdb64	cbz w0,0x009fdcdc
009fdb68	ldrb w22,[x25], #0x1
009fdb6c	mov w8,#0xa
009fdb70	madd w8,w26,w8,w23
009fdb74	sub w26,w8,#0x30
009fdb78	mov w9,#0x2
009fdb7c	cmp w9,#0x7
009fdb80	b.ne 0x009fdac8
009fdb84	b 0x009fe4b0
009fdb88	and w8,w22,#0xff
009fdb8c	cmp w8,#0x2e
009fdb90	b.ne 0x009fdccc
009fdb94	ldrb w22,[x25], #0x1
009fdb98	mov w9,#0x4
009fdb9c	cmp w9,#0x7
009fdba0	b.ne 0x009fdac8
009fdba4	b 0x009fe4b0
009fdba8	mov w0,w23
009fdbac	bl 0x00c37770
009fdbb0	cbz w0,0x009fdd30
009fdbb4	ldrb w22,[x25], #0x1
009fdbb8	bic w8,w27,w27, ASR #0x1f
009fdbbc	mov w9,#0xa
009fdbc0	madd w8,w8,w9,w23
009fdbc4	sub w27,w8,#0x30
009fdbc8	mov w9,#0x4
009fdbcc	cmp w9,#0x7
009fdbd0	b.ne 0x009fdac8
009fdbd4	b 0x009fe4b0
009fdbd8	and w8,w22,#0xff
009fdbdc	sub w8,w8,#0x4c
009fdbe0	cmp w8,#0x2e
009fdbe4	orr w9,wzr,#0x6
009fdbe8	b.hi 0x009fdc0c
009fdbec	adrp x10,0x74e000
009fdbf0	add x10,x10,#0x538
009fdbf4	ldrsw x8,[x10, x8, LSL #0x2]
009fdbf8	add x8,x8,x10
009fdbfc	br x8
009fdc00	ldrb w22,[x25], #0x1
009fdc04	mov w24,#0x4
009fdc08	orr w9,wzr,#0x6
009fdc0c	cmp w9,#0x7
009fdc10	b.ne 0x009fdac8
009fdc14	b 0x009fe4b0
009fdc18	and w8,w22,#0xff
009fdc1c	sub w8,w8,#0x25
009fdc20	cmp w8,#0x53
009fdc24	b.hi 0x009fe3b4
009fdc28	adrp x9,0x74e000
009fdc2c	add x9,x9,#0x3c0
009fdc30	ldrsw x8,[x9, x8, LSL #0x2]
009fdc34	add x8,x8,x9
009fdc38	br x8
009fdc3c	sub w8,w24,#0x1
009fdc40	cmp w8,#0x4
009fdc44	b.hi 0x009fe358
009fdc48	adrp x9,0x74e000
009fdc4c	add x9,x9,#0x524
009fdc50	ldrsw x8,[x9, x8, LSL #0x2]
009fdc54	add x8,x8,x9
009fdc58	br x8
009fdc5c	ldr x8,[sp, #0x20]
009fdc60	ldrsw x8,[x8]
009fdc64	tbz w8,#0x1f,0x009fdc7c
009fdc68	ldr x10,[sp, #0x20]
009fdc6c	add w9,w8,#0x8
009fdc70	cmp w9,#0x0
009fdc74	str w9,[x10]
009fdc78	b.le 0x009fe408
009fdc7c	ldr x10,[sp, #0x28]
009fdc80	ldr x8,[x10]
009fdc84	add x9,x8,#0x8
009fdc88	str x9,[x10]
009fdc8c	ldr x4,[x8]
009fdc90	b 0x009fe38c
009fdc94	ldr x0,[sp, #0x30]
009fdc98	add x2,sp,#0x38
009fdc9c	mov x1,x21
009fdca0	mov x3,x20
009fdca4	mov w4,w23
009fdca8	bl 0x009fe654
009fdcac	mov w8,w0
009fdcb0	mov w9,wzr
009fdcb4	mov w0,wzr
009fdcb8	cbz w8,0x009fe508
009fdcbc	ldrb w22,[x25], #0x1
009fdcc0	cmp w9,#0x7
009fdcc4	b.ne 0x009fdac8
009fdcc8	b 0x009fe4b0
009fdccc	mov w9,#0x5
009fdcd0	cmp w9,#0x7
009fdcd4	b.ne 0x009fdac8
009fdcd8	b 0x009fe4b0
009fdcdc	and w8,w22,#0xff
009fdce0	cmp w8,#0x2a
009fdce4	b.ne 0x009fdd84
009fdce8	ldr x8,[sp, #0x20]
009fdcec	ldrsw x8,[x8]
009fdcf0	tbz w8,#0x1f,0x009fdd08
009fdcf4	ldr x10,[sp, #0x20]
009fdcf8	add w9,w8,#0x8
009fdcfc	cmp w9,#0x0
009fdd00	str w9,[x10]
009fdd04	b.le 0x009fe300
009fdd08	ldr x10,[sp, #0x28]
009fdd0c	ldr x8,[x10]
009fdd10	add x9,x8,#0x8
009fdd14	str x9,[x10]
009fdd18	ldr w26,[x8]
009fdd1c	ldrb w22,[x25], #0x1
009fdd20	orr w9,wzr,#0x3
009fdd24	cmp w9,#0x7
009fdd28	b.ne 0x009fdac8
009fdd2c	b 0x009fe4b0
009fdd30	and w8,w22,#0xff
009fdd34	cmp w8,#0x2a
009fdd38	b.ne 0x009fdd94
009fdd3c	ldr x8,[sp, #0x20]
009fdd40	ldrsw x8,[x8]
009fdd44	tbz w8,#0x1f,0x009fdd5c
009fdd48	ldr x10,[sp, #0x20]
009fdd4c	add w9,w8,#0x8
009fdd50	cmp w9,#0x0
009fdd54	str w9,[x10]
009fdd58	b.le 0x009fe310
009fdd5c	ldr x10,[sp, #0x28]
009fdd60	ldr x8,[x10]
009fdd64	add x9,x8,#0x8
009fdd68	str x9,[x10]
009fdd6c	ldr w27,[x8]
009fdd70	ldrb w22,[x25], #0x1
009fdd74	mov w9,#0x5
009fdd78	cmp w9,#0x7
009fdd7c	b.ne 0x009fdac8
009fdd80	b 0x009fe4b0
009fdd84	orr w9,wzr,#0x3
009fdd88	cmp w9,#0x7
009fdd8c	b.ne 0x009fdac8
009fdd90	b 0x009fe4b0
009fdd94	mov w9,#0x5
009fdd98	cmp w9,#0x7
009fdd9c	b.ne 0x009fdac8
009fdda0	b 0x009fe4b0
009fdda4	ldrb w22,[x25], #0x1
009fdda8	orr w28,w28,#0x8
009fddac	mov w9,#0x1
009fddb0	cmp w9,#0x7
009fddb4	b.ne 0x009fdac8
009fddb8	b 0x009fe4b0
009fddbc	ldrb w22,[x25], #0x1
009fddc0	orr w28,w28,#0x2
009fddc4	mov w9,#0x1
009fddc8	cmp w9,#0x7
009fddcc	b.ne 0x009fdac8
009fddd0	b 0x009fe4b0
009fddd4	ldrb w22,[x25], #0x1
009fddd8	orr w28,w28,#0x1
009fdddc	mov w9,#0x1
009fdde0	cmp w9,#0x7
009fdde4	b.ne 0x009fdac8
009fdde8	b 0x009fe4b0
009fddec	ldrb w22,[x25], #0x1
009fddf0	orr w28,w28,#0x10
009fddf4	mov w9,#0x1
009fddf8	cmp w9,#0x7
009fddfc	b.ne 0x009fdac8
009fde00	b 0x009fe4b0
009fde04	ldrb w22,[x25], #0x1
009fde08	orr w24,wzr,#0x3
009fde0c	orr w9,wzr,#0x6
009fde10	cmp w9,#0x7
009fde14	b.ne 0x009fdac8
009fde18	b 0x009fe4b0
009fde1c	ldrb w22,[x25], #0x1
009fde20	mov w24,#0x1
009fde24	orr w9,wzr,#0x6
009fde28	cmp w9,#0x7
009fde2c	b.ne 0x009fdac8
009fde30	b 0x009fe4b0
009fde34	mov x8,x25
009fde38	ldrb w9,[x8], #0x1
009fde3c	cmp w9,#0x6c
009fde40	csel x25,x8,x25,eq
009fde44	ldrb w22,[x25], #0x1
009fde48	mov w8,#0x2
009fde4c	mov w9,#0x4
009fde50	csel w24,w9,w8,eq
009fde54	orr w9,wzr,#0x6
009fde58	cmp w9,#0x7
009fde5c	b.ne 0x009fdac8
009fde60	b 0x009fe4b0
009fde64	ldrb w22,[x25], #0x1
009fde68	mov w24,#0x5
009fde6c	orr w9,wzr,#0x6
009fde70	cmp w9,#0x7
009fde74	b.ne 0x009fdac8
009fde78	b 0x009fe4b0
009fde7c	ldr x0,[sp, #0x30]
009fde80	add x2,sp,#0x38
009fde84	mov x1,x21
009fde88	mov x3,x20
009fde8c	mov w4,w23
009fde90	b 0x009fdfe0
009fde94	orr w28,w28,#0x20
009fde98	ldr x8,[sp, #0x28]
009fde9c	cmp w24,#0x3
009fdea0	ldrsw x8,[x8, #0x1c]
009fdea4	tbz w8,#0x1f,0x009fdebc
009fdea8	ldr x10,[sp, #0x28]
009fdeac	add w9,w8,#0x10
009fdeb0	cmp w9,#0x0
009fdeb4	str w9,[x10, #0x1c]
009fdeb8	b.le 0x009fe3e8
009fdebc	ldr x10,[sp, #0x28]
009fdec0	ldr x8,[x10]
009fdec4	add x9,x8,#0x8
009fdec8	str x9,[x10]
009fdecc	ldr d0,[x8]
009fded0	add x2,sp,#0x38
009fded4	mov w7,#0x1
009fded8	b 0x009fdf20
009fdedc	orr w28,w28,#0x20
009fdee0	ldr x8,[sp, #0x28]
009fdee4	cmp w24,#0x3
009fdee8	ldrsw x8,[x8, #0x1c]
009fdeec	tbz w8,#0x1f,0x009fdf04
009fdef0	ldr x10,[sp, #0x28]
009fdef4	add w9,w8,#0x10
009fdef8	cmp w9,#0x0
009fdefc	str w9,[x10, #0x1c]
009fdf00	b.le 0x009fe3f8
009fdf04	ldr x10,[sp, #0x28]
009fdf08	ldr x8,[x10]
009fdf0c	add x9,x8,#0x8
009fdf10	str x9,[x10]
009fdf14	ldr d0,[x8]
009fdf18	add x2,sp,#0x38
009fdf1c	mov w7,#0x2
009fdf20	ldr x0,[sp, #0x30]
009fdf24	mov x1,x21
009fdf28	mov x3,x20
009fdf2c	mov w4,w26
009fdf30	mov w5,w27
009fdf34	mov w6,w28
009fdf38	b 0x009fe044
009fdf3c	orr w28,w28,#0x20
009fdf40	sub w9,w24,#0x1
009fdf44	cmp w9,#0x4
009fdf48	orr w8,w28,#0x40
009fdf4c	b.hi 0x009fe204
009fdf50	adrp x10,0x74e000
009fdf54	add x10,x10,#0x510
009fdf58	ldrsw x9,[x10, x9, LSL #0x2]
009fdf5c	add x9,x9,x10
009fdf60	br x9
009fdf64	ldr x9,[sp, #0x20]
009fdf68	ldrsw x9,[x9]
009fdf6c	tbz w9,#0x1f,0x009fdf84
009fdf70	ldr x11,[sp, #0x20]
009fdf74	add w10,w9,#0x8
009fdf78	cmp w10,#0x0
009fdf7c	str w10,[x11]
009fdf80	b.le 0x009fe3d8
009fdf84	ldr x11,[sp, #0x28]
009fdf88	ldr x9,[x11]
009fdf8c	add x10,x9,#0x8
009fdf90	str x10,[x11]
009fdf94	ldr x4,[x9]
009fdf98	b 0x009fe238
009fdf9c	ldr x8,[sp, #0x20]
009fdfa0	ldrsw x8,[x8]
009fdfa4	tbz w8,#0x1f,0x009fdfbc
009fdfa8	ldr x10,[sp, #0x20]
009fdfac	add w9,w8,#0x8
009fdfb0	cmp w9,#0x0
009fdfb4	str w9,[x10]
009fdfb8	b.le 0x009fe428
009fdfbc	ldr x10,[sp, #0x28]
009fdfc0	ldr x8,[x10]
009fdfc4	add x9,x8,#0x8
009fdfc8	str x9,[x10]
009fdfcc	ldr w4,[x8]
009fdfd0	ldr x0,[sp, #0x30]
009fdfd4	add x2,sp,#0x38
009fdfd8	mov x1,x21
009fdfdc	mov x3,x20
009fdfe0	bl 0x009fe654
009fdfe4	cbnz w0,0x009fe3b4
009fdfe8	b 0x009fe508
009fdfec	ldr x8,[sp, #0x28]
009fdff0	cmp w24,#0x3
009fdff4	ldrsw x8,[x8, #0x1c]
009fdff8	tbz w8,#0x1f,0x009fe010
009fdffc	ldr x10,[sp, #0x28]
009fe000	add w9,w8,#0x10
009fe004	cmp w9,#0x0
009fe008	str w9,[x10, #0x1c]
009fe00c	b.le 0x009fe418
009fe010	ldr x10,[sp, #0x28]
009fe014	ldr x8,[x10]
009fe018	add x9,x8,#0x8
009fe01c	str x9,[x10]
009fe020	ldr d0,[x8]
009fe024	ldr x0,[sp, #0x30]
009fe028	add x2,sp,#0x38
009fe02c	mov x1,x21
009fe030	mov x3,x20
009fe034	mov w4,w26
009fe038	mov w5,w27
009fe03c	mov w6,w28
009fe040	mov w7,wzr
009fe044	bl 0x009fea48
009fe048	cbnz w0,0x009fe3b4
009fe04c	b 0x009fe508
009fe050	ldr x8,[sp, #0x20]
009fe054	ldrsw x8,[x8]
009fe058	tbz w8,#0x1f,0x009fe070
009fe05c	ldr x10,[sp, #0x20]
009fe060	add w9,w8,#0x8
009fe064	cmp w9,#0x0
009fe068	str w9,[x10]
009fe06c	b.le 0x009fe438
009fe070	ldr x10,[sp, #0x28]
009fe074	ldr x8,[x10]
009fe078	add x9,x8,#0x8
009fe07c	str x9,[x10]
009fe080	ldr x8,[x8]
009fe084	ldr x9,[sp, #0x38]
009fe088	str w9,[x8]
009fe08c	b 0x009fe3b4
009fe090	ldr x8,[sp, #0x20]
009fe094	ldrsw x8,[x8]
009fe098	tbz w8,#0x1f,0x009fe0b0
009fe09c	ldr x10,[sp, #0x20]
009fe0a0	add w9,w8,#0x8
009fe0a4	cmp w9,#0x0
009fe0a8	str w9,[x10]
009fe0ac	b.le 0x009fe448
009fe0b0	ldr x10,[sp, #0x28]
009fe0b4	ldr x8,[x10]
009fe0b8	add x9,x8,#0x8
009fe0bc	str x9,[x10]
009fe0c0	ldr x4,[x8]
009fe0c4	orr w8,w28,#0x8
009fe0c8	add x2,sp,#0x38
009fe0cc	mov w5,#0x10
009fe0d0	b 0x009fe25c
009fe0d4	ldr x8,[sp, #0x20]
009fe0d8	ldrsw x8,[x8]
009fe0dc	tbz w8,#0x1f,0x009fe0f4
009fe0e0	ldr x10,[sp, #0x20]
009fe0e4	add w9,w8,#0x8
009fe0e8	cmp w9,#0x0
009fe0ec	str w9,[x10]
009fe0f0	b.le 0x009fe458
009fe0f4	ldr x10,[sp, #0x28]
009fe0f8	ldr x8,[x10]
009fe0fc	add x9,x8,#0x8
009fe100	str x9,[x10]
009fe104	ldr x8,[x8]
009fe108	cmp w27,#0x0
009fe10c	orr w9,wzr,#0x7fffffff
009fe110	csel w22,w27,w9,ge
009fe114	tbz w27,#0x1f,0x009fe120
009fe118	cbnz x21,0x009fe120
009fe11c	ldr w22,[x20]
009fe120	adrp x10,0x2c3000
009fe124	cmp x8,#0x0
009fe128	sxtw x9,w22
009fe12c	add x10,x10,#0x727
009fe130	csel x27,x10,x8,eq
009fe134	cmp x9,#0x0
009fe138	csinv x1,x9,xzr,ge
009fe13c	mov x0,x27
009fe140	bl 0x00c358a0
009fe144	mov x23,x0
009fe148	sub w8,w26,w23
009fe14c	orr w9,w8,w26
009fe150	cmp w9,#0x0
009fe154	csel w8,wzr,w8,lt
009fe158	tbnz w22,#0x1f,0x009fe170
009fe15c	orr w11,wzr,#0x7fffffff
009fe160	sub w9,w11,w8
009fe164	add w10,w8,w22
009fe168	cmp w9,w22
009fe16c	csel w22,w10,w11,gt
009fe170	tst w28,#0x1
009fe174	cneg w28,w8,ne
009fe178	cmp w28,#0x1
009fe17c	b.lt 0x009fe264
009fe180	cbz w22,0x009fe264
009fe184	mov w26,wzr
009fe188	ldr x0,[sp, #0x30]
009fe18c	add x2,sp,#0x38
009fe190	mov w4,#0x20
009fe194	mov x1,x21
009fe198	mov x3,x20
009fe19c	bl 0x009fe654
009fe1a0	cbz w0,0x009fe508
009fe1a4	sub w24,w28,#0x1
009fe1a8	cmp w28,#0x2
009fe1ac	add w26,w26,#0x1
009fe1b0	b.lt 0x009fe26c
009fe1b4	cmp w22,w26
009fe1b8	mov w28,w24
009fe1bc	b.hi 0x009fe188
009fe1c0	b 0x009fe26c
009fe1c4	add x25,x25,#0x1
009fe1c8	b 0x009fe3b4
009fe1cc	ldr x9,[sp, #0x20]
009fe1d0	ldrsw x9,[x9]
009fe1d4	tbz w9,#0x1f,0x009fe1ec
009fe1d8	ldr x11,[sp, #0x20]
009fe1dc	add w10,w9,#0x8
009fe1e0	cmp w10,#0x0
009fe1e4	str w10,[x11]
009fe1e8	b.le 0x009fe468
009fe1ec	ldr x11,[sp, #0x28]
009fe1f0	ldr x9,[x11]
009fe1f4	add x10,x9,#0x8
009fe1f8	str x10,[x11]
009fe1fc	ldrh w4,[x9]
009fe200	b 0x009fe238
009fe204	ldr x9,[sp, #0x20]
009fe208	ldrsw x9,[x9]
009fe20c	tbz w9,#0x1f,0x009fe224
009fe210	ldr x11,[sp, #0x20]
009fe214	add w10,w9,#0x8
009fe218	cmp w10,#0x0
009fe21c	str w10,[x11]
009fe220	b.le 0x009fe47c
009fe224	ldr x11,[sp, #0x28]
009fe228	ldr x9,[x11]
009fe22c	add x10,x9,#0x8
009fe230	str x10,[x11]
009fe234	ldr w4,[x9]
009fe238	and w9,w22,#0xff
009fe23c	cmp w9,#0x75
009fe240	mov w10,#0xa
009fe244	mov w11,#0x10
009fe248	csel w10,w10,w11,eq
009fe24c	cmp w9,#0x6f
009fe250	mov w9,#0x8
009fe254	csel w5,w9,w10,eq
009fe258	add x2,sp,#0x38
009fe25c	str w8,[sp]
009fe260	b 0x009fe398
009fe264	mov w26,wzr
009fe268	mov w24,w28
009fe26c	cbz x23,0x009fe2b8
009fe270	cmp w22,w26
009fe274	b.ls 0x009fe2b8
009fe278	mov w8,#0x1
009fe27c	sub x8,x8,x23
009fe280	ldrb w4,[x27]
009fe284	ldr x0,[sp, #0x30]
009fe288	add x2,sp,#0x38
009fe28c	mov x1,x21
009fe290	mov x3,x20
009fe294	mov x23,x8
009fe298	bl 0x009fe654
009fe29c	cbz w0,0x009fe508
009fe2a0	add w26,w26,#0x1
009fe2a4	cmp w22,w26
009fe2a8	b.ls 0x009fe2b8
009fe2ac	add x27,x27,#0x1
009fe2b0	add x8,x23,#0x1
009fe2b4	cbnz x23,0x009fe280
009fe2b8	tbz w24,#0x1f,0x009fe3b4
009fe2bc	cmp w22,w26
009fe2c0	b.ls 0x009fe3b4
009fe2c4	add w23,w26,#0x1
009fe2c8	ldr x0,[sp, #0x30]
009fe2cc	add x2,sp,#0x38
009fe2d0	mov w4,#0x20
009fe2d4	mov x1,x21
009fe2d8	mov x3,x20
009fe2dc	bl 0x009fe654
009fe2e0	cbz w0,0x009fe508
009fe2e4	cmn w24,#0x2
009fe2e8	b.gt 0x009fe3b4
009fe2ec	cmp w22,w23
009fe2f0	add w23,w23,#0x1
009fe2f4	add w24,w24,#0x1
009fe2f8	b.hi 0x009fe2c8
009fe2fc	b 0x009fe3b4
009fe300	ldr x9,[sp, #0x28]
009fe304	ldr x9,[x9, #0x8]
009fe308	add x8,x9,x8
009fe30c	b 0x009fdd18
009fe310	ldr x9,[sp, #0x28]
009fe314	ldr x9,[x9, #0x8]
009fe318	add x8,x9,x8
009fe31c	b 0x009fdd6c
009fe320	ldr x8,[sp, #0x20]
009fe324	ldrsw x8,[x8]
009fe328	tbz w8,#0x1f,0x009fe340
009fe32c	ldr x10,[sp, #0x20]
009fe330	add w9,w8,#0x8
009fe334	cmp w9,#0x0
009fe338	str w9,[x10]
009fe33c	b.le 0x009fe48c
009fe340	ldr x10,[sp, #0x28]
009fe344	ldr x8,[x10]
009fe348	add x9,x8,#0x8
009fe34c	str x9,[x10]
009fe350	ldrsh x4,[x8]
009fe354	b 0x009fe38c
009fe358	ldr x8,[sp, #0x20]
009fe35c	ldrsw x8,[x8]
009fe360	tbz w8,#0x1f,0x009fe378
009fe364	ldr x10,[sp, #0x20]
009fe368	add w9,w8,#0x8
009fe36c	cmp w9,#0x0
009fe370	str w9,[x10]
009fe374	b.le 0x009fe4a0
009fe378	ldr x10,[sp, #0x28]
009fe37c	ldr x8,[x10]
009fe380	add x9,x8,#0x8
009fe384	str x9,[x10]
009fe388	ldrsw x4,[x8]
009fe38c	add x2,sp,#0x38
009fe390	mov w5,#0xa
009fe394	str w28,[sp]
009fe398	ldr x0,[sp, #0x30]
009fe39c	mov x1,x21
009fe3a0	mov x3,x20
009fe3a4	mov w6,w26
009fe3a8	mov w7,w27
009fe3ac	bl 0x009fe7b8
009fe3b0	cbz w0,0x009fe508
009fe3b4	ldrb w22,[x25], #0x1
009fe3b8	mov w26,wzr
009fe3bc	mov w9,wzr
009fe3c0	mov w28,wzr
009fe3c4	mov w24,wzr
009fe3c8	mov w27,#0xffffffff
009fe3cc	cmp w9,#0x7
009fe3d0	b.ne 0x009fdac8
009fe3d4	b 0x009fe4b0
009fe3d8	ldr x10,[sp, #0x28]
009fe3dc	ldr x10,[x10, #0x8]
009fe3e0	add x9,x10,x9
009fe3e4	b 0x009fdf94
009fe3e8	ldr x9,[sp, #0x28]
009fe3ec	ldr x9,[x9, #0x10]
009fe3f0	add x8,x9,x8
009fe3f4	b 0x009fdecc
009fe3f8	ldr x9,[sp, #0x28]
009fe3fc	ldr x9,[x9, #0x10]
009fe400	add x8,x9,x8
009fe404	b 0x009fdf14
009fe408	ldr x9,[sp, #0x28]
009fe40c	ldr x9,[x9, #0x8]
009fe410	add x8,x9,x8
009fe414	b 0x009fdc8c
009fe418	ldr x9,[sp, #0x28]
009fe41c	ldr x9,[x9, #0x10]
009fe420	add x8,x9,x8
009fe424	b 0x009fe020
009fe428	ldr x9,[sp, #0x28]
009fe42c	ldr x9,[x9, #0x8]
009fe430	add x8,x9,x8
009fe434	b 0x009fdfcc
009fe438	ldr x9,[sp, #0x28]
009fe43c	ldr x9,[x9, #0x8]
009fe440	add x8,x9,x8
009fe444	b 0x009fe080
009fe448	ldr x9,[sp, #0x28]
009fe44c	ldr x9,[x9, #0x8]
009fe450	add x8,x9,x8
009fe454	b 0x009fe0c0
009fe458	ldr x9,[sp, #0x28]
009fe45c	ldr x9,[x9, #0x8]
009fe460	add x8,x9,x8
009fe464	b 0x009fe104
009fe468	ldr x10,[sp, #0x28]
009fe46c	ldr x10,[x10, #0x8]
009fe470	add x9,x10,x9
009fe474	ldrh w4,[x9]
009fe478	b 0x009fe238
009fe47c	ldr x10,[sp, #0x28]
009fe480	ldr x10,[x10, #0x8]
009fe484	add x9,x10,x9
009fe488	b 0x009fe234
009fe48c	ldr x9,[sp, #0x28]
009fe490	ldr x9,[x9, #0x8]
009fe494	add x8,x9,x8
009fe498	ldrsh x4,[x8]
009fe49c	b 0x009fe38c
009fe4a0	ldr x9,[sp, #0x28]
009fe4a4	ldr x9,[x9, #0x8]
009fe4a8	add x8,x9,x8
009fe4ac	b 0x009fe388
009fe4b0	cbnz x21,0x009fe4d8
009fe4b4	ldr x8,[x20]
009fe4b8	ldr x9,[sp, #0x38]
009fe4bc	ldr x10,[sp, #0x10]
009fe4c0	sub x8,x8,#0x1
009fe4c4	cmp x9,x8
009fe4c8	cset w9,hi
009fe4cc	str w9,[x10]
009fe4d0	b.ls 0x009fe4d8
009fe4d4	str x8,[sp, #0x38]
009fe4d8	ldr x0,[sp, #0x30]
009fe4dc	add x2,sp,#0x38
009fe4e0	mov x1,x21
009fe4e4	mov x3,x20
009fe4e8	mov w4,wzr
009fe4ec	bl 0x009fe654
009fe4f0	cbz w0,0x009fe508
009fe4f4	ldr x8,[sp, #0x38]
009fe4f8	ldr x9,[sp, #0x18]
009fe4fc	mov w0,#0x1
009fe500	sub x8,x8,#0x1
009fe504	str x8,[x9]
009fe508	ldp x29,x30,[sp, #0x90]
009fe50c	ldp x20,x19,[sp, #0x80]
009fe510	ldp x22,x21,[sp, #0x70]
009fe514	ldp x24,x23,[sp, #0x60]
009fe518	ldp x26,x25,[sp, #0x50]
009fe51c	ldp x28,x27,[sp, #0x40]
009fe520	add sp,sp,#0xa0
009fe524	ret
