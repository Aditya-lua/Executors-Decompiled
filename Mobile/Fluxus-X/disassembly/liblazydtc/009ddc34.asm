; tls_process_server_hello @ 009ddc34
009ddc34	sub sp,sp,#0x80
009ddc38	stp x26,x25,[sp, #0x30]
009ddc3c	stp x24,x23,[sp, #0x40]
009ddc40	stp x22,x21,[sp, #0x50]
009ddc44	stp x20,x19,[sp, #0x60]
009ddc48	stp x29,x30,[sp, #0x70]
009ddc4c	str xzr,[sp, #0x8]
009ddc50	ldr x8,[x1, #0x8]
009ddc54	mov x19,x0
009ddc58	str x27,[sp, #0x20]
009ddc5c	add x29,sp,#0x70
009ddc60	cmp x8,#0x1
009ddc64	b.hi 0x009ddc84
009ddc68	bl 0x00c342a0
009ddc6c	adrp x0,0x2d7000
009ddc70	adrp x2,0x2a7000
009ddc74	add x0,x0,#0xb1a
009ddc78	add x2,x2,#0xc3f
009ddc7c	mov w1,#0x56f
009ddc80	b 0x009ddd7c
009ddc84	ldr x22,[x1]
009ddc88	mov x25,x1
009ddc8c	sub x21,x8,#0x2
009ddc90	ldrb w9,[x22]
009ddc94	ldrb w24,[x22, #0x1]
009ddc98	add x20,x22,#0x2
009ddc9c	stp x20,x21,[x1]
009ddca0	bfm w24,w9,#0x18,#0x7
009ddca4	cmp w24,#0x303
009ddca8	b.ne 0x009ddd08
009ddcac	ldr w8,[x19]
009ddcb0	cmp w8,#0x304
009ddcb4	b.ne 0x009ddd08
009ddcb8	cmp x21,#0x20
009ddcbc	b.cc 0x009ddd10
009ddcc0	adrp x0,0xcb5000
009ddcc4	ldr x0,[x0, #0x1e0]
009ddcc8	mov w2,#0x20
009ddccc	mov x1,x20
009ddcd0	bl 0x00c300b0
009ddcd4	cbnz w0,0x009ddd2c
009ddcd8	ldr w8,[x19, #0x8e8]
009ddcdc	cbz w8,0x009dde28
009ddce0	bl 0x00c342a0
009ddce4	adrp x0,0x2d7000
009ddce8	adrp x2,0x2a7000
009ddcec	add x0,x0,#0xb1a
009ddcf0	add x2,x2,#0xc3f
009ddcf4	mov w1,#0x579
009ddcf8	bl 0x00c342b0
009ddcfc	mov w1,#0xa
009ddd00	mov w2,#0xf4
009ddd04	b 0x009ddd88
009ddd08	cmp x21,#0x20
009ddd0c	b.cs 0x009ddd2c
009ddd10	bl 0x00c342a0
009ddd14	adrp x0,0x2d7000
009ddd18	adrp x2,0x2a7000
009ddd1c	add x0,x0,#0xb1a
009ddd20	add x2,x2,#0xc3f
009ddd24	mov w1,#0x584
009ddd28	b 0x009ddd7c
009ddd2c	ldr q0,[x20, #0x10]
009ddd30	mov w26,wzr
009ddd34	str q0,[x19, #0x150]
009ddd38	ldr q0,[x20]
009ddd3c	str q0,[x19, #0x140]
009ddd40	ldp x8,x21,[x25]
009ddd44	add x22,x8,#0x20
009ddd48	subs x8,x21,#0x20
009ddd4c	stp x22,x8,[x25]
009ddd50	b.eq 0x009ddd64
009ddd54	ldrb w23,[x22], #0x1
009ddd58	sub x8,x21,#0x21
009ddd5c	subs x8,x8,x23
009ddd60	b.cs 0x009dddcc
009ddd64	bl 0x00c342a0
009ddd68	adrp x0,0x2d7000
009ddd6c	adrp x2,0x2a7000
009ddd70	add x0,x0,#0xb1a
009ddd74	add x2,x2,#0xc3f
009ddd78	mov w1,#0x58b
009ddd7c	bl 0x00c342b0
009ddd80	mov w1,#0x32
009ddd84	mov w2,#0x9f
009ddd88	mov x0,x19
009ddd8c	mov x3,xzr
009ddd90	bl 0x00c34410
009ddd94	ldr x0,[sp, #0x8]
009ddd98	adrp x1,0x2d7000
009ddd9c	add x1,x1,#0xb1a
009ddda0	mov w2,#0x6ad
009ddda4	bl 0x00c32310
009ddda8	mov w0,wzr
009dddac	ldp x29,x30,[sp, #0x70]
009dddb0	ldp x20,x19,[sp, #0x60]
009dddb4	ldp x22,x21,[sp, #0x50]
009dddb8	ldp x24,x23,[sp, #0x40]
009dddbc	ldp x26,x25,[sp, #0x30]
009dddc0	ldr x27,[sp, #0x20]
009dddc4	add sp,sp,#0x80
009dddc8	ret
009dddcc	add x20,x22,x23
009dddd0	cmp w23,#0x21
009dddd4	stp x20,x8,[x25]
009dddd8	b.cc 0x009dde04
009ddddc	bl 0x00c342a0
009ddde0	adrp x0,0x2d7000
009ddde4	adrp x2,0x2a7000
009ddde8	add x0,x0,#0xb1a
009dddec	add x2,x2,#0xc3f
009dddf0	mov w1,#0x591
009dddf4	bl 0x00c342b0
009dddf8	mov w1,#0x2f
009dddfc	mov w2,#0x12c
009dde00	b 0x009ddd88
009dde04	cmp x8,#0x1
009dde08	b.hi 0x009dde38
009dde0c	bl 0x00c342a0
009dde10	adrp x0,0x2d7000
009dde14	adrp x2,0x2a7000
009dde18	add x0,x0,#0xb1a
009dde1c	add x2,x2,#0xc3f
009dde20	mov w1,#0x596
009dde24	b 0x009ddd7c
009dde28	mov w26,#0x1
009dde2c	add x22,x22,#0x22
009dde30	str w26,[x19, #0x8e8]
009dde34	b 0x009ddd48
009dde38	add x9,x20,#0x2
009dde3c	subs x10,x8,#0x2
009dde40	stp x9,x10,[x25]
009dde44	b.eq 0x009dde68
009dde48	ldrb w21,[x9], #0x1
009dde4c	sub x10,x8,#0x3
009dde50	stp x9,x10,[x25]
009dde54	cbnz w26,0x009dde84
009dde58	cbnz x10,0x009dde84
009dde5c	stp xzr,xzr,[sp, #0x10]
009dde60	cbnz w26,0x009ddeec
009dde64	b 0x009ddeb8
009dde68	bl 0x00c342a0
009dde6c	adrp x0,0x2d7000
009dde70	adrp x2,0x2a7000
009dde74	add x0,x0,#0xb1a
009dde78	add x2,x2,#0xc3f
009dde7c	mov w1,#0x59b
009dde80	b 0x009ddd7c
009dde84	cmp x10,#0x2
009dde88	b.cc 0x009ddf18
009dde8c	ldrb w11,[x9]
009dde90	ldrb w10,[x9, #0x1]
009dde94	sub x8,x8,#0x5
009dde98	bfm x10,x11,#0x38,#0x7
009dde9c	cmp x8,x10
009ddea0	b.ne 0x009ddf18
009ddea4	add x8,x9,#0x2
009ddea8	add x9,x8,x10
009ddeac	stp x9,xzr,[x25]
009ddeb0	stp x8,x10,[sp, #0x10]
009ddeb4	cbnz w26,0x009ddeec
009ddeb8	add x1,sp,#0x10
009ddebc	orr w2,wzr,#0x300
009ddec0	add x3,sp,#0x8
009ddec4	mov w5,#0x1
009ddec8	mov x0,x19
009ddecc	mov x4,xzr
009dded0	bl 0x00c36e50
009dded4	cbz w0,0x009ddd94
009dded8	ldr x2,[sp, #0x8]
009ddedc	mov x0,x19
009ddee0	mov w1,w24
009ddee4	bl 0x00c37180
009ddee8	cbz w0,0x009ddd94
009ddeec	ldr x25,[x19, #0x8]
009ddef0	ldr x8,[x25, #0xc0]
009ddef4	ldr w27,[x8, #0x60]
009ddef8	tbnz w27,#0x3,0x009ddf40
009ddefc	ldr w8,[x25]
009ddf00	cmp w8,#0x304
009ddf04	b.lt 0x009ddf40
009ddf08	cbnz w26,0x009ddf44
009ddf0c	cmp w8,#0x10, LSL #12
009ddf10	b.eq 0x009ddfbc
009ddf14	b 0x009ddf44
009ddf18	bl 0x00c342a0
009ddf1c	adrp x0,0x2d7000
009ddf20	adrp x2,0x2a7000
009ddf24	add x0,x0,#0xb1a
009ddf28	add x2,x2,#0xc3f
009ddf2c	mov w1,#0x5a4
009ddf30	bl 0x00c342b0
009ddf34	mov w1,#0x32
009ddf38	mov w2,#0x10f
009ddf3c	b 0x009ddd88
009ddf40	cbz w26,0x009de080
009ddf44	cbz w21,0x009ddf70
009ddf48	bl 0x00c342a0
009ddf4c	adrp x0,0x2d7000
009ddf50	adrp x2,0x2a7000
009ddf54	add x0,x0,#0xb1a
009ddf58	add x2,x2,#0xc3f
009ddf5c	mov w1,#0x5ba
009ddf60	bl 0x00c342b0
009ddf64	mov w1,#0x2f
009ddf68	mov w2,#0x155
009ddf6c	b 0x009ddd88
009ddf70	ldr x8,[x19, #0x960]
009ddf74	cmp x8,x23
009ddf78	b.ne 0x009ddf90
009ddf7c	add x1,x19,#0x940
009ddf80	mov x0,x22
009ddf84	mov x2,x23
009ddf88	bl 0x00c300b0
009ddf8c	cbz w0,0x009ddfb8
009ddf90	bl 0x00c342a0
009ddf94	adrp x0,0x2d7000
009ddf98	adrp x2,0x2a7000
009ddf9c	add x0,x0,#0xb1a
009ddfa0	add x2,x2,#0xc3f
009ddfa4	mov w1,#0x5c1
009ddfa8	bl 0x00c342b0
009ddfac	mov w1,#0x2f
009ddfb0	mov w2,#0x3e7
009ddfb4	b 0x009ddd88
009ddfb8	mov w21,wzr
009ddfbc	cbz w26,0x009de080
009ddfc0	mov x0,x19
009ddfc4	mov x1,x20
009ddfc8	bl 0x009e066c
009ddfcc	cbz w0,0x009ddd94
009ddfd0	str xzr,[sp, #0x28]
009ddfd4	ldr x0,[x19, #0x878]
009ddfd8	bl 0x00c342d0
009ddfdc	add x1,sp,#0x10
009ddfe0	mov w2,#0x800
009ddfe4	add x3,sp,#0x28
009ddfe8	mov w5,#0x1
009ddfec	mov x0,x19
009ddff0	mov x4,xzr
009ddff4	str xzr,[x19, #0x878]
009ddff8	bl 0x00c36e50
009ddffc	cbz w0,0x009de400
009de000	ldr x2,[sp, #0x28]
009de004	mov w1,#0x800
009de008	mov w5,#0x1
009de00c	mov x0,x19
009de010	mov x3,xzr
009de014	mov x4,xzr
009de018	bl 0x00c36e70
009de01c	cbz w0,0x009de400
009de020	ldr x0,[sp, #0x28]
009de024	adrp x1,0x2d7000
009de028	add x1,x1,#0xb1a
009de02c	mov w2,#0x6c5
009de030	bl 0x00c32310
009de034	str xzr,[sp, #0x28]
009de038	ldr x8,[x19, #0xb40]
009de03c	cbz x8,0x009de3c8
009de040	mov x0,x19
009de044	mov x1,xzr
009de048	mov x2,xzr
009de04c	mov x3,xzr
009de050	mov x4,xzr
009de054	bl 0x00c36fc0
009de058	cbz w0,0x009de400
009de05c	ldr x8,[x19, #0x88]
009de060	ldr x9,[x19, #0x98]
009de064	mov x0,x19
009de068	ldr x1,[x8, #0x8]
009de06c	add x2,x9,#0x4
009de070	bl 0x00c345b0
009de074	cbz w0,0x009de400
009de078	mov w0,#0x1
009de07c	b 0x009dddac
009de080	mov w24,#0x100
009de084	tbnz w27,#0x3,0x009de0a0
009de088	ldr w8,[x25]
009de08c	mov w9,#0x303
009de090	cmp w8,#0x10, LSL #12
009de094	ccmp w8,w9,#0x4,ne
009de098	mov w8,#0x200
009de09c	csel w24,w8,w24,gt
009de0a0	ldr x2,[sp, #0x8]
009de0a4	mov x0,x19
009de0a8	mov w1,w24
009de0ac	bl 0x00c36f30
009de0b0	cbz w0,0x009de1cc
009de0b4	ldr x8,[x19, #0x8]
009de0b8	str wzr,[x19, #0x4d0]
009de0bc	ldr x9,[x8, #0xc0]
009de0c0	ldrb w9,[x9, #0x60]
009de0c4	tbnz w9,#0x3,0x009de110
009de0c8	ldr w8,[x8]
009de0cc	cmp w8,#0x304
009de0d0	b.lt 0x009de110
009de0d4	cmp w8,#0x10, LSL #12
009de0d8	b.eq 0x009de110
009de0dc	add x0,x19,#0xc58
009de0e0	bl 0x00c358f0
009de0e4	cbz w0,0x009de1f4
009de0e8	bl 0x00c342a0
009de0ec	adrp x0,0x2d7000
009de0f0	adrp x2,0x2a7000
009de0f4	add x0,x0,#0xb1a
009de0f8	add x2,x2,#0xc3f
009de0fc	mov w1,#0x5e3
009de100	bl 0x00c342b0
009de104	mov w1,#0xa
009de108	mov w2,#0xb6
009de10c	b 0x009ddd88
009de110	ldr w8,[x19]
009de114	cmp w8,#0x301
009de118	b.lt 0x009de194
009de11c	ldr x8,[x19, #0xaf8]
009de120	cbz x8,0x009de194
009de124	ldr x9,[x19, #0x918]
009de128	ldr x10,[x9, #0x338]
009de12c	cbz x10,0x009de194
009de130	mov w10,#0x200
009de134	str xzr,[sp, #0x28]
009de138	str w10,[sp, #0x4]
009de13c	ldr x5,[x19, #0xb00]
009de140	add x1,x9,#0x50
009de144	add x2,sp,#0x4
009de148	add x4,sp,#0x28
009de14c	mov x0,x19
009de150	mov x3,xzr
009de154	blr x8
009de158	cbz w0,0x009de39c
009de15c	ldr w9,[sp, #0x4]
009de160	cmp w9,#0x1
009de164	b.lt 0x009de39c
009de168	ldr x8,[x19, #0x918]
009de16c	sxtw x9,w9
009de170	str x9,[x8, #0x8]
009de174	ldr x0,[sp, #0x28]
009de178	cbnz x0,0x009de190
009de17c	mov x0,x19
009de180	mov x1,x20
009de184	mov w2,wzr
009de188	bl 0x00c35420
009de18c	ldr x8,[x19, #0x918]
009de190	str x0,[x8, #0x2f8]
009de194	cbz w23,0x009de214
009de198	ldr x26,[x19, #0x918]
009de19c	ldr x8,[x26, #0x250]
009de1a0	cmp x8,x23
009de1a4	b.ne 0x009de214
009de1a8	add x1,x26,#0x258
009de1ac	mov x0,x22
009de1b0	mov x2,x23
009de1b4	bl 0x00c300b0
009de1b8	cbnz w0,0x009de214
009de1bc	mov w8,#0x1
009de1c0	add x25,x19,#0x918
009de1c4	str w8,[x19, #0x4d0]
009de1c8	b 0x009de224
009de1cc	bl 0x00c342a0
009de1d0	adrp x0,0x2d7000
009de1d4	adrp x2,0x2a7000
009de1d8	add x0,x0,#0xb1a
009de1dc	add x2,x2,#0xc3f
009de1e0	mov w1,#0x5d6
009de1e4	bl 0x00c342b0
009de1e8	mov w1,#0x2f
009de1ec	mov w2,#0x6e
009de1f0	b 0x009ddd88
009de1f4	ldr x3,[sp, #0x8]
009de1f8	mov w1,#0x19
009de1fc	mov w2,#0x200
009de200	mov x0,x19
009de204	mov x4,xzr
009de208	mov x5,xzr
009de20c	bl 0x00c36140
009de210	cbz w0,0x009ddd94
009de214	ldr w8,[x19, #0x4d0]
009de218	ldr x26,[x19, #0x918]
009de21c	add x25,x19,#0x918
009de220	cbz w8,0x009de26c
009de224	ldr x2,[x19, #0x8f0]
009de228	ldr x8,[x26, #0x278]
009de22c	cmp x2,x8
009de230	b.ne 0x009de244
009de234	add x0,x26,#0x280
009de238	add x1,x19,#0x8f8
009de23c	bl 0x00c300b0
009de240	cbz w0,0x009de2e8
009de244	bl 0x00c342a0
009de248	adrp x0,0x2d7000
009de24c	adrp x2,0x2a7000
009de250	add x0,x0,#0xb1a
009de254	add x2,x2,#0xc3f
009de258	mov w1,#0x61e
009de25c	bl 0x00c342b0
009de260	mov w1,#0x2f
009de264	mov w2,#0x110
009de268	b 0x009ddd88
009de26c	ldr x8,[x26, #0x250]
009de270	cbz x8,0x009de2a0
009de274	ldr x8,[x19, #0xb88]
009de278	add x8,x8,#0x90
009de27c	ldxr w9,[x8]
009de280	add w9,w9,#0x1
009de284	stxr w10,w9,[x8]
009de288	cbnz w10,0x009de27c
009de28c	mov x0,x19
009de290	mov w1,wzr
009de294	bl 0x00c360f0
009de298	cbz w0,0x009ddd94
009de29c	ldr x26,[x25]
009de2a0	ldr w8,[x19]
009de2a4	str w8,[x26]
009de2a8	ldr x8,[x19, #0x8]
009de2ac	ldr x9,[x8, #0xc0]
009de2b0	ldrb w9,[x9, #0x60]
009de2b4	tbnz w9,#0x3,0x009de2cc
009de2b8	ldr w8,[x8]
009de2bc	cmp w8,#0x304
009de2c0	b.lt 0x009de2cc
009de2c4	cmp w8,#0x10, LSL #12
009de2c8	b.ne 0x009de2e8
009de2cc	str x23,[x26, #0x250]
009de2d0	cbz w23,0x009de2e8
009de2d4	add x0,x26,#0x258
009de2d8	mov x1,x22
009de2dc	mov x2,x23
009de2e0	bl 0x00c2ffd0
009de2e4	ldr x26,[x25]
009de2e8	ldr w8,[x19]
009de2ec	ldr w9,[x26]
009de2f0	cmp w8,w9
009de2f4	b.ne 0x009de374
009de2f8	mov x0,x19
009de2fc	mov x1,x20
009de300	str w8,[x19, #0x3e4]
009de304	str w8,[x19, #0x3e8]
009de308	bl 0x009e066c
009de30c	cbz w0,0x009ddd94
009de310	ldr w8,[x19, #0x4d0]
009de314	cbz w8,0x009de328
009de318	ldr x8,[x25]
009de31c	ldr w8,[x8, #0x2f4]
009de320	cmp w21,w8
009de324	b.ne 0x009de414
009de328	cbz w21,0x009de43c
009de32c	mov x0,x19
009de330	bl 0x00c36d10
009de334	cbz w0,0x009de4d0
009de338	ldr x8,[x19, #0x9a8]
009de33c	mov w1,w21
009de340	ldr x0,[x8, #0x118]
009de344	bl 0x00c353a0
009de348	cbnz x0,0x009de440
009de34c	bl 0x00c342a0
009de350	adrp x0,0x2d7000
009de354	adrp x2,0x2a7000
009de358	add x0,x0,#0xb1a
009de35c	add x2,x2,#0xc3f
009de360	mov w1,#0x672
009de364	bl 0x00c342b0
009de368	mov w1,#0x2f
009de36c	mov w2,#0x101
009de370	b 0x009ddd88
009de374	bl 0x00c342a0
009de378	adrp x0,0x2d7000
009de37c	adrp x2,0x2a7000
009de380	add x0,x0,#0xb1a
009de384	add x2,x2,#0xc3f
009de388	mov w1,#0x644
009de38c	bl 0x00c342b0
009de390	mov w1,#0x46
009de394	mov w2,#0xd2
009de398	b 0x009ddd88
009de39c	bl 0x00c342a0
009de3a0	adrp x0,0x2d7000
009de3a4	adrp x2,0x2a7000
009de3a8	add x0,x0,#0xb1a
009de3ac	add x2,x2,#0xc3f
009de3b0	mov w1,#0x60d
009de3b4	bl 0x00c342b0
009de3b8	mov w2,#0x103
009de3bc	mov w1,#0x50
009de3c0	movk w2,#0xc, LSL #16
009de3c4	b 0x009ddd88
009de3c8	ldr x8,[x19, #0x2e8]
009de3cc	cbz x8,0x009de040
009de3d0	bl 0x00c342a0
009de3d4	adrp x0,0x2d7000
009de3d8	adrp x2,0x2d9000
009de3dc	add x0,x0,#0xb1a
009de3e0	add x2,x2,#0x92a
009de3e4	mov w1,#0x6cd
009de3e8	bl 0x00c342b0
009de3ec	mov w1,#0x2f
009de3f0	mov w2,#0xd6
009de3f4	mov x0,x19
009de3f8	mov x3,xzr
009de3fc	bl 0x00c34410
009de400	ldr x0,[sp, #0x28]
009de404	adrp x1,0x2d7000
009de408	add x1,x1,#0xb1a
009de40c	mov w2,#0x6e8
009de410	b 0x009ddda4
009de414	bl 0x00c342a0
009de418	adrp x0,0x2d7000
009de41c	adrp x2,0x2a7000
009de420	add x0,x0,#0xb1a
009de424	add x2,x2,#0xc3f
009de428	mov w1,#0x664
009de42c	bl 0x00c342b0
009de430	mov w1,#0x2f
009de434	mov w2,#0x158
009de438	b 0x009ddd88
009de43c	mov x0,xzr
009de440	str x0,[x19, #0x340]
009de444	ldr x2,[sp, #0x8]
009de448	mov w5,#0x1
009de44c	mov x0,x19
009de450	mov w1,w24
009de454	mov x3,xzr
009de458	mov x4,xzr
009de45c	bl 0x00c36e70
009de460	cbz w0,0x009ddd94
009de464	ldr x9,[x19, #0x8]
009de468	ldr x8,[x9, #0xc0]
009de46c	ldrb w10,[x8, #0x60]
009de470	tbnz w10,#0x3,0x009de4b4
009de474	ldr w9,[x9]
009de478	cmp w9,#0x304
009de47c	b.lt 0x009de4b4
009de480	cmp w9,#0x10, LSL #12
009de484	b.eq 0x009de4b4
009de488	ldr x8,[x8, #0x10]
009de48c	mov x0,x19
009de490	blr x8
009de494	cbz w0,0x009ddd94
009de498	ldr x8,[x19, #0x8]
009de49c	mov w1,#0x91
009de4a0	mov x0,x19
009de4a4	ldr x8,[x8, #0xc0]
009de4a8	ldr x8,[x8, #0x20]
009de4ac	blr x8
009de4b0	cbz w0,0x009ddd94
009de4b4	ldr x0,[sp, #0x8]
009de4b8	adrp x1,0x2d7000
009de4bc	add x1,x1,#0xb1a
009de4c0	mov w2,#0x6aa
009de4c4	bl 0x00c32310
009de4c8	orr w0,wzr,#0x3
009de4cc	b 0x009dddac
009de4d0	bl 0x00c342a0
009de4d4	adrp x0,0x2d7000
009de4d8	adrp x2,0x2a7000
009de4dc	add x0,x0,#0xb1a
009de4e0	add x2,x2,#0xc3f
009de4e4	mov w1,#0x66a
009de4e8	bl 0x00c342b0
009de4ec	mov w1,#0x2f
009de4f0	mov w2,#0x157
009de4f4	b 0x009ddd88
