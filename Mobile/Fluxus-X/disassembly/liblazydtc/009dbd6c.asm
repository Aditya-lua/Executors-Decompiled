; tls_construct_client_hello @ 009dbd6c
009dbd6c	sub sp,sp,#0x70
009dbd70	stp x28,x27,[sp, #0x10]
009dbd74	stp x26,x25,[sp, #0x20]
009dbd78	stp x24,x23,[sp, #0x30]
009dbd7c	stp x22,x21,[sp, #0x40]
009dbd80	stp x20,x19,[sp, #0x50]
009dbd84	stp x29,x30,[sp, #0x60]
009dbd88	ldr x21,[x0, #0x918]
009dbd8c	add x29,sp,#0x60
009dbd90	mov x19,x0
009dbd94	mov x20,x1
009dbd98	bl 0x00c37190
009dbd9c	cbz w0,0x009dbdd0
009dbda0	mov w22,w0
009dbda4	bl 0x00c342a0
009dbda8	adrp x0,0x2d7000
009dbdac	adrp x2,0x2af000
009dbdb0	add x0,x0,#0xb1a
009dbdb4	add x2,x2,#0xbc0
009dbdb8	mov w1,#0x453
009dbdbc	bl 0x00c342b0
009dbdc0	mov w1,#0x50
009dbdc4	mov x0,x19
009dbdc8	mov w2,w22
009dbdcc	b 0x009dc058
009dbdd0	cbz x21,0x009dbdf4
009dbdd4	ldr w1,[x21]
009dbdd8	mov x0,x19
009dbddc	mov x2,xzr
009dbde0	bl 0x00c371a0
009dbde4	cbz w0,0x009dbdf4
009dbde8	mov x0,x21
009dbdec	bl 0x00c36090
009dbdf0	cbnz w0,0x009dbe0c
009dbdf4	ldr w8,[x19, #0x8e8]
009dbdf8	cbnz w8,0x009dbe0c
009dbdfc	mov x0,x19
009dbe00	mov w1,wzr
009dbe04	bl 0x00c360f0
009dbe08	cbz w0,0x009dc064
009dbe0c	ldr x8,[x19, #0x8]
009dbe10	add x21,x19,#0x160
009dbe14	ldr x8,[x8, #0xc0]
009dbe18	ldrb w8,[x8, #0x60]
009dbe1c	tbnz w8,#0x3,0x009dbe2c
009dbe20	ldr w8,[x19, #0x8e8]
009dbe24	cbnz w8,0x009dbe64
009dbe28	b 0x009dbe44
009dbe2c	mov x8,xzr
009dbe30	ldrb w9,[x21, x8]
009dbe34	cbnz w9,0x009dbe64
009dbe38	add x8,x8,#0x1
009dbe3c	cmp x8,#0x1f
009dbe40	b.ls 0x009dbe30
009dbe44	mov w3,#0x20
009dbe48	mov x0,x19
009dbe4c	mov w1,wzr
009dbe50	mov x2,x21
009dbe54	mov w4,wzr
009dbe58	bl 0x00c34990
009dbe5c	cmp w0,#0x0
009dbe60	b.le 0x009dbf30
009dbe64	ldrsw x1,[x19, #0xa0c]
009dbe68	mov w2,#0x2
009dbe6c	mov x0,x20
009dbe70	bl 0x00c343a0
009dbe74	cbz w0,0x009dbf14
009dbe78	mov w2,#0x20
009dbe7c	mov x0,x20
009dbe80	mov x1,x21
009dbe84	bl 0x00c34390
009dbe88	cbz w0,0x009dbf14
009dbe8c	ldr x8,[x19, #0x918]
009dbe90	ldr w9,[x19, #0x3c]
009dbe94	add x21,x8,#0x258
009dbe98	cbnz w9,0x009dbea8
009dbe9c	ldr w9,[x8]
009dbea0	cmp w9,#0x304
009dbea4	b.ne 0x009dc084
009dbea8	ldr w8,[x19]
009dbeac	cmp w8,#0x304
009dbeb0	b.ne 0x009dbf4c
009dbeb4	ldrb w8,[x19, #0x9ea]
009dbeb8	mov x22,xzr
009dbebc	tbz w8,#0x4,0x009dbf50
009dbec0	ldr w8,[x19, #0x8e8]
009dbec4	mov w22,#0x20
009dbec8	add x21,x19,#0x940
009dbecc	str x22,[x19, #0x960]
009dbed0	cbnz w8,0x009dbf50
009dbed4	ldr x8,[x19, #0x9a8]
009dbed8	mov w2,#0x20
009dbedc	mov x1,x21
009dbee0	mov w3,wzr
009dbee4	ldr x0,[x8]
009dbee8	mov w22,#0x20
009dbeec	bl 0x00c347b0
009dbef0	cmp w0,#0x0
009dbef4	b.gt 0x009dbf50
009dbef8	bl 0x00c342a0
009dbefc	adrp x0,0x2d7000
009dbf00	adrp x2,0x2af000
009dbf04	add x0,x0,#0xb1a
009dbf08	add x2,x2,#0xbc0
009dbf0c	mov w1,#0x4ad
009dbf10	b 0x009dc044
009dbf14	bl 0x00c342a0
009dbf18	adrp x0,0x2d7000
009dbf1c	adrp x2,0x2af000
009dbf20	add x0,x0,#0xb1a
009dbf24	add x2,x2,#0xbc0
009dbf28	mov w1,#0x49e
009dbf2c	b 0x009dc044
009dbf30	bl 0x00c342a0
009dbf34	adrp x0,0x2d7000
009dbf38	adrp x2,0x2af000
009dbf3c	add x0,x0,#0xb1a
009dbf40	add x2,x2,#0xbc0
009dbf44	mov w1,#0x477
009dbf48	b 0x009dc044
009dbf4c	mov x22,xzr
009dbf50	mov w1,#0x1
009dbf54	mov x0,x20
009dbf58	bl 0x00c343b0
009dbf5c	cbz w0,0x009dc02c
009dbf60	cbz x22,0x009dbf78
009dbf64	mov x0,x20
009dbf68	mov x1,x21
009dbf6c	mov x2,x22
009dbf70	bl 0x00c34390
009dbf74	cbz w0,0x009dc02c
009dbf78	mov x0,x20
009dbf7c	bl 0x00c34350
009dbf80	cbz w0,0x009dc02c
009dbf84	ldr x8,[x19, #0x8]
009dbf88	ldr x8,[x8, #0xc0]
009dbf8c	ldrb w8,[x8, #0x60]
009dbf90	tbz w8,#0x3,0x009dbfb4
009dbf94	ldr x1,[x19, #0x4b8]
009dbf98	ldr x2,[x1, #0x100]
009dbf9c	cmp x2,#0xff
009dbfa0	b.hi 0x009dc0ac
009dbfa4	mov w3,#0x1
009dbfa8	mov x0,x20
009dbfac	bl 0x00c36f70
009dbfb0	cbz w0,0x009dc0ac
009dbfb4	mov w1,#0x2
009dbfb8	mov x0,x20
009dbfbc	bl 0x00c343b0
009dbfc0	cbz w0,0x009dc2d8
009dbfc4	mov x0,x19
009dbfc8	bl 0x00c35380
009dbfcc	ldr w24,[x19, #0xba0]
009dbfd0	mov x22,x0
009dbfd4	mov x0,x19
009dbfd8	bl 0x00c35e10
009dbfdc	cbz w0,0x009dc2f4
009dbfe0	cbz x22,0x009dc31c
009dbfe4	ldr w9,[x19, #0x9f0]
009dbfe8	cmp w24,#0x0
009dbfec	orr w8,wzr,#0xfffe
009dbff0	orr w10,wzr,#0xfffc
009dbff4	csel x8,x10,x8,eq
009dbff8	sub x10,x8,#0x2
009dbffc	tst w9,#0x80
009dc000	mov x0,x22
009dc004	csel x25,x8,x10,eq
009dc008	bl 0x00c325e0
009dc00c	adrp x21,0x2c1000
009dc010	cmp w0,#0x1
009dc014	add x21,x21,#0x8cc
009dc018	b.lt 0x009dc340
009dc01c	mov x26,xzr
009dc020	mov x28,xzr
009dc024	mov w27,#0x1
009dc028	b 0x009dc140
009dc02c	bl 0x00c342a0
009dc030	adrp x0,0x2d7000
009dc034	adrp x2,0x2af000
009dc038	add x0,x0,#0xb1a
009dc03c	add x2,x2,#0xbc0
009dc040	mov w1,#0x4bf
009dc044	bl 0x00c342b0
009dc048	mov w2,#0x103
009dc04c	mov w1,#0x50
009dc050	movk w2,#0xc, LSL #16
009dc054	mov x0,x19
009dc058	mov x3,xzr
009dc05c	bl 0x00c34410
009dc060	mov w0,wzr
009dc064	ldp x29,x30,[sp, #0x60]
009dc068	ldp x20,x19,[sp, #0x50]
009dc06c	ldp x22,x21,[sp, #0x40]
009dc070	ldp x24,x23,[sp, #0x30]
009dc074	ldp x26,x25,[sp, #0x20]
009dc078	ldp x28,x27,[sp, #0x10]
009dc07c	add sp,sp,#0x70
009dc080	ret
009dc084	ldr w9,[x19]
009dc088	ldr x22,[x8, #0x250]
009dc08c	cmp w9,#0x304
009dc090	b.ne 0x009dbf50
009dc094	add x0,x19,#0x940
009dc098	mov x1,x21
009dc09c	mov x2,x22
009dc0a0	str x22,[x19, #0x960]
009dc0a4	bl 0x00c2ffd0
009dc0a8	b 0x009dbf50
009dc0ac	bl 0x00c342a0
009dc0b0	adrp x0,0x2d7000
009dc0b4	adrp x2,0x2af000
009dc0b8	add x0,x0,#0xb1a
009dc0bc	add x2,x2,#0xbc0
009dc0c0	mov w1,#0x4c8
009dc0c4	b 0x009dc044
009dc0c8	ldr x8,[x19, #0x8]
009dc0cc	ldr x8,[x8, #0xc0]
009dc0d0	ldrb w8,[x8, #0x60]
009dc0d4	tbnz w8,#0x3,0x009dc0fc
009dc0d8	ldr w9,[x23, #0x30]
009dc0dc	ldr w8,[x19, #0x3e8]
009dc0e0	mov x28,xzr
009dc0e4	cmp w9,w8
009dc0e8	b.lt 0x009dc188
009dc0ec	ldr w9,[x23, #0x2c]
009dc0f0	cmp w9,w8
009dc0f4	cset w28,le
009dc0f8	b 0x009dc188
009dc0fc	ldr w8,[x23, #0x38]
009dc100	ldr w9,[x19, #0x3e8]
009dc104	orr w12,wzr,#0xff00
009dc108	orr w11,wzr,#0xff00
009dc10c	cmp w8,#0x100
009dc110	csel w10,w12,w8,eq
009dc114	cmp w9,#0x100
009dc118	csel w8,w12,w9,eq
009dc11c	cmp w10,w8
009dc120	mov x28,xzr
009dc124	b.gt 0x009dc188
009dc128	ldr w9,[x23, #0x34]
009dc12c	cmp w9,#0x100
009dc130	csel w9,w11,w9,eq
009dc134	cmp w9,w8
009dc138	cset w28,ge
009dc13c	b 0x009dc188
009dc140	sub w1,w27,#0x1
009dc144	mov x0,x22
009dc148	bl 0x00c32610
009dc14c	mov x23,x0
009dc150	orr w2,wzr,#0x10001
009dc154	mov x0,x19
009dc158	mov x1,x23
009dc15c	mov w3,wzr
009dc160	bl 0x00c35d40
009dc164	cbnz w0,0x009dc190
009dc168	ldr x8,[x19, #0x8]
009dc16c	add x2,sp,#0x8
009dc170	mov x0,x23
009dc174	mov x1,x20
009dc178	ldr x8,[x8, #0x98]
009dc17c	blr x8
009dc180	cbz w0,0x009dc370
009dc184	cbz x28,0x009dc0c8
009dc188	ldr x8,[sp, #0x8]
009dc18c	add x26,x8,x26
009dc190	mov x0,x22
009dc194	bl 0x00c325e0
009dc198	cmp x26,x25
009dc19c	b.cs 0x009dc1ac
009dc1a0	cmp w27,w0
009dc1a4	add w27,w27,#0x1
009dc1a8	b.lt 0x009dc140
009dc1ac	cbz x28,0x009dc338
009dc1b0	cbz x26,0x009dc338
009dc1b4	cbnz w24,0x009dc1d8
009dc1b8	ldr x8,[x19, #0x8]
009dc1bc	adrp x0,0xcc8000
009dc1c0	add x0,x0,#0x568
009dc1c4	add x2,sp,#0x8
009dc1c8	ldr x8,[x8, #0x98]
009dc1cc	mov x1,x20
009dc1d0	blr x8
009dc1d4	cbz w0,0x009dc3fc
009dc1d8	ldrb w8,[x19, #0x9f0]
009dc1dc	tbz w8,#0x7,0x009dc200
009dc1e0	ldr x8,[x19, #0x8]
009dc1e4	adrp x0,0xcc8000
009dc1e8	add x0,x0,#0x5b8
009dc1ec	add x2,sp,#0x8
009dc1f0	ldr x8,[x8, #0x98]
009dc1f4	mov x1,x20
009dc1f8	blr x8
009dc1fc	cbz w0,0x009dc3c4
009dc200	mov x0,x20
009dc204	bl 0x00c34350
009dc208	cbz w0,0x009dc38c
009dc20c	mov w1,#0x1
009dc210	mov x0,x20
009dc214	bl 0x00c343b0
009dc218	cbz w0,0x009dc3a8
009dc21c	mov x0,x19
009dc220	bl 0x00c36d10
009dc224	cbz w0,0x009dc294
009dc228	ldr x8,[x19, #0x9a8]
009dc22c	ldr x0,[x8, #0x118]
009dc230	cbz x0,0x009dc294
009dc234	ldr x8,[x19, #0x8]
009dc238	ldr x8,[x8, #0xc0]
009dc23c	ldrb w8,[x8, #0x60]
009dc240	tbnz w8,#0x3,0x009dc250
009dc244	ldr w8,[x19, #0x3e8]
009dc248	cmp w8,#0x303
009dc24c	b.gt 0x009dc294
009dc250	bl 0x00c325e0
009dc254	cmp w0,#0x1
009dc258	b.lt 0x009dc294
009dc25c	mov w21,w0
009dc260	mov w22,wzr
009dc264	ldr x8,[x19, #0x9a8]
009dc268	mov w1,w22
009dc26c	ldr x0,[x8, #0x118]
009dc270	bl 0x00c32610
009dc274	ldrsw x1,[x0]
009dc278	mov w2,#0x1
009dc27c	mov x0,x20
009dc280	bl 0x00c343a0
009dc284	cbz w0,0x009dc418
009dc288	add w22,w22,#0x1
009dc28c	cmp w22,w21
009dc290	b.lt 0x009dc264
009dc294	mov w2,#0x1
009dc298	mov x0,x20
009dc29c	mov x1,xzr
009dc2a0	bl 0x00c343a0
009dc2a4	cbz w0,0x009dc3e0
009dc2a8	mov x0,x20
009dc2ac	bl 0x00c34350
009dc2b0	cbz w0,0x009dc3e0
009dc2b4	mov w2,#0x80
009dc2b8	mov x0,x19
009dc2bc	mov x1,x20
009dc2c0	mov x3,xzr
009dc2c4	mov x4,xzr
009dc2c8	bl 0x00c36e60
009dc2cc	cmp w0,#0x0
009dc2d0	cset w0,ne
009dc2d4	b 0x009dc064
009dc2d8	bl 0x00c342a0
009dc2dc	adrp x0,0x2d7000
009dc2e0	adrp x2,0x2af000
009dc2e4	add x0,x0,#0xb1a
009dc2e8	add x2,x2,#0xbc0
009dc2ec	mov w1,#0x4cf
009dc2f0	b 0x009dc044
009dc2f4	bl 0x00c342a0
009dc2f8	adrp x0,0x2d7000
009dc2fc	adrp x2,0x2bf000
009dc300	add x0,x0,#0xb1a
009dc304	add x2,x2,#0x9d0
009dc308	mov w1,#0xe61
009dc30c	bl 0x00c342b0
009dc310	mov w1,#0x50
009dc314	mov w2,#0xbf
009dc318	b 0x009dc054
009dc31c	bl 0x00c342a0
009dc320	adrp x0,0x2d7000
009dc324	adrp x2,0x2bf000
009dc328	add x0,x0,#0xb1a
009dc32c	add x2,x2,#0x9d0
009dc330	mov w1,#0xe66
009dc334	b 0x009dc044
009dc338	cmp x28,#0x0
009dc33c	csel x21,xzr,x21,ne
009dc340	bl 0x00c342a0
009dc344	adrp x0,0x2d7000
009dc348	adrp x2,0x2bf000
009dc34c	add x0,x0,#0xb1a
009dc350	add x2,x2,#0x9d0
009dc354	mov w1,#0xea2
009dc358	bl 0x00c342b0
009dc35c	mov w1,#0x50
009dc360	mov w2,#0xb5
009dc364	mov x0,x19
009dc368	mov x3,x21
009dc36c	b 0x009dc05c
009dc370	bl 0x00c342a0
009dc374	adrp x0,0x2d7000
009dc378	adrp x2,0x2bf000
009dc37c	add x0,x0,#0xb1a
009dc380	add x2,x2,#0x9d0
009dc384	mov w1,#0xe88
009dc388	b 0x009dc044
009dc38c	bl 0x00c342a0
009dc390	adrp x0,0x2d7000
009dc394	adrp x2,0x2af000
009dc398	add x0,x0,#0xb1a
009dc39c	add x2,x2,#0xbc0
009dc3a0	mov w1,#0x4d8
009dc3a4	b 0x009dc044
009dc3a8	bl 0x00c342a0
009dc3ac	adrp x0,0x2d7000
009dc3b0	adrp x2,0x2af000
009dc3b4	add x0,x0,#0xb1a
009dc3b8	add x2,x2,#0xbc0
009dc3bc	mov w1,#0x4de
009dc3c0	b 0x009dc044
009dc3c4	bl 0x00c342a0
009dc3c8	adrp x0,0x2d7000
009dc3cc	adrp x2,0x2bf000
009dc3d0	add x0,x0,#0xb1a
009dc3d4	add x2,x2,#0x9d0
009dc3d8	mov w1,#0xeb6
009dc3dc	b 0x009dc044
009dc3e0	bl 0x00c342a0
009dc3e4	adrp x0,0x2d7000
009dc3e8	adrp x2,0x2af000
009dc3ec	add x0,x0,#0xb1a
009dc3f0	add x2,x2,#0xbc0
009dc3f4	mov w1,#0x4f1
009dc3f8	b 0x009dc044
009dc3fc	bl 0x00c342a0
009dc400	adrp x0,0x2d7000
009dc404	adrp x2,0x2bf000
009dc408	add x0,x0,#0xb1a
009dc40c	add x2,x2,#0x9d0
009dc410	mov w1,#0xead
009dc414	b 0x009dc044
009dc418	bl 0x00c342a0
009dc41c	adrp x0,0x2d7000
009dc420	adrp x2,0x2af000
009dc424	add x0,x0,#0xb1a
009dc428	add x2,x2,#0xbc0
009dc42c	mov w1,#0x4e9
009dc430	b 0x009dc044
